package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.collection.SparseArrayKt */
/* loaded from: classes.dex */
public final class SparseArray {
    public static final <T> boolean contains(@NotNull SparseArrayCompat<T> receiver$0, int i) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return receiver$0.containsKey(i);
    }

    public static final <T> void forEach(@NotNull SparseArrayCompat<T> receiver$0, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        Intrinsics.m17072i(action, "action");
        int size = receiver$0.size();
        for (int i = 0; i < size; i++) {
            action.mo105910invoke(Integer.valueOf(receiver$0.keyAt(i)), receiver$0.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(@NotNull SparseArrayCompat<T> receiver$0, int i, T t) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return receiver$0.get(i, t);
    }

    public static final <T> T getOrElse(@NotNull SparseArrayCompat<T> receiver$0, int i, @NotNull Functions<? extends T> defaultValue) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        Intrinsics.m17072i(defaultValue, "defaultValue");
        T t = receiver$0.get(i);
        if (t == null) {
            return defaultValue.invoke();
        }
        return t;
    }

    public static final <T> int getSize(@NotNull SparseArrayCompat<T> receiver$0) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return receiver$0.size();
    }

    public static final <T> boolean isNotEmpty(@NotNull SparseArrayCompat<T> receiver$0) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return !receiver$0.isEmpty();
    }

    @NotNull
    public static final <T> PrimitiveIterators keyIterator(@NotNull final SparseArrayCompat<T> receiver$0) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return new PrimitiveIterators() { // from class: androidx.collection.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < receiver$0.size()) {
                    return true;
                }
                return false;
            }

            @Override // kotlin.collections.PrimitiveIterators
            public int nextInt() {
                SparseArrayCompat sparseArrayCompat = receiver$0;
                int i = this.index;
                this.index = i + 1;
                return sparseArrayCompat.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    @NotNull
    public static final <T> SparseArrayCompat<T> plus(@NotNull SparseArrayCompat<T> receiver$0, @NotNull SparseArrayCompat<T> other) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        Intrinsics.m17072i(other, "other");
        SparseArrayCompat<T> sparseArrayCompat = new SparseArrayCompat<>(receiver$0.size() + other.size());
        sparseArrayCompat.putAll(receiver$0);
        sparseArrayCompat.putAll(other);
        return sparseArrayCompat;
    }

    public static final <T> boolean remove(@NotNull SparseArrayCompat<T> receiver$0, int i, T t) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return receiver$0.remove(i, t);
    }

    public static final <T> void set(@NotNull SparseArrayCompat<T> receiver$0, int i, T t) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        receiver$0.put(i, t);
    }

    @NotNull
    public static final <T> Iterator<T> valueIterator(@NotNull SparseArrayCompat<T> receiver$0) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return new SparseArrayKt$valueIterator$1(receiver$0);
    }
}
