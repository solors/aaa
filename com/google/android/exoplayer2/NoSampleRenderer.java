package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class NoSampleRenderer implements Renderer, RendererCapabilities {

    /* renamed from: b */
    private RendererConfiguration f31853b;

    /* renamed from: c */
    private int f31854c;

    /* renamed from: d */
    private int f31855d;
    @Nullable

    /* renamed from: f */
    private SampleStream f31856f;

    /* renamed from: g */
    private boolean f31857g;

    @Override // com.google.android.exoplayer2.Renderer
    public final void disable() {
        boolean z = true;
        if (this.f31855d != 1) {
            z = false;
        }
        Assertions.checkState(z);
        this.f31855d = 0;
        this.f31856f = null;
        this.f31857g = false;
        m75587a();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
        boolean z3;
        if (this.f31855d == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Assertions.checkState(z3);
        this.f31853b = rendererConfiguration;
        this.f31855d = 1;
        m75586b(z);
        replaceStream(formatArr, sampleStream, j2, j3);
        m75585c(j, z);
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public MediaClock getMediaClock() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public long getReadingPositionUs() {
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
        return this.f31855d;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public final SampleStream getStream() {
        return this.f31856f;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final int getTrackType() {
        return -2;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void init(int i, PlayerId playerId) {
        this.f31854c = i;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.f31857g;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j, long j2) throws ExoPlaybackException {
        Assertions.checkState(!this.f31857g);
        this.f31856f = sampleStream;
        m75584d(j2);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
        boolean z;
        if (this.f31855d == 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        m75583e();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void resetPosition(long j) throws ExoPlaybackException {
        this.f31857g = false;
        m75585c(j, false);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setCurrentStreamFinal() {
        this.f31857g = true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() throws ExoPlaybackException {
        boolean z = true;
        if (this.f31855d != 1) {
            z = false;
        }
        Assertions.checkState(z);
        this.f31855d = 2;
        m75582f();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
        boolean z;
        if (this.f31855d == 2) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        this.f31855d = 1;
        m75581g();
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(Format format) throws ExoPlaybackException {
        return RendererCapabilities.create(0);
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }

    /* renamed from: a */
    protected void m75587a() {
    }

    /* renamed from: e */
    protected void m75583e() {
    }

    /* renamed from: f */
    protected void m75582f() throws ExoPlaybackException {
    }

    /* renamed from: g */
    protected void m75581g() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws IOException {
    }

    /* renamed from: b */
    protected void m75586b(boolean z) throws ExoPlaybackException {
    }

    /* renamed from: d */
    protected void m75584d(long j) throws ExoPlaybackException {
    }

    /* renamed from: c */
    protected void m75585c(long j, boolean z) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
    }
}
