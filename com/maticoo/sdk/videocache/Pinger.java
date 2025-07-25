package com.maticoo.sdk.videocache;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class Pinger {
    private static final String PING_REQUEST = "ping";
    private static final String PING_RESPONSE = "ping ok";
    private final String host;
    private final ExecutorService pingExecutor = Executors.newSingleThreadExecutor();
    private final int port;

    /* loaded from: classes6.dex */
    private class PingCallable implements Callable<Boolean> {
        private PingCallable() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            return Boolean.valueOf(Pinger.this.pingServer());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Pinger(String str, int i) {
        this.host = (String) Preconditions.checkNotNull(str);
        this.port = i;
    }

    private List<Proxy> getDefaultProxies() {
        try {
            return ProxySelector.getDefault().select(new URI(getPingUrl()));
        } catch (URISyntaxException e) {
            throw new IllegalStateException(e);
        }
    }

    private String getPingUrl() {
        return String.format(Locale.US, "http://%s:%d/%s", this.host, Integer.valueOf(this.port), PING_REQUEST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pingServer() throws ProxyCacheException {
        HttpUrlSource httpUrlSource = new HttpUrlSource(getPingUrl());
        try {
            try {
                byte[] bytes = PING_RESPONSE.getBytes();
                httpUrlSource.open(0L);
                byte[] bArr = new byte[bytes.length];
                httpUrlSource.read(bArr);
                boolean equals = Arrays.equals(bytes, bArr);
                ILog.m53547i("Ping response: `" + new String(bArr) + "`, pinged? " + equals);
                return equals;
            } catch (ProxyCacheException e) {
                ILog.m53549e("Error reading ping response", e);
                httpUrlSource.close();
                return false;
            }
        } finally {
            httpUrlSource.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isPingRequest(String str) {
        return PING_REQUEST.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ping(int i, int i2) {
        boolean z;
        boolean z2;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        int i3 = 0;
        while (i3 < i) {
            try {
            } catch (InterruptedException e) {
                e = e;
                ILog.m53549e("Error pinging server due to unexpected error", e);
            } catch (ExecutionException e2) {
                e = e2;
                ILog.m53549e("Error pinging server due to unexpected error", e);
            } catch (TimeoutException unused) {
                ILog.m53544w("Error pinging server (attempt: " + i3 + ", timeout: " + i2 + "). ");
            }
            if (((Boolean) this.pingExecutor.submit(new PingCallable()).get(i2, TimeUnit.MILLISECONDS)).booleanValue()) {
                return true;
            }
            i3++;
            i2 *= 2;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void responseToPing(Socket socket) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write(PING_RESPONSE.getBytes());
    }
}
