package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C14830d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14844g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14874j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p */
/* loaded from: classes4.dex */
public final class C14957p implements InterfaceC14949h {

    /* renamed from: a */
    public final C15121n f29209a = new C15121n(10);

    /* renamed from: b */
    public InterfaceC14935r f29210b;

    /* renamed from: c */
    public boolean f29211c;

    /* renamed from: d */
    public long f29212d;

    /* renamed from: e */
    public int f29213e;

    /* renamed from: f */
    public int f29214f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77410a() {
        this.f29211c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: b */
    public final void mo77406b() {
        int i;
        if (this.f29211c && (i = this.f29213e) != 0 && this.f29214f == i) {
            this.f29210b.mo77421a(this.f29212d, 1, i, 0, null);
            this.f29211c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77409a(InterfaceC14874j interfaceC14874j, C14940E c14940e) {
        c14940e.m77417a();
        c14940e.m77416b();
        C14844g mo77301a = interfaceC14874j.mo77301a(c14940e.f29055d, 4);
        this.f29210b = mo77301a;
        c14940e.m77416b();
        mo77301a.mo77419a(C15014o.m77306a(c14940e.f29056e, "application/id3", (C14830d) null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77407a(boolean z, long j) {
        if (z) {
            this.f29211c = true;
            this.f29212d = j;
            this.f29213e = 0;
            this.f29214f = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77408a(C15121n c15121n) {
        if (this.f29211c) {
            int i = c15121n.f29806c - c15121n.f29805b;
            int i2 = this.f29214f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                System.arraycopy(c15121n.f29804a, c15121n.f29805b, this.f29209a.f29804a, this.f29214f, min);
                if (this.f29214f + min == 10) {
                    this.f29209a.m77197e(0);
                    if (73 == this.f29209a.m77192j() && 68 == this.f29209a.m77192j() && 51 == this.f29209a.m77192j()) {
                        C15121n c15121n2 = this.f29209a;
                        c15121n2.m77197e(c15121n2.f29805b + 3);
                        this.f29213e = this.f29209a.m77193i() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f29211c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(i, this.f29213e - this.f29214f);
            this.f29210b.mo77422a(min2, c15121n);
            this.f29214f += min2;
        }
    }
}
