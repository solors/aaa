package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p820od.ListBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.collections.u */
/* loaded from: classes7.dex */
public class CollectionsJVM {
    @NotNull
    /* renamed from: a */
    public static <E> List<E> m17179a(@NotNull List<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((ListBuilder) builder).m13837h();
    }

    @NotNull
    /* renamed from: b */
    public static final <T> Object[] m17178b(@NotNull T[] tArr, boolean z) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (!z || !Intrinsics.m17075f(tArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            return copyOf;
        }
        return tArr;
    }

    @NotNull
    /* renamed from: c */
    public static <E> List<E> m17177c() {
        return new ListBuilder();
    }

    @NotNull
    /* renamed from: d */
    public static <E> List<E> m17176d(int i) {
        return new ListBuilder(i);
    }

    @NotNull
    /* renamed from: e */
    public static <T> List<T> m17175e(T t) {
        List<T> singletonList = Collections.singletonList(t);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
        return singletonList;
    }

    @NotNull
    /* renamed from: f */
    public static <T> T[] m17174f(int i, @NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i < array.length) {
            array[i] = null;
        }
        return array;
    }
}
