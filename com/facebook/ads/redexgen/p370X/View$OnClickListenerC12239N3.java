package com.facebook.ads.redexgen.p370X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.N3 */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12239N3 implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"Rngvbb3vMR3b56rBexb50Rjom5JamLMR", "BOyMrOLOVyOlAA7tdLfD", "PSvH7Ca0GqwbJXrw1OxZU20X4aHcam0S", "dzm7VVMnrqblx5opBv2tkfICkL24O513", "rKXY71", "THxRt8Yss0BlXBXFFRIVlNUaizFLAmop", "EnNQl89tpWVbcex4LtQ2YfadlOVOSM9k", "1aWdi1c8aZwiTk2zvtk8Xc2vTbtrER0G"};
    public final /* synthetic */ C12738V7 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{0, 21, 2, 22, 31, 2, 29, 51, 4, 17, 51, 28, 25, 19, 27};
    }

    static {
        A01();
    }

    public View$OnClickListenerC12239N3(C12738V7 c12738v7) {
        this.A00 = c12738v7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC12201MR interfaceC12201MR;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC12201MR = this.A00.A06;
            interfaceC12201MR.A4P(A00(0, 15, 86));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            String[] strArr = A02;
            if (strArr[7].charAt(31) == strArr[5].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "qnEa0qqxoU4sFli1HS9Y3SbmuU3eBkbM";
            strArr2[0] = "NnijgEsxsjK8xKe1vFUOE7dsdCVZHTLh";
        }
    }
}
