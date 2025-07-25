package com.facebook.ads.redexgen.p370X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.H9 */
/* loaded from: assets/audience_network.dex */
public class C11882H9 extends IOException {
    public final int A00;
    public final C11876H3 A01;

    public C11882H9(IOException iOException, C11876H3 c11876h3, int i) {
        super(iOException);
        this.A01 = c11876h3;
        this.A00 = i;
    }

    public C11882H9(String str, C11876H3 c11876h3, int i) {
        super(str);
        this.A01 = c11876h3;
        this.A00 = i;
    }

    public C11882H9(String str, IOException iOException, C11876H3 c11876h3, int i) {
        super(str, iOException);
        this.A01 = c11876h3;
        this.A00 = i;
    }
}
