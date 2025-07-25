package com.inmobi.media;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* renamed from: com.inmobi.media.e3 */
/* loaded from: classes6.dex */
public final class C19254e3 extends FilterOutputStream {

    /* renamed from: a */
    public final /* synthetic */ C19268f3 f48173a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19254e3(C19268f3 c19268f3, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f48173a = c19268f3;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.f48173a.f48197c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.f48173a.f48197c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        try {
            ((FilterOutputStream) this).out.write(i);
        } catch (IOException unused) {
            this.f48173a.f48197c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.f48173a.f48197c = true;
        }
    }
}
