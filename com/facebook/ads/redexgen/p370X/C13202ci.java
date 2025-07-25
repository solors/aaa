package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ci */
/* loaded from: assets/audience_network.dex */
public class C13202ci extends AbstractRunnableC12086KY {
    public static byte[] A02;
    public final /* synthetic */ C109210w A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 97, 118, 98, 102, 118, 125, 112, 106, 76, 112, 114, 99, 99, 122, 125, 116};
    }

    public C13202ci(C109210w c109210w, JSONObject jSONObject) {
        this.A00 = c109210w;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        C113257j c113257j;
        C113257j c113257j2;
        CountDownLatch countDownLatch;
        C109200v c109200v;
        C109200v c109200v2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c109200v = this.A00.A02;
            synchronized (c109200v) {
                c109200v2 = this.A00.A02;
                c109200v2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e) {
            c113257j2 = this.A00.A03;
            c113257j2.A07().AA0(A00(0, 17, 25), AbstractC113568E.A1B, new C113578F(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c113257j = this.A00.A03;
            c113257j.A07().AA0(A00(0, 17, 25), AbstractC113568E.A1A, new C113578F(e2));
        }
    }
}
