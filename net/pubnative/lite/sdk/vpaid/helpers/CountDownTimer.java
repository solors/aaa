package net.pubnative.lite.sdk.vpaid.helpers;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes10.dex */
public abstract class CountDownTimer {
    private static final int MSG = 1;
    private final long mCountdownInterval;
    private final long mMillisInFuture;
    private long mPauseTime;
    private long mStopTimeInFuture;
    private boolean mCancelled = false;
    private boolean mPaused = false;
    private Handler mHandler = new Handler() { // from class: net.pubnative.lite.sdk.vpaid.helpers.CountDownTimer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (CountDownTimer.this) {
                if (!CountDownTimer.this.mPaused) {
                    long elapsedRealtime = CountDownTimer.this.mStopTimeInFuture - SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 0) {
                        CountDownTimer.this.onFinish();
                    } else if (elapsedRealtime < CountDownTimer.this.mCountdownInterval) {
                        sendMessageDelayed(obtainMessage(1), elapsedRealtime);
                    } else {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        CountDownTimer.this.onTick(elapsedRealtime);
                        long elapsedRealtime3 = (elapsedRealtime2 + CountDownTimer.this.mCountdownInterval) - SystemClock.elapsedRealtime();
                        while (elapsedRealtime3 < 0) {
                            elapsedRealtime3 += CountDownTimer.this.mCountdownInterval;
                        }
                        if (!CountDownTimer.this.mCancelled) {
                            sendMessageDelayed(obtainMessage(1), elapsedRealtime3);
                        }
                    }
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: protected */
    public CountDownTimer(long j, long j2) {
        this.mMillisInFuture = j;
        this.mCountdownInterval = j2;
    }

    public final void cancel() {
        this.mHandler.removeMessages(1);
        this.mCancelled = true;
    }

    public abstract void onFinish();

    public abstract void onTick(long j);

    public long pause() {
        if (!this.mPaused) {
            this.mPauseTime = this.mStopTimeInFuture - SystemClock.elapsedRealtime();
            this.mPaused = true;
        }
        return this.mPauseTime;
    }

    public long resume() {
        if (this.mPaused) {
            this.mStopTimeInFuture = this.mPauseTime + SystemClock.elapsedRealtime();
            this.mPaused = false;
            Handler handler = this.mHandler;
            handler.sendMessage(handler.obtainMessage(1));
        }
        return this.mPauseTime;
    }

    public final synchronized CountDownTimer start() {
        if (this.mMillisInFuture <= 0) {
            onFinish();
            return this;
        }
        this.mStopTimeInFuture = SystemClock.elapsedRealtime() + this.mMillisInFuture;
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1));
        this.mCancelled = false;
        this.mPaused = false;
        return this;
    }
}
