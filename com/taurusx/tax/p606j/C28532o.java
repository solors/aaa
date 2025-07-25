package com.taurusx.tax.p606j;

import android.content.Context;
import android.content.SharedPreferences;
import com.taurusx.tax.C28162a;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.o */
/* loaded from: classes7.dex */
public class C28532o {

    /* renamed from: b */
    public static final String f73981b;

    /* renamed from: c */
    public static C28532o f73982c;

    /* renamed from: a */
    public Object f73983a = new Object();

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        f73981b = stringFogImpl.m23824a(new byte[]{55, -97, 45, -106, 6, -115, 42, -114, 6, -99, 54, -112, 63, -105, 62}, new byte[]{89, -2});
        stringFogImpl.m23824a(new byte[]{-4, 85, -19, 76, -7, 122, -12, 75, -5, 74}, new byte[]{-99, 37});
        stringFogImpl.m23824a(new byte[]{-33, 19, -50, 10, -38}, new byte[]{-66, 99});
        stringFogImpl.m23824a(new byte[]{-10, 9, -28, 51, -12, 2, -5, 3}, new byte[]{-99, 108});
        stringFogImpl.m23824a(new byte[]{28, -4, 9, -24, 51, -30, 13, -3, 24, -47, 15, -31, 2, -24, 5, -23, 51, -4, 9, -1, 51, -6, 5, -29, 9}, new byte[]{108, -114});
        stringFogImpl.m23824a(new byte[]{4, -78, 30, -88, 12, -80, 1, -125, 1, -67, 30, -88, 50, -83, 24, -71, 31, -91, 50, -88, 4, -79, 8}, new byte[]{109, -36});
        stringFogImpl.m23824a(new byte[]{99, -33, 104, -34, 82, -53, 120, -33, Byte.MAX_VALUE, -61, 82, -54, 102, -35, 82, -42, 100, -55, 121}, new byte[]{13, -70});
        stringFogImpl.m23824a(new byte[]{17, -56, 11, -46, 25, -54, 20, -61, 28, -7, 20, -49, 11, -46}, new byte[]{120, -90});
    }

    /* renamed from: a */
    public static C28532o m37993a() {
        if (f73982c == null) {
            synchronized (C28532o.class) {
                if (f73982c == null) {
                    f73982c = new C28532o();
                }
            }
        }
        return f73982c;
    }

    /* renamed from: b */
    public void m37987b(Context context, String str, String str2) {
        try {
            synchronized (this.f73983a) {
                SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(f73981b, 0).edit();
                edit.putString(str, str2);
                edit.commit();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void m37989a(Context context, String str, String str2, String str3) {
        try {
            synchronized (this.f73983a) {
                SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(str, 0).edit();
                edit.putString(str2, str3);
                edit.commit();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public String m37988b(Context context, String str) {
        String string;
        try {
            synchronized (this.f73983a) {
                string = context.getApplicationContext().getSharedPreferences(f73981b, 0).getString(str, "");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public String m37990a(Context context, String str, String str2) {
        String string;
        try {
            synchronized (this.f73983a) {
                string = context.getApplicationContext().getSharedPreferences(str, 0).getString(str2, "");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public void m37991a(Context context, String str, long j) {
        String str2 = f73981b;
        try {
            synchronized (this.f73983a) {
                SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(str2, 0).edit();
                edit.putLong(str, j);
                edit.commit();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public long m37992a(Context context, String str) {
        long j;
        String str2 = f73981b;
        try {
            synchronized (this.f73983a) {
                j = context.getApplicationContext().getSharedPreferences(str2, 0).getLong(str, 0L);
            }
            return j;
        } catch (Exception unused) {
            return 0L;
        }
    }
}
