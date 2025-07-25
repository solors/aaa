package com.google.common.p384io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.MultiInputStream */
/* loaded from: classes4.dex */
final class MultiInputStream extends InputStream {

    /* renamed from: b */
    private Iterator<? extends ByteSource> f41315b;

    /* renamed from: c */
    private InputStream f41316c;

    public MultiInputStream(Iterator<? extends ByteSource> it) throws IOException {
        this.f41315b = (Iterator) Preconditions.checkNotNull(it);
        m68211a();
    }

    /* renamed from: a */
    private void m68211a() throws IOException {
        close();
        if (this.f41315b.hasNext()) {
            this.f41316c = this.f41315b.next().openStream();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f41316c;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f41316c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f41316c = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f41316c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            m68211a();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        InputStream inputStream = this.f41316c;
        if (inputStream == null || j <= 0) {
            return 0L;
        }
        long skip = inputStream.skip(j);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f41316c.skip(j - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Preconditions.checkNotNull(bArr);
        while (true) {
            InputStream inputStream = this.f41316c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                return read;
            }
            m68211a();
        }
    }
}
