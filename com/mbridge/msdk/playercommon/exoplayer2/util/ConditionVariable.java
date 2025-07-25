package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes6.dex */
public final class ConditionVariable {
    private boolean isOpen;

    public final synchronized void block() throws InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }

    public final synchronized boolean close() {
        boolean z;
        z = this.isOpen;
        this.isOpen = false;
        return z;
    }

    public final synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean block(long j) throws InterruptedException {
        boolean z;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        while (true) {
            z = this.isOpen;
            if (z || elapsedRealtime >= j2) {
                break;
            }
            wait(j2 - elapsedRealtime);
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        return z;
    }
}
