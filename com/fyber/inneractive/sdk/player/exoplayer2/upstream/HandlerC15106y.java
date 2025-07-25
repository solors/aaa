package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15130w;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.y */
/* loaded from: classes4.dex */
public final class HandlerC15106y extends Handler implements Runnable {

    /* renamed from: a */
    public final InterfaceC15107z f29761a;

    /* renamed from: b */
    public final InterfaceC15105x f29762b;

    /* renamed from: c */
    public final int f29763c;

    /* renamed from: d */
    public final long f29764d;

    /* renamed from: e */
    public IOException f29765e;

    /* renamed from: f */
    public int f29766f;

    /* renamed from: g */
    public volatile Thread f29767g;

    /* renamed from: h */
    public volatile boolean f29768h;

    /* renamed from: i */
    public final /* synthetic */ C15065B f29769i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC15106y(C15065B c15065b, Looper looper, InterfaceC15107z interfaceC15107z, InterfaceC15105x interfaceC15105x, int i, long j) {
        super(looper);
        this.f29769i = c15065b;
        this.f29761a = interfaceC15107z;
        this.f29762b = interfaceC15105x;
        this.f29763c = i;
        this.f29764d = j;
    }

    /* renamed from: a */
    public final void m77228a(boolean z) {
        this.f29768h = z;
        this.f29765e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f29761a.mo77226b();
            if (this.f29767g != null) {
                this.f29767g.interrupt();
            }
        }
        if (z) {
            this.f29769i.f29612b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f29762b.mo77229a(this.f29761a, elapsedRealtime, elapsedRealtime - this.f29764d, true);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        if (this.f29768h) {
            return;
        }
        int i2 = message.what;
        if (i2 == 0) {
            this.f29765e = null;
            C15065B c15065b = this.f29769i;
            c15065b.f29611a.execute(c15065b.f29612b);
        } else if (i2 != 4) {
            this.f29769i.f29612b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f29764d;
            if (this.f29761a.mo77227a()) {
                this.f29762b.mo77229a(this.f29761a, elapsedRealtime, j, false);
                return;
            }
            int i3 = message.what;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f29765e = iOException;
                        int mo77230a = this.f29762b.mo77230a(this.f29761a, elapsedRealtime, j, iOException);
                        if (mo77230a == 3) {
                            this.f29769i.f29613c = this.f29765e;
                            return;
                        } else if (mo77230a != 2) {
                            if (mo77230a == 1) {
                                i = 1;
                            } else {
                                i = this.f29766f + 1;
                            }
                            this.f29766f = i;
                            long min = Math.min((i - 1) * 1000, 5000);
                            C15065B c15065b2 = this.f29769i;
                            if (c15065b2.f29612b == null) {
                                c15065b2.f29612b = this;
                                if (min > 0) {
                                    sendEmptyMessageDelayed(0, min);
                                    return;
                                }
                                this.f29765e = null;
                                c15065b2.f29611a.execute(this);
                                return;
                            }
                            throw new IllegalStateException();
                        } else {
                            return;
                        }
                    }
                    return;
                }
                this.f29762b.mo77231a(this.f29761a, elapsedRealtime, j);
                return;
            }
            this.f29762b.mo77229a(this.f29761a, elapsedRealtime, j, false);
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f29767g = Thread.currentThread();
            if (!this.f29761a.mo77227a()) {
                AbstractC15130w.m77167a("load:".concat(this.f29761a.getClass().getSimpleName()));
                try {
                    this.f29761a.load();
                    AbstractC15130w.m77168a();
                } catch (Throwable th) {
                    AbstractC15130w.m77168a();
                    throw th;
                }
            }
            if (!this.f29768h) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f29768h) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException unused) {
            if (this.f29761a.mo77227a()) {
                if (!this.f29768h) {
                    sendEmptyMessage(2);
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.f29768h) {
                obtainMessage(3, new C15064A(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.f29768h) {
                obtainMessage(3, new C15064A(e3)).sendToTarget();
            }
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.f29768h) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
