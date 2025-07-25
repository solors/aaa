package p797n4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p770l4.DebugStats;
import p770l4.LearningsAnalytics;
import p797n4.ActivityLifeCycleManager;
import p858r4.SharedPreferencesManager;
import p874s4.WorkHandler;

/* renamed from: n4.b */
/* loaded from: classes6.dex */
public class ActivityLifeCycleManager {

    /* renamed from: a */
    private int f101761a;

    /* renamed from: b */
    private boolean f101762b;

    /* renamed from: c */
    private long f101763c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActivityLifeCycleManager.java */
    /* renamed from: n4.b$b */
    /* loaded from: classes6.dex */
    public static class C38422b {

        /* renamed from: a */
        private static final ActivityLifeCycleManager f101766a = new ActivityLifeCycleManager(null);
    }

    /* synthetic */ ActivityLifeCycleManager(C38421a c38421a) {
        this();
    }

    /* renamed from: b */
    static /* synthetic */ int m14730b(ActivityLifeCycleManager activityLifeCycleManager) {
        int i = activityLifeCycleManager.f101761a;
        activityLifeCycleManager.f101761a = i + 1;
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ int m14729c(ActivityLifeCycleManager activityLifeCycleManager) {
        int i = activityLifeCycleManager.f101761a;
        activityLifeCycleManager.f101761a = i - 1;
        return i;
    }

    /* renamed from: h */
    public static ActivityLifeCycleManager m14724h() {
        return C38422b.f101766a;
    }

    /* renamed from: i */
    public void m14723i(Application application) {
        application.registerActivityLifecycleCallbacks(new C38421a(application));
    }

    private ActivityLifeCycleManager() {
        this.f101762b = true;
        this.f101763c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityLifeCycleManager.java */
    /* renamed from: n4.b$a */
    /* loaded from: classes6.dex */
    public class C38421a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b */
        final /* synthetic */ Application f101764b;

        C38421a(Application application) {
            ActivityLifeCycleManager.this = r1;
            this.f101764b = application;
        }

        /* renamed from: b */
        public static /* synthetic */ void m14721b() {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            DebugStats.m15711b().m15712a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            if (System.currentTimeMillis() - ActivityLifeCycleManager.this.f101763c >= 10000) {
                WorkHandler.m12139g().m12126t(300L, false);
                ActivityLifeCycleManager.this.f101763c = System.currentTimeMillis();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            ActivityLifeCycleManager.m14730b(ActivityLifeCycleManager.this);
            if (ActivityLifeCycleManager.this.f101762b) {
                WorkHandler.m12139g().m12126t(300L, false);
                ActivityLifeCycleManager.this.f101762b = false;
                ActivityLifeCycleManager.this.f101763c = System.currentTimeMillis();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
            ActivityLifeCycleManager.m14729c(ActivityLifeCycleManager.this);
            if (ActivityLifeCycleManager.this.f101761a <= 0) {
                SharedPreferencesManager.m12681b().m12676g(this.f101764b, "meevii_analyze", "key_event_num", C38423c.m14718b());
                WorkHandler.m12139g().m12126t(300L, false);
            }
            if (ActivityLifeCycleManager.this.f101761a <= 0 && LearningsAnalytics.m15688o()) {
                new Thread(new Runnable() { // from class: n4.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityLifeCycleManager.C38421a.m14721b();
                    }
                });
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }
    }
}
