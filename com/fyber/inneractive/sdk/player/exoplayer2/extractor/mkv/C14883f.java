package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14833b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f */
/* loaded from: classes4.dex */
public final class C14883f {

    /* renamed from: a */
    public final C15121n f28652a = new C15121n(8);

    /* renamed from: b */
    public int f28653b;

    /* renamed from: a */
    public final long m77470a(C14833b c14833b) {
        int i = 0;
        c14833b.m77521a(this.f28652a.f29804a, 0, 1, false);
        int i2 = this.f28652a.f29804a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c14833b.m77521a(this.f28652a.f29804a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.f28652a.f29804a[i] & 255) + (i5 << 8);
        }
        this.f28653b = i4 + 1 + this.f28653b;
        return i5;
    }
}
