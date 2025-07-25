package io.appmetrica.analytics.logger.common.impl;

import java.util.regex.Pattern;

/* renamed from: io.appmetrica.analytics.logger.common.impl.e */
/* loaded from: classes9.dex */
public final class C35110e {

    /* renamed from: a */
    public final Pattern f95790a = Pattern.compile("[\\p{Space},;]");

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r3 == (-1)) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r3 == (-1)) goto L7;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m20664a(java.util.regex.Matcher r3, int r4, int r5) {
        /*
            r0 = -1
            if (r5 < r4) goto L37
            int r1 = r5 - r4
            int r1 = r1 / 2
            int r1 = r1 + r4
            r3.region(r1, r5)
            boolean r2 = r3.find()
            if (r2 == 0) goto L21
            int r4 = r3.start()
            int r1 = r4 + 1
            int r3 = m20664a(r3, r1, r5)
            if (r3 != r0) goto L1f
        L1d:
            r0 = r4
            goto L37
        L1f:
            r0 = r3
            goto L37
        L21:
            r3.region(r4, r1)
            boolean r4 = r3.find()
            if (r4 == 0) goto L37
            int r4 = r3.start()
            int r5 = r4 + 1
            int r3 = m20664a(r3, r5, r1)
            if (r3 != r0) goto L1f
            goto L1d
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.logger.common.impl.C35110e.m20664a(java.util.regex.Matcher, int, int):int");
    }
}
