package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.identifiers.impl.f */
/* loaded from: classes9.dex */
public final class C33739f {

    /* renamed from: a */
    public final ServiceConnectionC33738e f92527a;

    /* renamed from: b */
    public final Function1 f92528b;

    /* renamed from: c */
    public final String f92529c;

    /* renamed from: d */
    public final SafePackageManager f92530d;

    public C33739f(ServiceConnectionC33738e serviceConnectionC33738e, Function1 function1, String str, SafePackageManager safePackageManager) {
        this.f92527a = serviceConnectionC33738e;
        this.f92528b = function1;
        this.f92529c = str;
        this.f92530d = safePackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m22796a(android.content.Context r5) {
        /*
            r4 = this;
            io.appmetrica.analytics.identifiers.impl.e r0 = r4.f92527a
            android.content.Intent r0 = r0.f92524a
            io.appmetrica.analytics.coreutils.internal.services.SafePackageManager r1 = r4.f92530d
            r2 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r5, r0, r2)
            if (r0 == 0) goto L59
            io.appmetrica.analytics.identifiers.impl.e r0 = r4.f92527a     // Catch: java.lang.Throwable -> L34
            android.content.Intent r1 = r0.f92524a     // Catch: java.lang.Throwable -> L34
            r2 = 1
            boolean r5 = r5.bindService(r1, r0, r2)     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L34
            io.appmetrica.analytics.identifiers.impl.e r5 = r4.f92527a     // Catch: java.lang.Throwable -> L34
            android.os.IBinder r0 = r5.f92525b     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L31
            java.lang.Object r0 = r5.f92526c     // Catch: java.lang.Throwable -> L34
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L34
            android.os.IBinder r1 = r5.f92525b     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L2c
            java.lang.Object r1 = r5.f92526c     // Catch: java.lang.InterruptedException -> L2c java.lang.Throwable -> L2e
            r2 = 3000(0xbb8, double:1.482E-320)
            r1.wait(r2)     // Catch: java.lang.InterruptedException -> L2c java.lang.Throwable -> L2e
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r5     // Catch: java.lang.Throwable -> L34
        L31:
            android.os.IBinder r5 = r5.f92525b     // Catch: java.lang.Throwable -> L34
            goto L35
        L34:
            r5 = 0
        L35:
            if (r5 == 0) goto L3e
            kotlin.jvm.functions.Function1 r0 = r4.f92528b
            java.lang.Object r5 = r0.invoke(r5)
            return r5
        L3e:
            io.appmetrica.analytics.identifiers.impl.g r5 = new io.appmetrica.analytics.identifiers.impl.g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "could not bind to "
            r0.<init>(r1)
            java.lang.String r1 = r4.f92529c
            r0.append(r1)
            java.lang.String r1 = " services"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L59:
            io.appmetrica.analytics.identifiers.impl.l r5 = new io.appmetrica.analytics.identifiers.impl.l
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "could not resolve "
            r0.<init>(r1)
            java.lang.String r1 = r4.f92529c
            r0.append(r1)
            java.lang.String r1 = " services"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.identifiers.impl.C33739f.m22796a(android.content.Context):java.lang.Object");
    }

    /* renamed from: b */
    public final void m22795b(Context context) {
        try {
            this.f92527a.m22797a(context);
        } catch (Throwable unused) {
        }
    }

    public C33739f(Intent intent, Function1 function1, String str) {
        this(new ServiceConnectionC33738e(intent, str), function1, str, new SafePackageManager());
    }
}
