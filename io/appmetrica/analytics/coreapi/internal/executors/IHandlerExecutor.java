package io.appmetrica.analytics.coreapi.internal.executors;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface IHandlerExecutor extends ICommonExecutor {
    @NonNull
    Handler getHandler();

    @NonNull
    Looper getLooper();
}
