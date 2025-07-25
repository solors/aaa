package com.facebook.ads.redexgen.p370X;

import android.media.MediaCodec;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.IV */
/* loaded from: assets/audience_network.dex */
public final class C11962IV implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C110633F A00;

    public C11962IV(C110633F c110633f, MediaCodec mediaCodec) {
        this.A00 = c110633f;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A1S();
    }
}
