package androidx.compose.foundation;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.graphics.RectHelper_androidKt;
import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.layout.LayoutCoordinatesKt;
import androidx.compose.p015ui.layout.OnGloballyPositionedModifier;
import androidx.compose.runtime.collection.MutableVector;
import be.MathJVM;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p850qd._ComparisonsJvm;

@RequiresApi(30)
@Metadata
/* renamed from: androidx.compose.foundation.ExcludeFromSystemGestureModifier */
/* loaded from: classes.dex */
final class SystemGestureExclusion implements OnGloballyPositionedModifier {
    @Nullable
    private final Function1<LayoutCoordinates, Rect> exclusion;
    @Nullable
    private android.graphics.Rect rect;
    @NotNull
    private final View view;

    /* JADX WARN: Multi-variable type inference failed */
    public SystemGestureExclusion(@NotNull View view, @Nullable Function1<? super LayoutCoordinates, Rect> function1) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.exclusion = function1;
    }

    private final android.graphics.Rect calcBounds(LayoutCoordinates layoutCoordinates, Rect rect) {
        float m12772j;
        float m12772j2;
        float m12774h;
        float m12774h2;
        int m103791d;
        int m103791d2;
        int m103791d3;
        int m103791d4;
        LayoutCoordinates findRoot = findRoot(layoutCoordinates);
        long mo109023localPositionOfR5De75A = findRoot.mo109023localPositionOfR5De75A(layoutCoordinates, rect.m107326getTopLeftF1C5BW0());
        long mo109023localPositionOfR5De75A2 = findRoot.mo109023localPositionOfR5De75A(layoutCoordinates, rect.m107327getTopRightF1C5BW0());
        long mo109023localPositionOfR5De75A3 = findRoot.mo109023localPositionOfR5De75A(layoutCoordinates, rect.m107319getBottomLeftF1C5BW0());
        long mo109023localPositionOfR5De75A4 = findRoot.mo109023localPositionOfR5De75A(layoutCoordinates, rect.m107320getBottomRightF1C5BW0());
        m12772j = _ComparisonsJvm.m12772j(Offset.m107291getXimpl(mo109023localPositionOfR5De75A), Offset.m107291getXimpl(mo109023localPositionOfR5De75A2), Offset.m107291getXimpl(mo109023localPositionOfR5De75A3), Offset.m107291getXimpl(mo109023localPositionOfR5De75A4));
        m12772j2 = _ComparisonsJvm.m12772j(Offset.m107292getYimpl(mo109023localPositionOfR5De75A), Offset.m107292getYimpl(mo109023localPositionOfR5De75A2), Offset.m107292getYimpl(mo109023localPositionOfR5De75A3), Offset.m107292getYimpl(mo109023localPositionOfR5De75A4));
        m12774h = _ComparisonsJvm.m12774h(Offset.m107291getXimpl(mo109023localPositionOfR5De75A), Offset.m107291getXimpl(mo109023localPositionOfR5De75A2), Offset.m107291getXimpl(mo109023localPositionOfR5De75A3), Offset.m107291getXimpl(mo109023localPositionOfR5De75A4));
        m12774h2 = _ComparisonsJvm.m12774h(Offset.m107292getYimpl(mo109023localPositionOfR5De75A), Offset.m107292getYimpl(mo109023localPositionOfR5De75A2), Offset.m107292getYimpl(mo109023localPositionOfR5De75A3), Offset.m107292getYimpl(mo109023localPositionOfR5De75A4));
        m103791d = MathJVM.m103791d(m12772j);
        m103791d2 = MathJVM.m103791d(m12772j2);
        m103791d3 = MathJVM.m103791d(m12774h);
        m103791d4 = MathJVM.m103791d(m12774h2);
        return new android.graphics.Rect(m103791d, m103791d2, m103791d3, m103791d4);
    }

    private final LayoutCoordinates findRoot(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            LayoutCoordinates layoutCoordinates3 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates2;
            if (layoutCoordinates != null) {
                parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
            } else {
                return layoutCoordinates3;
            }
        }
    }

    @Nullable
    public final Function1<LayoutCoordinates, Rect> getExclusion() {
        return this.exclusion;
    }

    @Nullable
    public final android.graphics.Rect getRect() {
        return this.rect;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.p015ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        android.graphics.Rect calcBounds;
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Function1<LayoutCoordinates, Rect> function1 = this.exclusion;
        if (function1 == null) {
            calcBounds = RectHelper_androidKt.toAndroidRect(LayoutCoordinatesKt.boundsInRoot(coordinates));
        } else {
            calcBounds = calcBounds(coordinates, function1.invoke(coordinates));
        }
        replaceRect(calcBounds);
    }

    public final void removeRect() {
        replaceRect(null);
    }

    public final void replaceRect(@Nullable android.graphics.Rect rect) {
        List systemGestureExclusionRects;
        boolean z = false;
        MutableVector mutableVector = new MutableVector(new android.graphics.Rect[16], 0);
        systemGestureExclusionRects = this.view.getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(systemGestureExclusionRects, "view.systemGestureExclusionRects");
        mutableVector.addAll(mutableVector.getSize(), systemGestureExclusionRects);
        android.graphics.Rect rect2 = this.rect;
        if (rect2 != null) {
            mutableVector.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            z = true;
        }
        if (z) {
            mutableVector.add(rect);
        }
        this.view.setSystemGestureExclusionRects(mutableVector.asMutableList());
        this.rect = rect;
    }

    public final void setRect(@Nullable android.graphics.Rect rect) {
        this.rect = rect;
    }
}
