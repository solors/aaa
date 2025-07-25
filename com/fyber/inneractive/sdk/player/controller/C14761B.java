package com.fyber.inneractive.sdk.player.controller;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.enums.EnumC14795b;
import com.fyber.inneractive.sdk.player.exoplayer2.C14973g;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC15054b;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C15060h;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.player.controller.B */
/* loaded from: classes4.dex */
public final class C14761B implements VideoRendererEventListener {

    /* renamed from: a */
    public final WeakReference f27981a;

    /* renamed from: b */
    public boolean f27982b = false;

    public C14761B(C14771f c14771f) {
        this.f27981a = new WeakReference(c14771f);
    }

    /* renamed from: a */
    public final String m77639a() {
        C14771f c14771f = (C14771f) this.f27981a.get();
        if (c14771f == null) {
            return C14761B.class.getName();
        }
        return IAlog.m76531a(c14771f);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        C14771f c14771f = (C14771f) this.f27981a.get();
        if (c14771f != null) {
            c14771f.f28009t = i;
            c14771f.f28010u = i2;
        }
    }

    /* renamed from: a */
    public final void m77638a(int i, boolean z) {
        C14973g c14973g;
        IAlog.m76529a("%sonPlayerStateChanged called with pwr = %s state = %d", m77639a(), Boolean.valueOf(z), Integer.valueOf(i));
        C14771f c14771f = (C14771f) this.f27981a.get();
        if (c14771f == null || (c14973g = c14771f.f28008s) == null || c14771f.f28015z) {
            return;
        }
        if (i != 3) {
            if (i == 2) {
                if (c14771f.f28034e == EnumC14795b.Playing) {
                    c14771f.m77628a(EnumC14795b.Buffering);
                }
            } else if (i == 4) {
                c14771f.m77628a(EnumC14795b.Completed);
            }
        } else if (!z) {
            if (c14771f.f28034e == EnumC14795b.Preparing) {
                C15060h c15060h = c14973g.f29301o;
                if (c15060h != null && c15060h.f29604a > 0) {
                    AbstractC15054b abstractC15054b = c15060h.f29605b[0];
                    C15014o c15014o = abstractC15054b == null ? null : abstractC15054b.f29598d[abstractC15054b.mo77272a()];
                    if (c15014o != null) {
                        int i2 = c15014o.f29460j;
                        int i3 = c15014o.f29461k;
                        c14771f.f28009t = i2;
                        c14771f.f28010u = i3;
                    }
                }
                this.f27982b = true;
                c14771f.m77628a(EnumC14795b.Prepared);
            }
        } else {
            c14771f.m77628a(EnumC14795b.Playing);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Surface surface) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(C15014o c15014o) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i, long j) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String str, long j, long j2) {
    }
}
