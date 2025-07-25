package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wo */
/* loaded from: assets/audience_network.dex */
public final class C12842Wo implements InterfaceC11871Gy {
    public static byte[] A06;
    public static String[] A07 = {"P1QEQSrukY5M5xBERBA96AXfGMpQRJsf", "fyJkILoJ8zO6ExXw4Z", "h2ZhnadmQQVtt", "59wO2YFrHM8LuMJd73h58a1kzdTPZKrY", "SxndWhWbDDrPbMOefSLNszxc26nlxYdY", "LBwvzUorbHEknhZCWQOabtM6HtCL0aoO", "5lhqhPHQff1TfuPnwPh7puTUvGoJGhr7", "0PrGAAoyZelcinCG058YNP9pZpCUk744"};
    public final int A00;
    public final InterfaceC11869Gw A01;
    public final InterfaceC11871Gy A02;
    public final InterfaceC11871Gy A03;
    public final InterfaceC11898HP A04;
    public final InterfaceC11900HR A05;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[0].charAt(6) == 'X') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "vVmF6SpGATWHz9jZKAi0g6CZ8G1CuqUy";
            strArr[3] = "NGHYjAXI4l3csZ1DR9QZwhsoB2pnzImG";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 61);
            i4++;
        }
    }

    public static void A02() {
        A06 = new byte[]{83, 66, 85, 81, 68, 85, 116, 81, 68, 81, 99, 89, 94, 91};
    }

    static {
        A02();
    }

    public C12842Wo(InterfaceC11898HP interfaceC11898HP, InterfaceC11871Gy interfaceC11871Gy, InterfaceC11871Gy interfaceC11871Gy2, InterfaceC11869Gw interfaceC11869Gw, int i, InterfaceC11900HR interfaceC11900HR) {
        this.A04 = interfaceC11898HP;
        this.A03 = interfaceC11871Gy;
        this.A02 = interfaceC11871Gy2;
        this.A01 = interfaceC11869Gw;
        this.A00 = i;
        this.A05 = interfaceC11900HR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11871Gy
    /* renamed from: A00 */
    public final C12843Wp A4t() {
        InterfaceC11898HP interfaceC11898HP = this.A04;
        InterfaceC11872Gz A4t = this.A03.A4t();
        InterfaceC11872Gz A4t2 = this.A02.A4t();
        if (0 != 0) {
            throw new NullPointerException(A01(0, 14, 13));
        }
        return new C12843Wp(interfaceC11898HP, A4t, A4t2, null, this.A00, null);
    }
}
