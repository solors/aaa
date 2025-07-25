package com.google.android.exoplayer2.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class VideoFrameReleaseHelper {

    /* renamed from: a */
    private final FixedFrameRateEstimator f36331a = new FixedFrameRateEstimator();
    @Nullable

    /* renamed from: b */
    private final DisplayHelper f36332b;
    @Nullable

    /* renamed from: c */
    private final VSyncSampler f36333c;

    /* renamed from: d */
    private boolean f36334d;
    @Nullable

    /* renamed from: e */
    private Surface f36335e;

    /* renamed from: f */
    private float f36336f;

    /* renamed from: g */
    private float f36337g;

    /* renamed from: h */
    private float f36338h;

    /* renamed from: i */
    private float f36339i;

    /* renamed from: j */
    private int f36340j;

    /* renamed from: k */
    private long f36341k;

    /* renamed from: l */
    private long f36342l;

    /* renamed from: m */
    private long f36343m;

    /* renamed from: n */
    private long f36344n;

    /* renamed from: o */
    private long f36345o;

    /* renamed from: p */
    private long f36346p;

    /* renamed from: q */
    private long f36347q;

    @RequiresApi(30)
    /* loaded from: classes4.dex */
    public static final class Api30 {
        private Api30() {
        }

        @DoNotInline
        public static void setSurfaceFrameRate(Surface surface, float f) {
            int i;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = 1;
            }
            try {
                surface.setFrameRate(f, i);
            } catch (IllegalStateException e) {
                Log.m72605e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface DisplayHelper {

        /* loaded from: classes4.dex */
        public interface Listener {
            void onDefaultDisplayChanged(@Nullable Display display);
        }

        void register(Listener listener);

        void unregister();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: g */
        private static final VSyncSampler f36351g = new VSyncSampler();

        /* renamed from: b */
        private final Handler f36352b;

        /* renamed from: c */
        private final HandlerThread f36353c;

        /* renamed from: d */
        private Choreographer f36354d;

        /* renamed from: f */
        private int f36355f;
        public volatile long sampledVsyncTimeNs = -9223372036854775807L;

        private VSyncSampler() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f36353c = handlerThread;
            handlerThread.start();
            Handler createHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.f36352b = createHandler;
            createHandler.sendEmptyMessage(0);
        }

        /* renamed from: a */
        private void m72392a() {
            Choreographer choreographer = this.f36354d;
            if (choreographer != null) {
                int i = this.f36355f + 1;
                this.f36355f = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        /* renamed from: b */
        private void m72391b() {
            try {
                this.f36354d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                Log.m72601w("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        /* renamed from: c */
        private void m72390c() {
            Choreographer choreographer = this.f36354d;
            if (choreographer != null) {
                int i = this.f36355f - 1;
                this.f36355f = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.sampledVsyncTimeNs = -9223372036854775807L;
                }
            }
        }

        public static VSyncSampler getInstance() {
            return f36351g;
        }

        public void addObserver() {
            this.f36352b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.sampledVsyncTimeNs = j;
            ((Choreographer) Assertions.checkNotNull(this.f36354d)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    m72390c();
                    return true;
                }
                m72392a();
                return true;
            }
            m72391b();
            return true;
        }

        public void removeObserver() {
            this.f36352b.sendEmptyMessage(2);
        }
    }

    public VideoFrameReleaseHelper(@Nullable Context context) {
        VSyncSampler vSyncSampler;
        DisplayHelper m72398e = m72398e(context);
        this.f36332b = m72398e;
        if (m72398e != null) {
            vSyncSampler = VSyncSampler.getInstance();
        } else {
            vSyncSampler = null;
        }
        this.f36333c = vSyncSampler;
        this.f36341k = -9223372036854775807L;
        this.f36342l = -9223372036854775807L;
        this.f36336f = -1.0f;
        this.f36339i = 1.0f;
        this.f36340j = 0;
    }

    /* renamed from: b */
    private static boolean m72401b(long j, long j2) {
        if (Math.abs(j - j2) <= 20000000) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m72400c() {
        Surface surface;
        if (Util.SDK_INT >= 30 && (surface = this.f36335e) != null && this.f36340j != Integer.MIN_VALUE && this.f36338h != 0.0f) {
            this.f36338h = 0.0f;
            Api30.setSurfaceFrameRate(surface, 0.0f);
        }
    }

    /* renamed from: d */
    private static long m72399d(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        if (j5 - j >= j - j4) {
            return j4;
        }
        return j5;
    }

    @Nullable
    /* renamed from: e */
    private static DisplayHelper m72398e(@Nullable Context context) {
        DisplayHelper displayHelper = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (Util.SDK_INT >= 17) {
            displayHelper = DisplayHelperV17.maybeBuildNewInstance(applicationContext);
        }
        if (displayHelper == null) {
            return DisplayHelperV16.maybeBuildNewInstance(applicationContext);
        }
        return displayHelper;
    }

    /* renamed from: f */
    private void m72397f() {
        this.f36343m = 0L;
        this.f36346p = -1L;
        this.f36344n = -1L;
    }

    /* renamed from: g */
    public void m72396g(@Nullable Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f36341k = refreshRate;
            this.f36342l = (refreshRate * 80) / 100;
            return;
        }
        Log.m72602w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f36341k = -9223372036854775807L;
        this.f36342l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r7.f36337g) >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005f, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x006a, code lost:
        if (r7.f36331a.getFramesWithoutSyncCount() >= 30) goto L26;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m72395h() {
        /*
            r7 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r7.f36335e
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r0 = r7.f36331a
            boolean r0 = r0.isSynced()
            if (r0 == 0) goto L1b
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r0 = r7.f36331a
            float r0 = r0.getFrameRate()
            goto L1d
        L1b:
            float r0 = r7.f36336f
        L1d:
            float r2 = r7.f36337g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r1 = r7.f36331a
            boolean r1 = r1.isSynced()
            if (r1 == 0) goto L49
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r1 = r7.f36331a
            long r1 = r1.getMatchingFrameDurationSumNs()
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L49
            r1 = r6
            goto L4a
        L49:
            r1 = r5
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r7.f36337g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r6 = r5
            goto L6c
        L61:
            if (r4 == 0) goto L64
            goto L6c
        L64:
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r2 = r7.f36331a
            int r2 = r2.getFramesWithoutSyncCount()
            if (r2 < r1) goto L5f
        L6c:
            if (r6 == 0) goto L73
            r7.f36337g = r0
            r7.m72394i(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.VideoFrameReleaseHelper.m72395h():void");
    }

    /* renamed from: i */
    private void m72394i(boolean z) {
        Surface surface;
        float f;
        if (Util.SDK_INT >= 30 && (surface = this.f36335e) != null && this.f36340j != Integer.MIN_VALUE) {
            if (this.f36334d) {
                float f2 = this.f36337g;
                if (f2 != -1.0f) {
                    f = f2 * this.f36339i;
                    if (z && this.f36338h == f) {
                        return;
                    }
                    this.f36338h = f;
                    Api30.setSurfaceFrameRate(surface, f);
                }
            }
            f = 0.0f;
            if (z) {
            }
            this.f36338h = f;
            Api30.setSurfaceFrameRate(surface, f);
        }
    }

    public long adjustReleaseTime(long j) {
        long j2;
        VSyncSampler vSyncSampler;
        if (this.f36346p != -1 && this.f36331a.isSynced()) {
            long frameDurationNs = this.f36347q + (((float) (this.f36331a.getFrameDurationNs() * (this.f36343m - this.f36346p))) / this.f36339i);
            if (m72401b(j, frameDurationNs)) {
                j2 = frameDurationNs;
                this.f36344n = this.f36343m;
                this.f36345o = j2;
                vSyncSampler = this.f36333c;
                if (vSyncSampler == null && this.f36341k != -9223372036854775807L) {
                    long j3 = vSyncSampler.sampledVsyncTimeNs;
                    if (j3 == -9223372036854775807L) {
                        return j2;
                    }
                    return m72399d(j2, j3, this.f36341k) - this.f36342l;
                }
                return j2;
            }
            m72397f();
        }
        j2 = j;
        this.f36344n = this.f36343m;
        this.f36345o = j2;
        vSyncSampler = this.f36333c;
        if (vSyncSampler == null) {
        }
        return j2;
    }

    public void onFormatChanged(float f) {
        this.f36336f = f;
        this.f36331a.reset();
        m72395h();
    }

    public void onNextFrame(long j) {
        long j2 = this.f36344n;
        if (j2 != -1) {
            this.f36346p = j2;
            this.f36347q = this.f36345o;
        }
        this.f36343m++;
        this.f36331a.onNextFrame(j * 1000);
        m72395h();
    }

    public void onPlaybackSpeed(float f) {
        this.f36339i = f;
        m72397f();
        m72394i(false);
    }

    public void onPositionReset() {
        m72397f();
    }

    public void onStarted() {
        this.f36334d = true;
        m72397f();
        if (this.f36332b != null) {
            ((VSyncSampler) Assertions.checkNotNull(this.f36333c)).addObserver();
            this.f36332b.register(new DisplayHelper.Listener() { // from class: com.google.android.exoplayer2.video.b
                {
                    VideoFrameReleaseHelper.this = this;
                }

                @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener
                public final void onDefaultDisplayChanged(Display display) {
                    VideoFrameReleaseHelper.this.m72396g(display);
                }
            });
        }
        m72394i(false);
    }

    public void onStopped() {
        this.f36334d = false;
        DisplayHelper displayHelper = this.f36332b;
        if (displayHelper != null) {
            displayHelper.unregister();
            ((VSyncSampler) Assertions.checkNotNull(this.f36333c)).removeObserver();
        }
        m72400c();
    }

    public void onSurfaceChanged(@Nullable Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.f36335e == surface) {
            return;
        }
        m72400c();
        this.f36335e = surface;
        m72394i(true);
    }

    public void setChangeFrameRateStrategy(int i) {
        if (this.f36340j == i) {
            return;
        }
        this.f36340j = i;
        m72394i(true);
    }

    /* loaded from: classes4.dex */
    public static final class DisplayHelperV16 implements DisplayHelper {

        /* renamed from: a */
        private final WindowManager f36348a;

        private DisplayHelperV16(WindowManager windowManager) {
            this.f36348a = windowManager;
        }

        @Nullable
        public static DisplayHelper maybeBuildNewInstance(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new DisplayHelperV16(windowManager);
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void register(DisplayHelper.Listener listener) {
            listener.onDefaultDisplayChanged(this.f36348a.getDefaultDisplay());
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
        }
    }

    @RequiresApi(17)
    /* loaded from: classes4.dex */
    public static final class DisplayHelperV17 implements DisplayHelper, DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f36349a;
        @Nullable

        /* renamed from: b */
        private DisplayHelper.Listener f36350b;

        private DisplayHelperV17(DisplayManager displayManager) {
            this.f36349a = displayManager;
        }

        /* renamed from: a */
        private Display m72393a() {
            return this.f36349a.getDisplay(0);
        }

        @Nullable
        public static DisplayHelper maybeBuildNewInstance(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new DisplayHelperV17(displayManager);
            }
            return null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            DisplayHelper.Listener listener = this.f36350b;
            if (listener != null && i == 0) {
                listener.onDefaultDisplayChanged(m72393a());
            }
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void register(DisplayHelper.Listener listener) {
            this.f36350b = listener;
            this.f36349a.registerDisplayListener(this, Util.createHandlerForCurrentLooper());
            listener.onDefaultDisplayChanged(m72393a());
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
            this.f36349a.unregisterDisplayListener(this);
            this.f36350b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }
}
