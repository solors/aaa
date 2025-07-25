package com.maticoo.sdk.videocache;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class ProxyCache {
    private static final int MAX_READ_SOURCE_ATTEMPTS = 1;
    private final Cache cache;
    private final Source source;
    private volatile Thread sourceReaderThread;
    private volatile boolean stopped;

    /* renamed from: wc */
    private final Object f55044wc = new Object();
    private final Object stopLock = new Object();
    private volatile int percentsAvailable = -1;
    private final AtomicInteger readSourceErrorsCount = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class SourceReaderRunnable implements Runnable {
        private SourceReaderRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProxyCache.this.readSource();
        }
    }

    public ProxyCache(Source source, Cache cache) {
        this.source = (Source) Preconditions.checkNotNull(source);
        this.cache = (Cache) Preconditions.checkNotNull(cache);
    }

    private void checkReadSourceErrorsCount() throws ProxyCacheException {
        int i = this.readSourceErrorsCount.get();
        if (i < 1) {
            return;
        }
        this.readSourceErrorsCount.set(0);
        throw new ProxyCacheException("Error reading source " + i + " times");
    }

    private void closeSource() {
        try {
            this.source.close();
        } catch (ProxyCacheException e) {
            onError(new ProxyCacheException("Error closing source " + this.source, e));
        }
    }

    private boolean isStopped() {
        if (!Thread.currentThread().isInterrupted() && !this.stopped) {
            return false;
        }
        return true;
    }

    private void notifyNewCacheDataAvailable(long j, long j2) {
        onCacheAvailable(j, j2);
        synchronized (this.f55044wc) {
            this.f55044wc.notifyAll();
        }
    }

    private void onSourceRead() {
        this.percentsAvailable = 100;
        onCachePercentsAvailableChanged(this.percentsAvailable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readSource() {
        long j = -1;
        long j2 = 0;
        try {
            j2 = this.cache.available();
            this.source.open(j2);
            j = this.source.length();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = this.source.read(bArr);
                if (read != -1) {
                    synchronized (this.stopLock) {
                        if (isStopped()) {
                            return;
                        }
                        this.cache.append(bArr, read);
                    }
                    j2 += read;
                    notifyNewCacheDataAvailable(j2, j);
                } else {
                    tryComplete();
                    onSourceRead();
                    break;
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    private synchronized void readSourceAsync() throws ProxyCacheException {
        boolean z;
        if (this.sourceReaderThread != null && this.sourceReaderThread.getState() != Thread.State.TERMINATED) {
            z = true;
        } else {
            z = false;
        }
        if (!this.stopped && !this.cache.isCompleted() && !z) {
            SourceReaderRunnable sourceReaderRunnable = new SourceReaderRunnable();
            this.sourceReaderThread = new Thread(sourceReaderRunnable, "Source reader for " + this.source);
            this.sourceReaderThread.start();
        }
    }

    private void tryComplete() throws ProxyCacheException {
        synchronized (this.stopLock) {
            if (!isStopped() && this.cache.available() == this.source.length()) {
                this.cache.complete();
            }
        }
    }

    private void waitForSourceData() throws ProxyCacheException {
        synchronized (this.f55044wc) {
            try {
                try {
                    this.f55044wc.wait(1000L);
                } catch (InterruptedException e) {
                    throw new ProxyCacheException("Waiting source data is interrupted!", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void onCacheAvailable(long j, long j2) {
        boolean z;
        int i;
        boolean z2;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        boolean z3 = true;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 100;
        } else {
            i = (int) ((((float) j) / ((float) j2)) * 100.0f);
        }
        if (i != this.percentsAvailable) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i2 < 0) {
            z3 = false;
        }
        if (z3 && z2) {
            onCachePercentsAvailableChanged(i);
        }
        this.percentsAvailable = i;
    }

    protected final void onError(Throwable th) {
        if (th instanceof InterruptedProxyCacheException) {
            ILog.m53551d("ProxyCache is interrupted");
        } else {
            ILog.m53549e("ProxyCache error", th);
        }
    }

    public int read(byte[] bArr, long j, int i) throws ProxyCacheException {
        ProxyCacheUtils.assertBuffer(bArr, j, i);
        while (!this.cache.isCompleted() && this.cache.available() < i + j && !this.stopped) {
            readSourceAsync();
            waitForSourceData();
            checkReadSourceErrorsCount();
        }
        int read = this.cache.read(bArr, j, i);
        if (this.cache.isCompleted() && this.percentsAvailable != 100) {
            this.percentsAvailable = 100;
            onCachePercentsAvailableChanged(100);
        }
        return read;
    }

    public void shutdown() {
        synchronized (this.stopLock) {
            ILog.m53551d("Shutdown proxy for " + this.source);
            try {
                this.stopped = true;
                if (this.sourceReaderThread != null) {
                    this.sourceReaderThread.interrupt();
                }
                this.cache.close();
            } catch (ProxyCacheException e) {
                onError(e);
            }
        }
    }

    protected void onCachePercentsAvailableChanged(int i) {
    }
}
