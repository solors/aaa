package com.yandex.mobile.ads.impl;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes8.dex */
final class fn1 extends BufferedOutputStream {

    /* renamed from: b */
    private boolean f79188b;

    public fn1(FileOutputStream fileOutputStream, int i) {
        super(fileOutputStream, i);
    }

    /* renamed from: a */
    public final void m34109a(OutputStream outputStream) {
        if (this.f79188b) {
            ((BufferedOutputStream) this).out = outputStream;
            ((BufferedOutputStream) this).count = 0;
            this.f79188b = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f79188b = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i = y32.f88010a;
        throw th;
    }

    public fn1(OutputStream outputStream) {
        super(outputStream);
    }
}
