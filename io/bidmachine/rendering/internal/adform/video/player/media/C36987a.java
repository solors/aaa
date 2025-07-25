package io.bidmachine.rendering.internal.adform.video.player.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a;
import io.bidmachine.rendering.model.Error;

/* renamed from: io.bidmachine.rendering.internal.adform.video.player.media.a */
/* loaded from: classes9.dex */
public class C36987a extends AbstractC36979a {

    /* renamed from: k */
    private final Context f97667k;

    /* renamed from: l */
    private final MediaPlayer f97668l;

    /* renamed from: m */
    private final C36994b f97669m;

    /* renamed from: n */
    private float f97670n = 1.0f;

    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.media.a$b */
    /* loaded from: classes9.dex */
    private class C36989b implements InterfaceC36998c {
        private C36989b() {
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.media.InterfaceC36998c
        /* renamed from: a */
        public void mo19322a() {
            if (C36987a.this.m19390e()) {
                C36987a.this.m19397b(new Error("Surface Destroyed"));
            }
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.media.a$c */
    /* loaded from: classes9.dex */
    private class C36990c implements MediaPlayer.OnCompletionListener {
        private C36990c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            C36987a.this.m19384q();
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.media.a$d */
    /* loaded from: classes9.dex */
    private class C36991d implements MediaPlayer.OnErrorListener {
        private C36991d() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C36987a c36987a = C36987a.this;
            c36987a.m19404a(new Error("MediaPlayer - onError (what - " + i + ", extra - " + i2 + ")"));
            return true;
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.media.a$e */
    /* loaded from: classes9.dex */
    private class C36992e implements MediaPlayer.OnPreparedListener {
        private C36992e() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            C36987a.this.m19391d();
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.media.a$f */
    /* loaded from: classes9.dex */
    private class C36993f implements MediaPlayer.OnSeekCompleteListener {
        private C36993f() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            C36987a c36987a = C36987a.this;
            c36987a.m19405a(c36987a.mo19334h());
        }
    }

    public C36987a(Context context) {
        this.f97667k = context.getApplicationContext();
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f97668l = mediaPlayer;
        mediaPlayer.setLooping(false);
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
        mediaPlayer.setOnPreparedListener(new C36992e());
        mediaPlayer.setOnErrorListener(new C36991d());
        mediaPlayer.setOnSeekCompleteListener(new C36993f());
        mediaPlayer.setOnCompletionListener(new C36990c());
        C36994b c36994b = new C36994b(context);
        this.f97669m = c36994b;
        c36994b.setListener(new C36989b());
        c36994b.setMediaPlayer(mediaPlayer);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: A */
    protected void mo19346A() {
        this.f97668l.prepareAsync();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: B */
    protected void mo19345B() {
        this.f97668l.stop();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: c */
    protected void mo19337c(long j) {
        this.f97668l.seekTo((int) j);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: d */
    protected void mo19336d(float f) {
        this.f97670n = f;
        this.f97668l.setVolume(f, f);
        m19394c(f);
        m19406a(f);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a, io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: g */
    public long mo19335g() {
        return this.f97668l.getDuration();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a, io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    public float getVolume() {
        return this.f97670n;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a, io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: h */
    public long mo19334h() {
        return this.f97668l.getCurrentPosition();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a, io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: o */
    public View mo19333o() {
        return this.f97669m;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: w */
    protected boolean mo19332w() {
        return this.f97668l.isPlaying();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: x */
    protected boolean mo19331x() {
        return false;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: y */
    protected void mo19330y() {
        this.f97668l.pause();
        m19388k();
        m19400b();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: z */
    protected void mo19329z() {
        this.f97668l.start();
        m19386n();
        m19379v();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a
    /* renamed from: b */
    protected void mo19340b(Uri uri) {
        this.f97668l.reset();
        this.f97668l.setDataSource(this.f97667k, uri);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.AbstractC36979a, io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: a */
    public void mo19344a() {
        super.mo19344a();
        this.f97669m.m19328a();
        this.f97668l.reset();
        this.f97668l.release();
    }
}
