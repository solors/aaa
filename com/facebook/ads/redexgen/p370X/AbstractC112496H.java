package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.6H */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC112496H {
    public static byte[] A00;
    public static String[] A01 = {"T8", "", "As3hIStO2xNa0GSSHrkEVjQu", "DXoFAMJTZKDaTyX0if7pZrkyLA7XvGsC", "niDMG5wZxQy0H8acRFWa8hH2XuraMrTN", "878XRXnWNCNw6FCwqGtfz4QO6Hd03tfb", "ID5FT62NpqbpmPra08cWCCHJVsi2pDHC", "txdj"};
    public static final AtomicReference<C112476F> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[7].length() != 4) {
                throw new RuntimeException();
            }
            A01[6] = "PcSdqCtN9qYKSfDsPVWrfTZjyuiu0dLa";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
            i4++;
        }
    }

    public static void A05() {
        A00 = new byte[]{19, 27, 22, 17, 33, 40, 23, 36, 36, 27, 22, 23, 17, 15, 24, 15, 28, 19, 13, 43, 38, 40, 35, 33, 49, 56, 39, 52, 52, 43, 38, 39};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 12));
    }

    public static C112476F A00() {
        C112476F advertisingIdInfo = A02.get();
        if (advertisingIdInfo == null) {
            return C112476F.A00();
        }
        return advertisingIdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x000a, code lost:
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.p370X.C112476F A01(com.facebook.ads.redexgen.p370X.C113257j r5, com.facebook.ads.redexgen.p370X.C112476F r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L29
        Lc:
            com.facebook.ads.redexgen.X.6F r0 = com.facebook.ads.redexgen.p370X.AbstractC112546N.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.8D r5 = r5.A07()
            int r4 = com.facebook.ads.redexgen.p370X.AbstractC113568E.A1Q
            com.facebook.ads.redexgen.X.8F r3 = new com.facebook.ads.redexgen.X.8F
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 84
            java.lang.String r0 = A04(r2, r1, r0)
            r5.AA0(r0, r4, r3)
        L29:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.AbstractC112496H.A01(com.facebook.ads.redexgen.X.7j, com.facebook.ads.redexgen.X.6F):com.facebook.ads.redexgen.X.6F");
    }

    public static C112476F A02(C113257j c113257j, C112476F c112476f, C112486G c112486g) {
        C112506I c112506i = null;
        try {
            if (AbstractC11978Il.A06(c113257j) && (c112476f == null || TextUtils.isEmpty(c112476f.A03()))) {
                c112506i = AbstractC112516J.A00(c113257j.getContentResolver());
            }
        } catch (Throwable th) {
            c113257j.A07().AA0(A04(12, 7, 84), AbstractC113568E.A1S, new C113578F(th));
        }
        if (c112506i != null && c112506i.A01 != null) {
            A03.set(c112506i.A01);
            c112486g.A05(c112506i.A01);
        }
        if (c112476f == null && c112506i != null && !TextUtils.isEmpty(c112506i.A00)) {
            return new C112476F(c112506i.A00, c112506i.A02, EnumC112466E.A04);
        }
        return c112476f;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 12);
        }
        return attributionId;
    }

    public static void A06(C112486G c112486g) {
        A02.set(c112486g.A02());
        A03.set(c112486g.A03());
    }

    public static void A07(C113257j c113257j) {
        long j;
        C112476F advertisingIdInfo;
        try {
            C112486G c112486g = new C112486G(c113257j);
            A06(c112486g);
            if (A08()) {
                return;
            }
            C112476F advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                j = advertisingIdInfo2.A01();
            } else {
                j = -1;
            }
            if (j > 0 && System.currentTimeMillis() - j < AbstractC11978Il.A00(c113257j)) {
                return;
            }
            if (AbstractC11978Il.A07(c113257j)) {
                advertisingIdInfo = A01(c113257j, A02(c113257j, null, c112486g));
            } else {
                advertisingIdInfo = A02(c113257j, A01(c113257j, null), c112486g);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                c112486g.A04(advertisingIdInfo);
            }
        } catch (Throwable t) {
            c113257j.A07().AA0(A04(12, 7, 84), AbstractC113568E.A1R, new C113578F(t));
        }
    }

    public static boolean A08() {
        boolean z = false;
        boolean updated = C12119L7.A04();
        if (updated) {
            String A04 = A04(0, 12, 92);
            boolean updated2 = C12119L7.A05(A04);
            if (updated2) {
                A03.set(C12119L7.A01(A04));
                z = true;
            }
        }
        boolean A042 = C12119L7.A04();
        if (A01[7].length() != 4) {
            throw new RuntimeException();
        }
        A01[6] = "Cpq5b7Aomj18wFHDN8BPNJlk9AiHAVMm";
        if (A042) {
            String A043 = A04(19, 13, 108);
            boolean updated3 = C12119L7.A05(A043);
            if (updated3) {
                String A012 = C12119L7.A01(A043);
                AtomicReference<C112476F> atomicReference = A02;
                if (A012 == null) {
                    if (A01[7].length() != 4) {
                        A01[7] = "Ywke";
                        A012 = A04(0, 0, 2);
                    } else {
                        A01[5] = "aB8iQRCNNWTx0AWcZvgXlT81SikGsrWB";
                        A012 = A04(0, 0, 12);
                    }
                }
                atomicReference.set(new C112476F(A012, false, EnumC112466E.A03));
                return true;
            }
            return z;
        }
        return z;
    }
}
