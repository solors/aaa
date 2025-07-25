package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: AmbiguousColumnResolver.kt */
@Metadata
/* loaded from: classes2.dex */
final class AmbiguousColumnResolver$resolve$1$1 extends Lambda implements InterfaceC45268n<Integer, Integer, List<? extends AmbiguousColumnResolver.ResultColumn>, Unit> {
    final /* synthetic */ String[] $mapping;
    final /* synthetic */ int $mappingIndex;
    final /* synthetic */ List<List<AmbiguousColumnResolver.Match>> $mappingMatches;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AmbiguousColumnResolver$resolve$1$1(String[] strArr, List<? extends List<AmbiguousColumnResolver.Match>> list, int i) {
        super(3);
        this.$mapping = strArr;
        this.$mappingMatches = list;
        this.$mappingIndex = i;
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, List<? extends AmbiguousColumnResolver.ResultColumn> list) {
        invoke(num.intValue(), num2.intValue(), (List<AmbiguousColumnResolver.ResultColumn>) list);
        return Unit.f99208a;
    }

    public final void invoke(int i, int i2, @NotNull List<AmbiguousColumnResolver.ResultColumn> resultColumnsSublist) {
        Object obj;
        Intrinsics.checkNotNullParameter(resultColumnsSublist, "resultColumnsSublist");
        String[] strArr = this.$mapping;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Iterator<T> it = resultColumnsSublist.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.m17075f(str, ((AmbiguousColumnResolver.ResultColumn) obj).component1())) {
                    break;
                }
            }
            AmbiguousColumnResolver.ResultColumn resultColumn = (AmbiguousColumnResolver.ResultColumn) obj;
            if (resultColumn == null) {
                return;
            }
            arrayList.add(Integer.valueOf(resultColumn.getIndex()));
        }
        this.$mappingMatches.get(this.$mappingIndex).add(new AmbiguousColumnResolver.Match(new PrimitiveRanges(i, i2 - 1), arrayList));
    }
}
