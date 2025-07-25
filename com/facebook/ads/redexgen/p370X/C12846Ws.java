package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ws */
/* loaded from: assets/audience_network.dex */
public final class C12846Ws implements InterfaceC11872Gz {
    public long A00;
    public boolean A01;
    public final InterfaceC11870Gx A02;
    public final InterfaceC11872Gz A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final long AEE(C11876H3 c11876h3) throws IOException {
        this.A00 = this.A03.AEE(c11876h3);
        if (this.A00 == 0) {
            return 0L;
        }
        if (c11876h3.A02 == -1 && this.A00 != -1) {
            c11876h3 = new C11876H3(c11876h3.A04, c11876h3.A01, c11876h3.A03, this.A00, c11876h3.A05, c11876h3.A00);
        }
        this.A01 = true;
        this.A02.AEG(c11876h3);
        return this.A00;
    }

    public C12846Ws(InterfaceC11872Gz interfaceC11872Gz, InterfaceC11870Gx interfaceC11870Gx) {
        this.A03 = (InterfaceC11872Gz) AbstractC11914Hf.A01(interfaceC11872Gz);
        this.A02 = (InterfaceC11870Gx) AbstractC11914Hf.A01(interfaceC11870Gx);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final Uri A8c() {
        return this.A03.A8c();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final void close() throws IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i, i2);
        if (read > 0) {
            this.A02.write(bArr, i, read);
            int bytesRead = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
            if (bytesRead != 0) {
                this.A00 -= read;
            }
        }
        return read;
    }
}
