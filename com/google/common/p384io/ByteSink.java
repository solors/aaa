package com.google.common.p384io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.ByteSink */
/* loaded from: classes4.dex */
public abstract class ByteSink {

    /* renamed from: com.google.common.io.ByteSink$AsCharSink */
    /* loaded from: classes4.dex */
    private final class AsCharSink extends CharSink {

        /* renamed from: a */
        private final Charset f41249a;

        @Override // com.google.common.p384io.CharSink
        public Writer openStream() throws IOException {
            return new OutputStreamWriter(ByteSink.this.openStream(), this.f41249a);
        }

        public String toString() {
            String obj = ByteSink.this.toString();
            String valueOf = String.valueOf(this.f41249a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 13 + valueOf.length());
            sb2.append(obj);
            sb2.append(".asCharSink(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }

        private AsCharSink(Charset charset) {
            this.f41249a = (Charset) Preconditions.checkNotNull(charset);
        }
    }

    public CharSink asCharSink(Charset charset) {
        return new AsCharSink(charset);
    }

    public OutputStream openBufferedStream() throws IOException {
        OutputStream openStream = openStream();
        if (openStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) openStream;
        }
        return new BufferedOutputStream(openStream);
    }

    public abstract OutputStream openStream() throws IOException;

    public void write(byte[] bArr) throws IOException {
        Preconditions.checkNotNull(bArr);
        try {
            OutputStream outputStream = (OutputStream) Closer.create().register(openStream());
            outputStream.write(bArr);
            outputStream.flush();
        } finally {
        }
    }

    @CanIgnoreReturnValue
    public long writeFrom(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        try {
            OutputStream outputStream = (OutputStream) Closer.create().register(openStream());
            long copy = ByteStreams.copy(inputStream, outputStream);
            outputStream.flush();
            return copy;
        } finally {
        }
    }
}
