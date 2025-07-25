package com.p551my.target;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.p551my.target.InterfaceC26180w;

/* renamed from: com.my.target.p1 */
/* loaded from: classes7.dex */
public final class C25996p1 implements Player.Listener, InterfaceC26180w {

    /* renamed from: a */
    public final C26252y8 f67510a = C26252y8.m42300a(200);

    /* renamed from: b */
    public final ExoPlayer f67511b;

    /* renamed from: c */
    public final RunnableC25997a f67512c;

    /* renamed from: d */
    public InterfaceC26180w.InterfaceC26181a f67513d;

    /* renamed from: e */
    public MediaSource f67514e;

    /* renamed from: f */
    public Uri f67515f;

    /* renamed from: g */
    public boolean f67516g;

    /* renamed from: h */
    public boolean f67517h;

    /* renamed from: com.my.target.p1$a */
    /* loaded from: classes7.dex */
    public static final class RunnableC25997a implements Runnable {

        /* renamed from: a */
        public final int f67518a;

        /* renamed from: b */
        public final ExoPlayer f67519b;

        /* renamed from: c */
        public InterfaceC26180w.InterfaceC26181a f67520c;

        /* renamed from: d */
        public int f67521d;

        /* renamed from: e */
        public float f67522e;

        public RunnableC25997a(int i, ExoPlayer exoPlayer) {
            this.f67518a = i;
            this.f67519b = exoPlayer;
        }

        /* renamed from: a */
        public void m43226a(InterfaceC26180w.InterfaceC26181a interfaceC26181a) {
            this.f67520c = interfaceC26181a;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                float currentPosition = ((float) this.f67519b.getCurrentPosition()) / 1000.0f;
                float duration = ((float) this.f67519b.getDuration()) / 1000.0f;
                if (this.f67522e == currentPosition) {
                    this.f67521d++;
                } else {
                    InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f67520c;
                    if (interfaceC26181a != null) {
                        interfaceC26181a.mo42475a(currentPosition, duration);
                    }
                    this.f67522e = currentPosition;
                    if (this.f67521d > 0) {
                        this.f67521d = 0;
                    }
                }
                if (this.f67521d > this.f67518a) {
                    InterfaceC26180w.InterfaceC26181a interfaceC26181a2 = this.f67520c;
                    if (interfaceC26181a2 != null) {
                        interfaceC26181a2.mo42451m();
                    }
                    this.f67521d = 0;
                }
            } catch (Throwable th) {
                String str = "ExoVideoPlayer: Error - " + th.getMessage();
                AbstractC25846ja.m43680a(str);
                InterfaceC26180w.InterfaceC26181a interfaceC26181a3 = this.f67520c;
                if (interfaceC26181a3 != null) {
                    interfaceC26181a3.mo42466a(str);
                }
            }
        }
    }

    public C25996p1(Context context) {
        ExoPlayer build = new ExoPlayer.Builder(context).build();
        this.f67511b = build;
        build.addListener(this);
        this.f67512c = new RunnableC25997a(50, build);
    }

    /* renamed from: a */
    public final void m43227a(Throwable th) {
        String str = "ExoVideoPlayer: Error - " + th.getMessage();
        AbstractC25846ja.m43680a(str);
        InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f67513d;
        if (interfaceC26181a != null) {
            interfaceC26181a.mo42466a(str);
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: b */
    public void mo42639b() {
        float f;
        try {
            if (this.f67511b.getVolume() == 1.0d) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            setVolume(f);
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("ExoVideoPlayer: error - " + th.getMessage());
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: c */
    public boolean mo42638c() {
        if (this.f67516g && this.f67517h) {
            return true;
        }
        return false;
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: d */
    public void mo42637d() {
        try {
            this.f67511b.setVolume(0.2f);
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("ExoVideoPlayer: Error - " + th.getMessage());
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    public void destroy() {
        this.f67515f = null;
        this.f67516g = false;
        this.f67517h = false;
        this.f67513d = null;
        this.f67510a.m42297b(this.f67512c);
        try {
            this.f67511b.setVideoTextureView(null);
            this.f67511b.stop();
            this.f67511b.release();
            this.f67511b.removeListener(this);
        } catch (Throwable unused) {
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: e */
    public void mo42636e() {
        try {
            this.f67511b.setVolume(0.0f);
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("ExoVideoPlayer: Error - " + th.getMessage());
        }
        InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f67513d;
        if (interfaceC26181a != null) {
            interfaceC26181a.mo42476a(0.0f);
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: f */
    public boolean mo42635f() {
        return this.f67516g;
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: g */
    public void mo42634g() {
        try {
            this.f67511b.seekTo(0L);
            this.f67511b.setPlayWhenReady(true);
        } catch (Throwable th) {
            m43227a(th);
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    public float getDuration() {
        try {
            return ((float) this.f67511b.getDuration()) / 1000.0f;
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("ExoVideoPlayer: Error - " + th.getMessage());
            return 0.0f;
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    public Uri getUri() {
        return this.f67515f;
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: h */
    public boolean mo42633h() {
        try {
            if (this.f67511b.getVolume() != 0.0f) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("ExoVideoPlayer: Error - " + th.getMessage());
            return false;
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: i */
    public void mo42632i() {
        try {
            this.f67511b.setVolume(1.0f);
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("ExoVideoPlayer: Error - " + th.getMessage());
        }
        InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f67513d;
        if (interfaceC26181a != null) {
            interfaceC26181a.mo42476a(1.0f);
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    public boolean isPlaying() {
        if (this.f67516g && !this.f67517h) {
            return true;
        }
        return false;
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: j */
    public long mo42631j() {
        try {
            return this.f67511b.getCurrentPosition();
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("ExoVideoPlayer: Error - " + th.getMessage());
            return 0L;
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerError(PlaybackException playbackException) {
        String str;
        this.f67517h = false;
        this.f67516g = false;
        if (this.f67513d != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ExoVideoPlayer: Error - ");
            if (playbackException != null) {
                str = playbackException.getMessage();
            } else {
                str = "unknown video error";
            }
            sb2.append(str);
            this.f67513d.mo42466a(sb2.toString());
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerStateChanged(boolean z, int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        AbstractC25846ja.m43680a("ExoVideoPlayer: Player state is changed to ENDED");
                        this.f67517h = false;
                        this.f67516g = false;
                        float duration = getDuration();
                        InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f67513d;
                        if (interfaceC26181a != null) {
                            interfaceC26181a.mo42475a(duration, duration);
                        }
                        InterfaceC26180w.InterfaceC26181a interfaceC26181a2 = this.f67513d;
                        if (interfaceC26181a2 != null) {
                            interfaceC26181a2.onVideoCompleted();
                        }
                    } else {
                        return;
                    }
                } else {
                    AbstractC25846ja.m43680a("ExoVideoPlayer: Player state is changed to READY");
                    if (z) {
                        InterfaceC26180w.InterfaceC26181a interfaceC26181a3 = this.f67513d;
                        if (interfaceC26181a3 != null) {
                            interfaceC26181a3.mo42450o();
                        }
                        if (!this.f67516g) {
                            this.f67516g = true;
                        } else if (this.f67517h) {
                            this.f67517h = false;
                            InterfaceC26180w.InterfaceC26181a interfaceC26181a4 = this.f67513d;
                            if (interfaceC26181a4 != null) {
                                interfaceC26181a4.mo42456f();
                            }
                        }
                    } else if (!this.f67517h) {
                        this.f67517h = true;
                        InterfaceC26180w.InterfaceC26181a interfaceC26181a5 = this.f67513d;
                        if (interfaceC26181a5 != null) {
                            interfaceC26181a5.mo42459d();
                        }
                    }
                }
            } else {
                AbstractC25846ja.m43680a("ExoVideoPlayer: Player state is changed to BUFFERING");
                if (!z || this.f67516g) {
                    return;
                }
            }
            this.f67510a.m42299a(this.f67512c);
            return;
        }
        AbstractC25846ja.m43680a("ExoVideoPlayer: Player state is changed to IDLE");
        if (this.f67516g) {
            this.f67516g = false;
            InterfaceC26180w.InterfaceC26181a interfaceC26181a6 = this.f67513d;
            if (interfaceC26181a6 != null) {
                interfaceC26181a6.mo42453k();
            }
        }
        this.f67510a.m42297b(this.f67512c);
    }

    @Override // com.p551my.target.InterfaceC26180w
    public void pause() {
        if (this.f67516g && !this.f67517h) {
            try {
                this.f67511b.setPlayWhenReady(false);
            } catch (Throwable th) {
                m43227a(th);
            }
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    public void seekTo(long j) {
        try {
            this.f67511b.seekTo(j);
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("ExoVideoPlayer: Error - " + th.getMessage());
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    public void setVolume(float f) {
        try {
            this.f67511b.setVolume(f);
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("ExoVideoPlayer: Error - " + th.getMessage());
        }
        InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f67513d;
        if (interfaceC26181a != null) {
            interfaceC26181a.mo42476a(f);
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    public void stop() {
        try {
            this.f67511b.stop();
            this.f67511b.clearMediaItems();
        } catch (Throwable th) {
            m43227a(th);
        }
    }

    /* renamed from: a */
    public static C25996p1 m43228a(Context context) {
        return new C25996p1(context);
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: a */
    public void mo42643a(Uri uri, Context context) {
        AbstractC25846ja.m43680a("ExoVideoPlayer: prepare to play video in ExoPlayer");
        this.f67515f = uri;
        this.f67517h = false;
        InterfaceC26180w.InterfaceC26181a interfaceC26181a = this.f67513d;
        if (interfaceC26181a != null) {
            interfaceC26181a.mo42457e();
        }
        try {
            this.f67510a.m42299a(this.f67512c);
            this.f67511b.setPlayWhenReady(true);
            if (this.f67516g) {
                AbstractC25846ja.m43678b("ExoVideoPlayer: New source url not set! Will play previous video! started = true");
                return;
            }
            MediaSource m43973a = AbstractC25731e6.m43973a(uri, context);
            this.f67514e = m43973a;
            this.f67511b.setMediaSource(m43973a);
            this.f67511b.prepare();
            AbstractC25846ja.m43680a("ExoVideoPlayer: Play new video in ExoPlayer");
        } catch (Throwable th) {
            String str = "ExoVideoPlayer: Error - " + th.getMessage();
            AbstractC25846ja.m43680a(str);
            InterfaceC26180w.InterfaceC26181a interfaceC26181a2 = this.f67513d;
            if (interfaceC26181a2 != null) {
                interfaceC26181a2.mo42466a(str);
            }
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: a */
    public void mo42642a(Uri uri, C26203x c26203x) {
        mo42640a(c26203x);
        mo42643a(uri, c26203x.getContext());
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: a */
    public void mo42644a() {
        try {
            if (this.f67516g) {
                this.f67511b.setPlayWhenReady(true);
            } else {
                MediaSource mediaSource = this.f67514e;
                if (mediaSource != null) {
                    this.f67511b.setMediaSource(mediaSource, true);
                    this.f67511b.prepare();
                }
            }
        } catch (Throwable th) {
            m43227a(th);
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: a */
    public void mo42640a(C26203x c26203x) {
        try {
            if (c26203x != null) {
                c26203x.setExoPlayer(this.f67511b);
            } else {
                this.f67511b.setVideoTextureView(null);
            }
        } catch (Throwable th) {
            m43227a(th);
        }
    }

    @Override // com.p551my.target.InterfaceC26180w
    /* renamed from: a */
    public void mo42641a(InterfaceC26180w.InterfaceC26181a interfaceC26181a) {
        this.f67513d = interfaceC26181a;
        this.f67512c.m43226a(interfaceC26181a);
    }
}
