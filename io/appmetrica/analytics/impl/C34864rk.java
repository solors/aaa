package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.rk */
/* loaded from: classes9.dex */
public final class C34864rk implements InterfaceC34840qm {

    /* renamed from: d */
    public static final long f95300d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a */
    public final Context f95301a;

    /* renamed from: b */
    public final PermissionExtractor f95302b;

    /* renamed from: c */
    public final CachedDataProvider.CachedData f95303c;

    public C34864rk(Context context) {
        long j = f95300d;
        this.f95303c = new CachedDataProvider.CachedData(j, j, "sim-info");
        this.f95301a = context;
        this.f95302b = C34693la.m21444h().m21445g();
    }

    /* renamed from: b */
    public final C34730mk m21005b() {
        return new C34730mk((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f95301a, "phone", "getting SimMcc", "TelephonyManager", new C34757nk()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f95301a, "phone", "getting SimMnc", "TelephonyManager", new C34784ok()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f95301a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C34838qk(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f95301a, "phone", "getting SimOperatorName", "TelephonyManager", new C34811pk()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r4.f95303c.shouldUpdateData() != false) goto L12;
     */
    @Override // io.appmetrica.analytics.impl.InterfaceC34840qm
    @androidx.annotation.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<io.appmetrica.analytics.impl.C34730mk> mo20781a() {
        /*
            r4 = this;
            monitor-enter(r4)
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r0 = r4.f95303c     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r0.getData()     // Catch: java.lang.Throwable -> L65
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L19
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L63
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r1 = r4.f95303c     // Catch: java.lang.Throwable -> L65
            boolean r1 = r1.shouldUpdateData()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L63
        L19:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L65
            r0.<init>()     // Catch: java.lang.Throwable -> L65
            io.appmetrica.analytics.impl.la r1 = io.appmetrica.analytics.impl.C34693la.f94825C     // Catch: java.lang.Throwable -> L65
            io.appmetrica.analytics.impl.ll r1 = r1.f94848u     // Catch: java.lang.Throwable -> L65
            io.appmetrica.analytics.impl.jl r1 = r1.m21409a()     // Catch: java.lang.Throwable -> L65
            io.appmetrica.analytics.impl.A4 r1 = r1.f94734n     // Catch: java.lang.Throwable -> L65
            boolean r1 = r1.f92558d     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L5e
            r1 = 23
            boolean r1 = io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(r1)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L57
            io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor r1 = r4.f95302b     // Catch: java.lang.Throwable -> L65
            android.content.Context r2 = r4.f95301a     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            boolean r1 = r1.hasPermission(r2, r3)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L49
            android.content.Context r1 = r4.f95301a     // Catch: java.lang.Throwable -> L65
            java.util.List r1 = io.appmetrica.analytics.impl.C34890sk.m20971a(r1)     // Catch: java.lang.Throwable -> L65
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L65
        L49:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L5e
            io.appmetrica.analytics.impl.mk r1 = r4.m21005b()     // Catch: java.lang.Throwable -> L65
            r0.add(r1)     // Catch: java.lang.Throwable -> L65
            goto L5e
        L57:
            io.appmetrica.analytics.impl.mk r1 = r4.m21005b()     // Catch: java.lang.Throwable -> L65
            r0.add(r1)     // Catch: java.lang.Throwable -> L65
        L5e:
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r1 = r4.f95303c     // Catch: java.lang.Throwable -> L65
            r1.setData(r0)     // Catch: java.lang.Throwable -> L65
        L63:
            monitor-exit(r4)
            return r0
        L65:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34864rk.mo20781a():java.util.List");
    }
}
