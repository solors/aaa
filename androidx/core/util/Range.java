package androidx.core.util;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import de.InterfaceC32867c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.util.RangeKt */
/* loaded from: classes.dex */
public final class Range {
    @RequiresApi(21)
    @NotNull
    public static final <T extends Comparable<? super T>> android.util.Range<T> and(@NotNull android.util.Range<T> range, @NotNull android.util.Range<T> other) {
        Intrinsics.checkNotNullParameter(range, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        android.util.Range<T> intersect = range.intersect(other);
        Intrinsics.checkNotNullExpressionValue(intersect, "intersect(other)");
        return intersect;
    }

    @RequiresApi(21)
    @NotNull
    public static final <T extends Comparable<? super T>> android.util.Range<T> plus(@NotNull android.util.Range<T> range, @NotNull T value) {
        Intrinsics.checkNotNullParameter(range, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        android.util.Range<T> extend = range.extend((android.util.Range<T>) value);
        Intrinsics.checkNotNullExpressionValue(extend, "extend(value)");
        return extend;
    }

    @RequiresApi(21)
    @NotNull
    public static final <T extends Comparable<? super T>> android.util.Range<T> rangeTo(@NotNull T t, @NotNull T that) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new android.util.Range<>(t, that);
    }

    @RequiresApi(21)
    @NotNull
    public static final <T extends Comparable<? super T>> InterfaceC32867c<T> toClosedRange(@NotNull final android.util.Range<T> range) {
        Intrinsics.checkNotNullParameter(range, "<this>");
        return (InterfaceC32867c<T>) new InterfaceC32867c<T>() { // from class: androidx.core.util.RangeKt$toClosedRange$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(@NotNull Comparable comparable) {
                return InterfaceC32867c.C32868a.m25659a(this, comparable);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Comparable] */
            @Override // de.InterfaceC32867c
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Comparable] */
            @Override // de.InterfaceC32867c
            public Comparable getStart() {
                return range.getLower();
            }

            @Override // de.InterfaceC32867c
            public boolean isEmpty() {
                return InterfaceC32867c.C32868a.m25658b(this);
            }
        };
    }

    @RequiresApi(21)
    @NotNull
    public static final <T extends Comparable<? super T>> android.util.Range<T> toRange(@NotNull InterfaceC32867c<T> interfaceC32867c) {
        Intrinsics.checkNotNullParameter(interfaceC32867c, "<this>");
        return new android.util.Range<>(interfaceC32867c.getStart(), interfaceC32867c.getEndInclusive());
    }

    @RequiresApi(21)
    @NotNull
    public static final <T extends Comparable<? super T>> android.util.Range<T> plus(@NotNull android.util.Range<T> range, @NotNull android.util.Range<T> other) {
        Intrinsics.checkNotNullParameter(range, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        android.util.Range<T> extend = range.extend(other);
        Intrinsics.checkNotNullExpressionValue(extend, "extend(other)");
        return extend;
    }
}
