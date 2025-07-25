package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.j */
/* loaded from: classes4.dex */
public final class C14806j extends Thread {

    /* renamed from: a */
    public final /* synthetic */ AudioTrack f28121a;

    /* renamed from: b */
    public final /* synthetic */ C14814r f28122b;

    public C14806j(C14814r c14814r, AudioTrack audioTrack) {
        this.f28122b = c14814r;
        this.f28121a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f28121a.flush();
            this.f28121a.release();
        } finally {
            this.f28122b.f28172e.open();
        }
    }
}
