package io.bidmachine.rendering.internal.adform.video.player.exo;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.DeviceInfo;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.MediaMetadata;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.PlaybackException;
import io.bidmachine.media3.common.PlaybackParameters;
import io.bidmachine.media3.common.Player;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.TrackSelectionParameters;
import io.bidmachine.media3.common.Tracks;
import io.bidmachine.media3.common.VideoSize;
import io.bidmachine.media3.common.text.CueGroup;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.p729ui.PlayerView;
import io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a;
import java.util.List;

/* renamed from: io.bidmachine.rendering.internal.adform.video.player.exo.a */
/* loaded from: classes9.dex */
public class C36985a extends AbstractC36979a {

    /* renamed from: k */
    private final ExoPlayer f97664k;

    /* renamed from: l */
    private final PlayerView f97665l;

    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.exo.a$a */
    /* loaded from: classes9.dex */
    public class C36986a implements Player.Listener {
        public C36986a() {
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            super.onAudioAttributesChanged(audioAttributes);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        @UnstableApi
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
            super.onAudioSessionIdChanged(i);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            super.onAvailableCommandsChanged(commands);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onCues(CueGroup cueGroup) {
            super.onCues(cueGroup);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            super.onDeviceInfoChanged(deviceInfo);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            super.onDeviceVolumeChanged(i, z);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
            super.onEvents(player, events);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
            super.onIsLoadingChanged(z);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onIsPlayingChanged(boolean z) {
            if (z) {
                C36985a.this.m19386n();
                C36985a.this.m19379v();
                return;
            }
            C36985a.this.m19388k();
            C36985a.this.m19400b();
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        @UnstableApi
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
            super.onLoadingChanged(z);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            super.onMaxSeekToPreviousPositionChanged(j);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMediaItemTransition(@Nullable MediaItem mediaItem, int i) {
            super.onMediaItemTransition(mediaItem, i);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            super.onMediaMetadataChanged(mediaMetadata);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        @UnstableApi
        public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
            super.onMetadata(metadata);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            super.onPlayWhenReadyChanged(z, i);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            super.onPlaybackParametersChanged(playbackParameters);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            if (i == 3) {
                C36985a.this.m19391d();
            } else if (i == 4) {
                C36985a.this.m19384q();
            }
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            super.onPlaybackSuppressionReasonChanged(i);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlayerError(PlaybackException playbackException) {
            C36985a.this.m19403a(playbackException);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
            super.onPlayerErrorChanged(playbackException);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        @UnstableApi
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            super.onPlayerStateChanged(z, i);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            super.onPlaylistMetadataChanged(mediaMetadata);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        @UnstableApi
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
            super.onPositionDiscontinuity(i);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            super.onRenderedFirstFrame();
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
            super.onRepeatModeChanged(i);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
            super.onSeekBackIncrementChanged(j);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            super.onSeekForwardIncrementChanged(j);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            super.onShuffleModeEnabledChanged(z);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            super.onSkipSilenceEnabledChanged(z);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            super.onSurfaceSizeChanged(i, i2);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            super.onTimelineChanged(timeline, i);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            super.onTrackSelectionParametersChanged(trackSelectionParameters);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onTracksChanged(Tracks tracks) {
            super.onTracksChanged(tracks);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            super.onVideoSizeChanged(videoSize);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onVolumeChanged(float f) {
            C36985a.this.m19394c(f);
            C36985a.this.m19406a(f);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        @UnstableApi
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
            super.onCues(list);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            C36985a.this.m19405a(positionInfo2.positionMs);
        }
    }

    public C36985a(Context context) {
        ExoPlayer build = new ExoPlayer.Builder(context).build();
        this.f97664k = build;
        build.addListener(new C36986a());
        PlayerView playerView = new PlayerView(context);
        this.f97665l = playerView;
        playerView.setPlayer(build);
        playerView.setUseController(false);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: A */
    protected void mo19346A() {
        this.f97664k.prepare();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: B */
    protected void mo19345B() {
        this.f97664k.stop();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a, io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: g */
    public long mo19335g() {
        return this.f97664k.getDuration();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a, io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    public float getVolume() {
        return this.f97664k.getVolume();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a, io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: h */
    public long mo19334h() {
        return this.f97664k.getCurrentPosition();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a, io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: o */
    public View mo19333o() {
        return this.f97665l;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: w */
    protected boolean mo19332w() {
        return this.f97664k.isPlaying();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: x */
    protected boolean mo19331x() {
        return false;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: y */
    protected void mo19330y() {
        this.f97664k.pause();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: z */
    protected void mo19329z() {
        this.f97664k.play();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: c */
    protected void mo19337c(long j) {
        this.f97664k.seekTo(j);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: d */
    protected void mo19336d(float f) {
        this.f97664k.setVolume(f);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: b */
    protected void mo19340b(Uri uri) {
        this.f97664k.setMediaItem(new MediaItem.Builder().setUri(uri).build());
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a, io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: a */
    public void mo19344a() {
        super.mo19344a();
        this.f97664k.release();
        this.f97665l.setPlayer(null);
    }
}
