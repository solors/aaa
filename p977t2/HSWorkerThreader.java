package p977t2;

import com.helpshift.log.HSLogger;
import java.util.concurrent.ExecutorService;
import p752k3.SafeWrappedRunnable;

/* renamed from: t2.d */
/* loaded from: classes5.dex */
public class HSWorkerThreader implements HSThreader {

    /* renamed from: a */
    private ExecutorService f116476a;

    public HSWorkerThreader(ExecutorService executorService) {
        this.f116476a = executorService;
    }

    @Override // p977t2.HSThreader
    public void submit(Runnable runnable) {
        try {
            this.f116476a.submit(new SafeWrappedRunnable(runnable));
        } catch (Exception e) {
            HSLogger.m65438e("HSThreader", "Error while submitting request.", e);
        }
    }
}
