package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.g */
/* loaded from: classes4.dex */
public final class C15114g {

    /* renamed from: a */
    public int f29782a;

    /* renamed from: b */
    public long[] f29783b = new long[32];

    /* renamed from: a */
    public final void m77220a(long j) {
        int i = this.f29782a;
        long[] jArr = this.f29783b;
        if (i == jArr.length) {
            this.f29783b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f29783b;
        int i2 = this.f29782a;
        this.f29782a = i2 + 1;
        jArr2[i2] = j;
    }
}
