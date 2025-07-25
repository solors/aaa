package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a82 {
    @NotNull

    /* renamed from: a */
    private final Context f76739a;

    public a82(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f76739a = applicationContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0017, code lost:
        if (r0.m26763d0() != false) goto L5;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map m35937a(@org.jetbrains.annotations.NotNull java.util.LinkedHashMap r3, @org.jetbrains.annotations.Nullable com.yandex.mobile.ads.impl.fc2 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "rawEvents"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = com.yandex.mobile.ads.impl.as1.f76895l
            com.yandex.mobile.ads.impl.as1 r0 = com.yandex.mobile.ads.impl.as1.C29962a.m35776a()
            android.content.Context r1 = r2.f76739a
            com.yandex.mobile.ads.impl.yp1 r0 = r0.m35796a(r1)
            if (r0 == 0) goto L1a
            boolean r0 = r0.m26763d0()
            if (r0 == 0) goto L1a
            goto L42
        L1a:
            java.util.Map r3 = kotlin.collections.C37554o0.m17377D(r3)
            if (r4 == 0) goto L25
            java.util.List r4 = r4.m34177a()
            goto L26
        L25:
            r4 = 0
        L26:
            java.lang.String r0 = "impression"
            java.lang.Object r1 = r3.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r4 == 0) goto L34
            r3.put(r0, r4)
            goto L37
        L34:
            r3.remove(r0)
        L37:
            java.lang.String r4 = "render_impression"
            if (r1 == 0) goto L3f
            r3.put(r4, r1)
            goto L42
        L3f:
            r3.remove(r4)
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.a82.m35937a(java.util.LinkedHashMap, com.yandex.mobile.ads.impl.fc2):java.util.Map");
    }
}
