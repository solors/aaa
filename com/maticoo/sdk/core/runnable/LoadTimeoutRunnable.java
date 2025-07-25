package com.maticoo.sdk.core.runnable;

import com.maticoo.sdk.utils.HandlerUtil;

/* loaded from: classes6.dex */
public class LoadTimeoutRunnable implements Runnable {
    private OnLoadTimeoutListener mListener;

    /* loaded from: classes6.dex */
    public interface OnLoadTimeoutListener {
        void onLoadTimeout();
    }

    @Override // java.lang.Runnable
    public void run() {
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.core.runnable.LoadTimeoutRunnable.1
            @Override // java.lang.Runnable
            public void run() {
                if (LoadTimeoutRunnable.this.mListener != null) {
                    LoadTimeoutRunnable.this.mListener.onLoadTimeout();
                }
            }
        });
    }

    public void setTimeoutListener(OnLoadTimeoutListener onLoadTimeoutListener) {
        this.mListener = onLoadTimeoutListener;
    }
}
