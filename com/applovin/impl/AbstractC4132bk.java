package com.applovin.impl;

import java.util.ArrayDeque;

/* renamed from: com.applovin.impl.bk */
/* loaded from: classes2.dex */
public abstract class AbstractC4132bk implements InterfaceC4749l5 {

    /* renamed from: a */
    private final Thread f5065a;

    /* renamed from: b */
    private final Object f5066b = new Object();

    /* renamed from: c */
    private final ArrayDeque f5067c = new ArrayDeque();

    /* renamed from: d */
    private final ArrayDeque f5068d = new ArrayDeque();

    /* renamed from: e */
    private final C5048o5[] f5069e;

    /* renamed from: f */
    private final AbstractC5915yg[] f5070f;

    /* renamed from: g */
    private int f5071g;

    /* renamed from: h */
    private int f5072h;

    /* renamed from: i */
    private C5048o5 f5073i;

    /* renamed from: j */
    private AbstractC4991n5 f5074j;

    /* renamed from: k */
    private boolean f5075k;

    /* renamed from: l */
    private boolean f5076l;

    /* renamed from: m */
    private int f5077m;

    /* renamed from: com.applovin.impl.bk$a */
    /* loaded from: classes2.dex */
    class C4133a extends Thread {
        C4133a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AbstractC4132bk.this.m100368m();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4132bk(C5048o5[] c5048o5Arr, AbstractC5915yg[] abstractC5915ygArr) {
        this.f5069e = c5048o5Arr;
        this.f5071g = c5048o5Arr.length;
        for (int i = 0; i < this.f5071g; i++) {
            this.f5069e[i] = mo99485f();
        }
        this.f5070f = abstractC5915ygArr;
        this.f5072h = abstractC5915ygArr.length;
        for (int i2 = 0; i2 < this.f5072h; i2++) {
            this.f5070f[i2] = mo99484g();
        }
        C4133a c4133a = new C4133a("ExoPlayer:SimpleDecoder");
        this.f5065a = c4133a;
        c4133a.start();
    }

    /* renamed from: e */
    private boolean m100374e() {
        if (!this.f5067c.isEmpty() && this.f5072h > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m100373h() {
        AbstractC4991n5 mo99487a;
        synchronized (this.f5066b) {
            while (!this.f5076l && !m100374e()) {
                this.f5066b.wait();
            }
            if (this.f5076l) {
                return false;
            }
            C5048o5 c5048o5 = (C5048o5) this.f5067c.removeFirst();
            AbstractC5915yg[] abstractC5915ygArr = this.f5070f;
            int i = this.f5072h - 1;
            this.f5072h = i;
            AbstractC5915yg abstractC5915yg = abstractC5915ygArr[i];
            boolean z = this.f5075k;
            this.f5075k = false;
            if (c5048o5.m97866e()) {
                abstractC5915yg.m97871b(4);
            } else {
                if (c5048o5.m97868d()) {
                    abstractC5915yg.m97871b(Integer.MIN_VALUE);
                }
                try {
                    mo99487a = mo99489a(c5048o5, abstractC5915yg, z);
                } catch (OutOfMemoryError e) {
                    mo99487a = mo99487a((Throwable) e);
                } catch (RuntimeException e2) {
                    mo99487a = mo99487a((Throwable) e2);
                }
                if (mo99487a != null) {
                    synchronized (this.f5066b) {
                        this.f5074j = mo99487a;
                    }
                    return false;
                }
            }
            synchronized (this.f5066b) {
                if (this.f5075k) {
                    abstractC5915yg.mo92744g();
                } else if (abstractC5915yg.m97868d()) {
                    this.f5077m++;
                    abstractC5915yg.mo92744g();
                } else {
                    abstractC5915yg.f12343c = this.f5077m;
                    this.f5077m = 0;
                    this.f5068d.addLast(abstractC5915yg);
                }
                m100376b(c5048o5);
            }
            return true;
        }
    }

    /* renamed from: k */
    private void m100370k() {
        if (m100374e()) {
            this.f5066b.notify();
        }
    }

    /* renamed from: l */
    private void m100369l() {
        AbstractC4991n5 abstractC4991n5 = this.f5074j;
        if (abstractC4991n5 == null) {
            return;
        }
        throw abstractC4991n5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m100368m() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m100373h());
    }

    /* renamed from: a */
    protected abstract AbstractC4991n5 mo99489a(C5048o5 c5048o5, AbstractC5915yg abstractC5915yg, boolean z);

    /* renamed from: a */
    protected abstract AbstractC4991n5 mo99487a(Throwable th);

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: b */
    public final void mo92589b() {
        synchronized (this.f5066b) {
            this.f5075k = true;
            this.f5077m = 0;
            C5048o5 c5048o5 = this.f5073i;
            if (c5048o5 != null) {
                m100376b(c5048o5);
                this.f5073i = null;
            }
            while (!this.f5067c.isEmpty()) {
                m100376b((C5048o5) this.f5067c.removeFirst());
            }
            while (!this.f5068d.isEmpty()) {
                ((AbstractC5915yg) this.f5068d.removeFirst()).mo92744g();
            }
        }
    }

    /* renamed from: f */
    protected abstract C5048o5 mo99485f();

    /* renamed from: g */
    protected abstract AbstractC5915yg mo99484g();

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: i */
    public final C5048o5 mo97860d() {
        boolean z;
        C5048o5 c5048o5;
        synchronized (this.f5066b) {
            m100369l();
            if (this.f5073i == null) {
                z = true;
            } else {
                z = false;
            }
            AbstractC4100b1.m100577b(z);
            int i = this.f5071g;
            if (i == 0) {
                c5048o5 = null;
            } else {
                C5048o5[] c5048o5Arr = this.f5069e;
                int i2 = i - 1;
                this.f5071g = i2;
                c5048o5 = c5048o5Arr[i2];
            }
            this.f5073i = c5048o5;
        }
        return c5048o5;
    }

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: j */
    public final AbstractC5915yg mo92869c() {
        synchronized (this.f5066b) {
            m100369l();
            if (this.f5068d.isEmpty()) {
                return null;
            }
            return (AbstractC5915yg) this.f5068d.removeFirst();
        }
    }

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: a */
    public final void mo97861a(C5048o5 c5048o5) {
        synchronized (this.f5066b) {
            m100369l();
            AbstractC4100b1.m100580a(c5048o5 == this.f5073i);
            this.f5067c.addLast(c5048o5);
            m100370k();
            this.f5073i = null;
        }
    }

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: a */
    public void mo92593a() {
        synchronized (this.f5066b) {
            this.f5076l = true;
            this.f5066b.notify();
        }
        try {
            this.f5065a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: b */
    private void m100376b(C5048o5 c5048o5) {
        c5048o5.mo94598b();
        C5048o5[] c5048o5Arr = this.f5069e;
        int i = this.f5071g;
        this.f5071g = i + 1;
        c5048o5Arr[i] = c5048o5;
    }

    /* renamed from: b */
    private void m100375b(AbstractC5915yg abstractC5915yg) {
        abstractC5915yg.mo94598b();
        AbstractC5915yg[] abstractC5915ygArr = this.f5070f;
        int i = this.f5072h;
        this.f5072h = i + 1;
        abstractC5915ygArr[i] = abstractC5915yg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m100377a(AbstractC5915yg abstractC5915yg) {
        synchronized (this.f5066b) {
            m100375b(abstractC5915yg);
            m100370k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m100380a(int i) {
        AbstractC4100b1.m100577b(this.f5071g == this.f5069e.length);
        for (C5048o5 c5048o5 : this.f5069e) {
            c5048o5.m96868g(i);
        }
    }
}
