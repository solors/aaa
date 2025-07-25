package com.learnings.purchase;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes6.dex */
public class PurchaseWorker {
    private Handler mHandler;

    /* loaded from: classes6.dex */
    private static class Holder {
        private static final PurchaseWorker singleton = new PurchaseWorker();

        private Holder() {
        }
    }

    public static PurchaseWorker get() {
        return Holder.singleton;
    }

    public void run(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    private PurchaseWorker() {
        HandlerThread handlerThread = new HandlerThread("learnings_purchase_worker");
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
    }
}
