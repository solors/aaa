package p874s4;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.WorkerThread;
import p770l4.DebugStats;
import p770l4.LearningsAnalytics;
import p797n4.C38423c;
import p797n4.PropertiesManager;
import p979t4.EventSender;
import p993u4.C44433l;

/* renamed from: s4.j */
/* loaded from: classes6.dex */
public class WorkHandler {

    /* renamed from: a */
    private final Handler f104087a;

    /* renamed from: b */
    private long f104088b;

    /* renamed from: c */
    private long f104089c;

    /* compiled from: WorkHandler.java */
    /* renamed from: s4.j$b */
    /* loaded from: classes6.dex */
    public static class C39616b {

        /* renamed from: a */
        private static final WorkHandler f104090a = new WorkHandler();
    }

    /* renamed from: g */
    public static WorkHandler m12139g() {
        return C39616b.f104090a;
    }

    /* renamed from: h */
    public static /* synthetic */ void m12138h(String str, Bundle bundle) {
        try {
            if (LearningsAnalytics.m15688o()) {
                DebugStats.m15711b().m15710c();
            }
            C38423c.m14717c().m14715e(str, bundle);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m12137i(String str, String str2) {
        try {
            PropertiesManager.m14701e().m14688r(str, str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m12136j(String str, String str2) {
        try {
            PropertiesManager.m14701e().m14686t(str, str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: l */
    public /* synthetic */ void m12134l() {
        m12135k(true);
    }

    @WorkerThread
    /* renamed from: u */
    public void m12125u() {
        if (C44433l.m2994d()) {
            C44433l.m2997a("WorkHandler", "uploadHistoryEvents.");
        }
        try {
            C38423c.m14717c().m14714f(false);
        } catch (Throwable unused) {
        }
        if (EventSender.m3267g().m3269e()) {
            this.f104087a.postDelayed(new RunnableC39613h(this), this.f104089c);
        }
    }

    @WorkerThread
    /* renamed from: v */
    public void m12135k(boolean z) {
        if (C44433l.m2994d()) {
            C44433l.m2997a("WorkHandler", "uploadNewestEvents.");
        }
        try {
            C38423c.m14717c().m14714f(true);
        } catch (Throwable unused) {
        }
        if (z) {
            this.f104087a.postDelayed(new Runnable() { // from class: s4.i
                {
                    WorkHandler.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WorkHandler.this.m12134l();
                }
            }, this.f104088b);
        }
    }

    /* renamed from: m */
    public void m12133m(Runnable runnable) {
        this.f104087a.post(runnable);
    }

    /* renamed from: n */
    public void m12132n(long j) {
        this.f104089c = j;
    }

    /* renamed from: o */
    public void m12131o(long j) {
        this.f104088b = j;
    }

    /* renamed from: p */
    public void m12130p(final String str, final Bundle bundle) {
        this.f104087a.post(new Runnable() { // from class: s4.e
            @Override // java.lang.Runnable
            public final void run() {
                WorkHandler.m12138h(str, bundle);
            }
        });
    }

    /* renamed from: q */
    public void m12129q(final String str, final String str2) {
        this.f104087a.post(new Runnable() { // from class: s4.f
            @Override // java.lang.Runnable
            public final void run() {
                WorkHandler.m12137i(str, str2);
            }
        });
    }

    /* renamed from: r */
    public void m12128r(final String str, final String str2) {
        this.f104087a.post(new Runnable() { // from class: s4.d
            @Override // java.lang.Runnable
            public final void run() {
                WorkHandler.m12136j(str, str2);
            }
        });
    }

    /* renamed from: s */
    public void m12127s() {
        if (C44433l.m2994d()) {
            C44433l.m2997a("WorkHandler", "startAutoUploadHistoryEvents.");
        }
        this.f104087a.post(new RunnableC39613h(this));
    }

    /* renamed from: t */
    public void m12126t(long j, final boolean z) {
        if (C44433l.m2994d()) {
            C44433l.m2997a("WorkHandler", "startAutoUploadNewestEvents delayTime = " + j + " polling = " + z);
        }
        this.f104087a.postDelayed(new Runnable() { // from class: s4.g
            {
                WorkHandler.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WorkHandler.this.m12135k(z);
            }
        }, j);
    }

    private WorkHandler() {
        this.f104088b = 15000L;
        this.f104089c = 15000L;
        HandlerThread handlerThread = new HandlerThread("learnings_analyze_work_handler");
        handlerThread.start();
        this.f104087a = new Handler(handlerThread.getLooper());
    }
}
