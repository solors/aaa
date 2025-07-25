package com.taurusx.tax.p583c.p590f;

import android.content.Context;
import android.content.SharedPreferences;
import com.taurusx.tax.C28162a;

/* renamed from: com.taurusx.tax.c.f.c */
/* loaded from: classes7.dex */
public class C28294c {

    /* renamed from: c */
    public static C28294c f73502c;

    /* renamed from: a */
    public Context f73503a;

    /* renamed from: b */
    public SharedPreferences f73504b;

    /* renamed from: a */
    public static C28294c m38285a() {
        if (f73502c == null) {
            synchronized (C28294c.class) {
                if (f73502c == null) {
                    f73502c = new C28294c();
                }
            }
        }
        return f73502c;
    }

    /* renamed from: b */
    public final SharedPreferences m38282b() {
        Context context;
        if (this.f73504b == null && (context = this.f73503a) != null) {
            this.f73504b = context.getApplicationContext().getSharedPreferences(C28162a.f73047a.m23824a(new byte[]{31, 15, 15, 15, 36, 8, 23, 23, 30, 28}, new byte[]{123, 110}), 0);
        }
        return this.f73504b;
    }

    /* renamed from: a */
    public void m38284a(Context context) {
        this.f73503a = context.getApplicationContext();
        m38282b();
    }

    /* renamed from: a */
    public long m38283a(String str) {
        try {
            if (m38282b().contains(str)) {
                return m38282b().getLong(str, 0L);
            }
            return 0L;
        } catch (Error | Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }
}
