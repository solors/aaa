package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b */
/* loaded from: classes4.dex */
public final class C14981b extends Exception {
    public C14981b(C15014o c15014o, C14985f c14985f, int i) {
        super("Decoder init failed: [" + i + "], " + c15014o, c14985f);
        String str = c15014o.f29456f;
        Math.abs(i);
    }

    public C14981b(C15014o c15014o, Exception exc, String str) {
        super("Decoder init failed: " + str + ", " + c15014o, exc);
        String str2 = c15014o.f29456f;
        if (AbstractC15133z.f29832a < 21 || !(exc instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) exc).getDiagnosticInfo();
    }
}
