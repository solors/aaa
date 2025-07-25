package kotlin.collections;

import java.lang.reflect.Array;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.collections.m */
/* loaded from: classes7.dex */
class ArraysJVM {
    @NotNull
    /* renamed from: a */
    public static final <T> T[] m17418a(@NotNull T[] reference, int i) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i);
        Intrinsics.m17073h(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    /* renamed from: b */
    public static final void m17417b(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }
}
