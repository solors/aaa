package com.yandex.mobile.ads.impl;

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
import com.monetization.ads.exo.video.PlaceholderSurface;

/* loaded from: classes8.dex */
public final class z82 {

    /* renamed from: a */
    private final y80 f88767a = new y80();
    @Nullable

    /* renamed from: b */
    private final InterfaceC31960b f88768b;
    @Nullable

    /* renamed from: c */
    private final Choreographer$FrameCallbackC31964e f88769c;

    /* renamed from: d */
    private boolean f88770d;
    @Nullable

    /* renamed from: e */
    private Surface f88771e;

    /* renamed from: f */
    private float f88772f;

    /* renamed from: g */
    private float f88773g;

    /* renamed from: h */
    private float f88774h;

    /* renamed from: i */
    private float f88775i;

    /* renamed from: j */
    private int f88776j;

    /* renamed from: k */
    private long f88777k;

    /* renamed from: l */
    private long f88778l;

    /* renamed from: m */
    private long f88779m;

    /* renamed from: n */
    private long f88780n;

    /* renamed from: o */
    private long f88781o;

    /* renamed from: p */
    private long f88782p;

    /* renamed from: q */
    private long f88783q;

    @RequiresApi(30)
    /* renamed from: com.yandex.mobile.ads.impl.z82$a */
    /* loaded from: classes8.dex */
    public static final class C31959a {
        @DoNotInline
        /* renamed from: a */
        public static void m26302a(Surface surface, float f) {
            int i;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = 1;
            }
            try {
                surface.setFrameRate(f, i);
            } catch (IllegalStateException e) {
                gq0.m33797a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.z82$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31960b {

        /* renamed from: com.yandex.mobile.ads.impl.z82$b$a */
        /* loaded from: classes8.dex */
        public interface InterfaceC31961a {
            /* renamed from: a */
            void mo26301a(@Nullable Display display);
        }

        /* renamed from: a */
        void mo26300a();

        /* renamed from: a */
        void mo26298a(InterfaceC31961a interfaceC31961a);
    }

    /* renamed from: com.yandex.mobile.ads.impl.z82$c */
    /* loaded from: classes8.dex */
    public static final class C31962c implements InterfaceC31960b {

        /* renamed from: a */
        private final WindowManager f88784a;

        @Override // com.yandex.mobile.ads.impl.z82.InterfaceC31960b
        /* renamed from: a */
        public final void mo26300a() {
        }

        private C31962c(WindowManager windowManager) {
            this.f88784a = windowManager;
        }

        @Override // com.yandex.mobile.ads.impl.z82.InterfaceC31960b
        /* renamed from: a */
        public final void mo26298a(InterfaceC31960b.InterfaceC31961a interfaceC31961a) {
            interfaceC31961a.mo26301a(this.f88784a.getDefaultDisplay());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.z82$e */
    /* loaded from: classes8.dex */
    public static final class Choreographer$FrameCallbackC31964e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f */
        private static final Choreographer$FrameCallbackC31964e f88787f = new Choreographer$FrameCallbackC31964e();

        /* renamed from: b */
        public volatile long f88788b = -9223372036854775807L;

        /* renamed from: c */
        private final Handler f88789c;

        /* renamed from: d */
        private Choreographer f88790d;

        /* renamed from: e */
        private int f88791e;

        private Choreographer$FrameCallbackC31964e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Handler m27082a = y32.m27082a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f88789c = m27082a;
            m27082a.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.f88788b = j;
            Choreographer choreographer = this.f88790d;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    Choreographer choreographer = this.f88790d;
                    if (choreographer != null) {
                        int i2 = this.f88791e - 1;
                        this.f88791e = i2;
                        if (i2 == 0) {
                            choreographer.removeFrameCallback(this);
                            this.f88788b = -9223372036854775807L;
                        }
                    }
                    return true;
                }
                Choreographer choreographer2 = this.f88790d;
                if (choreographer2 != null) {
                    int i3 = this.f88791e + 1;
                    this.f88791e = i3;
                    if (i3 == 1) {
                        choreographer2.postFrameCallback(this);
                    }
                }
                return true;
            }
            try {
                this.f88790d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                gq0.m33794b("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }

        /* renamed from: a */
        public static Choreographer$FrameCallbackC31964e m26297a() {
            return f88787f;
        }
    }

    public z82(@Nullable Context context) {
        Choreographer$FrameCallbackC31964e choreographer$FrameCallbackC31964e;
        InterfaceC31960b m26312a = m26312a(context);
        this.f88768b = m26312a;
        if (m26312a != null) {
            choreographer$FrameCallbackC31964e = Choreographer$FrameCallbackC31964e.m26297a();
        } else {
            choreographer$FrameCallbackC31964e = null;
        }
        this.f88769c = choreographer$FrameCallbackC31964e;
        this.f88777k = -9223372036854775807L;
        this.f88778l = -9223372036854775807L;
        this.f88772f = -1.0f;
        this.f88775i = 1.0f;
        this.f88776j = 0;
    }

    /* renamed from: a */
    public static /* synthetic */ void m26309a(z82 z82Var, Display display) {
        z82Var.m26311a(display);
    }

    /* renamed from: d */
    private void m26303d() {
        float f;
        float f2;
        if (y32.f88010a >= 30 && this.f88771e != null) {
            if (this.f88767a.m26998e()) {
                f = this.f88767a.m27001b();
            } else {
                f = this.f88772f;
            }
            float f3 = this.f88773g;
            if (f == f3) {
                return;
            }
            int i = (f > (-1.0f) ? 1 : (f == (-1.0f) ? 0 : -1));
            if (i != 0 && f3 != -1.0f) {
                if (this.f88767a.m26998e() && this.f88767a.m26999d() >= 5000000000L) {
                    f2 = 0.02f;
                } else {
                    f2 = 1.0f;
                }
                if (Math.abs(f - this.f88773g) < f2) {
                    return;
                }
            } else if (i == 0 && this.f88767a.m27000c() < 30) {
                return;
            }
            this.f88773g = f;
            m26308a(false);
        }
    }

    /* renamed from: b */
    public final void m26305b(long j) {
        long j2 = this.f88780n;
        if (j2 != -1) {
            this.f88782p = j2;
            this.f88783q = this.f88781o;
        }
        this.f88779m++;
        this.f88767a.m27002a(j * 1000);
        m26303d();
    }

    /* renamed from: c */
    public final void m26304c() {
        Surface surface;
        this.f88770d = false;
        InterfaceC31960b interfaceC31960b = this.f88768b;
        if (interfaceC31960b != null) {
            interfaceC31960b.mo26300a();
            Choreographer$FrameCallbackC31964e choreographer$FrameCallbackC31964e = this.f88769c;
            choreographer$FrameCallbackC31964e.getClass();
            choreographer$FrameCallbackC31964e.f88789c.sendEmptyMessage(2);
        }
        if (y32.f88010a >= 30 && (surface = this.f88771e) != null && this.f88776j != Integer.MIN_VALUE && this.f88774h != 0.0f) {
            this.f88774h = 0.0f;
            C31959a.m26302a(surface, 0.0f);
        }
    }

    @RequiresApi(17)
    /* renamed from: com.yandex.mobile.ads.impl.z82$d */
    /* loaded from: classes8.dex */
    public static final class C31963d implements InterfaceC31960b, DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f88785a;
        @Nullable

        /* renamed from: b */
        private InterfaceC31960b.InterfaceC31961a f88786b;

        private C31963d(DisplayManager displayManager) {
            this.f88785a = displayManager;
        }

        @Nullable
        /* renamed from: a */
        public static C31963d m26299a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new C31963d(displayManager);
            }
            return null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            InterfaceC31960b.InterfaceC31961a interfaceC31961a = this.f88786b;
            if (interfaceC31961a != null && i == 0) {
                interfaceC31961a.mo26301a(this.f88785a.getDisplay(0));
            }
        }

        @Override // com.yandex.mobile.ads.impl.z82.InterfaceC31960b
        /* renamed from: a */
        public final void mo26298a(InterfaceC31960b.InterfaceC31961a interfaceC31961a) {
            this.f88786b = interfaceC31961a;
            this.f88785a.registerDisplayListener(this, y32.m27084a((Handler.Callback) null));
            interfaceC31961a.mo26301a(this.f88785a.getDisplay(0));
        }

        @Override // com.yandex.mobile.ads.impl.z82.InterfaceC31960b
        /* renamed from: a */
        public final void mo26300a() {
            this.f88785a.unregisterDisplayListener(this);
            this.f88786b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: a */
    public final long m26313a(long j) {
        long j2;
        if (this.f88782p != -1 && this.f88767a.m26998e()) {
            long m27003a = this.f88783q + (((float) ((this.f88779m - this.f88782p) * this.f88767a.m27003a())) / this.f88775i);
            if (Math.abs(j - m27003a) <= 20000000) {
                j = m27003a;
            } else {
                this.f88779m = 0L;
                this.f88782p = -1L;
                this.f88780n = -1L;
            }
        }
        this.f88780n = this.f88779m;
        this.f88781o = j;
        Choreographer$FrameCallbackC31964e choreographer$FrameCallbackC31964e = this.f88769c;
        if (choreographer$FrameCallbackC31964e == null || this.f88777k == -9223372036854775807L) {
            return j;
        }
        long j3 = choreographer$FrameCallbackC31964e.f88788b;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.f88777k;
        long j5 = (((j - j3) / j4) * j4) + j3;
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            j2 = j5;
            j5 = j4 + j5;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.f88778l;
    }

    /* renamed from: b */
    public final void m26306b(float f) {
        this.f88775i = f;
        this.f88779m = 0L;
        this.f88782p = -1L;
        this.f88780n = -1L;
        m26308a(false);
    }

    /* renamed from: b */
    public final void m26307b() {
        this.f88770d = true;
        this.f88779m = 0L;
        this.f88782p = -1L;
        this.f88780n = -1L;
        if (this.f88768b != null) {
            Choreographer$FrameCallbackC31964e choreographer$FrameCallbackC31964e = this.f88769c;
            choreographer$FrameCallbackC31964e.getClass();
            choreographer$FrameCallbackC31964e.f88789c.sendEmptyMessage(1);
            this.f88768b.mo26298a(new InterfaceC31960b.InterfaceC31961a() { // from class: com.yandex.mobile.ads.impl.q13
                @Override // com.yandex.mobile.ads.impl.z82.InterfaceC31960b.InterfaceC31961a
                /* renamed from: a */
                public final void mo26301a(Display display) {
                    z82.m26309a(z82.this, display);
                }
            });
        }
        m26308a(false);
    }

    @Nullable
    /* renamed from: a */
    private static InterfaceC31960b m26312a(@Nullable Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            InterfaceC31960b m26299a = y32.f88010a >= 17 ? C31963d.m26299a(applicationContext) : null;
            if (m26299a == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager == null) {
                    return null;
                }
                m26299a = new C31962c(windowManager);
            }
            return m26299a;
        }
        return null;
    }

    /* renamed from: a */
    public final void m26315a(float f) {
        this.f88772f = f;
        this.f88767a.m26997f();
        m26303d();
    }

    /* renamed from: a */
    public final void m26316a() {
        this.f88779m = 0L;
        this.f88782p = -1L;
        this.f88780n = -1L;
    }

    /* renamed from: a */
    public final void m26310a(@Nullable Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        Surface surface2 = this.f88771e;
        if (surface2 == surface) {
            return;
        }
        if (y32.f88010a >= 30 && surface2 != null && this.f88776j != Integer.MIN_VALUE && this.f88774h != 0.0f) {
            this.f88774h = 0.0f;
            C31959a.m26302a(surface2, 0.0f);
        }
        this.f88771e = surface;
        m26308a(true);
    }

    /* renamed from: a */
    public final void m26314a(int i) {
        if (this.f88776j == i) {
            return;
        }
        this.f88776j = i;
        m26308a(true);
    }

    /* renamed from: a */
    public void m26311a(@Nullable Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f88777k = refreshRate;
            this.f88778l = (refreshRate * 80) / 100;
            return;
        }
        gq0.m33792d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f88777k = -9223372036854775807L;
        this.f88778l = -9223372036854775807L;
    }

    /* renamed from: a */
    private void m26308a(boolean z) {
        Surface surface;
        float f;
        if (y32.f88010a < 30 || (surface = this.f88771e) == null || this.f88776j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f88770d) {
            float f2 = this.f88773g;
            if (f2 != -1.0f) {
                f = f2 * this.f88775i;
                if (z && this.f88774h == f) {
                    return;
                }
                this.f88774h = f;
                C31959a.m26302a(surface, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.f88774h = f;
        C31959a.m26302a(surface, f);
    }
}
