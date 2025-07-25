package com.google.common.p384io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.CharSequenceReader */
/* loaded from: classes4.dex */
final class CharSequenceReader extends Reader {

    /* renamed from: b */
    private CharSequence f41267b;

    /* renamed from: c */
    private int f41268c;

    /* renamed from: d */
    private int f41269d;

    public CharSequenceReader(CharSequence charSequence) {
        this.f41267b = (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    /* renamed from: a */
    private void m68242a() throws IOException {
        if (this.f41267b != null) {
            return;
        }
        throw new IOException("reader closed");
    }

    /* renamed from: b */
    private boolean m68241b() {
        if (m68240e() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private int m68240e() {
        Objects.requireNonNull(this.f41267b);
        return this.f41267b.length() - this.f41268c;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f41267b = null;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i) throws IOException {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "readAheadLimit (%s) may not be negative", i);
        m68242a();
        this.f41269d = this.f41268c;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) throws IOException {
        Preconditions.checkNotNull(charBuffer);
        m68242a();
        Objects.requireNonNull(this.f41267b);
        if (m68241b()) {
            int min = Math.min(charBuffer.remaining(), m68240e());
            for (int i = 0; i < min; i++) {
                CharSequence charSequence = this.f41267b;
                int i2 = this.f41268c;
                this.f41268c = i2 + 1;
                charBuffer.put(charSequence.charAt(i2));
            }
            return min;
        }
        return -1;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        m68242a();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        m68242a();
        this.f41268c = this.f41269d;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j) throws IOException {
        boolean z;
        int min;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "n (%s) may not be negative", j);
        m68242a();
        min = (int) Math.min(m68240e(), j);
        this.f41268c += min;
        return min;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        char c;
        m68242a();
        Objects.requireNonNull(this.f41267b);
        if (m68241b()) {
            CharSequence charSequence = this.f41267b;
            int i = this.f41268c;
            this.f41268c = i + 1;
            c = charSequence.charAt(i);
        } else {
            c = 65535;
        }
        return c;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i, int i2) throws IOException {
        Preconditions.checkPositionIndexes(i, i + i2, cArr.length);
        m68242a();
        Objects.requireNonNull(this.f41267b);
        if (m68241b()) {
            int min = Math.min(i2, m68240e());
            for (int i3 = 0; i3 < min; i3++) {
                CharSequence charSequence = this.f41267b;
                int i4 = this.f41268c;
                this.f41268c = i4 + 1;
                cArr[i + i3] = charSequence.charAt(i4);
            }
            return min;
        }
        return -1;
    }
}
