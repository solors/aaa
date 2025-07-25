package com.maticoo.sdk.utils.countdown;

import android.os.CountDownTimer;

/* loaded from: classes6.dex */
public class Countdown {
    public static final int COUNTDOWN_FINISH = 3;
    public static final int COUNTDOWN_START = 1;
    public static final int COUNTDOWN_UPDATE = 2;
    private CountDownTimer countDownTimer;
    private boolean isCountDowning;
    private CountdownListener listener;
    private long millisUntilFinished;

    /* JADX INFO: Access modifiers changed from: private */
    public void callback(int i) {
        CountdownListener countdownListener = this.listener;
        if (countdownListener != null) {
            countdownListener.onCountdown(i, this.millisUntilFinished);
        }
    }

    private void start(long j) {
        CountDownTimer countDownTimer;
        if (this.isCountDowning && (countDownTimer = this.countDownTimer) != null) {
            countDownTimer.cancel();
        }
        this.isCountDowning = true;
        CountDownTimer countDownTimer2 = new CountDownTimer(j, 1000L) { // from class: com.maticoo.sdk.utils.countdown.Countdown.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                Countdown.this.millisUntilFinished = 0L;
                Countdown.this.callback(3);
                Countdown.this.stopCountDown();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                Countdown.this.millisUntilFinished = j2;
                Countdown.this.callback(2);
            }
        };
        this.countDownTimer = countDownTimer2;
        countDownTimer2.start();
    }

    public void pauseCountDown() {
        if (this.countDownTimer != null && this.isCountDowning) {
            stopCountDown();
        }
    }

    public void resumeCountDown() {
        if (this.isCountDowning) {
            return;
        }
        long j = this.millisUntilFinished;
        if (j <= 0) {
            return;
        }
        start(j);
    }

    public void setListener(CountdownListener countdownListener) {
        this.listener = countdownListener;
    }

    public void starCountDown(long j) {
        this.millisUntilFinished = j;
        start(j);
        callback(1);
    }

    public void stopCountDown() {
        this.isCountDowning = false;
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.countDownTimer = null;
        }
    }
}
