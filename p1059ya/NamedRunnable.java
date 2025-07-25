package p1059ya;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* renamed from: ya.k */
/* loaded from: classes8.dex */
public abstract class NamedRunnable implements Runnable {
    @NonNull

    /* renamed from: b */
    private final String f118549b;

    public NamedRunnable(@NonNull String str) {
        this.f118549b = str;
    }

    @WorkerThread
    /* renamed from: a */
    public abstract void mo980a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread currentThread = Thread.currentThread();
        currentThread.setName(name + "-" + this.f118549b);
        try {
            mo980a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
