package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.MediaController;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.unity3d.player.M */
/* loaded from: classes7.dex */
public class SurfaceHolder$CallbackC28712M extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl {

    /* renamed from: z */
    public static final /* synthetic */ int f74550z = 0;

    /* renamed from: a */
    private final Context f74551a;

    /* renamed from: b */
    private final SurfaceView f74552b;

    /* renamed from: c */
    private final SurfaceHolder f74553c;

    /* renamed from: d */
    private final String f74554d;

    /* renamed from: e */
    private final int f74555e;

    /* renamed from: f */
    private final int f74556f;

    /* renamed from: g */
    private final boolean f74557g;

    /* renamed from: h */
    private final long f74558h;

    /* renamed from: i */
    private final long f74559i;

    /* renamed from: j */
    private final FrameLayout f74560j;

    /* renamed from: k */
    private int f74561k;

    /* renamed from: l */
    private int f74562l;

    /* renamed from: m */
    private int f74563m;

    /* renamed from: n */
    private int f74564n;

    /* renamed from: o */
    private MediaPlayer f74565o;

    /* renamed from: p */
    private MediaController f74566p;

    /* renamed from: q */
    private boolean f74567q;

    /* renamed from: r */
    private boolean f74568r;

    /* renamed from: s */
    private int f74569s;

    /* renamed from: t */
    private boolean f74570t;

    /* renamed from: u */
    private int f74571u;

    /* renamed from: v */
    private boolean f74572v;

    /* renamed from: w */
    private InterfaceC28710K f74573w;

    /* renamed from: x */
    private RunnableC28711L f74574x;

    /* renamed from: y */
    private volatile int f74575y;

    /* JADX INFO: Access modifiers changed from: protected */
    public SurfaceHolder$CallbackC28712M(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, InterfaceC28710K interfaceC28710K) {
        super(context);
        this.f74567q = false;
        this.f74568r = false;
        this.f74569s = 0;
        this.f74570t = false;
        this.f74571u = 0;
        this.f74572v = false;
        this.f74575y = 0;
        this.f74573w = interfaceC28710K;
        this.f74551a = context;
        this.f74560j = this;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f74552b = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.f74553c = holder;
        holder.addCallback(this);
        setBackgroundColor(i);
        addView(surfaceView);
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.f74554d = str;
        this.f74555e = i2;
        this.f74556f = i3;
        this.f74557g = z;
        this.f74558h = j;
        this.f74559i = j2;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* renamed from: a */
    private void m37721a(int i) {
        this.f74575y = i;
        InterfaceC28710K interfaceC28710K = this.f74573w;
        if (interfaceC28710K != null) {
            ((C28715O) interfaceC28710K).m37717a(this.f74575y);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return true;
    }

    public void cancelOnPrepare() {
        m37721a(2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void destroyPlayer() {
        if (!this.f74570t) {
            pause();
        }
        doCleanUp();
    }

    protected void doCleanUp() {
        RunnableC28711L runnableC28711L = this.f74574x;
        if (runnableC28711L != null) {
            runnableC28711L.f74549b = true;
            this.f74574x = null;
        }
        MediaPlayer mediaPlayer = this.f74565o;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f74565o.release();
            this.f74565o = null;
        }
        this.f74563m = 0;
        this.f74564n = 0;
        this.f74568r = false;
        this.f74567q = false;
    }

    public boolean exitOnKeypress(int i, KeyEvent keyEvent) {
        if (i != 4 && (this.f74555e != 2 || i == 0 || keyEvent.isSystem())) {
            return false;
        }
        destroyPlayer();
        m37721a(3);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        MediaPlayer mediaPlayer = this.f74565o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f74557g) {
            return this.f74569s;
        }
        return 100;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f74565o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        MediaPlayer mediaPlayer = this.f74565o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        boolean z;
        if (this.f74568r && this.f74567q) {
            z = true;
        } else {
            z = false;
        }
        MediaPlayer mediaPlayer = this.f74565o;
        if (mediaPlayer == null) {
            return !z;
        }
        if (!mediaPlayer.isPlaying() && z) {
            return false;
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f74569s = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        destroyPlayer();
        m37721a(3);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (exitOnKeypress(i, keyEvent)) {
            return true;
        }
        MediaController mediaController = this.f74566p;
        if (mediaController != null) {
            return mediaController.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (exitOnKeypress(i, keyEvent)) {
            return true;
        }
        MediaController mediaController = this.f74566p;
        if (mediaController != null) {
            return mediaController.onKeyUp(i, keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        RunnableC28711L runnableC28711L = this.f74574x;
        if (runnableC28711L != null) {
            runnableC28711L.f74549b = true;
            this.f74574x = null;
        }
        int i = this.f74555e;
        if (i == 0 || i == 1) {
            MediaController mediaController = new MediaController(this.f74551a);
            this.f74566p = mediaController;
            mediaController.setMediaPlayer(this);
            this.f74566p.setAnchorView(this);
            this.f74566p.setEnabled(true);
            Context context = this.f74551a;
            if (context instanceof Activity) {
                this.f74566p.setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.f74566p.show();
        }
        this.f74568r = true;
        if (this.f74567q && !isPlaying()) {
            m37721a(1);
            updateVideoLayout();
            if (!this.f74570t) {
                start();
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f74555e == 2 && action == 0) {
            destroyPlayer();
            m37721a(3);
            return true;
        }
        MediaController mediaController = this.f74566p;
        if (mediaController != null) {
            return mediaController.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 0 && i2 != 0) {
            this.f74567q = true;
            this.f74563m = i;
            this.f74564n = i2;
            if (this.f74568r && !isPlaying()) {
                m37721a(1);
                updateVideoLayout();
                if (!this.f74570t) {
                    start();
                }
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        MediaPlayer mediaPlayer = this.f74565o;
        if (mediaPlayer == null) {
            return;
        }
        if (this.f74572v) {
            this.f74571u = mediaPlayer.getCurrentPosition();
            this.f74565o.pause();
        }
        this.f74570t = true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        MediaPlayer mediaPlayer = this.f74565o;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        MediaPlayer mediaPlayer = this.f74565o;
        if (mediaPlayer == null) {
            return;
        }
        if (this.f74572v) {
            int i = this.f74571u;
            if (i > 0) {
                mediaPlayer.seekTo(i);
            }
            this.f74565o.start();
            this.f74571u = 0;
        }
        this.f74570t = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.f74561k != i2 || this.f74562l != i3) {
            this.f74561k = i2;
            this.f74562l = i3;
            if (this.f74572v) {
                updateVideoLayout();
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        FileInputStream fileInputStream;
        this.f74572v = true;
        if (this.f74570t) {
            MediaPlayer mediaPlayer = this.f74565o;
            if (mediaPlayer != null && this.f74571u > 0) {
                mediaPlayer.setDisplay(this.f74553c);
                this.f74565o.seekTo(this.f74571u);
                return;
            }
            return;
        }
        MediaPlayer mediaPlayer2 = this.f74565o;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setDisplay(this.f74553c);
            if (!this.f74570t) {
                int i = this.f74571u;
                if (i > 0) {
                    this.f74565o.seekTo(i);
                }
                this.f74565o.start();
                this.f74571u = 0;
                return;
            }
            return;
        }
        m37721a(0);
        doCleanUp();
        try {
            MediaPlayer mediaPlayer3 = new MediaPlayer();
            this.f74565o = mediaPlayer3;
            if (this.f74557g) {
                mediaPlayer3.setDataSource(this.f74551a, Uri.parse(this.f74554d));
            } else {
                if (this.f74559i != 0) {
                    fileInputStream = new FileInputStream(this.f74554d);
                    this.f74565o.setDataSource(fileInputStream.getFD(), this.f74558h, this.f74559i);
                } else {
                    try {
                        AssetFileDescriptor openFd = getResources().getAssets().openFd(this.f74554d);
                        this.f74565o.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                        openFd.close();
                    } catch (IOException unused) {
                        fileInputStream = new FileInputStream(this.f74554d);
                        this.f74565o.setDataSource(fileInputStream.getFD());
                    }
                }
                fileInputStream.close();
            }
            this.f74565o.setDisplay(this.f74553c);
            this.f74565o.setScreenOnWhilePlaying(true);
            this.f74565o.setOnBufferingUpdateListener(this);
            this.f74565o.setOnCompletionListener(this);
            this.f74565o.setOnPreparedListener(this);
            this.f74565o.setOnVideoSizeChangedListener(this);
            this.f74565o.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
            this.f74565o.prepareAsync();
            this.f74574x = new RunnableC28711L(this, this);
            new Thread(this.f74574x).start();
        } catch (Exception unused2) {
            m37721a(2);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f74572v = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r7 <= r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r7 >= r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        r4 = (int) (r5 / r3);
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        r2 = (int) (r6 * r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r8 == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateVideoLayout() {
        /*
            r10 = this;
            android.media.MediaPlayer r0 = r10.f74565o
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r10.f74561k
            if (r0 == 0) goto Ld
            int r0 = r10.f74562l
            if (r0 != 0) goto L2b
        Ld:
            android.content.Context r0 = r10.f74551a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r0 = r1.widthPixels
            r10.f74561k = r0
            int r0 = r1.heightPixels
            r10.f74562l = r0
        L2b:
            int r0 = r10.f74561k
            int r1 = r10.f74562l
            boolean r2 = r10.f74567q
            if (r2 == 0) goto L59
            int r2 = r10.f74563m
            float r3 = (float) r2
            int r4 = r10.f74564n
            float r5 = (float) r4
            float r3 = r3 / r5
            float r5 = (float) r0
            float r6 = (float) r1
            float r7 = r5 / r6
            int r8 = r10.f74556f
            r9 = 1
            if (r8 != r9) goto L48
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 > 0) goto L53
            goto L4f
        L48:
            r9 = 2
            if (r8 != r9) goto L56
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 < 0) goto L53
        L4f:
            float r5 = r5 / r3
            int r4 = (int) r5
            r2 = r0
            goto L5b
        L53:
            float r6 = r6 * r3
            int r2 = (int) r6
            goto L5a
        L56:
            if (r8 != 0) goto L59
            goto L5b
        L59:
            r2 = r0
        L5a:
            r4 = r1
        L5b:
            if (r0 != r2) goto L5f
            if (r1 == r4) goto L6d
        L5f:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = 17
            r0.<init>(r2, r4, r1)
            android.widget.FrameLayout r1 = r10.f74560j
            android.view.SurfaceView r2 = r10.f74552b
            r1.updateViewLayout(r2, r0)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.SurfaceHolder$CallbackC28712M.updateVideoLayout():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m37722a() {
        return this.f74570t;
    }
}
