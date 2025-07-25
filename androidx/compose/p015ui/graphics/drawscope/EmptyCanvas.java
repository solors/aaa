package androidx.compose.p015ui.graphics.drawscope;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.graphics.Canvas;
import androidx.compose.p015ui.graphics.ImageBitmap;
import androidx.compose.p015ui.graphics.Paint;
import androidx.compose.p015ui.graphics.Path;
import androidx.compose.p015ui.graphics.Vertices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EmptyCanvas.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.drawscope.EmptyCanvas */
/* loaded from: classes.dex */
public final class EmptyCanvas implements Canvas {
    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E */
    public void mo107385clipPathmtrdDE(@NotNull Path path, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg */
    public void mo107386clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: concat-58bKbWc */
    public void mo107387concat58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void disableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo */
    public void mo107388drawCircle9KIMszo(long j, float f, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I */
    public void mo107389drawImaged4ec7I(@NotNull ImageBitmap image, long j, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0 */
    public void mo107390drawImageRectHPBpro0(@NotNull ImageBitmap image, long j, long j2, long j3, long j4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g */
    public void mo107391drawLineWko1d7g(long j, long j2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void drawOval(float f, float f2, float f3, float f4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY */
    public void mo107392drawPointsO7TthRY(int i, @NotNull List<Offset> points, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY */
    public void mo107393drawRawPointsO7TthRY(int i, @NotNull float[] points, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void drawRect(float f, float f2, float f3, float f4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM */
    public void mo107394drawVerticesTPEHhCM(@NotNull Vertices vertices, int i, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void enableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void restore() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void rotate(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void save() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void saveLayer(@NotNull Rect bounds, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void scale(float f, float f2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void skew(float f, float f2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void translate(float f, float f2) {
        throw new UnsupportedOperationException();
    }
}
