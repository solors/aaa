package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.AbstractC5947z3;
import com.applovin.impl.C5118pc;
import com.applovin.impl.C5517sj;
import com.ironsource.C21114v8;

/* renamed from: com.applovin.impl.sdk.n */
/* loaded from: classes2.dex */
public class C5434n {

    /* renamed from: b */
    private static boolean f10065b;

    /* renamed from: a */
    private final C5416j f10066a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5434n(C5416j c5416j) {
        this.f10066a = c5416j;
        m94912a("SDK Session Begin");
    }

    /* renamed from: a */
    public static void m94908a(boolean z) {
        f10065b = z;
    }

    /* renamed from: c */
    public static void m94904c(String str, String str2, Throwable th) {
        if (!f10065b || m94914a()) {
            Log.e("AppLovinSdk", C21114v8.C21123i.f54137d + str + "] " + str2, th);
        }
    }

    /* renamed from: e */
    public static void m94901e(String str, String str2) {
        m94899g(str, str2);
    }

    /* renamed from: g */
    public static void m94899g(String str, String str2) {
        if (f10065b && !m94914a()) {
            return;
        }
        Log.d("AppLovinSdk", C21114v8.C21123i.f54137d + str + "] " + str2);
    }

    /* renamed from: h */
    public static void m94898h(String str, String str2) {
        m94904c(str, str2, null);
    }

    /* renamed from: i */
    public static void m94897i(String str, String str2) {
        if (f10065b && !m94914a()) {
            return;
        }
        Log.i("AppLovinSdk", C21114v8.C21123i.f54137d + str + "] " + str2);
    }

    /* renamed from: j */
    public static void m94896j(String str, String str2) {
        if (f10065b && !m94914a()) {
            return;
        }
        Log.w("AppLovinSdk", C21114v8.C21123i.f54137d + str + "] " + str2);
    }

    /* renamed from: l */
    public static void m94894l(String str, String str2) {
        C5416j c5416j = C5416j.f9935u0;
        if (c5416j == null) {
            return;
        }
        c5416j.m95186I();
        if (m94914a()) {
            C5416j.f9935u0.m95186I().m94895k(str, str2);
        }
    }

    /* renamed from: b */
    public void m94907b(String str, String str2) {
        m94910a(str, str2, null);
    }

    /* renamed from: d */
    public void m94903d(String str, String str2) {
        Log.i("AppLovinSdk", C21114v8.C21123i.f54137d + str + "] " + str2);
    }

    /* renamed from: f */
    public void m94900f(String str, String str2) {
        int intValue;
        if (m94913a(this.f10066a) && !TextUtils.isEmpty(str2) && (intValue = ((Integer) this.f10066a.m95144a(C5517sj.f10695t)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + intValue) - 1) / intValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * intValue;
                m94911a(str, str2.substring(i3, Math.min(length, i3 + intValue)));
            }
        }
    }

    /* renamed from: k */
    public void m94895k(String str, String str2) {
        m94902d(str, str2, null);
    }

    /* renamed from: a */
    private void m94912a(String str) {
        C5118pc c5118pc = new C5118pc();
        c5118pc.m96571a().m96565a(str).m96571a();
        m94899g("AppLovinSdk", c5118pc.toString());
    }

    /* renamed from: b */
    public static void m94906b(String str, String str2, Throwable th) {
        C5416j c5416j = C5416j.f9935u0;
        if (c5416j == null) {
            return;
        }
        c5416j.m95186I();
        if (m94914a()) {
            C5416j.f9935u0.m95186I().m94910a(str, str2, th);
        }
    }

    /* renamed from: d */
    public void m94902d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", C21114v8.C21123i.f54137d + str + "] " + str2, th);
    }

    /* renamed from: c */
    public static void m94905c(String str, String str2) {
        m94906b(str, str2, null);
    }

    /* renamed from: a */
    public void m94909a(String str, Throwable th) {
        if (AbstractC5947z3.m92537e()) {
            for (Throwable th2 : th.getSuppressed()) {
                m94907b(str, th2.toString());
            }
        }
    }

    /* renamed from: a */
    public void m94911a(String str, String str2) {
        Log.d("AppLovinSdk", C21114v8.C21123i.f54137d + str + "] " + str2);
    }

    /* renamed from: a */
    public void m94910a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", C21114v8.C21123i.f54137d + str + "] " + str2, th);
    }

    /* renamed from: a */
    public static boolean m94914a() {
        return m94913a(C5416j.f9935u0);
    }

    /* renamed from: a */
    public static boolean m94913a(C5416j c5416j) {
        return c5416j != null && c5416j.m95089g0().m94434c();
    }
}
