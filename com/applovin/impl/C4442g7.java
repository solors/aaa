package com.applovin.impl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* renamed from: com.applovin.impl.g7 */
/* loaded from: classes2.dex */
public final class C4442g7 extends Surface {

    /* renamed from: d */
    private static int f6306d;

    /* renamed from: f */
    private static boolean f6307f;

    /* renamed from: a */
    public final boolean f6308a;

    /* renamed from: b */
    private final HandlerThreadC4444b f6309b;

    /* renamed from: c */
    private boolean f6310c;

    private C4442g7(HandlerThreadC4444b handlerThreadC4444b, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f6309b = handlerThreadC4444b;
        this.f6308a = z;
    }

    /* renamed from: a */
    private static int m99013a(Context context) {
        if (AbstractC4000aa.m101008a(context)) {
            return AbstractC4000aa.m101002c() ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: b */
    public static synchronized boolean m99011b(Context context) {
        boolean z;
        synchronized (C4442g7.class) {
            z = true;
            if (!f6307f) {
                f6306d = m99013a(context);
                f6307f = true;
            }
            if (f6306d == 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f6309b) {
            if (!this.f6310c) {
                this.f6309b.m99010a();
                this.f6310c = true;
            }
        }
    }

    /* renamed from: a */
    public static C4442g7 m99012a(Context context, boolean z) {
        AbstractC4100b1.m100577b(!z || m99011b(context));
        return new HandlerThreadC4444b().m99009a(z ? f6306d : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.g7$b */
    /* loaded from: classes2.dex */
    public static class HandlerThreadC4444b extends HandlerThread implements Handler.Callback {

        /* renamed from: a */
        private RunnableC4819m7 f6311a;

        /* renamed from: b */
        private Handler f6312b;

        /* renamed from: c */
        private Error f6313c;

        /* renamed from: d */
        private RuntimeException f6314d;

        /* renamed from: f */
        private C4442g7 f6315f;

        public HandlerThreadC4444b() {
            super("ExoPlayer:DummySurface");
        }

        /* renamed from: b */
        private void m99007b(int i) {
            AbstractC4100b1.m100583a(this.f6311a);
            this.f6311a.m97571a(i);
            this.f6315f = new C4442g7(this, this.f6311a.m97565c(), i != 0);
        }

        /* renamed from: a */
        public C4442g7 m99009a(int i) {
            boolean z;
            start();
            this.f6312b = new Handler(getLooper(), this);
            this.f6311a = new RunnableC4819m7(this.f6312b);
            synchronized (this) {
                z = false;
                this.f6312b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f6315f == null && this.f6314d == null && this.f6313c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f6314d;
            if (runtimeException == null) {
                Error error = this.f6313c;
                if (error == null) {
                    return (C4442g7) AbstractC4100b1.m100583a(this.f6315f);
                }
                throw error;
            }
            throw runtimeException;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        m99008b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    m99007b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    AbstractC5063oc.m96808a("DummySurface", "Failed to initialize dummy surface", e);
                    this.f6313c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    AbstractC5063oc.m96808a("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f6314d = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        /* renamed from: b */
        private void m99008b() {
            AbstractC4100b1.m100583a(this.f6311a);
            this.f6311a.m97564d();
        }

        /* renamed from: a */
        public void m99010a() {
            AbstractC4100b1.m100583a(this.f6312b);
            this.f6312b.sendEmptyMessage(2);
        }
    }
}
