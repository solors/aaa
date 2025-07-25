package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.q */
/* loaded from: classes4.dex */
public abstract class AbstractC14906q {
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.UUID m77442a(byte[] r9) {
        /*
            com.fyber.inneractive.sdk.player.exoplayer2.util.n r0 = new com.fyber.inneractive.sdk.player.exoplayer2.util.n
            r0.<init>(r9)
            int r9 = r0.f29806c
            r1 = 32
            r2 = 0
            if (r9 >= r1) goto Ld
            goto L6d
        Ld:
            r9 = 0
            r0.m77197e(r9)
            int r1 = r0.m77204b()
            int r3 = r0.f29806c
            int r4 = r0.f29805b
            int r3 = r3 - r4
            int r3 = r3 + 4
            if (r1 == r3) goto L1f
            goto L6d
        L1f:
            int r1 = r0.m77204b()
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.AbstractC14892c.f28725V
            if (r1 == r3) goto L28
            goto L6d
        L28:
            int r1 = r0.m77204b()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 1
            if (r1 <= r3) goto L47
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported pssh version: "
            r9.<init>(r0)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "PsshAtomUtil"
            android.util.Log.w(r0, r9)
            goto L6d
        L47:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.m77195g()
            long r7 = r0.m77195g()
            r4.<init>(r5, r7)
            if (r1 != r3) goto L62
            int r1 = r0.m77189m()
            int r1 = r1 * 16
            int r3 = r0.f29805b
            int r3 = r3 + r1
            r0.m77197e(r3)
        L62:
            int r1 = r0.m77189m()
            int r3 = r0.f29806c
            int r5 = r0.f29805b
            int r3 = r3 - r5
            if (r1 == r3) goto L6f
        L6d:
            r9 = r2
            goto L78
        L6f:
            byte[] r3 = new byte[r1]
            r0.m77205a(r3, r9, r1)
            android.util.Pair r9 = android.util.Pair.create(r4, r3)
        L78:
            if (r9 != 0) goto L7b
            return r2
        L7b:
            java.lang.Object r9 = r9.first
            java.util.UUID r9 = (java.util.UUID) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.AbstractC14906q.m77442a(byte[]):java.util.UUID");
    }
}
