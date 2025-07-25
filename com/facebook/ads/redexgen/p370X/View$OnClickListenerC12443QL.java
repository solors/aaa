package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.QL */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12443QL implements View.OnClickListener {
    public static String[] A01 = {"hS5f9KbstsMPLbUbPSxFVdCfAROmcRtV", "DUM08yoPCPer4HETov37xY8lXqOkWet1", "HD0hLshA4", "cNo3fMkBKvz7jHUo", "0KN3KUldF", "ICLtCAijF", "iMQeuY1uIySJVoFID8xkudblEyJz6Aif", "P1hZJiyY"};
    public final /* synthetic */ C12444QM A00;

    public View$OnClickListenerC12443QL(C12444QM c12444qm) {
        this.A00 = c12444qm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C113027G c113027g;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            c113027g = this.A00.A05;
            c113027g.performClick();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            if (A01[6].charAt(1) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[0] = "I2wlNoUiFEETsNdyZ3cedgIbWPjbODtt";
            strArr[1] = "f6nspZJA1kETXV8rRnTaX6zeidOCX4th";
        }
    }
}
