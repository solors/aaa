package androidx.core.util;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pair.kt */
@Metadata
/* loaded from: classes.dex */
public final class PairKt {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(@NotNull Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(@NotNull Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.second;
    }

    @NotNull
    public static final <F, S> android.util.Pair<F, S> toAndroidPair(@NotNull Tuples<? extends F, ? extends S> tuples) {
        Intrinsics.checkNotNullParameter(tuples, "<this>");
        return new android.util.Pair<>(tuples.m17630c(), tuples.m17629d());
    }

    @NotNull
    public static final <F, S> Pair<F, S> toAndroidXPair(@NotNull Tuples<? extends F, ? extends S> tuples) {
        Intrinsics.checkNotNullParameter(tuples, "<this>");
        return new Pair<>(tuples.m17630c(), tuples.m17629d());
    }

    @NotNull
    public static final <F, S> Tuples<F, S> toKotlinPair(@NotNull Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return new Tuples<>(pair.first, pair.second);
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(@NotNull android.util.Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(@NotNull android.util.Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return (S) pair.second;
    }

    @NotNull
    public static final <F, S> Tuples<F, S> toKotlinPair(@NotNull android.util.Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return new Tuples<>(pair.first, pair.second);
    }
}
