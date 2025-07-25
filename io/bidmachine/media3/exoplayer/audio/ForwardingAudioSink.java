package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.AuxEffectInfo;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.PlaybackParameters;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes9.dex */
public class ForwardingAudioSink implements AudioSink {
    private final AudioSink sink;

    public ForwardingAudioSink(AudioSink audioSink) {
        this.sink = audioSink;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void configure(Format format, int i, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        this.sink.configure(format, i, iArr);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
        this.sink.disableTunneling();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
        this.sink.enableTunnelingV21();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void experimentalFlushWithoutAudioTrackRelease() {
        this.sink.experimentalFlushWithoutAudioTrackRelease();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void flush() {
        this.sink.flush();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    @Nullable
    public AudioAttributes getAudioAttributes() {
        return this.sink.getAudioAttributes();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z) {
        return this.sink.getCurrentPositionUs(z);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(Format format) {
        return this.sink.getFormatSupport(format);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.sink.getPlaybackParameters();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return this.sink.getSkipSilenceEnabled();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) throws AudioSink.InitializationException, AudioSink.WriteException {
        return this.sink.handleBuffer(byteBuffer, j, i);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.sink.handleDiscontinuity();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        return this.sink.hasPendingData();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        return this.sink.isEnded();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.sink.pause();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void play() {
        this.sink.play();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
        this.sink.playToEndOfStream();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void reset() {
        this.sink.reset();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        this.sink.setAudioAttributes(audioAttributes);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i) {
        this.sink.setAudioSessionId(i);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        this.sink.setAuxEffectInfo(auxEffectInfo);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.sink.setListener(listener);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setOutputStreamOffsetUs(long j) {
        this.sink.setOutputStreamOffsetUs(j);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.sink.setPlaybackParameters(playbackParameters);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setPlayerId(@Nullable PlayerId playerId) {
        this.sink.setPlayerId(playerId);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    @RequiresApi(23)
    public void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.sink.setPreferredDevice(audioDeviceInfo);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
        this.sink.setSkipSilenceEnabled(z);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setVolume(float f) {
        this.sink.setVolume(f);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(Format format) {
        return this.sink.supportsFormat(format);
    }
}
