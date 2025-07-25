package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4X */
/* loaded from: assets/audience_network.dex */
public final class C111414X {
    public static byte[] A01;
    public final InterfaceC111404W A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private int A00(List<C1111849> list) {
        int size = list.size() - 1;
        if (size >= 0) {
            list.get(size);
            throw new NullPointerException(A01(0, 3, 72));
        }
        return -1;
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{61, 51, 58};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A03(List<C1111849> list, int i, int i2) {
        list.get(i);
        list.get(i2);
        throw new NullPointerException(A01(0, 3, 72));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(List<C1111849> list) {
        int A00 = A00(list);
        if (A00 != -1) {
            A03(list, A00, A00 + 1);
            throw null;
        }
    }

    public C111414X(InterfaceC111404W interfaceC111404W) {
        this.A00 = interfaceC111404W;
    }
}
