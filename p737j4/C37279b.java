package p737j4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p753k4.LogUtil;

/* compiled from: LifeCycleManager.java */
/* renamed from: j4.b */
/* loaded from: classes6.dex */
public class C37279b {

    /* renamed from: a */
    private final List<InterfaceC37281b> f98437a;

    /* renamed from: b */
    private Application f98438b;

    /* renamed from: c */
    private int f98439c;

    /* renamed from: d */
    private volatile boolean f98440d;

    /* renamed from: e */
    private volatile boolean f98441e;

    /* compiled from: LifeCycleManager.java */
    /* renamed from: j4.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC37281b {
        /* renamed from: a */
        void mo18572a();

        void onBackground();
    }

    /* compiled from: LifeCycleManager.java */
    /* renamed from: j4.b$c */
    /* loaded from: classes6.dex */
    private static class C37282c {

        /* renamed from: a */
        private static final C37279b f98443a = new C37279b(null);
    }

    /* synthetic */ C37279b(C37280a c37280a) {
        this();
    }

    /* renamed from: d */
    static /* synthetic */ int m18586d(C37279b c37279b) {
        int i = c37279b.f98439c - 1;
        c37279b.f98439c = i;
        return i;
    }

    /* renamed from: e */
    static /* synthetic */ int m18585e(C37279b c37279b) {
        int i = c37279b.f98439c;
        c37279b.f98439c = i + 1;
        return i;
    }

    /* renamed from: j */
    private Object[] m18580j() {
        Object[] objArr;
        synchronized (this.f98437a) {
            if (!this.f98437a.isEmpty()) {
                objArr = this.f98437a.toArray();
            } else {
                objArr = null;
            }
        }
        return objArr;
    }

    /* renamed from: k */
    public static C37279b m18579k() {
        return C37282c.f98443a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m18577m() {
        Object[] m18580j = m18580j();
        if (m18580j == null) {
            return;
        }
        for (Object obj : m18580j) {
            ((InterfaceC37281b) obj).onBackground();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m18576n() {
        Object[] m18580j = m18580j();
        if (m18580j == null) {
            return;
        }
        for (Object obj : m18580j) {
            ((InterfaceC37281b) obj).mo18572a();
        }
    }

    /* renamed from: i */
    public void m18581i(InterfaceC37281b interfaceC37281b) {
        synchronized (this.f98437a) {
            if (this.f98437a.contains(interfaceC37281b)) {
                return;
            }
            this.f98437a.add(interfaceC37281b);
        }
    }

    /* renamed from: l */
    public Application m18578l() {
        return this.f98438b;
    }

    /* renamed from: o */
    public void m18575o(InterfaceC37281b interfaceC37281b) {
        synchronized (this.f98437a) {
            this.f98437a.remove(interfaceC37281b);
        }
    }

    /* renamed from: p */
    public void m18574p(Application application) {
        this.f98438b = application;
        application.registerActivityLifecycleCallbacks(new C37280a());
    }

    private C37279b() {
        this.f98437a = new ArrayList();
    }

    /* compiled from: LifeCycleManager.java */
    /* renamed from: j4.b$d */
    /* loaded from: classes6.dex */
    public static class C37283d implements InterfaceC37281b {
        @Override // p737j4.C37279b.InterfaceC37281b
        /* renamed from: a */
        public void mo18572a() {
        }

        @Override // p737j4.C37279b.InterfaceC37281b
        public void onBackground() {
        }
    }

    /* compiled from: LifeCycleManager.java */
    /* renamed from: j4.b$a */
    /* loaded from: classes6.dex */
    class C37280a implements Application.ActivityLifecycleCallbacks {
        C37280a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!C37276a.m18592b().m18591c(activity.getClass()) && !C37279b.this.f98441e) {
                LogUtil.m18216b("GRT_GRTLifeCycleManager", "ColdStartToForeground");
                C37279b.this.m18576n();
                C37279b.this.f98441e = true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (!C37276a.m18592b().m18591c(activity.getClass()) && C37279b.m18585e(C37279b.this) >= 0 && C37279b.this.f98440d) {
                LogUtil.m18216b("GRT_GRTLifeCycleManager", "ToForeground");
                C37279b.this.f98440d = false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            boolean z;
            if (C37276a.m18592b().m18591c(activity.getClass())) {
                return;
            }
            C37279b c37279b = C37279b.this;
            if (C37279b.m18586d(c37279b) <= 0) {
                z = true;
            } else {
                z = false;
            }
            c37279b.f98440d = z;
            if (C37279b.this.f98440d) {
                LogUtil.m18216b("GRT_GRTLifeCycleManager", "ToBackground");
                C37279b.this.m18577m();
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
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
