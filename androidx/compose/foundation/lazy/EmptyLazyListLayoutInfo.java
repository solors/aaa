package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyListState.kt */
@Metadata
/* loaded from: classes.dex */
final class EmptyLazyListLayoutInfo implements LazyListLayoutInfo {
    @NotNull
    public static final EmptyLazyListLayoutInfo INSTANCE = new EmptyLazyListLayoutInfo();
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
    private static final List<LazyListItemInfo> visibleItemsInfo;

    static {
        List<LazyListItemInfo> m17166m;
        m17166m = C37563v.m17166m();
        visibleItemsInfo = m17166m;
        viewportSize = IntSize.Companion.m109899getZeroYbymL2g();
        orientation = Orientation.Vertical;
    }

    private EmptyLazyListLayoutInfo() {
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getBeforeContentPadding() {
        return beforeContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return orientation;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean getReverseLayout() {
        return reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: getViewportSize-YbymL2g  reason: not valid java name */
    public long mo106419getViewportSizeYbymL2g() {
        return viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @NotNull
    public List<LazyListItemInfo> getVisibleItemsInfo() {
        return visibleItemsInfo;
    }
}
