package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActualJvm.jvm.kt */
@Metadata
/* loaded from: classes.dex */
public final class ActualJvm_jvmKt {
    public static final void ensureMutable(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    public static final int identityHashCode(@Nullable Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(@NotNull Composer composer, @NotNull Function2<? super Composer, ? super Integer, Unit> composable) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(composable, "composable");
        ((Function2) TypeIntrinsics.m17006e(composable, 2)).mo105910invoke(composer, 1);
    }

    public static final <T> T invokeComposableForResult(@NotNull Composer composer, @NotNull Function2<? super Composer, ? super Integer, ? extends T> composable) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(composable, "composable");
        return (T) ((Function2) TypeIntrinsics.m17006e(composable, 2)).mo105910invoke(composer, 1);
    }

    /* renamed from: synchronized  reason: not valid java name */
    public static final <R> R m107167synchronized(@NotNull Object lock, @NotNull Functions<? extends R> block) {
        R invoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (lock) {
            try {
                invoke = block.invoke();
                InlineMarker.m17017b(1);
            } catch (Throwable th) {
                InlineMarker.m17017b(1);
                InlineMarker.m17018a(1);
                throw th;
            }
        }
        InlineMarker.m17018a(1);
        return invoke;
    }
}
