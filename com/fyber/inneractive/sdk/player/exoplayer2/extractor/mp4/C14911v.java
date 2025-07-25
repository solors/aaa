package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v */
/* loaded from: classes4.dex */
public final class C14911v {

    /* renamed from: a */
    public final int f28934a;

    /* renamed from: b */
    public final long[] f28935b;

    /* renamed from: c */
    public final int[] f28936c;

    /* renamed from: d */
    public final int f28937d;

    /* renamed from: e */
    public final long[] f28938e;

    /* renamed from: f */
    public final int[] f28939f;

    public C14911v(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        if (iArr.length == jArr2.length) {
            if (jArr.length == jArr2.length) {
                if (iArr2.length == jArr2.length) {
                    this.f28935b = jArr;
                    this.f28936c = iArr;
                    this.f28937d = i;
                    this.f28938e = jArr2;
                    this.f28939f = iArr2;
                    this.f28934a = jArr.length;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
