package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p820od.SetBuilder;

@Metadata
/* renamed from: kotlin.collections.y0 */
/* loaded from: classes7.dex */
public class SetsJVM {
    @NotNull
    /* renamed from: a */
    public static <E> Set<E> m17130a(@NotNull Set<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((SetBuilder) builder).m13757c();
    }

    @NotNull
    /* renamed from: b */
    public static <E> Set<E> m17129b() {
        return new SetBuilder();
    }

    @NotNull
    /* renamed from: c */
    public static <E> Set<E> m17128c(int i) {
        return new SetBuilder(i);
    }

    @NotNull
    /* renamed from: d */
    public static <T> Set<T> m17127d(T t) {
        Set<T> singleton = Collections.singleton(t);
        Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
        return singleton;
    }

    @NotNull
    /* renamed from: e */
    public static <T> TreeSet<T> m17126e(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (TreeSet) _Arrays.m17300z0(elements, new TreeSet());
    }
}
