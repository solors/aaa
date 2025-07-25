package io.bidmachine.rendering.utils.taskmanager;

import io.bidmachine.rendering.utils.Cancelable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public abstract class CancelableTask implements Runnable, Cancelable {

    /* renamed from: a */
    private final AtomicBoolean f97973a = new AtomicBoolean(false);

    @Override // io.bidmachine.rendering.utils.Cancelable
    public boolean isCanceled() {
        return this.f97973a.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isCanceled()) {
            return;
        }
        runTask();
    }

    public abstract void runTask();

    @Override // io.bidmachine.rendering.utils.Cancelable
    public void setCancel(boolean z) {
        this.f97973a.set(z);
    }
}
