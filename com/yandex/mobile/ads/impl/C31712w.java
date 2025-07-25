package com.yandex.mobile.ads.impl;

import com.amazon.device.ads.DtbConstants;
import com.google.common.primitives.SignedBytes;

/* renamed from: com.yandex.mobile.ads.impl.w */
/* loaded from: classes8.dex */
public final class C31712w {

    /* renamed from: a */
    private static final int[] f87065a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, DtbConstants.DEFAULT_PLAYER_HEIGHT, 400, 400, 2048};

    /* renamed from: com.yandex.mobile.ads.impl.w$a */
    /* loaded from: classes8.dex */
    public static final class C31713a {

        /* renamed from: a */
        public final int f87066a;

        /* renamed from: b */
        public final int f87067b;

        /* renamed from: c */
        public final int f87068c;

        private C31713a(int i, int i2, int i3) {
            this.f87066a = i;
            this.f87067b = i2;
            this.f87068c = i3;
        }
    }

    /* renamed from: a */
    public static void m28091a(int i, cc1 cc1Var) {
        cc1Var.m35290c(7);
        byte[] m35291c = cc1Var.m35291c();
        m35291c[0] = -84;
        m35291c[1] = SignedBytes.MAX_POWER_OF_TWO;
        m35291c[2] = -1;
        m35291c[3] = -1;
        m35291c[4] = (byte) ((i >> 16) & 255);
        m35291c[5] = (byte) ((i >> 8) & 255);
        m35291c[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
        if (r9 != 8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.C31712w.C31713a m28090a(com.yandex.mobile.ads.impl.bc1 r9) {
        /*
            r0 = 16
            int r1 = r9.m35502b(r0)
            int r0 = r9.m35502b(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.m35502b(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.m35502b(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.m35502b(r1)
            boolean r2 = r9.m35494f()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.m35502b(r2)
            boolean r5 = r9.m35494f()
            if (r5 == 0) goto L47
            int r5 = r9.m35502b(r4)
            if (r5 <= 0) goto L47
            r9.m35497d(r1)
        L47:
            boolean r5 = r9.m35494f()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L55
            r5 = r6
            goto L56
        L55:
            r5 = r7
        L56:
            int r9 = r9.m35502b(r3)
            if (r5 != r7) goto L65
            r7 = 13
            if (r9 != r7) goto L65
            int[] r1 = com.yandex.mobile.ads.impl.C31712w.f87065a
            r9 = r1[r9]
            goto L96
        L65:
            if (r5 != r6) goto L95
            int[] r6 = com.yandex.mobile.ads.impl.C31712w.f87065a
            r7 = 14
            if (r9 >= r7) goto L95
            r6 = r6[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7f
            goto L90
        L7f:
            if (r9 == r4) goto L92
            if (r9 == r8) goto L92
            if (r9 != r7) goto L90
            goto L92
        L86:
            if (r9 == r8) goto L92
            if (r9 != r7) goto L90
            goto L92
        L8b:
            if (r9 == r4) goto L92
            if (r9 != r8) goto L90
            goto L92
        L90:
            r9 = r6
            goto L96
        L92:
            int r9 = r6 + 1
            goto L96
        L95:
            r9 = 0
        L96:
            com.yandex.mobile.ads.impl.w$a r1 = new com.yandex.mobile.ads.impl.w$a
            r2 = 0
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31712w.m28090a(com.yandex.mobile.ads.impl.bc1):com.yandex.mobile.ads.impl.w$a");
    }
}
