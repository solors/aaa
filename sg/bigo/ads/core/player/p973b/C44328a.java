package sg.bigo.ads.core.player.p973b;

import android.media.MediaPlayer;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.p903a.C43525i;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.core.player.b.a */
/* loaded from: classes10.dex */
public final class C44328a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: h */
    static final AtomicBoolean f116371h = new AtomicBoolean(false);
    @NonNull

    /* renamed from: a */
    MediaPlayer f116372a;

    /* renamed from: b */
    public String f116373b;
    @Nullable

    /* renamed from: c */
    InterfaceC44332a f116374c;

    /* renamed from: e */
    boolean f116376e;

    /* renamed from: f */
    boolean f116377f;

    /* renamed from: j */
    private Surface f116380j;

    /* renamed from: k */
    private long f116381k;

    /* renamed from: m */
    private boolean f116383m;

    /* renamed from: d */
    int f116375d = 0;

    /* renamed from: g */
    final Runnable f116378g = new Runnable() { // from class: sg.bigo.ads.core.player.b.a.1
        @Override // java.lang.Runnable
        public final void run() {
            if (C44328a.this.f116374c != null) {
                C44328a.this.f116374c.mo3333e();
            }
            if (C44328a.this.f116375d != 3 && C44328a.this.f116375d != 4 && C44328a.this.f116375d != 5) {
                C43727d.m5107a(2, C44328a.this.f116378g, 500L);
            }
        }
    };

    /* renamed from: l */
    private boolean f116382l = false;

    /* renamed from: i */
    int f116379i = 0;

    /* renamed from: sg.bigo.ads.core.player.b.a$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC44332a {
        /* renamed from: a */
        void mo3355a();

        /* renamed from: a */
        void mo3351a(int i, String str, int i2);

        /* renamed from: a */
        void mo3350a(MediaPlayer mediaPlayer, int i);

        /* renamed from: a */
        boolean mo3354a(int i);

        /* renamed from: a */
        boolean mo3353a(int i, int i2);

        /* renamed from: b */
        void mo3343b();

        /* renamed from: c */
        void mo3338c();

        /* renamed from: d */
        void mo3335d();

        /* renamed from: e */
        void mo3333e();

        /* renamed from: f */
        void mo3331f();

        /* renamed from: g */
        void mo3329g();
    }

    public C44328a() {
        this.f116383m = false;
        this.f116383m = C43525i.f114036a.mo4461m().mo5375a(3);
        m3359g();
    }

    /* renamed from: h */
    private boolean m3357h() {
        if (this.f116383m && this.f116379i < 3) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public boolean m3356i() {
        try {
            C43782a.m5010a(0, 3, "MediaPlayerWrapper", "prepareAsync");
            this.f116381k = SystemClock.elapsedRealtime();
            this.f116372a.prepareAsync();
            return true;
        } catch (Exception e) {
            InterfaceC44332a interfaceC44332a = this.f116374c;
            if (interfaceC44332a != null) {
                interfaceC44332a.mo3351a(10, Log.getStackTraceString(e), this.f116379i);
            }
            b(10);
            C43782a.m5009a(0, "MediaPlayerWrapper", "Player prepareAsync failed");
            return false;
        }
    }

    /* renamed from: c */
    public final int m3367c() {
        try {
            if (this.f116376e) {
                return this.f116372a.getCurrentPosition();
            }
            C43782a.m5009a(0, "MediaPlayerWrapper", "getCurrentPosition failed，not initialize or release already");
            return 0;
        } catch (IllegalStateException e) {
            InterfaceC44332a interfaceC44332a = this.f116374c;
            if (interfaceC44332a != null) {
                interfaceC44332a.mo3351a(5, Log.getStackTraceString(e), this.f116379i);
            }
            C43782a.m5009a(0, "MediaPlayerWrapper", "getCurrentPosition IllegalStateException");
            return 0;
        }
    }

    /* renamed from: d */
    public final boolean m3365d() {
        try {
            this.f116372a.stop();
            C43727d.m5106a(this.f116378g);
            this.f116375d = 4;
            C43782a.m5010a(0, 3, "MediaPlayerWrapper", "stop play");
            InterfaceC44332a interfaceC44332a = this.f116374c;
            if (interfaceC44332a != null) {
                interfaceC44332a.mo3335d();
            }
            return true;
        } catch (IllegalStateException e) {
            InterfaceC44332a interfaceC44332a2 = this.f116374c;
            if (interfaceC44332a2 != null) {
                interfaceC44332a2.mo3351a(6, Log.getStackTraceString(e), this.f116379i);
            }
            C43782a.m5009a(1, "MediaPlayerWrapper", "Failed to stop video: " + e.getMessage());
            return false;
        }
    }

    /* renamed from: e */
    public final void m3363e() {
        try {
            this.f116372a.release();
            f116371h.set(true);
            C43727d.m5106a(this.f116378g);
        } catch (IllegalStateException e) {
            InterfaceC44332a interfaceC44332a = this.f116374c;
            if (interfaceC44332a != null) {
                interfaceC44332a.mo3351a(7, Log.getStackTraceString(e), this.f116379i);
            }
            C43782a.m5009a(0, "MediaPlayerWrapper", "player release IllegalStateException");
        }
        this.f116375d = 0;
        this.f116376e = false;
        C43782a.m5010a(0, 3, "MediaPlayerWrapper", "player release called");
    }

    /* renamed from: f */
    public final int m3361f() {
        try {
            if (this.f116376e) {
                return this.f116372a.getDuration();
            }
            C43782a.m5009a(0, "MediaPlayerWrapper", "getDuration failed，not initialize or release already");
            return 0;
        } catch (IllegalStateException e) {
            InterfaceC44332a interfaceC44332a = this.f116374c;
            if (interfaceC44332a != null) {
                interfaceC44332a.mo3351a(8, Log.getStackTraceString(e), this.f116379i);
            }
            C43782a.m5009a(0, "MediaPlayerWrapper", "getDuration IllegalStateException");
            return 0;
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        C43782a.m5010a(0, 3, "MediaPlayerWrapper", "onBufferingUpdate percent = ".concat(String.valueOf(i)));
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        C43727d.m5106a(this.f116378g);
        InterfaceC44332a interfaceC44332a = this.f116374c;
        if (interfaceC44332a != null) {
            this.f116375d = 5;
            interfaceC44332a.mo3331f();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        InterfaceC44332a interfaceC44332a;
        if (m3357h() && (interfaceC44332a = this.f116374c) != null) {
            return interfaceC44332a.mo3353a(i, i2);
        }
        C43727d.m5106a(this.f116378g);
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        InterfaceC44332a interfaceC44332a = this.f116374c;
        if (interfaceC44332a != null) {
            return interfaceC44332a.mo3354a(i);
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (!this.f116377f) {
            C43782a.m5007b("MediaPlayerWrapper", "Surface is not available, do prepare cancel");
            return;
        }
        this.f116375d = 1;
        this.f116376e = true;
        C43782a.m5010a(0, 3, "MediaPlayerWrapper", "onPrepared called cost = " + (SystemClock.elapsedRealtime() - this.f116381k));
        InterfaceC44332a interfaceC44332a = this.f116374c;
        if (interfaceC44332a != null) {
            interfaceC44332a.mo3350a(mediaPlayer, this.f116379i);
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        InterfaceC44332a interfaceC44332a = this.f116374c;
        if (interfaceC44332a != null) {
            interfaceC44332a.mo3329g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m3359g() {
        this.f116372a = new MediaPlayer();
        f116371h.set(false);
        this.f116372a.setOnCompletionListener(this);
        this.f116372a.setOnErrorListener(this);
        this.f116372a.setOnInfoListener(this);
        this.f116372a.setOnPreparedListener(this);
        this.f116372a.setOnVideoSizeChangedListener(this);
        this.f116372a.setOnBufferingUpdateListener(this);
    }

    /* renamed from: a */
    public final void m3377a(Surface surface) {
        try {
            this.f116380j = surface;
            this.f116372a.setSurface(surface);
            this.f116377f = true;
        } catch (Exception e) {
            InterfaceC44332a interfaceC44332a = this.f116374c;
            if (interfaceC44332a != null) {
                interfaceC44332a.mo3351a(12, Log.getStackTraceString(e), this.f116379i);
            }
            b(12);
            C43782a.m5009a(0, "MediaPlayerWrapper", "setSurface IllegalStateException");
        }
    }

    public final void b(final int i) {
        if (!this.f116383m) {
            C43782a.m5010a(0, 3, "MediaPlayerWrapper", "createMediaPlayerWhenException switch is off");
            return;
        }
        int i2 = this.f116379i;
        if (i2 >= 3) {
            InterfaceC44332a interfaceC44332a = this.f116374c;
            if (interfaceC44332a != null) {
                interfaceC44332a.mo3351a(i, "retry times has reached limit", i2);
            }
            C43782a.m5010a(0, 3, "MediaPlayerWrapper", "createMediaPlayer times reach the limit(3 times), stop creating");
            return;
        }
        this.f116379i = i2 + 1;
        C43782a.m5010a(0, 3, "MediaPlayerWrapper", "start to create mediaPlayer, retry time: " + this.f116379i);
        m3363e();
        C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.core.player.b.a.3
            @Override // java.lang.Runnable
            public final void run() {
                C44328a.this.m3359g();
                int i3 = i;
                if (i3 != 9 && i3 != 10) {
                    if (i3 != 12) {
                        if (i3 != 15) {
                            return;
                        }
                    } else {
                        C44328a c44328a = C44328a.this;
                        c44328a.m3377a(c44328a.f116380j);
                        return;
                    }
                }
                C44328a c44328a2 = C44328a.this;
                c44328a2.m3377a(c44328a2.f116380j);
                C44328a c44328a3 = C44328a.this;
                c44328a3.m3376a(c44328a3.f116373b);
            }
        });
    }

    /* renamed from: a */
    public final void m3376a(final String str) {
        if (C43836q.m4837a((CharSequence) str)) {
            C43782a.m5009a(0, "MediaPlayerWrapper", "invalidate file path, set data source failed");
            return;
        }
        this.f116373b = str;
        C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (C44328a.this.m3369b(str)) {
                    C44328a.this.m3356i();
                }
            }
        });
    }

    /* renamed from: b */
    public final boolean m3371b() {
        try {
            this.f116372a.pause();
            C43727d.m5106a(this.f116378g);
            this.f116375d = 3;
            C43782a.m5010a(0, 3, "MediaPlayerWrapper", "pauseAd play");
            InterfaceC44332a interfaceC44332a = this.f116374c;
            if (interfaceC44332a != null) {
                interfaceC44332a.mo3338c();
            }
            return true;
        } catch (IllegalStateException e) {
            InterfaceC44332a interfaceC44332a2 = this.f116374c;
            if (interfaceC44332a2 != null) {
                interfaceC44332a2.mo3351a(4, Log.getStackTraceString(e), this.f116379i);
            }
            C43782a.m5009a(1, "MediaPlayerWrapper", "Failed to pause video: " + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m3369b(@NonNull String str) {
        try {
            if (!this.f116377f) {
                C43782a.m5007b("MediaPlayerWrapper", "Surface is not available, setDataSource cancel");
                return false;
            }
            C43782a.m5010a(0, 3, "MediaPlayerWrapper", "player setDataSource, path = ".concat(String.valueOf(str)));
            this.f116372a.reset();
            this.f116372a.setDataSource(str);
            return true;
        } catch (Exception e) {
            C43782a.m5009a(0, "MediaPlayerWrapper", "Player setDataSource failed");
            if (this.f116374c != null) {
                if (m3357h()) {
                    C43782a.m5007b("MediaPlayerWrapper", "setDataSource called onError");
                    this.f116374c.mo3353a(1, -1004);
                }
                this.f116374c.mo3351a(9, Log.getStackTraceString(e), this.f116379i);
            }
            b(9);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m3380a() {
        try {
            if (this.f116376e && this.f116377f) {
                if (this.f116372a.isPlaying()) {
                    C43782a.m5010a(0, 3, "MediaPlayerWrapper", "startAd but is playing, return.");
                    return true;
                }
                this.f116372a.start();
                if (!this.f116382l) {
                    this.f116382l = true;
                    InterfaceC44332a interfaceC44332a = this.f116374c;
                    if (interfaceC44332a != null) {
                        interfaceC44332a.mo3355a();
                    }
                }
                this.f116375d = 2;
                C43782a.m5010a(0, 3, "MediaPlayerWrapper", "startAd play called ");
                C43727d.m5106a(this.f116378g);
                C43727d.m5108a(2, this.f116378g);
                InterfaceC44332a interfaceC44332a2 = this.f116374c;
                if (interfaceC44332a2 != null) {
                    interfaceC44332a2.mo3343b();
                }
                return true;
            }
            C43782a.m5007b("MediaPlayerWrapper", "Surface is not available or player unprepared, do start play cancel");
            return false;
        } catch (IllegalStateException e) {
            InterfaceC44332a interfaceC44332a3 = this.f116374c;
            if (interfaceC44332a3 != null) {
                interfaceC44332a3.mo3351a(3, Log.getStackTraceString(e), this.f116379i);
            }
            C43782a.m5009a(1, "MediaPlayerWrapper", "Failed to play video: " + e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m3378a(int i) {
        try {
            C43782a.m5010a(0, 3, "MediaPlayerWrapper", "seekTo : ".concat(String.valueOf(i)));
            this.f116372a.seekTo(i);
            return true;
        } catch (IllegalStateException e) {
            InterfaceC44332a interfaceC44332a = this.f116374c;
            if (interfaceC44332a != null) {
                interfaceC44332a.mo3351a(1, Log.getStackTraceString(e), this.f116379i);
            }
            C43782a.m5009a(1, "MediaPlayerWrapper", "The video failed to seek:" + e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m3372a(boolean z) {
        try {
            if (z) {
                this.f116372a.setVolume(0.0f, 0.0f);
            } else {
                this.f116372a.setVolume(1.0f, 1.0f);
            }
        } catch (IllegalStateException e) {
            InterfaceC44332a interfaceC44332a = this.f116374c;
            if (interfaceC44332a != null) {
                interfaceC44332a.mo3351a(14, Log.getStackTraceString(e), this.f116379i);
            }
            C43782a.m5009a(1, "MediaPlayerWrapper", "The video failed to set volume: " + e.getMessage());
        }
        return z;
    }
}
