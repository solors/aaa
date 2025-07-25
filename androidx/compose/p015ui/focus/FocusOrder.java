package androidx.compose.p015ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusOrderModifier.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.focus.FocusOrder */
/* loaded from: classes.dex */
public final class FocusOrder {
    public static final int $stable = 8;
    @NotNull
    private final FocusProperties focusProperties;

    public FocusOrder(@NotNull FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.focusProperties = focusProperties;
    }

    @NotNull
    public final FocusRequester getDown() {
        return this.focusProperties.getDown();
    }

    @NotNull
    public final FocusRequester getEnd() {
        return this.focusProperties.getEnd();
    }

    @NotNull
    public final FocusRequester getLeft() {
        return this.focusProperties.getLeft();
    }

    @NotNull
    public final FocusRequester getNext() {
        return this.focusProperties.getNext();
    }

    @NotNull
    public final FocusRequester getPrevious() {
        return this.focusProperties.getPrevious();
    }

    @NotNull
    public final FocusRequester getRight() {
        return this.focusProperties.getRight();
    }

    @NotNull
    public final FocusRequester getStart() {
        return this.focusProperties.getStart();
    }

    @NotNull
    public final FocusRequester getUp() {
        return this.focusProperties.getUp();
    }

    public final void setDown(@NotNull FocusRequester down) {
        Intrinsics.checkNotNullParameter(down, "down");
        this.focusProperties.setDown(down);
    }

    public final void setEnd(@NotNull FocusRequester end) {
        Intrinsics.checkNotNullParameter(end, "end");
        this.focusProperties.setEnd(end);
    }

    public final void setLeft(@NotNull FocusRequester left) {
        Intrinsics.checkNotNullParameter(left, "left");
        this.focusProperties.setLeft(left);
    }

    public final void setNext(@NotNull FocusRequester next) {
        Intrinsics.checkNotNullParameter(next, "next");
        this.focusProperties.setNext(next);
    }

    public final void setPrevious(@NotNull FocusRequester previous) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        this.focusProperties.setPrevious(previous);
    }

    public final void setRight(@NotNull FocusRequester right) {
        Intrinsics.checkNotNullParameter(right, "right");
        this.focusProperties.setRight(right);
    }

    public final void setStart(@NotNull FocusRequester start) {
        Intrinsics.checkNotNullParameter(start, "start");
        this.focusProperties.setStart(start);
    }

    public final void setUp(@NotNull FocusRequester up) {
        Intrinsics.checkNotNullParameter(up, "up");
        this.focusProperties.setUp(up);
    }

    public FocusOrder() {
        this(new FocusPropertiesImpl());
    }
}
