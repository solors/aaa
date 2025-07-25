package com.applovin.impl;

import android.media.MediaCodec;

/* renamed from: com.applovin.impl.id */
/* loaded from: classes2.dex */
public class C4583id extends AbstractC4991n5 {

    /* renamed from: a */
    public final C4647jd f6884a;

    /* renamed from: b */
    public final String f6885b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4583id(java.lang.Throwable r4, com.applovin.impl.C4647jd r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            java.lang.String r2 = r5.f7138a
        L11:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f6884a = r5
            int r5 = com.applovin.impl.AbstractC5863xp.f12151a
            r0 = 21
            if (r5 < r0) goto L27
            java.lang.String r1 = m98444a(r4)
        L27:
            r3.f6885b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C4583id.<init>(java.lang.Throwable, com.applovin.impl.jd):void");
    }

    /* renamed from: a */
    private static String m98444a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
