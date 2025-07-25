package com.mbridge.msdk.p426e.p427a;

import android.os.CountDownTimer;

/* renamed from: com.mbridge.msdk.e.a.b */
/* loaded from: classes6.dex */
public final class MBCountDownTimer {

    /* renamed from: a */
    private CountDownListener f56025a;

    /* renamed from: b */
    private long f56026b;

    /* renamed from: c */
    private CountDownTimerC21893a f56027c;

    /* renamed from: d */
    private long f56028d = 0;

    /* compiled from: MBCountDownTimer.java */
    /* renamed from: com.mbridge.msdk.e.a.b$a */
    /* loaded from: classes6.dex */
    private static class CountDownTimerC21893a extends CountDownTimer {

        /* renamed from: a */
        private CountDownListener f56029a;

        public CountDownTimerC21893a(long j, long j2) {
            super(j, j2);
        }

        /* renamed from: a */
        final void m52904a(CountDownListener countDownListener) {
            this.f56029a = countDownListener;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            CountDownListener countDownListener = this.f56029a;
            if (countDownListener != null) {
                countDownListener.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            CountDownListener countDownListener = this.f56029a;
            if (countDownListener != null) {
                countDownListener.onTick(j);
            }
        }
    }

    /* renamed from: a */
    public final void m52909a() {
        CountDownTimerC21893a countDownTimerC21893a = this.f56027c;
        if (countDownTimerC21893a != null) {
            countDownTimerC21893a.cancel();
            this.f56027c = null;
        }
    }

    /* renamed from: b */
    public final MBCountDownTimer m52905b(long j) {
        this.f56028d = j;
        return this;
    }

    /* renamed from: b */
    public final void m52906b() {
        CountDownTimerC21893a countDownTimerC21893a = this.f56027c;
        if (countDownTimerC21893a == null) {
            if (countDownTimerC21893a != null) {
                countDownTimerC21893a.cancel();
                this.f56027c = null;
            }
            if (this.f56026b <= 0) {
                this.f56026b = this.f56028d + 1000;
            }
            CountDownTimerC21893a countDownTimerC21893a2 = new CountDownTimerC21893a(this.f56028d, this.f56026b);
            this.f56027c = countDownTimerC21893a2;
            countDownTimerC21893a2.m52904a(this.f56025a);
        }
        this.f56027c.start();
    }

    /* renamed from: a */
    public final MBCountDownTimer m52908a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.f56026b = j;
        return this;
    }

    /* renamed from: a */
    public final MBCountDownTimer m52907a(CountDownListener countDownListener) {
        this.f56025a = countDownListener;
        return this;
    }
}
