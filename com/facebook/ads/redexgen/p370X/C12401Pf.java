package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.ads.redexgen.X.Pf */
/* loaded from: assets/audience_network.dex */
public final class C12401Pf extends InputStream {
    public static String[] A07 = {"B8lxMUavHKfoRp1ohdiOuIMzoadcXLBz", "taDtiJzBvL", "1gxctnmp", "xW0DP8NMjWRKl", "7bIhL0zS", "nSBO3UXQ6VW4x", "omPJR1lrO3rz1FXfY5MEGpCyJVEjNQz7", "CC4tEEDcP37TF"};
    public int A00;
    public long A01;
    public InterfaceC11872Gz A02;
    public final Uri A03;
    public final C13028Zr A04;
    public final InterfaceC11871Gy A05;
    public final String A06;

    public C12401Pf(C13028Zr c13028Zr, Uri uri, InterfaceC11871Gy interfaceC11871Gy) throws IOException {
        this.A04 = c13028Zr;
        this.A05 = interfaceC11871Gy;
        this.A03 = uri;
        this.A06 = C12516RW.A08(this.A04, this.A03);
        A00(0);
    }

    private void A00(int i) throws IOException {
        if (this.A02 != null) {
            this.A02.close();
        }
        this.A02 = this.A05.A4t();
        this.A01 = (int) this.A02.AEE(new C11876H3(this.A03, i, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b = new byte[1];
        return read(b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.A02.read(bArr, i, i2);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = this.A01 - this.A00;
        if (j2 <= 0) {
            return 0L;
        }
        if (j > j2) {
            j = j2;
        }
        this.A00 = (int) (this.A00 + j);
        A00(this.A00);
        if (A07[0].charAt(28) != 'X') {
            throw new RuntimeException();
        }
        A07[1] = "2";
        return j;
    }
}
