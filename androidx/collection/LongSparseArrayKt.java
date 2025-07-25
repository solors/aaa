package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC37552l0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LongSparseArray.kt */
@Metadata
/* loaded from: classes.dex */
public final class LongSparseArrayKt {
    public static final <T> boolean contains(@NotNull LongSparseArray<T> receiver$0, long j) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return receiver$0.containsKey(j);
    }

    public static final <T> void forEach(@NotNull LongSparseArray<T> receiver$0, @NotNull Function2<? super Long, ? super T, Unit> action) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        Intrinsics.m17072i(action, "action");
        int size = receiver$0.size();
        for (int i = 0; i < size; i++) {
            action.mo105910invoke(Long.valueOf(receiver$0.keyAt(i)), receiver$0.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(@NotNull LongSparseArray<T> receiver$0, long j, T t) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return receiver$0.get(j, t);
    }

    public static final <T> T getOrElse(@NotNull LongSparseArray<T> receiver$0, long j, @NotNull Functions<? extends T> defaultValue) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        Intrinsics.m17072i(defaultValue, "defaultValue");
        T t = receiver$0.get(j);
        if (t == null) {
            return defaultValue.invoke();
        }
        return t;
    }

    public static final <T> int getSize(@NotNull LongSparseArray<T> receiver$0) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return receiver$0.size();
    }

    public static final <T> boolean isNotEmpty(@NotNull LongSparseArray<T> receiver$0) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return !receiver$0.isEmpty();
    }

    @NotNull
    public static final <T> AbstractC37552l0 keyIterator(@NotNull final LongSparseArray<T> receiver$0) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return new AbstractC37552l0() { // from class: androidx.collection.LongSparseArrayKt$keyIterator$1
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

            @Override // kotlin.collections.AbstractC37552l0
            public long nextLong() {
                LongSparseArray longSparseArray = receiver$0;
                int i = this.index;
                this.index = i + 1;
                return longSparseArray.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    @NotNull
    public static final <T> LongSparseArray<T> plus(@NotNull LongSparseArray<T> receiver$0, @NotNull LongSparseArray<T> other) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        Intrinsics.m17072i(other, "other");
        LongSparseArray<T> longSparseArray = new LongSparseArray<>(receiver$0.size() + other.size());
        longSparseArray.putAll(receiver$0);
        longSparseArray.putAll(other);
        return longSparseArray;
    }

    public static final <T> boolean remove(@NotNull LongSparseArray<T> receiver$0, long j, T t) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return receiver$0.remove(j, t);
    }

    public static final <T> void set(@NotNull LongSparseArray<T> receiver$0, long j, T t) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        receiver$0.put(j, t);
    }

    @NotNull
    public static final <T> Iterator<T> valueIterator(@NotNull LongSparseArray<T> receiver$0) {
        Intrinsics.m17072i(receiver$0, "receiver$0");
        return new LongSparseArrayKt$valueIterator$1(receiver$0);
    }
}
