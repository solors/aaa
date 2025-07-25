package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PointerEvent.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerInputFilter */
/* loaded from: classes.dex */
public abstract class PointerInputFilter {
    public static final int $stable = 8;
    private boolean isAttached;
    @Nullable
    private LayoutCoordinates layoutCoordinates;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates$ui_release() {
        return this.layoutCoordinates;
    }

    @ExperimentalComposeUiApi
    public boolean getShareWithSiblings() {
        return false;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public final long m108913getSizeYbymL2g() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        if (layoutCoordinates != null) {
            return layoutCoordinates.mo109022getSizeYbymL2g();
        }
        return IntSize.Companion.m109899getZeroYbymL2g();
    }

    public final boolean isAttached$ui_release() {
        return this.isAttached;
    }

    public abstract void onCancel();

    /* renamed from: onPointerEvent-H0pRuoY  reason: not valid java name */
    public abstract void mo108914onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pointerEventPass, long j);

    public final void setAttached$ui_release(boolean z) {
        this.isAttached = z;
    }

    public final void setLayoutCoordinates$ui_release(@Nullable LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getShareWithSiblings$annotations() {
    }
}
