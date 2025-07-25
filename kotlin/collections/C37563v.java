package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p850qd.C39385c;

/* compiled from: Collections.kt */
@Metadata
/* renamed from: kotlin.collections.v */
/* loaded from: classes7.dex */
public class C37563v extends CollectionsJVM {
    @NotNull
    /* renamed from: g */
    public static <T> ArrayList<T> m17172g(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C37548j(elements, true));
    }

    @NotNull
    /* renamed from: h */
    public static final <T> Collection<T> m17171h(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new C37548j(tArr, false);
    }

    /* renamed from: i */
    public static final <T> int m17170i(@NotNull List<? extends T> list, int i, int i2, @NotNull Function1<? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        m17158u(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = comparison.invoke((T) list.get(i4)).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else if (intValue > 0) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i + 1);
    }

    /* renamed from: j */
    public static final <T extends Comparable<? super T>> int m17169j(@NotNull List<? extends T> list, @Nullable T t, int i, int i2) {
        int m12778d;
        Intrinsics.checkNotNullParameter(list, "<this>");
        m17158u(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            m12778d = C39385c.m12778d(list.get(i4), t);
            if (m12778d < 0) {
                i = i4 + 1;
            } else if (m12778d > 0) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i + 1);
    }

    /* renamed from: k */
    public static /* synthetic */ int m17168k(List list, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return m17170i(list, i, i2, function1);
    }

    /* renamed from: l */
    public static /* synthetic */ int m17167l(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m17169j(list, comparable, i, i2);
    }

    @NotNull
    /* renamed from: m */
    public static <T> List<T> m17166m() {
        return C37546f0.f99246b;
    }

    @NotNull
    /* renamed from: n */
    public static PrimitiveRanges m17165n(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new PrimitiveRanges(0, collection.size() - 1);
    }

    /* renamed from: o */
    public static <T> int m17164o(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    @NotNull
    /* renamed from: p */
    public static <T> List<T> m17163p(@NotNull T... elements) {
        List<T> m17166m;
        List<T> m17399f;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length > 0) {
            m17399f = _ArraysJvm.m17399f(elements);
            return m17399f;
        }
        m17166m = m17166m();
        return m17166m;
    }

    @NotNull
    /* renamed from: q */
    public static <T> List<T> m17162q(@Nullable T t) {
        List<T> m17166m;
        List<T> m17175e;
        if (t != null) {
            m17175e = CollectionsJVM.m17175e(t);
            return m17175e;
        }
        m17166m = m17166m();
        return m17166m;
    }

    @NotNull
    /* renamed from: r */
    public static <T> List<T> m17161r(@NotNull T... elements) {
        List<T> m17335Q;
        Intrinsics.checkNotNullParameter(elements, "elements");
        m17335Q = _Arrays.m17335Q(elements);
        return m17335Q;
    }

    @NotNull
    /* renamed from: s */
    public static <T> List<T> m17160s(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C37548j(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: t */
    public static final <T> List<T> m17159t(@NotNull List<? extends T> list) {
        List<T> m17166m;
        List<T> m17175e;
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            m17166m = m17166m();
            return m17166m;
        } else if (size == 1) {
            m17175e = CollectionsJVM.m17175e(list.get(0));
            return m17175e;
        } else {
            return list;
        }
    }

    /* renamed from: u */
    private static final void m17158u(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 >= 0) {
                if (i3 <= i) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
    }

    /* renamed from: v */
    public static void m17157v() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: w */
    public static void m17156w() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
