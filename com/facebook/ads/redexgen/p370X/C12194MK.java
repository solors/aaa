package com.facebook.ads.redexgen.p370X;

import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.MK */
/* loaded from: assets/audience_network.dex */
public final class C12194MK {
    public static byte[] A00;
    public static String[] A01 = {"CRKlMdJj7sWkVQXvhxP2gtYMKrwrdBdz", "MDVslC7yGiRJk7iB8DE8e8h4fEVrC5ER", "lH08WA", "RxIchMFZh", "vNyd6Jid8bvsA1cw15Ve5Ic9LBA7HcUI", "txgfdNfKSs8Co5f2ObGoVq", "d8ndlqqx7tIKNJdyWXTDq8r8sQB5dgXc", "5RbatCjsfF363SonahZsted9lIdQCMHb"};
    public static final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            String[] strArr = A01;
            if (strArr[4].charAt(3) != strArr[6].charAt(3)) {
                throw new RuntimeException();
            }
            A01[2] = "R3kMyn";
            copyOfRange[i4] = (byte) (i5 - 20);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{109, -96, -117, -115, -104, -100, -111, -105, -106, 72, -111, -106, 72, -101, -117, -102, -115, -115, -106, 72, -111, -106, -100, -115, -102, -119, -117, -100, -111, -98, -115, 72, -117, -112, -115, -117, -109, 84, 72, -119, -101, -101, -99, -107, -111, -106, -113, 72, -111, -106, -100, -115, -102, -119, -117, -100, -111, -98, -115, 86, -33, -34, -26, -44, -31, -69, -78, -68, -76, -62};
    }

    static {
        A01();
        A02 = C12194MK.class.getSimpleName();
    }

    public static boolean A02(C13029Zs c13029Zs) {
        return A03(c13029Zs) && C12195ML.A03(c13029Zs);
    }

    public static boolean A03(C13029Zs c13029Zs) {
        if (c13029Zs == null) {
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) c13029Zs.getSystemService(A00(60, 5, 91));
            if (Build.VERSION.SDK_INT >= 20) {
                return powerManager.isInteractive();
            }
            return powerManager.isScreenOn();
        } catch (Exception e) {
            Log.e(A02, A00(0, 60, 20), e);
            c13029Zs.A07().AA0(A00(65, 5, 53), AbstractC113568E.A2S, new C113578F(e));
            return true;
        }
    }
}
