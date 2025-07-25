package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.p015ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyMeasuredLineProvider.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyMeasuredLineProvider {
    @NotNull
    private final Function2<Integer, Integer, Constraints> childConstraints;
    private final int gridItemsCount;
    private final boolean isVertical;
    @NotNull
    private final LazyMeasuredItemProvider measuredItemProvider;
    @NotNull
    private final MeasuredLineFactory measuredLineFactory;
    private final int spaceBetweenLines;
    @NotNull
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyMeasuredLineProvider(boolean z, @NotNull List<Integer> slotSizesSums, int i, int i2, int i3, @NotNull LazyMeasuredItemProvider measuredItemProvider, @NotNull LazyGridSpanLayoutProvider spanLayoutProvider, @NotNull MeasuredLineFactory measuredLineFactory) {
        Intrinsics.checkNotNullParameter(slotSizesSums, "slotSizesSums");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        Intrinsics.checkNotNullParameter(measuredLineFactory, "measuredLineFactory");
        this.isVertical = z;
        this.gridItemsCount = i2;
        this.spaceBetweenLines = i3;
        this.measuredItemProvider = measuredItemProvider;
        this.spanLayoutProvider = spanLayoutProvider;
        this.measuredLineFactory = measuredLineFactory;
        this.childConstraints = new LazyMeasuredLineProvider$childConstraints$1(slotSizesSums, i, this);
    }

    @NotNull
    /* renamed from: getAndMeasure-bKFJvoY  reason: not valid java name */
    public final LazyMeasuredLine m106512getAndMeasurebKFJvoY(int i) {
        int i2;
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(i);
        int size = lineConfiguration.getSpans().size();
        if (size != 0 && lineConfiguration.getFirstItemIndex() + size != this.gridItemsCount) {
            i2 = this.spaceBetweenLines;
        } else {
            i2 = 0;
        }
        LazyMeasuredItem[] lazyMeasuredItemArr = new LazyMeasuredItem[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int m106458getCurrentLineSpanimpl = LazyGridSpan.m106458getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i4).m106461unboximpl());
            LazyMeasuredItem m106510getAndMeasureednRnyU = this.measuredItemProvider.m106510getAndMeasureednRnyU(ItemIndex.m106464constructorimpl(lineConfiguration.getFirstItemIndex() + i4), i2, this.childConstraints.mo105910invoke(Integer.valueOf(i3), Integer.valueOf(m106458getCurrentLineSpanimpl)).m109696unboximpl());
            i3 += m106458getCurrentLineSpanimpl;
            Unit unit = Unit.f99208a;
            lazyMeasuredItemArr[i4] = m106510getAndMeasureednRnyU;
        }
        return this.measuredLineFactory.mo106493createLineH9FfpSk(i, lazyMeasuredItemArr, lineConfiguration.getSpans(), i2);
    }

    @NotNull
    public final Function2<Integer, Integer, Constraints> getChildConstraints$foundation_release() {
        return this.childConstraints;
    }

    @NotNull
    public final Map<Object, Integer> getKeyToIndexMap() {
        return this.measuredItemProvider.getKeyToIndexMap();
    }
}
