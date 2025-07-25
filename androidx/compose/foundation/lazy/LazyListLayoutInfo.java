package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyListLayoutInfo.kt */
@Metadata
/* loaded from: classes.dex */
public interface LazyListLayoutInfo {

    /* compiled from: LazyListLayoutInfo.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static int getAfterContentPadding(@NotNull LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getAfterContentPadding();
        }

        @Deprecated
        public static int getBeforeContentPadding(@NotNull LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getBeforeContentPadding();
        }

        @Deprecated
        @NotNull
        public static Orientation getOrientation(@NotNull LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getOrientation();
        }

        @Deprecated
        public static boolean getReverseLayout(@NotNull LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getReverseLayout();
        }

        @Deprecated
        /* renamed from: getViewportSize-YbymL2g  reason: not valid java name */
        public static long m106437getViewportSizeYbymL2g(@NotNull LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.mo106419getViewportSizeYbymL2g();
        }
    }

    default int getAfterContentPadding() {
        return 0;
    }

    default int getBeforeContentPadding() {
        return 0;
    }

    @NotNull
    default Orientation getOrientation() {
        return Orientation.Vertical;
    }

    default boolean getReverseLayout() {
        return false;
    }

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g */
    default long mo106419getViewportSizeYbymL2g() {
        return IntSize.Companion.m109899getZeroYbymL2g();
    }

    int getViewportStartOffset();

    @NotNull
    List<LazyListItemInfo> getVisibleItemsInfo();
}
