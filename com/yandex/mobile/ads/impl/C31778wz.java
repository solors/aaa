package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.wz */
/* loaded from: classes8.dex */
public final class C31778wz {
    @NotNull

    /* renamed from: a */
    private final xo1 f87443a;
    @NotNull

    /* renamed from: b */
    private final gp1 f87444b;

    public /* synthetic */ C31778wz() {
        this(new xo1());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (r8.getCurrentModeType() == 4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
        if (r8.getPackageManager().hasSystemFeature("android.hardware.touchscreen") == false) goto L9;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.EnumC31709vz m27724a(@org.jetbrains.annotations.NotNull android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.content.res.Resources r1 = r8.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            com.yandex.mobile.ads.impl.gp1 r2 = r7.f87444b
            android.graphics.Point r2 = r2.m33804a(r8)
            int r3 = r2.x
            int r2 = r2.y
            float r1 = r1.density
            float r3 = (float) r3
            float r4 = r3 / r1
            float r2 = (float) r2
            float r5 = r2 / r1
            float r4 = kotlin.ranges.C37635g.m16935i(r4, r5)
            r5 = 160(0xa0, float:2.24E-43)
            float r5 = (float) r5
            float r1 = r1 * r5
            float r3 = r3 / r1
            float r2 = r2 / r1
            float r3 = r3 * r3
            float r2 = r2 * r2
            float r2 = r2 + r3
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            r3 = 13
            boolean r3 = com.yandex.mobile.ads.impl.C30155da.m34983a(r3)
            if (r3 == 0) goto L51
            java.lang.String r0 = "uimode"
            java.lang.Object r8 = r8.getSystemService(r0)
            boolean r0 = r8 instanceof android.app.UiModeManager
            if (r0 == 0) goto L46
            android.app.UiModeManager r8 = (android.app.UiModeManager) r8
            goto L47
        L46:
            r8 = 0
        L47:
            if (r8 == 0) goto L7a
            int r8 = r8.getCurrentModeType()
            r0 = 4
            if (r8 != r0) goto L7a
            goto L77
        L51:
            r5 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L7a
            com.yandex.mobile.ads.impl.xo1 r3 = r7.f87443a
            r3.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "name"
            java.lang.String r3 = "android.hardware.touchscreen"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L71
            boolean r8 = r8.hasSystemFeature(r3)     // Catch: java.lang.Throwable -> L71
            if (r8 != 0) goto L7a
            goto L77
        L71:
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            com.yandex.mobile.ads.impl.um0.m28726c(r8)
        L77:
            com.yandex.mobile.ads.impl.vz r8 = com.yandex.mobile.ads.impl.EnumC31709vz.f87043d
            return r8
        L7a:
            r5 = 4619567317775286272(0x401c000000000000, double:7.0)
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 >= 0) goto L8a
            r8 = 1142292480(0x44160000, float:600.0)
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 < 0) goto L87
            goto L8a
        L87:
            com.yandex.mobile.ads.impl.vz r8 = com.yandex.mobile.ads.impl.EnumC31709vz.f87041b
            goto L8c
        L8a:
            com.yandex.mobile.ads.impl.vz r8 = com.yandex.mobile.ads.impl.EnumC31709vz.f87042c
        L8c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31778wz.m27724a(android.content.Context):com.yandex.mobile.ads.impl.vz");
    }

    public C31778wz(@NotNull xo1 safePackageManager) {
        Intrinsics.checkNotNullParameter(safePackageManager, "safePackageManager");
        this.f87443a = safePackageManager;
        this.f87444b = new gp1();
    }
}
