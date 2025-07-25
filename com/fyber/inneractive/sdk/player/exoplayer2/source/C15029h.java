package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.h */
/* loaded from: classes4.dex */
public final class C15029h implements InterfaceC15044w {

    /* renamed from: a */
    public final InterfaceC15044w[] f29513a;

    public C15029h(InterfaceC15044w[] interfaceC15044wArr) {
        this.f29513a = interfaceC15044wArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC15044w
    /* renamed from: b */
    public final boolean mo77279b(long j) {
        InterfaceC15044w[] interfaceC15044wArr;
        boolean z;
        boolean z2 = false;
        do {
            long mo77278f = mo77278f();
            if (mo77278f == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (InterfaceC15044w interfaceC15044w : this.f29513a) {
                if (interfaceC15044w.mo77278f() == mo77278f) {
                    z |= interfaceC15044w.mo77279b(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC15044w
    /* renamed from: f */
    public final long mo77278f() {
        long j = Long.MAX_VALUE;
        for (InterfaceC15044w interfaceC15044w : this.f29513a) {
            long mo77278f = interfaceC15044w.mo77278f();
            if (mo77278f != Long.MIN_VALUE) {
                j = Math.min(j, mo77278f);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}
