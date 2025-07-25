package com.applovin.impl;

import java.io.IOException;

/* renamed from: com.applovin.impl.i5 */
/* loaded from: classes2.dex */
public class C4567i5 extends IOException {

    /* renamed from: a */
    public final int f6792a;

    public C4567i5(int i) {
        this.f6792a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r2 = r2;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m98539a(java.io.IOException r2) {
        /*
        L0:
            if (r2 == 0) goto L16
            boolean r0 = r2 instanceof com.applovin.impl.C4567i5
            if (r0 == 0) goto L11
            r0 = r2
            com.applovin.impl.i5 r0 = (com.applovin.impl.C4567i5) r0
            int r0 = r0.f6792a
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 != r1) goto L11
            r2 = 1
            return r2
        L11:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        L16:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C4567i5.m98539a(java.io.IOException):boolean");
    }

    public C4567i5(String str, int i) {
        super(str);
        this.f6792a = i;
    }

    public C4567i5(String str, Throwable th, int i) {
        super(str, th);
        this.f6792a = i;
    }

    public C4567i5(Throwable th, int i) {
        super(th);
        this.f6792a = i;
    }
}
