package com.maticoo.sdk.videocache;

import android.text.TextUtils;
import com.maticoo.sdk.videocache.file.FileCache;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class HttpProxyCache extends ProxyCache {
    private static final float NO_CACHE_BARRIER = 0.2f;
    private static final String TAG = "HttpProxyCache";
    private final FileCache cache;
    private CacheListener listener;
    private final HttpUrlSource source;

    public HttpProxyCache(HttpUrlSource httpUrlSource, FileCache fileCache) {
        super(httpUrlSource, fileCache);
        this.cache = fileCache;
        this.source = httpUrlSource;
    }

    private String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    private boolean isUseCache(GetRequest getRequest) throws ProxyCacheException {
        boolean z;
        long length = this.source.length();
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        long available = this.cache.available();
        if (!z || !getRequest.partial || ((float) getRequest.rangeOffset) <= ((float) available) + (((float) length) * 0.2f)) {
            return true;
        }
        return false;
    }

    private String newResponseHeaders(GetRequest getRequest) throws IOException, ProxyCacheException {
        long length;
        boolean z;
        long j;
        boolean z2;
        String str;
        String str2;
        String str3;
        String mime = this.source.getMime();
        boolean z3 = !TextUtils.isEmpty(mime);
        if (this.cache.isCompleted()) {
            length = this.cache.available();
        } else {
            length = this.source.length();
        }
        if (length >= 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = getRequest.partial;
        if (z4) {
            j = length - getRequest.rangeOffset;
        } else {
            j = length;
        }
        if (z && z4) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (getRequest.partial) {
            str = "HTTP/1.1 206 PARTIAL CONTENT\n";
        } else {
            str = "HTTP/1.1 200 OK\n";
        }
        sb2.append(str);
        sb2.append("Accept-Ranges: bytes\n");
        String str4 = "";
        if (!z) {
            str2 = "";
        } else {
            str2 = format("Content-Length: %d\n", Long.valueOf(j));
        }
        sb2.append(str2);
        if (!z2) {
            str3 = "";
        } else {
            str3 = format("Content-Range: bytes %d-%d/%d\n", Long.valueOf(getRequest.rangeOffset), Long.valueOf(length - 1), Long.valueOf(length));
        }
        sb2.append(str3);
        if (z3) {
            str4 = format("Content-Type: %s\n", mime);
        }
        sb2.append(str4);
        sb2.append("\n");
        return sb2.toString();
    }

    private void responseWithCache(OutputStream outputStream, long j) throws ProxyCacheException, IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = read(bArr, j, 8192);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j += read;
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    private void responseWithoutCache(OutputStream outputStream, long j) throws ProxyCacheException, IOException {
        HttpUrlSource httpUrlSource = new HttpUrlSource(this.source);
        try {
            httpUrlSource.open((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = httpUrlSource.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } finally {
            httpUrlSource.close();
        }
    }

    @Override // com.maticoo.sdk.videocache.ProxyCache
    protected void onCachePercentsAvailableChanged(int i) {
        CacheListener cacheListener = this.listener;
        if (cacheListener != null) {
            cacheListener.onCacheAvailable(this.cache.file, this.source.getUrl(), i);
        }
    }

    public void processRequest(GetRequest getRequest, Socket socket) throws IOException, ProxyCacheException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        ILog.m53548e(TAG, "processRequest: " + getRequest);
        bufferedOutputStream.write(newResponseHeaders(getRequest).getBytes("UTF-8"));
        long j = getRequest.rangeOffset;
        if (isUseCache(getRequest)) {
            ILog.m53548e(TAG, "processRequest: responseWithCache");
            responseWithCache(bufferedOutputStream, j);
            return;
        }
        ILog.m53548e(TAG, "processRequest: responseWithoutCache");
        responseWithoutCache(bufferedOutputStream, j);
    }

    public void registerCacheListener(CacheListener cacheListener) {
        this.listener = cacheListener;
    }
}
