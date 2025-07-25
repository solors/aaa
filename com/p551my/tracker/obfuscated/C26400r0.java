package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.C21170w8;

/* renamed from: com.my.tracker.obfuscated.r0 */
/* loaded from: classes7.dex */
public final class C26400r0 {

    /* renamed from: b */
    private static volatile C26400r0 f68828b;

    /* renamed from: a */
    private final SharedPreferences f68829a;

    private C26400r0(SharedPreferences sharedPreferences) {
        this.f68829a = sharedPreferences;
    }

    /* renamed from: a */
    public static C26400r0 m41763a(Context context) {
        C26400r0 c26400r0 = f68828b;
        if (c26400r0 == null) {
            synchronized (C26400r0.class) {
                c26400r0 = f68828b;
                if (c26400r0 == null) {
                    c26400r0 = new C26400r0(context.getSharedPreferences("mytracker_prefs", 0));
                    f68828b = c26400r0;
                }
            }
        }
        return c26400r0;
    }

    /* renamed from: b */
    public long m41758b() {
        return m41756b("appGalleryTrackedTime");
    }

    /* renamed from: c */
    public String m41755c() {
        return m41753c("appId");
    }

    /* renamed from: d */
    public String m41752d() {
        return m41753c("appSetId");
    }

    /* renamed from: e */
    public String m41749e() {
        return m41753c("appVersionName");
    }

    /* renamed from: f */
    public String m41747f() {
        return m41753c("appsHash");
    }

    /* renamed from: g */
    public String m41745g() {
        return m41753c(C21170w8.f54322c);
    }

    /* renamed from: h */
    public String m41743h() {
        return m41753c("firebaseAppInstanceId");
    }

    /* renamed from: i */
    public long m41741i() {
        return m41756b("installTimestamp");
    }

    /* renamed from: j */
    public String m41739j() {
        return m41753c("instanceId");
    }

    /* renamed from: k */
    public long m41737k() {
        return m41756b("lastUpdateTimestamp");
    }

    /* renamed from: l */
    public String m41735l() {
        return m41753c("referrer");
    }

    /* renamed from: m */
    public long m41733m() {
        long m41756b = m41756b("lastStopTimeStampSec");
        m41761a("lastStopTimeStampSec", 0L);
        return m41756b;
    }

    /* renamed from: n */
    public boolean m41732n() {
        return m41762a("apiReferrerSent");
    }

    /* renamed from: o */
    public boolean m41731o() {
        return m41762a("huaweiApiReferrerSent");
    }

    /* renamed from: p */
    public boolean m41730p() {
        return m41762a("preinstallRead");
    }

    /* renamed from: q */
    public boolean m41729q() {
        return m41762a("referrerSent");
    }

    /* renamed from: r */
    public void m41728r() {
        m41759a("apiReferrerSent", true);
    }

    /* renamed from: s */
    public void m41727s() {
        m41759a("huaweiApiReferrerSent", true);
    }

    /* renamed from: t */
    public void m41726t() {
        m41759a("preinstallRead", true);
    }

    /* renamed from: u */
    public void m41725u() {
        m41759a("referrerSent", true);
    }

    /* renamed from: a */
    public String m41766a() {
        return m41753c("appVersion");
    }

    /* renamed from: b */
    long m41756b(String str) {
        try {
            return this.f68829a.getLong(str, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: c */
    String m41753c(String str) {
        try {
            return this.f68829a.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: d */
    public void m41751d(long j) {
        m41761a("lastStopTimeStampSec", j);
    }

    /* renamed from: e */
    public void m41748e(String str) {
        m41760a("appId", str);
    }

    /* renamed from: f */
    public void m41746f(String str) {
        m41760a("appSetId", str);
    }

    /* renamed from: g */
    public void m41744g(String str) {
        m41760a("appVersionName", str);
    }

    /* renamed from: h */
    public void m41742h(String str) {
        m41760a("appsHash", str);
    }

    /* renamed from: i */
    public void m41740i(String str) {
        m41760a(C21170w8.f54322c, str);
    }

    /* renamed from: j */
    public void m41738j(String str) {
        m41760a("firebaseAppInstanceId", str);
    }

    /* renamed from: k */
    public void m41736k(String str) {
        m41760a("instanceId", str);
    }

    /* renamed from: l */
    public void m41734l(String str) {
        m41760a("referrer", str);
    }

    /* renamed from: a */
    public void m41765a(int i) {
        m41761a("appSetIdScope", i);
    }

    /* renamed from: b */
    public void m41757b(long j) {
        m41761a("installTimestamp", j);
    }

    /* renamed from: c */
    public void m41754c(long j) {
        m41761a("lastUpdateTimestamp", j);
    }

    /* renamed from: d */
    public void m41750d(String str) {
        m41760a("appVersion", str);
    }

    /* renamed from: a */
    public void m41764a(long j) {
        m41761a("appGalleryTrackedTime", j);
    }

    /* renamed from: a */
    void m41761a(String str, long j) {
        try {
            this.f68829a.edit().putLong(str, j).commit();
        } catch (Throwable th) {
            C26468z0.m41527a("PrefsCache error: ", th);
        }
    }

    /* renamed from: a */
    void m41760a(String str, String str2) {
        try {
            this.f68829a.edit().putString(str, str2).commit();
        } catch (Throwable th) {
            C26468z0.m41527a("PrefsCache error: ", th);
        }
    }

    /* renamed from: a */
    void m41759a(String str, boolean z) {
        try {
            this.f68829a.edit().putBoolean(str, z).commit();
        } catch (Throwable th) {
            C26468z0.m41527a("PrefsCache error: ", th);
        }
    }

    /* renamed from: a */
    boolean m41762a(String str) {
        try {
            return this.f68829a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
