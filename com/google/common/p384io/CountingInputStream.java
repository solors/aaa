package com.google.common.p384io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* renamed from: com.google.common.io.CountingInputStream */
/* loaded from: classes4.dex */
public final class CountingInputStream extends FilterInputStream {

    /* renamed from: b */
    private long f41286b;

    /* renamed from: c */
    private long f41287c;

    public CountingInputStream(InputStream inputStream) {
        super((InputStream) Preconditions.checkNotNull(inputStream));
        this.f41287c = -1L;
    }

    public long getCount() {
        return this.f41286b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f41287c = this.f41286b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f41286b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f41287c != -1) {
                ((FilterInputStream) this).in.reset();
                this.f41286b = this.f41287c;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(j);
        this.f41286b += skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            this.f41286b += read;
        }
        return read;
    }
}
