package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.Vb */
/* loaded from: classes9.dex */
public final class C34277Vb {

    /* renamed from: a */
    public volatile String f93599a;

    /* renamed from: a */
    public static String m22158a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: b */
    public final String m22156b() {
        if (this.f93599a != null) {
            return this.f93599a;
        }
        synchronized (this) {
            if (this.f93599a == null) {
                this.f93599a = m22158a();
            }
        }
        return this.f93599a;
    }

    /* renamed from: c */
    public final boolean m22155c() {
        try {
            if (TextUtils.isEmpty(m22156b())) {
                return false;
            }
            if (m22156b().contains(":")) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m22157a(@NonNull String str) {
        try {
            if (TextUtils.isEmpty(m22156b())) {
                return false;
            }
            String m22156b = m22156b();
            StringBuilder sb2 = new StringBuilder(":");
            sb2.append(str);
            return m22156b.endsWith(sb2.toString());
        } catch (Throwable unused) {
            return false;
        }
    }
}
