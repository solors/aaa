package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBounds;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.geometry.RectKt;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.layout.OnPlacedModifier;
import androidx.compose.p015ui.layout.OnRemeasuredModifier;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37756k;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;
import sd.C42688d;

@Metadata
/* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier */
/* loaded from: classes.dex */
final class Scrollable implements BringIntoViewResponder, OnRemeasuredModifier, OnPlacedModifier {
    @Nullable
    private LayoutCoordinates coordinates;
    @Nullable
    private LayoutCoordinates focusedChild;
    @NotNull
    private final Modifier modifier;
    @Nullable
    private IntSize oldSize;
    @NotNull
    private final Orientation orientation;
    private final boolean reverseDirection;
    @NotNull
    private final CoroutineScope scope;
    @NotNull
    private final ScrollableState scrollableState;

    /* compiled from: Scrollable.kt */
    @Metadata
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Scrollable(@NotNull CoroutineScope scope, @NotNull Orientation orientation, @NotNull ScrollableState scrollableState, boolean z) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        this.scope = scope;
        this.orientation = orientation;
        this.scrollableState = scrollableState;
        this.reverseDirection = z;
        this.modifier = BringIntoViewResponderKt.bringIntoViewResponder(FocusedBounds.onFocusedBoundsChanged(this, new ContentInViewModifier$modifier$1(this)), this);
    }

    /* renamed from: computeDestination-O0kMr_c  reason: not valid java name */
    private final Rect m106145computeDestinationO0kMr_c(Rect rect, long j) {
        long m109904toSizeozmzZPI = IntSizeKt.m109904toSizeozmzZPI(j);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return rect.translate(relocationDistance(rect.getLeft(), rect.getRight(), Size.m107360getWidthimpl(m109904toSizeozmzZPI)), 0.0f);
            }
            throw new NoWhenBranchMatchedException();
        }
        return rect.translate(0.0f, relocationDistance(rect.getTop(), rect.getBottom(), Size.m107357getHeightimpl(m109904toSizeozmzZPI)));
    }

    /* renamed from: onSizeChanged-O0kMr_c  reason: not valid java name */
    private final void m106146onSizeChangedO0kMr_c(LayoutCoordinates layoutCoordinates, long j) {
        boolean z;
        LayoutCoordinates layoutCoordinates2;
        Rect localBoundingBoxOf;
        if (this.orientation != Orientation.Horizontal ? IntSize.m109893getHeightimpl(layoutCoordinates.mo109022getSizeYbymL2g()) < IntSize.m109893getHeightimpl(j) : IntSize.m109894getWidthimpl(layoutCoordinates.mo109022getSizeYbymL2g()) < IntSize.m109894getWidthimpl(j)) {
            z = true;
        } else {
            z = false;
        }
        if (z && (layoutCoordinates2 = this.focusedChild) != null && (localBoundingBoxOf = layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false)) != null) {
            Rect m107331Recttz77jQw = RectKt.m107331Recttz77jQw(Offset.Companion.m107307getZeroF1C5BW0(), IntSizeKt.m109904toSizeozmzZPI(j));
            Rect m106145computeDestinationO0kMr_c = m106145computeDestinationO0kMr_c(localBoundingBoxOf, layoutCoordinates.mo109022getSizeYbymL2g());
            boolean overlaps = m107331Recttz77jQw.overlaps(localBoundingBoxOf);
            boolean z2 = !Intrinsics.m17075f(m106145computeDestinationO0kMr_c, localBoundingBoxOf);
            if (overlaps && z2) {
                C37756k.m16221d(this.scope, null, null, new ContentInViewModifier$onSizeChanged$1(this, localBoundingBoxOf, m106145computeDestinationO0kMr_c, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object performBringIntoView(Rect rect, Rect rect2, Continuation<? super Unit> continuation) {
        float top;
        float top2;
        Object m6959e;
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i != 1) {
            if (i == 2) {
                top = rect.getLeft();
                top2 = rect2.getLeft();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            top = rect.getTop();
            top2 = rect2.getTop();
        }
        float f = top - top2;
        if (this.reverseDirection) {
            f = -f;
        }
        Object animateScrollBy$default = ScrollExtensions.animateScrollBy$default(this.scrollableState, f, null, continuation, 2, null);
        m6959e = C42688d.m6959e();
        if (animateScrollBy$default == m6959e) {
            return animateScrollBy$default;
        }
        return Unit.f99208a;
    }

    private final float relocationDistance(float f, float f2, float f3) {
        if ((f >= 0.0f && f2 <= f3) || (f < 0.0f && f2 > f3)) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        if (Math.abs(f) >= Math.abs(f4)) {
            return f4;
        }
        return f;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @Nullable
    public Object bringChildIntoView(@NotNull Rect rect, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object performBringIntoView = performBringIntoView(rect, calculateRectForParent(rect), continuation);
        m6959e = C42688d.m6959e();
        if (performBringIntoView == m6959e) {
            return performBringIntoView;
        }
        return Unit.f99208a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @NotNull
    public Rect calculateRectForParent(@NotNull Rect localRect) {
        Intrinsics.checkNotNullParameter(localRect, "localRect");
        IntSize intSize = this.oldSize;
        if (intSize != null) {
            return m106145computeDestinationO0kMr_c(localRect, intSize.m109898unboximpl());
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.p015ui.layout.OnPlacedModifier
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.coordinates = coordinates;
    }

    @Override // androidx.compose.p015ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    public void mo106147onRemeasuredozmzZPI(long j) {
        LayoutCoordinates layoutCoordinates = this.coordinates;
        IntSize intSize = this.oldSize;
        if (intSize != null && !IntSize.m109892equalsimpl0(intSize.m109898unboximpl(), j)) {
            boolean z = false;
            if (layoutCoordinates != null && layoutCoordinates.isAttached()) {
                z = true;
            }
            if (z) {
                m106146onSizeChangedO0kMr_c(layoutCoordinates, intSize.m109898unboximpl());
            }
        }
        this.oldSize = IntSize.m109886boximpl(j);
    }
}
