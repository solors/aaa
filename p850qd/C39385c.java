package p850qd;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Comparisons.kt */
@Metadata
/* renamed from: qd.c */
/* loaded from: classes7.dex */
public class C39385c {
    /* renamed from: a */
    public static /* synthetic */ int m12781a(Function1[] function1Arr, Object obj, Object obj2) {
        return m12779c(function1Arr, obj, obj2);
    }

    @NotNull
    /* renamed from: b */
    public static <T> Comparator<T> m12780b(@NotNull final Function1<? super T, ? extends Comparable<?>>... selectors) {
        boolean z;
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Comparator() { // from class: qd.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C39385c.m12781a(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: c */
    public static final int m12779c(Function1[] selectors, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(selectors, "$selectors");
        return m12776f(obj, obj2, selectors);
    }

    /* renamed from: d */
    public static <T extends Comparable<?>> int m12778d(@Nullable T t, @Nullable T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* renamed from: e */
    public static <T> int m12777e(T t, T t2, @NotNull Function1<? super T, ? extends Comparable<?>>... selectors) {
        boolean z;
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m12776f(t, t2, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: f */
    private static final <T> int m12776f(T t, T t2, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        int m12778d;
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            m12778d = m12778d(function1.invoke(t), function1.invoke(t2));
            if (m12778d != 0) {
                return m12778d;
            }
        }
        return 0;
    }

    @NotNull
    /* renamed from: g */
    public static <T extends Comparable<? super T>> Comparator<T> m12775g() {
        C39386f c39386f = C39386f.f103593b;
        Intrinsics.m17073h(c39386f, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return c39386f;
    }
}
