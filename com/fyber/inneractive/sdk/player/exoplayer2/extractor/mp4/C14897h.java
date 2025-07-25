package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h */
/* loaded from: classes4.dex */
public final class C14897h implements InterfaceC14894e {

    /* renamed from: a */
    public final C15121n f28798a;

    /* renamed from: b */
    public final int f28799b;

    /* renamed from: c */
    public final int f28800c;

    /* renamed from: d */
    public int f28801d;

    /* renamed from: e */
    public int f28802e;

    public C14897h(C14891b c14891b) {
        C15121n c15121n = c14891b.f28688P0;
        this.f28798a = c15121n;
        c15121n.m77197e(12);
        this.f28800c = c15121n.m77189m() & 255;
        this.f28799b = c15121n.m77189m();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.InterfaceC14894e
    /* renamed from: a */
    public final int mo77460a() {
        return this.f28799b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.InterfaceC14894e
    /* renamed from: b */
    public final int mo77459b() {
        int i = this.f28800c;
        if (i == 8) {
            return this.f28798a.m77192j();
        }
        if (i == 16) {
            return this.f28798a.m77187o();
        }
        int i2 = this.f28801d;
        this.f28801d = i2 + 1;
        if (i2 % 2 == 0) {
            int m77192j = this.f28798a.m77192j();
            this.f28802e = m77192j;
            return (m77192j & 240) >> 4;
        }
        return this.f28802e & 15;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.InterfaceC14894e
    /* renamed from: c */
    public final boolean mo77458c() {
        return false;
    }
}
