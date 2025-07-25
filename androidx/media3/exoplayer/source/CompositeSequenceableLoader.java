package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;

@UnstableApi
/* loaded from: classes2.dex */
public class CompositeSequenceableLoader implements SequenceableLoader {
    protected final SequenceableLoader[] loaders;

    public CompositeSequenceableLoader(SequenceableLoader[] sequenceableLoaderArr) {
        this.loaders = sequenceableLoaderArr;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            long j = Long.MIN_VALUE;
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            SequenceableLoader[] sequenceableLoaderArr = this.loaders;
            int length = sequenceableLoaderArr.length;
            int i = 0;
            z = false;
            while (i < length) {
                SequenceableLoader sequenceableLoader = sequenceableLoaderArr[i];
                long nextLoadPositionUs2 = sequenceableLoader.getNextLoadPositionUs();
                if (nextLoadPositionUs2 != j && nextLoadPositionUs2 <= loadingInfo.playbackPositionUs) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (nextLoadPositionUs2 == nextLoadPositionUs || z2) {
                    z |= sequenceableLoader.continueLoading(loadingInfo);
                }
                i++;
                j = Long.MIN_VALUE;
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long j = Long.MAX_VALUE;
        for (SequenceableLoader sequenceableLoader : this.loaders) {
            long bufferedPositionUs = sequenceableLoader.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, bufferedPositionUs);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        long j = Long.MAX_VALUE;
        for (SequenceableLoader sequenceableLoader : this.loaders) {
            long nextLoadPositionUs = sequenceableLoader.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, nextLoadPositionUs);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        for (SequenceableLoader sequenceableLoader : this.loaders) {
            if (sequenceableLoader.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        for (SequenceableLoader sequenceableLoader : this.loaders) {
            sequenceableLoader.reevaluateBuffer(j);
        }
    }
}
