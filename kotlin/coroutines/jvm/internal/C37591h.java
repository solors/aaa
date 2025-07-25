package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DebugProbes.kt */
@Metadata
/* renamed from: kotlin.coroutines.jvm.internal.h */
/* loaded from: classes7.dex */
public final class C37591h {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: a */
    public static final <T> Continuation<T> m17086a(@NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return completion;
    }

    /* renamed from: b */
    public static final void m17085b(@NotNull Continuation<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    /* renamed from: c */
    public static final void m17084c(@NotNull Continuation<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }
}
