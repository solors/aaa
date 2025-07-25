package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C15046y;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC15054b;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.e */
/* loaded from: classes4.dex */
public final class C14850e extends AbstractC15054b {

    /* renamed from: g */
    public int f28364g;

    public C14850e(C15046y c15046y, int[] iArr) {
        super(c15046y, iArr);
        int i = 0;
        C15014o c15014o = c15046y.f29584b[0];
        while (true) {
            if (i < this.f29596b) {
                if (this.f29598d[i] == c15014o) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        this.f28364g = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC15054b
    /* renamed from: a */
    public final int mo77272a() {
        return this.f28364g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC15054b
    /* renamed from: b */
    public final Object mo77271b() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC15054b
    /* renamed from: c */
    public final int mo77270c() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC15054b
    /* renamed from: d */
    public final void mo77269d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f29599e[this.f28364g] > elapsedRealtime) {
            for (int i = this.f29596b - 1; i >= 0; i--) {
                if (this.f29599e[i] <= elapsedRealtime) {
                    this.f28364g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
