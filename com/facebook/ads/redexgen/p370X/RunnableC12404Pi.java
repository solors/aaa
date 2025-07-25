package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Pi */
/* loaded from: assets/audience_network.dex */
public class RunnableC12404Pi implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C12408Pm A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{13, 33, 59, 34, 42, 110, 32, 33, 58, 110, 62, 47, 60, 61, 43, 110, 61, 43, 60, 56, 43, 60, 110, 35, 43, 61, 61, 47, 41, 43, 72, Byte.MAX_VALUE, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, 45, 125, 108, Byte.MAX_VALUE, 126, 100, 99, 106, 45, 71, 94, 66, 67, 45, 100, 99, 45, 125, 98, 126, 121, SignedBytes.MAX_POWER_OF_TWO, 104, 126, 126, 108, 106, 104, 45, 87, 67, 66, 94, 125, 83, 79, 53, 40, 36, 34, 49, 15, 52, 49, 36, 49, 14, 3, 10, 31, 58, 60};
    }

    public RunnableC12404Pi(C12408Pm c12408Pm, String str) {
        this.A00 = c12408Pm;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12384PO c12384po;
        String str;
        C12384PO c12384po2;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                str = this.A00.A05;
                if (str.equals(jSONObject.optString(A00(64, 7, 87)))) {
                    this.A00.A0C(EnumC12406Pk.A00(jSONObject.optString(A00(81, 4, 27))), jSONObject.optString(A00(71, 10, 49), A00(85, 2, 32)));
                    return;
                }
                c12384po2 = this.A00.A04;
                c12384po2.A04(AbstractC113568E.A11, A00(0, 30, 47));
            } catch (JSONException e) {
                c12384po = this.A00.A04;
                c12384po.A04(AbstractC113568E.A15, A00(30, 34, 108) + e.getMessage());
            }
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
