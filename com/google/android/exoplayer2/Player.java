package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.Size;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.inmobi.commons.core.configs.CrashConfig;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public interface Player {
    public static final int COMMAND_ADJUST_DEVICE_VOLUME = 26;
    public static final int COMMAND_CHANGE_MEDIA_ITEMS = 20;
    public static final int COMMAND_GET_AUDIO_ATTRIBUTES = 21;
    public static final int COMMAND_GET_CURRENT_MEDIA_ITEM = 16;
    public static final int COMMAND_GET_DEVICE_VOLUME = 23;
    public static final int COMMAND_GET_MEDIA_ITEMS_METADATA = 18;
    public static final int COMMAND_GET_TEXT = 28;
    public static final int COMMAND_GET_TIMELINE = 17;
    public static final int COMMAND_GET_TRACKS = 30;
    public static final int COMMAND_GET_VOLUME = 22;
    public static final int COMMAND_INVALID = -1;
    public static final int COMMAND_PLAY_PAUSE = 1;
    public static final int COMMAND_PREPARE = 2;
    public static final int COMMAND_SEEK_BACK = 11;
    public static final int COMMAND_SEEK_FORWARD = 12;
    public static final int COMMAND_SEEK_IN_CURRENT_MEDIA_ITEM = 5;
    @Deprecated
    public static final int COMMAND_SEEK_IN_CURRENT_WINDOW = 5;
    public static final int COMMAND_SEEK_TO_DEFAULT_POSITION = 4;
    public static final int COMMAND_SEEK_TO_MEDIA_ITEM = 10;
    public static final int COMMAND_SEEK_TO_NEXT = 9;
    public static final int COMMAND_SEEK_TO_NEXT_MEDIA_ITEM = 8;
    @Deprecated
    public static final int COMMAND_SEEK_TO_NEXT_WINDOW = 8;
    public static final int COMMAND_SEEK_TO_PREVIOUS = 7;
    public static final int COMMAND_SEEK_TO_PREVIOUS_MEDIA_ITEM = 6;
    @Deprecated
    public static final int COMMAND_SEEK_TO_PREVIOUS_WINDOW = 6;
    @Deprecated
    public static final int COMMAND_SEEK_TO_WINDOW = 10;
    public static final int COMMAND_SET_DEVICE_VOLUME = 25;
    public static final int COMMAND_SET_MEDIA_ITEM = 31;
    public static final int COMMAND_SET_MEDIA_ITEMS_METADATA = 19;
    public static final int COMMAND_SET_REPEAT_MODE = 15;
    public static final int COMMAND_SET_SHUFFLE_MODE = 14;
    public static final int COMMAND_SET_SPEED_AND_PITCH = 13;
    public static final int COMMAND_SET_TRACK_SELECTION_PARAMETERS = 29;
    public static final int COMMAND_SET_VIDEO_SURFACE = 27;
    public static final int COMMAND_SET_VOLUME = 24;
    public static final int COMMAND_STOP = 3;
    public static final int DISCONTINUITY_REASON_AUTO_TRANSITION = 0;
    public static final int DISCONTINUITY_REASON_INTERNAL = 5;
    public static final int DISCONTINUITY_REASON_REMOVE = 4;
    public static final int DISCONTINUITY_REASON_SEEK = 1;
    public static final int DISCONTINUITY_REASON_SEEK_ADJUSTMENT = 2;
    public static final int DISCONTINUITY_REASON_SKIP = 3;
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 20;
    public static final int EVENT_AUDIO_SESSION_ID = 21;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 13;
    public static final int EVENT_CUES = 27;
    public static final int EVENT_DEVICE_INFO_CHANGED = 29;
    public static final int EVENT_DEVICE_VOLUME_CHANGED = 30;
    public static final int EVENT_IS_LOADING_CHANGED = 3;
    public static final int EVENT_IS_PLAYING_CHANGED = 7;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 18;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 14;
    public static final int EVENT_METADATA = 28;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 12;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 4;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 6;
    public static final int EVENT_PLAYER_ERROR = 10;
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
    public static final int EVENT_VIDEO_SIZE_CHANGED = 25;
    public static final int EVENT_VOLUME_CHANGED = 22;
    public static final int MEDIA_ITEM_TRANSITION_REASON_AUTO = 1;
    public static final int MEDIA_ITEM_TRANSITION_REASON_PLAYLIST_CHANGED = 3;
    public static final int MEDIA_ITEM_TRANSITION_REASON_REPEAT = 0;
    public static final int MEDIA_ITEM_TRANSITION_REASON_SEEK = 2;
    public static final int PLAYBACK_SUPPRESSION_REASON_NONE = 0;
    public static final int PLAYBACK_SUPPRESSION_REASON_TRANSIENT_AUDIO_FOCUS_LOSS = 1;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_BECOMING_NOISY = 3;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_FOCUS_LOSS = 2;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_END_OF_MEDIA_ITEM = 5;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_REMOTE = 4;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_USER_REQUEST = 1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_OFF = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int STATE_BUFFERING = 2;
    public static final int STATE_ENDED = 4;
    public static final int STATE_IDLE = 1;
    public static final int STATE_READY = 3;
    public static final int TIMELINE_CHANGE_REASON_PLAYLIST_CHANGED = 0;
    public static final int TIMELINE_CHANGE_REASON_SOURCE_UPDATE = 1;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Command {
    }

    /* loaded from: classes4.dex */
    public static final class Commands implements Bundleable {

        /* renamed from: b */
        private final FlagSet f31870b;
        public static final Commands EMPTY = new Builder().build();

        /* renamed from: c */
        private static final String f31869c = Util.intToStringMaxRadix(0);
        public static final Bundleable.Creator<Commands> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.o2
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                Player.Commands m75571c;
                m75571c = Player.Commands.m75571c(bundle);
                return m75571c;
            }
        };

        /* loaded from: classes4.dex */
        public static final class Builder {

            /* renamed from: b */
            private static final int[] f31871b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a */
            private final FlagSet.Builder f31872a;

            @CanIgnoreReturnValue
            public Builder add(int i) {
                this.f31872a.add(i);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder addAll(int... iArr) {
                this.f31872a.addAll(iArr);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder addAllCommands() {
                this.f31872a.addAll(f31871b);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder addIf(int i, boolean z) {
                this.f31872a.addIf(i, z);
                return this;
            }

            public Commands build() {
                return new Commands(this.f31872a.build());
            }

            @CanIgnoreReturnValue
            public Builder remove(int i) {
                this.f31872a.remove(i);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder removeAll(int... iArr) {
                this.f31872a.removeAll(iArr);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder removeIf(int i, boolean z) {
                this.f31872a.removeIf(i, z);
                return this;
            }

            public Builder() {
                this.f31872a = new FlagSet.Builder();
            }

            @CanIgnoreReturnValue
            public Builder addAll(Commands commands) {
                this.f31872a.addAll(commands.f31870b);
                return this;
            }

            private Builder(Commands commands) {
                FlagSet.Builder builder = new FlagSet.Builder();
                this.f31872a = builder;
                builder.addAll(commands.f31870b);
            }
        }

        /* renamed from: c */
        public static Commands m75571c(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f31869c);
            if (integerArrayList == null) {
                return EMPTY;
            }
            Builder builder = new Builder();
            for (int i = 0; i < integerArrayList.size(); i++) {
                builder.add(integerArrayList.get(i).intValue());
            }
            return builder.build();
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean contains(int i) {
            return this.f31870b.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return this.f31870b.containsAny(iArr);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Commands)) {
                return false;
            }
            return this.f31870b.equals(((Commands) obj).f31870b);
        }

        public int get(int i) {
            return this.f31870b.get(i);
        }

        public int hashCode() {
            return this.f31870b.hashCode();
        }

        public int size() {
            return this.f31870b.size();
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < this.f31870b.size(); i++) {
                arrayList.add(Integer.valueOf(this.f31870b.get(i)));
            }
            bundle.putIntegerArrayList(f31869c, arrayList);
            return bundle;
        }

        private Commands(FlagSet flagSet) {
            this.f31870b = flagSet;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface DiscontinuityReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Event {
    }

    /* loaded from: classes4.dex */
    public static final class Events {

        /* renamed from: a */
        private final FlagSet f31873a;

        public Events(FlagSet flagSet) {
            this.f31873a = flagSet;
        }

        public boolean contains(int i) {
            return this.f31873a.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return this.f31873a.containsAny(iArr);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Events)) {
                return false;
            }
            return this.f31873a.equals(((Events) obj).f31873a);
        }

        public int get(int i) {
            return this.f31873a.get(i);
        }

        public int hashCode() {
            return this.f31873a.hashCode();
        }

        public int size() {
            return this.f31873a.size();
        }
    }

    /* loaded from: classes4.dex */
    public interface Listener {
        default void onCues(CueGroup cueGroup) {
        }

        @Deprecated
        default void onPositionDiscontinuity(int i) {
        }

        @Deprecated
        default void onCues(List<Cue> list) {
        }

        default void onPositionDiscontinuity(PositionInfo positionInfo, PositionInfo positionInfo2, int i) {
        }

        default void onRenderedFirstFrame() {
        }

        @Deprecated
        default void onSeekProcessed() {
        }

        default void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        }

        default void onAudioSessionIdChanged(int i) {
        }

        default void onAvailableCommandsChanged(Commands commands) {
        }

        default void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        default void onIsLoadingChanged(boolean z) {
        }

        default void onIsPlayingChanged(boolean z) {
        }

        @Deprecated
        default void onLoadingChanged(boolean z) {
        }

        default void onMaxSeekToPreviousPositionChanged(long j) {
        }

        default void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        default void onMetadata(Metadata metadata) {
        }

        default void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        default void onPlaybackStateChanged(int i) {
        }

        default void onPlaybackSuppressionReasonChanged(int i) {
        }

        default void onPlayerError(PlaybackException playbackException) {
        }

        default void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
        }

        default void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        default void onRepeatModeChanged(int i) {
        }

        default void onSeekBackIncrementChanged(long j) {
        }

        default void onSeekForwardIncrementChanged(long j) {
        }

        default void onShuffleModeEnabledChanged(boolean z) {
        }

        default void onSkipSilenceEnabledChanged(boolean z) {
        }

        default void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        }

        default void onTracksChanged(Tracks tracks) {
        }

        default void onVideoSizeChanged(VideoSize videoSize) {
        }

        default void onVolumeChanged(float f) {
        }

        default void onDeviceVolumeChanged(int i, boolean z) {
        }

        default void onEvents(Player player, Events events) {
        }

        default void onMediaItemTransition(@Nullable MediaItem mediaItem, int i) {
        }

        default void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z, int i) {
        }

        default void onSurfaceSizeChanged(int i, int i2) {
        }

        default void onTimelineChanged(Timeline timeline, int i) {
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface MediaItemTransitionReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface PlayWhenReadyChangeReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface PlaybackSuppressionReason {
    }

    /* loaded from: classes4.dex */
    public static final class PositionInfo implements Bundleable {
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final long contentPositionMs;
        @Nullable
        public final MediaItem mediaItem;
        public final int mediaItemIndex;
        public final int periodIndex;
        @Nullable
        public final Object periodUid;
        public final long positionMs;
        @Deprecated
        public final int windowIndex;
        @Nullable
        public final Object windowUid;

        /* renamed from: b */
        private static final String f31874b = Util.intToStringMaxRadix(0);

        /* renamed from: c */
        private static final String f31875c = Util.intToStringMaxRadix(1);

        /* renamed from: d */
        private static final String f31876d = Util.intToStringMaxRadix(2);

        /* renamed from: f */
        private static final String f31877f = Util.intToStringMaxRadix(3);

        /* renamed from: g */
        private static final String f31878g = Util.intToStringMaxRadix(4);

        /* renamed from: h */
        private static final String f31879h = Util.intToStringMaxRadix(5);

        /* renamed from: i */
        private static final String f31880i = Util.intToStringMaxRadix(6);
        public static final Bundleable.Creator<PositionInfo> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.p2
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                Player.PositionInfo m75569b;
                m75569b = Player.PositionInfo.m75569b(bundle);
                return m75569b;
            }
        };

        @Deprecated
        public PositionInfo(@Nullable Object obj, int i, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
            this(obj, i, MediaItem.EMPTY, obj2, i2, j, j2, i3, i4);
        }

        /* renamed from: b */
        public static PositionInfo m75569b(Bundle bundle) {
            MediaItem fromBundle;
            int i = bundle.getInt(f31874b, 0);
            Bundle bundle2 = bundle.getBundle(f31875c);
            if (bundle2 == null) {
                fromBundle = null;
            } else {
                fromBundle = MediaItem.CREATOR.fromBundle(bundle2);
            }
            return new PositionInfo(null, i, fromBundle, null, bundle.getInt(f31876d, 0), bundle.getLong(f31877f, 0L), bundle.getLong(f31878g, 0L), bundle.getInt(f31879h, -1), bundle.getInt(f31880i, -1));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PositionInfo.class != obj.getClass()) {
                return false;
            }
            PositionInfo positionInfo = (PositionInfo) obj;
            if (this.mediaItemIndex == positionInfo.mediaItemIndex && this.periodIndex == positionInfo.periodIndex && this.positionMs == positionInfo.positionMs && this.contentPositionMs == positionInfo.contentPositionMs && this.adGroupIndex == positionInfo.adGroupIndex && this.adIndexInAdGroup == positionInfo.adIndexInAdGroup && Objects.equal(this.windowUid, positionInfo.windowUid) && Objects.equal(this.periodUid, positionInfo.periodUid) && Objects.equal(this.mediaItem, positionInfo.mediaItem)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.windowUid, Integer.valueOf(this.mediaItemIndex), this.mediaItem, this.periodUid, Integer.valueOf(this.periodIndex), Long.valueOf(this.positionMs), Long.valueOf(this.contentPositionMs), Integer.valueOf(this.adGroupIndex), Integer.valueOf(this.adIndexInAdGroup));
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            return toBundle(true, true);
        }

        public PositionInfo(@Nullable Object obj, int i, @Nullable MediaItem mediaItem, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.windowUid = obj;
            this.windowIndex = i;
            this.mediaItemIndex = i;
            this.mediaItem = mediaItem;
            this.periodUid = obj2;
            this.periodIndex = i2;
            this.positionMs = j;
            this.contentPositionMs = j2;
            this.adGroupIndex = i3;
            this.adIndexInAdGroup = i4;
        }

        public Bundle toBundle(boolean z, boolean z2) {
            Bundle bundle = new Bundle();
            bundle.putInt(f31874b, z2 ? this.mediaItemIndex : 0);
            MediaItem mediaItem = this.mediaItem;
            if (mediaItem != null && z) {
                bundle.putBundle(f31875c, mediaItem.toBundle());
            }
            bundle.putInt(f31876d, z2 ? this.periodIndex : 0);
            bundle.putLong(f31877f, z ? this.positionMs : 0L);
            bundle.putLong(f31878g, z ? this.contentPositionMs : 0L);
            bundle.putInt(f31879h, z ? this.adGroupIndex : -1);
            bundle.putInt(f31880i, z ? this.adIndexInAdGroup : -1);
            return bundle;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface RepeatMode {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface State {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface TimelineChangeReason {
    }

    void addListener(Listener listener);

    void addMediaItem(int i, MediaItem mediaItem);

    void addMediaItem(MediaItem mediaItem);

    void addMediaItems(int i, List<MediaItem> list);

    void addMediaItems(List<MediaItem> list);

    boolean canAdvertiseSession();

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(@Nullable Surface surface);

    void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void clearVideoTextureView(@Nullable TextureView textureView);

    void decreaseDeviceVolume();

    Looper getApplicationLooper();

    AudioAttributes getAudioAttributes();

    Commands getAvailableCommands();

    @IntRange(from = 0, m105510to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    CueGroup getCurrentCues();

    long getCurrentLiveOffset();

    @Nullable
    Object getCurrentManifest();

    @Nullable
    MediaItem getCurrentMediaItem();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    Timeline getCurrentTimeline();

    Tracks getCurrentTracks();

    @Deprecated
    int getCurrentWindowIndex();

    DeviceInfo getDeviceInfo();

    @IntRange(from = 0)
    int getDeviceVolume();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    MediaItem getMediaItemAt(int i);

    int getMediaItemCount();

    MediaMetadata getMediaMetadata();

    int getNextMediaItemIndex();

    @Deprecated
    int getNextWindowIndex();

    boolean getPlayWhenReady();

    PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    @Nullable
    PlaybackException getPlayerError();

    MediaMetadata getPlaylistMetadata();

    int getPreviousMediaItemIndex();

    @Deprecated
    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    Size getSurfaceSize();

    long getTotalBufferedDuration();

    TrackSelectionParameters getTrackSelectionParameters();

    VideoSize getVideoSize();

    @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    float getVolume();

    @Deprecated
    boolean hasNext();

    boolean hasNextMediaItem();

    @Deprecated
    boolean hasNextWindow();

    @Deprecated
    boolean hasPrevious();

    boolean hasPreviousMediaItem();

    @Deprecated
    boolean hasPreviousWindow();

    void increaseDeviceVolume();

    boolean isCommandAvailable(int i);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    @Deprecated
    boolean isCurrentWindowDynamic();

    @Deprecated
    boolean isCurrentWindowLive();

    @Deprecated
    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int i, int i2);

    void moveMediaItems(int i, int i2, int i3);

    @Deprecated
    void next();

    void pause();

    void play();

    void prepare();

    @Deprecated
    void previous();

    void release();

    void removeListener(Listener listener);

    void removeMediaItem(int i);

    void removeMediaItems(int i, int i2);

    void seekBack();

    void seekForward();

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i);

    void seekToNext();

    void seekToNextMediaItem();

    @Deprecated
    void seekToNextWindow();

    void seekToPrevious();

    void seekToPreviousMediaItem();

    @Deprecated
    void seekToPreviousWindow();

    void setDeviceMuted(boolean z);

    void setDeviceVolume(@IntRange(from = 0) int i);

    void setMediaItem(MediaItem mediaItem);

    void setMediaItem(MediaItem mediaItem, long j);

    void setMediaItem(MediaItem mediaItem, boolean z);

    void setMediaItems(List<MediaItem> list);

    void setMediaItems(List<MediaItem> list, int i, long j);

    void setMediaItems(List<MediaItem> list, boolean z);

    void setPlayWhenReady(boolean z);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f);

    void setPlaylistMetadata(MediaMetadata mediaMetadata);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters);

    void setVideoSurface(@Nullable Surface surface);

    void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void setVideoTextureView(@Nullable TextureView textureView);

    void setVolume(@FloatRange(from = 0.0d, m105511to = 1.0d) float f);

    void stop();

    @Deprecated
    void stop(boolean z);
}
