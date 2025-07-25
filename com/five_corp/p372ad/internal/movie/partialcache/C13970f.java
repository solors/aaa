package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.cache.C13741n;
import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.http.movcache.C13812h;
import com.five_corp.p372ad.internal.http.movcache.C13817m;
import com.five_corp.p372ad.internal.http.movcache.InterfaceC13815k;
import com.five_corp.p372ad.internal.storage.C14086k;
import com.five_corp.p372ad.internal.storage.InterfaceC14085j;
import com.five_corp.p372ad.internal.storage.RunnableC14082g;
import com.five_corp.p372ad.internal.storage.RunnableC14084i;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.f */
/* loaded from: classes4.dex */
public final class C13970f implements InterfaceC13967e, InterfaceC13815k, InterfaceC14085j {

    /* renamed from: b */
    public final C13741n f26037b;

    /* renamed from: c */
    public final C13760i f26038c;

    /* renamed from: d */
    public final InterfaceC13964d f26039d;

    /* renamed from: a */
    public final Object f26036a = new Object();

    /* renamed from: e */
    public C14086k f26040e = null;

    /* renamed from: f */
    public boolean f26041f = false;

    /* renamed from: g */
    public boolean f26042g = false;

    /* renamed from: h */
    public int f26043h = 0;

    /* renamed from: i */
    public int f26044i = 0;

    /* renamed from: j */
    public boolean f26045j = true;

    /* renamed from: k */
    public boolean f26046k = false;

    /* renamed from: l */
    public boolean f26047l = false;

    /* renamed from: m */
    public C13817m f26048m = null;

    public C13970f(C13741n c13741n, C13760i c13760i, C14033u1 c14033u1, C13812h c13812h) {
        this.f26037b = c13741n;
        this.f26038c = c13760i;
        this.f26039d = c14033u1;
    }

    /* renamed from: a */
    public final int m78205a() {
        int min;
        synchronized (this.f26036a) {
            min = Math.min(this.f26044i - this.f26043h, 8192);
        }
        return min;
    }

    /* renamed from: b */
    public final void m78203b() {
        int i;
        int i2;
        synchronized (this.f26036a) {
            if (this.f26046k) {
                return;
            }
            if (!this.f26041f) {
                return;
            }
            if (!this.f26042g && (i = this.f26043h) >= (i2 = this.f26044i)) {
                if (i == i2) {
                    this.f26045j = false;
                    return;
                }
                C14068s c14068s = new C14068s(EnumC14106t.f26638p3, String.format("CcId: %s, Current offset: %d, Downloaded file size: %d", this.f26038c.f25591b.f25187e.m78454a(), Integer.valueOf(this.f26043h), Integer.valueOf(this.f26044i)), null, null);
                C14033u1 c14033u1 = (C14033u1) this.f26039d;
                c14033u1.getClass();
                c14033u1.m78170b(new C14027s1(c14033u1, c14068s));
                return;
            }
            this.f26045j = true;
            C14086k c14086k = this.f26040e;
            c14086k.f26279d.post(new RunnableC14082g(c14086k, m78205a()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0076 A[Catch: all -> 0x009c, TryCatch #0 {, blocks: (B:49:0x0003, B:51:0x0007, B:54:0x000d, B:56:0x0016, B:60:0x001f, B:66:0x0068, B:68:0x006e, B:73:0x0076, B:74:0x0078, B:61:0x0022, B:62:0x0051, B:64:0x005f, B:65:0x0066, B:83:0x009a), top: B:88:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m78202c() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f26036a
            monitor-enter(r0)
            boolean r1 = r10.f26041f     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L9a
            boolean r1 = r10.f26046k     // Catch: java.lang.Throwable -> L9c
            if (r1 == 0) goto Ld
            goto L9a
        Ld:
            r1 = 1
            r10.f26041f = r1     // Catch: java.lang.Throwable -> L9c
            boolean r2 = r10.f26042g     // Catch: java.lang.Throwable -> L9c
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L51
            int r2 = r10.f26043h     // Catch: java.lang.Throwable -> L9c
            int r5 = r10.f26044i     // Catch: java.lang.Throwable -> L9c
            if (r2 >= r5) goto L1d
            goto L51
        L1d:
            if (r2 != r5) goto L22
            r10.f26045j = r3     // Catch: java.lang.Throwable -> L9c
            goto L68
        L22:
            com.five_corp.ad.internal.s r2 = new com.five_corp.ad.internal.s     // Catch: java.lang.Throwable -> L9c
            com.five_corp.ad.internal.t r5 = com.five_corp.p372ad.internal.EnumC14106t.f26622n3     // Catch: java.lang.Throwable -> L9c
            java.lang.String r6 = "CcId: %s, Current offset: %d, Downloaded file size: %d"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L9c
            com.five_corp.ad.internal.context.i r8 = r10.f26038c     // Catch: java.lang.Throwable -> L9c
            com.five_corp.ad.internal.ad.a r8 = r8.f25591b     // Catch: java.lang.Throwable -> L9c
            com.five_corp.ad.internal.ad.g r8 = r8.f25187e     // Catch: java.lang.Throwable -> L9c
            java.lang.String r8 = r8.m78454a()     // Catch: java.lang.Throwable -> L9c
            r7[r3] = r8     // Catch: java.lang.Throwable -> L9c
            int r8 = r10.f26043h     // Catch: java.lang.Throwable -> L9c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L9c
            r7[r1] = r8     // Catch: java.lang.Throwable -> L9c
            int r8 = r10.f26044i     // Catch: java.lang.Throwable -> L9c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L9c
            r9 = 2
            r7[r9] = r8     // Catch: java.lang.Throwable -> L9c
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r5, r6, r4, r4)     // Catch: java.lang.Throwable -> L9c
            r4 = r2
            goto L68
        L51:
            r10.f26045j = r1     // Catch: java.lang.Throwable -> L9c
            com.five_corp.ad.internal.cache.n r2 = r10.f26037b     // Catch: java.lang.Throwable -> L9c
            int r5 = r10.f26043h     // Catch: java.lang.Throwable -> L9c
            com.five_corp.ad.internal.util.f r2 = r2.m78413a(r5, r10)     // Catch: java.lang.Throwable -> L9c
            boolean r5 = r2.f26746a     // Catch: java.lang.Throwable -> L9c
            if (r5 == 0) goto L66
            java.lang.Object r2 = r2.f26748c     // Catch: java.lang.Throwable -> L9c
            com.five_corp.ad.internal.storage.k r2 = (com.five_corp.p372ad.internal.storage.C14086k) r2     // Catch: java.lang.Throwable -> L9c
            r10.f26040e = r2     // Catch: java.lang.Throwable -> L9c
            goto L68
        L66:
            com.five_corp.ad.internal.s r4 = r2.f26747b     // Catch: java.lang.Throwable -> L9c
        L68:
            boolean r2 = r10.f26045j     // Catch: java.lang.Throwable -> L9c
            boolean r5 = r10.f26047l     // Catch: java.lang.Throwable -> L9c
            if (r5 == 0) goto L73
            boolean r5 = r10.f26041f     // Catch: java.lang.Throwable -> L9c
            if (r5 == 0) goto L73
            goto L74
        L73:
            r1 = r3
        L74:
            if (r1 == 0) goto L78
            r10.f26047l = r3     // Catch: java.lang.Throwable -> L9c
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L8b
            com.five_corp.ad.internal.movie.partialcache.d r0 = r10.f26039d
            com.five_corp.ad.internal.movie.partialcache.u1 r0 = (com.five_corp.p372ad.internal.movie.partialcache.C14033u1) r0
            r0.getClass()
            com.five_corp.ad.internal.movie.partialcache.s1 r1 = new com.five_corp.ad.internal.movie.partialcache.s1
            r1.<init>(r0, r4)
            r0.m78170b(r1)
            return
        L8b:
            if (r1 == 0) goto L94
            com.five_corp.ad.internal.http.movcache.m r0 = r10.f26048m
            com.five_corp.ad.internal.http.movcache.n r0 = r0.f25749a
            r0.m78313k()
        L94:
            if (r2 == 0) goto L99
            r10.m78203b()
        L99:
            return
        L9a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9c
            return
        L9c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9c
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.five_corp.p372ad.internal.movie.partialcache.C13970f.m78202c():void");
    }

    /* renamed from: d */
    public final void m78201d() {
        synchronized (this.f26036a) {
            this.f26041f = false;
            C14086k c14086k = this.f26040e;
            if (c14086k != null) {
                c14086k.f26279d.post(new RunnableC14084i(c14086k));
                this.f26040e = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m78204a(com.five_corp.p372ad.internal.storage.C14086k r12, byte[] r13, int r14) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f26036a
            monitor-enter(r0)
            com.five_corp.ad.internal.storage.k r1 = r11.f26040e     // Catch: java.lang.Throwable -> Lb4
            if (r1 == r12) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            goto Lb0
        La:
            int r6 = r11.f26043h     // Catch: java.lang.Throwable -> Lb4
            r12 = 2
            r1 = 3
            r2 = 0
            r3 = 1
            r4 = 0
            if (r14 >= 0) goto L47
            com.five_corp.ad.internal.s r5 = new com.five_corp.ad.internal.s     // Catch: java.lang.Throwable -> Lb4
            com.five_corp.ad.internal.t r7 = com.five_corp.p372ad.internal.EnumC14106t.f26686v3     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r8 = "CcId: %s, Current offset: %d, Downloaded file size: %d, length: %d"
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Lb4
            com.five_corp.ad.internal.context.i r10 = r11.f26038c     // Catch: java.lang.Throwable -> Lb4
            com.five_corp.ad.internal.ad.a r10 = r10.f25591b     // Catch: java.lang.Throwable -> Lb4
            com.five_corp.ad.internal.ad.g r10 = r10.f25187e     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r10 = r10.m78454a()     // Catch: java.lang.Throwable -> Lb4
            r9[r2] = r10     // Catch: java.lang.Throwable -> Lb4
            int r2 = r11.f26043h     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lb4
            r9[r3] = r2     // Catch: java.lang.Throwable -> Lb4
            int r2 = r11.f26044i     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lb4
            r9[r12] = r2     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> Lb4
            r9[r1] = r12     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r12 = java.lang.String.format(r8, r9)     // Catch: java.lang.Throwable -> Lb4
            r5.<init>(r7, r12, r4, r4)     // Catch: java.lang.Throwable -> Lb4
        L45:
            r4 = r5
            goto L86
        L47:
            int r5 = r6 + r14
            r11.f26043h = r5     // Catch: java.lang.Throwable -> Lb4
            boolean r5 = r11.f26042g     // Catch: java.lang.Throwable -> Lb4
            if (r5 == 0) goto L56
            int r5 = r11.f26044i     // Catch: java.lang.Throwable -> Lb4
            if (r6 != r5) goto L56
            r11.f26046k = r3     // Catch: java.lang.Throwable -> Lb4
            goto L86
        L56:
            int r5 = r11.f26044i     // Catch: java.lang.Throwable -> Lb4
            if (r6 <= r5) goto L86
            com.five_corp.ad.internal.s r5 = new com.five_corp.ad.internal.s     // Catch: java.lang.Throwable -> Lb4
            com.five_corp.ad.internal.t r7 = com.five_corp.p372ad.internal.EnumC14106t.f26630o3     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r8 = "CcId: %s, Current offset: %d, Downloaded file size: %d"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb4
            com.five_corp.ad.internal.context.i r9 = r11.f26038c     // Catch: java.lang.Throwable -> Lb4
            com.five_corp.ad.internal.ad.a r9 = r9.f25591b     // Catch: java.lang.Throwable -> Lb4
            com.five_corp.ad.internal.ad.g r9 = r9.f25187e     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r9 = r9.m78454a()     // Catch: java.lang.Throwable -> Lb4
            r1[r2] = r9     // Catch: java.lang.Throwable -> Lb4
            int r2 = r11.f26043h     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lb4
            r1[r3] = r2     // Catch: java.lang.Throwable -> Lb4
            int r2 = r11.f26044i     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lb4
            r1[r12] = r2     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r12 = java.lang.String.format(r8, r1)     // Catch: java.lang.Throwable -> Lb4
            r5.<init>(r7, r12, r4, r4)     // Catch: java.lang.Throwable -> Lb4
            goto L45
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r4 == 0) goto L99
            com.five_corp.ad.internal.movie.partialcache.d r12 = r11.f26039d
            com.five_corp.ad.internal.movie.partialcache.u1 r12 = (com.five_corp.p372ad.internal.movie.partialcache.C14033u1) r12
            r12.getClass()
            com.five_corp.ad.internal.movie.partialcache.s1 r13 = new com.five_corp.ad.internal.movie.partialcache.s1
            r13.<init>(r12, r4)
            r12.m78170b(r13)
            goto Lb0
        L99:
            if (r14 <= 0) goto Lb0
            com.five_corp.ad.internal.movie.partialcache.d r12 = r11.f26039d
            r5 = 0
            com.five_corp.ad.internal.movie.partialcache.u1 r12 = (com.five_corp.p372ad.internal.movie.partialcache.C14033u1) r12
            r12.getClass()
            com.five_corp.ad.internal.movie.partialcache.r1 r0 = new com.five_corp.ad.internal.movie.partialcache.r1
            r1 = r0
            r2 = r12
            r3 = r11
            r4 = r14
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r12.m78175a(r0)
        Lb0:
            r11.m78203b()
            return
        Lb4:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.five_corp.p372ad.internal.movie.partialcache.C13970f.m78204a(com.five_corp.ad.internal.storage.k, byte[], int):void");
    }
}
