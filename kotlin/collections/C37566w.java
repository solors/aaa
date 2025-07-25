package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Iterables.kt */
@Metadata
/* renamed from: kotlin.collections.w */
/* loaded from: classes7.dex */
public class C37566w extends C37563v {
    /* renamed from: x */
    public static <T> int m17154x(@NotNull Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    @Nullable
    /* renamed from: y */
    public static final <T> Integer m17153y(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @NotNull
    /* renamed from: z */
    public static <T> List<T> m17152z(@NotNull Iterable<? extends Iterable<? extends T>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable<? extends T> iterable2 : iterable) {
            MutableCollections.m17624D(arrayList, iterable2);
        }
        return arrayList;
    }
}
