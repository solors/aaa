package io.bidmachine.media3.exoplayer.audio;

import io.bidmachine.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

@UnstableApi
@Deprecated
/* loaded from: classes9.dex */
public abstract class BaseAudioProcessor extends io.bidmachine.media3.common.audio.BaseAudioProcessor {
    @Override // io.bidmachine.media3.common.audio.BaseAudioProcessor, io.bidmachine.media3.common.audio.AudioProcessor
    public abstract /* synthetic */ void queueInput(ByteBuffer byteBuffer);
}
