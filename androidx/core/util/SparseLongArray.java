package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.SparseLongArray;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC37552l0;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.util.SparseLongArrayKt */
/* loaded from: classes.dex */
public final class SparseLongArray {
    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean contains(@NotNull android.util.SparseLongArray sparseLongArray, int i) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        if (sparseLongArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean containsKey(@NotNull android.util.SparseLongArray sparseLongArray, int i) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        if (sparseLongArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean containsValue(@NotNull android.util.SparseLongArray sparseLongArray, long j) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        if (sparseLongArray.indexOfValue(j) >= 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void forEach(@NotNull android.util.SparseLongArray sparseLongArray, @NotNull Function2<? super Integer, ? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            action.mo105910invoke(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
        }
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long getOrDefault(@NotNull android.util.SparseLongArray sparseLongArray, int i, long j) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        return sparseLongArray.get(i, j);
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long getOrElse(@NotNull android.util.SparseLongArray sparseLongArray, int i, @NotNull Functions<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseLongArray.valueAt(indexOfKey);
        }
        return defaultValue.invoke().longValue();
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final int getSize(@NotNull android.util.SparseLongArray sparseLongArray) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean isEmpty(@NotNull android.util.SparseLongArray sparseLongArray) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        if (sparseLongArray.size() == 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean isNotEmpty(@NotNull android.util.SparseLongArray sparseLongArray) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        if (sparseLongArray.size() != 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final PrimitiveIterators keyIterator(@NotNull final android.util.SparseLongArray sparseLongArray) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        return new PrimitiveIterators() { // from class: androidx.core.util.SparseLongArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseLongArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // kotlin.collections.PrimitiveIterators
            public int nextInt() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i = this.index;
                this.index = i + 1;
                return sparseLongArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final android.util.SparseLongArray plus(@NotNull android.util.SparseLongArray sparseLongArray, @NotNull android.util.SparseLongArray other) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        android.util.SparseLongArray sparseLongArray2 = new android.util.SparseLongArray(sparseLongArray.size() + other.size());
        putAll(sparseLongArray2, sparseLongArray);
        putAll(sparseLongArray2, other);
        return sparseLongArray2;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void putAll(@NotNull android.util.SparseLongArray sparseLongArray, @NotNull android.util.SparseLongArray other) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray.put(other.keyAt(i), other.valueAt(i));
        }
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean remove(@NotNull android.util.SparseLongArray sparseLongArray, int i, long j) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey >= 0 && j == sparseLongArray.valueAt(indexOfKey)) {
            sparseLongArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void set(@NotNull android.util.SparseLongArray sparseLongArray, int i, long j) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        sparseLongArray.put(i, j);
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final AbstractC37552l0 valueIterator(@NotNull final android.util.SparseLongArray sparseLongArray) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        return new AbstractC37552l0() { // from class: androidx.core.util.SparseLongArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseLongArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // kotlin.collections.AbstractC37552l0
            public long nextLong() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i = this.index;
                this.index = i + 1;
                return sparseLongArray2.valueAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }
}
