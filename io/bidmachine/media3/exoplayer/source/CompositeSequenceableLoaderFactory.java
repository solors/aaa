package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface CompositeSequenceableLoaderFactory {
    SequenceableLoader createCompositeSequenceableLoader(SequenceableLoader... sequenceableLoaderArr);
}
