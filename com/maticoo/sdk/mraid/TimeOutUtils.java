package com.maticoo.sdk.mraid;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public class TimeOutUtils {
    private long mTime;
    private TimeOutListener mTimeOutListener;
    private Handler timeOutHandler;
    private Runnable timeOutRunnable;

    /* loaded from: classes6.dex */
    public interface TimeOutListener {
        void onCancel();

        void onTimeout();
    }

    public TimeOutUtils(long j) {
        this.mTime = j;
        this.timeOutHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void finish(boolean z) {
        this.timeOutHandler.removeCallbacks(this.timeOutRunnable);
        TimeOutListener timeOutListener = this.mTimeOutListener;
        if (timeOutListener == null) {
            return;
        }
        if (z) {
            timeOutListener.onTimeout();
        } else {
            timeOutListener.onCancel();
        }
        this.mTimeOutListener = null;
    }

    public void cancel() {
        finish(false);
    }

    public void schedule() {
        this.timeOutHandler.postDelayed(this.timeOutRunnable, this.mTime);
    }

    public TimeOutUtils setTimeOutListener(TimeOutListener timeOutListener) {
        this.mTimeOutListener = timeOutListener;
        this.timeOutRunnable = new Runnable() { // from class: com.maticoo.sdk.mraid.TimeOutUtils.1
            @Override // java.lang.Runnable
            public void run() {
                TimeOutUtils.this.finish(true);
            }
        };
        return this;
    }

    public TimeOutUtils(TimeOutListener timeOutListener, long j) {
        this(j);
        setTimeOutListener(timeOutListener);
    }
}
