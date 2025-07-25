package androidx.media3.exoplayer.video;

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
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
/* loaded from: classes2.dex */
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_SURFACE_FRAME_RATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.02f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private static final String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    private static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private int changeFrameRateStrategy;
    @Nullable
    private final DisplayHelper displayHelper;
    private float formatFrameRate;
    private long frameIndex;
    private final FixedFrameRateEstimator frameRateEstimator = new FixedFrameRateEstimator();
    private long lastAdjustedFrameIndex;
    private long lastAdjustedReleaseTimeNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private float playbackSpeed;
    private boolean started;
    @Nullable
    private Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private long vsyncDurationNs;
    private long vsyncOffsetNs;
    @Nullable
    private final VSyncSampler vsyncSampler;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(17)
    /* loaded from: classes2.dex */
    public static final class Api17 {
        private Api17() {
        }

        @DoNotInline
        public static boolean isPlaceholderSurface(@Nullable Surface surface) {
            return surface instanceof PlaceholderSurface;
        }
    }

    @RequiresApi(30)
    /* loaded from: classes2.dex */
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
                Log.m104567e(VideoFrameReleaseHelper.TAG, "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface DisplayHelper {

        /* loaded from: classes2.dex */
        public interface Listener {
            void onDefaultDisplayChanged(@Nullable Display display);
        }

        void register(Listener listener);

        void unregister();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {
        private static final int CREATE_CHOREOGRAPHER = 0;
        private static final VSyncSampler INSTANCE = new VSyncSampler();
        private static final int MSG_ADD_OBSERVER = 1;
        private static final int MSG_REMOVE_OBSERVER = 2;
        private Choreographer choreographer;
        private final HandlerThread choreographerOwnerThread;
        private final Handler handler;
        private int observerCount;
        public volatile long sampledVsyncTimeNs = -9223372036854775807L;

        private VSyncSampler() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.choreographerOwnerThread = handlerThread;
            handlerThread.start();
            Handler createHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.handler = createHandler;
            createHandler.sendEmptyMessage(0);
        }

        private void addObserverInternal() {
            Choreographer choreographer = this.choreographer;
            if (choreographer != null) {
                int i = this.observerCount + 1;
                this.observerCount = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void createChoreographerInstanceInternal() {
            try {
                this.choreographer = Choreographer.getInstance();
            } catch (RuntimeException e) {
                Log.m104563w(VideoFrameReleaseHelper.TAG, "Vsync sampling disabled due to platform error", e);
            }
        }

        public static VSyncSampler getInstance() {
            return INSTANCE;
        }

        private void removeObserverInternal() {
            Choreographer choreographer = this.choreographer;
            if (choreographer != null) {
                int i = this.observerCount - 1;
                this.observerCount = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.sampledVsyncTimeNs = -9223372036854775807L;
                }
            }
        }

        public void addObserver() {
            this.handler.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.sampledVsyncTimeNs = j;
            ((Choreographer) Assertions.checkNotNull(this.choreographer)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    removeObserverInternal();
                    return true;
                }
                addObserverInternal();
                return true;
            }
            createChoreographerInstanceInternal();
            return true;
        }

        public void removeObserver() {
            this.handler.sendEmptyMessage(2);
        }
    }

    public VideoFrameReleaseHelper(@Nullable Context context) {
        VSyncSampler vSyncSampler;
        DisplayHelper maybeBuildDisplayHelper = maybeBuildDisplayHelper(context);
        this.displayHelper = maybeBuildDisplayHelper;
        if (maybeBuildDisplayHelper != null) {
            vSyncSampler = VSyncSampler.getInstance();
        } else {
            vSyncSampler = null;
        }
        this.vsyncSampler = vSyncSampler;
        this.vsyncDurationNs = -9223372036854775807L;
        this.vsyncOffsetNs = -9223372036854775807L;
        this.formatFrameRate = -1.0f;
        this.playbackSpeed = 1.0f;
        this.changeFrameRateStrategy = 0;
    }

    private static boolean adjustmentAllowed(long j, long j2) {
        if (Math.abs(j - j2) <= MAX_ALLOWED_ADJUSTMENT_NS) {
            return true;
        }
        return false;
    }

    private void clearSurfaceFrameRate() {
        Surface surface;
        if (Util.SDK_INT >= 30 && (surface = this.surface) != null && this.changeFrameRateStrategy != Integer.MIN_VALUE && this.surfacePlaybackFrameRate != 0.0f) {
            this.surfacePlaybackFrameRate = 0.0f;
            Api30.setSurfaceFrameRate(surface, 0.0f);
        }
    }

    private static long closestVsync(long j, long j2, long j3) {
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
    private static DisplayHelper maybeBuildDisplayHelper(@Nullable Context context) {
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

    private void resetAdjustment() {
        this.frameIndex = 0L;
        this.lastAdjustedFrameIndex = -1L;
        this.pendingLastAdjustedFrameIndex = -1L;
    }

    public void updateDefaultDisplayRefreshRateParams(@Nullable Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.vsyncDurationNs = refreshRate;
            this.vsyncOffsetNs = (refreshRate * VSYNC_OFFSET_PERCENTAGE) / 100;
            return;
        }
        Log.m104564w(TAG, "Unable to query display refresh rate");
        this.vsyncDurationNs = -9223372036854775807L;
        this.vsyncOffsetNs = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r7.surfaceMediaFrameRate) >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005f, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x006a, code lost:
        if (r7.frameRateEstimator.getFramesWithoutSyncCount() >= 30) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateSurfaceMediaFrameRate() {
        /*
            r7 = this;
            int r0 = androidx.media3.common.util.Util.SDK_INT
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r7.surface
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            androidx.media3.exoplayer.video.FixedFrameRateEstimator r0 = r7.frameRateEstimator
            boolean r0 = r0.isSynced()
            if (r0 == 0) goto L1b
            androidx.media3.exoplayer.video.FixedFrameRateEstimator r0 = r7.frameRateEstimator
            float r0 = r0.getFrameRate()
            goto L1d
        L1b:
            float r0 = r7.formatFrameRate
        L1d:
            float r2 = r7.surfaceMediaFrameRate
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
            androidx.media3.exoplayer.video.FixedFrameRateEstimator r1 = r7.frameRateEstimator
            boolean r1 = r1.isSynced()
            if (r1 == 0) goto L49
            androidx.media3.exoplayer.video.FixedFrameRateEstimator r1 = r7.frameRateEstimator
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
            float r2 = r7.surfaceMediaFrameRate
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
            androidx.media3.exoplayer.video.FixedFrameRateEstimator r2 = r7.frameRateEstimator
            int r2 = r2.getFramesWithoutSyncCount()
            if (r2 < r1) goto L5f
        L6c:
            if (r6 == 0) goto L73
            r7.surfaceMediaFrameRate = r0
            r7.updateSurfacePlaybackFrameRate(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.VideoFrameReleaseHelper.updateSurfaceMediaFrameRate():void");
    }

    private void updateSurfacePlaybackFrameRate(boolean z) {
        Surface surface;
        float f;
        if (Util.SDK_INT >= 30 && (surface = this.surface) != null && this.changeFrameRateStrategy != Integer.MIN_VALUE) {
            if (this.started) {
                float f2 = this.surfaceMediaFrameRate;
                if (f2 != -1.0f) {
                    f = f2 * this.playbackSpeed;
                    if (z && this.surfacePlaybackFrameRate == f) {
                        return;
                    }
                    this.surfacePlaybackFrameRate = f;
                    Api30.setSurfaceFrameRate(surface, f);
                }
            }
            f = 0.0f;
            if (z) {
            }
            this.surfacePlaybackFrameRate = f;
            Api30.setSurfaceFrameRate(surface, f);
        }
    }

    public long adjustReleaseTime(long j) {
        long j2;
        VSyncSampler vSyncSampler;
        if (this.lastAdjustedFrameIndex != -1 && this.frameRateEstimator.isSynced()) {
            long frameDurationNs = this.lastAdjustedReleaseTimeNs + (((float) (this.frameRateEstimator.getFrameDurationNs() * (this.frameIndex - this.lastAdjustedFrameIndex))) / this.playbackSpeed);
            if (adjustmentAllowed(j, frameDurationNs)) {
                j2 = frameDurationNs;
                this.pendingLastAdjustedFrameIndex = this.frameIndex;
                this.pendingLastAdjustedReleaseTimeNs = j2;
                vSyncSampler = this.vsyncSampler;
                if (vSyncSampler == null && this.vsyncDurationNs != -9223372036854775807L) {
                    long j3 = vSyncSampler.sampledVsyncTimeNs;
                    if (j3 == -9223372036854775807L) {
                        return j2;
                    }
                    return closestVsync(j2, j3, this.vsyncDurationNs) - this.vsyncOffsetNs;
                }
                return j2;
            }
            resetAdjustment();
        }
        j2 = j;
        this.pendingLastAdjustedFrameIndex = this.frameIndex;
        this.pendingLastAdjustedReleaseTimeNs = j2;
        vSyncSampler = this.vsyncSampler;
        if (vSyncSampler == null) {
        }
        return j2;
    }

    public void onFormatChanged(float f) {
        this.formatFrameRate = f;
        this.frameRateEstimator.reset();
        updateSurfaceMediaFrameRate();
    }

    public void onNextFrame(long j) {
        long j2 = this.pendingLastAdjustedFrameIndex;
        if (j2 != -1) {
            this.lastAdjustedFrameIndex = j2;
            this.lastAdjustedReleaseTimeNs = this.pendingLastAdjustedReleaseTimeNs;
        }
        this.frameIndex++;
        this.frameRateEstimator.onNextFrame(j * 1000);
        updateSurfaceMediaFrameRate();
    }

    public void onPlaybackSpeed(float f) {
        this.playbackSpeed = f;
        resetAdjustment();
        updateSurfacePlaybackFrameRate(false);
    }

    public void onPositionReset() {
        resetAdjustment();
    }

    public void onStarted() {
        this.started = true;
        resetAdjustment();
        if (this.displayHelper != null) {
            ((VSyncSampler) Assertions.checkNotNull(this.vsyncSampler)).addObserver();
            this.displayHelper.register(new DisplayHelper.Listener() { // from class: androidx.media3.exoplayer.video.f
                {
                    VideoFrameReleaseHelper.this = this;
                }

                @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.DisplayHelper.Listener
                public final void onDefaultDisplayChanged(Display display) {
                    VideoFrameReleaseHelper.this.updateDefaultDisplayRefreshRateParams(display);
                }
            });
        }
        updateSurfacePlaybackFrameRate(false);
    }

    public void onStopped() {
        this.started = false;
        DisplayHelper displayHelper = this.displayHelper;
        if (displayHelper != null) {
            displayHelper.unregister();
            ((VSyncSampler) Assertions.checkNotNull(this.vsyncSampler)).removeObserver();
        }
        clearSurfaceFrameRate();
    }

    public void onSurfaceChanged(@Nullable Surface surface) {
        if (Util.SDK_INT >= 17 && Api17.isPlaceholderSurface(surface)) {
            surface = null;
        }
        if (this.surface == surface) {
            return;
        }
        clearSurfaceFrameRate();
        this.surface = surface;
        updateSurfacePlaybackFrameRate(true);
    }

    public void setChangeFrameRateStrategy(int i) {
        if (this.changeFrameRateStrategy == i) {
            return;
        }
        this.changeFrameRateStrategy = i;
        updateSurfacePlaybackFrameRate(true);
    }

    /* loaded from: classes2.dex */
    public static final class DisplayHelperV16 implements DisplayHelper {
        private final WindowManager windowManager;

        private DisplayHelperV16(WindowManager windowManager) {
            this.windowManager = windowManager;
        }

        @Nullable
        public static DisplayHelper maybeBuildNewInstance(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new DisplayHelperV16(windowManager);
            }
            return null;
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.DisplayHelper
        public void register(DisplayHelper.Listener listener) {
            listener.onDefaultDisplayChanged(this.windowManager.getDefaultDisplay());
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
        }
    }

    @RequiresApi(17)
    /* loaded from: classes2.dex */
    public static final class DisplayHelperV17 implements DisplayHelper, DisplayManager.DisplayListener {
        private final DisplayManager displayManager;
        @Nullable
        private DisplayHelper.Listener listener;

        private DisplayHelperV17(DisplayManager displayManager) {
            this.displayManager = displayManager;
        }

        private Display getDefaultDisplay() {
            return this.displayManager.getDisplay(0);
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
            DisplayHelper.Listener listener = this.listener;
            if (listener != null && i == 0) {
                listener.onDefaultDisplayChanged(getDefaultDisplay());
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.DisplayHelper
        public void register(DisplayHelper.Listener listener) {
            this.listener = listener;
            this.displayManager.registerDisplayListener(this, Util.createHandlerForCurrentLooper());
            listener.onDefaultDisplayChanged(getDefaultDisplay());
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
            this.displayManager.unregisterDisplayListener(this);
            this.listener = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }
}
