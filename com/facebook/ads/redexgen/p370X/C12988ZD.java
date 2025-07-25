package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ZD */
/* loaded from: assets/audience_network.dex */
public final class C12988ZD implements InterfaceC11930Hv {
    public static byte[] A04;
    public static String[] A05 = {"y11dLyPunqUC2SNmL", "uVADpA68M0Cfsn3", "aBlYZw3oCoScJFQ4w", "r0ynqY3CAk0tRf6oRkSRXMHPPhoSUYte", "5IdS6oQ5FkjdCe25TD", "axyuAqOl38qaB", "nwjC1v9mDHKhrzym", "tyB4AmDpHjXl7StHIAOspd43HtyDxVTF"};
    public InterfaceC12985ZA A00;
    public InterfaceC11930Hv A01;
    public final InterfaceC114439e A02;
    public final C12837Wj A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 114);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{20, 60, 51, 59, 48, 55, 51, 44, -25, 57, 44, 53, 43, 44, 57, 44, 57, -25, 52, 44, 43, 48, 40, -25, 42, 51, 54, 42, 50, 58, -25, 44, 53, 40, 41, 51, 44, 43, -11};
    }

    static {
        A02();
    }

    public C12988ZD(InterfaceC114439e interfaceC114439e, InterfaceC11917Hi interfaceC11917Hi) {
        this.A02 = interfaceC114439e;
        this.A03 = new C12837Wj(interfaceC11917Hi);
    }

    private void A01() {
        this.A03.A02(this.A01.A88());
        C11466A2 A85 = this.A01.A85();
        if (!A85.equals(this.A03.A85())) {
            this.A03.AGa(A85);
            this.A02.AD4(A85);
        }
    }

    private boolean A03() {
        if (this.A00 != null && !this.A00.A9Q()) {
            InterfaceC12985ZA interfaceC12985ZA = this.A00;
            if (A05[3].charAt(15) != 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "9hoxEIkxVF2NPrHo";
            strArr[1] = "wbudfck4dY7yDqE";
            if (interfaceC12985ZA.A9b() || !this.A00.A8z()) {
                return true;
            }
        }
        return false;
    }

    public final long A04() {
        if (A03()) {
            A01();
            return this.A01.A88();
        }
        return this.A03.A88();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j) {
        this.A03.A02(j);
    }

    public final void A08(InterfaceC12985ZA interfaceC12985ZA) {
        if (interfaceC12985ZA == this.A00) {
            if (A05[3].charAt(15) != 'o') {
                throw new RuntimeException();
            }
            A05[4] = "7XXmXHxAZf2MfmaOXy";
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(InterfaceC12985ZA interfaceC12985ZA) throws C114469h {
        InterfaceC11930Hv A7l = interfaceC12985ZA.A7l();
        if (A7l != null) {
            InterfaceC11930Hv rendererMediaClock = this.A01;
            if (A7l != rendererMediaClock) {
                InterfaceC11930Hv rendererMediaClock2 = this.A01;
                if (rendererMediaClock2 == null) {
                    this.A01 = A7l;
                    this.A00 = interfaceC12985ZA;
                    InterfaceC11930Hv interfaceC11930Hv = this.A01;
                    InterfaceC11930Hv rendererMediaClock3 = this.A03;
                    interfaceC11930Hv.AGa(rendererMediaClock3.A85());
                    A01();
                    return;
                }
                throw C114469h.A02(new IllegalStateException(A00(0, 39, 85)));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11930Hv
    public final C11466A2 A85() {
        if (this.A01 != null) {
            return this.A01.A85();
        }
        return this.A03.A85();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11930Hv
    public final long A88() {
        if (A03()) {
            return this.A01.A88();
        }
        return this.A03.A88();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11930Hv
    public final C11466A2 AGa(C11466A2 c11466a2) {
        if (this.A01 != null) {
            c11466a2 = this.A01.AGa(c11466a2);
        }
        this.A03.AGa(c11466a2);
        this.A02.AD4(c11466a2);
        return c11466a2;
    }
}
