package com.google.common.p384io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.AppendableWriter */
/* loaded from: classes4.dex */
class AppendableWriter extends Writer {

    /* renamed from: b */
    private final Appendable f41203b;

    /* renamed from: c */
    private boolean f41204c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppendableWriter(Appendable appendable) {
        this.f41203b = (Appendable) Preconditions.checkNotNull(appendable);
    }

    /* renamed from: a */
    private void m68272a() throws IOException {
        if (!this.f41204c) {
            return;
        }
        throw new IOException("Cannot write to a closed writer.");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41204c = true;
        Appendable appendable = this.f41203b;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        m68272a();
        Appendable appendable = this.f41203b;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        m68272a();
        this.f41203b.append(new String(cArr, i, i2));
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        m68272a();
        this.f41203b.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        m68272a();
        this.f41203b.append(c);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        Preconditions.checkNotNull(str);
        m68272a();
        this.f41203b.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        m68272a();
        this.f41203b.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        m68272a();
        this.f41203b.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        Preconditions.checkNotNull(str);
        m68272a();
        this.f41203b.append(str, i, i2 + i);
    }
}
