package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridLayoutInfo.kt */
@Metadata
/* loaded from: classes.dex */
public interface LazyGridLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    @NotNull
    Orientation getOrientation();

    boolean getReverseLayout();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g */
    long mo106453getViewportSizeYbymL2g();

    int getViewportStartOffset();

    @NotNull
    List<LazyGridItemInfo> getVisibleItemsInfo();
}
