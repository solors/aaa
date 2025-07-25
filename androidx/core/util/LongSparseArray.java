package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.LongSparseArray;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC37552l0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.util.LongSparseArrayKt */
/* loaded from: classes.dex */
public final class LongSparseArray {
    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean contains(@NotNull android.util.LongSparseArray<T> longSparseArray, long j) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean containsKey(@NotNull android.util.LongSparseArray<T> longSparseArray, long j) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean containsValue(@NotNull android.util.LongSparseArray<T> longSparseArray, T t) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.indexOfValue(t) >= 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> void forEach(@NotNull android.util.LongSparseArray<T> longSparseArray, @NotNull Function2<? super Long, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            action.mo105910invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> T getOrDefault(@NotNull android.util.LongSparseArray<T> longSparseArray, long j, T t) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        T t2 = longSparseArray.get(j);
        if (t2 != null) {
            return t2;
        }
        return t;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> T getOrElse(@NotNull android.util.LongSparseArray<T> longSparseArray, long j, @NotNull Functions<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = longSparseArray.get(j);
        if (t == null) {
            return defaultValue.invoke();
        }
        return t;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> int getSize(@NotNull android.util.LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean isEmpty(@NotNull android.util.LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean isNotEmpty(@NotNull android.util.LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(16)
    @NotNull
    public static final <T> AbstractC37552l0 keyIterator(@NotNull final android.util.LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return new AbstractC37552l0() { // from class: androidx.core.util.LongSparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            @SuppressLint({"ClassVerificationFailure"})
            public boolean hasNext() {
                if (this.index < longSparseArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // kotlin.collections.AbstractC37552l0
            @SuppressLint({"ClassVerificationFailure"})
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i = this.index;
                this.index = i + 1;
                return longSparseArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final <T> android.util.LongSparseArray<T> plus(@NotNull android.util.LongSparseArray<T> longSparseArray, @NotNull android.util.LongSparseArray<T> other) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        android.util.LongSparseArray<T> longSparseArray2 = new android.util.LongSparseArray<>(longSparseArray.size() + other.size());
        putAll(longSparseArray2, longSparseArray);
        putAll(longSparseArray2, other);
        return longSparseArray2;
    }

    @RequiresApi(16)
    public static final <T> void putAll(@NotNull android.util.LongSparseArray<T> longSparseArray, @NotNull android.util.LongSparseArray<T> other) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(other.keyAt(i), other.valueAt(i));
        }
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean remove(@NotNull android.util.LongSparseArray<T> longSparseArray, long j, T t) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey >= 0 && Intrinsics.m17075f(t, longSparseArray.valueAt(indexOfKey))) {
            longSparseArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> void set(@NotNull android.util.LongSparseArray<T> longSparseArray, long j, T t) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        longSparseArray.put(j, t);
    }

    @RequiresApi(16)
    @NotNull
    public static final <T> Iterator<T> valueIterator(@NotNull android.util.LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }
}
