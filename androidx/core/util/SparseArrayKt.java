package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SparseArray.kt */
@Metadata
/* loaded from: classes.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(@NotNull SparseArray<T> sparseArray, int i) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        if (sparseArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsKey(@NotNull SparseArray<T> sparseArray, int i) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        if (sparseArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsValue(@NotNull SparseArray<T> sparseArray, T t) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        if (sparseArray.indexOfValue(t) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> void forEach(@NotNull SparseArray<T> sparseArray, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            action.mo105910invoke(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(@NotNull SparseArray<T> sparseArray, int i, T t) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        T t2 = sparseArray.get(i);
        if (t2 != null) {
            return t2;
        }
        return t;
    }

    public static final <T> T getOrElse(@NotNull SparseArray<T> sparseArray, int i, @NotNull Functions<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = sparseArray.get(i);
        if (t == null) {
            return defaultValue.invoke();
        }
        return t;
    }

    public static final <T> int getSize(@NotNull SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(@NotNull SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        if (sparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean isNotEmpty(@NotNull SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        if (sparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final <T> PrimitiveIterators keyIterator(@NotNull final SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return new PrimitiveIterators() { // from class: androidx.core.util.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // kotlin.collections.PrimitiveIterators
            public int nextInt() {
                SparseArray<T> sparseArray2 = sparseArray;
                int i = this.index;
                this.index = i + 1;
                return sparseArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    @NotNull
    public static final <T> SparseArray<T> plus(@NotNull SparseArray<T> sparseArray, @NotNull SparseArray<T> other) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size() + other.size());
        putAll(sparseArray2, sparseArray);
        putAll(sparseArray2, other);
        return sparseArray2;
    }

    public static final <T> void putAll(@NotNull SparseArray<T> sparseArray, @NotNull SparseArray<T> other) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(other.keyAt(i), other.valueAt(i));
        }
    }

    public static final <T> boolean remove(@NotNull SparseArray<T> sparseArray, int i, T t) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i);
        if (indexOfKey >= 0 && Intrinsics.m17075f(t, sparseArray.valueAt(indexOfKey))) {
            sparseArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final <T> void set(@NotNull SparseArray<T> sparseArray, int i, T t) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        sparseArray.put(i, t);
    }

    @NotNull
    public static final <T> Iterator<T> valueIterator(@NotNull SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return new SparseArrayKt$valueIterator$1(sparseArray);
    }
}
