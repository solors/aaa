package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.l */
/* loaded from: classes4.dex */
public final class C14808l extends C14807k {

    /* renamed from: j */
    public final AudioTimestamp f28132j = new AudioTimestamp();

    /* renamed from: k */
    public long f28133k;

    /* renamed from: l */
    public long f28134l;

    /* renamed from: m */
    public long f28135m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.C14807k
    /* renamed from: a */
    public final void mo77564a(AudioTrack audioTrack, boolean z) {
        super.mo77564a(audioTrack, z);
        this.f28133k = 0L;
        this.f28134l = 0L;
        this.f28135m = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.C14807k
    /* renamed from: b */
    public final long mo77563b() {
        return this.f28135m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.C14807k
    /* renamed from: c */
    public final long mo77562c() {
        return this.f28132j.nanoTime;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.C14807k
    /* renamed from: e */
    public final boolean mo77561e() {
        boolean timestamp = this.f28123a.getTimestamp(this.f28132j);
        if (timestamp) {
            long j = this.f28132j.framePosition;
            if (this.f28134l > j) {
                this.f28133k++;
            }
            this.f28134l = j;
            this.f28135m = j + (this.f28133k << 32);
        }
        return timestamp;
    }
}
