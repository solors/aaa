package com.mbridge.msdk.video.dynview.p524i.p527c;

import android.os.CountDownTimer;

/* compiled from: MBCountDownTimer.java */
/* renamed from: com.mbridge.msdk.video.dynview.i.c.b */
/* loaded from: classes6.dex */
public final class C23019b {

    /* renamed from: a */
    private long f60312a = 0;

    /* renamed from: b */
    private long f60313b;

    /* renamed from: c */
    private InterfaceC23018a f60314c;

    /* renamed from: d */
    private CountDownTimerC23020a f60315d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MBCountDownTimer.java */
    /* renamed from: com.mbridge.msdk.video.dynview.i.c.b$a */
    /* loaded from: classes6.dex */
    public static class CountDownTimerC23020a extends CountDownTimer {

        /* renamed from: a */
        private InterfaceC23018a f60316a;

        public CountDownTimerC23020a(long j, long j2) {
            super(j, j2);
        }

        /* renamed from: a */
        final void m48924a(InterfaceC23018a interfaceC23018a) {
            this.f60316a = interfaceC23018a;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            InterfaceC23018a interfaceC23018a = this.f60316a;
            if (interfaceC23018a != null) {
                interfaceC23018a.mo48893a();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            InterfaceC23018a interfaceC23018a = this.f60316a;
            if (interfaceC23018a != null) {
                interfaceC23018a.mo48892a(j);
            }
        }
    }

    /* renamed from: c */
    private void m48925c() {
        CountDownTimerC23020a countDownTimerC23020a = this.f60315d;
        if (countDownTimerC23020a != null) {
            countDownTimerC23020a.cancel();
            this.f60315d = null;
        }
        if (this.f60313b <= 0) {
            this.f60313b = this.f60312a + 1000;
        }
        CountDownTimerC23020a countDownTimerC23020a2 = new CountDownTimerC23020a(this.f60312a, this.f60313b);
        this.f60315d = countDownTimerC23020a2;
        countDownTimerC23020a2.m48924a(this.f60314c);
    }

    /* renamed from: a */
    public final C23019b m48930a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.f60313b = j;
        return this;
    }

    /* renamed from: b */
    public final C23019b m48926b(long j) {
        this.f60312a = j;
        return this;
    }

    /* renamed from: a */
    public final C23019b m48928a(InterfaceC23018a interfaceC23018a) {
        this.f60314c = interfaceC23018a;
        return this;
    }

    /* renamed from: b */
    public final void m48927b() {
        CountDownTimerC23020a countDownTimerC23020a = this.f60315d;
        if (countDownTimerC23020a != null) {
            countDownTimerC23020a.cancel();
            this.f60315d = null;
        }
    }

    /* renamed from: a */
    public final void m48931a() {
        if (this.f60315d == null) {
            m48925c();
        }
        this.f60315d.start();
    }

    /* renamed from: a */
    public final void m48929a(long j, InterfaceC23018a interfaceC23018a) {
        this.f60312a = j;
        this.f60314c = interfaceC23018a;
        m48925c();
        CountDownTimerC23020a countDownTimerC23020a = this.f60315d;
        if (countDownTimerC23020a != null) {
            countDownTimerC23020a.start();
        }
    }
}
