package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.g */
/* loaded from: classes4.dex */
public final class C14896g implements InterfaceC14894e {

    /* renamed from: a */
    public final int f28795a;

    /* renamed from: b */
    public final int f28796b;

    /* renamed from: c */
    public final C15121n f28797c;

    public C14896g(C14891b c14891b) {
        C15121n c15121n = c14891b.f28688P0;
        this.f28797c = c15121n;
        c15121n.m77197e(12);
        this.f28795a = c15121n.m77189m();
        this.f28796b = c15121n.m77189m();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.InterfaceC14894e
    /* renamed from: a */
    public final int mo77460a() {
        return this.f28796b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.InterfaceC14894e
    /* renamed from: b */
    public final int mo77459b() {
        int i = this.f28795a;
        if (i == 0) {
            return this.f28797c.m77189m();
        }
        return i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.InterfaceC14894e
    /* renamed from: c */
    public final boolean mo77458c() {
        if (this.f28795a != 0) {
            return true;
        }
        return false;
    }
}
