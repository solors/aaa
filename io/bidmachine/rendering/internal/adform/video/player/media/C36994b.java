package io.bidmachine.rendering.internal.adform.video.player.media;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.internal.adform.video.player.InterfaceTextureView$SurfaceTextureListenerC36984e;
import io.bidmachine.rendering.internal.view.C37061a;

/* renamed from: io.bidmachine.rendering.internal.adform.video.player.media.b */
/* loaded from: classes9.dex */
public class C36994b extends FrameLayout {

    /* renamed from: a */
    private final C37061a f97676a;

    /* renamed from: b */
    private InterfaceC36998c f97677b;

    /* renamed from: c */
    private MediaPlayer f97678c;

    /* renamed from: d */
    private Surface f97679d;

    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.media.b$b */
    /* loaded from: classes9.dex */
    private class C36996b implements MediaPlayer.OnVideoSizeChangedListener {
        private C36996b() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            C36994b.this.setVideoAspectRatio(i / i2);
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.media.b$c */
    /* loaded from: classes9.dex */
    private class C36997c implements InterfaceTextureView$SurfaceTextureListenerC36984e {
        private C36997c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C36994b.this.f97679d = new Surface(surfaceTexture);
            C36994b c36994b = C36994b.this;
            c36994b.setMediaPlayerSurface(c36994b.f97679d);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (C36994b.this.f97677b != null) {
                C36994b.this.f97677b.mo19322a();
                return false;
            }
            return false;
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceTextureView$SurfaceTextureListenerC36984e, android.view.TextureView.SurfaceTextureListener
        public /* bridge */ /* synthetic */ void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            super.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceTextureView$SurfaceTextureListenerC36984e, android.view.TextureView.SurfaceTextureListener
        public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            super.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public C36994b(Context context) {
        super(context);
        C37061a c37061a = new C37061a(context);
        this.f97676a = c37061a;
        c37061a.setSurfaceTextureListener(new C36997c());
        addView(c37061a, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaPlayerSurface(@Nullable Surface surface) {
        try {
            MediaPlayer mediaPlayer = this.f97678c;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface);
            }
        } catch (Throwable unused) {
        }
    }

    public void setListener(@Nullable InterfaceC36998c interfaceC36998c) {
        this.f97677b = interfaceC36998c;
    }

    public void setMediaPlayer(@Nullable MediaPlayer mediaPlayer) {
        this.f97678c = mediaPlayer;
        if (mediaPlayer != null) {
            setVideoAspectRatio(mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight());
            mediaPlayer.setOnVideoSizeChangedListener(new C36996b());
        }
    }

    public void setVideoAspectRatio(float f) {
        this.f97676a.setVideoAspectRatio(f);
    }

    /* renamed from: b */
    private void m19325b() {
        Surface surface = this.f97679d;
        if (surface != null) {
            surface.release();
        }
        this.f97679d = null;
    }

    /* renamed from: a */
    public void m19328a() {
        setMediaPlayerSurface(null);
        m19325b();
        this.f97678c = null;
        this.f97676a.setSurfaceTextureListener(null);
    }
}
