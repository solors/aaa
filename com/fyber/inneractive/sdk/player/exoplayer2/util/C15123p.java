package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p */
/* loaded from: classes4.dex */
public final class C15123p extends BufferedOutputStream {

    /* renamed from: a */
    public boolean f29811a;

    public C15123p(C15109b c15109b) {
        super(c15109b);
    }

    /* renamed from: a */
    public final void m77176a(OutputStream outputStream) {
        if (this.f29811a) {
            ((BufferedOutputStream) this).out = outputStream;
            ((BufferedOutputStream) this).count = 0;
            this.f29811a = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f29811a = true;
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
        int i = AbstractC15133z.f29832a;
        throw th;
    }

    public C15123p(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
