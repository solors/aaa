package com.facebook.ads.redexgen.p370X;

import android.app.Activity;
import android.os.Build;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.LI */
/* loaded from: assets/audience_network.dex */
public class RunnableC12130LI implements Runnable {
    public static byte[] A04;
    public static String[] A05 = {"rpDB7rKXNsFsWkDz6IFMGYiQm5SIurhV", "Zw7gqQaUB6b8OXSgkCM5acQChbi0fPQB", "ij96xAlSFdb9T8", "9lv2KZaF3yGNFfkp5oM5AxENUzlVWnoh", "BtiLNkHShKV4ox8o5K74B7kMcT6dIDQ3", "4qYR1HKsivt0y2MxZdwkaRz4cXsJEuH0", "44IOIp9GJ1CB282l", "5xjMlDyVDQDeuAskdNZft2cHBWd2iktp"};
    public final /* synthetic */ C109541T A00;
    public final /* synthetic */ C12133LL A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{56, 62, 40, 63, 46, 33, 36, 46, 38};
    }

    static {
        A01();
    }

    public RunnableC12130LI(C12133LL c12133ll, String str, C109541T c109541t, String str2) {
        this.A01 = c12133ll;
        this.A03 = str;
        this.A00 = c109541t;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C13029Zs c13029Zs;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            z = this.A01.A00;
            if (!z) {
                return;
            }
            boolean z2 = false;
            this.A01.A00 = false;
            c13029Zs = this.A01.A03;
            Activity A0D = c13029Zs.A0D();
            boolean z3 = false;
            int i = Build.VERSION.SDK_INT;
            String[] strArr = A05;
            if (strArr[1].charAt(30) != strArr[4].charAt(30)) {
                throw new RuntimeException();
            }
            A05[2] = "zngGPNErwRp983";
            if (i >= 24) {
                if (A0D != null && A0D.isInMultiWindowMode()) {
                    z2 = true;
                }
                z3 = z2;
            }
            if (!z3 && C12108Kw.A00().A03()) {
                return;
            }
            this.A01.A05(this.A03 != null ? this.A03 : A00(0, 9, 80), this.A00, this.A02);
        } catch (Throwable th) {
            if (A05[2].length() != 14) {
                AbstractC12078KQ.A00(th, this);
                return;
            }
            A05[2] = "Mnh0XYPOQy81qp";
            AbstractC12078KQ.A00(th, this);
        }
    }
}
