package com.maticoo.sdk.core;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes6.dex */
public class AdCacheSafeBoolean {
    private boolean isLoadFinish = false;
    private boolean isOnLoad = false;
    private boolean isVideoAdLoad = false;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public boolean isLoadFinish() {
        this.lock.readLock().lock();
        try {
            return this.isLoadFinish;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean isOnLoad() {
        this.lock.readLock().lock();
        try {
            return this.isOnLoad;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean isVideoAdLoad() {
        this.lock.readLock().lock();
        try {
            return this.isVideoAdLoad;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean isWebViewAndVideoLoaded() {
        boolean z;
        this.lock.readLock().lock();
        try {
            if (this.isLoadFinish && this.isOnLoad) {
                if (this.isVideoAdLoad) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean isWebViewLoaded() {
        boolean z;
        this.lock.readLock().lock();
        try {
            if (this.isLoadFinish) {
                if (this.isOnLoad) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public void setLoadFinish(boolean z) {
        this.lock.writeLock().lock();
        try {
            this.isLoadFinish = z;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void setOnLoad(boolean z) {
        this.lock.writeLock().lock();
        try {
            this.isOnLoad = z;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void setVideoAdLoad(boolean z) {
        this.lock.writeLock().lock();
        try {
            this.isVideoAdLoad = z;
        } finally {
            this.lock.writeLock().unlock();
        }
    }
}
