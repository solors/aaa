package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.k */
/* loaded from: classes4.dex */
public class C14807k {

    /* renamed from: a */
    public AudioTrack f28123a;

    /* renamed from: b */
    public boolean f28124b;

    /* renamed from: c */
    public int f28125c;

    /* renamed from: d */
    public long f28126d;

    /* renamed from: e */
    public long f28127e;

    /* renamed from: f */
    public long f28128f;

    /* renamed from: g */
    public long f28129g;

    /* renamed from: h */
    public long f28130h;

    /* renamed from: i */
    public long f28131i;

    /* renamed from: a */
    public void mo77564a(AudioTrack audioTrack, boolean z) {
        this.f28123a = audioTrack;
        this.f28124b = z;
        this.f28129g = -9223372036854775807L;
        this.f28126d = 0L;
        this.f28127e = 0L;
        this.f28128f = 0L;
        if (audioTrack != null) {
            this.f28125c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: b */
    public long mo77563b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public long mo77562c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void m77565d() {
        if (this.f28129g != -9223372036854775807L) {
            return;
        }
        this.f28123a.pause();
    }

    /* renamed from: e */
    public boolean mo77561e() {
        return false;
    }

    /* renamed from: a */
    public final void m77566a(long j) {
        this.f28130h = m77567a();
        this.f28129g = SystemClock.elapsedRealtime() * 1000;
        this.f28131i = j;
        this.f28123a.stop();
    }

    /* renamed from: a */
    public final long m77567a() {
        if (this.f28129g != -9223372036854775807L) {
            return Math.min(this.f28131i, this.f28130h + ((((SystemClock.elapsedRealtime() * 1000) - this.f28129g) * this.f28125c) / 1000000));
        }
        int playState = this.f28123a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f28123a.getPlaybackHeadPosition() & 4294967295L;
        if (this.f28124b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f28128f = this.f28126d;
            }
            playbackHeadPosition += this.f28128f;
        }
        if (this.f28126d > playbackHeadPosition) {
            this.f28127e++;
        }
        this.f28126d = playbackHeadPosition;
        return playbackHeadPosition + (this.f28127e << 32);
    }
}
