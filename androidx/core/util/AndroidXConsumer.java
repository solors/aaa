package androidx.core.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.util.AndroidXConsumerKt */
/* loaded from: classes.dex */
public final class AndroidXConsumer {
    @NotNull
    public static final <T> Consumer<T> asAndroidXConsumer(@NotNull Continuation<? super T> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new AndroidXContinuationConsumer(continuation);
    }
}
