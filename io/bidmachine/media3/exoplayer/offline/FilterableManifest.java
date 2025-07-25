package io.bidmachine.media3.exoplayer.offline;

import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public interface FilterableManifest<T> {
    T copy(List<StreamKey> list);
}
