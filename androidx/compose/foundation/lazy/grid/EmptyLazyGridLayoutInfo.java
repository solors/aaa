package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridState.kt */
@Metadata
/* loaded from: classes.dex */
final class EmptyLazyGridLayoutInfo implements LazyGridLayoutInfo {
    @NotNull
    public static final EmptyLazyGridLayoutInfo INSTANCE = new EmptyLazyGridLayoutInfo();
    private static final int afterContentPadding = 0;
    private static final int beforeContentPadding = 0;
    @NotNull
    private static final Orientation orientation;
    private static final boolean reverseLayout = false;
    private static final int totalItemsCount = 0;
    private static final int viewportEndOffset = 0;
    private static final long viewportSize;
    private static final int viewportStartOffset = 0;
    @NotNull
    private static final List<LazyGridItemInfo> visibleItemsInfo;

    static {
        List<LazyGridItemInfo> m17166m;
        m17166m = C37563v.m17166m();
        visibleItemsInfo = m17166m;
        viewportSize = IntSize.Companion.m109899getZeroYbymL2g();
        orientation = Orientation.Vertical;
    }

    private EmptyLazyGridLayoutInfo() {
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getAfterContentPadding() {
        return afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getBeforeContentPadding() {
        return beforeContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return orientation;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public boolean getReverseLayout() {
        return reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getTotalItemsCount() {
        return totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportEndOffset() {
        return viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g  reason: not valid java name */
    public long mo106453getViewportSizeYbymL2g() {
        return viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportStartOffset() {
        return viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @NotNull
    public List<LazyGridItemInfo> getVisibleItemsInfo() {
        return visibleItemsInfo;
    }
}
