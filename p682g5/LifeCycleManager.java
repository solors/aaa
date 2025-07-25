package p682g5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p738j5.LogUtils;

/* renamed from: g5.b */
/* loaded from: classes6.dex */
public class LifeCycleManager {

    /* renamed from: a */
    private final List<InterfaceC33203b> f90750a;

    /* renamed from: b */
    private Application f90751b;

    /* renamed from: c */
    private volatile boolean f90752c;

    /* compiled from: LifeCycleManager.java */
    /* renamed from: g5.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC33203b {
        /* renamed from: a */
        void mo699a();
    }

    /* compiled from: LifeCycleManager.java */
    /* renamed from: g5.b$c */
    /* loaded from: classes6.dex */
    private static class C33204c {

        /* renamed from: a */
        private static final LifeCycleManager f90754a = new LifeCycleManager(null);
    }

    /* synthetic */ LifeCycleManager(C33202a c33202a) {
        this();
    }

    /* renamed from: e */
    private Object[] m24310e() {
        Object[] objArr;
        synchronized (this.f90750a) {
            if (!this.f90750a.isEmpty()) {
                objArr = this.f90750a.toArray();
            } else {
                objArr = null;
            }
        }
        return objArr;
    }

    /* renamed from: f */
    public static LifeCycleManager m24309f() {
        return C33204c.f90754a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m24307h() {
        Object[] m24310e = m24310e();
        if (m24310e == null) {
            return;
        }
        for (Object obj : m24310e) {
            ((InterfaceC33203b) obj).mo699a();
        }
    }

    /* renamed from: d */
    public void m24311d(InterfaceC33203b interfaceC33203b) {
        synchronized (this.f90750a) {
            if (this.f90750a.contains(interfaceC33203b)) {
                return;
            }
            this.f90750a.add(interfaceC33203b);
        }
    }

    /* renamed from: g */
    public Application m24308g() {
        return this.f90751b;
    }

    /* renamed from: i */
    public void m24306i(InterfaceC33203b interfaceC33203b) {
        synchronized (this.f90750a) {
            this.f90750a.remove(interfaceC33203b);
        }
    }

    /* renamed from: j */
    public void m24305j(Application application) {
        this.f90751b = application;
        application.registerActivityLifecycleCallbacks(new C33202a());
    }

    private LifeCycleManager() {
        this.f90750a = new ArrayList();
    }

    /* compiled from: LifeCycleManager.java */
    /* renamed from: g5.b$a */
    /* loaded from: classes6.dex */
    class C33202a implements Application.ActivityLifecycleCallbacks {
        C33202a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!DisObserveActivityManager.m24317a().m24316b(activity.getClass()) && !LifeCycleManager.this.f90752c) {
                LogUtils.m18537b("UserTag_LifeCycleManager", "ColdStartToForeground");
                LifeCycleManager.this.m24307h();
                LifeCycleManager.this.f90752c = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
