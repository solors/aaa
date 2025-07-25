package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC31296rl;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.yandex.mobile.ads.impl.ul */
/* loaded from: classes8.dex */
public final class C31592ul implements InterfaceC30580iu {

    /* renamed from: a */
    private final InterfaceC31296rl f86318a;

    /* renamed from: b */
    private final long f86319b = 5242880;

    /* renamed from: c */
    private final int f86320c = 20480;
    @Nullable

    /* renamed from: d */
    private C30976nu f86321d;

    /* renamed from: e */
    private long f86322e;
    @Nullable

    /* renamed from: f */
    private File f86323f;
    @Nullable

    /* renamed from: g */
    private OutputStream f86324g;

    /* renamed from: h */
    private long f86325h;

    /* renamed from: i */
    private long f86326i;

    /* renamed from: j */
    private fn1 f86327j;

    /* renamed from: com.yandex.mobile.ads.impl.ul$a */
    /* loaded from: classes8.dex */
    public static final class C31593a extends InterfaceC31296rl.C31297a {
        public C31593a(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ul$b */
    /* loaded from: classes8.dex */
    public static final class C31594b {

        /* renamed from: a */
        private InterfaceC31296rl f86328a;

        /* renamed from: a */
        public final C31594b m28735a(InterfaceC31296rl interfaceC31296rl) {
            this.f86328a = interfaceC31296rl;
            return this;
        }

        /* renamed from: a */
        public final C31592ul m28736a() {
            InterfaceC31296rl interfaceC31296rl = this.f86328a;
            interfaceC31296rl.getClass();
            return new C31592ul(interfaceC31296rl);
        }
    }

    public C31592ul(InterfaceC31296rl interfaceC31296rl) {
        this.f86318a = (InterfaceC31296rl) C30937nf.m31570a(interfaceC31296rl);
    }

    /* renamed from: a */
    private void m28739a() throws IOException {
        OutputStream outputStream = this.f86324g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            y32.m27078a((Closeable) this.f86324g);
            this.f86324g = null;
            File file = this.f86323f;
            this.f86323f = null;
            this.f86318a.mo27762a(file, this.f86325h);
        } catch (Throwable th) {
            y32.m27078a((Closeable) this.f86324g);
            this.f86324g = null;
            File file2 = this.f86323f;
            this.f86323f = null;
            file2.delete();
            throw th;
        }
    }

    /* renamed from: b */
    private void m28737b(C30976nu c30976nu) throws IOException {
        long j = c30976nu.f83117g;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.f86326i, this.f86322e);
        }
        InterfaceC31296rl interfaceC31296rl = this.f86318a;
        String str = c30976nu.f83118h;
        int i = y32.f88010a;
        this.f86323f = interfaceC31296rl.mo27759a(str, c30976nu.f83116f + this.f86326i, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f86323f);
        if (this.f86320c > 0) {
            fn1 fn1Var = this.f86327j;
            if (fn1Var == null) {
                this.f86327j = new fn1(fileOutputStream, this.f86320c);
            } else {
                fn1Var.m34109a(fileOutputStream);
            }
            this.f86324g = this.f86327j;
        } else {
            this.f86324g = fileOutputStream;
        }
        this.f86325h = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30580iu
    public final void close() throws C31593a {
        if (this.f86321d == null) {
            return;
        }
        try {
            m28739a();
        } catch (IOException e) {
            throw new C31593a(e);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30580iu
    public final void write(byte[] bArr, int i, int i2) throws C31593a {
        C30976nu c30976nu = this.f86321d;
        if (c30976nu == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f86325h == this.f86322e) {
                    m28739a();
                    m28737b(c30976nu);
                }
                int min = (int) Math.min(i2 - i3, this.f86322e - this.f86325h);
                OutputStream outputStream = this.f86324g;
                int i4 = y32.f88010a;
                outputStream.write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.f86325h += j;
                this.f86326i += j;
            } catch (IOException e) {
                throw new C31593a(e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30580iu
    /* renamed from: a */
    public final void mo28738a(C30976nu c30976nu) throws C31593a {
        c30976nu.f83118h.getClass();
        if (c30976nu.f83117g == -1 && (c30976nu.f83119i & 2) == 2) {
            this.f86321d = null;
            return;
        }
        this.f86321d = c30976nu;
        this.f86322e = (c30976nu.f83119i & 4) == 4 ? this.f86319b : Long.MAX_VALUE;
        this.f86326i = 0L;
        try {
            m28737b(c30976nu);
        } catch (IOException e) {
            throw new C31593a(e);
        }
    }
}
