package androidx.compose.p015ui.text.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TempListUtils.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.TempListUtilsKt */
/* loaded from: classes.dex */
public final class TempListUtilsKt {
    public static final <T> void fastForEach(@NotNull List<? extends T> list, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            action.invoke((T) list.get(i));
        }
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C fastMapTo(@NotNull List<? extends T> list, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            destination.add(transform.invoke((T) list.get(i)));
        }
        return destination;
    }

    @NotNull
    public static final <T, R> List<R> fastZipWithNext(@NotNull List<? extends T> list, @NotNull Function2<? super T, ? super T, ? extends R> transform) {
        List<R> m17166m;
        int m17164o;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (list.size() == 0 || list.size() == 1) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        T t = list.get(0);
        m17164o = C37563v.m17164o(list);
        while (i < m17164o) {
            i++;
            T t2 = list.get(i);
            arrayList.add(transform.mo105910invoke(t, t2));
            t = (Object) t2;
        }
        return arrayList;
    }
}
