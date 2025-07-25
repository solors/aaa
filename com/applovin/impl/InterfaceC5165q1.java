package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.InterfaceC5165q1;

/* renamed from: com.applovin.impl.q1 */
/* loaded from: classes2.dex */
public interface InterfaceC5165q1 {

    /* renamed from: com.applovin.impl.q1$a */
    /* loaded from: classes2.dex */
    public static final class C5166a {

        /* renamed from: a */
        private final Handler f9128a;

        /* renamed from: b */
        private final InterfaceC5165q1 f9129b;

        public C5166a(Handler handler, InterfaceC5165q1 interfaceC5165q1) {
            Handler handler2;
            if (interfaceC5165q1 != null) {
                handler2 = (Handler) AbstractC4100b1.m100583a(handler);
            } else {
                handler2 = null;
            }
            this.f9128a = handler2;
            this.f9129b = interfaceC5165q1;
        }

        /* renamed from: c */
        public /* synthetic */ void m96437c(Exception exc) {
            ((InterfaceC5165q1) AbstractC5863xp.m93017a(this.f9129b)).mo96101c(exc);
        }

        /* renamed from: d */
        public /* synthetic */ void m96434d(Exception exc) {
            ((InterfaceC5165q1) AbstractC5863xp.m93017a(this.f9129b)).mo96137a(exc);
        }

        /* renamed from: a */
        public void m96452a(final Exception exc) {
            Handler handler = this.f9128a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.w00
                    {
                        InterfaceC5165q1.C5166a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5165q1.C5166a.this.m96437c(exc);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m96443b(final Exception exc) {
            Handler handler = this.f9128a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.d10
                    {
                        InterfaceC5165q1.C5166a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5165q1.C5166a.this.m96434d(exc);
                    }
                });
            }
        }

        /* renamed from: c */
        public /* synthetic */ void m96439c(C4817m5 c4817m5) {
            c4817m5.m97581a();
            ((InterfaceC5165q1) AbstractC5863xp.m93017a(this.f9129b)).mo96108c(c4817m5);
        }

        /* renamed from: d */
        public /* synthetic */ void m96436d(C4817m5 c4817m5) {
            ((InterfaceC5165q1) AbstractC5863xp.m93017a(this.f9129b)).mo96177a(c4817m5);
        }

        /* renamed from: a */
        public void m96450a(final String str, final long j, final long j2) {
            Handler handler = this.f9128a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.v00
                    {
                        InterfaceC5165q1.C5166a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5165q1.C5166a.this.m96441b(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m96445b(final C4817m5 c4817m5) {
            Handler handler = this.f9128a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.e10
                    {
                        InterfaceC5165q1.C5166a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5165q1.C5166a.this.m96436d(c4817m5);
                    }
                });
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m96441b(String str, long j, long j2) {
            ((InterfaceC5165q1) AbstractC5863xp.m93017a(this.f9129b)).mo96136a(str, j, j2);
        }

        /* renamed from: a */
        public void m96451a(final String str) {
            Handler handler = this.f9128a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.y00
                    {
                        InterfaceC5165q1.C5166a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5165q1.C5166a.this.m96442b(str);
                    }
                });
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m96442b(String str) {
            ((InterfaceC5165q1) AbstractC5863xp.m93017a(this.f9129b)).mo96115b(str);
        }

        /* renamed from: a */
        public void m96454a(final C4817m5 c4817m5) {
            c4817m5.m97581a();
            Handler handler = this.f9128a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.x00
                    {
                        InterfaceC5165q1.C5166a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5165q1.C5166a.this.m96439c(c4817m5);
                    }
                });
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m96446b(C4310e9 c4310e9, C5105p5 c5105p5) {
            ((InterfaceC5165q1) AbstractC5863xp.m93017a(this.f9129b)).m96458b(c4310e9);
            ((InterfaceC5165q1) AbstractC5863xp.m93017a(this.f9129b)).mo96128b(c4310e9, c5105p5);
        }

        /* renamed from: a */
        public void m96455a(final C4310e9 c4310e9, final C5105p5 c5105p5) {
            Handler handler = this.f9128a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.z00
                    {
                        InterfaceC5165q1.C5166a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5165q1.C5166a.this.m96446b(c4310e9, c5105p5);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m96447b(final long j) {
            Handler handler = this.f9128a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.a10
                    {
                        InterfaceC5165q1.C5166a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5165q1.C5166a.this.m96456a(j);
                    }
                });
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m96456a(long j) {
            ((InterfaceC5165q1) AbstractC5863xp.m93017a(this.f9129b)).mo96182a(j);
        }

        /* renamed from: b */
        public void m96440b(final boolean z) {
            Handler handler = this.f9128a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.c10
                    {
                        InterfaceC5165q1.C5166a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5165q1.C5166a.this.m96449a(z);
                    }
                });
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m96449a(boolean z) {
            ((InterfaceC5165q1) AbstractC5863xp.m93017a(this.f9129b)).mo96134a(z);
        }

        /* renamed from: a */
        public /* synthetic */ void m96457a(int i, long j, long j2) {
            ((InterfaceC5165q1) AbstractC5863xp.m93017a(this.f9129b)).mo96130b(i, j, j2);
        }

        /* renamed from: b */
        public void m96448b(final int i, final long j, final long j2) {
            Handler handler = this.f9128a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.b10
                    {
                        InterfaceC5165q1.C5166a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5165q1.C5166a.this.m96457a(i, j, j2);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    void mo96182a(long j);

    /* renamed from: a */
    void mo96177a(C4817m5 c4817m5);

    /* renamed from: a */
    void mo96137a(Exception exc);

    /* renamed from: a */
    void mo96136a(String str, long j, long j2);

    /* renamed from: a */
    void mo96134a(boolean z);

    /* renamed from: b */
    void mo96130b(int i, long j, long j2);

    /* renamed from: b */
    void mo96128b(C4310e9 c4310e9, C5105p5 c5105p5);

    /* renamed from: b */
    void mo96115b(String str);

    /* renamed from: c */
    void mo96108c(C4817m5 c4817m5);

    /* renamed from: c */
    void mo96101c(Exception exc);

    /* renamed from: b */
    default void m96458b(C4310e9 c4310e9) {
    }
}
