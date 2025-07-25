package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.runtime.ExpectKt */
/* loaded from: classes.dex */
public final class Expect {
    @NotNull
    public static final <T> ThreadLocal<T> ThreadLocal() {
        return new ThreadLocal<>(ExpectKt$ThreadLocal$1.INSTANCE);
    }

    public static final int postIncrement(@NotNull AtomicInt atomicInt) {
        Intrinsics.checkNotNullParameter(atomicInt, "<this>");
        return atomicInt.add(1) - 1;
    }
}
