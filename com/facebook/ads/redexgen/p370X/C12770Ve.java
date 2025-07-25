package com.facebook.ads.redexgen.p370X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ve */
/* loaded from: assets/audience_network.dex */
public class C12770Ve extends AbstractRunnableC12086KY {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterface$OnClickListenerC12190MG A01;

    public C12770Ve(DialogInterface$OnClickListenerC12190MG dialogInterface$OnClickListenerC12190MG, DialogInterface dialogInterface) {
        this.A01 = dialogInterface$OnClickListenerC12190MG;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        InterfaceC12536Rq interfaceC12536Rq;
        InterfaceC12536Rq interfaceC12536Rq2;
        C13028Zr c13028Zr;
        Map<? extends String, ? extends String> A02;
        interfaceC12536Rq = this.A01.A01.A02;
        if (interfaceC12536Rq != null) {
            interfaceC12536Rq2 = this.A01.A01.A02;
            c13028Zr = this.A01.A01.A00;
            String A03 = AbstractC12067KE.A03(c13028Zr);
            C12550S4 c12550s4 = new C12550S4();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC12536Rq2.AES(A03, c12550s4.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
