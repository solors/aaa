package com.facebook.ads.redexgen.p370X;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.NE */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12250NE extends FrameLayout {
    public static String[] A0C = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public EnumC110172U A01;
    public C110182V A02;
    public C110192W A03;
    public final C110152S A04;
    public final C13029Zs A05;
    public final InterfaceC12000J7 A06;
    public final InterfaceC12201MR A07;
    public final InterfaceC12202MS A08;
    public final String A09;
    public final C109601Z A0A;
    public final InterfaceC12252NG A0B;

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(C110192W c110192w, EnumC110172U enumC110172U);

    public abstract void A0O(C110192W c110192w, EnumC110172U enumC110172U);

    public abstract boolean A0P();

    public AbstractC12250NE(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, String str) {
        this(c13029Zs, interfaceC12000J7, str, null, null, null);
    }

    public AbstractC12250NE(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, String str, C109601Z c109601z, InterfaceC12202MS interfaceC12202MS, InterfaceC12201MR interfaceC12201MR) {
        super(c13029Zs);
        this.A00 = 0;
        this.A01 = EnumC110172U.A05;
        this.A03 = null;
        this.A0B = new C12735V4(this);
        this.A05 = c13029Zs;
        this.A06 = interfaceC12000J7;
        this.A08 = interfaceC12202MS;
        this.A07 = interfaceC12201MR;
        this.A09 = str;
        this.A0A = c109601z;
        this.A04 = AbstractC110162T.A00(this.A05.A01());
    }

    public static /* synthetic */ int A00(AbstractC12250NE abstractC12250NE) {
        int i = abstractC12250NE.A00;
        abstractC12250NE.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A01(AbstractC12250NE abstractC12250NE) {
        int i = abstractC12250NE.A00;
        abstractC12250NE.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A02.A0A()) {
            this.A06.A9t(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A03 = null;
        this.A02.A05();
        A0L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C110192W c110192w) {
        this.A02.A08(this.A01);
        A0N(c110192w, this.A01);
        C109210w.A01(this.A05).A0L();
        if (A0P()) {
            A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C110192W c110192w) {
        this.A03 = c110192w;
        this.A02.A09(this.A01, this.A00);
        A0O(c110192w, this.A01);
    }

    public final void A0J() {
        A0B();
    }

    public final void A0K() {
        this.A02 = new C110182V(new C12008JF(this.A09, this.A06));
        if (this.A08 != null) {
            InterfaceC12202MS interfaceC12202MS = this.A08;
            if (A0C[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0C[7] = "FLAi4P2";
            interfaceC12202MS.ACz(true);
        }
        A0C();
    }
}
