package com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.C32508cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.C32510coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32664c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32667cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.C32259coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.VideoAd;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32282ccoc2oic;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32313coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.File;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic */
/* loaded from: classes8.dex */
public class TextureView$SurfaceTextureListenerC32290cicic extends FrameLayout implements InterfaceC32509coi222o222, TextureView.SurfaceTextureListener {
    public static final int c22ic = 8;
    public static final int c2iiio = 1;
    public static final int c2ooc2c2 = 3;
    private static final int ccc22i = 50;
    private static final String cccc2coi = "Learn More";
    private static final String cccccioi = "ColumbusVideoPlayer";
    public static final int cciicii2o22 = 10;
    public static final int ccoi2oo = -1;
    public static final int ci2cci2 = 11;
    public static final int cicccco22cc = 2;
    public static final int cii2co = 6;
    public static final int cii2coco = 2;
    public static final int ciiiioccoc = 5;
    public static final int ciio2 = 13;
    public static final int ciocicoc2 = 4;
    public static final int co22i2c22 = 1;
    public static final int co2c2o2 = 0;
    public static final int coc2coo = 7;
    public static final int cocoic = 14;
    public static final int coic2cccc2 = 12;
    private C32510coo2iico c222o2o2c2o;
    private FrameLayout c22o22co22i;
    private Bitmap c2ccci2iii;
    public boolean c2cciooo;
    private String c2ccocci;
    private ImageView c2cic2;
    private MediaPlayer.OnVideoSizeChangedListener c2ic2icoi;
    private int c2oc2i;
    private Context c2oc2o;
    private MediaPlayer c2oicci2;
    private volatile boolean cc2iiooocc2;
    private InterfaceC32507c2oc2o cc2o22co2c;
    private boolean ccci2;
    AudioManager.OnAudioFocusChangeListener cccoo22o2;
    private boolean cciccio;
    private C32294ccoc2oic ccii2o2;
    private ViewGroup cco22;
    private Map<String, List<String>> ccoc2oic;
    private boolean ccoio;
    private SoftReference<Activity> ci22c2;
    private List<C32664c2oc2i> cicc2iiccc;
    private AbstractC32320coo2iico cici2o2oo;
    private C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222.C32676c2oc2i cicic;
    private AudioFocusRequest cicoic;
    private Handler cii2c2;
    private VideoAd ciii2coi2;
    private boolean ciiio2o;
    private String ciiioc2ioc;
    private SurfaceTexture ciio2c;
    private Surface cioc2;
    private int cioccoiococ;
    private MediaPlayer.OnErrorListener cioii2c22c2;
    private RelativeLayout cioiic;
    private MediaPlayer.OnInfoListener coc22;
    private final List<Integer> coccoi2;
    private boolean coi222o222;
    private MediaPlayer.OnPreparedListener coi2ccc2;
    private C32259coi222o222 coiic;
    private AudioManager coiio2;
    private int coo2iico;
    private C32313coi222o222 coocii;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic$c2oc2i */
    /* loaded from: classes8.dex */
    public class RunnableC32291c2oc2i implements Runnable {
        RunnableC32291c2oc2i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((View$OnClickListenerC32319coiic) TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo).ccoio();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic$c2oc2o */
    /* loaded from: classes8.dex */
    public class C32292c2oc2o implements C32313coi222o222.InterfaceC32317coi222o222 {
        C32292c2oc2o() {
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32313coi222o222.InterfaceC32317coi222o222
        public void coo2iico(boolean z) {
            if (!TextureView$SurfaceTextureListenerC32290cicic.this.cc2iiooocc2 && (TextureView$SurfaceTextureListenerC32290cicic.this.c222o2o2c2o() || TextureView$SurfaceTextureListenerC32290cicic.this.cco22())) {
                TextureView$SurfaceTextureListenerC32290cicic.this.cii2c2();
                MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "INVISIBLE STOP PLAY!");
                TextureView$SurfaceTextureListenerC32290cicic.this.ccci2 = true;
            } else if (!TextureView$SurfaceTextureListenerC32290cicic.this.cc2iiooocc2) {
                MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "VideoPlayer is invisible");
            } else if (TextureView$SurfaceTextureListenerC32290cicic.this.ciiio2o && TextureView$SurfaceTextureListenerC32290cicic.this.c2oc2i == 10) {
                if (!z) {
                    TextureView$SurfaceTextureListenerC32290cicic.this.ccci2 = true;
                    if (TextureView$SurfaceTextureListenerC32290cicic.this.ciii2coi2 != null && TextureView$SurfaceTextureListenerC32290cicic.this.ciii2coi2.isInterruptVideoPlay()) {
                        TextureView$SurfaceTextureListenerC32290cicic.this.ciii2coi2();
                    } else if (TextureView$SurfaceTextureListenerC32290cicic.this.c222o2o2c2o() || TextureView$SurfaceTextureListenerC32290cicic.this.cco22()) {
                        TextureView$SurfaceTextureListenerC32290cicic.this.cii2c2();
                        MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "TOP PLAY!");
                    }
                } else if (TextureView$SurfaceTextureListenerC32290cicic.this.cco22()) {
                } else {
                    if (TextureView$SurfaceTextureListenerC32290cicic.this.ccci2 && (TextureView$SurfaceTextureListenerC32290cicic.this.ciio2c() || TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo())) {
                        TextureView$SurfaceTextureListenerC32290cicic.this.ccci2 = false;
                        TextureView$SurfaceTextureListenerC32290cicic.this.cioccoiococ();
                        MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "RESTART PLAY!");
                    } else if ((TextureView$SurfaceTextureListenerC32290cicic.this.ciio2c() || TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo()) && TextureView$SurfaceTextureListenerC32290cicic.this.ciii2coi2 != null && !TextureView$SurfaceTextureListenerC32290cicic.this.ciii2coi2.isInterruptVideoPlay()) {
                        TextureView$SurfaceTextureListenerC32290cicic.this.cioccoiococ();
                        MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "RESTART PLAY!");
                    } else if (!TextureView$SurfaceTextureListenerC32290cicic.this.ccoc2oic() && !TextureView$SurfaceTextureListenerC32290cicic.this.cicic() && !TextureView$SurfaceTextureListenerC32290cicic.this.cc2o22co2c()) {
                        if (TextureView$SurfaceTextureListenerC32290cicic.this.ccoio() && TextureView$SurfaceTextureListenerC32290cicic.this.cciccio) {
                            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "video completed, auto restart play");
                            TextureView$SurfaceTextureListenerC32290cicic.this.cioccoiococ();
                        }
                    } else {
                        MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "START PLAY!");
                        TextureView$SurfaceTextureListenerC32290cicic.this.c2oicci2();
                    }
                }
            }
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic$cco22 */
    /* loaded from: classes8.dex */
    class C32293cco22 implements AudioManager.OnAudioFocusChangeListener {
        C32293cco22() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i != -3) {
                if (i != -2) {
                    if (i != -1) {
                        if (i == 1) {
                            MLog.m25887i(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "AudioManager.AUDIOFOCUS_GAIN");
                            if (TextureView$SurfaceTextureListenerC32290cicic.this.c2oicci2 != null) {
                                TextureView$SurfaceTextureListenerC32290cicic.this.c2oicci2.setVolume(0.0f, 0.0f);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    MLog.m25887i(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "AudioManager.AUDIOFOCUS_LOSS");
                    return;
                }
                MLog.m25887i(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "AUDIOFOCUS_LOSS_TRANSIENT");
                return;
            }
            MLog.m25887i(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic$ccoc2oic */
    /* loaded from: classes8.dex */
    public static class C32294ccoc2oic implements MediaPlayer.OnCompletionListener {
        WeakReference<TextureView$SurfaceTextureListenerC32290cicic> coo2iico;

        C32294ccoc2oic(TextureView$SurfaceTextureListenerC32290cicic textureView$SurfaceTextureListenerC32290cicic) {
            this.coo2iico = new WeakReference<>(textureView$SurfaceTextureListenerC32290cicic);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "CompleteListener onCompletion");
            TextureView$SurfaceTextureListenerC32290cicic textureView$SurfaceTextureListenerC32290cicic = this.coo2iico.get();
            if (textureView$SurfaceTextureListenerC32290cicic != null) {
                C32284cicc2iiccc.coo2iico((List) textureView$SurfaceTextureListenerC32290cicic.ccoc2oic.get("complete"));
                textureView$SurfaceTextureListenerC32290cicic.coo2iico = 7;
                textureView$SurfaceTextureListenerC32290cicic.cici2o2oo.c2oc2i(textureView$SurfaceTextureListenerC32290cicic.coo2iico);
                textureView$SurfaceTextureListenerC32290cicic.cc2o22co2c.coi222o222(String.valueOf(textureView$SurfaceTextureListenerC32290cicic.getDuration() / 1000));
                MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "Listener STATE_COMPLETED");
                textureView$SurfaceTextureListenerC32290cicic.c22o22co22i.setKeepScreenOn(false);
            }
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic$cicc2iiccc */
    /* loaded from: classes8.dex */
    class C32295cicc2iiccc implements MediaPlayer.OnErrorListener {
        C32295cicc2iiccc() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (i != -38 && i != Integer.MIN_VALUE && i2 != -38 && i2 != Integer.MIN_VALUE) {
                TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico = -1;
                TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.c2oc2i(TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico);
                MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onError ——> STATE_ERROR ———— what：" + i + ", extra: " + i2);
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic$cicic */
    /* loaded from: classes8.dex */
    class C32296cicic implements MediaPlayer.OnVideoSizeChangedListener {
        C32296cicic() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            TextureView$SurfaceTextureListenerC32290cicic.this.c222o2o2c2o.coo2iico(i, i2);
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onVideoSizeChanged ->width" + i + " height" + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic$cii2c2 */
    /* loaded from: classes8.dex */
    public class RunnableC32297cii2c2 implements Runnable {
        RunnableC32297cii2c2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "delayed play media");
            if (TextureView$SurfaceTextureListenerC32290cicic.this.c2oicci2 != null) {
                TextureView$SurfaceTextureListenerC32290cicic.this.c2oicci2.seekTo(0);
            }
            if (TextureView$SurfaceTextureListenerC32290cicic.this.cioiic != null) {
                TextureView$SurfaceTextureListenerC32290cicic.this.cioiic.setVisibility(4);
            }
            if (TextureView$SurfaceTextureListenerC32290cicic.this.c222o2o2c2o != null) {
                TextureView$SurfaceTextureListenerC32290cicic.this.c222o2o2c2o.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic$ciii2coi2 */
    /* loaded from: classes8.dex */
    public class C32298ciii2coi2 implements InterfaceC32507c2oc2o {
        C32298ciii2coi2() {
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void c222o2o2c2o(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onCollapse");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void c22o22co22i(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onMute");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void c2oc2i(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onMidpoint");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void c2oc2o(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, C21114v8.C21122h.f54094u0);
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void c2oicci2(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onStart");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void cco22(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onThirdQuartile");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void ccoc2oic(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onExpand");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void cicc2iiccc(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onFirstQuartile");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void cicic(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onExitFullScreen");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void cii2c2(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onUnmute");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void ciii2coi2(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onStop");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void cioccoiococ(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, C21114v8.C21122h.f54092t0);
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void coi222o222() {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onCreativeView");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void coiic(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onFullScreen");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void coiio2(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onRewind");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void coo2iico(String str, String str2) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onClick");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void coi222o222(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onComplete");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32507c2oc2o
        public void coo2iico(String str) {
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onClosed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic$cioccoiococ */
    /* loaded from: classes8.dex */
    public class RunnableC32299cioccoiococ implements Runnable {
        RunnableC32299cioccoiococ() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.getParent() != null) {
                ((ViewGroup) TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.getParent()).removeView(TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (TextureView$SurfaceTextureListenerC32290cicic.this.c2ccocci != null && !TextureView$SurfaceTextureListenerC32290cicic.this.c2ccocci.equals(TextureView$SurfaceTextureListenerC32290cicic.cccc2coi)) {
                if (TextUtils.isEmpty(TextureView$SurfaceTextureListenerC32290cicic.this.coiic.ciii2coi2())) {
                    TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.setLearnMoreText(TextureView$SurfaceTextureListenerC32290cicic.this.c2ccocci);
                } else {
                    TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.setLearnMoreText(TextureView$SurfaceTextureListenerC32290cicic.this.coiic.ciii2coi2());
                }
            }
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "add mPlayerController to mContainer");
            TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.cicic();
            TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.setColumbusVideoPlayer(TextureView$SurfaceTextureListenerC32290cicic.this);
            TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            TextureView$SurfaceTextureListenerC32290cicic textureView$SurfaceTextureListenerC32290cicic = TextureView$SurfaceTextureListenerC32290cicic.this;
            textureView$SurfaceTextureListenerC32290cicic.addView(textureView$SurfaceTextureListenerC32290cicic.cici2o2oo, layoutParams);
            TextureView$SurfaceTextureListenerC32290cicic.this.ccci2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic$coi222o222 */
    /* loaded from: classes8.dex */
    public class RunnableC32300coi222o222 implements Runnable {
        RunnableC32300coi222o222() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextureView$SurfaceTextureListenerC32290cicic.this.c222o2o2c2o != null && TextureView$SurfaceTextureListenerC32290cicic.this.c222o2o2c2o.getParent() != null) {
                ((ViewGroup) TextureView$SurfaceTextureListenerC32290cicic.this.c222o2o2c2o.getParent()).removeView(TextureView$SurfaceTextureListenerC32290cicic.this.c222o2o2c2o);
            }
            TextureView$SurfaceTextureListenerC32290cicic.this.c222o2o2c2o = null;
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic$coiic */
    /* loaded from: classes8.dex */
    class C32301coiic implements MediaPlayer.OnPreparedListener {
        C32301coiic() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico = 2;
            TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.c2oc2i(TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico);
            MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "Listener STATE_PREPARED");
            TextureView$SurfaceTextureListenerC32290cicic.this.ccoi2oo();
            TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico = 3;
            TextureView$SurfaceTextureListenerC32290cicic.this.coi222o222 = true;
            List list = (List) TextureView$SurfaceTextureListenerC32290cicic.this.ccoc2oic.get("start");
            if (list != null) {
                C32284cicc2iiccc.coo2iico(list);
                TextureView$SurfaceTextureListenerC32290cicic.this.ccoc2oic.put("start", null);
            }
            TextureView$SurfaceTextureListenerC32290cicic.this.cc2o22co2c.c2oicci2(String.valueOf(TextureView$SurfaceTextureListenerC32290cicic.this.getDuration() / 1000));
            TextureView$SurfaceTextureListenerC32290cicic.this.coc22();
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicic$coo2iico */
    /* loaded from: classes8.dex */
    class C32302coo2iico implements MediaPlayer.OnInfoListener {
        C32302coo2iico() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i == 3) {
                TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico = 3;
                TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.c2oc2i(TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico);
                MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onInfo ——> MEDIA_INFO_VIDEO_RENDERING_START：STATE_PLAYING");
                return true;
            } else if (i == 701) {
                if (TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico == 4 || TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico == 6) {
                    TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico = 6;
                    MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onInfo ——> MEDIA_INFO_BUFFERING_START：STATE_BUFFERING_PAUSED");
                } else {
                    TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico = 5;
                    MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onInfo ——> MEDIA_INFO_BUFFERING_START：STATE_BUFFERING_PLAYING");
                }
                TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.c2oc2i(TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico);
                return true;
            } else if (i == 702) {
                if (TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico == 5) {
                    TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico = 3;
                    TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.c2oc2i(TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico);
                    MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onInfo ——> MEDIA_INFO_BUFFERING_END： STATE_PLAYING");
                }
                if (TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico == 6) {
                    TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico = 4;
                    TextureView$SurfaceTextureListenerC32290cicic.this.cici2o2oo.c2oc2i(TextureView$SurfaceTextureListenerC32290cicic.this.coo2iico);
                    MLog.m25892d(TextureView$SurfaceTextureListenerC32290cicic.cccccioi, "onInfo ——> MEDIA_INFO_BUFFERING_END： STATE_PAUSED");
                    return true;
                }
                return true;
            } else {
                return true;
            }
        }
    }

    public TextureView$SurfaceTextureListenerC32290cicic(Context context) {
        super(context, null);
        this.coo2iico = 0;
        this.coi222o222 = false;
        this.c2oc2i = 10;
        this.cioccoiococ = 1;
        this.ccoc2oic = new HashMap();
        this.ciiio2o = true;
        this.ccoio = true;
        this.cc2iiooocc2 = true;
        this.ccci2 = false;
        this.coccoi2 = Arrays.asList(1, 4);
        this.cciccio = false;
        this.c2cciooo = false;
        this.cccoo22o2 = new C32293cco22();
        this.coi2ccc2 = new C32301coiic();
        this.ccii2o2 = new C32294ccoc2oic(this);
        this.c2ic2icoi = new C32296cicic();
        this.cioii2c22c2 = new C32295cicc2iiccc();
        this.coc22 = new C32302coo2iico();
        this.c2oc2o = C32284cicc2iiccc.coo2iico(context);
        ci22c2();
        MLog.m25892d(cccccioi, "init player, no attrs");
    }

    private void c2cciooo() {
        MLog.m25892d(cccccioi, "initMediaPlayer");
        if (this.c2oicci2 == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.c2oicci2 = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            AbstractC32320coo2iico abstractC32320coo2iico = this.cici2o2oo;
            if (abstractC32320coo2iico != null && !abstractC32320coo2iico.cco22()) {
                float coi222o222 = C32284cicc2iiccc.coi222o222(this.c2oc2o);
                this.c2oicci2.setVolume(coi222o222, coi222o222);
                return;
            }
            this.c2oicci2.setVolume(0.0f, 0.0f);
        }
    }

    private void c2ic2icoi() {
        MediaPlayer mediaPlayer = this.c2oicci2;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            cc2iiooocc2();
        }
    }

    private void cccc2coi() {
        MLog.m25892d(cccccioi, "reset Player, set state idle");
        MediaPlayer mediaPlayer = this.c2oicci2;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.c2oicci2.setDisplay(null);
            this.c2oicci2.reset();
            cc2iiooocc2();
        }
        this.coo2iico = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ccci2() {
        RelativeLayout relativeLayout = new RelativeLayout(this.c2oc2o);
        this.cioiic = relativeLayout;
        relativeLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.c2cic2 = new ImageView(this.c2oc2o);
        if (this.c2ccci2iii == null) {
            this.c2ccci2iii = this.ciii2coi2.getThumbBitmap();
        }
        Bitmap bitmap = this.c2ccci2iii;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.c2cic2.setImageBitmap(this.c2ccci2iii);
        }
        this.cioiic.addView(this.c2cic2, layoutParams);
        addView(this.cioiic, layoutParams);
    }

    private void cccoo22o2() {
        MLog.m25892d(cccccioi, "initTextureView");
        if (this.c222o2o2c2o == null) {
            C32510coo2iico c32510coo2iico = new C32510coo2iico(this.c2oc2o);
            this.c222o2o2c2o = c32510coo2iico;
            c32510coo2iico.setSurfaceTextureListener(this);
        }
    }

    private void cciccio() {
        this.cc2o22co2c = new C32298ciii2coi2();
    }

    private boolean ccii2o2() {
        MLog.m25892d(cccccioi, "open MediaPlayer");
        if (this.ciii2coi2 == null) {
            MLog.m25892d(cccccioi, "mVideo is null, return.");
            return false;
        } else if (this.c2oicci2 == null) {
            MLog.m25892d(cccccioi, "mMediaPlayer is null, return.");
            this.ciii2coi2.showFailTrack("mMediaPlayer is null");
            return false;
        } else if (TextUtils.isEmpty(this.ciiioc2ioc)) {
            MLog.m25892d(cccccioi, "mUrl is empty, return.");
            this.ciii2coi2.showFailTrack("mUrl is empty");
            return false;
        } else if (this.ciio2c == null) {
            MLog.m25892d(cccccioi, "mSurfaceTexture is null, return.");
            this.ciii2coi2.showFailTrack("mSurfaceTexture is null");
            return false;
        } else {
            this.c22o22co22i.setKeepScreenOn(true);
            try {
                File file = new File(this.ciiioc2ioc);
                if (!file.exists()) {
                    MLog.m25889e(cccccioi, "video file don't exits, return. mUrl = " + this.ciiioc2ioc);
                    this.ciii2coi2.showFailTrack("video file don't exits");
                    return false;
                }
                this.c2oicci2.setOnPreparedListener(this.coi2ccc2);
                this.c2oicci2.setOnVideoSizeChangedListener(this.c2ic2icoi);
                this.c2oicci2.setOnCompletionListener(this.ccii2o2);
                this.c2oicci2.setOnErrorListener(this.cioii2c22c2);
                this.c2oicci2.setOnInfoListener(this.coc22);
                this.c2oicci2.setDataSource(this.c2oc2o.getApplicationContext(), Uri.fromFile(file));
                List<String> list = this.ccoc2oic.get("creativeView");
                if (list != null) {
                    C32284cicc2iiccc.coo2iico(list);
                    this.ccoc2oic.put("creativeView", null);
                }
                this.cc2o22co2c.coi222o222();
                if (this.cioc2 == null) {
                    this.cioc2 = new Surface(this.ciio2c);
                }
                this.c2oicci2.setSurface(this.cioc2);
                this.c2oicci2.prepareAsync();
                this.coo2iico = 1;
                MLog.m25892d(cccccioi, "openMediaPlayer  STATE_PREPARING");
                this.cici2o2oo.c2oc2i(this.coo2iico);
                return true;
            } catch (Exception e) {
                MLog.m25891d(cccccioi, "Open MediaPlayer Error", e);
                this.ciii2coi2.showFailTrack("Open MediaPlayer Error");
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ccoi2oo() {
        MediaPlayer mediaPlayer = this.c2oicci2;
        if (mediaPlayer != null) {
            mediaPlayer.start();
            AbstractC32320coo2iico abstractC32320coo2iico = this.cici2o2oo;
            if (abstractC32320coo2iico != null && (abstractC32320coo2iico instanceof View$OnClickListenerC32319coiic)) {
                ((View$OnClickListenerC32319coiic) abstractC32320coo2iico).cioccoiococ(4);
            }
            AbstractC32320coo2iico abstractC32320coo2iico2 = this.cici2o2oo;
            if (abstractC32320coo2iico2 != null && !abstractC32320coo2iico2.cco22()) {
                c22o22co22i();
            }
        }
    }

    private void ci22c2() {
        MLog.m25892d(cccccioi, "init");
        if (this.cii2c2 == null) {
            this.cii2c2 = new Handler(Looper.getMainLooper());
        }
        if (this.c22o22co22i == null) {
            this.c22o22co22i = new FrameLayout(this.c2oc2o);
        }
        coccoi2();
        C32508cioccoiococ.coi222o222().coo2iico(this);
    }

    private void cicoic() {
        if (this.coiio2 == null) {
            this.coiio2 = (AudioManager) getContext().getSystemService("audio");
        }
    }

    private void cioiic() {
        MLog.m25892d(cccccioi, "addTextureView");
        if (this.c222o2o2c2o.getParent() != null) {
            ((ViewGroup) this.c222o2o2c2o.getParent()).removeView(this.c222o2o2c2o);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        FrameLayout frameLayout = this.c22o22co22i;
        if (frameLayout != null) {
            frameLayout.addView(this.c222o2o2c2o, 0, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void coc22() {
        this.cii2c2.postDelayed(new RunnableC32297cii2c2(), 200L);
    }

    private void coccoi2() {
        MLog.m25892d(cccccioi, "initController");
        if (this.cc2o22co2c == null) {
            cciccio();
        }
        if (ccoio()) {
            return;
        }
        if (this.cici2o2oo == null) {
            if (C32284cicc2iiccc.coo2iico(getCurrentMode())) {
                VideoAd videoAd = this.ciii2coi2;
                if (videoAd != null && videoAd.getVideoStyleInfo() != null) {
                    C32282ccoc2oic.InterfaceC32283coo2iico interfaceC32283coo2iico = C32282ccoc2oic.c2oicci2.get(C32282ccoc2oic.coo2iico(this.ciii2coi2.getVideoStyleInfo().c22o22co22i()));
                    if (interfaceC32283coo2iico != null) {
                        this.cici2o2oo = interfaceC32283coo2iico.coo2iico(this.c2oc2o);
                    }
                }
                if (this.cici2o2oo == null) {
                    this.cici2o2oo = new C32280c2oc2o(this.c2oc2o);
                }
            } else {
                View$OnClickListenerC32319coiic view$OnClickListenerC32319coiic = new View$OnClickListenerC32319coiic(this.c2oc2o);
                this.cici2o2oo = view$OnClickListenerC32319coiic;
                view$OnClickListenerC32319coiic.post(new RunnableC32291c2oc2i());
            }
        }
        this.cii2c2.post(new RunnableC32299cioccoiococ());
    }

    private boolean coi2ccc2() {
        if (this.coccoi2.contains(Integer.valueOf(this.coo2iico))) {
            return false;
        }
        return true;
    }

    public void c2ccci2iii() {
        c2oc2o();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean c2ccocci() {
        if (this.c2oc2i == 11) {
            return true;
        }
        return false;
    }

    public void c2cic2() {
        this.cici2o2oo.cioccoiococ();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void cc2iiooocc2() {
        AudioManager audioManager = this.coiio2;
        if (audioManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = this.cicoic;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
                return;
            }
            return;
        }
        audioManager.abandonAudioFocus(this.cccoo22o2);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean cc2o22co2c() {
        if (this.coo2iico == 2) {
            return true;
        }
        return false;
    }

    public void cccccioi() {
        C32510coo2iico c32510coo2iico = this.c222o2o2c2o;
        if (c32510coo2iico != null && this.ciio2c != null) {
            c32510coo2iico.setVisibility(4);
        }
        RelativeLayout relativeLayout = this.cioiic;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        cccc2coi();
        ccii2o2();
        c2oicci2();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean ccoio() {
        if (this.coo2iico == 7) {
            return true;
        }
        return false;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void ciiio2o() {
        if (this.c2oc2i == 12) {
            return;
        }
        List<String> list = this.ccoc2oic.get("expand");
        if (list != null) {
            C32284cicc2iiccc.coo2iico(list);
            this.ccoc2oic.put("expand", null);
        }
        this.cc2o22co2c.ccoc2oic(String.valueOf(getCurrentPosition() / 1000));
        SoftReference<Activity> softReference = this.ci22c2;
        if (softReference != null && softReference.get() != null) {
            Activity activity = this.ci22c2.get();
            activity.setRequestedOrientation(1);
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            this.cici2o2oo.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            if (this.cici2o2oo.getParent() != null) {
                ((ViewGroup) this.cici2o2oo.getParent()).removeView(this.cici2o2oo);
            }
            viewGroup.addView(this.cici2o2oo, layoutParams);
            this.cici2o2oo.coo2iico(this.c22o22co22i, 12);
            this.ciii2coi2.registerAdView(this.cici2o2oo);
            this.c2oc2i = 12;
            this.cici2o2oo.coi222o222(12);
            MLog.m25892d(cccccioi, "NORMAL-->TINY");
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean ciiioc2ioc() {
        if (this.coo2iico == -1) {
            return true;
        }
        return false;
    }

    public void cioii2c22c2() {
        this.cii2c2.removeMessages(0);
        AbstractC32320coo2iico abstractC32320coo2iico = this.cici2o2oo;
        if (abstractC32320coo2iico != null) {
            abstractC32320coo2iico.cicic();
            if (this.cici2o2oo.getParent() != null) {
                ((ViewGroup) this.cici2o2oo.getParent()).removeView(this.cici2o2oo);
            }
            this.cici2o2oo.removeAllViews();
        }
        coo2iico();
        FrameLayout frameLayout = this.c22o22co22i;
        if (frameLayout != null) {
            if (frameLayout.getParent() != null) {
                ((ViewGroup) this.c22o22co22i.getParent()).removeView(this.c22o22co22i);
            }
            this.c22o22co22i.removeAllViews();
            this.c22o22co22i = null;
        }
        if (this.cco22 != null) {
            this.cco22 = null;
        }
        this.c2oc2o = null;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean coocii() {
        if (this.c2oc2i == 12) {
            if (this.c22o22co22i != null) {
                if (this.cici2o2oo.getParent() != null) {
                    ((ViewGroup) this.cici2o2oo.getParent()).removeView(this.cici2o2oo);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                this.cici2o2oo.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                addView(this.cici2o2oo, layoutParams);
                this.cici2o2oo.coo2iico(this.c22o22co22i, 10);
            }
            this.c2oc2i = 10;
            List<String> list = this.ccoc2oic.get(C32664c2oc2i.ciio2c);
            if (list != null) {
                C32284cicc2iiccc.coo2iico(list);
                this.ccoc2oic.put(C32664c2oc2i.ciio2c, null);
            }
            this.cc2o22co2c.c222o2o2c2o(String.valueOf(getCurrentPosition() / 1000));
            this.cici2o2oo.coi222o222(this.c2oc2i);
            MLog.m25892d(cccccioi, "TINY-->NORMAL");
            AbstractC32320coo2iico abstractC32320coo2iico = this.cici2o2oo;
            if (abstractC32320coo2iico instanceof View$OnClickListenerC32319coiic) {
                ((View$OnClickListenerC32319coiic) abstractC32320coo2iico).cc2o22co2c();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public int getAdType() {
        return this.cioccoiococ;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public FrameLayout getContainer() {
        return this.c22o22co22i;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public int getCurrentMode() {
        return this.c2oc2i;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.c2oicci2;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public int getCurrentState() {
        return this.coo2iico;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public int getDuration() {
        if (this.c2oicci2 != null && coi2ccc2()) {
            return this.c2oicci2.getDuration();
        }
        return 0;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public MediaPlayer getMediaPlayer() {
        return this.c2oicci2;
    }

    public AbstractC32320coo2iico getPlayerController() {
        return this.cici2o2oo;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public Map<String, List<String>> getTrackMap() {
        return this.ccoc2oic;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public String getUrl() {
        return this.ciiioc2ioc;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public VideoAd getVideoAd() {
        return this.ciii2coi2;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public InterfaceC32507c2oc2o getVideoTrackListener() {
        return this.cc2o22co2c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        MLog.m25892d(cccccioi, "onSurfaceTextureAvailable");
        SurfaceTexture surfaceTexture2 = this.ciio2c;
        if (surfaceTexture2 == null) {
            this.ciio2c = surfaceTexture;
            ccii2o2();
            return;
        }
        this.c222o2o2c2o.setSurfaceTexture(surfaceTexture2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.ciio2c == null) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            MLog.m25892d(cccccioi, "!visible");
            this.cc2iiooocc2 = false;
            return;
        }
        MLog.m25892d(cccccioi, "visible");
        this.cc2iiooocc2 = true;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void setAd(VideoAd videoAd) {
        this.ciii2coi2 = videoAd;
        if (videoAd != null && videoAd.getVideoAdInfo() != null) {
            this.coiic = this.ciii2coi2.getVideoAdInfo();
            try {
                this.cici2o2oo.c2oicci2();
                this.cicic = this.coiic.cc2iiooocc2();
                List<C32664c2oc2i> c2cic2 = this.coiic.c2cic2();
                this.cicc2iiccc = c2cic2;
                coo2iico(c2cic2);
                this.ciiioc2ioc = this.coiic.coccoi2();
                MLog.m25892d(cccccioi, "video url = " + this.ciiioc2ioc);
            } catch (Exception e) {
                MLog.m25888e(cccccioi, "set ad had Exception: ", e);
            }
        }
    }

    public void setAdContainer(ViewGroup viewGroup) {
        this.cco22 = viewGroup;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void setAdType(int i) {
        this.cioccoiococ = i;
    }

    public void setAutoPlay(boolean z) {
        MLog.m25892d(cccccioi, "setAutoPlay");
        this.ciiio2o = z;
        if (z) {
            C32313coi222o222 c32313coi222o222 = new C32313coi222o222(this.c2oc2o);
            this.coocii = c32313coi222o222;
            c32313coi222o222.coo2iico(this, 50);
            this.coocii.coo2iico(new C32292c2oc2o());
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void setCurrentMode(int i) {
        this.c2oc2i = i;
    }

    public void setIsMute(boolean z) {
        this.ccoio = z;
    }

    public void setLearnMoreText(String str) {
        this.c2ccocci = str;
    }

    public void setTrackListener(InterfaceC32507c2oc2o interfaceC32507c2oc2o) {
        this.cc2o22co2c = interfaceC32507c2oc2o;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean c222o2o2c2o() {
        return this.coo2iico == 5;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void c22o22co22i() {
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        if (this.coiio2 == null) {
            this.coiio2 = (AudioManager) getContext().getSystemService("audio");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (this.cicoic == null) {
                onAudioFocusChangeListener = new AudioFocusRequest.Builder(2).setOnAudioFocusChangeListener(this.cccoo22o2);
                build = onAudioFocusChangeListener.build();
                this.cicoic = build;
            }
            this.coiio2.requestAudioFocus(this.cicoic);
            return;
        }
        this.coiio2.requestAudioFocus(this.cccoo22o2, 3, 2);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean c2oc2i() {
        if (this.c2oc2i == 11) {
            List<String> list = this.ccoc2oic.get(C32664c2oc2i.c222o2o2c2o);
            if (list != null) {
                C32284cicc2iiccc.coo2iico(list);
                this.ccoc2oic.put(C32664c2oc2i.c222o2o2c2o, null);
            }
            this.cc2o22co2c.cicic(String.valueOf(getCurrentPosition() / 1000));
            SoftReference<Activity> softReference = this.ci22c2;
            if (softReference != null && softReference.get() != null) {
                this.ci22c2.get().setRequestedOrientation(1);
            }
            if (this.c22o22co22i != null) {
                if (this.cici2o2oo.getParent() != null) {
                    ((ViewGroup) this.cici2o2oo.getParent()).removeView(this.cici2o2oo);
                }
                addView(this.cici2o2oo, new FrameLayout.LayoutParams(-1, -1));
                this.cici2o2oo.coo2iico(this.c22o22co22i, 10);
            }
            this.c2oc2i = 10;
            this.cici2o2oo.coi222o222(10);
            MLog.m25892d(cccccioi, "FULL-->NORMAL");
            return true;
        }
        return false;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void c2oc2o() {
        MLog.m25892d(cccccioi, "release");
        if (c2ccocci()) {
            c2oc2i();
        }
        if (cicc2iiccc()) {
            coocii();
        }
        this.c2oc2i = 10;
        cioii2c22c2();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void c2oicci2() {
        MLog.m25892d(cccccioi, "start");
        if (this.coo2iico == 0) {
            cicoic();
            c2cciooo();
            cccoo22o2();
            cioiic();
            if (C32284cicc2iiccc.coo2iico(this.c2oc2i)) {
                return;
            }
            this.cici2o2oo.coo2iico(this.c22o22co22i, this.c2oc2i);
            return;
        }
        MLog.m25892d(cccccioi, "ONLY UNDER IDLE CAN start() BE CALLED");
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean cco22() {
        return this.coo2iico == 3;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean ccoc2oic() {
        return this.coo2iico == 0;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean cicc2iiccc() {
        return this.c2oc2i == 12;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean cici2o2oo() {
        return this.coo2iico == 6;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean cicic() {
        return this.coo2iico == 1;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void cii2c2() {
        MLog.m25892d(cccccioi, "pause");
        this.ciii2coi2.setTrackTime();
        C32284cicc2iiccc.coo2iico(this.ccoc2oic.get("pause"));
        this.cc2o22co2c.cioccoiococ(String.valueOf(getCurrentPosition() / 1000));
        int i = this.coo2iico;
        if (i == 3 || i == 8) {
            c2ic2icoi();
            this.coo2iico = 4;
            this.cici2o2oo.c2oc2i(4);
            MLog.m25892d(cccccioi, "STATE_PAUSED");
        }
        if (this.coo2iico == 5) {
            c2ic2icoi();
            this.coo2iico = 6;
            this.cici2o2oo.c2oc2i(6);
            MLog.m25892d(cccccioi, "STATE_BUFFERING_PAUSED");
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void ciii2coi2() {
        MLog.m25892d(cccccioi, C32664c2oc2i.c2oc2o);
        MediaPlayer mediaPlayer = this.c2oicci2;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(0);
            C32284cicc2iiccc.coo2iico(this.ccoc2oic.get(C32664c2oc2i.c2oc2o));
            this.cc2o22co2c.ciii2coi2(String.valueOf(getCurrentPosition() / 1000));
            c2ic2icoi();
            this.coo2iico = 8;
            this.cici2o2oo.c2oc2i(8);
            MLog.m25892d(cccccioi, "STATE_STOP");
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean ciio2c() {
        int i = this.coo2iico;
        return i == 4 || i == 8;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean cioc2() {
        return this.c2oc2i == 10;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void cioccoiococ() {
        MLog.m25892d(cccccioi, "restart");
        int i = this.coo2iico;
        if (i == -1) {
            MLog.m25892d(cccccioi, this.coo2iico + "Error");
            C32284cicc2iiccc.coo2iico(this.ccoc2oic.get("rewind"));
            this.cc2o22co2c.coiio2(String.valueOf(getCurrentPosition() / 1000));
            coo2iico(this.cicc2iiccc);
            this.c2oicci2.reset();
            ccii2o2();
        } else if (i == 4) {
            C32284cicc2iiccc.coo2iico(this.ccoc2oic.get("resume"));
            this.cc2o22co2c.c2oc2o(String.valueOf(getCurrentPosition() / 1000));
            ccoi2oo();
            this.coo2iico = 3;
            this.cici2o2oo.c2oc2i(3);
            MLog.m25892d(cccccioi, "PAUSED->PLAYING");
        } else if (i == 6) {
            ccoi2oo();
            this.coo2iico = 5;
            this.cici2o2oo.c2oc2i(5);
            MLog.m25892d(cccccioi, "BUFFERING_PAUSED->BUFFERING_PLAYING");
        } else if (i != 7) {
            if (i != 8) {
                return;
            }
            this.cc2o22co2c.c2oc2o(String.valueOf(getCurrentPosition() / 1000));
            ccoi2oo();
            this.coo2iico = 3;
            this.cici2o2oo.c2oc2i(3);
            MLog.m25892d(cccccioi, "STOP->PLAYING");
        } else {
            MLog.m25892d(cccccioi, "COMPLETED->PLAYING");
            this.ciii2coi2.completeCount++;
            C32284cicc2iiccc.coo2iico(this.ccoc2oic.get("rewind"));
            this.cc2o22co2c.coiio2(String.valueOf(getCurrentPosition() / 1000));
            coo2iico(this.cicc2iiccc);
            this.c2oicci2.reset();
            ccii2o2();
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void coiic() {
        if (this.c2oc2i == 11) {
            ciiio2o();
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void coiio2() {
        if (this.c2oc2i == 11) {
            return;
        }
        if (this.cici2o2oo == null) {
            MLog.m25889e(cccccioi, "mPlayerController is null in enterFullScreen, return");
            return;
        }
        try {
            List<String> list = this.ccoc2oic.get("fullscreen");
            if (list != null) {
                C32284cicc2iiccc.coo2iico(list);
                this.ccoc2oic.put("fullscreen", null);
            }
            this.cc2o22co2c.coiic(String.valueOf(getCurrentPosition() / 1000));
            SoftReference<Activity> softReference = this.ci22c2;
            if (softReference != null && softReference.get() != null) {
                Activity activity = this.ci22c2.get();
                if (activity.getWindowManager().getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                if (this.cici2o2oo.getParent() != null) {
                    ((ViewGroup) this.cici2o2oo.getParent()).removeView(this.cici2o2oo);
                }
                viewGroup.addView(this.cici2o2oo);
                this.cici2o2oo.coo2iico(this.c22o22co22i, 11);
                this.ciii2coi2.registerAdView(this.cici2o2oo);
                this.c2oc2i = 11;
                this.cici2o2oo.coi222o222(11);
                MLog.m25892d(cccccioi, "NORMAL-->FULL_SCREEN");
            }
        } catch (Exception e) {
            MLog.m25888e(cccccioi, "enterFullScreen had Exception: ", e);
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public boolean coi222o222() {
        return this.coi222o222;
    }

    public boolean coi222o222(boolean z) {
        this.cciccio = z;
        return true;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void coo2iico(@NonNull Bitmap bitmap, int i) {
        AbstractC32320coo2iico abstractC32320coo2iico = this.cici2o2oo;
        if (abstractC32320coo2iico == null || !(abstractC32320coo2iico instanceof View$OnClickListenerC32319coiic)) {
            return;
        }
        ((View$OnClickListenerC32319coiic) abstractC32320coo2iico).coo2iico(bitmap, i);
    }

    private void coo2iico(List<C32664c2oc2i> list) {
        this.ccoc2oic = new HashMap();
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C32664c2oc2i c32664c2oc2i : list) {
            List<String> list2 = this.ccoc2oic.get(c32664c2oc2i.coo2iico);
            if (list2 == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c32664c2oc2i.coi222o222);
                this.ccoc2oic.put(c32664c2oc2i.coo2iico, arrayList);
            } else {
                list2.add(c32664c2oc2i.coi222o222);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void coo2iico(@NonNull Context context) {
        if (context instanceof Activity) {
            this.ci22c2 = new SoftReference<>((Activity) context);
        }
        this.c2oc2o = C32284cicc2iiccc.coo2iico(context);
        this.cici2o2oo.setContext(context);
    }

    public void coo2iico(boolean z) {
        this.cici2o2oo.coo2iico(z);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222
    public void coo2iico() {
        MLog.m25892d(cccccioi, "reset Player");
        C32313coi222o222 c32313coi222o222 = this.coocii;
        if (c32313coi222o222 != null) {
            c32313coi222o222.coi222o222();
        }
        if (this.coiio2 != null) {
            cc2iiooocc2();
            this.coiio2 = null;
        }
        MediaPlayer mediaPlayer = this.c2oicci2;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.c2oicci2 = null;
        }
        this.cii2c2.post(new RunnableC32300coi222o222());
        Surface surface = this.cioc2;
        if (surface != null) {
            surface.release();
            this.cioc2 = null;
        }
        if (this.ciio2c != null) {
            MLog.m25892d(cccccioi, "release mSurfaceTexture");
            this.ciio2c.release();
            this.ciio2c = null;
        }
        this.coo2iico = 0;
    }

    public TextureView$SurfaceTextureListenerC32290cicic(Context context, int i) {
        super(context, null);
        this.coo2iico = 0;
        this.coi222o222 = false;
        this.c2oc2i = 10;
        this.cioccoiococ = 1;
        this.ccoc2oic = new HashMap();
        this.ciiio2o = true;
        this.ccoio = true;
        this.cc2iiooocc2 = true;
        this.ccci2 = false;
        this.coccoi2 = Arrays.asList(1, 4);
        this.cciccio = false;
        this.c2cciooo = false;
        this.cccoo22o2 = new C32293cco22();
        this.coi2ccc2 = new C32301coiic();
        this.ccii2o2 = new C32294ccoc2oic(this);
        this.c2ic2icoi = new C32296cicic();
        this.cioii2c22c2 = new C32295cicc2iiccc();
        this.coc22 = new C32302coo2iico();
        this.c2oc2o = C32284cicc2iiccc.coo2iico(context);
        setCurrentMode(i);
        ci22c2();
        MLog.m25892d(cccccioi, "init player, no attrs");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureView$SurfaceTextureListenerC32290cicic(Context context, int i, VideoAd videoAd) {
        super(context, null);
        this.coo2iico = 0;
        this.coi222o222 = false;
        this.c2oc2i = 10;
        this.cioccoiococ = 1;
        this.ccoc2oic = new HashMap();
        this.ciiio2o = true;
        this.ccoio = true;
        this.cc2iiooocc2 = true;
        this.ccci2 = false;
        this.coccoi2 = Arrays.asList(1, 4);
        this.cciccio = false;
        this.c2cciooo = false;
        this.cccoo22o2 = new C32293cco22();
        this.coi2ccc2 = new C32301coiic();
        this.ccii2o2 = new C32294ccoc2oic(this);
        this.c2ic2icoi = new C32296cicic();
        this.cioii2c22c2 = new C32295cicc2iiccc();
        this.coc22 = new C32302coo2iico();
        this.c2oc2o = C32284cicc2iiccc.coo2iico(context);
        setCurrentMode(i);
        this.ciii2coi2 = videoAd;
        ci22c2();
        setAd(videoAd);
        MLog.m25892d(cccccioi, "init player, no attrs");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public TextureView$SurfaceTextureListenerC32290cicic(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.coo2iico = 0;
        this.coi222o222 = false;
        this.c2oc2i = 10;
        this.cioccoiococ = 1;
        this.ccoc2oic = new HashMap();
        this.ciiio2o = true;
        this.ccoio = true;
        this.cc2iiooocc2 = true;
        this.ccci2 = false;
        this.coccoi2 = Arrays.asList(1, 4);
        this.cciccio = false;
        this.c2cciooo = false;
        this.cccoo22o2 = new C32293cco22();
        this.coi2ccc2 = new C32301coiic();
        this.ccii2o2 = new C32294ccoc2oic(this);
        this.c2ic2icoi = new C32296cicic();
        this.cioii2c22c2 = new C32295cicc2iiccc();
        this.coc22 = new C32302coo2iico();
        this.c2oc2o = C32284cicc2iiccc.coo2iico(context);
        ci22c2();
        MLog.m25892d(cccccioi, "init player");
    }
}
