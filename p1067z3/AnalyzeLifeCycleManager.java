package p1067z3;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import p1036x3.InnerAnalyzeManager;
import p1052y3.AppEngagementEvent;
import p1052y3.SesStartEvent;

/* renamed from: z3.c */
/* loaded from: classes6.dex */
public class AnalyzeLifeCycleManager {

    /* renamed from: g */
    private static volatile AnalyzeLifeCycleManager f118685g;

    /* renamed from: a */
    private int f118686a;

    /* renamed from: b */
    private volatile boolean f118687b;

    /* renamed from: c */
    private volatile boolean f118688c;

    /* renamed from: d */
    private IInnerEventOpportunity f118689d;

    /* renamed from: e */
    private long f118690e;

    /* renamed from: f */
    private final Handler f118691f = new Handler(Looper.getMainLooper());

    /* compiled from: AnalyzeLifeCycleManager.java */
    /* renamed from: z3.c$a */
    /* loaded from: classes6.dex */
    public class C45116a extends C45117b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45116a() {
            super(null);
            AnalyzeLifeCycleManager.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!InnerAnalyzeManager.m2018p().m2017q(activity.getClass()) && !AnalyzeLifeCycleManager.this.f118688c) {
                AnalyzeLifeCycleManager.this.m840w(activity.getIntent());
                if (AnalyzeLifeCycleManager.this.f118689d != null) {
                    AnalyzeLifeCycleManager.this.f118689d.mo839a();
                    AnalyzeLifeCycleManager.this.m844s();
                }
                AnalyzeLifeCycleManager.this.f118688c = true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (!InnerAnalyzeManager.m2018p().m2017q(activity.getClass()) && AnalyzeLifeCycleManager.m855h(AnalyzeLifeCycleManager.this) >= 0 && AnalyzeLifeCycleManager.this.f118687b) {
                AnalyzeLifeCycleManager.this.f118687b = false;
                if (AnalyzeLifeCycleManager.this.f118689d != null) {
                    AnalyzeLifeCycleManager.this.m844s();
                    if (Math.abs(System.currentTimeMillis() - AnalyzeLifeCycleManager.this.f118690e) > SesStartEvent.f118458f) {
                        AnalyzeLifeCycleManager.this.f118689d.mo836d();
                    }
                    AnalyzeLifeCycleManager.this.m840w(activity.getIntent());
                    AnalyzeLifeCycleManager.this.f118689d.onBackToForeground();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            boolean z;
            if (InnerAnalyzeManager.m2018p().m2017q(activity.getClass())) {
                return;
            }
            AnalyzeLifeCycleManager analyzeLifeCycleManager = AnalyzeLifeCycleManager.this;
            if (AnalyzeLifeCycleManager.m856g(analyzeLifeCycleManager) <= 0) {
                z = true;
            } else {
                z = false;
            }
            analyzeLifeCycleManager.f118687b = z;
            if (AnalyzeLifeCycleManager.this.f118687b && AnalyzeLifeCycleManager.this.f118689d != null) {
                AnalyzeLifeCycleManager.this.f118690e = System.currentTimeMillis();
                AnalyzeLifeCycleManager.this.m848o();
                AnalyzeLifeCycleManager.this.m842u(activity.getIntent());
                AnalyzeLifeCycleManager.this.f118689d.onBackground();
            }
        }
    }

    private AnalyzeLifeCycleManager() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m862a(AnalyzeLifeCycleManager analyzeLifeCycleManager) {
        analyzeLifeCycleManager.m845r();
    }

    /* renamed from: g */
    static /* synthetic */ int m856g(AnalyzeLifeCycleManager analyzeLifeCycleManager) {
        int i = analyzeLifeCycleManager.f118686a - 1;
        analyzeLifeCycleManager.f118686a = i;
        return i;
    }

    /* renamed from: h */
    static /* synthetic */ int m855h(AnalyzeLifeCycleManager analyzeLifeCycleManager) {
        int i = analyzeLifeCycleManager.f118686a;
        analyzeLifeCycleManager.f118686a = i + 1;
        return i;
    }

    /* renamed from: o */
    public void m848o() {
        this.f118691f.removeCallbacksAndMessages(null);
    }

    /* renamed from: p */
    public static AnalyzeLifeCycleManager m847p() {
        if (f118685g == null) {
            synchronized (AnalyzeLifeCycleManager.class) {
                if (f118685g == null) {
                    f118685g = new AnalyzeLifeCycleManager();
                }
            }
        }
        return f118685g;
    }

    /* renamed from: r */
    public /* synthetic */ void m845r() {
        this.f118689d.mo837c();
        m844s();
    }

    /* renamed from: s */
    public void m844s() {
        this.f118691f.postDelayed(new Runnable() { // from class: z3.b
            @Override // java.lang.Runnable
            public final void run() {
                AnalyzeLifeCycleManager.m862a(AnalyzeLifeCycleManager.this);
            }
        }, AppEngagementEvent.f118456g);
    }

    /* renamed from: u */
    public void m842u(Intent intent) {
        if (intent != null) {
            try {
                intent.removeExtra("hms_push_click_intent");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: w */
    public void m840w(Intent intent) {
        if (intent != null) {
            try {
                if (intent.getBooleanExtra("hms_push_click_intent", false)) {
                    InnerAnalyzeManager.m2018p().m2016r(2);
                    intent.removeExtra("hms_push_click_intent");
                }
            } catch (Exception e) {
                InnerAnalyzeManager.m2018p().m2016r(1);
                e.printStackTrace();
                return;
            }
        }
        InnerAnalyzeManager.m2018p().m2016r(1);
    }

    /* renamed from: q */
    public boolean m846q() {
        return this.f118688c;
    }

    /* renamed from: t */
    public void m843t(Application application) {
        application.registerActivityLifecycleCallbacks(new C45116a());
    }

    /* renamed from: v */
    public void m841v(IInnerEventOpportunity iInnerEventOpportunity) {
        this.f118689d = iInnerEventOpportunity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnalyzeLifeCycleManager.java */
    /* renamed from: z3.c$b */
    /* loaded from: classes6.dex */
    public static class C45117b implements Application.ActivityLifecycleCallbacks {
        private C45117b() {
        }

        /* synthetic */ C45117b(C45116a c45116a) {
            this();
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
