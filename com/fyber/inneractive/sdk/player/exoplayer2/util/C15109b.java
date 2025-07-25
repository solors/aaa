package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.b */
/* loaded from: classes4.dex */
public final class C15109b extends OutputStream {

    /* renamed from: a */
    public final FileOutputStream f29770a;

    /* renamed from: b */
    public boolean f29771b = false;

    public C15109b(File file) {
        this.f29770a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f29771b) {
            return;
        }
        this.f29771b = true;
        this.f29770a.flush();
        try {
            this.f29770a.getFD().sync();
        } catch (IOException e) {
            Log.w("AtomicFile", "Failed to sync file descriptor:", e);
        }
        this.f29770a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f29770a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f29770a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f29770a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f29770a.write(bArr, i, i2);
    }
}
