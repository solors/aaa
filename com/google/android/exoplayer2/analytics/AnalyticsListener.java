package com.google.android.exoplayer2.analytics;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Objects;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* loaded from: classes4.dex */
public interface AnalyticsListener {
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 20;
    public static final int EVENT_AUDIO_CODEC_ERROR = 1029;
    public static final int EVENT_AUDIO_DECODER_INITIALIZED = 1008;
    public static final int EVENT_AUDIO_DECODER_RELEASED = 1012;
    public static final int EVENT_AUDIO_DISABLED = 1013;
    public static final int EVENT_AUDIO_ENABLED = 1007;
    public static final int EVENT_AUDIO_INPUT_FORMAT_CHANGED = 1009;
    public static final int EVENT_AUDIO_POSITION_ADVANCING = 1010;
    public static final int EVENT_AUDIO_SESSION_ID = 21;
    public static final int EVENT_AUDIO_SINK_ERROR = 1014;
    public static final int EVENT_AUDIO_UNDERRUN = 1011;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 13;
    public static final int EVENT_BANDWIDTH_ESTIMATE = 1006;
    public static final int EVENT_CUES = 27;
    public static final int EVENT_DEVICE_INFO_CHANGED = 29;
    public static final int EVENT_DEVICE_VOLUME_CHANGED = 30;
    public static final int EVENT_DOWNSTREAM_FORMAT_CHANGED = 1004;
    public static final int EVENT_DRM_KEYS_LOADED = 1023;
    public static final int EVENT_DRM_KEYS_REMOVED = 1026;
    public static final int EVENT_DRM_KEYS_RESTORED = 1025;
    public static final int EVENT_DRM_SESSION_ACQUIRED = 1022;
    public static final int EVENT_DRM_SESSION_MANAGER_ERROR = 1024;
    public static final int EVENT_DRM_SESSION_RELEASED = 1027;
    public static final int EVENT_DROPPED_VIDEO_FRAMES = 1018;
    public static final int EVENT_IS_LOADING_CHANGED = 3;
    public static final int EVENT_IS_PLAYING_CHANGED = 7;
    public static final int EVENT_LOAD_CANCELED = 1002;
    public static final int EVENT_LOAD_COMPLETED = 1001;
    public static final int EVENT_LOAD_ERROR = 1003;
    public static final int EVENT_LOAD_STARTED = 1000;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 18;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 14;
    public static final int EVENT_METADATA = 28;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 12;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 4;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 6;
    public static final int EVENT_PLAYER_ERROR = 10;
    public static final int EVENT_PLAYER_RELEASED = 1028;
    public static final int EVENT_PLAYLIST_METADATA_CHANGED = 15;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 5;
    public static final int EVENT_POSITION_DISCONTINUITY = 11;
    public static final int EVENT_RENDERED_FIRST_FRAME = 26;
    public static final int EVENT_REPEAT_MODE_CHANGED = 8;
    public static final int EVENT_SEEK_BACK_INCREMENT_CHANGED = 16;
    public static final int EVENT_SEEK_FORWARD_INCREMENT_CHANGED = 17;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 9;
    public static final int EVENT_SKIP_SILENCE_ENABLED_CHANGED = 23;
    public static final int EVENT_SURFACE_SIZE_CHANGED = 24;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int EVENT_TRACK_SELECTION_PARAMETERS_CHANGED = 19;
    public static final int EVENT_UPSTREAM_DISCARDED = 1005;
    public static final int EVENT_VIDEO_CODEC_ERROR = 1030;
    public static final int EVENT_VIDEO_DECODER_INITIALIZED = 1016;
    public static final int EVENT_VIDEO_DECODER_RELEASED = 1019;
    public static final int EVENT_VIDEO_DISABLED = 1020;
    public static final int EVENT_VIDEO_ENABLED = 1015;
    public static final int EVENT_VIDEO_FRAME_PROCESSING_OFFSET = 1021;
    public static final int EVENT_VIDEO_INPUT_FORMAT_CHANGED = 1017;
    public static final int EVENT_VIDEO_SIZE_CHANGED = 25;
    public static final int EVENT_VOLUME_CHANGED = 22;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface EventFlags {
    }

    /* loaded from: classes4.dex */
    public static final class EventTime {
        @Nullable
        public final MediaSource.MediaPeriodId currentMediaPeriodId;
        public final long currentPlaybackPositionMs;
        public final Timeline currentTimeline;
        public final int currentWindowIndex;
        public final long eventPlaybackPositionMs;
        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final long realtimeMs;
        public final Timeline timeline;
        public final long totalBufferedDurationMs;
        public final int windowIndex;

        public EventTime(long j, Timeline timeline, int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j2, Timeline timeline2, int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId2, long j3, long j4) {
            this.realtimeMs = j;
            this.timeline = timeline;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
            this.eventPlaybackPositionMs = j2;
            this.currentTimeline = timeline2;
            this.currentWindowIndex = i2;
            this.currentMediaPeriodId = mediaPeriodId2;
            this.currentPlaybackPositionMs = j3;
            this.totalBufferedDurationMs = j4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTime.class != obj.getClass()) {
                return false;
            }
            EventTime eventTime = (EventTime) obj;
            if (this.realtimeMs == eventTime.realtimeMs && this.windowIndex == eventTime.windowIndex && this.eventPlaybackPositionMs == eventTime.eventPlaybackPositionMs && this.currentWindowIndex == eventTime.currentWindowIndex && this.currentPlaybackPositionMs == eventTime.currentPlaybackPositionMs && this.totalBufferedDurationMs == eventTime.totalBufferedDurationMs && Objects.equal(this.timeline, eventTime.timeline) && Objects.equal(this.mediaPeriodId, eventTime.mediaPeriodId) && Objects.equal(this.currentTimeline, eventTime.currentTimeline) && Objects.equal(this.currentMediaPeriodId, eventTime.currentMediaPeriodId)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.realtimeMs), this.timeline, Integer.valueOf(this.windowIndex), this.mediaPeriodId, Long.valueOf(this.eventPlaybackPositionMs), this.currentTimeline, Integer.valueOf(this.currentWindowIndex), this.currentMediaPeriodId, Long.valueOf(this.currentPlaybackPositionMs), Long.valueOf(this.totalBufferedDurationMs));
        }
    }

    /* loaded from: classes4.dex */
    public static final class Events {

        /* renamed from: a */
        private final FlagSet f32051a;

        /* renamed from: b */
        private final SparseArray<EventTime> f32052b;

        public Events(FlagSet flagSet, SparseArray<EventTime> sparseArray) {
            this.f32051a = flagSet;
            SparseArray<EventTime> sparseArray2 = new SparseArray<>(flagSet.size());
            for (int i = 0; i < flagSet.size(); i++) {
                int i2 = flagSet.get(i);
                sparseArray2.append(i2, (EventTime) Assertions.checkNotNull(sparseArray.get(i2)));
            }
            this.f32052b = sparseArray2;
        }

        public boolean contains(int i) {
            return this.f32051a.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return this.f32051a.containsAny(iArr);
        }

        public int get(int i) {
            return this.f32051a.get(i);
        }

        public EventTime getEventTime(int i) {
            return (EventTime) Assertions.checkNotNull(this.f32052b.get(i));
        }

        public int size() {
            return this.f32051a.size();
        }
    }

    @Deprecated
    default void onAudioDecoderInitialized(EventTime eventTime, String str, long j) {
    }

    @Deprecated
    default void onAudioInputFormatChanged(EventTime eventTime, Format format) {
    }

    default void onCues(EventTime eventTime, CueGroup cueGroup) {
    }

    @Deprecated
    default void onDrmSessionAcquired(EventTime eventTime) {
    }

    @Deprecated
    default void onPositionDiscontinuity(EventTime eventTime, int i) {
    }

    @Deprecated
    default void onVideoDecoderInitialized(EventTime eventTime, String str, long j) {
    }

    @Deprecated
    default void onVideoInputFormatChanged(EventTime eventTime, Format format) {
    }

    @Deprecated
    default void onVideoSizeChanged(EventTime eventTime, int i, int i2, int i3, float f) {
    }

    default void onAudioDecoderInitialized(EventTime eventTime, String str, long j, long j2) {
    }

    default void onAudioInputFormatChanged(EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Deprecated
    default void onCues(EventTime eventTime, List<Cue> list) {
    }

    default void onDrmSessionAcquired(EventTime eventTime, int i) {
    }

    default void onPositionDiscontinuity(EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
    }

    default void onVideoDecoderInitialized(EventTime eventTime, String str, long j, long j2) {
    }

    default void onVideoInputFormatChanged(EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onVideoSizeChanged(EventTime eventTime, VideoSize videoSize) {
    }

    default void onDrmKeysLoaded(EventTime eventTime) {
    }

    default void onDrmKeysRemoved(EventTime eventTime) {
    }

    default void onDrmKeysRestored(EventTime eventTime) {
    }

    default void onDrmSessionReleased(EventTime eventTime) {
    }

    default void onPlayerReleased(EventTime eventTime) {
    }

    @Deprecated
    default void onSeekProcessed(EventTime eventTime) {
    }

    @Deprecated
    default void onSeekStarted(EventTime eventTime) {
    }

    default void onAudioAttributesChanged(EventTime eventTime, AudioAttributes audioAttributes) {
    }

    default void onAudioCodecError(EventTime eventTime, Exception exc) {
    }

    default void onAudioDecoderReleased(EventTime eventTime, String str) {
    }

    default void onAudioDisabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void onAudioEnabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void onAudioPositionAdvancing(EventTime eventTime, long j) {
    }

    default void onAudioSessionIdChanged(EventTime eventTime, int i) {
    }

    default void onAudioSinkError(EventTime eventTime, Exception exc) {
    }

    default void onAvailableCommandsChanged(EventTime eventTime, Player.Commands commands) {
    }

    default void onDeviceInfoChanged(EventTime eventTime, DeviceInfo deviceInfo) {
    }

    default void onDownstreamFormatChanged(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    default void onDrmSessionManagerError(EventTime eventTime, Exception exc) {
    }

    default void onEvents(Player player, Events events) {
    }

    default void onIsLoadingChanged(EventTime eventTime, boolean z) {
    }

    default void onIsPlayingChanged(EventTime eventTime, boolean z) {
    }

    @Deprecated
    default void onLoadingChanged(EventTime eventTime, boolean z) {
    }

    default void onMaxSeekToPreviousPositionChanged(EventTime eventTime, long j) {
    }

    default void onMediaMetadataChanged(EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    default void onMetadata(EventTime eventTime, Metadata metadata) {
    }

    default void onPlaybackParametersChanged(EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    default void onPlaybackStateChanged(EventTime eventTime, int i) {
    }

    default void onPlaybackSuppressionReasonChanged(EventTime eventTime, int i) {
    }

    default void onPlayerError(EventTime eventTime, PlaybackException playbackException) {
    }

    default void onPlayerErrorChanged(EventTime eventTime, @Nullable PlaybackException playbackException) {
    }

    default void onPlaylistMetadataChanged(EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    default void onRepeatModeChanged(EventTime eventTime, int i) {
    }

    default void onSeekBackIncrementChanged(EventTime eventTime, long j) {
    }

    default void onSeekForwardIncrementChanged(EventTime eventTime, long j) {
    }

    default void onShuffleModeChanged(EventTime eventTime, boolean z) {
    }

    default void onSkipSilenceEnabledChanged(EventTime eventTime, boolean z) {
    }

    default void onTimelineChanged(EventTime eventTime, int i) {
    }

    default void onTrackSelectionParametersChanged(EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
    }

    default void onTracksChanged(EventTime eventTime, Tracks tracks) {
    }

    default void onUpstreamDiscarded(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    default void onVideoCodecError(EventTime eventTime, Exception exc) {
    }

    default void onVideoDecoderReleased(EventTime eventTime, String str) {
    }

    default void onVideoDisabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void onVolumeChanged(EventTime eventTime, float f) {
    }

    @Deprecated
    default void onDecoderDisabled(EventTime eventTime, int i, DecoderCounters decoderCounters) {
    }

    @Deprecated
    default void onDecoderEnabled(EventTime eventTime, int i, DecoderCounters decoderCounters) {
    }

    @Deprecated
    default void onDecoderInputFormatChanged(EventTime eventTime, int i, Format format) {
    }

    default void onDeviceVolumeChanged(EventTime eventTime, int i, boolean z) {
    }

    default void onDroppedVideoFrames(EventTime eventTime, int i, long j) {
    }

    default void onLoadCanceled(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadStarted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onMediaItemTransition(EventTime eventTime, @Nullable MediaItem mediaItem, int i) {
    }

    default void onPlayWhenReadyChanged(EventTime eventTime, boolean z, int i) {
    }

    @Deprecated
    default void onPlayerStateChanged(EventTime eventTime, boolean z, int i) {
    }

    default void onRenderedFirstFrame(EventTime eventTime, Object obj, long j) {
    }

    default void onSurfaceSizeChanged(EventTime eventTime, int i, int i2) {
    }

    default void onVideoFrameProcessingOffset(EventTime eventTime, long j, int i) {
    }

    default void onAudioUnderrun(EventTime eventTime, int i, long j, long j2) {
    }

    default void onBandwidthEstimate(EventTime eventTime, int i, long j, long j2) {
    }

    @Deprecated
    default void onDecoderInitialized(EventTime eventTime, int i, String str, long j) {
    }

    default void onLoadError(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
    }
}
