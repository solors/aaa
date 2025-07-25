package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.p015ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p850qd._ComparisonsJvm;

/* compiled from: LayoutCoordinates.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.LayoutCoordinatesKt */
/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    @NotNull
    public static final Rect boundsInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Rect localBoundingBoxOf$default;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || (localBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) {
            return new Rect(0.0f, 0.0f, IntSize.m109894getWidthimpl(layoutCoordinates.mo109022getSizeYbymL2g()), IntSize.m109893getHeightimpl(layoutCoordinates.mo109022getSizeYbymL2g()));
        }
        return localBoundingBoxOf$default;
    }

    @NotNull
    public static final Rect boundsInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return LayoutCoordinates.localBoundingBoxOf$default(findRoot(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        float m12772j;
        float m12772j2;
        float m12774h;
        float m12774h2;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates findRoot = findRoot(layoutCoordinates);
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        long mo109025localToWindowMKHz9U = findRoot.mo109025localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getLeft(), boundsInRoot.getTop()));
        long mo109025localToWindowMKHz9U2 = findRoot.mo109025localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getRight(), boundsInRoot.getTop()));
        long mo109025localToWindowMKHz9U3 = findRoot.mo109025localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getRight(), boundsInRoot.getBottom()));
        long mo109025localToWindowMKHz9U4 = findRoot.mo109025localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getLeft(), boundsInRoot.getBottom()));
        m12772j = _ComparisonsJvm.m12772j(Offset.m107291getXimpl(mo109025localToWindowMKHz9U), Offset.m107291getXimpl(mo109025localToWindowMKHz9U2), Offset.m107291getXimpl(mo109025localToWindowMKHz9U4), Offset.m107291getXimpl(mo109025localToWindowMKHz9U3));
        m12772j2 = _ComparisonsJvm.m12772j(Offset.m107292getYimpl(mo109025localToWindowMKHz9U), Offset.m107292getYimpl(mo109025localToWindowMKHz9U2), Offset.m107292getYimpl(mo109025localToWindowMKHz9U4), Offset.m107292getYimpl(mo109025localToWindowMKHz9U3));
        m12774h = _ComparisonsJvm.m12774h(Offset.m107291getXimpl(mo109025localToWindowMKHz9U), Offset.m107291getXimpl(mo109025localToWindowMKHz9U2), Offset.m107291getXimpl(mo109025localToWindowMKHz9U4), Offset.m107291getXimpl(mo109025localToWindowMKHz9U3));
        m12774h2 = _ComparisonsJvm.m12774h(Offset.m107292getYimpl(mo109025localToWindowMKHz9U), Offset.m107292getYimpl(mo109025localToWindowMKHz9U2), Offset.m107292getYimpl(mo109025localToWindowMKHz9U4), Offset.m107292getYimpl(mo109025localToWindowMKHz9U3));
        return new Rect(m12772j, m12772j2, m12774h, m12774h2);
    }

    @NotNull
    public static final LayoutCoordinates findRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutNodeWrapper layoutNodeWrapper;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        if (layoutCoordinates2 instanceof LayoutNodeWrapper) {
            layoutNodeWrapper = (LayoutNodeWrapper) layoutCoordinates2;
        } else {
            layoutNodeWrapper = null;
        }
        if (layoutNodeWrapper == null) {
            return layoutCoordinates2;
        }
        LayoutNodeWrapper wrappedBy$ui_release = layoutNodeWrapper.getWrappedBy$ui_release();
        while (true) {
            LayoutNodeWrapper layoutNodeWrapper2 = wrappedBy$ui_release;
            LayoutNodeWrapper layoutNodeWrapper3 = layoutNodeWrapper;
            layoutNodeWrapper = layoutNodeWrapper2;
            if (layoutNodeWrapper != null) {
                wrappedBy$ui_release = layoutNodeWrapper.getWrappedBy$ui_release();
            } else {
                return layoutNodeWrapper3;
            }
        }
    }

    public static final long positionInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            return parentLayoutCoordinates.mo109023localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m107307getZeroF1C5BW0());
        }
        return Offset.Companion.m107307getZeroF1C5BW0();
    }

    public static final long positionInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo109024localToRootMKHz9U(Offset.Companion.m107307getZeroF1C5BW0());
    }

    public static final long positionInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo109025localToWindowMKHz9U(Offset.Companion.m107307getZeroF1C5BW0());
    }
}
