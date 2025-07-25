package com.google.android.exoplayer2.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class AtomicFile {

    /* renamed from: a */
    private final File f36040a;

    /* renamed from: b */
    private final File f36041b;

    /* loaded from: classes4.dex */
    private static final class AtomicFileOutputStream extends OutputStream {

        /* renamed from: b */
        private final FileOutputStream f36042b;

        /* renamed from: c */
        private boolean f36043c = false;

        public AtomicFileOutputStream(File file) throws FileNotFoundException {
            this.f36042b = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f36043c) {
                return;
            }
            this.f36043c = true;
            flush();
            try {
                this.f36042b.getFD().sync();
            } catch (IOException e) {
                Log.m72601w("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.f36042b.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f36042b.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f36042b.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f36042b.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f36042b.write(bArr, i, i2);
        }
    }

    public AtomicFile(File file) {
        this.f36040a = file;
        this.f36041b = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    private void m72672a() {
        if (this.f36041b.exists()) {
            this.f36040a.delete();
            this.f36041b.renameTo(this.f36040a);
        }
    }

    public void delete() {
        this.f36040a.delete();
        this.f36041b.delete();
    }

    public void endWrite(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f36041b.delete();
    }

    public boolean exists() {
        if (!this.f36040a.exists() && !this.f36041b.exists()) {
            return false;
        }
        return true;
    }

    public InputStream openRead() throws FileNotFoundException {
        m72672a();
        return new FileInputStream(this.f36040a);
    }

    public OutputStream startWrite() throws IOException {
        if (this.f36040a.exists()) {
            if (!this.f36041b.exists()) {
                if (!this.f36040a.renameTo(this.f36041b)) {
                    Log.m72602w("AtomicFile", "Couldn't rename file " + this.f36040a + " to backup file " + this.f36041b);
                }
            } else {
                this.f36040a.delete();
            }
        }
        try {
            return new AtomicFileOutputStream(this.f36040a);
        } catch (FileNotFoundException e) {
            File parentFile = this.f36040a.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    return new AtomicFileOutputStream(this.f36040a);
                } catch (FileNotFoundException e2) {
                    throw new IOException("Couldn't create " + this.f36040a, e2);
                }
            }
            throw new IOException("Couldn't create " + this.f36040a, e);
        }
    }
}
