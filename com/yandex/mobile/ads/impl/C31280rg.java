package com.yandex.mobile.ads.impl;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.yandex.mobile.ads.impl.rg */
/* loaded from: classes8.dex */
public final class C31280rg {

    /* renamed from: a */
    private final File f84745a;

    /* renamed from: b */
    private final File f84746b;

    /* renamed from: com.yandex.mobile.ads.impl.rg$a */
    /* loaded from: classes8.dex */
    private static final class C31281a extends OutputStream {

        /* renamed from: b */
        private final FileOutputStream f84747b;

        /* renamed from: c */
        private boolean f84748c = false;

        public C31281a(File file) throws FileNotFoundException {
            this.f84747b = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f84748c) {
                return;
            }
            this.f84748c = true;
            this.f84747b.flush();
            try {
                this.f84747b.getFD().sync();
            } catch (IOException e) {
                gq0.m33794b("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.f84747b.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f84747b.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.f84747b.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f84747b.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.f84747b.write(bArr, i, i2);
        }
    }

    public C31280rg(File file) {
        this.f84745a = file;
        this.f84746b = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public final void m30056a() {
        this.f84745a.delete();
        this.f84746b.delete();
    }

    /* renamed from: b */
    public final boolean m30054b() {
        if (!this.f84745a.exists() && !this.f84746b.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final FileInputStream m30053c() throws FileNotFoundException {
        if (this.f84746b.exists()) {
            this.f84745a.delete();
            this.f84746b.renameTo(this.f84745a);
        }
        return new FileInputStream(this.f84745a);
    }

    /* renamed from: d */
    public final OutputStream m30052d() throws IOException {
        if (this.f84745a.exists()) {
            if (!this.f84746b.exists()) {
                if (!this.f84745a.renameTo(this.f84746b)) {
                    gq0.m33792d("AtomicFile", "Couldn't rename file " + this.f84745a + " to backup file " + this.f84746b);
                }
            } else {
                this.f84745a.delete();
            }
        }
        try {
            return new C31281a(this.f84745a);
        } catch (FileNotFoundException e) {
            File parentFile = this.f84745a.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    return new C31281a(this.f84745a);
                } catch (FileNotFoundException e2) {
                    throw new IOException("Couldn't create " + this.f84745a, e2);
                }
            }
            throw new IOException("Couldn't create " + this.f84745a, e);
        }
    }

    /* renamed from: a */
    public final void m30055a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.close();
        this.f84746b.delete();
    }
}
