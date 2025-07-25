package com.smaato.sdk.core.util.notifier;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Threads;

/* loaded from: classes7.dex */
public final class ChangeSenderUtils {
    private ChangeSenderUtils() {
    }

    @NonNull
    public static <N> ChangeSender<N> createChangeSender(@NonNull N n) {
        return new StandardChangeSender(n);
    }

    @NonNull
    public static <N> ChangeSender<N> createDebounceChangeSender(@NonNull N n, long j) {
        return createDebounceChangeSender(n, j, Threads.newUiHandler());
    }

    @NonNull
    public static <N> ChangeSender<N> createUniqueValueChangeSender(@NonNull N n) {
        return new UniqueValueChangeSender(n);
    }

    @NonNull
    public static <N> ChangeSender<N> createDebounceChangeSender(@NonNull N n, long j, @NonNull Handler handler) {
        return new DebounceChangeSender(n, handler, j);
    }
}
