package androidx.compose.p015ui.window;

import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntOffsetKt;
import androidx.compose.p015ui.unit.IntRect;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.window.AlignmentOffsetPositionProvider */
/* loaded from: classes.dex */
public final class Popup implements PopupPositionProvider {
    @NotNull
    private final Alignment alignment;
    private final long offset;

    public /* synthetic */ Popup(Alignment alignment, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, j);
    }

    @Override // androidx.compose.p015ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo106681calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long j, @NotNull LayoutDirection layoutDirection, long j2) {
        int i;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        long IntOffset = IntOffsetKt.IntOffset(0, 0);
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.Companion;
        long mo107199alignKFBX0sM = alignment.mo107199alignKFBX0sM(companion.m109899getZeroYbymL2g(), IntSizeKt.IntSize(anchorBounds.getWidth(), anchorBounds.getHeight()), layoutDirection);
        long mo107199alignKFBX0sM2 = this.alignment.mo107199alignKFBX0sM(companion.m109899getZeroYbymL2g(), IntSizeKt.IntSize(IntSize.m109894getWidthimpl(j2), IntSize.m109893getHeightimpl(j2)), layoutDirection);
        long IntOffset2 = IntOffsetKt.IntOffset(anchorBounds.getLeft(), anchorBounds.getTop());
        long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset) + IntOffset.m109852getXimpl(IntOffset2), IntOffset.m109853getYimpl(IntOffset) + IntOffset.m109853getYimpl(IntOffset2));
        long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset3) + IntOffset.m109852getXimpl(mo107199alignKFBX0sM), IntOffset.m109853getYimpl(IntOffset3) + IntOffset.m109853getYimpl(mo107199alignKFBX0sM));
        long IntOffset5 = IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(mo107199alignKFBX0sM2), IntOffset.m109853getYimpl(mo107199alignKFBX0sM2));
        long IntOffset6 = IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset4) - IntOffset.m109852getXimpl(IntOffset5), IntOffset.m109853getYimpl(IntOffset4) - IntOffset.m109853getYimpl(IntOffset5));
        int m109852getXimpl = IntOffset.m109852getXimpl(this.offset);
        if (layoutDirection == LayoutDirection.Ltr) {
            i = 1;
        } else {
            i = -1;
        }
        long IntOffset7 = IntOffsetKt.IntOffset(m109852getXimpl * i, IntOffset.m109853getYimpl(this.offset));
        return IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(IntOffset6) + IntOffset.m109852getXimpl(IntOffset7), IntOffset.m109853getYimpl(IntOffset6) + IntOffset.m109853getYimpl(IntOffset7));
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac  reason: not valid java name */
    public final long m109973getOffsetnOccac() {
        return this.offset;
    }

    private Popup(Alignment alignment, long j) {
        this.alignment = alignment;
        this.offset = j;
    }
}
