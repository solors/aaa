package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.EC */
/* loaded from: assets/audience_network.dex */
public class RunnableC11714EC implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C11721EL A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-54, -20, -3, -14, -8, -9, -87, -17, -14, -11, -18, -87, -11, -8, -22, -19, -14, -9, -16, -87, -17, -22, -14, -11, -18, -19, -73, -53, -10, -2, -11, -13, -10, -24, -21, -44, -24, -11, -24, -18, -20, -7};
    }

    public RunnableC11714EC(C11721EL c11721el) {
        this.A00 = c11721el;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11709E1 c11709e1;
        DownloadAction.Deserializer[] deserializerArr;
        Handler handler;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            c11709e1 = this.A00.A09;
            deserializerArr = this.A00.A0E;
            DownloadAction[] actions = c11709e1.A03(deserializerArr);
            handler = this.A00.A07;
            handler.post(new RunnableC11713EB(this, actions));
        }
    }
}
