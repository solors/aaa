package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC15151x;
import com.fyber.inneractive.sdk.player.exoplayer2.C15134v;
import com.fyber.inneractive.sdk.player.exoplayer2.C15150w;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.x */
/* loaded from: classes4.dex */
public final class C15045x extends AbstractC15151x {

    /* renamed from: g */
    public static final Object f29577g = new Object();

    /* renamed from: b */
    public final long f29578b;

    /* renamed from: c */
    public final long f29579c;

    /* renamed from: d */
    public final long f29580d;

    /* renamed from: e */
    public final long f29581e;

    /* renamed from: f */
    public final boolean f29582f;

    public C15045x(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f29578b = j;
        this.f29579c = j2;
        this.f29580d = j3;
        this.f29581e = j4;
        this.f29582f = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC15151x
    /* renamed from: a */
    public final int mo77130a() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC15151x
    /* renamed from: b */
    public final int mo77125b() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC15151x
    /* renamed from: a */
    public final C15150w mo77127a(int i, C15150w c15150w, long j) {
        if (i >= 0 && i < 1) {
            long j2 = this.f29581e;
            boolean z = this.f29582f;
            if (z) {
                j2 += j;
                if (j2 > this.f29579c) {
                    j2 = -9223372036854775807L;
                }
            }
            long j3 = this.f29579c;
            long j4 = this.f29580d;
            c15150w.f29925a = null;
            c15150w.f29926b = z;
            c15150w.f29929e = j2;
            c15150w.f29930f = j3;
            c15150w.f29927c = 0;
            c15150w.f29928d = 0;
            c15150w.f29931g = j4;
            return c15150w;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC15151x
    /* renamed from: a */
    public final C15134v mo77129a(int i, C15134v c15134v, boolean z) {
        if (i >= 0 && i < 1) {
            Object obj = z ? f29577g : null;
            long j = this.f29578b;
            c15134v.f29840a = obj;
            c15134v.f29841b = obj;
            c15134v.f29842c = 0;
            c15134v.f29843d = j;
            c15134v.f29844e = -this.f29580d;
            return c15134v;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC15151x
    /* renamed from: a */
    public final int mo77126a(Object obj) {
        return f29577g.equals(obj) ? 0 : -1;
    }
}
