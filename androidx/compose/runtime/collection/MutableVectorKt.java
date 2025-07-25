package androidx.compose.runtime.collection;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MutableVector.kt */
@Metadata
/* loaded from: classes.dex */
public final class MutableVectorKt {
    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i) {
        Intrinsics.m17067n(0, "T?");
        return new MutableVector<>(new Object[i], 0);
    }

    public static /* synthetic */ MutableVector MutableVector$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 16;
        }
        Intrinsics.m17067n(0, "T?");
        return new MutableVector(new Object[i], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i) {
        int size = list.size();
        if (i >= 0 && i < size) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i, int i2) {
        int size = list.size();
        if (i <= i2) {
            if (i >= 0) {
                if (i2 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        }
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new MutableVector<>(elements, elements.length);
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i, Function1<? super Integer, ? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        Intrinsics.m17067n(0, "T");
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = init.invoke(Integer.valueOf(i2));
        }
        return new MutableVector<>(objArr, i);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf() {
        Intrinsics.m17067n(0, "T?");
        return new MutableVector<>(new Object[16], 0);
    }
}
