package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.QG */
/* loaded from: assets/audience_network.dex */
public final class C12438QG implements InterfaceC12477Qt {
    public static String[] A0C = {"2ZSu0wXuDbQnaud22BC", "QCmSLF", "fQxhtf", "E3sU0uCnWEnB3ZcSzOkvj4xNFgaNSXPe", "Ye0yKWwaCEsRuR61siA7kBVWrkv2bkox", "1q930HE08Ni0sTckStF", "wfAs2pJjw0biCEJKLi3nGPcNksloIp8Y", "ZBBhRoR6L"};
    public C12614T7 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC12585Sd A07 = new AbstractC12585Sd() { // from class: com.facebook.ads.redexgen.X.9N
        {
            C12438QG.this = this;
        }

        @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
        /* renamed from: A00 */
        public final void A03(C114289P c114289p) {
            Handler handler;
            boolean A0D;
            handler = C12438QG.this.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = C12438QG.this.A0D(EnumC12498RE.A04);
            if (A0D) {
                C12438QG.this.A03();
                C12438QG.this.A06(true, false);
            }
            C12438QG.this.A03 = true;
        }
    };
    public final AbstractC12591Sj A06 = new AbstractC12591Sj() { // from class: com.facebook.ads.redexgen.X.9M
        {
            C12438QG.this = this;
        }

        @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
        /* renamed from: A00 */
        public final void A03(C114309R c114309r) {
            C12438QG.this.A03();
            C12438QG.this.A06(false, false);
            C12438QG.this.A03 = true;
        }
    };
    public final AbstractC12533Rn A08 = new C114239K(this);
    public final AbstractC12492R8 A09 = new AbstractC12492R8() { // from class: com.facebook.ads.redexgen.X.9D
        {
            C12438QG.this = this;
        }

        @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
        /* renamed from: A00 */
        public final void A03(C114279O c114279o) {
            boolean z;
            boolean A0D;
            z = C12438QG.this.A02;
            if (z) {
                return;
            }
            A0D = C12438QG.this.A0D(EnumC12498RE.A04);
            if (!A0D) {
                return;
            }
            C12438QG.this.A03();
            C12438QG.this.A06(true, false);
        }
    };
    public final AbstractC12481Qx A0A = new C1141198(this);
    public final Handler A05 = new Handler();
    public final List<InterfaceC12499RF> A0B = new ArrayList();
    public int A00 = 2000;

    public C12438QG(boolean z) {
        this.A02 = z;
    }

    public static /* synthetic */ int A00(C12438QG c12438qg) {
        return c12438qg.A00;
    }

    public static /* synthetic */ Handler A01(C12438QG c12438qg) {
        return c12438qg.A05;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<InterfaceC12499RF> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[6] = "Y40dGjVL9Zscw9FMyiKWKh6z3JvZ0T5u";
            strArr[4] = "hO4VpYUkDoigTR3nwiJ8PFOPPoG0N1QG";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void A04(C12438QG c12438qg) {
        c12438qg.A03();
    }

    public static /* synthetic */ void A05(C12438QG c12438qg, boolean z, boolean z2) {
        c12438qg.A06(z, z2);
    }

    public void A06(boolean z, boolean z2) {
        for (InterfaceC12499RF interfaceC12499RF : this.A0B) {
            interfaceC12499RF.A3u(z, z2);
        }
    }

    public static /* synthetic */ boolean A07(C12438QG c12438qg) {
        return c12438qg.A03;
    }

    public static /* synthetic */ boolean A08(C12438QG c12438qg) {
        return c12438qg.A02;
    }

    public static /* synthetic */ boolean A09(C12438QG c12438qg) {
        return c12438qg.A04;
    }

    public static /* synthetic */ boolean A0A(C12438QG c12438qg, EnumC12498RE enumC12498RE) {
        return c12438qg.A0D(enumC12498RE);
    }

    public static /* synthetic */ boolean A0B(C12438QG c12438qg, boolean z) {
        c12438qg.A03 = z;
        return z;
    }

    public static /* synthetic */ boolean A0C(C12438QG c12438qg, boolean z) {
        c12438qg.A04 = z;
        return z;
    }

    public boolean A0D(EnumC12498RE enumC12498RE) {
        for (InterfaceC12499RF interfaceC12499RF : this.A0B) {
            if (interfaceC12499RF.A8Q() != enumC12498RE) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i) {
        this.A00 = i;
    }

    public final void A0I(InterfaceC12499RF interfaceC12499RF) {
        this.A0B.add(interfaceC12499RF);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12477Qt
    public final void A9r(C12614T7 c12614t7) {
        this.A01 = c12614t7;
        c12614t7.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12477Qt
    public final void AHD(C12614T7 c12614t7) {
        A03();
        c12614t7.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
