package net.pubnative.lite.sdk.vpaid.helpers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes10.dex */
public abstract class TimerWithPause {
    private static final int MSG = 1;
    private final long mCountdownInterval;
    private long mMillisInFuture;
    private long mPauseTimeRemaining;
    private long mStopTimeInFuture;
    private final long mTotalCountdown;
    @SuppressLint({"HandlerLeak"})
    private final Handler mHandler = new Handler(Looper.myLooper()) { // from class: net.pubnative.lite.sdk.vpaid.helpers.TimerWithPause.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TimerWithPause.this.handleTimerMessage();
        }
    };
    private final boolean mRunAtStart = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public TimerWithPause(long j, long j2) {
        this.mMillisInFuture = j;
        this.mTotalCountdown = j;
        this.mCountdownInterval = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleTimerMessage() {
        long timeLeft = timeLeft();
        if (timeLeft <= 0) {
            cancel();
            onFinish();
        } else if (timeLeft < this.mCountdownInterval) {
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(1), timeLeft);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            onTick(timeLeft);
            long elapsedRealtime2 = this.mCountdownInterval - (SystemClock.elapsedRealtime() - elapsedRealtime);
            while (elapsedRealtime2 < 0) {
                elapsedRealtime2 += this.mCountdownInterval;
            }
            Handler handler2 = this.mHandler;
            handler2.sendMessageDelayed(handler2.obtainMessage(1), elapsedRealtime2);
        }
    }

    public final void cancel() {
        this.mHandler.removeMessages(1);
    }

    public final synchronized TimerWithPause create() {
        long j = this.mMillisInFuture;
        if (j <= 0) {
            onFinish();
        } else {
            this.mPauseTimeRemaining = j;
        }
        if (this.mRunAtStart) {
            resume();
        }
        return this;
    }

    public boolean hasBeenStarted() {
        if (this.mPauseTimeRemaining <= this.mMillisInFuture) {
            return true;
        }
        return false;
    }

    public boolean isPaused() {
        if (this.mPauseTimeRemaining > 0) {
            return true;
        }
        return false;
    }

    public boolean isRunning() {
        return !isPaused();
    }

    public abstract void onFinish();

    public abstract void onTick(long j);

    public void pause() {
        if (isRunning()) {
            this.mPauseTimeRemaining = timeLeft();
            cancel();
        }
    }

    public void resume() {
        if (isPaused()) {
            this.mMillisInFuture = this.mPauseTimeRemaining;
            this.mStopTimeInFuture = SystemClock.elapsedRealtime() + this.mMillisInFuture;
            Handler handler = this.mHandler;
            handler.sendMessage(handler.obtainMessage(1));
            this.mPauseTimeRemaining = 0L;
        }
    }

    public long timeLeft() {
        if (isPaused()) {
            return this.mPauseTimeRemaining;
        }
        long elapsedRealtime = this.mStopTimeInFuture - SystemClock.elapsedRealtime();
        if (elapsedRealtime < 0) {
            return 0L;
        }
        return elapsedRealtime;
    }

    public long timePassed() {
        return this.mTotalCountdown - timeLeft();
    }

    public long totalCountdown() {
        return this.mTotalCountdown;
    }
}
