package com.facebook.ads.redexgen.p370X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qb */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12459Qb implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C12626TJ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{56, 51, 57, 62, 60, 47, 57, 46};
    }

    public View$OnClickListenerC12459Qb(C12626TJ c12626tj) {
        this.A00 = c12626tj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View$OnClickListenerC12713Ui view$OnClickListenerC12713Ui;
        View$OnClickListenerC12713Ui view$OnClickListenerC12713Ui2;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            view$OnClickListenerC12713Ui = this.A00.A02;
            if (view$OnClickListenerC12713Ui == null) {
                return;
            }
            view$OnClickListenerC12713Ui2 = this.A00.A02;
            view$OnClickListenerC12713Ui2.A09(A00(0, 8, 103));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
