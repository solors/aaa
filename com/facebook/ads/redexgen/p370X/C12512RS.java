package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.RS */
/* loaded from: assets/audience_network.dex */
public final class C12512RS {
    public static byte[] A02;
    public final C11728Eb A00;
    public final C12860X6 A01 = new C12860X6();

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 9, 14, 5, -6, -73, -75, -49, -75, -73};
    }

    public C12512RS(C13029Zs c13029Zs) {
        InterfaceC11857Gk trackSelectionFactory = new C12867XD(this.A01);
        this.A00 = AbstractC114489j.A00(new C12987ZC(c13029Zs), new C11649D1(trackSelectionFactory), new C12989ZE());
    }

    public static String A01(C114469h c114469h) {
        return A00(41, 11, 99) + c114469h.A01 + A00(14, 22, 98) + c114469h.A00 + A00(0, 14, 108) + c114469h.getCause() + A00(36, 2, 118);
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A6Z();
    }

    public final long A06() {
        return this.A00.A71();
    }

    public final long A07() {
        return this.A00.A7E();
    }

    public final C12510RQ A08() {
        Format vf = this.A00.A0L();
        if (vf == null) {
            return null;
        }
        return new C12510RQ(vf.A0F, vf.A08);
    }

    public final void A09() {
        this.A00.AEy();
    }

    public final void A0A() {
        this.A00.AGA();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f) {
        this.A00.A0N(f);
    }

    public final void A0D(long j) {
        this.A00.AG9(j);
    }

    public final void A0E(Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0F(C13028Zr c13028Zr, Uri uri) {
        if (C11979Im.A2m(c13028Zr, A03())) {
            C12516RW cacheManager = C12516RW.A05(c13028Zr);
            C12886XW c12886xw = new C12886XW(cacheManager.A0F(c13028Zr));
            String A08 = C12516RW.A08(c13028Zr, uri);
            if (A08 != null) {
                c12886xw.A00(A08);
            }
            this.A00.A0P(c12886xw.A01(uri));
            return;
        }
        InterfaceC11748Ev mediaSource = new C12886XW(new C12858X4(c13028Zr, AbstractC11953IK.A0K(c13028Zr, A00(38, 3, 100)), this.A01)).A01(uri);
        this.A00.A0P(mediaSource);
    }

    public final void A0G(InterfaceC12509RP interfaceC12509RP) {
        this.A00.A3m(new C12170Lw(this, interfaceC12509RP));
    }

    public final void A0H(InterfaceC12511RR interfaceC12511RR) {
        this.A00.A0Q(new C12175M1(this, interfaceC12511RR));
    }

    public final void A0I(boolean z) {
        this.A00.AGZ(z);
    }

    public final boolean A0J() {
        return this.A00.A84();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
