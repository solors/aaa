package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.PT */
/* loaded from: assets/audience_network.dex */
public final class C12389PT extends FrameLayout {
    public static byte[] A0L;
    public static String[] A0M = {"nL4f6tElOIWkWIMY", "pafc", "mmt", "r2KL", "cPD1EcNrMsc9Il", "HjHry0SxIHtlyHB0wW8GJ6CkWWRugdPq", "pjLQgfnHLp272wJByK44k5CENQyu64qM", "USuv5isgmNE5xLLzg"};
    public EnumC12476Qs A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC13171cD A05;
    public final C112726f A06;
    public final C13029Zs A07;
    public final C12008JF A08;
    public final InterfaceC12201MR A09;
    public final InterfaceC12245N9 A0A;
    public final InterfaceC12388PS A0B;
    public final C12619TC A0C;
    public final C12614T7 A0D;
    public final C114319S A0E;
    public final AbstractC12591Sj A0F;
    public final AbstractC12589Sh A0G;
    public final AbstractC12585Sd A0H;
    public final AbstractC12533Rn A0I;
    public final AbstractC12493R9 A0J;
    public final AbstractC12492R8 A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0M[0].length() != 16) {
                throw new RuntimeException();
            }
            A0M[0] = "7kRjpWt7kPSYf5Zn";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
            i4++;
        }
    }

    public static void A0C() {
        A0L = new byte[]{-112, -94, -97, -97, -110, -101, -95, -127, -106, -102, -110, -81, -64, -67, -84, -65, -76, -70, -71, -20, -12, -13, -28, -29, -14, -29, -9, -11, -25, -26, -60, -5, -41, -11, -25, -12, -19, -17, -20, -28, -17, -30, -16, -16};
    }

    static {
        A0C();
    }

    public C12389PT(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, AbstractC13171cD abstractC13171cD, C112726f c112726f, C12008JF c12008jf, InterfaceC12201MR interfaceC12201MR, InterfaceC12245N9 interfaceC12245N9, InterfaceC12388PS interfaceC12388PS) {
        super(c13029Zs);
        this.A0J = new C11548BM(this);
        this.A0I = new C11547BL(this);
        this.A0H = new C11546BK(this);
        this.A0K = new C11544BI(this);
        this.A0F = new C11536BA(this);
        this.A0G = new C11535B9(this);
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = c13029Zs;
        this.A05 = abstractC13171cD;
        this.A06 = c112726f;
        this.A08 = c12008jf;
        this.A09 = interfaceC12201MR;
        this.A0A = interfaceC12245N9;
        this.A0D = new C12614T7(c13029Zs);
        this.A0B = interfaceC12388PS;
        this.A0D.setFunnelLoggingHandler(c12008jf);
        this.A0D.getEventBus().A03(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
        this.A0E = new C114319S(c13029Zs, interfaceC12000J7, this.A0D, abstractC13171cD.A1U());
        if (C11979Im.A1q(this.A07)) {
            this.A0C = new C12619TC(c13029Zs, interfaceC12000J7, this.A0D, abstractC13171cD.A1U(), this.A0E, null);
        } else {
            this.A0C = null;
        }
        A0B();
        this.A0D.setVideoURI(this.A06.A0S(this.A05.A1P().A0E().A08()));
        A09();
        AbstractC12177M3.A0M(this, this.A05.A1O().A01().A07(true));
        String videoUrl = abstractC13171cD.A1P().A0E().A07();
        if (!TextUtils.isEmpty(videoUrl)) {
            AbstractC12335Ob.A00(c13029Zs, this, videoUrl);
        }
        addView(this.A0D, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A03() {
        return A04(this.A0D.getCurrentPositionInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A04(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(0, 11, 32), i);
            jSONObject.put(A02(11, 8, 62), this.A0D.getDuration());
            jSONObject.put(A02(19, 5, 114), this.A0D.A0i());
            jSONObject.put(A02(24, 12, 117), this.A0D.A0k());
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A02) {
            return;
        }
        this.A02 = true;
    }

    private void A08() {
        this.A0D.postDelayed(new C12682UD(this), C11979Im.A0M(this.A07));
    }

    private void A09() {
        this.A0D.postDelayed(new C12681UC(this), C11979Im.A0N(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A0B.AE1(A02(36, 8, 112), A03());
    }

    private void A0B() {
        if (!TextUtils.isEmpty(this.A05.A1P().A0E().A07())) {
            C113137V c113137v = new C113137V(this.A07);
            this.A0D.A0c(c113137v);
            c113137v.setImage(this.A05.A1P().A0E().A07());
        }
        C113027G c113027g = new C113027G(this.A07, true, this.A08);
        this.A0D.A0c(c113027g);
        this.A0D.A0c(new C12332OY(c113027g, EnumC12489R5.A02, true));
        this.A0D.A0c(new C113067L(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C114279O c114279o) {
        if (this.A0D.getState() == EnumC12527Rh.A02 && C11979Im.A1U(this.A07)) {
            this.A0D.postDelayed(new C12680UB(this, c114279o), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(String str) {
        this.A07.A0E().A3L(str);
        if (C11979Im.A1V(this.A07)) {
            A07();
            return;
        }
        this.A09.A4P(this.A0A.A7M());
        this.A09.A4P(this.A0A.A7I());
    }

    public final void A0N() {
        this.A0D.setVolume(this.A05.A1P().A0E().A09() ? 0.0f : 1.0f);
        this.A0D.A0b(EnumC12476Qs.A02, 26);
        A08();
    }

    public final void A0O() {
        if (this.A0D != null) {
            if (!this.A02) {
                this.A0D.A0a(EnumC12471Qn.A03);
            }
            this.A0D.getEventBus().A04(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
            this.A0D.A0V();
        }
        if (this.A0C != null) {
            this.A0C.A05();
        }
        this.A0E.A0o();
    }

    public final void A0P() {
        this.A0D.A0Z(9);
        AbstractC12177M3.A0T(this);
        AbstractC12177M3.A0H(this.A0D);
        AbstractC12177M3.A0b(this.A0D);
    }

    public final void A0Q() {
        this.A0D.A0a(EnumC12471Qn.A04);
    }

    public final void A0R(boolean z) {
        if (z) {
            this.A0D.setVolume(0.0f);
        } else {
            this.A0D.setVolume(1.0f);
        }
        A0A();
    }

    public final void A0S(boolean z) {
        if (this.A0D.A0j()) {
            return;
        }
        this.A00 = this.A0D.getVideoStartReason();
        this.A01 = z;
        this.A0D.A0e(false, 19);
    }

    public final void A0T(boolean z) {
        if (this.A0D.A0k() || this.A02 || this.A0D.getState() == EnumC12527Rh.A06 || this.A00 == null) {
            return;
        }
        if (!this.A01 || z) {
            this.A0D.A0b(this.A00, 27);
        }
    }

    public final void A0U(boolean z) {
        this.A0D.A0e(z, 18);
    }

    public final void A0V(boolean z) {
        this.A0D.A0b(EnumC12476Qs.A04, 25);
    }
}
