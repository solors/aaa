package androidx.compose.foundation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.foundation.TempListUtilsKt */
/* loaded from: classes.dex */
public final class TempListUtils {
    @NotNull
    public static final <T> List<T> fastFilter(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = (T) list.get(i);
            if (predicate.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(@NotNull List<? extends T> list, R r, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r = operation.mo105910invoke(r, (T) list.get(i));
        }
        return r;
    }

    @NotNull
    public static final <T, R> List<R> fastMapIndexedNotNull(@NotNull List<? extends T> list, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            R mo105910invoke = transform.mo105910invoke(Integer.valueOf(i), (T) list.get(i));
            if (mo105910invoke != null) {
                arrayList.add(mo105910invoke);
            }
        }
        return arrayList;
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> selector) {
        int m17164o;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.isEmpty()) {
            return null;
        }
        R invoke = selector.invoke((T) list.get(0));
        m17164o = C37563v.m17164o(list);
        int i = 1;
        if (1 <= m17164o) {
            while (true) {
                R invoke2 = selector.invoke((T) list.get(i));
                if (invoke2.compareTo(invoke) > 0) {
                    invoke = invoke2;
                }
                if (i == m17164o) {
                    break;
                }
                i++;
            }
        }
        return invoke;
    }
}
