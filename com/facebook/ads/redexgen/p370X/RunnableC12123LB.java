package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.LB */
/* loaded from: assets/audience_network.dex */
public class RunnableC12123LB implements Runnable {
    public static String[] A04 = {"nCRFoG2V5rxtp9CJ0zj2vqX2pOjohwfk", "4wjnoNx3VOTWdL7VvzY4PdOFwDa8aAyk", "NZwRvgeKfVOQj3OAbWBZydUCa0", "QhytIBUnuaSIq9HsTJzjLcd0Gyd", "BSNgfeEt9bBv41mFKDcPuiwW51mPbBL", "ThuVKQMdtpTlOVe04IgNONUKoYEgRLHM", "EXwZjrYuwLfsbcbpnacjwuDYCB43acny", "AVskEroBo8UlfYPInQ7Yx5KSddGfFQyi"};
    public final /* synthetic */ C13028Zr A00;
    public final /* synthetic */ InterfaceC12147LZ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ int[] A03;

    public RunnableC12123LB(int[] iArr, String str, C13028Zr c13028Zr, InterfaceC12147LZ interfaceC12147LZ) {
        this.A03 = iArr;
        this.A02 = str;
        this.A00 = c13028Zr;
        this.A01 = interfaceC12147LZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean A08;
        Handler handler;
        Handler handler2;
        Set set;
        Handler handler3;
        Set set2;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            int[] iArr = this.A03;
            iArr[0] = iArr[0] + 1000;
            int i = this.A03[0];
            if (A04[5].charAt(0) == 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "K9ogtrTQz9r2EYsYEG2F5l0cYywtmYZ4";
            strArr[7] = "6mL3lrEUp2ULAISFIzSh85ZjlbRVvlWv";
            if (i > 600000) {
                handler3 = AbstractC12124LC.A02;
                handler3.removeCallbacks(this);
                set2 = AbstractC12124LC.A03;
                set2.remove(this.A02);
                return;
            }
            A08 = AbstractC12124LC.A08(this.A00.getPackageManager(), this.A02);
            if (A08) {
                handler2 = AbstractC12124LC.A02;
                handler2.removeCallbacks(this);
                set = AbstractC12124LC.A03;
                set.remove(this.A02);
                this.A01.ACv(this.A02);
                return;
            }
            handler = AbstractC12124LC.A02;
            handler.postDelayed(this, 1000L);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            if (A04[2].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "FQThdvyXjGVQZyAeyGp3f4l1pRfTgr0";
            strArr2[3] = "sqm3iAA5OiJF7R8ZxJPsoNc3WTf";
        }
    }
}
