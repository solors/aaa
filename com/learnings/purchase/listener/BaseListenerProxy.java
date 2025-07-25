package com.learnings.purchase.listener;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public class BaseListenerProxy {
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public void runOnUiThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }
}
