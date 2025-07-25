package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import com.yandex.mobile.ads.impl.ge1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class w40 implements e71 {
    @NotNull

    /* renamed from: a */
    private final b40 f87107a;
    @NotNull

    /* renamed from: b */
    private final au0 f87108b;
    @NotNull

    /* renamed from: c */
    private final s92 f87109c;
    @NotNull

    /* renamed from: d */
    private final d71 f87110d;
    @NotNull

    /* renamed from: e */
    private final ca2 f87111e;
    @NotNull

    /* renamed from: f */
    private final C31723a f87112f;
    @NotNull

    /* renamed from: g */
    private final n40 f87113g;
    @Nullable

    /* renamed from: h */
    private u71 f87114h;
    @Nullable

    /* renamed from: i */
    private h72 f87115i;

    /* renamed from: j */
    private boolean f87116j;

    /* renamed from: k */
    private boolean f87117k;

    /* renamed from: com.yandex.mobile.ads.impl.w40$a */
    /* loaded from: classes8.dex */
    private final class C31723a implements ge1.InterfaceC30382b {

        /* renamed from: a */
        private boolean f87118a;

        /* renamed from: b */
        private boolean f87119b;

        /* renamed from: c */
        private boolean f87120c;

        public C31723a() {
        }

        @Override // com.yandex.mobile.ads.impl.ge1.InterfaceC30382b
        /* renamed from: b */
        public final void mo28031b(@NotNull a40 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f87118a = false;
            w40.this.f87113g.m31662b();
            w40.this.f87107a.stop();
            w40.this.f87109c.m29665a(error.getMessage());
            h72 h72Var = w40.this.f87115i;
            a72 a72Var = w40.this.f87114h;
            if (h72Var != null && a72Var != null) {
                w40.this.f87110d.getClass();
                h72Var.mo27655a(a72Var, d71.m35089a(error));
            }
        }

        @Override // com.yandex.mobile.ads.impl.ge1.InterfaceC30382b
        public final void onIsPlayingChanged(boolean z) {
            if (z) {
                if (!this.f87118a) {
                    h72 h72Var = w40.this.f87115i;
                    a72 a72Var = w40.this.f87114h;
                    if (h72Var != null && a72Var != null) {
                        this.f87118a = true;
                        h72Var.mo27647h(a72Var);
                    }
                } else if (this.f87120c) {
                    this.f87120c = false;
                    h72 h72Var2 = w40.this.f87115i;
                    a72 a72Var2 = w40.this.f87114h;
                    if (h72Var2 != null && a72Var2 != null) {
                        h72Var2.mo27648g(a72Var2);
                    }
                }
            } else if (!this.f87119b) {
                this.f87120c = true;
                h72 h72Var3 = w40.this.f87115i;
                a72 a72Var3 = w40.this.f87114h;
                if (h72Var3 != null && a72Var3 != null) {
                    h72Var3.mo27653b(a72Var3);
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.ge1.InterfaceC30382b
        public final void onPlaybackStateChanged(int i) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.f87118a = false;
                        h72 h72Var = w40.this.f87115i;
                        a72 a72Var = w40.this.f87114h;
                        if (h72Var != null && a72Var != null) {
                            h72Var.mo27657a(a72Var);
                            return;
                        }
                        return;
                    }
                    return;
                }
                w40.this.f87113g.m31662b();
                h72 h72Var2 = w40.this.f87115i;
                a72 a72Var2 = w40.this.f87114h;
                if (h72Var2 != null && a72Var2 != null) {
                    h72Var2.mo27651d(a72Var2);
                }
                if (this.f87119b) {
                    this.f87119b = false;
                    h72 h72Var3 = w40.this.f87115i;
                    a72 a72Var3 = w40.this.f87114h;
                    if (h72Var3 != null && a72Var3 != null) {
                        h72Var3.mo27652c(a72Var3);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f87119b = true;
            h72 h72Var4 = w40.this.f87115i;
            a72 a72Var4 = w40.this.f87114h;
            if (h72Var4 != null && a72Var4 != null) {
                h72Var4.mo27649f(a72Var4);
            }
        }
    }

    public w40(@NotNull b40 exoPlayer, @NotNull au0 mediaSourceProvider, @NotNull s92 playerEventsReporter, @NotNull d71 videoAdPlayerErrorConverter, @NotNull ca2 videoScaleController) {
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(mediaSourceProvider, "mediaSourceProvider");
        Intrinsics.checkNotNullParameter(playerEventsReporter, "playerEventsReporter");
        Intrinsics.checkNotNullParameter(videoAdPlayerErrorConverter, "videoAdPlayerErrorConverter");
        Intrinsics.checkNotNullParameter(videoScaleController, "videoScaleController");
        this.f87107a = exoPlayer;
        this.f87108b = mediaSourceProvider;
        this.f87109c = playerEventsReporter;
        this.f87110d = videoAdPlayerErrorConverter;
        this.f87111e = videoScaleController;
        C31723a c31723a = new C31723a();
        this.f87112f = c31723a;
        this.f87113g = new n40(c31723a);
        exoPlayer.mo33869b(c31723a);
        exoPlayer.mo33869b(videoScaleController);
        C31795x5.m27660a(this);
    }

    @Override // com.yandex.mobile.ads.impl.e71
    public final long getAdPosition() {
        return this.f87107a.getCurrentPosition();
    }

    @Override // com.yandex.mobile.ads.impl.e71
    public final float getVolume() {
        return this.f87107a.getVolume();
    }

    @Override // com.yandex.mobile.ads.impl.e71
    public final boolean isPlayingAd() {
        return ((AbstractC31374sj) this.f87107a).m29596b();
    }

    @Override // com.yandex.mobile.ads.impl.e71
    public final void pauseAd() {
        if (!this.f87116j) {
            this.f87107a.setPlayWhenReady(false);
        }
    }

    @Override // com.yandex.mobile.ads.impl.e71
    public final void resumeAd() {
        if (!this.f87116j && !this.f87117k) {
            this.f87107a.setPlayWhenReady(true);
        }
    }

    @Override // com.yandex.mobile.ads.impl.e71
    public final void setVolume(float f) {
        if (!this.f87116j) {
            this.f87107a.setVolume(f);
            h72 h72Var = this.f87115i;
            u71 u71Var = this.f87114h;
            if (h72Var != null && u71Var != null) {
                h72Var.mo27656a(u71Var, f);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.e71
    /* renamed from: a */
    public final void mo28045a(@NotNull g72 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f87116j) {
            return;
        }
        this.f87116j = true;
        this.f87117k = false;
        this.f87113g.m31662b();
        this.f87107a.setVideoTextureView(null);
        this.f87111e.m35323a((TextureView) null);
        this.f87107a.mo33870a(this.f87112f);
        this.f87107a.mo33870a(this.f87111e);
        this.f87107a.release();
    }

    @Override // com.yandex.mobile.ads.impl.e71
    /* renamed from: b */
    public final long mo28041b() {
        return this.f87107a.getDuration();
    }

    @Override // com.yandex.mobile.ads.impl.e71
    /* renamed from: c */
    public final void mo28039c() {
        if (!this.f87116j) {
            this.f87107a.setPlayWhenReady(true);
        }
        if (this.f87117k) {
            pauseAd();
        }
    }

    @Override // com.yandex.mobile.ads.impl.u90
    /* renamed from: d */
    public final void mo28037d() {
        this.f87117k = false;
    }

    @Override // com.yandex.mobile.ads.impl.e71
    /* renamed from: e */
    public final boolean mo28035e() {
        return this.f87116j;
    }

    @Override // com.yandex.mobile.ads.impl.u90
    /* renamed from: f */
    public final void mo28033f() {
        this.f87117k = true;
        pauseAd();
    }

    @Override // com.yandex.mobile.ads.impl.e71
    /* renamed from: a */
    public final void mo28043a(@NotNull u71 playbackInfo) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        this.f87114h = playbackInfo;
        if (this.f87116j) {
            return;
        }
        bi1 m35763a = this.f87108b.m35763a(playbackInfo);
        this.f87107a.setPlayWhenReady(false);
        this.f87107a.mo34330a(m35763a);
        this.f87107a.prepare();
        this.f87113g.m31664a();
    }

    @Override // com.yandex.mobile.ads.impl.e71
    /* renamed from: a */
    public final void mo28044a(@Nullable h72 h72Var) {
        this.f87115i = h72Var;
    }

    @Override // com.yandex.mobile.ads.impl.e71
    /* renamed from: a */
    public final void mo28047a(@Nullable TextureView textureView) {
        if (this.f87116j) {
            return;
        }
        this.f87111e.m35323a(textureView);
        this.f87107a.setVideoTextureView(textureView);
    }

    @Override // com.yandex.mobile.ads.impl.e71
    /* renamed from: a */
    public final void mo28046a(@Nullable ea2 ea2Var) {
        if (this.f87116j) {
            return;
        }
        this.f87111e.m35322a(ea2Var);
    }

    @Override // com.yandex.mobile.ads.impl.e71
    /* renamed from: a */
    public final void mo28048a() {
        if (this.f87116j) {
            return;
        }
        h72 h72Var = this.f87115i;
        u71 u71Var = this.f87114h;
        if (h72Var != null && u71Var != null) {
            h72Var.mo27650e(u71Var);
        }
        this.f87116j = true;
        this.f87117k = false;
        this.f87113g.m31662b();
        this.f87107a.setVideoTextureView(null);
        this.f87111e.m35323a((TextureView) null);
        this.f87107a.mo33870a(this.f87112f);
        this.f87107a.mo33870a(this.f87111e);
        this.f87107a.release();
    }
}
