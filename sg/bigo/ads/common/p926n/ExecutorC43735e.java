package sg.bigo.ads.common.p926n;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: sg.bigo.ads.common.n.e */
/* loaded from: classes10.dex */
public final class ExecutorC43735e implements Executor {

    /* renamed from: a */
    public final ThreadPoolExecutor f114462a;

    public ExecutorC43735e(String str, int i, int i2) {
        this.f114462a = new ThreadPoolExecutor(i2, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC43725c(str, false));
    }

    /* renamed from: a */
    public static void m5093a(InterfaceC43723a interfaceC43723a) {
        ThreadFactoryC43725c.m5110a(interfaceC43723a);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f114462a.execute(runnable);
    }

    public ExecutorC43735e(String str, int i, boolean z) {
        this.f114462a = new ThreadPoolExecutor(0, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC43725c(str, z));
    }
}
