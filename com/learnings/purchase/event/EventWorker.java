package com.learnings.purchase.event;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes6.dex */
class EventWorker {
    private Handler mHandler;

    /* loaded from: classes6.dex */
    private static class Holder {
        private static final EventWorker singleton = new EventWorker();

        private Holder() {
        }
    }

    public static EventWorker get() {
        return Holder.singleton;
    }

    public void run(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    private EventWorker() {
        HandlerThread handlerThread = new HandlerThread("learnings_purchase_event_worker");
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
    }
}
