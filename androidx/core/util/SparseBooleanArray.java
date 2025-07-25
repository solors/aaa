package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC37558r;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.util.SparseBooleanArrayKt */
/* loaded from: classes.dex */
public final class SparseBooleanArray {
    public static final boolean contains(@NotNull android.util.SparseBooleanArray sparseBooleanArray, int i) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsKey(@NotNull android.util.SparseBooleanArray sparseBooleanArray, int i) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsValue(@NotNull android.util.SparseBooleanArray sparseBooleanArray, boolean z) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.indexOfValue(z) >= 0) {
            return true;
        }
        return false;
    }

    public static final void forEach(@NotNull android.util.SparseBooleanArray sparseBooleanArray, @NotNull Function2<? super Integer, ? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            action.mo105910invoke(Integer.valueOf(sparseBooleanArray.keyAt(i)), Boolean.valueOf(sparseBooleanArray.valueAt(i)));
        }
    }

    public static final boolean getOrDefault(@NotNull android.util.SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        return sparseBooleanArray.get(i, z);
    }

    public static final boolean getOrElse(@NotNull android.util.SparseBooleanArray sparseBooleanArray, int i, @NotNull Functions<Boolean> defaultValue) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseBooleanArray.valueAt(indexOfKey);
        }
        return defaultValue.invoke().booleanValue();
    }

    public static final int getSize(@NotNull android.util.SparseBooleanArray sparseBooleanArray) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size();
    }

    public static final boolean isEmpty(@NotNull android.util.SparseBooleanArray sparseBooleanArray) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(@NotNull android.util.SparseBooleanArray sparseBooleanArray) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.size() != 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final PrimitiveIterators keyIterator(@NotNull final android.util.SparseBooleanArray sparseBooleanArray) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        return new PrimitiveIterators() { // from class: androidx.core.util.SparseBooleanArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseBooleanArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // kotlin.collections.PrimitiveIterators
            public int nextInt() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i = this.index;
                this.index = i + 1;
                return sparseBooleanArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    @NotNull
    public static final android.util.SparseBooleanArray plus(@NotNull android.util.SparseBooleanArray sparseBooleanArray, @NotNull android.util.SparseBooleanArray other) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        android.util.SparseBooleanArray sparseBooleanArray2 = new android.util.SparseBooleanArray(sparseBooleanArray.size() + other.size());
        putAll(sparseBooleanArray2, sparseBooleanArray);
        putAll(sparseBooleanArray2, other);
        return sparseBooleanArray2;
    }

    public static final void putAll(@NotNull android.util.SparseBooleanArray sparseBooleanArray, @NotNull android.util.SparseBooleanArray other) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            sparseBooleanArray.put(other.keyAt(i), other.valueAt(i));
        }
    }

    public static final boolean remove(@NotNull android.util.SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey >= 0 && z == sparseBooleanArray.valueAt(indexOfKey)) {
            sparseBooleanArray.delete(i);
            return true;
        }
        return false;
    }

    public static final void set(@NotNull android.util.SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        sparseBooleanArray.put(i, z);
    }

    @NotNull
    public static final AbstractC37558r valueIterator(@NotNull final android.util.SparseBooleanArray sparseBooleanArray) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        return new AbstractC37558r() { // from class: androidx.core.util.SparseBooleanArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseBooleanArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // kotlin.collections.AbstractC37558r
            public boolean nextBoolean() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i = this.index;
                this.index = i + 1;
                return sparseBooleanArray2.valueAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }
}
