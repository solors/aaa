package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@Metadata
/* loaded from: classes.dex */
public final class ScrollDraggableState implements PointerAwareDraggableState, PointerAwareDragScope {
    @NotNull
    private ScrollScope latestScrollScope;
    @NotNull
    private final State<ScrollingLogic> scrollLogic;

    public ScrollDraggableState(@NotNull State<ScrollingLogic> scrollLogic) {
        ScrollScope scrollScope;
        Intrinsics.checkNotNullParameter(scrollLogic, "scrollLogic");
        this.scrollLogic = scrollLogic;
        scrollScope = ScrollableKt.NoOpScrollScope;
        this.latestScrollScope = scrollScope;
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDraggableState
    public void dispatchRawDelta(float f) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m106223performRawScrollMKHz9U(value.m106227toOffsettuRUvjQ(f));
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDraggableState
    @Nullable
    public Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super PointerAwareDragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object scroll = this.scrollLogic.getValue().getScrollableState().scroll(mutatePriority, new ScrollDraggableState$drag$2(this, function2, null), continuation);
        m6959e = C42688d.m6959e();
        if (scroll == m6959e) {
            return scroll;
        }
        return Unit.f99208a;
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDragScope
    /* renamed from: dragBy-Uv8p0NA */
    public void mo106182dragByUv8p0NA(float f, long j) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m106221dispatchScrollf0eR0lY(this.latestScrollScope, value.m106227toOffsettuRUvjQ(f), Offset.m107280boximpl(j), NestedScrollSource.Companion.m108794getDragWNlRxjI());
    }

    @NotNull
    public final ScrollScope getLatestScrollScope() {
        return this.latestScrollScope;
    }

    @NotNull
    public final State<ScrollingLogic> getScrollLogic() {
        return this.scrollLogic;
    }

    public final void setLatestScrollScope(@NotNull ScrollScope scrollScope) {
        Intrinsics.checkNotNullParameter(scrollScope, "<set-?>");
        this.latestScrollScope = scrollScope;
    }
}
