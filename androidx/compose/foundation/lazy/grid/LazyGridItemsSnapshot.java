package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.Lazy_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridItemProviderImpl.kt */
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public final class LazyGridItemsSnapshot {
    private final boolean hasCustomSpans;
    @NotNull
    private final IntervalList<LazyGridIntervalContent> intervals;
    @NotNull
    private final Map<Object, Integer> keyToIndexMap;
    @NotNull
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyGridItemsSnapshot(@NotNull IntervalList<LazyGridIntervalContent> intervals, boolean z, @NotNull PrimitiveRanges nearestItemsRange) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(nearestItemsRange, "nearestItemsRange");
        this.intervals = intervals;
        this.hasCustomSpans = z;
        this.spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
        this.keyToIndexMap = LazyGridItemProviderImplKt.generateKeyToIndexMap(nearestItemsRange, intervals);
    }

    @Composable
    public final void Item(int i, @Nullable Composer composer, int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-405085610);
        IntervalList.Interval<LazyGridIntervalContent> interval = this.intervals.get(i);
        interval.getValue().getItem().invoke(LazyGridItemScopeImpl.INSTANCE, Integer.valueOf(i - interval.getStartIndex()), startRestartGroup, 6);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyGridItemsSnapshot$Item$1(this, i, i2));
        }
    }

    @Nullable
    public final Object getContentType(int i) {
        IntervalList.Interval<LazyGridIntervalContent> interval = this.intervals.get(i);
        return interval.getValue().getType().invoke(Integer.valueOf(i - interval.getStartIndex()));
    }

    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    public final int getItemsCount() {
        return this.intervals.getSize();
    }

    @NotNull
    public final Object getKey(int i) {
        Object obj;
        IntervalList.Interval<LazyGridIntervalContent> interval = this.intervals.get(i);
        int startIndex = i - interval.getStartIndex();
        Function1<Integer, Object> key = interval.getValue().getKey();
        if (key != null) {
            obj = key.invoke(Integer.valueOf(startIndex));
        } else {
            obj = null;
        }
        if (obj == null) {
            return Lazy_androidKt.getDefaultLazyLayoutKey(i);
        }
        return obj;
    }

    @NotNull
    public final Map<Object, Integer> getKeyToIndexMap() {
        return this.keyToIndexMap;
    }

    /* renamed from: getSpan-_-orMbw  reason: not valid java name */
    public final long m106489getSpan_orMbw(@NotNull LazyGridItemSpanScope getSpan, int i) {
        Intrinsics.checkNotNullParameter(getSpan, "$this$getSpan");
        IntervalList.Interval<LazyGridIntervalContent> interval = this.intervals.get(i);
        return interval.getValue().getSpan().mo105910invoke(getSpan, Integer.valueOf(i - interval.getStartIndex())).m106461unboximpl();
    }

    @NotNull
    public final LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }
}
