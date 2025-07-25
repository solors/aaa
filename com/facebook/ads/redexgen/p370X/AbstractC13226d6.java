package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.d6 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC13226d6 {
    public static byte[] A00;
    public static final C13225d5 A01;
    public static final InterfaceC11901HS[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{79, 75, 80, 72, 77, 74, 10, 86, 65, 66, 72, 65, 71, 80, 10, 78, 82, 73, 10, 77, 74, 80, 65, 86, 74, 69, 72, 10, 118, 65, 66, 72, 65, 71, 80, 77, 75, 74, 98, 69, 71, 80, 75, 86, 93, 109, 73, 84, 72};
    }

    static {
        C13225d5 impl;
        try {
            A02();
            Class<?> implClass = Class.forName(A00(0, 49, 40));
            impl = (C13225d5) implClass.newInstance();
        } catch (ClassCastException unused) {
            impl = null;
        } catch (ClassNotFoundException unused2) {
            impl = null;
        } catch (IllegalAccessException unused3) {
            impl = null;
        } catch (InstantiationException unused4) {
            impl = null;
        }
        if (impl == null) {
            impl = new C13225d5();
        }
        A01 = impl;
        A02 = new InterfaceC11901HS[0];
    }

    public static String A01(AbstractC112836r abstractC112836r) {
        return A01.A03(abstractC112836r);
    }
}
