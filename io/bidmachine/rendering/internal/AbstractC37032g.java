package io.bidmachine.rendering.internal;

import android.content.Context;
import io.bidmachine.rendering.utils.DailyCleanStrategy;
import io.bidmachine.rendering.utils.FileUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.bidmachine.rendering.internal.g */
/* loaded from: classes9.dex */
public abstract class AbstractC37032g {

    /* renamed from: a */
    private static final AtomicBoolean f97738a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final AtomicBoolean f97739b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final Object f97740c = new Object();

    /* renamed from: a */
    private static void m19175a(Context context) {
        new DailyCleanStrategy().clean(FileUtils.getExternalDir(context));
    }

    /* renamed from: b */
    public static void m19174b(Context context) {
        AtomicBoolean atomicBoolean = f97739b;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (f97740c) {
            if (!f97738a.compareAndSet(false, true)) {
                return;
            }
            m19175a(context);
            m19173c(context);
            atomicBoolean.set(true);
        }
    }

    /* renamed from: c */
    private static void m19173c(Context context) {
        FileUtils.clearTempFiles(context);
    }
}
