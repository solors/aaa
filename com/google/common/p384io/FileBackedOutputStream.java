package com.google.common.p384io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* renamed from: com.google.common.io.FileBackedOutputStream */
/* loaded from: classes4.dex */
public final class FileBackedOutputStream extends OutputStream {

    /* renamed from: b */
    private final int f41289b;

    /* renamed from: c */
    private final boolean f41290c;

    /* renamed from: d */
    private final ByteSource f41291d;

    /* renamed from: f */
    private final File f41292f;
    @GuardedBy("this")

    /* renamed from: g */
    private OutputStream f41293g;
    @GuardedBy("this")

    /* renamed from: h */
    private MemoryOutput f41294h;
    @GuardedBy("this")

    /* renamed from: i */
    private File f41295i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.io.FileBackedOutputStream$MemoryOutput */
    /* loaded from: classes4.dex */
    public static class MemoryOutput extends ByteArrayOutputStream {
        private MemoryOutput() {
        }

        /* renamed from: a */
        byte[] m68225a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }
    }

    public FileBackedOutputStream(int i) {
        this(i, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized InputStream m68227b() throws IOException {
        if (this.f41295i != null) {
            return new FileInputStream(this.f41295i);
        }
        Objects.requireNonNull(this.f41294h);
        return new ByteArrayInputStream(this.f41294h.m68225a(), 0, this.f41294h.getCount());
    }

    @GuardedBy("this")
    /* renamed from: e */
    private void m68226e(int i) throws IOException {
        MemoryOutput memoryOutput = this.f41294h;
        if (memoryOutput != null && memoryOutput.getCount() + i > this.f41289b) {
            File createTempFile = File.createTempFile("FileBackedOutputStream", null, this.f41292f);
            if (this.f41290c) {
                createTempFile.deleteOnExit();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.write(this.f41294h.m68225a(), 0, this.f41294h.getCount());
                fileOutputStream.flush();
                this.f41293g = fileOutputStream;
                this.f41295i = createTempFile;
                this.f41294h = null;
            } catch (IOException e) {
                createTempFile.delete();
                throw e;
            }
        }
    }

    public ByteSource asByteSource() {
        return this.f41291d;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f41293g.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        this.f41293g.flush();
    }

    public synchronized void reset() throws IOException {
        close();
        MemoryOutput memoryOutput = this.f41294h;
        if (memoryOutput == null) {
            this.f41294h = new MemoryOutput();
        } else {
            memoryOutput.reset();
        }
        this.f41293g = this.f41294h;
        File file = this.f41295i;
        if (file != null) {
            this.f41295i = null;
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 18);
                sb2.append("Could not delete: ");
                sb2.append(valueOf);
                throw new IOException(sb2.toString());
            }
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) throws IOException {
        m68226e(1);
        this.f41293g.write(i);
    }

    public FileBackedOutputStream(int i, boolean z) {
        this(i, z, null);
    }

    private FileBackedOutputStream(int i, boolean z, File file) {
        this.f41289b = i;
        this.f41290c = z;
        this.f41292f = file;
        MemoryOutput memoryOutput = new MemoryOutput();
        this.f41294h = memoryOutput;
        this.f41293g = memoryOutput;
        if (z) {
            this.f41291d = new ByteSource() { // from class: com.google.common.io.FileBackedOutputStream.1
                protected void finalize() {
                    try {
                        FileBackedOutputStream.this.reset();
                    } catch (Throwable th) {
                        th.printStackTrace(System.err);
                    }
                }

                @Override // com.google.common.p384io.ByteSource
                public InputStream openStream() throws IOException {
                    return FileBackedOutputStream.this.m68227b();
                }
            };
        } else {
            this.f41291d = new ByteSource() { // from class: com.google.common.io.FileBackedOutputStream.2
                @Override // com.google.common.p384io.ByteSource
                public InputStream openStream() throws IOException {
                    return FileBackedOutputStream.this.m68227b();
                }
            };
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        m68226e(i2);
        this.f41293g.write(bArr, i, i2);
    }
}
