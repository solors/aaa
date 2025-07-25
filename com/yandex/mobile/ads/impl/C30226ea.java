package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ea */
/* loaded from: classes8.dex */
public final class C30226ea {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r1 == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r3 <= r1) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m34645a(@org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.qu1 r8, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.qu1 r9) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r1 = "sizeInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r2 = "containerSizeInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            int r0 = r9.mo29651c(r7)
            int r1 = r9.mo29653a(r7)
            int r2 = r8.mo29651c(r7)
            int r3 = r8.mo29653a(r7)
            com.yandex.mobile.ads.impl.qu1$a r9 = r9.mo29654a()
            int r9 = r9.ordinal()
            r4 = 0
            r5 = 1
            if (r9 == 0) goto L4c
            if (r9 == r5) goto L43
            r6 = 2
            if (r9 == r6) goto L52
            r6 = 3
            if (r9 != r6) goto L3d
            goto L43
        L3d:
            nd.o r7 = new nd.o
            r7.<init>()
            throw r7
        L43:
            if (r2 > r0) goto L54
            if (r0 <= 0) goto L54
            if (r3 <= r1) goto L52
            if (r1 != 0) goto L54
            goto L52
        L4c:
            if (r2 > r0) goto L54
            if (r0 <= 0) goto L54
            if (r3 > r1) goto L54
        L52:
            r9 = r5
            goto L55
        L54:
            r9 = r4
        L55:
            boolean r7 = m34644b(r7, r8)
            if (r9 == 0) goto L5e
            if (r7 == 0) goto L5e
            r4 = r5
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C30226ea.m34645a(android.content.Context, com.yandex.mobile.ads.impl.qu1, com.yandex.mobile.ads.impl.qu1):boolean");
    }

    /* renamed from: b */
    public static final boolean m34644b(@NotNull Context context, @NotNull qu1 adSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        int m35252c = cc2.m35252c(context);
        int m35254b = cc2.m35254b(context);
        int mo29651c = adSize.mo29651c(context);
        int mo29653a = adSize.mo29653a(context);
        if (mo29651c <= m35252c && mo29653a <= m35254b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m34646a(@NotNull Context context, @NotNull qu1 adSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return adSize.mo29651c(context) <= cc2.m35254b(context) && adSize.mo29653a(context) <= cc2.m35252c(context);
    }
}
