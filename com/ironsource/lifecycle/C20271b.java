package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.EnumC20155jj;
import com.ironsource.InterfaceC20105ij;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lifecycle.FragmentC20269a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.lifecycle.b */
/* loaded from: classes6.dex */
public class C20271b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m */
    private static final C20271b f51001m = new C20271b();

    /* renamed from: n */
    private static AtomicBoolean f51002n = new AtomicBoolean(false);

    /* renamed from: o */
    static final long f51003o = 700;

    /* renamed from: a */
    private int f51004a = 0;

    /* renamed from: b */
    private int f51005b = 0;

    /* renamed from: c */
    private boolean f51006c = true;

    /* renamed from: d */
    private boolean f51007d = true;

    /* renamed from: e */
    private EnumC20155jj f51008e = EnumC20155jj.NONE;

    /* renamed from: f */
    private final List<InterfaceC20105ij> f51009f = new CopyOnWriteArrayList();

    /* renamed from: g */
    private final Runnable f51010g = new Runnable() { // from class: com.ironsource.lifecycle.c
        @Override // java.lang.Runnable
        public final void run() {
            C20271b.m57444e(C20271b.this);
        }
    };

    /* renamed from: h */
    private final Runnable f51011h = new Runnable() { // from class: com.ironsource.lifecycle.d
        @Override // java.lang.Runnable
        public final void run() {
            C20271b.m57456a(C20271b.this);
        }
    };

    /* renamed from: i */
    private final Runnable f51012i = new Runnable() { // from class: com.ironsource.lifecycle.e
        @Override // java.lang.Runnable
        public final void run() {
            C20271b.m57446d(C20271b.this);
        }
    };

    /* renamed from: j */
    private final Runnable f51013j = new Runnable() { // from class: com.ironsource.lifecycle.f
        @Override // java.lang.Runnable
        public final void run() {
            C20271b.m57452b(C20271b.this);
        }
    };

    /* renamed from: k */
    private final Runnable f51014k = new Runnable() { // from class: com.ironsource.lifecycle.g
        @Override // java.lang.Runnable
        public final void run() {
            C20271b.m57449c(C20271b.this);
        }
    };

    /* renamed from: l */
    private final FragmentC20269a.InterfaceC20270a f51015l = new C20272a();

    /* renamed from: a */
    public static /* synthetic */ void m57456a(C20271b c20271b) {
        c20271b.m57442g();
    }

    /* renamed from: b */
    public static /* synthetic */ void m57452b(C20271b c20271b) {
        c20271b.m57440i();
    }

    /* renamed from: c */
    public static /* synthetic */ void m57449c(C20271b c20271b) {
        c20271b.m57439j();
    }

    /* renamed from: d */
    public static /* synthetic */ void m57446d(C20271b c20271b) {
        c20271b.m57441h();
    }

    /* renamed from: e */
    public static /* synthetic */ void m57444e(C20271b c20271b) {
        c20271b.m57443f();
    }

    /* renamed from: f */
    public /* synthetic */ void m57443f() {
        m57460a();
        m57455b();
    }

    /* renamed from: g */
    public /* synthetic */ void m57442g() {
        for (InterfaceC20105ij interfaceC20105ij : this.f51009f) {
            interfaceC20105ij.mo55605d();
        }
    }

    /* renamed from: h */
    public /* synthetic */ void m57441h() {
        for (InterfaceC20105ij interfaceC20105ij : this.f51009f) {
            interfaceC20105ij.mo55607b();
        }
    }

    /* renamed from: i */
    public /* synthetic */ void m57440i() {
        for (InterfaceC20105ij interfaceC20105ij : this.f51009f) {
            interfaceC20105ij.mo55609a();
        }
    }

    /* renamed from: j */
    public /* synthetic */ void m57439j() {
        for (InterfaceC20105ij interfaceC20105ij : this.f51009f) {
            interfaceC20105ij.mo55606c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        FragmentC20269a.m57464b(activity);
        FragmentC20269a m57466a = FragmentC20269a.m57466a(activity);
        if (m57466a != null) {
            m57466a.m57461d(this.f51015l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m57459a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m57447d(activity);
    }

    /* renamed from: a */
    private void m57460a() {
        if (this.f51005b == 0) {
            this.f51006c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f51011h);
            this.f51008e = EnumC20155jj.PAUSED;
        }
    }

    /* renamed from: b */
    private void m57455b() {
        if (this.f51004a == 0 && this.f51006c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f51012i);
            this.f51007d = true;
            this.f51008e = EnumC20155jj.STOPPED;
        }
    }

    /* renamed from: d */
    public static C20271b m57448d() {
        return f51001m;
    }

    /* renamed from: c */
    public EnumC20155jj m57451c() {
        return this.f51008e;
    }

    /* renamed from: e */
    public boolean m57445e() {
        return this.f51008e == EnumC20155jj.STOPPED;
    }

    /* renamed from: a */
    void m57459a(Activity activity) {
        int i = this.f51005b - 1;
        this.f51005b = i;
        if (i == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.f51010g, 700L);
        }
    }

    /* renamed from: b */
    void m57454b(Activity activity) {
        int i = this.f51005b + 1;
        this.f51005b = i;
        if (i == 1) {
            if (!this.f51006c) {
                IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.f51010g);
                return;
            }
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f51013j);
            this.f51006c = false;
            this.f51008e = EnumC20155jj.RESUMED;
        }
    }

    /* renamed from: c */
    void m57450c(Activity activity) {
        int i = this.f51004a + 1;
        this.f51004a = i;
        if (i == 1 && this.f51007d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f51014k);
            this.f51007d = false;
            this.f51008e = EnumC20155jj.STARTED;
        }
    }

    /* renamed from: d */
    void m57447d(Activity activity) {
        this.f51004a--;
        m57455b();
    }

    /* renamed from: a */
    public void m57458a(Context context) {
        Application application;
        if (!f51002n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: b */
    public void m57453b(InterfaceC20105ij interfaceC20105ij) {
        if (this.f51009f.contains(interfaceC20105ij)) {
            this.f51009f.remove(interfaceC20105ij);
        }
    }

    /* renamed from: a */
    public void m57457a(InterfaceC20105ij interfaceC20105ij) {
        if (!IronsourceLifecycleProvider.m57467a() || interfaceC20105ij == null || this.f51009f.contains(interfaceC20105ij)) {
            return;
        }
        this.f51009f.add(interfaceC20105ij);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.lifecycle.b$a */
    /* loaded from: classes6.dex */
    public class C20272a implements FragmentC20269a.InterfaceC20270a {
        C20272a() {
            C20271b.this = r1;
        }

        @Override // com.ironsource.lifecycle.FragmentC20269a.InterfaceC20270a
        /* renamed from: a */
        public void mo57438a(Activity activity) {
            C20271b.this.m57450c(activity);
        }

        @Override // com.ironsource.lifecycle.FragmentC20269a.InterfaceC20270a
        public void onResume(Activity activity) {
            C20271b.this.m57454b(activity);
        }

        @Override // com.ironsource.lifecycle.FragmentC20269a.InterfaceC20270a
        /* renamed from: b */
        public void mo57437b(Activity activity) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
