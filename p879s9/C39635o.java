package p879s9;

import androidx.collection.SparseArrayCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SparseArrays.kt */
@Metadata
/* renamed from: s9.o */
/* loaded from: classes8.dex */
public final class C39635o {
    @NotNull
    /* renamed from: a */
    public static final <T> Iterable<T> m12024a(@NotNull SparseArrayCompat<T> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return new SparseArrays(sparseArrayCompat);
    }
}
