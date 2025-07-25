package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.draw.Clip;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.graphics.Outline;
import androidx.compose.p015ui.graphics.Shape;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.foundation.ClipScrollableContainerKt */
/* loaded from: classes.dex */
public final class ClipScrollableContainer {
    @NotNull
    private static final Modifier HorizontalScrollableClipModifier;
    private static final float MaxSupportedElevation = C1059Dp.m109734constructorimpl(30);
    @NotNull
    private static final Modifier VerticalScrollableClipModifier;

    static {
        Modifier.Companion companion = Modifier.Companion;
        HorizontalScrollableClipModifier = Clip.clip(companion, new Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$HorizontalScrollableClipModifier$1
            @Override // androidx.compose.p015ui.graphics.Shape
            @NotNull
            /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
            public Outline mo106107createOutlinePq9zytI(long j, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(density, "density");
                float mo106208roundToPx0680j_4 = density.mo106208roundToPx0680j_4(ClipScrollableContainer.getMaxSupportedElevation());
                return new Outline.Rectangle(new Rect(0.0f, -mo106208roundToPx0680j_4, Size.m107360getWidthimpl(j), Size.m107357getHeightimpl(j) + mo106208roundToPx0680j_4));
            }
        });
        VerticalScrollableClipModifier = Clip.clip(companion, new Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$VerticalScrollableClipModifier$1
            @Override // androidx.compose.p015ui.graphics.Shape
            @NotNull
            /* renamed from: createOutline-Pq9zytI */
            public Outline mo106107createOutlinePq9zytI(long j, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(density, "density");
                float mo106208roundToPx0680j_4 = density.mo106208roundToPx0680j_4(ClipScrollableContainer.getMaxSupportedElevation());
                return new Outline.Rectangle(new Rect(-mo106208roundToPx0680j_4, 0.0f, Size.m107360getWidthimpl(j) + mo106208roundToPx0680j_4, Size.m107357getHeightimpl(j)));
            }
        });
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier clipScrollableContainer(@NotNull Modifier modifier, @NotNull Orientation orientation) {
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            modifier2 = VerticalScrollableClipModifier;
        } else {
            modifier2 = HorizontalScrollableClipModifier;
        }
        return modifier.then(modifier2);
    }

    public static final float getMaxSupportedElevation() {
        return MaxSupportedElevation;
    }
}
