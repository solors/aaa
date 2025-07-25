package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.pgl.ssdk.l */
/* loaded from: classes7.dex */
public class C26644l implements InterfaceC26651o {

    /* renamed from: a */
    private final FileChannel f69917a;

    /* renamed from: b */
    private final long f69918b;

    /* renamed from: c */
    private final long f69919c;

    public C26644l(FileChannel fileChannel, long j, long j2) {
        if (j >= 0) {
            if (j2 >= 0) {
                this.f69917a = fileChannel;
                this.f69918b = j;
                this.f69919c = j2;
                return;
            }
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j2)));
        }
        throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j2)));
    }

    @Override // com.pgl.ssdk.InterfaceC26651o
    /* renamed from: b */
    public C26644l mo40804a(long j, long j2) {
        long mo40806a = mo40806a();
        m40836a(j, j2, mo40806a);
        if (j == 0 && j2 == mo40806a) {
            return this;
        }
        return new C26644l(this.f69917a, this.f69918b + j, j2);
    }

    @Override // com.pgl.ssdk.InterfaceC26651o
    /* renamed from: a */
    public long mo40806a() {
        long j = this.f69919c;
        if (j == -1) {
            try {
                return this.f69917a.size();
            } catch (IOException unused) {
                return 0L;
            }
        }
        return j;
    }

    /* renamed from: a */
    public void m40837a(long j, int i, ByteBuffer byteBuffer) throws IOException {
        int read;
        m40836a(j, i, mo40806a());
        if (i == 0) {
            return;
        }
        if (i <= byteBuffer.remaining()) {
            long j2 = this.f69918b + j;
            int limit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + i);
                while (i > 0) {
                    synchronized (this.f69917a) {
                        this.f69917a.position(j2);
                        read = this.f69917a.read(byteBuffer);
                    }
                    j2 += read;
                    i -= read;
                }
                return;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new BufferOverflowException();
    }

    @Override // com.pgl.ssdk.InterfaceC26651o
    /* renamed from: a */
    public ByteBuffer mo40805a(long j, int i) throws IOException {
        if (i >= 0) {
            ByteBuffer allocate = ByteBuffer.allocate(i);
            m40837a(j, i, allocate);
            allocate.flip();
            return allocate;
        }
        throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    private static void m40836a(long j, long j2, long j3) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j2)));
        }
        if (j > j3) {
            throw new IndexOutOfBoundsException("offset (" + j + ") > source size (" + j3 + ")");
        }
        long j4 = j + j2;
        if (j4 < j) {
            throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") overflow");
        } else if (j4 <= j3) {
        } else {
            throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") > source size (" + j3 + ")");
        }
    }
}
