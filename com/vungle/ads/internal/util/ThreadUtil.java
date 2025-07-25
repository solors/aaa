package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.util.u */
/* loaded from: classes7.dex */
public final class ThreadUtil {
    @NotNull
    public static final ThreadUtil INSTANCE = new ThreadUtil();
    @NotNull
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
    @Nullable
    private static Executor uiExecutor;

    private ThreadUtil() {
    }

    @Nullable
    public final Executor getUiExecutor$vungle_ads_release() {
        return uiExecutor;
    }

    public final boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public final void runOnUiThread(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (isMainThread()) {
            runnable.run();
            return;
        }
        Executor executor = uiExecutor;
        if (executor != null) {
            if (executor != null) {
                executor.execute(runnable);
                return;
            }
            return;
        }
        UI_HANDLER.post(runnable);
    }

    public final void setUiExecutor$vungle_ads_release(@Nullable Executor executor) {
        uiExecutor = executor;
    }

    @VisibleForTesting
    public static /* synthetic */ void getUiExecutor$vungle_ads_release$annotations() {
    }
}
