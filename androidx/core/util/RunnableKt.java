package androidx.core.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Runnable.kt */
@Metadata
/* loaded from: classes.dex */
public final class RunnableKt {
    @NotNull
    public static final Runnable asRunnable(@NotNull Continuation<? super Unit> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new Runnable(continuation);
    }
}
