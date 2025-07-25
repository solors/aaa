package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class am1 {

    /* renamed from: a */
    private final AtomicInteger f76834a;

    /* renamed from: b */
    private final HashSet f76835b;

    /* renamed from: c */
    private final PriorityBlockingQueue<ml1<?>> f76836c;

    /* renamed from: d */
    private final PriorityBlockingQueue<ml1<?>> f76837d;

    /* renamed from: e */
    private final InterfaceC31376sl f76838e;

    /* renamed from: f */
    private final x81 f76839f;

    /* renamed from: g */
    private final wm1 f76840g;

    /* renamed from: h */
    private final y81[] f76841h;

    /* renamed from: i */
    private C31827xl f76842i;

    /* renamed from: j */
    private final ArrayList f76843j;

    /* renamed from: k */
    private final ArrayList f76844k;

    /* renamed from: com.yandex.mobile.ads.impl.am1$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC29948a {
        /* renamed from: a */
        void mo29585a(ml1<?> ml1Var, int i);
    }

    /* renamed from: com.yandex.mobile.ads.impl.am1$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC29949b {
        /* renamed from: a */
        boolean mo34387a(ml1<?> ml1Var);
    }

    @Deprecated
    /* renamed from: com.yandex.mobile.ads.impl.am1$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC29950c<T> {
        /* renamed from: a */
        void m35822a();
    }

    public am1(InterfaceC31376sl interfaceC31376sl, C31901yj c31901yj, int i) {
        this(interfaceC31376sl, c31901yj, i, new w30(new Handler(Looper.getMainLooper())));
    }

    /* renamed from: a */
    public final void m35826a(ml1 ml1Var) {
        ml1Var.m31964a(this);
        synchronized (this.f76835b) {
            this.f76835b.add(ml1Var);
        }
        ml1Var.m31956b(this.f76834a.incrementAndGet());
        ml1Var.m31958a("add-to-queue");
        m35825a(ml1Var, 0);
        if (!ml1Var.m31935t()) {
            this.f76837d.add(ml1Var);
        } else {
            this.f76836c.add(ml1Var);
        }
    }

    /* renamed from: b */
    public final <T> void m35823b(ml1<T> ml1Var) {
        synchronized (this.f76835b) {
            this.f76835b.remove(ml1Var);
        }
        synchronized (this.f76843j) {
            Iterator it = this.f76843j.iterator();
            while (it.hasNext()) {
                ((InterfaceC29950c) it.next()).m35822a();
            }
        }
        m35825a(ml1Var, 5);
    }

    public am1(InterfaceC31376sl interfaceC31376sl, C31901yj c31901yj, int i, w30 w30Var) {
        this.f76834a = new AtomicInteger();
        this.f76835b = new HashSet();
        this.f76836c = new PriorityBlockingQueue<>();
        this.f76837d = new PriorityBlockingQueue<>();
        this.f76843j = new ArrayList();
        this.f76844k = new ArrayList();
        this.f76838e = interfaceC31376sl;
        this.f76839f = c31901yj;
        this.f76841h = new y81[i];
        this.f76840g = w30Var;
    }

    /* renamed from: a */
    public final void m35824a(sl1 sl1Var) {
        synchronized (this.f76844k) {
            this.f76844k.add(sl1Var);
        }
    }

    /* renamed from: a */
    public final void m35827a(InterfaceC29949b interfaceC29949b) {
        synchronized (this.f76835b) {
            Iterator it = this.f76835b.iterator();
            while (it.hasNext()) {
                ml1<?> ml1Var = (ml1) it.next();
                if (interfaceC29949b.mo34387a(ml1Var)) {
                    ml1Var.mo27508a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m35825a(ml1<?> ml1Var, int i) {
        synchronized (this.f76844k) {
            Iterator it = this.f76844k.iterator();
            while (it.hasNext()) {
                ((InterfaceC29948a) it.next()).mo29585a(ml1Var, i);
            }
        }
    }

    /* renamed from: a */
    public final void m35828a() {
        y81[] y81VarArr;
        C31827xl c31827xl = this.f76842i;
        if (c31827xl != null) {
            c31827xl.m27467b();
        }
        for (y81 y81Var : this.f76841h) {
            if (y81Var != null) {
                y81Var.m26985b();
            }
        }
        C31827xl c31827xl2 = new C31827xl(this.f76836c, this.f76837d, this.f76838e, this.f76840g);
        this.f76842i = c31827xl2;
        c31827xl2.start();
        for (int i = 0; i < this.f76841h.length; i++) {
            y81 y81Var2 = new y81(this.f76837d, this.f76839f, this.f76838e, this.f76840g);
            this.f76841h[i] = y81Var2;
            y81Var2.start();
        }
    }
}
