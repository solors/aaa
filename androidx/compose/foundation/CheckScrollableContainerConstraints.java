package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.foundation.CheckScrollableContainerConstraintsKt */
/* loaded from: classes.dex */
public final class CheckScrollableContainerConstraints {
    @ExperimentalFoundationApi
    /* renamed from: checkScrollableContainerConstraints-K40F9xA  reason: not valid java name */
    public static final void m106087checkScrollableContainerConstraintsK40F9xA(long j, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        boolean z = true;
        if (orientation == Orientation.Vertical) {
            if (Constraints.m109689getMaxHeightimpl(j) == Integer.MAX_VALUE) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
            return;
        }
        if (Constraints.m109690getMaxWidthimpl(j) == Integer.MAX_VALUE) {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
    }
}
