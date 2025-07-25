package androidx.core.util;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Consumer.kt */
@RequiresApi(24)
@Metadata
/* loaded from: classes.dex */
public final class ConsumerKt {
    @RequiresApi(24)
    @NotNull
    public static final <T> java.util.function.Consumer<T> asConsumer(@NotNull Continuation<? super T> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new ContinuationConsumer(continuation);
    }
}
