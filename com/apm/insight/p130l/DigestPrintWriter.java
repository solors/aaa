package com.apm.insight.p130l;

import androidx.annotation.NonNull;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.apm.insight.l.e */
/* loaded from: classes2.dex */
public final class DigestPrintWriter extends PrintWriter {

    /* renamed from: a */
    private MessageDigest f3918a;

    /* renamed from: b */
    private Charset f3919b;

    /* renamed from: c */
    private C3821a f3920c;

    /* compiled from: DigestPrintWriter.java */
    /* renamed from: com.apm.insight.l.e$a */
    /* loaded from: classes2.dex */
    public static class C3821a {
        /* renamed from: a */
        public boolean mo101729a(String str) {
            return true;
        }
    }

    public DigestPrintWriter(@NonNull OutputStream outputStream, MessageDigest messageDigest, C3821a c3821a) {
        super(outputStream);
        this.f3919b = null;
        this.f3918a = messageDigest;
        this.f3920c = c3821a;
        if (messageDigest != null) {
            this.f3919b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(@NonNull char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.f3918a;
        if (messageDigest != null) {
            messageDigest.update(this.f3919b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.f3918a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(@NonNull String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.f3918a != null) {
            C3821a c3821a = this.f3920c;
            if (c3821a == null || c3821a.mo101729a(str)) {
                this.f3918a.update(this.f3919b.encode(CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }
}
