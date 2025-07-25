package com.facebook.ads.redexgen.p370X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Ma */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12210Ma implements View.OnClickListener {
    public static String[] A01 = {"Z2hbS", "Ic9Plg2RHJALgAmeO078aNsKQGOal", "b0P4J", "qPaw7oHv0CzCeGcF5yFKpd54yMlUwCSF", "7gZAPHVUavlnb441EbFGztdAJQMZxuOt", "Mm2iJyxsEvC3", "o6m8JBk94F2OCejIYcL1MXv5hOBXGoqA", "4FWTxMbWeUMvWQb2hMO2cIzUW3drHp"};
    public final /* synthetic */ FullScreenAdToolbar A00;

    public View$OnClickListenerC12210Ma(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC12199MP interfaceC12199MP;
        C12237N1 c12237n1;
        InterfaceC12199MP interfaceC12199MP2;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC12199MP = this.A00.A02;
            if (interfaceC12199MP == null) {
                return;
            }
            c12237n1 = this.A00.A09;
            if (!c12237n1.A06()) {
                return;
            }
            interfaceC12199MP2 = this.A00.A02;
            interfaceC12199MP2.ABX();
        } catch (Throwable th) {
            if (A01[4].charAt(1) == '3') {
                throw new RuntimeException();
            }
            A01[4] = "5QsO86P0olwWLm0uuSyeI2U4VEnOIWE5";
            AbstractC12078KQ.A00(th, this);
        }
    }
}
