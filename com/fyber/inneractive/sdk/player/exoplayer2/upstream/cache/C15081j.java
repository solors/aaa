package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j */
/* loaded from: classes4.dex */
public final class C15081j implements Comparator {

    /* renamed from: a */
    public final TreeSet f29673a = new TreeSet(this);

    /* renamed from: b */
    public long f29674b;

    /* renamed from: a */
    public final void m77254a(C15083l c15083l, long j) {
        while (this.f29674b + j > 10485760) {
            try {
                AbstractC15078g abstractC15078g = (AbstractC15078g) this.f29673a.first();
                synchronized (c15083l) {
                    c15083l.m77252a(abstractC15078g, true);
                }
            } catch (C15072a unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[ORIG_RETURN, RETURN] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g r9 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.AbstractC15078g) r9
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g r10 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.AbstractC15078g) r10
            long r0 = r9.f29661f
            long r2 = r10.f29661f
            long r4 = r0 - r2
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L31
            java.lang.String r0 = r9.f29656a
            java.lang.String r1 = r10.f29656a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            java.lang.String r9 = r9.f29656a
            java.lang.String r10 = r10.f29656a
            int r9 = r9.compareTo(r10)
            goto L38
        L23:
            long r0 = r9.f29657b
            long r9 = r10.f29657b
            long r0 = r0 - r9
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 != 0) goto L2e
            r9 = 0
            goto L38
        L2e:
            if (r9 >= 0) goto L37
            goto L35
        L31:
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L37
        L35:
            r9 = -1
            goto L38
        L37:
            r9 = 1
        L38:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C15081j.compare(java.lang.Object, java.lang.Object):int");
    }
}
