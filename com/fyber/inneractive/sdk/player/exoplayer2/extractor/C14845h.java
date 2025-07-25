package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import java.io.EOFException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.h */
/* loaded from: classes4.dex */
public final class C14845h implements InterfaceC14935r {
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r
    /* renamed from: a */
    public final void mo77421a(long j, int i, int i2, int i3, byte[] bArr) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r
    /* renamed from: a */
    public final void mo77419a(C15014o c15014o) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r
    /* renamed from: a */
    public final void mo77422a(int i, C15121n c15121n) {
        c15121n.m77197e(c15121n.f29805b + i);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r
    /* renamed from: a */
    public final int mo77420a(C14833b c14833b, int i, boolean z) {
        int min = Math.min(c14833b.f28288f, i);
        c14833b.m77520b(min);
        if (min == 0) {
            min = c14833b.m77522a(C14833b.f28282g, 0, Math.min(i, 4096), 0, true);
        }
        if (min != -1) {
            c14833b.f28285c += min;
        }
        if (min == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return min;
    }
}
