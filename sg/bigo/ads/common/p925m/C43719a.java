package sg.bigo.ads.common.p925m;

/* renamed from: sg.bigo.ads.common.m.a */
/* loaded from: classes10.dex */
public final class C43719a {

    /* renamed from: a */
    private static final int[] f114420a = {1, 3, 4, 2, 7, 9, 10};

    /* renamed from: b */
    private static final int[] f114421b = {2, 7, 9, 10};

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m5141a() {
        /*
            boolean r0 = m5140b()
            r1 = 1
            if (r0 == 0) goto L8d
            java.lang.String r0 = sg.bigo.ads.common.p925m.C43720b.m5136b()
            boolean r2 = sg.bigo.ads.common.utils.C43836q.m4837a(r0)
            r3 = 48
            r4 = 11
            r5 = 3
            java.lang.String r6 = "GdprHelper"
            r7 = 0
            if (r2 == 0) goto L20
            java.lang.String r0 = "purposeConsents is empty, so return true"
            sg.bigo.ads.common.p932t.C43782a.m5010a(r7, r5, r6, r0)
        L1e:
            r0 = r1
            goto L4b
        L20:
            int r2 = r0.length()
            if (r2 >= r4) goto L2d
            java.lang.String r0 = "purposeConsents length < 11, so return false"
        L28:
            sg.bigo.ads.common.p932t.C43782a.m5010a(r7, r5, r6, r0)
            r0 = r7
            goto L4b
        L2d:
            int[] r2 = sg.bigo.ads.common.p925m.C43719a.f114420a
            int r8 = r2.length
            r9 = r7
        L31:
            if (r9 >= r8) goto L1e
            r10 = r2[r9]
            int r11 = r10 + (-1)
            char r11 = r0.charAt(r11)
            if (r11 != r3) goto L48
            java.lang.String r0 = "purposeConsents return false ,the checkBit is: "
            java.lang.String r2 = java.lang.String.valueOf(r10)
            java.lang.String r0 = r0.concat(r2)
            goto L28
        L48:
            int r9 = r9 + 1
            goto L31
        L4b:
            if (r0 == 0) goto L8c
            java.lang.String r0 = sg.bigo.ads.common.p925m.C43720b.m5132d()
            boolean r2 = sg.bigo.ads.common.utils.C43836q.m4837a(r0)
            if (r2 == 0) goto L5e
            java.lang.String r0 = "purposeLegitimateInterests is empty, so return true"
            sg.bigo.ads.common.p932t.C43782a.m5010a(r7, r5, r6, r0)
        L5c:
            r0 = r1
            goto L89
        L5e:
            int r2 = r0.length()
            if (r2 >= r4) goto L6b
            java.lang.String r0 = "purposeLegitimateInterests length < 11, so return false"
        L66:
            sg.bigo.ads.common.p932t.C43782a.m5010a(r7, r5, r6, r0)
            r0 = r7
            goto L89
        L6b:
            int[] r2 = sg.bigo.ads.common.p925m.C43719a.f114421b
            int r4 = r2.length
            r8 = r7
        L6f:
            if (r8 >= r4) goto L5c
            r9 = r2[r8]
            int r10 = r9 + (-1)
            char r10 = r0.charAt(r10)
            if (r10 != r3) goto L86
            java.lang.String r0 = "purposeLegitimateInterests return false ,the checkBit is: "
            java.lang.String r2 = java.lang.String.valueOf(r9)
            java.lang.String r0 = r0.concat(r2)
            goto L66
        L86:
            int r8 = r8 + 1
            goto L6f
        L89:
            if (r0 == 0) goto L8c
            return r1
        L8c:
            return r7
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.p925m.C43719a.m5141a():boolean");
    }

    /* renamed from: b */
    public static boolean m5140b() {
        if (C43720b.m5134c() == 1) {
            return true;
        }
        return false;
    }
}
