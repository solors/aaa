package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.inmobi.media.wc */
/* loaded from: classes6.dex */
public abstract class AbstractC19515wc {

    /* renamed from: a */
    public final Map f48845a;

    /* renamed from: b */
    public final InterfaceC19431qc f48846b;

    /* renamed from: c */
    public final Handler f48847c;

    /* renamed from: d */
    public final byte f48848d;

    /* renamed from: e */
    public final InterfaceC18850A4 f48849e;

    /* renamed from: f */
    public final int f48850f;

    /* renamed from: g */
    public final ArrayList f48851g;

    /* renamed from: h */
    public long f48852h;

    /* renamed from: i */
    public final AtomicBoolean f48853i;

    /* renamed from: j */
    public InterfaceC19459sc f48854j;

    /* renamed from: k */
    public final InterfaceC38501j f48855k;

    /* renamed from: l */
    public final InterfaceC38501j f48856l;

    /* renamed from: m */
    public boolean f48857m;

    public AbstractC19515wc(InterfaceC19431qc visibilityChecker, byte b, InterfaceC18850A4 interfaceC18850A4) {
        InterfaceC38501j m14554a;
        InterfaceC38501j m14554a2;
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        WeakHashMap weakHashMap = new WeakHashMap(10);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f48845a = weakHashMap;
        this.f48846b = visibilityChecker;
        this.f48847c = handler;
        this.f48848d = b;
        this.f48849e = interfaceC18850A4;
        this.f48850f = 50;
        this.f48851g = new ArrayList(50);
        this.f48853i = new AtomicBoolean(true);
        m14554a = LazyJVM.m14554a(new C19487uc(this));
        this.f48855k = m14554a;
        m14554a2 = LazyJVM.m14554a(new C19501vc(this));
        this.f48856l = m14554a2;
    }

    /* renamed from: a */
    public final void m59602a(View view, Object obj, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "rootView");
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC18850A4 interfaceC18850A4 = this.f48849e;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("VisibilityTracker", "add view to tracker - minPercent - " + i + "  " + this);
        }
        C19473tc c19473tc = (C19473tc) this.f48845a.get(view);
        if (c19473tc == null) {
            c19473tc = new C19473tc();
            this.f48845a.put(view, c19473tc);
            this.f48852h++;
        }
        c19473tc.f48699a = i;
        long j = this.f48852h;
        c19473tc.f48700b = j;
        c19473tc.f48701c = view;
        c19473tc.f48702d = obj;
        long j2 = this.f48850f;
        if (j % j2 == 0) {
            long j3 = j - j2;
            for (Map.Entry entry : this.f48845a.entrySet()) {
                View view2 = (View) entry.getKey();
                if (((C19473tc) entry.getValue()).f48700b < j3) {
                    this.f48851g.add(view2);
                }
            }
            Iterator it = this.f48851g.iterator();
            while (it.hasNext()) {
                View view3 = (View) it.next();
                Intrinsics.m17074g(view3);
                m59603a(view3);
            }
            this.f48851g.clear();
        }
        if (this.f48845a.size() == 1) {
            mo59597f();
        }
    }

    /* renamed from: b */
    public void mo59601b() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48849e;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("VisibilityTracker", "destroy " + this);
        }
        m59604a();
        this.f48854j = null;
        this.f48853i.set(true);
    }

    /* renamed from: c */
    public abstract int mo59600c();

    /* renamed from: d */
    public abstract void mo59599d();

    /* renamed from: e */
    public void mo59598e() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48849e;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("VisibilityTracker", "pause " + this);
        }
        ((RunnableC19445rc) this.f48855k.getValue()).run();
        this.f48847c.removeCallbacksAndMessages(null);
        this.f48857m = false;
        this.f48853i.set(true);
    }

    /* renamed from: f */
    public void mo59597f() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48849e;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("VisibilityTracker", "resume " + this);
        }
        this.f48853i.set(false);
        m59596g();
    }

    /* renamed from: g */
    public final void m59596g() {
        toString();
        if (!this.f48857m && !this.f48853i.get()) {
            this.f48857m = true;
            ((ScheduledThreadPoolExecutor) AbstractC18933G3.f47260c.getValue()).schedule((Runnable) this.f48856l.getValue(), mo59600c(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public final void m59603a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC18850A4 interfaceC18850A4 = this.f48849e;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("VisibilityTracker", "removed view from tracker " + this);
        }
        if (((C19473tc) this.f48845a.remove(view)) != null) {
            this.f48852h--;
            if (this.f48845a.isEmpty()) {
                mo59598e();
            }
        }
    }

    /* renamed from: a */
    public final void m59604a() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48849e;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("VisibilityTracker", "clear " + this);
        }
        this.f48845a.clear();
        this.f48847c.removeMessages(0);
        this.f48857m = false;
    }
}
