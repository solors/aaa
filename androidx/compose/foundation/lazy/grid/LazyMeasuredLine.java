package androidx.compose.foundation.lazy.grid;

import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyMeasuredLine.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyMeasuredLine {
    private final int crossAxisSpacing;
    private final int index;
    private final boolean isVertical;
    @NotNull
    private final LazyMeasuredItem[] items;
    @NotNull
    private final LayoutDirection layoutDirection;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final int slotsPerLine;
    @NotNull
    private final List<LazyGridSpan> spans;

    public /* synthetic */ LazyMeasuredLine(int i, LazyMeasuredItem[] lazyMeasuredItemArr, List list, boolean z, int i2, LayoutDirection layoutDirection, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, lazyMeasuredItemArr, list, z, i2, layoutDirection, i3, i4);
    }

    /* renamed from: getIndex-hA7yfN8  reason: not valid java name */
    public final int m106511getIndexhA7yfN8() {
        return this.index;
    }

    @NotNull
    public final LazyMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        if (this.items.length == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<LazyGridPositionedItem> position(int i, int i2, int i3) {
        int i4;
        int i5;
        LazyMeasuredItem[] lazyMeasuredItemArr = this.items;
        ArrayList arrayList = new ArrayList(lazyMeasuredItemArr.length);
        int length = lazyMeasuredItemArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < length) {
            LazyMeasuredItem lazyMeasuredItem = lazyMeasuredItemArr[i6];
            int i10 = i7 + 1;
            int m106458getCurrentLineSpanimpl = LazyGridSpan.m106458getCurrentLineSpanimpl(this.spans.get(i7).m106461unboximpl());
            if (this.layoutDirection == LayoutDirection.Rtl) {
                i4 = (this.slotsPerLine - i8) - m106458getCurrentLineSpanimpl;
            } else {
                i4 = i8;
            }
            boolean z = this.isVertical;
            if (z) {
                i5 = this.index;
            } else {
                i5 = i4;
            }
            if (!z) {
                i4 = this.index;
            }
            LazyGridPositionedItem position = lazyMeasuredItem.position(i, i9, i2, i3, i5, i4, this.mainAxisSize);
            i9 += lazyMeasuredItem.getCrossAxisSize() + this.crossAxisSpacing;
            i8 += m106458getCurrentLineSpanimpl;
            arrayList.add(position);
            i6++;
            i7 = i10;
        }
        return arrayList;
    }

    private LazyMeasuredLine(int i, LazyMeasuredItem[] lazyMeasuredItemArr, List<LazyGridSpan> list, boolean z, int i2, LayoutDirection layoutDirection, int i3, int i4) {
        this.index = i;
        this.items = lazyMeasuredItemArr;
        this.spans = list;
        this.isVertical = z;
        this.slotsPerLine = i2;
        this.layoutDirection = layoutDirection;
        this.mainAxisSpacing = i3;
        this.crossAxisSpacing = i4;
        int i5 = 0;
        for (LazyMeasuredItem lazyMeasuredItem : lazyMeasuredItemArr) {
            i5 = Math.max(i5, lazyMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = i5;
        this.mainAxisSizeWithSpacings = i5 + this.mainAxisSpacing;
    }
}
