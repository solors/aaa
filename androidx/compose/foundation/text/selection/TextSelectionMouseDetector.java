package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.input.pointer.PointerEvent;
import androidx.compose.p015ui.input.pointer.PointerInputChange;
import androidx.compose.p015ui.platform.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.foundation.text.selection.ClicksCounter */
/* loaded from: classes.dex */
final class TextSelectionMouseDetector {
    private int clicks;
    @Nullable
    private PointerInputChange prevClick;
    @NotNull
    private final ViewConfiguration viewConfiguration;

    public TextSelectionMouseDetector(@NotNull ViewConfiguration viewConfiguration) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        this.viewConfiguration = viewConfiguration;
    }

    public final int getClicks() {
        return this.clicks;
    }

    @Nullable
    public final PointerInputChange getPrevClick() {
        return this.prevClick;
    }

    public final boolean positionIsTolerable(@NotNull PointerInputChange prevClick, @NotNull PointerInputChange newClick) {
        Intrinsics.checkNotNullParameter(prevClick, "prevClick");
        Intrinsics.checkNotNullParameter(newClick, "newClick");
        if (Offset.m107289getDistanceimpl(Offset.m107295minusMKHz9U(newClick.m108893getPositionF1C5BW0(), prevClick.m108893getPositionF1C5BW0())) < 100.0d) {
            return true;
        }
        return false;
    }

    public final void setClicks(int i) {
        this.clicks = i;
    }

    public final void setPrevClick(@Nullable PointerInputChange pointerInputChange) {
        this.prevClick = pointerInputChange;
    }

    public final boolean timeIsTolerable(@NotNull PointerInputChange prevClick, @NotNull PointerInputChange newClick) {
        Intrinsics.checkNotNullParameter(prevClick, "prevClick");
        Intrinsics.checkNotNullParameter(newClick, "newClick");
        if (newClick.getUptimeMillis() - prevClick.getUptimeMillis() < this.viewConfiguration.getDoubleTapTimeoutMillis()) {
            return true;
        }
        return false;
    }

    public final void update(@NotNull PointerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PointerInputChange pointerInputChange = this.prevClick;
        PointerInputChange pointerInputChange2 = event.getChanges().get(0);
        if (pointerInputChange != null && timeIsTolerable(pointerInputChange, pointerInputChange2) && positionIsTolerable(pointerInputChange, pointerInputChange2)) {
            this.clicks++;
        } else {
            this.clicks = 1;
        }
        this.prevClick = pointerInputChange2;
    }
}
