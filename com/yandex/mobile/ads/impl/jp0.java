package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class jp0 {

    /* renamed from: d */
    public static final C30646b f81026d = new C30646b(2, -9223372036854775807L);

    /* renamed from: e */
    public static final C30646b f81027e = new C30646b(3, -9223372036854775807L);

    /* renamed from: a */
    private final ExecutorService f81028a;
    @Nullable

    /* renamed from: b */
    private HandlerC30647c<? extends InterfaceC30648d> f81029b;
    @Nullable

    /* renamed from: c */
    private IOException f81030c;

    /* renamed from: com.yandex.mobile.ads.impl.jp0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30645a<T extends InterfaceC30648d> {
        /* renamed from: a */
        C30646b mo26220a(T t, long j, long j2, IOException iOException, int i);

        /* renamed from: a */
        void mo26221a(T t, long j, long j2);

        /* renamed from: a */
        void mo26219a(T t, long j, long j2, boolean z);
    }

    /* renamed from: com.yandex.mobile.ads.impl.jp0$b */
    /* loaded from: classes8.dex */
    public static final class C30646b {

        /* renamed from: a */
        private final int f81031a;

        /* renamed from: b */
        private final long f81032b;

        private C30646b(int i, long j) {
            this.f81031a = i;
            this.f81032b = j;
        }

        /* renamed from: a */
        public final boolean m32815a() {
            int i = this.f81031a;
            return i == 0 || i == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.yandex.mobile.ads.impl.jp0$c */
    /* loaded from: classes8.dex */
    private final class HandlerC30647c<T extends InterfaceC30648d> extends Handler implements Runnable {

        /* renamed from: b */
        public final int f81033b;

        /* renamed from: c */
        private final T f81034c;

        /* renamed from: d */
        private final long f81035d;
        @Nullable

        /* renamed from: e */
        private InterfaceC30645a<T> f81036e;
        @Nullable

        /* renamed from: f */
        private IOException f81037f;

        /* renamed from: g */
        private int f81038g;
        @Nullable

        /* renamed from: h */
        private Thread f81039h;

        /* renamed from: i */
        private boolean f81040i;

        /* renamed from: j */
        private volatile boolean f81041j;

        public HandlerC30647c(Looper looper, T t, InterfaceC30645a<T> interfaceC30645a, int i, long j) {
            super(looper);
            this.f81034c = t;
            this.f81036e = interfaceC30645a;
            this.f81033b = i;
            this.f81035d = j;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f81041j) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.f81037f = null;
                jp0 jp0Var = jp0.this;
                ExecutorService executorService = jp0Var.f81028a;
                HandlerC30647c handlerC30647c = jp0Var.f81029b;
                handlerC30647c.getClass();
                executorService.execute(handlerC30647c);
            } else if (i != 3) {
                jp0.this.f81029b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f81035d;
                InterfaceC30645a<T> interfaceC30645a = this.f81036e;
                interfaceC30645a.getClass();
                if (this.f81040i) {
                    interfaceC30645a.mo26219a(this.f81034c, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f81037f = iOException;
                        int i3 = this.f81038g + 1;
                        this.f81038g = i3;
                        C30646b mo26220a = interfaceC30645a.mo26220a(this.f81034c, elapsedRealtime, j, iOException, i3);
                        int i4 = mo26220a.f81031a;
                        if (i4 == 3) {
                            jp0.this.f81030c = this.f81037f;
                            return;
                        } else if (i4 != 2) {
                            if (i4 == 1) {
                                this.f81038g = 1;
                            }
                            long j2 = mo26220a.f81032b;
                            if (j2 == -9223372036854775807L) {
                                j2 = Math.min((this.f81038g - 1) * 1000, 5000);
                            }
                            jp0 jp0Var2 = jp0.this;
                            if (jp0Var2.f81029b == null) {
                                jp0Var2.f81029b = this;
                                if (j2 > 0) {
                                    sendEmptyMessageDelayed(0, j2);
                                    return;
                                }
                                this.f81037f = null;
                                jp0Var2.f81028a.execute(this);
                                return;
                            }
                            throw new IllegalStateException();
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    interfaceC30645a.mo26221a(this.f81034c, elapsedRealtime, j);
                } catch (RuntimeException e) {
                    gq0.m33797a("LoadTask", "Unexpected exception handling load completed", e);
                    jp0.this.f81030c = new C30651g(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f81040i;
                    this.f81039h = Thread.currentThread();
                }
                if (z) {
                    r02.m30173a("load:".concat(this.f81034c.getClass().getSimpleName()));
                    try {
                        this.f81034c.mo26177a();
                        r02.m30174a();
                    } catch (Throwable th) {
                        r02.m30174a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f81039h = null;
                    Thread.interrupted();
                }
                if (!this.f81041j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.f81041j) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (OutOfMemoryError e2) {
                if (!this.f81041j) {
                    gq0.m33797a("LoadTask", "OutOfMemory error loading stream", e2);
                    obtainMessage(2, new C30651g(e2)).sendToTarget();
                }
            } catch (Error e3) {
                if (!this.f81041j) {
                    gq0.m33797a("LoadTask", "Unexpected error loading stream", e3);
                    obtainMessage(3, e3).sendToTarget();
                }
                throw e3;
            } catch (Exception e4) {
                if (!this.f81041j) {
                    gq0.m33797a("LoadTask", "Unexpected exception loading stream", e4);
                    obtainMessage(2, new C30651g(e4)).sendToTarget();
                }
            }
        }

        /* renamed from: a */
        public final void m32811a(boolean z) {
            this.f81041j = z;
            this.f81037f = null;
            if (hasMessages(0)) {
                this.f81040i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f81040i = true;
                    this.f81034c.mo26173b();
                    Thread thread = this.f81039h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                jp0.this.f81029b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                InterfaceC30645a<T> interfaceC30645a = this.f81036e;
                interfaceC30645a.getClass();
                interfaceC30645a.mo26219a(this.f81034c, elapsedRealtime, elapsedRealtime - this.f81035d, true);
                this.f81036e = null;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jp0$d */
    /* loaded from: classes8.dex */
    public interface InterfaceC30648d {
        /* renamed from: a */
        void mo26177a() throws IOException;

        /* renamed from: b */
        void mo26173b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.jp0$e */
    /* loaded from: classes8.dex */
    public interface InterfaceC30649e {
        /* renamed from: b */
        void mo26212b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.jp0$f */
    /* loaded from: classes8.dex */
    private static final class RunnableC30650f implements Runnable {

        /* renamed from: b */
        private final InterfaceC30649e f81043b;

        public RunnableC30650f(InterfaceC30649e interfaceC30649e) {
            this.f81043b = interfaceC30649e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f81043b.mo26212b();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jp0$g */
    /* loaded from: classes8.dex */
    public static final class C30651g extends IOException {
        public C30651g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public jp0(String str) {
        this.f81028a = y32.m27048d("ExoPlayer:Loader:".concat(str));
    }

    /* renamed from: a */
    public final void m32827a() {
        HandlerC30647c<? extends InterfaceC30648d> handlerC30647c = this.f81029b;
        if (handlerC30647c != null) {
            handlerC30647c.m32811a(false);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final void m32821b() {
        this.f81030c = null;
    }

    /* renamed from: c */
    public final boolean m32819c() {
        return this.f81030c != null;
    }

    /* renamed from: d */
    public final boolean m32817d() {
        return this.f81029b != null;
    }

    /* renamed from: a */
    public final void m32826a(int i) throws IOException {
        IOException iOException = this.f81030c;
        if (iOException == null) {
            HandlerC30647c<? extends InterfaceC30648d> handlerC30647c = this.f81029b;
            if (handlerC30647c != null) {
                if (i == Integer.MIN_VALUE) {
                    i = handlerC30647c.f81033b;
                }
                IOException iOException2 = ((HandlerC30647c) handlerC30647c).f81037f;
                if (iOException2 != null && ((HandlerC30647c) handlerC30647c).f81038g > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: a */
    public final void m32823a(@Nullable InterfaceC30649e interfaceC30649e) {
        HandlerC30647c<? extends InterfaceC30648d> handlerC30647c = this.f81029b;
        if (handlerC30647c != null) {
            handlerC30647c.m32811a(true);
        }
        if (interfaceC30649e != null) {
            this.f81028a.execute(new RunnableC30650f(interfaceC30649e));
        }
        this.f81028a.shutdown();
    }

    /* renamed from: a */
    public static C30646b m32825a(long j, boolean z) {
        return new C30646b(z ? 1 : 0, j);
    }

    /* renamed from: a */
    public final <T extends InterfaceC30648d> long m32824a(T t, InterfaceC30645a<T> interfaceC30645a, int i) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.f81030c = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            HandlerC30647c<? extends InterfaceC30648d> handlerC30647c = new HandlerC30647c<>(myLooper, t, interfaceC30645a, i, elapsedRealtime);
            if (this.f81029b == null) {
                this.f81029b = handlerC30647c;
                ((HandlerC30647c) handlerC30647c).f81037f = null;
                this.f81028a.execute(handlerC30647c);
                return elapsedRealtime;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
