package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C30198dy;
import com.yandex.mobile.ads.impl.C31592ul;
import com.yandex.mobile.ads.impl.InterfaceC30672ju;
import com.yandex.mobile.ads.impl.InterfaceC31296rl;
import com.yandex.mobile.ads.impl.u80;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.vl */
/* loaded from: classes8.dex */
public final class C31666vl implements InterfaceC30672ju {

    /* renamed from: a */
    private final InterfaceC31296rl f86786a;

    /* renamed from: b */
    private final InterfaceC30672ju f86787b;
    @Nullable

    /* renamed from: c */
    private final pz1 f86788c;

    /* renamed from: d */
    private final InterfaceC30672ju f86789d;

    /* renamed from: e */
    private final InterfaceC30179dm f86790e;

    /* renamed from: f */
    private final boolean f86791f;

    /* renamed from: g */
    private final boolean f86792g;

    /* renamed from: h */
    private final boolean f86793h;
    @Nullable

    /* renamed from: i */
    private Uri f86794i;
    @Nullable

    /* renamed from: j */
    private C30976nu f86795j;
    @Nullable

    /* renamed from: k */
    private C30976nu f86796k;
    @Nullable

    /* renamed from: l */
    private InterfaceC30672ju f86797l;

    /* renamed from: m */
    private long f86798m;

    /* renamed from: n */
    private long f86799n;

    /* renamed from: o */
    private long f86800o;
    @Nullable

    /* renamed from: p */
    private C30255em f86801p;

    /* renamed from: q */
    private boolean f86802q;

    /* renamed from: r */
    private boolean f86803r;

    /* renamed from: s */
    private long f86804s;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.mobile.ads.impl.nu, com.yandex.mobile.ads.impl.ju, com.yandex.mobile.ads.impl.em] */
    /* renamed from: e */
    private void m28289e() throws IOException {
        InterfaceC30672ju interfaceC30672ju = this.f86797l;
        if (interfaceC30672ju == null) {
            return;
        }
        try {
            interfaceC30672ju.close();
        } finally {
            this.f86796k = null;
            this.f86797l = null;
            C30255em c30255em = this.f86801p;
            if (c30255em != null) {
                this.f86786a.mo27756b(c30255em);
                this.f86801p = null;
            }
        }
    }

    /* renamed from: h */
    private boolean m28286h() {
        if (this.f86797l == this.f86787b) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final void mo28290a(y12 y12Var) {
        y12Var.getClass();
        this.f86787b.mo28290a(y12Var);
        this.f86789d.mo28290a(y12Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final void close() throws IOException {
        this.f86795j = null;
        this.f86794i = null;
        this.f86799n = 0L;
        try {
            m28289e();
        } catch (Throwable th) {
            if (m28286h() || (th instanceof InterfaceC31296rl.C31297a)) {
                this.f86802q = true;
            }
            throw th;
        }
    }

    /* renamed from: f */
    public final InterfaceC31296rl m28288f() {
        return this.f86786a;
    }

    /* renamed from: g */
    public final InterfaceC30179dm m28287g() {
        return this.f86790e;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final Map<String, List<String>> getResponseHeaders() {
        if (!m28286h()) {
            return this.f86789d.getResponseHeaders();
        }
        return Collections.emptyMap();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    @Nullable
    public final Uri getUri() {
        return this.f86794i;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30417gu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        if (this.f86800o == 0) {
            return -1;
        }
        C30976nu c30976nu = this.f86795j;
        c30976nu.getClass();
        C30976nu c30976nu2 = this.f86796k;
        c30976nu2.getClass();
        try {
            if (this.f86799n >= this.f86804s) {
                m28291a(c30976nu, true);
            }
            InterfaceC30672ju interfaceC30672ju = this.f86797l;
            interfaceC30672ju.getClass();
            int read = interfaceC30672ju.read(bArr, i, i2);
            if (read != -1) {
                long j = read;
                this.f86799n += j;
                this.f86798m += j;
                long j2 = this.f86800o;
                if (j2 != -1) {
                    this.f86800o = j2 - j;
                }
                return read;
            }
            if (!m28286h()) {
                long j3 = c30976nu2.f83117g;
                if (j3 != -1) {
                    i3 = read;
                    if (this.f86798m < j3) {
                    }
                } else {
                    i3 = read;
                }
                String str = c30976nu.f83118h;
                int i4 = y32.f88010a;
                this.f86800o = 0L;
                if (this.f86797l == this.f86788c) {
                    C31762wq c31762wq = new C31762wq();
                    C31762wq.m27856a(c31762wq, this.f86799n);
                    this.f86786a.mo27758a(str, c31762wq);
                    return i3;
                }
                return i3;
            }
            i3 = read;
            long j4 = this.f86800o;
            if (j4 <= 0 && j4 != -1) {
                return i3;
            }
            m28289e();
            m28291a(c30976nu, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (m28286h() || (th instanceof InterfaceC31296rl.C31297a)) {
                this.f86802q = true;
            }
            throw th;
        }
    }

    private C31666vl(InterfaceC31296rl interfaceC31296rl, @Nullable InterfaceC30672ju interfaceC30672ju, u80 u80Var, @Nullable C31592ul c31592ul, @Nullable InterfaceC30179dm interfaceC30179dm, int i, int i2) {
        this.f86786a = interfaceC31296rl;
        this.f86787b = u80Var;
        this.f86790e = interfaceC30179dm == null ? InterfaceC30179dm.f78197a : interfaceC30179dm;
        this.f86791f = (i & 1) != 0;
        this.f86792g = false;
        this.f86793h = false;
        if (interfaceC30672ju != null) {
            this.f86789d = interfaceC30672ju;
            this.f86788c = c31592ul != null ? new pz1(interfaceC30672ju, c31592ul) : null;
            return;
        }
        this.f86789d = nd1.f82701a;
        this.f86788c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009d A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:59:0x0001, B:65:0x002c, B:67:0x0039, B:76:0x004b, B:78:0x0051, B:86:0x0076, B:88:0x007c, B:92:0x0087, B:91:0x0083, B:93:0x0089, B:98:0x0096, B:101:0x009d, B:97:0x0093, B:79:0x0054, B:81:0x0064, B:84:0x006e, B:85:0x0075, B:70:0x003e, B:72:0x0042, B:62:0x0025), top: B:110:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0051 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:59:0x0001, B:65:0x002c, B:67:0x0039, B:76:0x004b, B:78:0x0051, B:86:0x0076, B:88:0x007c, B:92:0x0087, B:91:0x0083, B:93:0x0089, B:98:0x0096, B:101:0x009d, B:97:0x0093, B:79:0x0054, B:81:0x0064, B:84:0x006e, B:85:0x0075, B:70:0x003e, B:72:0x0042, B:62:0x0025), top: B:110:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0054 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:59:0x0001, B:65:0x002c, B:67:0x0039, B:76:0x004b, B:78:0x0051, B:86:0x0076, B:88:0x007c, B:92:0x0087, B:91:0x0083, B:93:0x0089, B:98:0x0096, B:101:0x009d, B:97:0x0093, B:79:0x0054, B:81:0x0064, B:84:0x006e, B:85:0x0075, B:70:0x003e, B:72:0x0042, B:62:0x0025), top: B:110:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007c A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:59:0x0001, B:65:0x002c, B:67:0x0039, B:76:0x004b, B:78:0x0051, B:86:0x0076, B:88:0x007c, B:92:0x0087, B:91:0x0083, B:93:0x0089, B:98:0x0096, B:101:0x009d, B:97:0x0093, B:79:0x0054, B:81:0x0064, B:84:0x006e, B:85:0x0075, B:70:0x003e, B:72:0x0042, B:62:0x0025), top: B:110:0x0001 }] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo27541a(com.yandex.mobile.ads.impl.C30976nu r14) throws java.io.IOException {
        /*
            r13 = this;
            r0 = 1
            com.yandex.mobile.ads.impl.dm r1 = r13.f86790e     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = r1.mo34888a(r14)     // Catch: java.lang.Throwable -> La0
            com.yandex.mobile.ads.impl.nu$a r2 = r14.m31294a()     // Catch: java.lang.Throwable -> La0
            com.yandex.mobile.ads.impl.nu$a r2 = r2.m31287a(r1)     // Catch: java.lang.Throwable -> La0
            com.yandex.mobile.ads.impl.nu r2 = r2.m31291a()     // Catch: java.lang.Throwable -> La0
            r13.f86795j = r2     // Catch: java.lang.Throwable -> La0
            com.yandex.mobile.ads.impl.rl r3 = r13.f86786a     // Catch: java.lang.Throwable -> La0
            android.net.Uri r4 = r2.f83111a     // Catch: java.lang.Throwable -> La0
            com.yandex.mobile.ads.impl.cy r3 = r3.mo27753b(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = r3.m35135c()     // Catch: java.lang.Throwable -> La0
            if (r3 != 0) goto L25
            r3 = 0
            goto L29
        L25:
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> La0
        L29:
            if (r3 == 0) goto L2c
            r4 = r3
        L2c:
            r13.f86794i = r4     // Catch: java.lang.Throwable -> La0
            long r3 = r14.f83116f     // Catch: java.lang.Throwable -> La0
            r13.f86799n = r3     // Catch: java.lang.Throwable -> La0
            boolean r3 = r13.f86792g     // Catch: java.lang.Throwable -> La0
            r4 = 0
            r5 = -1
            if (r3 == 0) goto L3e
            boolean r3 = r13.f86802q     // Catch: java.lang.Throwable -> La0
            if (r3 == 0) goto L3e
            goto L48
        L3e:
            boolean r3 = r13.f86793h     // Catch: java.lang.Throwable -> La0
            if (r3 == 0) goto L4a
            long r7 = r14.f83117g     // Catch: java.lang.Throwable -> La0
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 != 0) goto L4a
        L48:
            r3 = r0
            goto L4b
        L4a:
            r3 = r4
        L4b:
            r13.f86803r = r3     // Catch: java.lang.Throwable -> La0
            r7 = 0
            if (r3 == 0) goto L54
            r13.f86800o = r5     // Catch: java.lang.Throwable -> La0
            goto L76
        L54:
            com.yandex.mobile.ads.impl.rl r3 = r13.f86786a     // Catch: java.lang.Throwable -> La0
            com.yandex.mobile.ads.impl.cy r1 = r3.mo27753b(r1)     // Catch: java.lang.Throwable -> La0
            long r9 = r1.m35136b()     // Catch: java.lang.Throwable -> La0
            r13.f86800o = r9     // Catch: java.lang.Throwable -> La0
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 == 0) goto L76
            long r11 = r14.f83116f     // Catch: java.lang.Throwable -> La0
            long r9 = r9 - r11
            r13.f86800o = r9     // Catch: java.lang.Throwable -> La0
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 < 0) goto L6e
            goto L76
        L6e:
            com.yandex.mobile.ads.impl.ku r14 = new com.yandex.mobile.ads.impl.ku     // Catch: java.lang.Throwable -> La0
            r1 = 2008(0x7d8, float:2.814E-42)
            r14.<init>(r1)     // Catch: java.lang.Throwable -> La0
            throw r14     // Catch: java.lang.Throwable -> La0
        L76:
            long r9 = r14.f83117g     // Catch: java.lang.Throwable -> La0
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 == 0) goto L89
            long r11 = r13.f86800o     // Catch: java.lang.Throwable -> La0
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 != 0) goto L83
            goto L87
        L83:
            long r9 = java.lang.Math.min(r11, r9)     // Catch: java.lang.Throwable -> La0
        L87:
            r13.f86800o = r9     // Catch: java.lang.Throwable -> La0
        L89:
            long r9 = r13.f86800o     // Catch: java.lang.Throwable -> La0
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 > 0) goto L93
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 != 0) goto L96
        L93:
            r13.m28291a(r2, r4)     // Catch: java.lang.Throwable -> La0
        L96:
            long r1 = r14.f83117g     // Catch: java.lang.Throwable -> La0
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 == 0) goto L9d
            goto L9f
        L9d:
            long r1 = r13.f86800o     // Catch: java.lang.Throwable -> La0
        L9f:
            return r1
        La0:
            r14 = move-exception
            boolean r1 = r13.m28286h()
            if (r1 != 0) goto Lab
            boolean r1 = r14 instanceof com.yandex.mobile.ads.impl.InterfaceC31296rl.C31297a
            if (r1 == 0) goto Lad
        Lab:
            r13.f86802q = r0
        Lad:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31666vl.mo27541a(com.yandex.mobile.ads.impl.nu):long");
    }

    /* renamed from: com.yandex.mobile.ads.impl.vl$a */
    /* loaded from: classes8.dex */
    public static final class C31667a implements InterfaceC30672ju.InterfaceC30673a {

        /* renamed from: a */
        private InterfaceC31296rl f86805a;

        /* renamed from: b */
        private u80.C31560b f86806b = new u80.C31560b();

        /* renamed from: c */
        private InterfaceC30179dm f86807c = InterfaceC30179dm.f78197a;
        @Nullable

        /* renamed from: d */
        private InterfaceC30672ju.InterfaceC30673a f86808d;

        @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju.InterfaceC30673a
        /* renamed from: a */
        public final InterfaceC30672ju mo28285a() {
            InterfaceC30672ju.InterfaceC30673a interfaceC30673a = this.f86808d;
            InterfaceC30672ju mo28285a = interfaceC30673a != null ? interfaceC30673a.mo28285a() : null;
            InterfaceC31296rl interfaceC31296rl = this.f86805a;
            interfaceC31296rl.getClass();
            C31592ul m28736a = mo28285a != null ? new C31592ul.C31594b().m28735a(interfaceC31296rl).m28736a() : null;
            this.f86806b.getClass();
            return new C31666vl(interfaceC31296rl, mo28285a, new u80(), m28736a, this.f86807c, 0, 0);
        }

        /* renamed from: b */
        public final C31666vl m28282b() {
            InterfaceC30672ju interfaceC30672ju;
            InterfaceC30672ju.InterfaceC30673a interfaceC30673a = this.f86808d;
            C31592ul c31592ul = null;
            if (interfaceC30673a != null) {
                interfaceC30672ju = interfaceC30673a.mo28285a();
            } else {
                interfaceC30672ju = null;
            }
            InterfaceC31296rl interfaceC31296rl = this.f86805a;
            interfaceC31296rl.getClass();
            if (interfaceC30672ju != null) {
                c31592ul = new C31592ul.C31594b().m28735a(interfaceC31296rl).m28736a();
            }
            C31592ul c31592ul2 = c31592ul;
            this.f86806b.getClass();
            return new C31666vl(interfaceC31296rl, interfaceC30672ju, new u80(), c31592ul2, this.f86807c, 1, -1000);
        }

        /* renamed from: a */
        public final C31667a m28283a(InterfaceC31296rl interfaceC31296rl) {
            this.f86805a = interfaceC31296rl;
            return this;
        }

        /* renamed from: a */
        public final C31667a m28284a(@Nullable C30198dy.C30199a c30199a) {
            this.f86808d = c30199a;
            return this;
        }
    }

    /* renamed from: a */
    private void m28291a(C30976nu c30976nu, boolean z) throws IOException {
        C30255em mo27745e;
        C30976nu m31291a;
        InterfaceC30672ju interfaceC30672ju;
        String str = c30976nu.f83118h;
        int i = y32.f88010a;
        if (this.f86803r) {
            mo27745e = null;
        } else if (this.f86791f) {
            try {
                mo27745e = this.f86786a.mo27745e(str, this.f86799n, this.f86800o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            mo27745e = this.f86786a.mo27747c(str, this.f86799n, this.f86800o);
        }
        if (mo27745e == null) {
            interfaceC30672ju = this.f86789d;
            m31291a = c30976nu.m31294a().m31283b(this.f86799n).m31289a(this.f86800o).m31291a();
        } else if (mo27745e.f78705e) {
            Uri fromFile = Uri.fromFile(mo27745e.f78706f);
            long j = mo27745e.f78703c;
            long j2 = this.f86799n - j;
            long j3 = mo27745e.f78704d - j2;
            long j4 = this.f86800o;
            if (j4 != -1) {
                j3 = Math.min(j3, j4);
            }
            m31291a = c30976nu.m31294a().m31288a(fromFile).m31281c(j).m31283b(j2).m31289a(j3).m31291a();
            interfaceC30672ju = this.f86787b;
        } else {
            long j5 = mo27745e.f78704d;
            if (j5 == -1) {
                j5 = this.f86800o;
            } else {
                long j6 = this.f86800o;
                if (j6 != -1) {
                    j5 = Math.min(j5, j6);
                }
            }
            m31291a = c30976nu.m31294a().m31283b(this.f86799n).m31289a(j5).m31291a();
            interfaceC30672ju = this.f86788c;
            if (interfaceC30672ju == null) {
                interfaceC30672ju = this.f86789d;
                this.f86786a.mo27756b(mo27745e);
                mo27745e = null;
            }
        }
        this.f86804s = (this.f86803r || interfaceC30672ju != this.f86789d) ? Long.MAX_VALUE : this.f86799n + 102400;
        if (z) {
            InterfaceC30672ju interfaceC30672ju2 = this.f86797l;
            InterfaceC30672ju interfaceC30672ju3 = this.f86789d;
            if (interfaceC30672ju2 != interfaceC30672ju3) {
                throw new IllegalStateException();
            }
            if (interfaceC30672ju == interfaceC30672ju3) {
                return;
            }
            try {
                m28289e();
            } catch (Throwable th) {
                if (!mo27745e.f78705e) {
                    this.f86786a.mo27756b(mo27745e);
                }
                throw th;
            }
        }
        if (mo27745e != null && (!mo27745e.f78705e)) {
            this.f86801p = mo27745e;
        }
        this.f86797l = interfaceC30672ju;
        this.f86796k = m31291a;
        this.f86798m = 0L;
        long mo27541a = interfaceC30672ju.mo27541a(m31291a);
        C31762wq c31762wq = new C31762wq();
        if (m31291a.f83117g == -1 && mo27541a != -1) {
            this.f86800o = mo27541a;
            C31762wq.m27856a(c31762wq, this.f86799n + mo27541a);
        }
        if (!m28286h()) {
            Uri uri = interfaceC30672ju.getUri();
            this.f86794i = uri;
            C31762wq.m27855a(c31762wq, c30976nu.f83111a.equals(uri) ^ true ? this.f86794i : null);
        }
        if (this.f86797l == this.f86788c) {
            this.f86786a.mo27758a(str, c31762wq);
        }
    }
}
