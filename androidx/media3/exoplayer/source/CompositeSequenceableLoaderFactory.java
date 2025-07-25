package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface CompositeSequenceableLoaderFactory {
    SequenceableLoader createCompositeSequenceableLoader(SequenceableLoader... sequenceableLoaderArr);
}
