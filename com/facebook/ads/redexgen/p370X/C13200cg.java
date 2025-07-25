package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.cg */
/* loaded from: assets/audience_network.dex */
public class C13200cg extends AbstractRunnableC12086KY {
    public static byte[] A02;
    public final /* synthetic */ C109210w A00;
    public final /* synthetic */ String A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{36, 48, 39, 51, 55, 39, 44, 33, 59, 29, 33, 35, 50, 50, 43, 44, 37};
    }

    public C13200cg(C109210w c109210w, String str) {
        this.A00 = c109210w;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        C113257j c113257j;
        C113257j c113257j2;
        CountDownLatch countDownLatch;
        boolean A0J;
        C109200v c109200v;
        C109200v c109200v2;
        C109200v c109200v3;
        String A00 = A00(0, 17, 81);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                c109200v = this.A00.A02;
                ((C109531S) c109200v.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                c109200v2 = this.A00.A02;
                c109200v2.A07(this.A01);
                c109200v3 = this.A00.A02;
                c109200v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            c113257j2 = this.A00.A03;
            c113257j2.A07().AA0(A00, AbstractC113568E.A1B, new C113578F(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c113257j = this.A00.A03;
            c113257j.A07().AA0(A00, AbstractC113568E.A1A, new C113578F(e2));
        }
    }
}
