package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.LocationManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class fo0 implements aq0 {
    @NotNull

    /* renamed from: a */
    private final cq0 f79191a;
    @Nullable

    /* renamed from: b */
    private final LocationManager f79192b;
    @NotNull

    /* renamed from: c */
    private final cz1 f79193c;

    public fo0(@NotNull Context context, @NotNull cq0 locationSelector) {
        LocationManager locationManager;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationSelector, "locationSelector");
        this.f79191a = locationSelector;
        Object systemService = context.getApplicationContext().getSystemService("location");
        if (systemService instanceof LocationManager) {
            locationManager = (LocationManager) systemService;
        } else {
            locationManager = null;
        }
        this.f79192b = locationManager;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f79193c = new cz1(applicationContext, locationManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.aq0
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.location.Location mo30087a() {
        /*
            r4 = this;
            r0 = 0
            android.location.LocationManager r1 = r4.f79192b     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            java.util.List r1 = r1.getAllProviders()     // Catch: java.lang.Throwable -> Lc
            goto L13
        La:
            r1 = r0
            goto L13
        Lc:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.yandex.mobile.ads.impl.um0.m28726c(r1)
            goto La
        L13:
            if (r1 == 0) goto L3f
            java.util.List r0 = kotlin.collections.C37561t.m17222c()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.yandex.mobile.ads.impl.cz1 r3 = r4.f79193c
            android.location.Location r2 = r3.m35132a(r2)
            if (r2 == 0) goto L1d
            r0.add(r2)
            goto L1d
        L35:
            java.util.List r0 = kotlin.collections.C37561t.m17225a(r0)
            com.yandex.mobile.ads.impl.cq0 r1 = r4.f79191a
            android.location.Location r0 = r1.m35180a(r0)
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fo0.mo30087a():android.location.Location");
    }
}
