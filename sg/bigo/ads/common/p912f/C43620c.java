package sg.bigo.ads.common.p912f;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.common.p912f.C43618b;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.f.c */
/* loaded from: classes10.dex */
public final class C43620c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static boolean f114197a = false;

    /* renamed from: b */
    private static int f114198b = -1;

    /* renamed from: c */
    private static int f114199c = -1;

    /* renamed from: d */
    private static Application f114200d;

    /* renamed from: e */
    private WeakReference<Activity> f114201e;

    /* renamed from: f */
    private final Map<InterfaceC43631a, Object> f114202f;

    /* renamed from: sg.bigo.ads.common.f.c$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43631a {
        /* renamed from: a */
        void mo5293a(Activity activity);
    }

    /* renamed from: sg.bigo.ads.common.f.c$b */
    /* loaded from: classes10.dex */
    static class C43632b {

        /* renamed from: a */
        private static final C43620c f114221a = new C43620c((byte) 0);
    }

    private C43620c() {
        this.f114202f = new WeakHashMap();
    }

    /* renamed from: a */
    public static Application m5302a() {
        return f114200d;
    }

    @Nullable
    /* renamed from: b */
    public static Activity m5298b() {
        WeakReference<Activity> weakReference = C43632b.f114221a.f114201e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: c */
    public static int m5296c() {
        int i;
        if (f114197a && (i = f114199c) >= 0) {
            if (i > 0) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m5295d() {
        if (f114199c > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m5294e() {
        if (f114198b > 0) {
            return true;
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull final Activity activity, @Nullable Bundle bundle) {
        f114198b++;
        C43727d.m5102b(new Runnable() { // from class: sg.bigo.ads.common.f.c.3
            @Override // java.lang.Runnable
            public final void run() {
                for (Map.Entry entry : C43620c.this.f114202f.entrySet()) {
                    final InterfaceC43631a interfaceC43631a = (InterfaceC43631a) entry.getKey();
                    if (interfaceC43631a != null) {
                        C43727d.m5102b(new Runnable() { // from class: sg.bigo.ads.common.f.c.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull final Activity activity) {
        f114198b--;
        C43727d.m5102b(new Runnable() { // from class: sg.bigo.ads.common.f.c.6
            @Override // java.lang.Runnable
            public final void run() {
                for (Map.Entry entry : C43620c.this.f114202f.entrySet()) {
                    final InterfaceC43631a interfaceC43631a = (InterfaceC43631a) entry.getKey();
                    if (interfaceC43631a != null) {
                        C43727d.m5102b(new Runnable() { // from class: sg.bigo.ads.common.f.c.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC43631a.mo5293a(activity);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull final Activity activity) {
        this.f114201e = null;
        C43727d.m5102b(new Runnable() { // from class: sg.bigo.ads.common.f.c.5
            @Override // java.lang.Runnable
            public final void run() {
                for (Map.Entry entry : C43620c.this.f114202f.entrySet()) {
                    final InterfaceC43631a interfaceC43631a = (InterfaceC43631a) entry.getKey();
                    if (interfaceC43631a != null) {
                        C43727d.m5102b(new Runnable() { // from class: sg.bigo.ads.common.f.c.5.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull final Activity activity) {
        this.f114201e = new WeakReference<>(activity);
        C43727d.m5102b(new Runnable() { // from class: sg.bigo.ads.common.f.c.4
            @Override // java.lang.Runnable
            public final void run() {
                for (Map.Entry entry : C43620c.this.f114202f.entrySet()) {
                    final InterfaceC43631a interfaceC43631a = (InterfaceC43631a) entry.getKey();
                    if (interfaceC43631a != null) {
                        C43727d.m5102b(new Runnable() { // from class: sg.bigo.ads.common.f.c.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        if (f114199c == 0) {
            C43618b m5305a = C43618b.m5305a();
            m5305a.m5304b();
            if (m5305a.f114196d != null && m5305a.m5303c()) {
                m5305a.f114196d.mo4106a(m5305a.f114194b, m5305a.f114195c);
            }
            C43782a.m5010a(0, 3, "LAM", "On enter foreground.");
        }
        f114199c++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        int i = f114199c - 1;
        f114199c = i;
        if (i == 0) {
            C43618b m5305a = C43618b.m5305a();
            if (m5305a.f114196d != null && m5305a.m5303c()) {
                C43618b.InterfaceC43619a interfaceC43619a = m5305a.f114196d;
                boolean z = m5305a.f114193a;
                long j = m5305a.f114194b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = m5305a.f114195c;
                System.currentTimeMillis();
                interfaceC43619a.mo4103a(z, j, elapsedRealtime, j2);
            }
            m5305a.f114193a = false;
            C43782a.m5010a(0, 3, "LAM", "On enter background.");
        }
    }

    /* synthetic */ C43620c(byte b) {
        this();
    }

    /* renamed from: b */
    public static void m5297b(final InterfaceC43631a interfaceC43631a) {
        C43727d.m5102b(new Runnable() { // from class: sg.bigo.ads.common.f.c.2
            @Override // java.lang.Runnable
            public final void run() {
                C43632b.f114221a.f114202f.remove(InterfaceC43631a.this);
            }
        });
    }

    /* renamed from: a */
    public static synchronized void m5301a(@NonNull Application application) {
        synchronized (C43620c.class) {
            if (f114197a) {
                return;
            }
            f114197a = true;
            f114198b = 0;
            f114199c = 0;
            f114200d = application;
            application.registerActivityLifecycleCallbacks(C43632b.f114221a);
        }
    }

    /* renamed from: a */
    public static void m5300a(final InterfaceC43631a interfaceC43631a) {
        C43727d.m5102b(new Runnable() { // from class: sg.bigo.ads.common.f.c.1
            @Override // java.lang.Runnable
            public final void run() {
                C43632b.f114221a.f114202f.put(InterfaceC43631a.this, C43632b.f114221a);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
