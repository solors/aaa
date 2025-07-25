package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.RequiresApi;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.C6454bg;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p146IL.C6452bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.C6490IL;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.C6492bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6494bX;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.eqN.IL */
/* loaded from: classes3.dex */
public class C6460IL extends AbstractC6471bg {

    /* renamed from: IL */
    private final MediaPlayer f13484IL;

    /* renamed from: bX */
    private final C6461bg f13485bX;
    private C6454bg eqN;

    /* renamed from: iR */
    private volatile boolean f13486iR;
    private final Object ldr;

    /* renamed from: zx */
    private Surface f13487zx;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.eqN.IL$bg */
    /* loaded from: classes3.dex */
    public static class C6461bg implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: bg */
        private final WeakReference<C6460IL> f13488bg;

        public C6461bg(C6460IL c6460il) {
            this.f13488bg = new WeakReference<>(c6460il);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            try {
                C6460IL c6460il = this.f13488bg.get();
                if (c6460il != null) {
                    c6460il.m91841bg(i);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                C6460IL c6460il = this.f13488bg.get();
                if (c6460il != null) {
                    c6460il.m91843bX();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C6460IL c6460il = this.f13488bg.get();
                if (c6460il == null) {
                    return false;
                }
                if (!c6460il.m91840bg(i, i2)) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C6460IL c6460il = this.f13488bg.get();
                if (c6460il == null) {
                    return false;
                }
                if (!c6460il.m91844IL(i, i2)) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                C6460IL c6460il = this.f13488bg.get();
                if (c6460il != null) {
                    c6460il.m91845IL();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                C6460IL c6460il = this.f13488bg.get();
                if (c6460il != null) {
                    c6460il.eqN();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C6460IL c6460il = this.f13488bg.get();
                if (c6460il != null) {
                    c6460il.m91839bg(i, i2, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C6460IL() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.ldr = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f13484IL = mediaPlayer;
        }
        m91865bg(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.f13485bX = new C6461bg(this);
        m91864vb();
    }

    /* renamed from: Lq */
    private void m91866Lq() {
        C6454bg c6454bg = this.eqN;
        if (c6454bg != null) {
            try {
                c6454bg.close();
            } catch (Throwable unused) {
            }
            this.eqN = null;
        }
    }

    /* renamed from: bg */
    private void m91865bg(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object newInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(C6492bX.m91759bg(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            declaredField.set(newInstance, new Handler());
            declaredField.setAccessible(false);
            mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, newInstance, null);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: vb */
    private void m91864vb() {
        this.f13484IL.setOnPreparedListener(this.f13485bX);
        this.f13484IL.setOnBufferingUpdateListener(this.f13485bX);
        this.f13484IL.setOnCompletionListener(this.f13485bX);
        this.f13484IL.setOnSeekCompleteListener(this.f13485bX);
        this.f13484IL.setOnVideoSizeChangedListener(this.f13485bX);
        this.f13484IL.setOnErrorListener(this.f13485bX);
        this.f13484IL.setOnInfoListener(this.f13485bX);
    }

    private void xxp() {
        try {
            Surface surface = this.f13487zx;
            if (surface != null) {
                surface.release();
                this.f13487zx = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: IL */
    public void mo91862IL(boolean z) throws Throwable {
        this.f13484IL.setScreenOnWhilePlaying(z);
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: Kg */
    public void mo91861Kg() {
        MediaPlayer mediaPlayer = this.f13484IL;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: PX */
    public void mo91860PX() throws Throwable {
        try {
            this.f13484IL.reset();
        } catch (Throwable unused) {
        }
        m91866Lq();
        m91842bg();
        m91864vb();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: Ta */
    public int mo91859Ta() {
        MediaPlayer mediaPlayer = this.f13484IL;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: VB */
    public void mo91858VB() throws Throwable {
        synchronized (this.ldr) {
            if (!this.f13486iR) {
                this.f13484IL.release();
                this.f13486iR = true;
                xxp();
                m91866Lq();
                m91842bg();
                m91864vb();
            }
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: WR */
    public long mo91857WR() {
        try {
            return this.f13484IL.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: bX */
    public void mo91856bX(boolean z) throws Throwable {
        this.f13484IL.setLooping(z);
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: eo */
    public long mo91848eo() {
        try {
            return this.f13484IL.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    public void eqN(boolean z) throws Throwable {
        MediaPlayer mediaPlayer = this.f13484IL;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        xxp();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: iR */
    public void mo91847iR() throws Throwable {
        this.f13484IL.pause();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    public void ldr() throws Throwable {
        this.f13484IL.stop();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    public int yDt() {
        MediaPlayer mediaPlayer = this.f13484IL;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: zx */
    public void mo91846zx() throws Throwable {
        this.f13484IL.start();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: bg */
    public void mo91853bg(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.ldr) {
            try {
                if (!this.f13486iR && surfaceHolder != null && surfaceHolder.getSurface() != null && this.f13492bg) {
                    this.f13484IL.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    @TargetApi(14)
    /* renamed from: bg */
    public void mo91854bg(Surface surface) {
        xxp();
        this.f13487zx = surface;
        this.f13484IL.setSurface(surface);
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    @RequiresApi(api = 23)
    /* renamed from: bg */
    public void mo91852bg(C6490IL c6490il) throws Throwable {
        this.f13484IL.setPlaybackParams(this.f13484IL.getPlaybackParams().setSpeed(c6490il.m91763bg()));
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: bg */
    public void mo91849bg(String str) throws Throwable {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.f13484IL.setDataSource(parse.getPath());
        } else {
            this.f13484IL.setDataSource(str);
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: bg */
    public void mo91850bg(FileDescriptor fileDescriptor) throws Throwable {
        this.f13484IL.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    @RequiresApi(api = 23)
    /* renamed from: bg */
    public synchronized void mo91851bg(C6494bX c6494bX) {
        this.eqN = C6454bg.m91885bg(C6492bX.m91759bg(), c6494bX);
        C6452bX.m91887bg(c6494bX);
        this.f13484IL.setDataSource(this.eqN);
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX
    /* renamed from: bg */
    public void mo91855bg(long j, int i) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.f13484IL.seekTo((int) j);
        } else if (i == 0) {
            this.f13484IL.seekTo((int) j, 0);
        } else if (i == 1) {
            this.f13484IL.seekTo((int) j, 1);
        } else if (i == 2) {
            this.f13484IL.seekTo((int) j, 2);
        } else if (i == 3) {
            this.f13484IL.seekTo((int) j, 3);
        } else {
            this.f13484IL.seekTo((int) j);
        }
    }
}
