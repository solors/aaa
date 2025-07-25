package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NV */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12267NV implements View.OnClickListener {
    public static String[] A03 = {"qTn7FHoQ", "BapBypyKyXgi02nUaikHNoU7eY2sLlHG", "hAbogJy7", "1kKCdLvWKNxoPSiH", "Xjk6qTkQoY8vuVUP", "RHy2P55wnjv0LaFNgRpD8dXF", "4s2GzZI6q8xqZAbl0Skgz3P6Lr2GKXBU", "B9Ul8cdGX1dUct8fF9ORVNarLvr0UfHM"};
    public final /* synthetic */ C110192W A00;
    public final /* synthetic */ C12254NI A01;
    public final /* synthetic */ C12268NW A02;

    public View$OnClickListenerC12267NV(C12268NW c12268nw, C12254NI c12254ni, C110192W c110192w) {
        this.A02 = c12268nw;
        this.A01 = c12254ni;
        this.A00 = c110192w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC12252NG interfaceC12252NG;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            interfaceC12252NG = this.A02.A02;
            interfaceC12252NG.ACt(this.A00);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            String[] strArr = A03;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[3] = "Wxfvm9MNAlg6MGh9";
            strArr2[4] = "9MWDJcBk5PnwUytH";
        }
    }
}
