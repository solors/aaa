package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.n90;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes8.dex */
public final class cp0<T> {

    /* renamed from: a */
    private final InterfaceC30182do f77700a;

    /* renamed from: b */
    private final qc0 f77701b;

    /* renamed from: c */
    private final InterfaceC30110b<T> f77702c;

    /* renamed from: d */
    private final CopyOnWriteArraySet<C30111c<T>> f77703d;

    /* renamed from: e */
    private final ArrayDeque<Runnable> f77704e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f77705f;

    /* renamed from: g */
    private boolean f77706g;

    /* renamed from: com.yandex.mobile.ads.impl.cp0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30109a<T> {
        void invoke(T t);
    }

    /* renamed from: com.yandex.mobile.ads.impl.cp0$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC30110b<T> {
        /* renamed from: a */
        void mo29578a(T t, n90 n90Var);
    }

    /* renamed from: com.yandex.mobile.ads.impl.cp0$c */
    /* loaded from: classes8.dex */
    public static final class C30111c<T> {

        /* renamed from: a */
        public final T f77707a;

        /* renamed from: b */
        private n90.C30918a f77708b = new n90.C30918a();

        /* renamed from: c */
        private boolean f77709c;

        /* renamed from: d */
        private boolean f77710d;

        public C30111c(T t) {
            this.f77707a = t;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C30111c.class == obj.getClass()) {
                return this.f77707a.equals(((C30111c) obj).f77707a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f77707a.hashCode();
        }
    }

    public cp0(Looper looper, InterfaceC30182do interfaceC30182do, InterfaceC30110b<T> interfaceC30110b) {
        this(new CopyOnWriteArraySet(), looper, interfaceC30182do, interfaceC30110b);
    }

    /* renamed from: b */
    public static /* synthetic */ void m35199b(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC30109a interfaceC30109a) {
        m35202a(copyOnWriteArraySet, i, interfaceC30109a);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m35198c(cp0 cp0Var, Message message) {
        return cp0Var.m35204a(message);
    }

    /* renamed from: a */
    public final void m35203a(T t) {
        if (this.f77706g) {
            return;
        }
        t.getClass();
        this.f77703d.add(new C30111c<>(t));
    }

    private cp0(CopyOnWriteArraySet<C30111c<T>> copyOnWriteArraySet, Looper looper, InterfaceC30182do interfaceC30182do, InterfaceC30110b<T> interfaceC30110b) {
        this.f77700a = interfaceC30182do;
        this.f77703d = copyOnWriteArraySet;
        this.f77702c = interfaceC30110b;
        this.f77704e = new ArrayDeque<>();
        this.f77705f = new ArrayDeque<>();
        this.f77701b = interfaceC30182do.mo25949a(looper, new Handler.Callback() { // from class: com.yandex.mobile.ads.impl.ql2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return cp0.m35198c(cp0.this, message);
            }
        });
    }

    /* renamed from: b */
    public final void m35201b() {
        Iterator<C30111c<T>> it = this.f77703d.iterator();
        while (it.hasNext()) {
            C30111c<T> next = it.next();
            InterfaceC30110b<T> interfaceC30110b = this.f77702c;
            ((C30111c) next).f77710d = true;
            if (((C30111c) next).f77709c) {
                interfaceC30110b.mo29578a(next.f77707a, ((C30111c) next).f77708b.m31641a());
            }
        }
        this.f77703d.clear();
        this.f77706g = true;
    }

    @CheckResult
    /* renamed from: a */
    public final cp0<T> m35205a(Looper looper, InterfaceC30110b<T> interfaceC30110b) {
        return new cp0<>(this.f77703d, looper, this.f77700a, interfaceC30110b);
    }

    /* renamed from: a */
    public final void m35207a() {
        if (this.f77705f.isEmpty()) {
            return;
        }
        if (!this.f77701b.mo30411b()) {
            qc0 qc0Var = this.f77701b;
            qc0Var.mo30413a(qc0Var.mo30410b(0));
        }
        boolean z = !this.f77704e.isEmpty();
        this.f77704e.addAll(this.f77705f);
        this.f77705f.clear();
        if (z) {
            return;
        }
        while (!this.f77704e.isEmpty()) {
            this.f77704e.peekFirst().run();
            this.f77704e.removeFirst();
        }
    }

    /* renamed from: b */
    public final void m35200b(T t) {
        Iterator<C30111c<T>> it = this.f77703d.iterator();
        while (it.hasNext()) {
            C30111c<T> next = it.next();
            if (next.f77707a.equals(t)) {
                InterfaceC30110b<T> interfaceC30110b = this.f77702c;
                ((C30111c) next).f77710d = true;
                if (((C30111c) next).f77709c) {
                    interfaceC30110b.mo29578a(next.f77707a, ((C30111c) next).f77708b.m31641a());
                }
                this.f77703d.remove(next);
            }
        }
    }

    /* renamed from: a */
    public boolean m35204a(Message message) {
        Iterator<C30111c<T>> it = this.f77703d.iterator();
        while (it.hasNext()) {
            C30111c<T> next = it.next();
            InterfaceC30110b<T> interfaceC30110b = this.f77702c;
            if (!((C30111c) next).f77710d && ((C30111c) next).f77709c) {
                n90 m31641a = ((C30111c) next).f77708b.m31641a();
                ((C30111c) next).f77708b = new n90.C30918a();
                ((C30111c) next).f77709c = false;
                interfaceC30110b.mo29578a(next.f77707a, m31641a);
            }
            if (this.f77701b.mo30411b()) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m35202a(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC30109a interfaceC30109a) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C30111c c30111c = (C30111c) it.next();
            if (!c30111c.f77710d) {
                if (i != -1) {
                    c30111c.f77708b.m31640a(i);
                }
                c30111c.f77709c = true;
                interfaceC30109a.invoke(c30111c.f77707a);
            }
        }
    }

    /* renamed from: a */
    public final void m35206a(final int i, final InterfaceC30109a<T> interfaceC30109a) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f77703d);
        this.f77705f.add(new Runnable() { // from class: com.yandex.mobile.ads.impl.rl2
            @Override // java.lang.Runnable
            public final void run() {
                cp0.m35199b(copyOnWriteArraySet, i, interfaceC30109a);
            }
        });
    }
}
