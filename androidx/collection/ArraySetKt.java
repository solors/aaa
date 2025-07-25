package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArraySet.kt */
@Metadata
/* loaded from: classes.dex */
public final class ArraySetKt {
    @NotNull
    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet<>();
    }

    @NotNull
    public static final <T> ArraySet<T> arraySetOf(@NotNull T... values) {
        Intrinsics.m17072i(values, "values");
        ArraySet<T> arraySet = new ArraySet<>(values.length);
        for (T t : values) {
            arraySet.add(t);
        }
        return arraySet;
    }
}
