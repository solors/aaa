package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d */
/* loaded from: classes9.dex */
public final class C34466d extends Thread {

    /* renamed from: a */
    public final AtomicBoolean f94132a = new AtomicBoolean(true);

    /* renamed from: b */
    public final /* synthetic */ C34493e f94133b;

    public C34466d(C34493e c34493e) {
        this.f94133b = c34493e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f94132a.get()) {
            this.f94133b.f94226e.set(false);
            C34493e c34493e = this.f94133b;
            c34493e.f94224c.postAtFrontOfQueue(c34493e.f94227f);
            int i = this.f94133b.f94223b.get();
            while (i > 0) {
                try {
                    Thread.sleep(C34493e.f94220g);
                    if (this.f94133b.f94226e.get()) {
                        break;
                    }
                    i--;
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f94133b.f94222a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC34439c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f94133b.f94226e.get()) {
                try {
                    Thread.sleep(C34493e.f94220g);
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }
}
