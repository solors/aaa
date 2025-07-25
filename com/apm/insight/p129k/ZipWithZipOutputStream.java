package com.apm.insight.p129k;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.apm.insight.k.k */
/* loaded from: classes2.dex */
public final class ZipWithZipOutputStream extends GZIPOutputStream {
    public ZipWithZipOutputStream(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    /* renamed from: a */
    public final void m101763a() throws IOException {
        super.close();
    }

    /* renamed from: b */
    public final void m101762b() throws IOException {
        super.finish();
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.util.zip.GZIPOutputStream, java.util.zip.DeflaterOutputStream
    public final void finish() throws IOException {
    }
}
