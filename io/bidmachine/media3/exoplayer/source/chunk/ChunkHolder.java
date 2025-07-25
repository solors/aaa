package io.bidmachine.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public final class ChunkHolder {
    @Nullable
    public Chunk chunk;
    public boolean endOfStream;

    public void clear() {
        this.chunk = null;
        this.endOfStream = false;
    }
}
