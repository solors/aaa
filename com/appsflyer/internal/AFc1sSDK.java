package com.appsflyer.internal;

/* loaded from: classes2.dex */
public final class AFc1sSDK {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        r2 = kotlin.text.StringNumberConversions.m16640m(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
        r4 = kotlin.text.StringNumberConversions.m16640m(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        r0 = kotlin.text.StringNumberConversions.m16640m(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int AFInAppEventParameterName(@org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "(\\d+).(\\d+).(\\d+).*"
            r0.<init>(r1)
            kotlin.text.MatchResult r4 = r0.m16767d(r4)
            if (r4 == 0) goto L71
            kotlin.text.c r0 = r4.mo16749b()
            r1 = 1
            kotlin.text.MatchGroup r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L2f
            java.lang.String r0 = r0.m16773a()
            if (r0 == 0) goto L2f
            java.lang.Integer r0 = kotlin.text.C37686h.m16673m(r0)
            if (r0 == 0) goto L2f
            int r0 = r0.intValue()
            goto L30
        L2f:
            r0 = r1
        L30:
            r2 = 1000000(0xf4240, float:1.401298E-39)
            int r0 = r0 * r2
            kotlin.text.c r2 = r4.mo16749b()
            r3 = 2
            kotlin.text.MatchGroup r2 = r2.get(r3)
            if (r2 == 0) goto L50
            java.lang.String r2 = r2.m16773a()
            if (r2 == 0) goto L50
            java.lang.Integer r2 = kotlin.text.C37686h.m16673m(r2)
            if (r2 == 0) goto L50
            int r2 = r2.intValue()
            goto L51
        L50:
            r2 = r1
        L51:
            int r2 = r2 * 1000
            int r0 = r0 + r2
            kotlin.text.c r4 = r4.mo16749b()
            r2 = 3
            kotlin.text.MatchGroup r4 = r4.get(r2)
            if (r4 == 0) goto L6f
            java.lang.String r4 = r4.m16773a()
            if (r4 == 0) goto L6f
            java.lang.Integer r4 = kotlin.text.C37686h.m16673m(r4)
            if (r4 == 0) goto L6f
            int r1 = r4.intValue()
        L6f:
            int r0 = r0 + r1
            return r0
        L71:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1sSDK.AFInAppEventParameterName(java.lang.String):int");
    }
}
