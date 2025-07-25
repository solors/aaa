package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.geometry.SizeKt;
import androidx.compose.p015ui.graphics.Outline;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.graphics.RectangleShapeKt */
/* loaded from: classes.dex */
public final class RectangleShape {
    @NotNull
    private static final Shape RectangleShape = new Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        @NotNull
        public String toString() {
            return "RectangleShape";
        }

        @Override // androidx.compose.p015ui.graphics.Shape
        @NotNull
        /* renamed from: createOutline-Pq9zytI */
        public Outline.Rectangle mo106107createOutlinePq9zytI(long j, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(density, "density");
            return new Outline.Rectangle(SizeKt.m107381toRectuvyYCjk(j));
        }
    };

    @NotNull
    public static final Shape getRectangleShape() {
        return RectangleShape;
    }

    @Stable
    public static /* synthetic */ void getRectangleShape$annotations() {
    }
}
