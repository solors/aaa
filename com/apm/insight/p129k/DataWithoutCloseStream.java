package com.apm.insight.p129k;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.apm.insight.k.f */
/* loaded from: classes2.dex */
public final class DataWithoutCloseStream extends DataOutputStream {
    public DataWithoutCloseStream(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public final void m101794a() throws IOException {
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
