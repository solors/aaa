package com.taurusx.tax.p597g.p598a;

import android.util.Log;

/* renamed from: com.taurusx.tax.g.a.b */
/* loaded from: classes7.dex */
public class C28392b {

    /* renamed from: a */
    public String f73774a;

    public C28392b(String str) {
        this.f73774a = str;
    }

    /* renamed from: a */
    public void m38146a(String str) {
        m38148a(3, str, (Throwable) null);
    }

    /* renamed from: b */
    public void m38144b(String str) {
        m38148a(4, str, (Throwable) null);
    }

    /* renamed from: c */
    public void m38143c(String str) {
        m38148a(5, str, (Throwable) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38147a(int r10, java.lang.String r11, java.lang.Object... r12) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p597g.p598a.C28392b.m38147a(int, java.lang.String, java.lang.Object[]):void");
    }

    /* renamed from: b */
    public final void m38145b(int i, String str, Throwable th) {
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        Log.println(i, this.f73774a, str);
    }

    /* renamed from: a */
    public final void m38148a(int i, String str, Throwable th) {
        if (Log.isLoggable(this.f73774a, i)) {
            m38145b(i, str, th);
        }
    }
}
