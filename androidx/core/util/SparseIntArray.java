package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.util.SparseIntArrayKt */
/* loaded from: classes.dex */
public final class SparseIntArray {
    public static final boolean contains(@NotNull android.util.SparseIntArray sparseIntArray, int i) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsKey(@NotNull android.util.SparseIntArray sparseIntArray, int i) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsValue(@NotNull android.util.SparseIntArray sparseIntArray, int i) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        if (sparseIntArray.indexOfValue(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final void forEach(@NotNull android.util.SparseIntArray sparseIntArray, @NotNull Function2<? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            action.mo105910invoke(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i)));
        }
    }

    public static final int getOrDefault(@NotNull android.util.SparseIntArray sparseIntArray, int i, int i2) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return sparseIntArray.get(i, i2);
    }

    public static final int getOrElse(@NotNull android.util.SparseIntArray sparseIntArray, int i, @NotNull Functions<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return defaultValue.invoke().intValue();
    }

    public static final int getSize(@NotNull android.util.SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(@NotNull android.util.SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        if (sparseIntArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(@NotNull android.util.SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        if (sparseIntArray.size() != 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final PrimitiveIterators keyIterator(@NotNull final android.util.SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return new PrimitiveIterators() { // from class: androidx.core.util.SparseIntArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseIntArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // kotlin.collections.PrimitiveIterators
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i = this.index;
                this.index = i + 1;
                return sparseIntArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    @NotNull
    public static final android.util.SparseIntArray plus(@NotNull android.util.SparseIntArray sparseIntArray, @NotNull android.util.SparseIntArray other) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        android.util.SparseIntArray sparseIntArray2 = new android.util.SparseIntArray(sparseIntArray.size() + other.size());
        putAll(sparseIntArray2, sparseIntArray);
        putAll(sparseIntArray2, other);
        return sparseIntArray2;
    }

    public static final void putAll(@NotNull android.util.SparseIntArray sparseIntArray, @NotNull android.util.SparseIntArray other) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(other.keyAt(i), other.valueAt(i));
        }
    }

    public static final boolean remove(@NotNull android.util.SparseIntArray sparseIntArray, int i, int i2) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0 && i2 == sparseIntArray.valueAt(indexOfKey)) {
            sparseIntArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final void set(@NotNull android.util.SparseIntArray sparseIntArray, int i, int i2) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        sparseIntArray.put(i, i2);
    }

    @NotNull
    public static final PrimitiveIterators valueIterator(@NotNull final android.util.SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return new PrimitiveIterators() { // from class: androidx.core.util.SparseIntArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseIntArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // kotlin.collections.PrimitiveIterators
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i = this.index;
                this.index = i + 1;
                return sparseIntArray2.valueAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }
}
