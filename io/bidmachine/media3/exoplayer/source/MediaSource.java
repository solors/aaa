package io.bidmachine.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManagerProvider;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;

/* loaded from: classes9.dex */
public interface MediaSource {

    @UnstableApi
    /* loaded from: classes9.dex */
    public static final class MediaPeriodId extends io.bidmachine.media3.common.MediaPeriodId {
        public MediaPeriodId(Object obj) {
            super(obj);
        }

        public MediaPeriodId(Object obj, long j) {
            super(obj, j);
        }

        @Override // io.bidmachine.media3.common.MediaPeriodId
        public MediaPeriodId copyWithPeriodUid(Object obj) {
            return new MediaPeriodId(super.copyWithPeriodUid(obj));
        }

        @Override // io.bidmachine.media3.common.MediaPeriodId
        public MediaPeriodId copyWithWindowSequenceNumber(long j) {
            return new MediaPeriodId(super.copyWithWindowSequenceNumber(j));
        }

        public MediaPeriodId(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public MediaPeriodId(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public MediaPeriodId(io.bidmachine.media3.common.MediaPeriodId mediaPeriodId) {
            super(mediaPeriodId);
        }
    }

    @UnstableApi
    /* loaded from: classes9.dex */
    public interface MediaSourceCaller {
        void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline);
    }

    @UnstableApi
    void addDrmEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener);

    @UnstableApi
    void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    @UnstableApi
    MediaPeriod createPeriod(MediaPeriodId mediaPeriodId, Allocator allocator, long j);

    @UnstableApi
    void disable(MediaSourceCaller mediaSourceCaller);

    @UnstableApi
    void enable(MediaSourceCaller mediaSourceCaller);

    @Nullable
    @UnstableApi
    default Timeline getInitialTimeline() {
        return null;
    }

    @UnstableApi
    MediaItem getMediaItem();

    @UnstableApi
    default boolean isSingleWindow() {
        return true;
    }

    @UnstableApi
    void maybeThrowSourceInfoRefreshError() throws IOException;

    @UnstableApi
    @Deprecated
    default void prepareSource(MediaSourceCaller mediaSourceCaller, @Nullable TransferListener transferListener) {
        prepareSource(mediaSourceCaller, transferListener, PlayerId.UNSET);
    }

    @UnstableApi
    void prepareSource(MediaSourceCaller mediaSourceCaller, @Nullable TransferListener transferListener, PlayerId playerId);

    @UnstableApi
    void releasePeriod(MediaPeriod mediaPeriod);

    @UnstableApi
    void releaseSource(MediaSourceCaller mediaSourceCaller);

    @UnstableApi
    void removeDrmEventListener(DrmSessionEventListener drmSessionEventListener);

    @UnstableApi
    void removeEventListener(MediaSourceEventListener mediaSourceEventListener);

    /* loaded from: classes9.dex */
    public interface Factory {
        @UnstableApi
        public static final Factory UNSUPPORTED = MediaSourceFactory.UNSUPPORTED;

        @UnstableApi
        MediaSource createMediaSource(MediaItem mediaItem);

        @UnstableApi
        int[] getSupportedTypes();

        @UnstableApi
        Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider);

        @UnstableApi
        Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy);

        @UnstableApi
        default Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            return this;
        }
    }
}
