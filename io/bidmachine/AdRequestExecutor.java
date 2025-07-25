package io.bidmachine;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.bidmachine.k */
/* loaded from: classes9.dex */
class AdRequestExecutor extends ThreadPoolExecutor {
    private static volatile AdRequestExecutor instance;

    @VisibleForTesting
    AdRequestExecutor(int i) {
        super(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static AdRequestExecutor get() {
        if (instance == null) {
            synchronized (AdRequestExecutor.class) {
                if (instance == null) {
                    instance = new AdRequestExecutor(Runtime.getRuntime().availableProcessors() * 2);
                }
            }
        }
        return instance;
    }
}
