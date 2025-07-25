package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g */
/* loaded from: classes4.dex */
public abstract class AbstractC15078g implements Comparable {

    /* renamed from: a */
    public final String f29656a;

    /* renamed from: b */
    public final long f29657b;

    /* renamed from: c */
    public final long f29658c;

    /* renamed from: d */
    public final boolean f29659d;

    /* renamed from: e */
    public final File f29660e;

    /* renamed from: f */
    public final long f29661f;

    public AbstractC15078g(String str, long j, long j2, long j3, File file) {
        boolean z;
        this.f29656a = str;
        this.f29657b = j;
        this.f29658c = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.f29659d = z;
        this.f29660e = file;
        this.f29661f = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC15078g abstractC15078g = (AbstractC15078g) obj;
        if (!this.f29656a.equals(abstractC15078g.f29656a)) {
            return this.f29656a.compareTo(abstractC15078g.f29656a);
        }
        int i = ((this.f29657b - abstractC15078g.f29657b) > 0L ? 1 : ((this.f29657b - abstractC15078g.f29657b) == 0L ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        return 1;
    }
}
