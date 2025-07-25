package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.collections.b0 */
/* loaded from: classes7.dex */
public class ReversedViews extends MutableCollections {
    @NotNull
    /* renamed from: X */
    public static <T> List<T> m17597X(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new C37564v0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final int m17596Y(List<?> list, int i) {
        int m17164o;
        int m17164o2;
        int m17164o3;
        m17164o = C37563v.m17164o(list);
        if (new PrimitiveRanges(0, m17164o).m16968i(i)) {
            m17164o3 = C37563v.m17164o(list);
            return m17164o3 - i;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Element index ");
        sb2.append(i);
        sb2.append(" must be in range [");
        m17164o2 = C37563v.m17164o(list);
        sb2.append(new PrimitiveRanges(0, m17164o2));
        sb2.append("].");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final int m17595Z(List<?> list, int i) {
        int m17164o;
        m17164o = C37563v.m17164o(list);
        return m17164o - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final int m17594a0(List<?> list, int i) {
        if (new PrimitiveRanges(0, list.size()).m16968i(i)) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new PrimitiveRanges(0, list.size()) + "].");
    }
}
