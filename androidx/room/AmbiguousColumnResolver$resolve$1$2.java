package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;

/* compiled from: AmbiguousColumnResolver.kt */
@Metadata
/* loaded from: classes2.dex */
final class AmbiguousColumnResolver$resolve$1$2 extends Lambda implements Function1<List<? extends Integer>, Unit> {
    final /* synthetic */ int $mappingIndex;
    final /* synthetic */ List<List<AmbiguousColumnResolver.Match>> $mappingMatches;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AmbiguousColumnResolver$resolve$1$2(List<? extends List<AmbiguousColumnResolver.Match>> list, int i) {
        super(1);
        this.$mappingMatches = list;
        this.$mappingIndex = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Integer> list) {
        invoke2((List<Integer>) list);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull List<Integer> indices) {
        Intrinsics.checkNotNullParameter(indices, "indices");
        List<Integer> list = indices;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            while (it.hasNext()) {
                int intValue2 = ((Number) it.next()).intValue();
                if (intValue > intValue2) {
                    intValue = intValue2;
                }
            }
            Iterator<T> it2 = list.iterator();
            if (it2.hasNext()) {
                int intValue3 = ((Number) it2.next()).intValue();
                while (it2.hasNext()) {
                    int intValue4 = ((Number) it2.next()).intValue();
                    if (intValue3 < intValue4) {
                        intValue3 = intValue4;
                    }
                }
                this.$mappingMatches.get(this.$mappingIndex).add(new AmbiguousColumnResolver.Match(new PrimitiveRanges(intValue, intValue3), indices));
                return;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }
}
