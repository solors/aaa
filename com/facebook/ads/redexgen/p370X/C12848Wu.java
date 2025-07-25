package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Wu */
/* loaded from: assets/audience_network.dex */
public final class C12848Wu implements InterfaceC11872Gz {
    public final int A00;
    public final InterfaceC11872Gz A01;
    public final C11943I8 A02;

    public C12848Wu(InterfaceC11872Gz interfaceC11872Gz, C11943I8 c11943i8, int i) {
        this.A01 = (InterfaceC11872Gz) AbstractC11914Hf.A01(interfaceC11872Gz);
        this.A02 = (C11943I8) AbstractC11914Hf.A01(c11943i8);
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final Uri A8c() {
        return this.A01.A8c();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final long AEE(C11876H3 c11876h3) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.AEE(c11876h3);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i, i2);
    }
}
