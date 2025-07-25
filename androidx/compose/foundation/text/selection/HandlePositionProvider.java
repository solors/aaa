package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntOffsetKt;
import androidx.compose.p015ui.unit.IntRect;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.p015ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: AndroidSelectionHandles.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class HandlePositionProvider implements PopupPositionProvider {
    @NotNull
    private final HandleReferencePoint handleReferencePoint;
    private final long offset;

    /* compiled from: AndroidSelectionHandles.android.kt */
    @Metadata
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HandleReferencePoint.values().length];
            iArr[HandleReferencePoint.TopLeft.ordinal()] = 1;
            iArr[HandleReferencePoint.TopRight.ordinal()] = 2;
            iArr[HandleReferencePoint.TopMiddle.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ HandlePositionProvider(HandleReferencePoint handleReferencePoint, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(handleReferencePoint, j);
    }

    @Override // androidx.compose.p015ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4  reason: not valid java name */
    public long mo106681calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long j, @NotNull LayoutDirection layoutDirection, long j2) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i = WhenMappings.$EnumSwitchMapping$0[this.handleReferencePoint.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return IntOffsetKt.IntOffset((anchorBounds.getLeft() + IntOffset.m109852getXimpl(this.offset)) - (IntSize.m109894getWidthimpl(j2) / 2), anchorBounds.getTop() + IntOffset.m109853getYimpl(this.offset));
                }
                throw new NoWhenBranchMatchedException();
            }
            return IntOffsetKt.IntOffset((anchorBounds.getLeft() + IntOffset.m109852getXimpl(this.offset)) - IntSize.m109894getWidthimpl(j2), anchorBounds.getTop() + IntOffset.m109853getYimpl(this.offset));
        }
        return IntOffsetKt.IntOffset(anchorBounds.getLeft() + IntOffset.m109852getXimpl(this.offset), anchorBounds.getTop() + IntOffset.m109853getYimpl(this.offset));
    }

    private HandlePositionProvider(HandleReferencePoint handleReferencePoint, long j) {
        this.handleReferencePoint = handleReferencePoint;
        this.offset = j;
    }
}
