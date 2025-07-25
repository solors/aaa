package com.applovin.impl;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* renamed from: com.applovin.impl.vq */
/* loaded from: classes2.dex */
public final class C5718vq {

    /* renamed from: a */
    private final C5173q8 f11523a = new C5173q8();

    /* renamed from: b */
    private final InterfaceC5720b f11524b;

    /* renamed from: c */
    private final Choreographer$FrameCallbackC5724e f11525c;

    /* renamed from: d */
    private boolean f11526d;

    /* renamed from: e */
    private Surface f11527e;

    /* renamed from: f */
    private float f11528f;

    /* renamed from: g */
    private float f11529g;

    /* renamed from: h */
    private float f11530h;

    /* renamed from: i */
    private float f11531i;

    /* renamed from: j */
    private int f11532j;

    /* renamed from: k */
    private long f11533k;

    /* renamed from: l */
    private long f11534l;

    /* renamed from: m */
    private long f11535m;

    /* renamed from: n */
    private long f11536n;

    /* renamed from: o */
    private long f11537o;

    /* renamed from: p */
    private long f11538p;

    /* renamed from: q */
    private long f11539q;

    /* renamed from: com.applovin.impl.vq$a */
    /* loaded from: classes2.dex */
    public static final class C5719a {
        /* renamed from: a */
        public static void m93805a(Surface surface, float f) {
            int i;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = 1;
            }
            try {
                surface.setFrameRate(f, i);
            } catch (IllegalStateException e) {
                AbstractC5063oc.m96808a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* renamed from: com.applovin.impl.vq$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5720b {

        /* renamed from: com.applovin.impl.vq$b$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC5721a {
            /* renamed from: a */
            void mo93804a(Display display);
        }

        /* renamed from: a */
        void mo93802a();

        /* renamed from: a */
        void mo93800a(InterfaceC5721a interfaceC5721a);
    }

    /* renamed from: com.applovin.impl.vq$c */
    /* loaded from: classes2.dex */
    public static final class C5722c implements InterfaceC5720b {

        /* renamed from: a */
        private final WindowManager f11540a;

        private C5722c(WindowManager windowManager) {
            this.f11540a = windowManager;
        }

        @Override // com.applovin.impl.C5718vq.InterfaceC5720b
        /* renamed from: a */
        public void mo93802a() {
        }

        /* renamed from: a */
        public static InterfaceC5720b m93803a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new C5722c(windowManager);
            }
            return null;
        }

        @Override // com.applovin.impl.C5718vq.InterfaceC5720b
        /* renamed from: a */
        public void mo93800a(InterfaceC5720b.InterfaceC5721a interfaceC5721a) {
            interfaceC5721a.mo93804a(this.f11540a.getDefaultDisplay());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.vq$e */
    /* loaded from: classes2.dex */
    public static final class Choreographer$FrameCallbackC5724e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: g */
        private static final Choreographer$FrameCallbackC5724e f11543g = new Choreographer$FrameCallbackC5724e();

        /* renamed from: a */
        public volatile long f11544a = -9223372036854775807L;

        /* renamed from: b */
        private final Handler f11545b;

        /* renamed from: c */
        private final HandlerThread f11546c;

        /* renamed from: d */
        private Choreographer f11547d;

        /* renamed from: f */
        private int f11548f;

        private Choreographer$FrameCallbackC5724e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f11546c = handlerThread;
            handlerThread.start();
            Handler m93027a = AbstractC5863xp.m93027a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f11545b = m93027a;
            m93027a.sendEmptyMessage(0);
        }

        /* renamed from: b */
        private void m93797b() {
            int i = this.f11548f + 1;
            this.f11548f = i;
            if (i == 1) {
                ((Choreographer) AbstractC4100b1.m100583a(this.f11547d)).postFrameCallback(this);
            }
        }

        /* renamed from: c */
        private void m93796c() {
            this.f11547d = Choreographer.getInstance();
        }

        /* renamed from: d */
        public static Choreographer$FrameCallbackC5724e m93795d() {
            return f11543g;
        }

        /* renamed from: f */
        private void m93793f() {
            int i = this.f11548f - 1;
            this.f11548f = i;
            if (i == 0) {
                ((Choreographer) AbstractC4100b1.m100583a(this.f11547d)).removeFrameCallback(this);
                this.f11544a = -9223372036854775807L;
            }
        }

        /* renamed from: a */
        public void m93798a() {
            this.f11545b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f11544a = j;
            ((Choreographer) AbstractC4100b1.m100583a(this.f11547d)).postFrameCallbackDelayed(this, 500L);
        }

        /* renamed from: e */
        public void m93794e() {
            this.f11545b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    m93793f();
                    return true;
                }
                m93797b();
                return true;
            }
            m93796c();
            return true;
        }
    }

    public C5718vq(Context context) {
        Choreographer$FrameCallbackC5724e choreographer$FrameCallbackC5724e;
        InterfaceC5720b m93819a = m93819a(context);
        this.f11524b = m93819a;
        if (m93819a != null) {
            choreographer$FrameCallbackC5724e = Choreographer$FrameCallbackC5724e.m93795d();
        } else {
            choreographer$FrameCallbackC5724e = null;
        }
        this.f11525c = choreographer$FrameCallbackC5724e;
        this.f11533k = -9223372036854775807L;
        this.f11534l = -9223372036854775807L;
        this.f11528f = -1.0f;
        this.f11531i = 1.0f;
        this.f11532j = 0;
    }

    /* renamed from: a */
    public static /* synthetic */ void m93816a(C5718vq c5718vq, Display display) {
        c5718vq.m93818a(display);
    }

    /* renamed from: g */
    private void m93807g() {
        this.f11535m = 0L;
        this.f11538p = -1L;
        this.f11536n = -1L;
    }

    /* renamed from: h */
    private void m93806h() {
        float f;
        float f2;
        if (AbstractC5863xp.f12151a >= 30 && this.f11527e != null) {
            if (this.f11523a.m96409e()) {
                f = this.f11523a.m96412b();
            } else {
                f = this.f11528f;
            }
            float f3 = this.f11529g;
            if (f == f3) {
                return;
            }
            int i = (f > (-1.0f) ? 1 : (f == (-1.0f) ? 0 : -1));
            if (i != 0 && f3 != -1.0f) {
                if (this.f11523a.m96409e() && this.f11523a.m96410d() >= 5000000000L) {
                    f2 = 0.02f;
                } else {
                    f2 = 1.0f;
                }
                if (Math.abs(f - this.f11529g) < f2) {
                    return;
                }
            } else if (i == 0 && this.f11523a.m96411c() < 30) {
                return;
            }
            this.f11529g = f;
            m93815a(false);
        }
    }

    /* renamed from: b */
    public void m93814b() {
        InterfaceC5720b interfaceC5720b = this.f11524b;
        if (interfaceC5720b != null) {
            interfaceC5720b.mo93802a();
            ((Choreographer$FrameCallbackC5724e) AbstractC4100b1.m100583a(this.f11525c)).m93794e();
        }
    }

    /* renamed from: c */
    public void m93811c() {
        if (this.f11524b != null) {
            ((Choreographer$FrameCallbackC5724e) AbstractC4100b1.m100583a(this.f11525c)).m93798a();
            this.f11524b.mo93800a(new InterfaceC5720b.InterfaceC5721a() { // from class: com.applovin.impl.b70
                @Override // com.applovin.impl.C5718vq.InterfaceC5720b.InterfaceC5721a
                /* renamed from: a */
                public final void mo93804a(Display display) {
                    C5718vq.m93816a(C5718vq.this, display);
                }
            });
        }
    }

    /* renamed from: d */
    public void m93810d() {
        m93807g();
    }

    /* renamed from: e */
    public void m93809e() {
        this.f11526d = true;
        m93807g();
        m93815a(false);
    }

    /* renamed from: f */
    public void m93808f() {
        this.f11526d = false;
        m93825a();
    }

    /* renamed from: com.applovin.impl.vq$d */
    /* loaded from: classes2.dex */
    public static final class C5723d implements InterfaceC5720b, DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f11541a;

        /* renamed from: b */
        private InterfaceC5720b.InterfaceC5721a f11542b;

        private C5723d(DisplayManager displayManager) {
            this.f11541a = displayManager;
        }

        /* renamed from: a */
        public static InterfaceC5720b m93801a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new C5723d(displayManager);
            }
            return null;
        }

        /* renamed from: b */
        private Display m93799b() {
            return this.f11541a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            InterfaceC5720b.InterfaceC5721a interfaceC5721a = this.f11542b;
            if (interfaceC5721a != null && i == 0) {
                interfaceC5721a.mo93804a(m93799b());
            }
        }

        @Override // com.applovin.impl.C5718vq.InterfaceC5720b
        /* renamed from: a */
        public void mo93800a(InterfaceC5720b.InterfaceC5721a interfaceC5721a) {
            this.f11542b = interfaceC5721a;
            this.f11541a.registerDisplayListener(this, AbstractC5863xp.m93043a());
            interfaceC5721a.mo93804a(m93799b());
        }

        @Override // com.applovin.impl.C5718vq.InterfaceC5720b
        /* renamed from: a */
        public void mo93802a() {
            this.f11541a.unregisterDisplayListener(this);
            this.f11542b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: a */
    public long m93822a(long j) {
        long j2;
        Choreographer$FrameCallbackC5724e choreographer$FrameCallbackC5724e;
        if (this.f11538p != -1 && this.f11523a.m96409e()) {
            long m96414a = this.f11539q + (((float) (this.f11523a.m96414a() * (this.f11535m - this.f11538p))) / this.f11531i);
            if (!m93821a(j, m96414a)) {
                m93807g();
            } else {
                j2 = m96414a;
                this.f11536n = this.f11535m;
                this.f11537o = j2;
                choreographer$FrameCallbackC5724e = this.f11525c;
                if (choreographer$FrameCallbackC5724e != null || this.f11533k == -9223372036854775807L) {
                    return j2;
                }
                long j3 = choreographer$FrameCallbackC5724e.f11544a;
                return j3 == -9223372036854775807L ? j2 : m93820a(j2, j3, this.f11533k) - this.f11534l;
            }
        }
        j2 = j;
        this.f11536n = this.f11535m;
        this.f11537o = j2;
        choreographer$FrameCallbackC5724e = this.f11525c;
        if (choreographer$FrameCallbackC5724e != null) {
        }
        return j2;
    }

    /* renamed from: b */
    public void m93812b(long j) {
        long j2 = this.f11536n;
        if (j2 != -1) {
            this.f11538p = j2;
            this.f11539q = this.f11537o;
        }
        this.f11535m++;
        this.f11523a.m96413a(j * 1000);
        m93806h();
    }

    /* renamed from: b */
    public void m93813b(float f) {
        this.f11531i = f;
        m93807g();
        m93815a(false);
    }

    /* renamed from: a */
    private static boolean m93821a(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    /* renamed from: a */
    private static long m93820a(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    /* renamed from: a */
    private static InterfaceC5720b m93819a(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            InterfaceC5720b m93801a = AbstractC5863xp.f12151a >= 17 ? C5723d.m93801a(applicationContext) : null;
            return m93801a == null ? C5722c.m93803a(applicationContext) : m93801a;
        }
        return null;
    }

    /* renamed from: a */
    public void m93824a(float f) {
        this.f11528f = f;
        this.f11523a.m96408f();
        m93806h();
    }

    /* renamed from: a */
    public void m93817a(Surface surface) {
        if (surface instanceof C4442g7) {
            surface = null;
        }
        if (this.f11527e == surface) {
            return;
        }
        m93825a();
        this.f11527e = surface;
        m93815a(true);
    }

    /* renamed from: a */
    public void m93823a(int i) {
        if (this.f11532j == i) {
            return;
        }
        this.f11532j = i;
        m93815a(true);
    }

    /* renamed from: a */
    public void m93818a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f11533k = refreshRate;
            this.f11534l = (refreshRate * 80) / 100;
            return;
        }
        AbstractC5063oc.m96800d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f11533k = -9223372036854775807L;
        this.f11534l = -9223372036854775807L;
    }

    /* renamed from: a */
    private void m93815a(boolean z) {
        Surface surface;
        float f;
        if (AbstractC5863xp.f12151a < 30 || (surface = this.f11527e) == null || this.f11532j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f11526d) {
            float f2 = this.f11529g;
            if (f2 != -1.0f) {
                f = f2 * this.f11531i;
                if (z && this.f11530h == f) {
                    return;
                }
                this.f11530h = f;
                C5719a.m93805a(surface, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.f11530h = f;
        C5719a.m93805a(surface, f);
    }

    /* renamed from: a */
    private void m93825a() {
        Surface surface;
        if (AbstractC5863xp.f12151a < 30 || (surface = this.f11527e) == null || this.f11532j == Integer.MIN_VALUE || this.f11530h == 0.0f) {
            return;
        }
        this.f11530h = 0.0f;
        C5719a.m93805a(surface, 0.0f);
    }
}
