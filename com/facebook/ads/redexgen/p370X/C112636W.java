package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6W */
/* loaded from: assets/audience_network.dex */
public final class C112636W {
    public static byte[] A03;
    public static final AtomicBoolean A04;
    public C13028Zr A00;
    public String A01;
    public final C12151Ld A02 = new C12151Ld(300000000000L, new C13036Zz(this));

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-56, -43, -56, -45, -42, -50, -86, -95, -80, -77, -85, -82, -89, -69, -80, -75, -84, -95, -64, -78, -64, -64, -74, -68, -69, -52, -63, -74, -70, -78};
    }

    static {
        A04();
        A04 = new AtomicBoolean(false);
    }

    public static InterfaceC113908n A00(C13028Zr c13028Zr) {
        return C11979Im.A15(c13028Zr) ? C113918o.A01(A01(0, 6, 55), A01(18, 12, 29), A01(6, 12, 12)) : C113918o.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C13028Zr c13028Zr;
        synchronized (this) {
            c13028Zr = this.A00;
        }
        if (c13028Zr == null) {
            return;
        }
        String A042 = C113938q.A00().A01(c13028Zr, true).A04(A00(c13028Zr));
        synchronized (this) {
            this.A01 = A042;
        }
    }

    public static void A03() {
        A04.set(true);
    }

    public final synchronized String A06(C13028Zr c13028Zr) {
        this.A00 = c13028Zr;
        this.A00.A07().AAl();
        this.A00.A03().ABQ(c13028Zr);
        if (this.A00.A06().AGj() || ((A04.get() && C11979Im.A1r(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A04.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
