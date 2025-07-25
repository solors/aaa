package io.bidmachine.media3.exoplayer;

import android.os.Handler;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener;
import io.bidmachine.media3.exoplayer.metadata.MetadataOutput;
import io.bidmachine.media3.exoplayer.text.TextOutput;
import io.bidmachine.media3.exoplayer.video.VideoRendererEventListener;

@UnstableApi
/* loaded from: classes9.dex */
public interface RenderersFactory {
    Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput);
}
