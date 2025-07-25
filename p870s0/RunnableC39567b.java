package p870s0;

import android.content.Context;
import android.content.Intent;

/* renamed from: s0.b */
/* loaded from: classes3.dex */
public final class RunnableC39567b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C39570e f103970b;

    public RunnableC39567b(C39570e c39570e) {
        this.f103970b = c39570e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f103970b.f103987n) {
            Intent intent = new Intent();
            intent.setClassName(this.f103970b.f103983j, "com.digitalturbine.ignite.cl.IgniteRemoteService");
            C39570e c39570e = this.f103970b;
            Context context = c39570e.f103980g;
            if (context != null) {
                context.bindService(intent, c39570e, 1);
            }
        }
    }
}
