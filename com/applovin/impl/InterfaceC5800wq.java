package com.applovin.impl;

import android.os.Handler;
import android.os.SystemClock;
import com.applovin.impl.InterfaceC5800wq;

/* renamed from: com.applovin.impl.wq */
/* loaded from: classes2.dex */
public interface InterfaceC5800wq {

    /* renamed from: com.applovin.impl.wq$a */
    /* loaded from: classes2.dex */
    public static final class C5801a {

        /* renamed from: a */
        private final Handler f11811a;

        /* renamed from: b */
        private final InterfaceC5800wq f11812b;

        public C5801a(Handler handler, InterfaceC5800wq interfaceC5800wq) {
            Handler handler2;
            if (interfaceC5800wq != null) {
                handler2 = (Handler) AbstractC4100b1.m100583a(handler);
            } else {
                handler2 = null;
            }
            this.f11811a = handler2;
            this.f11812b = interfaceC5800wq;
        }

        /* renamed from: c */
        public /* synthetic */ void m93365c(C4817m5 c4817m5) {
            c4817m5.m97581a();
            ((InterfaceC5800wq) AbstractC5863xp.m93017a(this.f11812b)).mo93389b(c4817m5);
        }

        /* renamed from: d */
        public /* synthetic */ void m93363d(C4817m5 c4817m5) {
            ((InterfaceC5800wq) AbstractC5863xp.m93017a(this.f11812b)).mo93386d(c4817m5);
        }

        /* renamed from: a */
        public void m93375a(final String str, final long j, final long j2) {
            Handler handler = this.f11811a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.w70
                    {
                        InterfaceC5800wq.C5801a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5800wq.C5801a.this.m93366b(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m93371b(final C4817m5 c4817m5) {
            Handler handler = this.f11811a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.t70
                    {
                        InterfaceC5800wq.C5801a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5800wq.C5801a.this.m93363d(c4817m5);
                    }
                });
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m93366b(String str, long j, long j2) {
            ((InterfaceC5800wq) AbstractC5863xp.m93017a(this.f11812b)).mo93387b(str, j, j2);
        }

        /* renamed from: a */
        public void m93376a(final String str) {
            Handler handler = this.f11811a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.u70
                    {
                        InterfaceC5800wq.C5801a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5800wq.C5801a.this.m93367b(str);
                    }
                });
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m93367b(String str) {
            ((InterfaceC5800wq) AbstractC5863xp.m93017a(this.f11812b)).mo93390a(str);
        }

        /* renamed from: a */
        public void m93382a(final C4817m5 c4817m5) {
            c4817m5.m97581a();
            Handler handler = this.f11811a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.q70
                    {
                        InterfaceC5800wq.C5801a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5800wq.C5801a.this.m93365c(c4817m5);
                    }
                });
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m93374b(int i, long j) {
            ((InterfaceC5800wq) AbstractC5863xp.m93017a(this.f11812b)).mo93396a(i, j);
        }

        /* renamed from: b */
        public /* synthetic */ void m93372b(C4310e9 c4310e9, C5105p5 c5105p5) {
            ((InterfaceC5800wq) AbstractC5863xp.m93017a(this.f11812b)).m93394a(c4310e9);
            ((InterfaceC5800wq) AbstractC5863xp.m93017a(this.f11812b)).mo93393a(c4310e9, c5105p5);
        }

        /* renamed from: a */
        public void m93385a(final int i, final long j) {
            Handler handler = this.f11811a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.r70
                    {
                        InterfaceC5800wq.C5801a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5800wq.C5801a.this.m93374b(i, j);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m93373b(final long j, final int i) {
            Handler handler = this.f11811a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.v70
                    {
                        InterfaceC5800wq.C5801a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5800wq.C5801a.this.m93384a(j, i);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m93383a(final C4310e9 c4310e9, final C5105p5 c5105p5) {
            Handler handler = this.f11811a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.z70
                    {
                        InterfaceC5800wq.C5801a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5800wq.C5801a.this.m93372b(c4310e9, c5105p5);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m93368b(final Exception exc) {
            Handler handler = this.f11811a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.y70
                    {
                        InterfaceC5800wq.C5801a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5800wq.C5801a.this.m93379a(exc);
                    }
                });
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m93377a(Object obj, long j) {
            ((InterfaceC5800wq) AbstractC5863xp.m93017a(this.f11812b)).mo93391a(obj, j);
        }

        /* renamed from: a */
        public /* synthetic */ void m93384a(long j, int i) {
            ((InterfaceC5800wq) AbstractC5863xp.m93017a(this.f11812b)).mo93395a(j, i);
        }

        /* renamed from: b */
        public void m93369b(final C5864xq c5864xq) {
            Handler handler = this.f11811a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.x70
                    {
                        InterfaceC5800wq.C5801a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5800wq.C5801a.this.m93380a(c5864xq);
                    }
                });
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m93379a(Exception exc) {
            ((InterfaceC5800wq) AbstractC5863xp.m93017a(this.f11812b)).mo93388b(exc);
        }

        /* renamed from: a */
        public /* synthetic */ void m93380a(C5864xq c5864xq) {
            ((InterfaceC5800wq) AbstractC5863xp.m93017a(this.f11812b)).mo93392a(c5864xq);
        }

        /* renamed from: a */
        public void m93378a(final Object obj) {
            if (this.f11811a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f11811a.post(new Runnable() { // from class: com.applovin.impl.s70
                    {
                        InterfaceC5800wq.C5801a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5800wq.C5801a.this.m93377a(obj, elapsedRealtime);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    void mo93396a(int i, long j);

    /* renamed from: a */
    void mo93395a(long j, int i);

    /* renamed from: a */
    void mo93393a(C4310e9 c4310e9, C5105p5 c5105p5);

    /* renamed from: a */
    void mo93392a(C5864xq c5864xq);

    /* renamed from: a */
    void mo93391a(Object obj, long j);

    /* renamed from: a */
    void mo93390a(String str);

    /* renamed from: b */
    void mo93389b(C4817m5 c4817m5);

    /* renamed from: b */
    void mo93388b(Exception exc);

    /* renamed from: b */
    void mo93387b(String str, long j, long j2);

    /* renamed from: d */
    void mo93386d(C4817m5 c4817m5);

    /* renamed from: a */
    default void m93394a(C4310e9 c4310e9) {
    }
}
