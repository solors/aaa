package com.facebook.ads.redexgen.p370X;

import android.os.AsyncTask;
import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.M5 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12179M5 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 66, 72, 94, 67, 69, 72, 2, 67, 95, 2, 109, 95, 85, 66, 79, 120, 77, 95, 71};
    }

    public static <P, PR, R> AsyncTask<P, PR, R> A00(Executor executor, AsyncTask<P, PR, R> task, P... params) {
        if (Build.VERSION.SDK_INT >= 11) {
            task.executeOnExecutor(executor, params);
        } else {
            task.execute(params);
        }
        return task;
    }

    public static void A02() {
        try {
            Class.forName(A01(0, 20, 53));
        } catch (Throwable unused) {
        }
    }
}
