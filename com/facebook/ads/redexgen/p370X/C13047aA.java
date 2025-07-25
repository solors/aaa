package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.aA */
/* loaded from: assets/audience_network.dex */
public class C13047aA extends AbstractRunnableC12086KY {
    public static byte[] A01;
    public static String[] A02 = {"QJHZKkwEEt2XAA8qb811yZkloXTxKqNm", "0Eo8hyAH95ZWxpQDtz3kXr2Dg2BAnbpt", "yx1IzqDtrK1i7eGrpZodHZ", "KUuZPkausU2VOaHnsIAk0Hn07pOf06lA", "ddvRVBlQrtqHFM3JEeiDXs23nPXnVLtA", "0N8fJtCAvq63STI6q3YZ9dLrj33X3xUc", "d0kigy9sFkFC2aZLzfYLsKXCuWX9Z7p3", "u6xVOdZhMjB663K3VBvQukbaw71N5v3b"};
    public final /* synthetic */ C1123765 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 122;
            if (A02[2].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "wsWgA7V3OPhtM2agFx6R9FkGRpDQ8hFC";
            strArr[5] = "5QDbKue07C6BH4ozhF9MSdyiVJUT25MO";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{43, 57, 57, 47, 62, 57};
    }

    static {
        A02();
    }

    public C13047aA(C1123765 c1123765) {
        this.A00 = c1123765;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        Handler handler;
        JSONObject jSONObject;
        C112726f c112726f;
        String str;
        String str2;
        try {
            jSONObject = this.A00.A05;
            JSONArray jSONArray = jSONObject.getJSONArray(A00(0, 6, 48));
            for (int i = 0; i < jSONArray.length(); i++) {
                C1123563 assetData = C1123563.A00(jSONArray.getJSONObject(i));
                this.A00.A09(assetData.A04, assetData);
            }
            c112726f = this.A00.A02;
            C13049aC c13049aC = new C13049aC(this);
            str = this.A00.A04;
            str2 = this.A00.A03;
            c112726f.A0W(c13049aC, new C112656Y(str, str2));
        } catch (JSONException unused) {
            handler = this.A00.A00;
            handler.post(new C13048aB(this));
        }
    }
}
