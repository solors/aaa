package p770l4;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import p797n4.ActivityLifeCycleManager;
import p797n4.PropertiesManager;
import p874s4.WorkHandler;
import p992u3.LogLevel;
import p993u4.C44424b;
import p993u4.C44433l;

/* renamed from: l4.g */
/* loaded from: classes6.dex */
public class LearningsAnalytics {

    /* renamed from: h */
    private static boolean f99975h = false;

    /* renamed from: a */
    private volatile boolean f99976a;

    /* renamed from: b */
    private final long f99977b;

    /* renamed from: c */
    private String f99978c;

    /* renamed from: d */
    private String f99979d;

    /* renamed from: e */
    private String f99980e;

    /* renamed from: f */
    private Boolean f99981f;

    /* renamed from: g */
    private Context f99982g;

    /* compiled from: LearningsAnalytics.java */
    /* renamed from: l4.g$b */
    /* loaded from: classes6.dex */
    public static class C37925b {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: a */
        private static final LearningsAnalytics f99983a = new LearningsAnalytics();
    }

    /* renamed from: f */
    private void m15697f() {
        if (this.f99982g != null) {
            if (!TextUtils.isEmpty(this.f99978c)) {
                if (!TextUtils.isEmpty(this.f99979d)) {
                    if (!TextUtils.isEmpty(this.f99980e)) {
                        this.f99979d = this.f99979d.trim();
                        this.f99980e = this.f99980e.trim();
                        this.f99978c = this.f99978c.trim();
                        return;
                    }
                    throw new IllegalArgumentException("productionId is empty.");
                }
                throw new IllegalArgumentException("secret is empty.");
            }
            throw new IllegalArgumentException("keyId is empty.");
        }
        throw new IllegalArgumentException("Context is null.");
    }

    /* renamed from: i */
    public static LearningsAnalytics m15694i() {
        return C37925b.f99983a;
    }

    /* renamed from: o */
    public static boolean m15688o() {
        return f99975h;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0080 A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:33:0x0000, B:36:0x0006, B:38:0x000c, B:40:0x005c, B:45:0x0064, B:47:0x0069, B:50:0x006e, B:52:0x0080, B:54:0x00a8, B:55:0x00b6), top: B:60:0x0000 }] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void m15687p(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, p992u3.LogLevel r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r4 = this;
            boolean r0 = r4.f99976a     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = "LearningsAnalytics"
            if (r0 == 0) goto Lc
            java.lang.String r5 = "has init."
            p993u4.C44433l.m2997a(r1, r5)     // Catch: java.lang.Throwable -> Lb9
            return
        Lc:
            r4.f99982g = r5     // Catch: java.lang.Throwable -> Lb9
            r4.f99978c = r6     // Catch: java.lang.Throwable -> Lb9
            r4.f99979d = r7     // Catch: java.lang.Throwable -> Lb9
            r4.f99980e = r8     // Catch: java.lang.Throwable -> Lb9
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> Lb9
            r4.f99981f = r0     // Catch: java.lang.Throwable -> Lb9
            r4.m15697f()     // Catch: java.lang.Throwable -> Lb9
            p993u4.C44433l.m2991g(r10)     // Catch: java.lang.Throwable -> Lb9
            com.learnings.learningsanalyze.repository.database.Database.m53665e(r5)     // Catch: java.lang.Throwable -> Lb9
            n4.c r10 = p797n4.C38423c.m14717c()     // Catch: java.lang.Throwable -> Lb9
            r10.m14716d(r5)     // Catch: java.lang.Throwable -> Lb9
            n4.d r10 = p797n4.PackageManager.m14710c()     // Catch: java.lang.Throwable -> Lb9
            r10.m14708e(r5)     // Catch: java.lang.Throwable -> Lb9
            n4.c r10 = p797n4.C38423c.m14717c()     // Catch: java.lang.Throwable -> Lb9
            r10.m14719a()     // Catch: java.lang.Throwable -> Lb9
            n4.g r10 = p797n4.PropertiesManager.m14701e()     // Catch: java.lang.Throwable -> Lb9
            r10.m14697i(r5, r11, r12, r13)     // Catch: java.lang.Throwable -> Lb9
            n4.g r5 = p797n4.PropertiesManager.m14701e()     // Catch: java.lang.Throwable -> Lb9
            com.learnings.learningsanalyze.repository.database.Database r10 = com.learnings.learningsanalyze.repository.database.Database.m53666d()     // Catch: java.lang.Throwable -> Lb9
            p4.a r10 = r10.mo53662c()     // Catch: java.lang.Throwable -> Lb9
            long r10 = r10.mo13299r()     // Catch: java.lang.Throwable -> Lb9
            r5.m14703c(r10)     // Catch: java.lang.Throwable -> Lb9
            s4.j r5 = p874s4.WorkHandler.m12139g()     // Catch: java.lang.Throwable -> Lb9
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 15000(0x3a98, double:7.411E-320)
            if (r9 == 0) goto L63
            boolean r0 = p770l4.LearningsAnalytics.f99975h     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L61
            goto L63
        L61:
            r2 = r10
            goto L64
        L63:
            r2 = r12
        L64:
            r5.m12131o(r2)     // Catch: java.lang.Throwable -> Lb9
            if (r9 == 0) goto L6d
            boolean r9 = p770l4.LearningsAnalytics.f99975h     // Catch: java.lang.Throwable -> Lb9
            if (r9 == 0) goto L6e
        L6d:
            r10 = r12
        L6e:
            r5.m12132n(r10)     // Catch: java.lang.Throwable -> Lb9
            r9 = 0
            r11 = 1
            r5.m12126t(r9, r11)     // Catch: java.lang.Throwable -> Lb9
            r5.m12127s()     // Catch: java.lang.Throwable -> Lb9
            boolean r5 = p993u4.C44433l.m2994d()     // Catch: java.lang.Throwable -> Lb9
            if (r5 == 0) goto Lb6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            r5.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r9 = "init. keyId = "
            r5.append(r9)     // Catch: java.lang.Throwable -> Lb9
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r6 = ", secret = "
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb9
            r5.append(r7)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r6 = ", productionId = "
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb9
            r5.append(r8)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb9
            p993u4.C44433l.m2997a(r1, r5)     // Catch: java.lang.Throwable -> Lb9
            boolean r5 = p770l4.LearningsAnalytics.f99975h     // Catch: java.lang.Throwable -> Lb9
            if (r5 == 0) goto Lb6
            java.lang.String r5 = "statistics-"
            java.lang.String r6 = "init --------------------------------------------------"
            p993u4.C44433l.m2997a(r5, r6)     // Catch: java.lang.Throwable -> Lb9
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb9
            p770l4.DebugStats.m15709d(r5)     // Catch: java.lang.Throwable -> Lb9
        Lb6:
            r4.f99976a = r11     // Catch: java.lang.Throwable -> Lb9
            goto Lbd
        Lb9:
            r5 = move-exception
            r5.printStackTrace()
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p770l4.LearningsAnalytics.m15687p(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, u3.a, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: q */
    public static /* synthetic */ void m15686q(Map map) {
        PropertiesManager.m14701e().m14693m(map);
    }

    /* renamed from: r */
    public static /* synthetic */ void m15685r(String str) {
        PropertiesManager.m14701e().m14692n(str);
    }

    /* renamed from: s */
    public static /* synthetic */ void m15684s(String str) {
        PropertiesManager.m14701e().m14691o(str);
    }

    /* renamed from: t */
    public static /* synthetic */ void m15683t(String str) {
        PropertiesManager.m14701e().m14690p(str);
    }

    /* renamed from: A */
    public void m15703A(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C44433l.m2990h("LearningsAnalytics", "Illegal user property: name is empty.");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "unset";
        }
        if (C44433l.m2994d()) {
            C44433l.m2997a("LearningsAnalytics", "setUserProperty. key = " + str + " value = " + str2);
        }
        WorkHandler.m12139g().m12128r(str, str2);
    }

    /* renamed from: g */
    public Context m15696g() {
        return this.f99982g;
    }

    /* renamed from: h */
    public Boolean m15695h() {
        return this.f99981f;
    }

    /* renamed from: j */
    public String m15693j() {
        return this.f99978c;
    }

    /* renamed from: k */
    public String m15692k() {
        return this.f99980e;
    }

    /* renamed from: l */
    public String m15691l() {
        return this.f99979d;
    }

    /* renamed from: m */
    public long m15690m() {
        return this.f99977b;
    }

    /* renamed from: n */
    public void m15689n(final Context context, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final boolean z, final LogLevel logLevel) {
        WorkHandler.m12139g().m12133m(new Runnable() { // from class: l4.c
            {
                LearningsAnalytics.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LearningsAnalytics.this.m15687p(context, str, str2, str3, z, logLevel, str4, str5, str6);
            }
        });
        ActivityLifeCycleManager.m14724h().m14723i((Application) context.getApplicationContext());
    }

    /* renamed from: u */
    public void m15682u(String str, Bundle bundle) {
        if (C44433l.m2994d()) {
            C44433l.m2997a("LearningsAnalytics", "sendEvent. key = " + str + " bundle = " + bundle);
        }
        if (TextUtils.isEmpty(str)) {
            C44433l.m2990h("LearningsAnalytics", "key is empty when send event.");
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        WorkHandler.m12139g().m12130p(str, bundle);
    }

    /* renamed from: v */
    public void m15681v(final Map<String, String> map) {
        WorkHandler.m12139g().m12133m(new Runnable() { // from class: l4.d
            @Override // java.lang.Runnable
            public final void run() {
                LearningsAnalytics.m15686q(map);
            }
        });
    }

    /* renamed from: w */
    public void m15680w(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C44433l.m2990h("LearningsAnalytics", "Illegal event property: name is empty.");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "unset";
        }
        if (C44433l.m2994d()) {
            C44433l.m2997a("LearningsAnalytics", "setEventProperty. key = " + str + " value = " + str2);
        }
        WorkHandler.m12139g().m12129q(str, str2);
    }

    /* renamed from: x */
    public void m15679x(final String str) {
        if (TextUtils.isEmpty(str)) {
            if (C44433l.m2994d()) {
                C44433l.m2990h("LearningsAnalytics", "learningsId is empty.");
                return;
            }
            return;
        }
        WorkHandler.m12139g().m12133m(new Runnable() { // from class: l4.f
            @Override // java.lang.Runnable
            public final void run() {
                LearningsAnalytics.m15685r(str);
            }
        });
    }

    /* renamed from: y */
    public void m15678y(final String str) {
        if (TextUtils.isEmpty(str)) {
            if (C44433l.m2994d()) {
                C44433l.m2990h("LearningsAnalytics", "luid is empty.");
                return;
            }
            return;
        }
        WorkHandler.m12139g().m12133m(new Runnable() { // from class: l4.b
            @Override // java.lang.Runnable
            public final void run() {
                LearningsAnalytics.m15684s(str);
            }
        });
    }

    /* renamed from: z */
    public void m15677z(final String str) {
        if (TextUtils.isEmpty(str)) {
            if (C44433l.m2994d()) {
                C44433l.m2990h("LearningsAnalytics", "pseudoId is empty.");
                return;
            }
            return;
        }
        WorkHandler.m12139g().m12133m(new Runnable() { // from class: l4.e
            @Override // java.lang.Runnable
            public final void run() {
                LearningsAnalytics.m15683t(str);
            }
        });
    }

    private LearningsAnalytics() {
        this.f99976a = false;
        this.f99981f = Boolean.FALSE;
        this.f99977b = C44424b.m3033a();
    }
}
