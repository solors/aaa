package io.bidmachine.media3.exoplayer.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecInfo;

@UnstableApi
/* loaded from: classes9.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public MediaCodecVideoDecoderException(Throwable th, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable Surface surface) {
        super(th, mediaCodecInfo);
        boolean z;
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z = false;
        } else {
            z = true;
        }
        this.isSurfaceValid = z;
    }
}
