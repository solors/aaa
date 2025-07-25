package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.applovin.impl.nc */
/* loaded from: classes2.dex */
public final class C4998nc {

    /* renamed from: d */
    public static final C5001c f8537d = m97013a(false, -9223372036854775807L);

    /* renamed from: e */
    public static final C5001c f8538e = m97013a(true, -9223372036854775807L);

    /* renamed from: f */
    public static final C5001c f8539f = new C5001c(2, -9223372036854775807L);

    /* renamed from: g */
    public static final C5001c f8540g = new C5001c(3, -9223372036854775807L);

    /* renamed from: a */
    private final ExecutorService f8541a;

    /* renamed from: b */
    private HandlerC5002d f8542b;

    /* renamed from: c */
    private IOException f8543c;

    /* renamed from: com.applovin.impl.nc$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5000b {
        /* renamed from: a */
        C5001c mo97007a(InterfaceC5003e interfaceC5003e, long j, long j2, IOException iOException, int i);

        /* renamed from: a */
        void mo97008a(InterfaceC5003e interfaceC5003e, long j, long j2);

        /* renamed from: a */
        void mo97006a(InterfaceC5003e interfaceC5003e, long j, long j2, boolean z);
    }

    /* renamed from: com.applovin.impl.nc$c */
    /* loaded from: classes2.dex */
    public static final class C5001c {

        /* renamed from: a */
        private final int f8544a;

        /* renamed from: b */
        private final long f8545b;

        private C5001c(int i, long j) {
            this.f8544a = i;
            this.f8545b = j;
        }

        /* renamed from: a */
        public boolean m97005a() {
            int i = this.f8544a;
            return i == 0 || i == 1;
        }
    }

    /* renamed from: com.applovin.impl.nc$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC5003e {
        /* renamed from: a */
        void mo96996a();

        /* renamed from: b */
        void mo96995b();
    }

    /* renamed from: com.applovin.impl.nc$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC5004f {
        /* renamed from: d */
        void mo96994d();
    }

    /* renamed from: com.applovin.impl.nc$g */
    /* loaded from: classes2.dex */
    private static final class RunnableC5005g implements Runnable {

        /* renamed from: a */
        private final InterfaceC5004f f8556a;

        public RunnableC5005g(InterfaceC5004f interfaceC5004f) {
            this.f8556a = interfaceC5004f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8556a.mo96994d();
        }
    }

    /* renamed from: com.applovin.impl.nc$h */
    /* loaded from: classes2.dex */
    public static final class C5006h extends IOException {
        public C5006h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public C4998nc(String str) {
        this.f8541a = AbstractC5863xp.m92963e("ExoPlayer:Loader:" + str);
    }

    /* renamed from: c */
    public boolean m97010c() {
        if (this.f8543c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m97009d() {
        if (this.f8542b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m97012b() {
        this.f8543c = null;
    }

    /* renamed from: a */
    public void m97020a() {
        ((HandlerC5002d) AbstractC4100b1.m100578b(this.f8542b)).m96999a(false);
    }

    /* renamed from: a */
    public void m97019a(int i) {
        IOException iOException = this.f8543c;
        if (iOException == null) {
            HandlerC5002d handlerC5002d = this.f8542b;
            if (handlerC5002d != null) {
                if (i == Integer.MIN_VALUE) {
                    i = handlerC5002d.f8546a;
                }
                handlerC5002d.m97001a(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: a */
    public void m97017a(InterfaceC5004f interfaceC5004f) {
        HandlerC5002d handlerC5002d = this.f8542b;
        if (handlerC5002d != null) {
            handlerC5002d.m96999a(true);
        }
        if (interfaceC5004f != null) {
            this.f8541a.execute(new RunnableC5005g(interfaceC5004f));
        }
        this.f8541a.shutdown();
    }

    /* renamed from: a */
    public long m97018a(InterfaceC5003e interfaceC5003e, InterfaceC5000b interfaceC5000b, int i) {
        this.f8543c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC5002d((Looper) AbstractC4100b1.m100578b(Looper.myLooper()), interfaceC5003e, interfaceC5000b, i, elapsedRealtime).m97000a(0L);
        return elapsedRealtime;
    }

    /* renamed from: com.applovin.impl.nc$d */
    /* loaded from: classes2.dex */
    private final class HandlerC5002d extends Handler implements Runnable {

        /* renamed from: a */
        public final int f8546a;

        /* renamed from: b */
        private final InterfaceC5003e f8547b;

        /* renamed from: c */
        private final long f8548c;

        /* renamed from: d */
        private InterfaceC5000b f8549d;

        /* renamed from: f */
        private IOException f8550f;

        /* renamed from: g */
        private int f8551g;

        /* renamed from: h */
        private Thread f8552h;

        /* renamed from: i */
        private boolean f8553i;

        /* renamed from: j */
        private volatile boolean f8554j;

        public HandlerC5002d(Looper looper, InterfaceC5003e interfaceC5003e, InterfaceC5000b interfaceC5000b, int i, long j) {
            super(looper);
            this.f8547b = interfaceC5003e;
            this.f8549d = interfaceC5000b;
            this.f8546a = i;
            this.f8548c = j;
        }

        /* renamed from: b */
        private void m96998b() {
            C4998nc.this.f8542b = null;
        }

        /* renamed from: c */
        private long m96997c() {
            return Math.min((this.f8551g - 1) * 1000, 5000);
        }

        /* renamed from: a */
        public void m96999a(boolean z) {
            this.f8554j = z;
            this.f8550f = null;
            if (hasMessages(0)) {
                this.f8553i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f8553i = true;
                    this.f8547b.mo96995b();
                    Thread thread = this.f8552h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                m96998b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((InterfaceC5000b) AbstractC4100b1.m100583a(this.f8549d)).mo97006a(this.f8547b, elapsedRealtime, elapsedRealtime - this.f8548c, true);
                this.f8549d = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long m96997c;
            if (this.f8554j) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                m97002a();
            } else if (i != 3) {
                m96998b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f8548c;
                InterfaceC5000b interfaceC5000b = (InterfaceC5000b) AbstractC4100b1.m100583a(this.f8549d);
                if (this.f8553i) {
                    interfaceC5000b.mo97006a(this.f8547b, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f8550f = iOException;
                        int i3 = this.f8551g + 1;
                        this.f8551g = i3;
                        C5001c mo97007a = interfaceC5000b.mo97007a(this.f8547b, elapsedRealtime, j, iOException, i3);
                        if (mo97007a.f8544a == 3) {
                            C4998nc.this.f8543c = this.f8550f;
                            return;
                        } else if (mo97007a.f8544a != 2) {
                            if (mo97007a.f8544a == 1) {
                                this.f8551g = 1;
                            }
                            if (mo97007a.f8545b != -9223372036854775807L) {
                                m96997c = mo97007a.f8545b;
                            } else {
                                m96997c = m96997c();
                            }
                            m97000a(m96997c);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    interfaceC5000b.mo97008a(this.f8547b, elapsedRealtime, j);
                } catch (RuntimeException e) {
                    AbstractC5063oc.m96808a("LoadTask", "Unexpected exception handling load completed", e);
                    C4998nc.this.f8543c = new C5006h(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f8553i;
                    this.f8552h = Thread.currentThread();
                }
                if (z) {
                    AbstractC4727ko.m97907a("load:" + this.f8547b.getClass().getSimpleName());
                    try {
                        this.f8547b.mo96996a();
                        AbstractC4727ko.m97908a();
                    } catch (Throwable th) {
                        AbstractC4727ko.m97908a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f8552h = null;
                    Thread.interrupted();
                }
                if (!this.f8554j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.f8554j) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Error e2) {
                if (!this.f8554j) {
                    AbstractC5063oc.m96808a("LoadTask", "Unexpected error loading stream", e2);
                    obtainMessage(3, e2).sendToTarget();
                }
                throw e2;
            } catch (Exception e3) {
                if (!this.f8554j) {
                    AbstractC5063oc.m96808a("LoadTask", "Unexpected exception loading stream", e3);
                    obtainMessage(2, new C5006h(e3)).sendToTarget();
                }
            } catch (OutOfMemoryError e4) {
                if (!this.f8554j) {
                    AbstractC5063oc.m96808a("LoadTask", "OutOfMemory error loading stream", e4);
                    obtainMessage(2, new C5006h(e4)).sendToTarget();
                }
            }
        }

        /* renamed from: a */
        private void m97002a() {
            this.f8550f = null;
            C4998nc.this.f8541a.execute((Runnable) AbstractC4100b1.m100583a(C4998nc.this.f8542b));
        }

        /* renamed from: a */
        public void m97001a(int i) {
            IOException iOException = this.f8550f;
            if (iOException != null && this.f8551g > i) {
                throw iOException;
            }
        }

        /* renamed from: a */
        public void m97000a(long j) {
            AbstractC4100b1.m100577b(C4998nc.this.f8542b == null);
            C4998nc.this.f8542b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m97002a();
            }
        }
    }

    /* renamed from: a */
    public static C5001c m97013a(boolean z, long j) {
        return new C5001c(z ? 1 : 0, j);
    }
}
