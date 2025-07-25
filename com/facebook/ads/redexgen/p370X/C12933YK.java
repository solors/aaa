package com.facebook.ads.redexgen.p370X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.YK */
/* loaded from: assets/audience_network.dex */
public final class C12933YK implements InterfaceC11583Bx {
    public static byte[] A03;
    public static String[] A04 = {"U7C58G8YSmV9vlVhCcgTL8gvWtK2nUh7", "rchD6g8gaCdJrKaT6cY", "XSKvYVg8u7cslMcARjuzdYWWNQWy1OI3", "RniILupZEOVdpheiJaCIVa", "W6VJBDMDl8t52bAYcLBFhi9ZJeZzY86g", "3lPq75HsPjCWcJf7cN2seevogiCFywP7", "CoUyLte", "KsfhoqpqLoVK0Wmt0M"};
    public static final InterfaceC11586C0 A05;
    public InterfaceC11585Bz A00;
    public AbstractC11641Ct A01;
    public boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{11, 44, 36, 33, 40, 41, 109, 57, 34, 109, 41, 40, 57, 40, 63, 32, 36, 35, 40, 109, 47, 36, 57, 62, 57, 63, 40, 44, 32, 109, 57, 52, 61, 40};
    }

    static {
        A02();
        A05 = new C12934YL();
    }

    public static C11939I4 A00(C11939I4 c11939i4) {
        c11939i4.A0Y(0);
        return c11939i4;
    }

    private boolean A03(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        C11637Cp c11637Cp = new C11637Cp();
        if (c11637Cp.A03(interfaceC11584By, true) && (c11637Cp.A04 & 2) == 2) {
            int length = Math.min(c11637Cp.A00, 8);
            C11939I4 c11939i4 = new C11939I4(length);
            interfaceC11584By.AEO(c11939i4.A00, 0, length);
            if (C12935YM.A04(A00(c11939i4))) {
                this.A01 = new C12935YM();
            } else if (C12930YH.A06(A00(c11939i4))) {
                this.A01 = new C12930YH();
            } else if (!C12932YJ.A04(A00(c11939i4))) {
                return false;
            } else {
                this.A01 = new C12932YJ();
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void A9D(InterfaceC11585Bz interfaceC11585Bz) {
        this.A00 = interfaceC11585Bz;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final int AEk(InterfaceC11584By interfaceC11584By, C11590C4 c11590c4) throws IOException, InterruptedException {
        if (this.A01 == null) {
            boolean A032 = A03(interfaceC11584By);
            if (A04[3].length() == 2) {
                throw new RuntimeException();
            }
            A04[7] = "Jcv8zuJPcQsh";
            if (A032) {
                interfaceC11584By.AFq();
            } else {
                throw new C11464A0(A01(0, 34, 107));
            }
        }
        if (!this.A02) {
            InterfaceC11595C9 AHA = this.A00.AHA(0, 1);
            this.A00.A5u();
            this.A01.A06(this.A00, AHA);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC11584By, c11590c4);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void AG7(long j, long j2) {
        if (this.A01 != null) {
            AbstractC11641Ct abstractC11641Ct = this.A01;
            if (A04[6].length() == 29) {
                throw new RuntimeException();
            }
            A04[3] = "HMcRS9JjfDSABRlFypQFz8UIf";
            abstractC11641Ct.A05(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final boolean AGs(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        try {
            return A03(interfaceC11584By);
        } catch (C11464A0 unused) {
            if (A04[6].length() != 29) {
                A04[7] = "Et";
                return false;
            }
            throw new RuntimeException();
        }
    }
}
