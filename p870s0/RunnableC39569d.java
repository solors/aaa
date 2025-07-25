package p870s0;

import android.content.ComponentName;
import android.os.IBinder;

/* renamed from: s0.d */
/* loaded from: classes3.dex */
public final class RunnableC39569d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ComponentName f103973b;

    /* renamed from: c */
    public final /* synthetic */ IBinder f103974c;

    /* renamed from: d */
    public final /* synthetic */ C39570e f103975d;

    public RunnableC39569d(C39570e c39570e, ComponentName componentName, IBinder iBinder) {
        this.f103975d = c39570e;
        this.f103973b = componentName;
        this.f103974c = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103975d.mo12227a(this.f103973b, this.f103974c);
    }
}
