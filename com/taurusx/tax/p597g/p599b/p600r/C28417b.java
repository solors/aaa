package com.taurusx.tax.p597g.p599b.p600r;

import com.maticoo.sdk.videocache.file.FileCache;
import com.taurusx.tax.p597g.p599b.C28411m;
import com.taurusx.tax.p597g.p599b.InterfaceC28394a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.taurusx.tax.g.b.r.b */
/* loaded from: classes7.dex */
public class C28417b implements InterfaceC28394a {

    /* renamed from: a */
    public final InterfaceC28416a f73840a;

    /* renamed from: b */
    public File f73841b;

    /* renamed from: c */
    public RandomAccessFile f73842c;

    public C28417b(File file, InterfaceC28416a interfaceC28416a) throws C28411m {
        File file2;
        String str;
        try {
            if (interfaceC28416a != null) {
                this.f73840a = interfaceC28416a;
                C28418c.m38103a(file.getParentFile());
                boolean exists = file.exists();
                if (exists) {
                    file2 = file;
                } else {
                    File parentFile = file.getParentFile();
                    file2 = new File(parentFile, file.getName() + FileCache.TEMP_POSTFIX);
                }
                this.f73841b = file2;
                File file3 = this.f73841b;
                if (exists) {
                    str = "r";
                } else {
                    str = "rw";
                }
                this.f73842c = new RandomAccessFile(file3, str);
                return;
            }
            throw new NullPointerException();
        } catch (IOException e) {
            throw new C28411m("Error using file " + file + " as disc cache", e);
        }
    }

    @Override // com.taurusx.tax.p597g.p599b.InterfaceC28394a
    /* renamed from: a */
    public synchronized int mo38106a(byte[] bArr, long j, int i) throws C28411m {
        try {
            this.f73842c.seek(j);
        } catch (IOException e) {
            throw new C28411m(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(mo38105b()), Integer.valueOf(bArr.length)), e);
        }
        return this.f73842c.read(bArr, 0, i);
    }

    @Override // com.taurusx.tax.p597g.p599b.InterfaceC28394a
    /* renamed from: b */
    public synchronized long mo38105b() throws C28411m {
        try {
        } catch (IOException e) {
            throw new C28411m("Error reading length of file " + this.f73841b, e);
        }
        return (int) this.f73842c.length();
    }

    @Override // com.taurusx.tax.p597g.p599b.InterfaceC28394a
    /* renamed from: c */
    public synchronized boolean mo38104c() {
        return !this.f73841b.getName().endsWith(FileCache.TEMP_POSTFIX);
    }

    @Override // com.taurusx.tax.p597g.p599b.InterfaceC28394a
    public synchronized void close() throws C28411m {
        try {
            this.f73842c.close();
            ((AbstractC28420d) this.f73840a).m38101a(this.f73841b);
        } catch (IOException e) {
            throw new C28411m("Error closing file " + this.f73841b, e);
        }
    }

    @Override // com.taurusx.tax.p597g.p599b.InterfaceC28394a
    /* renamed from: a */
    public synchronized void mo38107a(byte[] bArr, int i) throws C28411m {
        try {
            if (!mo38104c()) {
                this.f73842c.seek(mo38105b());
                this.f73842c.write(bArr, 0, i);
            } else {
                throw new C28411m("Error append cache: cache file " + this.f73841b + " is completed!");
            }
        } catch (IOException e) {
            throw new C28411m(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i), this.f73842c, Integer.valueOf(bArr.length)), e);
        }
    }

    @Override // com.taurusx.tax.p597g.p599b.InterfaceC28394a
    /* renamed from: a */
    public synchronized void mo38108a() throws C28411m {
        if (mo38104c()) {
            return;
        }
        close();
        File file = new File(this.f73841b.getParentFile(), this.f73841b.getName().substring(0, this.f73841b.getName().length() - 9));
        if (this.f73841b.renameTo(file)) {
            this.f73841b = file;
            try {
                this.f73842c = new RandomAccessFile(this.f73841b, "r");
                ((AbstractC28420d) this.f73840a).m38101a(this.f73841b);
                return;
            } catch (IOException e) {
                throw new C28411m("Error opening " + this.f73841b + " as disc cache", e);
            }
        }
        throw new C28411m("Error renaming file " + this.f73841b + " to " + file + " for completion!");
    }
}
