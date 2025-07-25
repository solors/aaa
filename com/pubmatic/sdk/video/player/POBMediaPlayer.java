package com.pubmatic.sdk.video.player;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.player.POBPlayer;
import java.io.IOException;

/* loaded from: classes7.dex */
public class POBMediaPlayer implements POBPlayer, MediaPlayer.OnPreparedListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener, MediaPlayer.OnVideoSizeChangedListener {
    @Nullable

    /* renamed from: a */
    private POBPlayer.POBPlayerListener f70839a;
    @Nullable

    /* renamed from: b */
    private MediaPlayer f70840b;
    @Nullable

    /* renamed from: c */
    private Handler f70841c;
    @NonNull

    /* renamed from: d */
    private final HandlerThread f70842d;
    @NonNull

    /* renamed from: e */
    private final Handler f70843e;
    @Nullable

    /* renamed from: f */
    private POBTimeoutHandler f70844f;

    /* renamed from: g */
    private int f70845g;
    @Nullable

    /* renamed from: h */
    private POBTimeoutHandler f70846h;

    /* renamed from: i */
    private int f70847i;
    @Nullable

    /* renamed from: j */
    private POBTimeoutHandler f70848j;

    /* renamed from: k */
    private int f70849k;

    /* renamed from: l */
    private int f70850l;

    /* renamed from: m */
    private int f70851m;

    /* renamed from: n */
    private int f70852n;

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$a */
    /* loaded from: classes7.dex */
    class RunnableC26821a implements Runnable {
        RunnableC26821a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f70840b != null) {
                POBMediaPlayer.this.f70840b.pause();
            }
            POBMediaPlayer.this.f70843e.post(new RunnableC26864b(this));
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$b */
    /* loaded from: classes7.dex */
    class RunnableC26822b implements Runnable {
        RunnableC26822b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f70840b != null) {
                POBMediaPlayer.this.f70840b.stop();
                POBMediaPlayer.this.f70843e.post(new RunnableC26865c(this));
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$c */
    /* loaded from: classes7.dex */
    class RunnableC26823c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f70855a;

        /* renamed from: b */
        final /* synthetic */ int f70856b;

        RunnableC26823c(int i, int i2) {
            this.f70855a = i;
            this.f70856b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f70840b != null) {
                POBMediaPlayer.this.f70840b.setVolume(this.f70855a, this.f70856b);
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$d */
    /* loaded from: classes7.dex */
    class RunnableC26824d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Surface f70858a;

        RunnableC26824d(Surface surface) {
            this.f70858a = surface;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f70840b != null && this.f70858a.isValid()) {
                try {
                    POBMediaPlayer.this.f70840b.setSurface(this.f70858a);
                } catch (IllegalArgumentException e) {
                    POBLog.error("POBMediaPlayer", "Unable to set surface to media player. Reason - " + e.getMessage(), new Object[0]);
                }
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$e */
    /* loaded from: classes7.dex */
    class RunnableC26825e implements Runnable {
        RunnableC26825e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f70840b != null) {
                POBMediaPlayer.this.f70840b.setSurface(null);
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$f */
    /* loaded from: classes7.dex */
    class RunnableC26826f implements Runnable {
        RunnableC26826f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.m40102g();
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$g */
    /* loaded from: classes7.dex */
    class RunnableC26827g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f70862a;

        RunnableC26827g(int i) {
            this.f70862a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f70839a != null) {
                POBMediaPlayer.this.f70839a.onBufferUpdate(this.f70862a);
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$h */
    /* loaded from: classes7.dex */
    class RunnableC26828h implements Runnable {
        RunnableC26828h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.m40100h();
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$i */
    /* loaded from: classes7.dex */
    class RunnableC26829i implements Runnable {
        RunnableC26829i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f70839a != null) {
                POBMediaPlayer.this.f70839a.onCompletion();
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$j */
    /* loaded from: classes7.dex */
    class RunnableC26830j implements Runnable {
        RunnableC26830j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f70839a != null) {
                POBMediaPlayer.this.f70839a.onStart();
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$k */
    /* loaded from: classes7.dex */
    class HandlerThreadC26831k extends HandlerThread {

        /* renamed from: a */
        final /* synthetic */ String f70867a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        HandlerThreadC26831k(String str, String str2) {
            super(str);
            this.f70867a = str2;
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            POBMediaPlayer.this.f70841c = new Handler(getLooper());
            POBMediaPlayer.this.m40113a(this.f70867a);
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$l */
    /* loaded from: classes7.dex */
    class RunnableC26832l implements Runnable {
        RunnableC26832l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.m40110c();
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$m */
    /* loaded from: classes7.dex */
    class RunnableC26833m implements Runnable {
        RunnableC26833m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.m40104f();
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$n */
    /* loaded from: classes7.dex */
    class RunnableC26834n implements Runnable {
        RunnableC26834n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.m40102g();
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$o */
    /* loaded from: classes7.dex */
    class RunnableC26835o implements Runnable {
        RunnableC26835o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f70839a != null) {
                POBMediaPlayer.this.f70839a.onPrepared();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$p */
    /* loaded from: classes7.dex */
    public class C26836p implements POBTimeoutHandler.POBTimeoutHandlerListener {
        C26836p() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            if (POBMediaPlayer.this.f70839a != null) {
                POBMediaPlayer.this.f70839a.onFailure(-1, "MEDIA_FILE_TIMEOUT_ERROR");
            }
            POBMediaPlayer.this.m40112b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$q */
    /* loaded from: classes7.dex */
    public class C26837q implements POBTimeoutHandler.POBTimeoutHandlerListener {
        C26837q() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBMediaPlayer.this.f70843e.post(new RunnableC26866d(this));
            POBMediaPlayer.this.m40114a(new RunnableC26867e(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$r */
    /* loaded from: classes7.dex */
    public class C26838r implements POBTimeoutHandler.POBTimeoutHandlerListener {
        C26838r() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBMediaPlayer.this.m40114a(new RunnableC26869g(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$s */
    /* loaded from: classes7.dex */
    public class RunnableC26839s implements Runnable {
        RunnableC26839s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.m40102g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$t */
    /* loaded from: classes7.dex */
    public class RunnableC26840t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f70877a;

        /* renamed from: b */
        final /* synthetic */ String f70878b;

        RunnableC26840t(int i, String str) {
            this.f70877a = i;
            this.f70878b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f70839a != null) {
                POBMediaPlayer.this.f70839a.onFailure(this.f70877a, this.f70878b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$u */
    /* loaded from: classes7.dex */
    public class RunnableC26841u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f70880a;

        RunnableC26841u(String str) {
            this.f70880a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String message;
            int i;
            POBMediaPlayer.this.m40124a();
            try {
                if (POBMediaPlayer.this.f70840b != null) {
                    POBMediaPlayer.this.f70840b.setDataSource(this.f70880a);
                    POBUtils.runOnMainThread(new RunnableC26870h(this));
                    POBMediaPlayer.this.f70840b.prepare();
                }
            } catch (IOException e) {
                message = e.getMessage();
                if (message != null) {
                    i = -1004;
                    POBMediaPlayer.this.m40122a(i, message);
                }
            } catch (Exception e2) {
                message = e2.getMessage();
                if (message != null) {
                    i = 1;
                    POBMediaPlayer.this.m40122a(i, message);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$v */
    /* loaded from: classes7.dex */
    public class RunnableC26842v implements Runnable {
        RunnableC26842v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f70840b != null) {
                POBMediaPlayer.this.f70840b.setSurface(null);
                POBMediaPlayer.this.f70840b.stop();
                POBMediaPlayer.this.f70840b.release();
                POBMediaPlayer.this.f70840b = null;
            }
            POBMediaPlayer.this.f70842d.quitSafely();
        }
    }

    /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$w */
    /* loaded from: classes7.dex */
    class RunnableC26843w implements Runnable {
        RunnableC26843w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f70840b != null) {
                POBMediaPlayer.this.f70840b.start();
            }
            POBMediaPlayer.this.f70843e.post(new RunnableC26871i(this));
        }
    }

    public POBMediaPlayer(@NonNull String str, @NonNull Handler handler) {
        this.f70843e = handler;
        HandlerThreadC26831k handlerThreadC26831k = new HandlerThreadC26831k("POBMediaPlayer", str);
        this.f70842d = handlerThreadC26831k;
        handlerThreadC26831k.start();
    }

    /* renamed from: a */
    private String m40123a(int i) {
        return i != -1010 ? i != -1007 ? i != -1004 ? i != -110 ? "MEDIA_ERROR_UNKNOWN" : "MEDIA_ERROR_TIMED_OUT" : "MEDIA_ERROR_IO" : "MEDIA_ERROR_MALFORMED" : "MEDIA_ERROR_UNSUPPORTED";
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void destroy() {
        m40112b();
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public int getDuration() {
        return this.f70852n;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public int getVideoHeight() {
        return this.f70851m;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public int getVideoWidth() {
        return this.f70850l;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        POBUtils.runOnMainThread(new RunnableC26826f());
        this.f70843e.post(new RunnableC26827g(i));
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        POBUtils.runOnMainThread(new RunnableC26828h());
        this.f70843e.post(new RunnableC26829i());
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return m40122a(i2, m40123a(i2));
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        POBLog.info("POBMediaPlayer", "onInfo what: " + i + ", extra:" + i2, new Object[0]);
        if (i == 3) {
            this.f70843e.post(new RunnableC26830j());
            return true;
        }
        if (i == 701) {
            POBUtils.runOnMainThread(new RunnableC26832l());
        } else if (i == 702) {
            POBUtils.runOnMainThread(new RunnableC26833m());
        } else if (i2 == -1004) {
            return m40122a(i2, m40123a(i2));
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        POBUtils.runOnMainThread(new RunnableC26834n());
        if (mediaPlayer != null) {
            this.f70852n = mediaPlayer.getDuration();
        }
        this.f70843e.post(new RunnableC26835o());
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void onSurfaceCreated(@NonNull Surface surface) {
        m40106e();
        m40114a(new RunnableC26824d(surface));
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void onSurfaceDestroyed(@NonNull Surface surface) {
        m40100h();
        m40114a(new RunnableC26825e());
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.f70850l = i;
        this.f70851m = i2;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void pause() {
        m40100h();
        m40114a(new RunnableC26821a());
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void setPlayerListener(@NonNull POBPlayer.POBPlayerListener pOBPlayerListener) {
        this.f70839a = pOBPlayerListener;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void setPrepareTimeout(int i) {
        this.f70847i = i;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void setStallTimeout(int i) {
        this.f70849k = i;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void setVolume(int i, int i2) {
        m40114a(new RunnableC26823c(i, i2));
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void start() {
        m40106e();
        m40114a(new RunnableC26843w());
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void stop() {
        m40100h();
        m40114a(new RunnableC26822b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m40112b() {
        this.f70839a = null;
        m40100h();
        m40102g();
        m40104f();
        m40114a(new RunnableC26842v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* renamed from: c */
    public void m40110c() {
        if (this.f70848j == null) {
            POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new C26837q());
            this.f70848j = pOBTimeoutHandler;
            pOBTimeoutHandler.start(this.f70849k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* renamed from: d */
    public void m40108d() {
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new C26836p());
        this.f70846h = pOBTimeoutHandler;
        pOBTimeoutHandler.start(this.f70847i);
    }

    @MainThread
    /* renamed from: e */
    private void m40106e() {
        if (this.f70844f == null) {
            POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new C26838r());
            this.f70844f = pOBTimeoutHandler;
            pOBTimeoutHandler.startAtFixedRate(0L, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* renamed from: f */
    public void m40104f() {
        POBTimeoutHandler pOBTimeoutHandler = this.f70848j;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f70848j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* renamed from: g */
    public void m40102g() {
        POBTimeoutHandler pOBTimeoutHandler = this.f70846h;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f70846h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* renamed from: h */
    public void m40100h() {
        POBTimeoutHandler pOBTimeoutHandler = this.f70844f;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f70844f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: a */
    public void m40124a() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f70840b = mediaPlayer;
        mediaPlayer.setOnPreparedListener(this);
        this.f70840b.setOnCompletionListener(this);
        this.f70840b.setOnBufferingUpdateListener(this);
        this.f70840b.setAudioStreamType(3);
        this.f70840b.setOnErrorListener(this);
        this.f70840b.setOnInfoListener(this);
        this.f70840b.setOnVideoSizeChangedListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40114a(@NonNull Runnable runnable) {
        if (this.f70842d.isAlive()) {
            Handler handler = this.f70841c;
            if (handler != null) {
                handler.post(runnable);
                return;
            } else {
                POBLog.error("POBMediaPlayer", "mediaPlayerHandler is null", new Object[0]);
                return;
            }
        }
        POBLog.error("POBMediaPlayer", "Handler thread is dead already", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m40122a(int i, @NonNull String str) {
        POBUtils.runOnMainThread(new RunnableC26839s());
        POBLog.error("POBMediaPlayer", "errorCode: " + i + ", errorMsg:" + str, new Object[0]);
        this.f70843e.post(new RunnableC26840t(i, str));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40113a(@NonNull String str) {
        m40114a(new RunnableC26841u(str));
    }
}
