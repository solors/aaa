package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NN */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12259NN implements View.OnClickListener {
    public static String[] A01 = {"XFhwvfKkSyEqyRRacFdsqa616PFWUHCh", "TE99xZ7RorqY7SfVqRabPy9CgIKsfp3m", "kdLoeHuwvZoF6PjW0V2phiTjzwiVAf2t", "RlTzAejg9EfvSUQcXL5xjQX", "GFFSxtzm", "K1qZUjF5HHG2weDv49vHRNq0ZyDtpmc", "H0qCz3fL", "PDkQY8eSanvsX5OhJAHoWikZaqKVEEl4"};
    public final /* synthetic */ C12733V2 A00;

    public View$OnClickListenerC12259NN(C12733V2 c12733v2) {
        this.A00 = c12733v2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A8n();
        } catch (Throwable th) {
            if (A01[0].charAt(19) == 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "TKgPwnLp";
            strArr[6] = "fznJdSDC";
            AbstractC12078KQ.A00(th, this);
        }
    }
}
