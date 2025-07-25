package com.facebook.ads.redexgen.p370X;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.cy */
/* loaded from: assets/audience_network.dex */
public final class C13218cy implements InterfaceC108840K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C13218cy(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108840K
    public final void AEF(int i) throws C13217cx {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108840K
    public final void close() throws C13217cx {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108840K
    public final int length() throws C13217cx {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108840K
    public final int read(byte[] bArr) throws C13217cx {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
