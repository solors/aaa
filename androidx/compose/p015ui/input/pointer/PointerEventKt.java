package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerEvent.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerEventKt */
/* loaded from: classes.dex */
public final class PointerEventKt {
    public static final boolean anyChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        if (!pointerInputChange.isConsumed() && !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final boolean changedToDownIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        if (!pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final boolean changedToUp(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        if (!pointerInputChange.isConsumed() && pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final boolean changedToUpIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        if (pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final void consumeAllChanges(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        pointerInputChange.consume();
    }

    public static final void consumeDownChange(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    public static final void consumePositionChange(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        if (!Offset.m107288equalsimpl0(positionChange(pointerInputChange), Offset.Companion.m107307getZeroF1C5BW0())) {
            pointerInputChange.consume();
        }
    }

    /* renamed from: isOutOfBounds-O0kMr_c  reason: not valid java name */
    public static final boolean m108842isOutOfBoundsO0kMr_c(@NotNull PointerInputChange isOutOfBounds, long j) {
        Intrinsics.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        long m108893getPositionF1C5BW0 = isOutOfBounds.m108893getPositionF1C5BW0();
        float m107291getXimpl = Offset.m107291getXimpl(m108893getPositionF1C5BW0);
        float m107292getYimpl = Offset.m107292getYimpl(m108893getPositionF1C5BW0);
        int m109894getWidthimpl = IntSize.m109894getWidthimpl(j);
        int m109893getHeightimpl = IntSize.m109893getHeightimpl(j);
        if (m107291getXimpl >= 0.0f && m107291getXimpl <= m109894getWidthimpl && m107292getYimpl >= 0.0f && m107292getYimpl <= m109893getHeightimpl) {
            return false;
        }
        return true;
    }

    /* renamed from: isOutOfBounds-jwHxaWs  reason: not valid java name */
    public static final boolean m108843isOutOfBoundsjwHxaWs(@NotNull PointerInputChange isOutOfBounds, long j, long j2) {
        Intrinsics.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        if (!PointerType.m108964equalsimpl0(isOutOfBounds.m108896getTypeT8wyACA(), PointerType.Companion.m108971getTouchT8wyACA())) {
            return m108842isOutOfBoundsO0kMr_c(isOutOfBounds, j);
        }
        long m108893getPositionF1C5BW0 = isOutOfBounds.m108893getPositionF1C5BW0();
        float m107291getXimpl = Offset.m107291getXimpl(m108893getPositionF1C5BW0);
        float m107292getYimpl = Offset.m107292getYimpl(m108893getPositionF1C5BW0);
        float m109894getWidthimpl = IntSize.m109894getWidthimpl(j) + Size.m107360getWidthimpl(j2);
        float f = -Size.m107357getHeightimpl(j2);
        float m109893getHeightimpl = IntSize.m109893getHeightimpl(j) + Size.m107357getHeightimpl(j2);
        if (m107291getXimpl >= (-Size.m107360getWidthimpl(j2)) && m107291getXimpl <= m109894getWidthimpl && m107292getYimpl >= f && m107292getYimpl <= m109893getHeightimpl) {
            return false;
        }
        return true;
    }

    public static final long positionChange(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return positionChangeInternal(pointerInputChange, false);
    }

    public static final boolean positionChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z) {
        long m107295minusMKHz9U = Offset.m107295minusMKHz9U(pointerInputChange.m108893getPositionF1C5BW0(), pointerInputChange.m108894getPreviousPositionF1C5BW0());
        if (!z && pointerInputChange.isConsumed()) {
            return Offset.Companion.m107307getZeroF1C5BW0();
        }
        return m107295minusMKHz9U;
    }

    static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return positionChangeInternal(pointerInputChange, z);
    }

    public static final boolean positionChanged(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return !Offset.m107288equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m107307getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return !Offset.m107288equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m107307getZeroF1C5BW0());
    }
}
