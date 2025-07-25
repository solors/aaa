package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.ch */
/* loaded from: assets/audience_network.dex */
public class C13201ch extends AbstractRunnableC12086KY {
    public static byte[] A02;
    public final /* synthetic */ C109210w A00;
    public final /* synthetic */ String A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C13201ch(C109210w c109210w, String str) {
        this.A00 = c109210w;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        C113257j c113257j;
        C113257j c113257j2;
        CountDownLatch countDownLatch;
        C109200v c109200v;
        C109200v c109200v2;
        C109200v c109200v3;
        boolean A0J;
        C109200v c109200v4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            c109200v = this.A00.A02;
            synchronized (c109200v) {
                c109200v2 = this.A00.A02;
                Iterator<String> keys = c109200v2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        C109210w c109210w = this.A00;
                        c109200v4 = this.A00.A02;
                        c109210w.A0E((C109531S) c109200v4.A05().get(next), next, next.equals(this.A01));
                    }
                }
                c109200v3 = this.A00.A02;
                c109200v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            c113257j2 = this.A00.A03;
            InterfaceC113558D A07 = c113257j2.A07();
            String encryptedId = A00(0, 17, 22);
            A07.AA0(encryptedId, AbstractC113568E.A1B, new C113578F(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c113257j = this.A00.A03;
            InterfaceC113558D A072 = c113257j.A07();
            String encryptedId2 = A00(0, 17, 22);
            A072.AA0(encryptedId2, AbstractC113568E.A1A, new C113578F(e2));
        }
    }
}
