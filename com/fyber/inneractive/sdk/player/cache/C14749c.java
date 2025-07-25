package com.fyber.inneractive.sdk.player.cache;

/* renamed from: com.fyber.inneractive.sdk.player.cache.c */
/* loaded from: classes4.dex */
public final class C14749c {

    /* renamed from: a */
    public final C14750d f27944a;

    /* renamed from: b */
    public final /* synthetic */ C14752f f27945b;

    public C14749c(C14752f c14752f, C14750d c14750d) {
        this.f27945b = c14752f;
        this.f27944a = c14750d;
        if (!c14750d.f27948c) {
            boolean[] zArr = new boolean[c14752f.f27958g];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
        if (r2 != false) goto L29;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m77651a() {
        /*
            r13 = this;
            com.fyber.inneractive.sdk.player.cache.f r0 = r13.f27945b
            monitor-enter(r0)
            com.fyber.inneractive.sdk.player.cache.d r1 = r13.f27944a     // Catch: java.lang.Throwable -> Lce
            com.fyber.inneractive.sdk.player.cache.c r2 = r1.f27949d     // Catch: java.lang.Throwable -> Lce
            if (r2 != r13) goto Lc8
            r2 = 0
            r3 = r2
        Lb:
            int r4 = r0.f27958g     // Catch: java.lang.Throwable -> Lce
            if (r3 >= r4) goto L39
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Lce
            com.fyber.inneractive.sdk.player.cache.f r5 = r1.f27950e     // Catch: java.lang.Throwable -> Lce
            java.io.File r5 = r5.f27952a     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            r6.<init>()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = r1.f27946a     // Catch: java.lang.Throwable -> Lce
            r6.append(r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = "."
            r6.append(r7)     // Catch: java.lang.Throwable -> Lce
            r6.append(r3)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = ".tmp"
            r6.append(r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lce
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> Lce
            com.fyber.inneractive.sdk.player.cache.C14752f.m77649a(r4)     // Catch: java.lang.Throwable -> Lce
            int r3 = r3 + 1
            goto Lb
        L39:
            int r3 = r0.f27962k     // Catch: java.lang.Throwable -> Lce
            r4 = 1
            int r3 = r3 + r4
            r0.f27962k = r3     // Catch: java.lang.Throwable -> Lce
            r3 = 0
            r1.f27949d = r3     // Catch: java.lang.Throwable -> Lce
            boolean r3 = r1.f27948c     // Catch: java.lang.Throwable -> Lce
            r5 = 10
            if (r3 == 0) goto L82
            r1.f27948c = r4     // Catch: java.lang.Throwable -> Lce
            java.io.BufferedWriter r3 = r0.f27960i     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = "CLEAN "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = r1.f27946a     // Catch: java.lang.Throwable -> Lce
            r6.append(r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            r7.<init>()     // Catch: java.lang.Throwable -> Lce
            long[] r1 = r1.f27947b     // Catch: java.lang.Throwable -> Lce
            int r8 = r1.length     // Catch: java.lang.Throwable -> Lce
            r9 = r2
        L61:
            if (r9 >= r8) goto L70
            r10 = r1[r9]     // Catch: java.lang.Throwable -> Lce
            r12 = 32
            r7.append(r12)     // Catch: java.lang.Throwable -> Lce
            r7.append(r10)     // Catch: java.lang.Throwable -> Lce
            int r9 = r9 + 1
            goto L61
        L70:
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> Lce
            r6.append(r1)     // Catch: java.lang.Throwable -> Lce
            r6.append(r5)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> Lce
            r3.write(r1)     // Catch: java.lang.Throwable -> Lce
            goto La1
        L82:
            java.util.LinkedHashMap r3 = r0.f27961j     // Catch: java.lang.Throwable -> Lce
            java.lang.String r6 = r1.f27946a     // Catch: java.lang.Throwable -> Lce
            r3.remove(r6)     // Catch: java.lang.Throwable -> Lce
            java.io.BufferedWriter r3 = r0.f27960i     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = "REMOVE "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = r1.f27946a     // Catch: java.lang.Throwable -> Lce
            r6.append(r1)     // Catch: java.lang.Throwable -> Lce
            r6.append(r5)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> Lce
            r3.write(r1)     // Catch: java.lang.Throwable -> Lce
        La1:
            java.io.BufferedWriter r1 = r0.f27960i     // Catch: java.lang.Throwable -> Lce
            r1.flush()     // Catch: java.lang.Throwable -> Lce
            long r5 = r0.f27959h     // Catch: java.lang.Throwable -> Lce
            long r7 = r0.f27957f     // Catch: java.lang.Throwable -> Lce
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto Lbf
            int r1 = r0.f27962k     // Catch: java.lang.Throwable -> Lce
            r3 = 2000(0x7d0, float:2.803E-42)
            if (r1 < r3) goto Lbd
            java.util.LinkedHashMap r3 = r0.f27961j     // Catch: java.lang.Throwable -> Lce
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lce
            if (r1 < r3) goto Lbd
            r2 = r4
        Lbd:
            if (r2 == 0) goto Lc6
        Lbf:
            java.util.concurrent.ThreadPoolExecutor r1 = r0.f27964m     // Catch: java.lang.Throwable -> Lce
            com.fyber.inneractive.sdk.player.cache.a r2 = r0.f27965n     // Catch: java.lang.Throwable -> Lce
            r1.submit(r2)     // Catch: java.lang.Throwable -> Lce
        Lc6:
            monitor-exit(r0)
            return
        Lc8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lce
            r1.<init>()     // Catch: java.lang.Throwable -> Lce
            throw r1     // Catch: java.lang.Throwable -> Lce
        Lce:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C14749c.m77651a():void");
    }
}
