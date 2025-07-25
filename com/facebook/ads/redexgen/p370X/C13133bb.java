package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.bb */
/* loaded from: assets/audience_network.dex */
public final class C13133bb implements InterfaceC1098922 {
    public static byte[] A09;
    public static final String A0A;
    public long A00 = -1;
    public InterstitialAd A01;
    public AbstractC109391E A02;
    public C11795Fi A03;
    public boolean A04;
    public boolean A05;
    public final C13029Zs A06;
    public final InterstitialAdExtendedListener A07;
    public final C13129bX A08;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A09 = new byte[]{-88, -43, -121, -56, -53, -121, -45, -42, -56, -53, -121, -48, -38, -121, -56, -45, -39, -52, -56, -53, -32, -121, -48, -43, -121, -41, -39, -42, -50, -39, -52, -38, -38, -107, -121, -64, -42, -36, -121, -38, -49, -42, -36, -45, -53, -121, -34, -56, -48, -37, -121, -51, -42, -39, -121, -56, -53, -77, -42, -56, -53, -52, -53, -113, -112, -121, -37, -42, -121, -55, -52, -121, -54, -56, -45, -45, -52, -53, -103, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, 112, -68, -65, -79, -76, 112, -77, -79, -68, -68, -75, -76, 112, -57, -72, -71, -68, -75, 112, -61, -72, -65, -57, -71, -66, -73, 112, -71, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, 126, -33, -18, -25};
    }

    static {
        A0A();
        A0A = C13133bb.class.getSimpleName();
    }

    public C13133bb(C13129bX c13129bX, InterfaceC110052I interfaceC110052I, String str) {
        this.A08 = c13129bX;
        this.A06 = c13129bX.A05();
        this.A07 = new C13118bM(str, interfaceC110052I, this);
    }

    public final long A0D() {
        if (this.A03 != null) {
            return this.A03.A0F();
        }
        return -1L;
    }

    public final C13129bX A0E() {
        return this.A08;
    }

    public final C13029Zs A0F() {
        return this.A06;
    }

    public final void A0G(EnumSet<CacheFlag> cacheFlags, String str) {
        String A02;
        this.A00 = System.currentTimeMillis();
        if (!this.A05 && this.A03 != null) {
            Log.w(A0A, A09(0, 78, 45));
        }
        this.A05 = false;
        if (this.A04 && !C11979Im.A0g(this.A06)) {
            this.A06.A07().AA0(A09(130, 3, 68), AbstractC113568E.A0L, new C113578F(A09(78, 52, 22)));
            AdErrorType adErrorType = AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A06.A0E().A38(C12168Lu.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A07.onError(this.A08.A6E(), new AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        if (this.A03 != null) {
            this.A03.A0R(new C13138bg(this));
            this.A03.A0M();
            this.A03.A0J();
            this.A03 = null;
        }
        C109801t c109801t = new C109801t(this.A08.A0A(), AbstractC12040Jn.A00(this.A06.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, EnumC12036Jj.A08, 1, cacheFlags, this.A08.A06());
        if (C11979Im.A2T(this.A06) && (A02 = C12118L6.A02(this.A06, this.A08.A08())) != null) {
            this.A08.A0I(A02);
        }
        c109801t.A06(this.A08.A08());
        c109801t.A07(this.A08.A09());
        c109801t.A04(this.A08.A03());
        this.A03 = new C11795Fi(this.A06, c109801t);
        this.A03.A0R(new C13135bd(this));
        this.A03.A0V(str);
    }

    public final boolean A0H() {
        return this.A03 == null || this.A03.A0Y();
    }

    public final boolean A0I() {
        return this.A05;
    }

    public final boolean A0J() {
        AdError adError = AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        if (!this.A05) {
            this.A06.A0E().A38(C12168Lu.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A07.onError(this.A08.A6E(), adError);
            return false;
        } else if (this.A03 == null) {
            this.A06.A07().AA0(A09(130, 3, 68), AbstractC113568E.A0S, new C113578F(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            this.A06.A0E().A38(C12168Lu.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A07.onError(this.A08.A6E(), adError);
            return false;
        } else {
            this.A03.A0L();
            this.A04 = true;
            this.A05 = false;
            return true;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1098922
    public final void destroy() {
        if (this.A03 != null) {
            this.A03.A0R(new C13134bc(this));
            this.A03.A0X(true);
            this.A03.A0J();
            this.A03 = null;
            this.A05 = false;
            this.A04 = false;
        }
    }
}
