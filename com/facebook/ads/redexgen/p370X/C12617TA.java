package com.facebook.ads.redexgen.p370X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.TA */
/* loaded from: assets/audience_network.dex */
public class C12617TA extends AbstractRunnableC12086KY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C12614T7 A02;
    public final /* synthetic */ EnumC12527Rh A03;

    public C12617TA(C12614T7 c12614t7, EnumC12527Rh enumC12527Rh, int i, int i2) {
        this.A02 = c12614t7;
        this.A03 = enumC12527Rh;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        C13029Zs c13029Zs;
        Handler handler;
        C113998w c113998w;
        C13029Zs c13029Zs2;
        C113998w c113998w2;
        C12483Qz c12483Qz;
        Handler handler2;
        C13029Zs c13029Zs3;
        C113998w c113998w3;
        Handler handler3;
        C13029Zs c13029Zs4;
        C13029Zs c13029Zs5;
        C113998w c113998w4;
        C12581SZ c12581sz;
        Handler handler4;
        C13029Zs c13029Zs6;
        C13029Zs c13029Zs7;
        Handler handler5;
        C113998w c113998w5;
        C113998w c113998w6;
        C12590Si c12590Si;
        C13029Zs c13029Zs8;
        C113998w c113998w7;
        C12526Rg c12526Rg;
        if (this.A03 == EnumC12527Rh.A07) {
            this.A02.A0L(EnumC12007JE.A0w);
            c13029Zs8 = this.A02.A0A;
            c13029Zs8.A0E().A3U();
            c113998w7 = this.A02.A0B;
            c12526Rg = C12614T7.A0I;
            c113998w7.A02(c12526Rg);
        } else if (this.A03 == EnumC12527Rh.A03) {
            this.A02.A0L(EnumC12007JE.A0r);
            this.A02.A03 = true;
            c113998w6 = this.A02.A0B;
            c12590Si = C12614T7.A0G;
            c113998w6.A02(c12590Si);
            this.A02.A0K(this.A00);
        } else if (this.A03 == EnumC12527Rh.A06) {
            this.A02.A0L(EnumC12007JE.A0q);
            c13029Zs7 = this.A02.A0A;
            c13029Zs7.A0E().A3M();
            this.A02.A03 = true;
            handler5 = this.A02.A07;
            handler5.removeCallbacksAndMessages(null);
            c113998w5 = this.A02.A0B;
            c113998w5.A02(new C114309R(this.A01, this.A01));
            this.A02.A0K(this.A01);
        } else if (this.A03 == EnumC12527Rh.A0A) {
            c13029Zs4 = this.A02.A0A;
            if (C11979Im.A1p(c13029Zs4)) {
                c13029Zs6 = this.A02.A0A;
                c13029Zs6.A0A().AE9();
            }
            this.A02.A0L(EnumC12007JE.A0u);
            c13029Zs5 = this.A02.A0A;
            c13029Zs5.A0E().A3b();
            c113998w4 = this.A02.A0B;
            c12581sz = C12614T7.A0H;
            c113998w4.A02(c12581sz);
            handler4 = this.A02.A07;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0H();
        } else if (this.A03 == EnumC12527Rh.A05) {
            this.A02.A0L(EnumC12007JE.A0t);
            c13029Zs3 = this.A02.A0A;
            c13029Zs3.A0E().A3Q();
            c113998w3 = this.A02.A0B;
            c113998w3.A02(new AbstractC12592Sk(this.A00) { // from class: com.facebook.ads.redexgen.X.9P
            });
            handler3 = this.A02.A07;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
        } else if (this.A03 == EnumC12527Rh.A04) {
            this.A02.A0L(EnumC12007JE.A0s);
            c13029Zs2 = this.A02.A0A;
            c13029Zs2.A0E().A3N();
            c113998w2 = this.A02.A0B;
            c12483Qz = C12614T7.A0K;
            c113998w2.A02(c12483Qz);
            handler2 = this.A02.A07;
            handler2.removeCallbacksAndMessages(null);
        } else if (this.A03 == EnumC12527Rh.A09) {
            this.A02.A0L(EnumC12007JE.A0q);
            c13029Zs = this.A02.A0A;
            c13029Zs.A0E().A3W();
            this.A02.A03 = true;
            handler = this.A02.A07;
            handler.removeCallbacksAndMessages(null);
            c113998w = this.A02.A0B;
            c113998w.A02(new C114309R(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
