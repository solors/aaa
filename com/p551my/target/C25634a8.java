package com.p551my.target;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.C19577ad;

/* renamed from: com.my.target.a8 */
/* loaded from: classes7.dex */
public class C25634a8 {

    /* renamed from: b */
    public static volatile C25634a8 f66608b;

    /* renamed from: a */
    public final SharedPreferences f66609a;

    public C25634a8(SharedPreferences sharedPreferences) {
        this.f66609a = sharedPreferences;
    }

    /* renamed from: a */
    public String m44226a() {
        return m44218b(C19577ad.f49143u0);
    }

    /* renamed from: b */
    public int m44220b() {
        return m44223a("asis");
    }

    /* renamed from: c */
    public int m44217c() {
        return m44223a("sdk_flags");
    }

    /* renamed from: d */
    public String m44215d() {
        return m44218b("hlimit");
    }

    /* renamed from: e */
    public String m44213e() {
        return m44218b("hoaid");
    }

    /* renamed from: f */
    public String m44211f() {
        return m44218b("hosts");
    }

    /* renamed from: g */
    public String m44209g() {
        return m44218b("instanceId");
    }

    /* renamed from: a */
    public static C25634a8 m44224a(Context context) {
        C25634a8 c25634a8 = f66608b;
        if (c25634a8 == null) {
            synchronized (C25634a8.class) {
                c25634a8 = f66608b;
                if (c25634a8 == null) {
                    f66608b = new C25634a8(context.getSharedPreferences("mytarget_prefs", 0));
                    c25634a8 = f66608b;
                }
            }
        }
        return c25634a8;
    }

    /* renamed from: b */
    public final String m44218b(String str) {
        try {
            String string = this.f66609a.getString(str, null);
            return string != null ? string : "";
        } catch (Throwable th) {
            AbstractC25846ja.m43676c("PrefsCache exception - " + th);
            return "";
        }
    }

    /* renamed from: c */
    public void m44216c(String str) {
        m44221a(C19577ad.f49143u0, str);
    }

    /* renamed from: d */
    public void m44214d(String str) {
        m44221a("hoaid", str);
    }

    /* renamed from: e */
    public void m44212e(String str) {
        m44221a("hlimit", str);
    }

    /* renamed from: f */
    public void m44210f(String str) {
        m44221a("hosts", str);
    }

    /* renamed from: g */
    public void m44208g(String str) {
        m44221a("instanceId", str);
    }

    /* renamed from: a */
    public final int m44223a(String str) {
        try {
            return this.f66609a.getInt(str, -1);
        } catch (Throwable th) {
            AbstractC25846ja.m43676c("PrefsCache exception - " + th);
            return 0;
        }
    }

    /* renamed from: b */
    public void m44219b(int i) {
        m44222a("sdk_flags", i);
    }

    /* renamed from: a */
    public final void m44222a(String str, int i) {
        try {
            SharedPreferences.Editor edit = this.f66609a.edit();
            edit.putInt(str, i);
            edit.commit();
        } catch (Throwable th) {
            AbstractC25846ja.m43676c("PrefsCache exception - " + th);
        }
    }

    /* renamed from: a */
    public final void m44221a(String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.f66609a.edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Throwable th) {
            AbstractC25846ja.m43676c("PrefsCache exception - " + th);
        }
    }

    /* renamed from: a */
    public void m44225a(int i) {
        m44222a("asis", i);
    }
}
