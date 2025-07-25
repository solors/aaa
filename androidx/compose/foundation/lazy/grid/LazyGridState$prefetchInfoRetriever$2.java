package androidx.compose.foundation.lazy.grid;

import androidx.compose.p015ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridState.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyGridState$prefetchInfoRetriever$2 extends Lambda implements Function1<LineIndex, List<? extends Tuples<? extends Integer, ? extends Constraints>>> {
    public static final LazyGridState$prefetchInfoRetriever$2 INSTANCE = new LazyGridState$prefetchInfoRetriever$2();

    LazyGridState$prefetchInfoRetriever$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ List<? extends Tuples<? extends Integer, ? extends Constraints>> invoke(LineIndex lineIndex) {
        return m106507invokebKFJvoY(lineIndex.m106526unboximpl());
    }

    @NotNull
    /* renamed from: invoke-bKFJvoY  reason: not valid java name */
    public final List<Tuples<Integer, Constraints>> m106507invokebKFJvoY(int i) {
        List<Tuples<Integer, Constraints>> m17166m;
        m17166m = C37563v.m17166m();
        return m17166m;
    }
}
