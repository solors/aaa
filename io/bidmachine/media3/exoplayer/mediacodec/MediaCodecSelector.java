package io.bidmachine.media3.exoplayer.mediacodec;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new MediaCodecSelector() { // from class: io.bidmachine.media3.exoplayer.mediacodec.j
        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecSelector
        public final List getDecoderInfos(String str, boolean z, boolean z2) {
            return MediaCodecUtil.getDecoderInfos(str, z, z2);
        }
    };

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException;
}
