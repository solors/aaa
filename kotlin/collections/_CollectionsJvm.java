package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.collections.c0 */
/* loaded from: classes7.dex */
public class _CollectionsJvm extends ReversedViews {
    @NotNull
    /* renamed from: b0 */
    public static <R> List<R> m17582b0(@NotNull Iterable<?> iterable, @NotNull Class<R> klass) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (List) m17581c0(iterable, new ArrayList(), klass);
    }

    @NotNull
    /* renamed from: c0 */
    public static final <C extends Collection<? super R>, R> C m17581c0(@NotNull Iterable<?> iterable, @NotNull C destination, @NotNull Class<R> klass) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        for (Object obj : iterable) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* renamed from: d0 */
    public static <T> void m17580d0(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Collections.reverse(list);
    }
}
