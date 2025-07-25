package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineLiveData.kt */
@RequiresApi(26)
@Metadata
/* loaded from: classes.dex */
public final class Api26Impl {
    @NotNull
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    public final long toMillis(@NotNull Duration timeout) {
        long millis;
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        millis = timeout.toMillis();
        return millis;
    }
}
