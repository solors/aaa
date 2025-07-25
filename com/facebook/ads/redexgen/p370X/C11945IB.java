package com.facebook.ads.redexgen.p370X;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.ads.redexgen.X.IB */
/* loaded from: assets/audience_network.dex */
public final class C11945IB extends BufferedOutputStream {
    public boolean A00;

    public C11945IB(OutputStream outputStream) {
        super(outputStream);
    }

    public C11945IB(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public final void A00(OutputStream outputStream) {
        AbstractC11914Hf.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00 = true;
        Throwable e = null;
        try {
            flush();
        } catch (Throwable th) {
            e = th;
        }
        try {
            this.out.close();
        } catch (Throwable thrown) {
            if (e == null) {
                e = thrown;
            }
        }
        if (e != null) {
            AbstractC11953IK.A0Y(e);
            throw null;
        }
    }
}
