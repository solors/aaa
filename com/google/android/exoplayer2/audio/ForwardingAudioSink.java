package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.AudioSink;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ForwardingAudioSink implements AudioSink {

    /* renamed from: a */
    private final AudioSink f32541a;

    public ForwardingAudioSink(AudioSink audioSink) {
        this.f32541a = audioSink;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void configure(Format format, int i, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        this.f32541a.configure(format, i, iArr);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
        this.f32541a.disableTunneling();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void enableTunnelingV21() {
        this.f32541a.enableTunnelingV21();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void experimentalFlushWithoutAudioTrackRelease() {
        this.f32541a.experimentalFlushWithoutAudioTrackRelease();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        this.f32541a.flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    @Nullable
    public AudioAttributes getAudioAttributes() {
        return this.f32541a.getAudioAttributes();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean z) {
        return this.f32541a.getCurrentPositionUs(z);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int getFormatSupport(Format format) {
        return this.f32541a.getFormatSupport(format);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.f32541a.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return this.f32541a.getSkipSilenceEnabled();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) throws AudioSink.InitializationException, AudioSink.WriteException {
        return this.f32541a.handleBuffer(byteBuffer, j, i);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
        this.f32541a.handleDiscontinuity();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
        return this.f32541a.hasPendingData();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
        return this.f32541a.isEnded();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.f32541a.pause();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.f32541a.play();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
        this.f32541a.playToEndOfStream();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        this.f32541a.reset();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        this.f32541a.setAudioAttributes(audioAttributes);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int i) {
        this.f32541a.setAudioSessionId(i);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        this.f32541a.setAuxEffectInfo(auxEffectInfo);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.f32541a.setListener(listener);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setOutputStreamOffsetUs(long j) {
        this.f32541a.setOutputStreamOffsetUs(j);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.f32541a.setPlaybackParameters(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlayerId(@Nullable PlayerId playerId) {
        this.f32541a.setPlayerId(playerId);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    @RequiresApi(23)
    public void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.f32541a.setPreferredDevice(audioDeviceInfo);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
        this.f32541a.setSkipSilenceEnabled(z);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f) {
        this.f32541a.setVolume(f);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean supportsFormat(Format format) {
        return this.f32541a.supportsFormat(format);
    }
}
