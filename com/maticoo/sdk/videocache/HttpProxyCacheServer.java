package com.maticoo.sdk.videocache;

import android.content.Context;
import android.net.Uri;
import com.maticoo.sdk.video.util.Utils;
import com.maticoo.sdk.videocache.file.DiskUsage;
import com.maticoo.sdk.videocache.file.FileNameGenerator;
import com.maticoo.sdk.videocache.file.Md5FileNameGenerator;
import com.maticoo.sdk.videocache.file.TotalCountLruDiskUsage;
import com.maticoo.sdk.videocache.file.TotalSizeLruDiskUsage;
import com.maticoo.sdk.videocache.headers.EmptyHeadersInjector;
import com.maticoo.sdk.videocache.headers.HeaderInjector;
import com.maticoo.sdk.videocache.sourcestorage.SourceInfoStorage;
import com.maticoo.sdk.videocache.sourcestorage.SourceInfoStorageFactory;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
public class HttpProxyCacheServer {
    private static volatile HttpProxyCacheServer INSTANCE = null;
    private static final String PROXY_HOST = "127.0.0.1";
    private final Object clientsLock;
    private final Map<String, HttpProxyCacheServerClients> clientsMap;
    private final Config config;
    private final Pinger pinger;
    private final int port;
    private final ServerSocket serverSocket;
    private final ExecutorService socketProcessor;
    private final Thread waitConnectionThread;

    /* loaded from: classes6.dex */
    public static final class Builder {
        private static final long DEFAULT_MAX_SIZE = 52428800;
        private File cacheRoot;
        private DiskUsage diskUsage = new TotalSizeLruDiskUsage(DEFAULT_MAX_SIZE);
        private FileNameGenerator fileNameGenerator = new Md5FileNameGenerator();
        private HeaderInjector headerInjector = new EmptyHeadersInjector();
        private SourceInfoStorage sourceInfoStorage;

        public Builder(Context context) {
            this.sourceInfoStorage = SourceInfoStorageFactory.newSourceInfoStorage(context);
            this.cacheRoot = StorageUtils.getIndividualCacheDirectory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Config buildConfig() {
            return new Config(this.cacheRoot, this.fileNameGenerator, this.diskUsage, this.sourceInfoStorage, this.headerInjector);
        }

        public HttpProxyCacheServer build() {
            return new HttpProxyCacheServer(buildConfig());
        }

        public Builder cacheDirectory(File file) {
            this.cacheRoot = (File) Preconditions.checkNotNull(file);
            return this;
        }

        public Builder diskUsage(DiskUsage diskUsage) {
            this.diskUsage = (DiskUsage) Preconditions.checkNotNull(diskUsage);
            return this;
        }

        public Builder fileNameGenerator(FileNameGenerator fileNameGenerator) {
            this.fileNameGenerator = (FileNameGenerator) Preconditions.checkNotNull(fileNameGenerator);
            return this;
        }

        public Builder headerInjector(HeaderInjector headerInjector) {
            this.headerInjector = (HeaderInjector) Preconditions.checkNotNull(headerInjector);
            return this;
        }

        public Builder maxCacheFilesCount(int i) {
            this.diskUsage = new TotalCountLruDiskUsage(i);
            return this;
        }

        public Builder maxCacheSize(long j) {
            this.diskUsage = new TotalSizeLruDiskUsage(j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public final class SocketProcessorRunnable implements Runnable {
        private final Socket socket;

        public SocketProcessorRunnable(Socket socket) {
            this.socket = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpProxyCacheServer.this.processSocket(this.socket);
        }
    }

    /* loaded from: classes6.dex */
    private final class WaitRequestsRunnable implements Runnable {
        private final CountDownLatch startSignal;

        public WaitRequestsRunnable(CountDownLatch countDownLatch) {
            this.startSignal = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.startSignal.countDown();
            HttpProxyCacheServer.this.waitForRequest();
        }
    }

    private String appendToProxyUrl(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", PROXY_HOST, Integer.valueOf(this.port), ProxyCacheUtils.encode(str));
    }

    private void closeSocket(Socket socket) {
        try {
            if (!socket.isClosed()) {
                socket.close();
            }
        } catch (IOException e) {
            onError(new ProxyCacheException("Error closing socket", e));
        }
    }

    private void closeSocketInput(Socket socket) {
        try {
            if (!socket.isInputShutdown() && socket.isConnected() && !socket.isClosed()) {
                ILog.m53551d("Closing socket input stream...");
                socket.shutdownInput();
                ILog.m53551d("Socket input stream closed successfully.");
            } else {
                ILog.m53551d("Socket input stream already closed or not connected.");
            }
        } catch (SocketException unused) {
            ILog.m53551d("Releasing input stream… Socket is closed by client.");
        } catch (IOException unused2) {
            ILog.m53551d("Releasing input stream… Socket is closed by client2.");
        }
    }

    private void closeSocketOutput(Socket socket) {
        try {
            if (!socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (IOException e) {
            ILog.m53544w(String.format("Failed to close socket on proxy side: %s. It seems client have already closed connection.", e.getMessage()));
        }
    }

    private HttpProxyCacheServerClients getClients(String str) throws ProxyCacheException {
        HttpProxyCacheServerClients httpProxyCacheServerClients;
        synchronized (this.clientsLock) {
            httpProxyCacheServerClients = this.clientsMap.get(str);
            if (httpProxyCacheServerClients == null) {
                httpProxyCacheServerClients = new HttpProxyCacheServerClients(str, this.config);
                this.clientsMap.put(str, httpProxyCacheServerClients);
            }
        }
        return httpProxyCacheServerClients;
    }

    private int getClientsCount() {
        int i;
        synchronized (this.clientsLock) {
            i = 0;
            for (HttpProxyCacheServerClients httpProxyCacheServerClients : this.clientsMap.values()) {
                i += httpProxyCacheServerClients.getClientsCount();
            }
        }
        return i;
    }

    public static HttpProxyCacheServer getInstance(Context context) {
        HttpProxyCacheServer httpProxyCacheServer = INSTANCE;
        if (httpProxyCacheServer == null) {
            synchronized (HttpProxyCacheServer.class) {
                httpProxyCacheServer = INSTANCE;
                if (httpProxyCacheServer == null) {
                    httpProxyCacheServer = new HttpProxyCacheServer(context);
                    INSTANCE = httpProxyCacheServer;
                }
            }
        }
        return httpProxyCacheServer;
    }

    private boolean isAlive() {
        return this.pinger.ping(3, 70);
    }

    private void onError(Throwable th) {
        ILog.m53549e("HttpProxyCacheServer error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processSocket(Socket socket) {
        StringBuilder sb2;
        try {
            try {
                GetRequest read = GetRequest.read(socket.getInputStream());
                ILog.m53551d("Request to cache proxy:" + read);
                String decode = ProxyCacheUtils.decode(read.uri);
                if (this.pinger.isPingRequest(decode)) {
                    this.pinger.responseToPing(socket);
                } else {
                    getClients(decode).processRequest(read, socket);
                }
                releaseSocket(socket);
                sb2 = new StringBuilder();
            } catch (ProxyCacheException e) {
                e = e;
                onError(new ProxyCacheException("Error processing request", e));
                releaseSocket(socket);
                sb2 = new StringBuilder();
            } catch (SocketException unused) {
                ILog.m53551d("Closing socket… Socket is closed by client.");
                releaseSocket(socket);
                sb2 = new StringBuilder();
            } catch (IOException e2) {
                e = e2;
                onError(new ProxyCacheException("Error processing request", e));
                releaseSocket(socket);
                sb2 = new StringBuilder();
            }
            sb2.append("Opened connections: ");
            sb2.append(getClientsCount());
            ILog.m53551d(sb2.toString());
        } catch (Throwable th) {
            releaseSocket(socket);
            ILog.m53551d("Opened connections: " + getClientsCount());
            throw th;
        }
    }

    private void releaseSocket(Socket socket) {
        closeSocketInput(socket);
        closeSocketOutput(socket);
        closeSocket(socket);
    }

    private void shutdownClients() {
        synchronized (this.clientsLock) {
            for (HttpProxyCacheServerClients httpProxyCacheServerClients : this.clientsMap.values()) {
                httpProxyCacheServerClients.shutdown();
            }
            this.clientsMap.clear();
        }
    }

    private void touchFileSafely(File file) {
        try {
            this.config.diskUsage.touch(file);
        } catch (IOException e) {
            ILog.m53549e("Error touching file " + file, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void waitForRequest() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket accept = this.serverSocket.accept();
                ILog.m53551d("Accept new socket " + accept);
                this.socketProcessor.submit(new SocketProcessorRunnable(accept));
            } catch (IOException e) {
                onError(new ProxyCacheException("Error during waiting connection", e));
                return;
            }
        }
    }

    public File getCacheFile(String str) {
        Config config = this.config;
        return new File(config.cacheRoot, config.fileNameGenerator.generate(str));
    }

    public String getProxyUrl(String str) {
        return getProxyUrl(str, true);
    }

    public boolean isCached(String str) {
        Preconditions.checkNotNull(str, "Url can't be null!");
        return getCacheFile(str).exists();
    }

    public void registerCacheListener(CacheListener cacheListener, String str) {
        Preconditions.checkAllNotNull(cacheListener, str);
        synchronized (this.clientsLock) {
            try {
                getClients(str).registerCacheListener(cacheListener);
            } catch (ProxyCacheException e) {
                ILog.m53543w("Error registering cache listener", e);
            }
        }
    }

    public void shutdown() {
        ILog.m53547i("Shutdown proxy server");
        shutdownClients();
        this.config.sourceInfoStorage.release();
        this.waitConnectionThread.interrupt();
        try {
            if (!this.serverSocket.isClosed()) {
                this.serverSocket.close();
            }
        } catch (IOException e) {
            onError(new ProxyCacheException("Error shutting down proxy server", e));
        }
    }

    public void unregisterCacheListener(CacheListener cacheListener, String str) {
        Preconditions.checkAllNotNull(cacheListener, str);
        synchronized (this.clientsLock) {
            try {
                getClients(str).unregisterCacheListener(cacheListener);
            } catch (ProxyCacheException e) {
                ILog.m53543w("Error registering cache listener", e);
            }
        }
    }

    private HttpProxyCacheServer(Context context) {
        this(new Builder(context).cacheDirectory(Utils.getVideoCacheDir(context)).maxCacheSize(1073741824L).maxCacheFilesCount(20).buildConfig());
    }

    public String getProxyUrl(String str, boolean z) {
        if (!z || !isCached(str)) {
            return isAlive() ? appendToProxyUrl(str) : str;
        }
        File cacheFile = getCacheFile(str);
        touchFileSafely(cacheFile);
        return Uri.fromFile(cacheFile).toString();
    }

    public void unregisterCacheListener(CacheListener cacheListener) {
        Preconditions.checkNotNull(cacheListener);
        synchronized (this.clientsLock) {
            for (HttpProxyCacheServerClients httpProxyCacheServerClients : this.clientsMap.values()) {
                httpProxyCacheServerClients.unregisterCacheListener(cacheListener);
            }
        }
    }

    private HttpProxyCacheServer(Config config) {
        this.clientsLock = new Object();
        this.socketProcessor = Executors.newFixedThreadPool(8);
        this.clientsMap = new ConcurrentHashMap();
        this.config = (Config) Preconditions.checkNotNull(config);
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName(PROXY_HOST));
            this.serverSocket = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.port = localPort;
            IgnoreHostProxySelector.install(PROXY_HOST, localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new WaitRequestsRunnable(countDownLatch));
            this.waitConnectionThread = thread;
            thread.start();
            countDownLatch.await();
            this.pinger = new Pinger(PROXY_HOST, localPort);
            ILog.m53547i("Proxy cache server started. Is it alive? " + isAlive());
        } catch (IOException | InterruptedException e) {
            this.socketProcessor.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }
}
