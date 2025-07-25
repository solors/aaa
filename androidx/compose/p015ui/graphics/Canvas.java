package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntSizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Canvas.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.Canvas */
/* loaded from: classes.dex */
public interface Canvas {

    /* compiled from: Canvas.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.Canvas$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: clipRect-mtrdD-E  reason: not valid java name */
        public static void m107505clipRectmtrdDE(@NotNull Canvas canvas, @NotNull Rect rect, int i) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            Canvas.super.m107502clipRectmtrdDE(rect, i);
        }

        @Deprecated
        public static void drawArc(@NotNull Canvas canvas, @NotNull Rect rect, float f, float f2, boolean z, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            Intrinsics.checkNotNullParameter(paint, "paint");
            Canvas.super.drawArc(rect, f, f2, z, paint);
        }

        @Deprecated
        public static void drawArcRad(@NotNull Canvas canvas, @NotNull Rect rect, float f, float f2, boolean z, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            Intrinsics.checkNotNullParameter(paint, "paint");
            Canvas.super.drawArcRad(rect, f, f2, z, paint);
        }

        @Deprecated
        public static void drawOval(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            Intrinsics.checkNotNullParameter(paint, "paint");
            Canvas.super.drawOval(rect, paint);
        }

        @Deprecated
        public static void drawRect(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            Intrinsics.checkNotNullParameter(paint, "paint");
            Canvas.super.drawRect(rect, paint);
        }

        @Deprecated
        public static void skewRad(@NotNull Canvas canvas, float f, float f2) {
            Canvas.super.skewRad(f, f2);
        }
    }

    /* renamed from: clipPath-mtrdD-E$default  reason: not valid java name */
    static /* synthetic */ void m107498clipPathmtrdDE$default(Canvas canvas, Path path, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m107516getIntersectrtfAjoo();
            }
            canvas.mo107385clipPathmtrdDE(path, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    /* renamed from: clipRect-N_I0leg$default  reason: not valid java name */
    static /* synthetic */ void m107499clipRectN_I0leg$default(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 16) != 0) {
                i = ClipOp.Companion.m107516getIntersectrtfAjoo();
            }
            canvas.mo107386clipRectN_I0leg(f, f2, f3, f4, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* renamed from: clipRect-mtrdD-E$default  reason: not valid java name */
    static /* synthetic */ void m107500clipRectmtrdDE$default(Canvas canvas, Rect rect, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m107516getIntersectrtfAjoo();
            }
            canvas.m107502clipRectmtrdDE(rect, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
    }

    /* renamed from: drawImageRect-HPBpro0$default  reason: not valid java name */
    static /* synthetic */ void m107501drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint, int i, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        if (obj == null) {
            if ((i & 2) != 0) {
                j5 = IntOffset.Companion.m109862getZeronOccac();
            } else {
                j5 = j;
            }
            if ((i & 4) != 0) {
                j6 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j6 = j2;
            }
            if ((i & 8) != 0) {
                j7 = IntOffset.Companion.m109862getZeronOccac();
            } else {
                j7 = j3;
            }
            if ((i & 16) != 0) {
                j8 = j6;
            } else {
                j8 = j4;
            }
            canvas.mo107390drawImageRectHPBpro0(imageBitmap, j5, j6, j7, j8, paint);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
    }

    static /* synthetic */ void scale$default(Canvas canvas, float f, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f2 = f;
            }
            canvas.scale(f, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo107385clipPathmtrdDE(@NotNull Path path, int i);

    /* renamed from: clipRect-N_I0leg */
    void mo107386clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* renamed from: clipRect-mtrdD-E  reason: not valid java name */
    default void m107502clipRectmtrdDE(@NotNull Rect rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        mo107386clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i);
    }

    /* renamed from: concat-58bKbWc */
    void mo107387concat58bKbWc(@NotNull float[] fArr);

    void disableZ();

    void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, @NotNull Paint paint);

    default void drawArc(@NotNull Rect rect, float f, float f2, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2, z, paint);
    }

    default void drawArcRad(@NotNull Rect rect, float f, float f2, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        drawArc(rect, Degrees.degrees(f), Degrees.degrees(f2), z, paint);
    }

    /* renamed from: drawCircle-9KIMszo */
    void mo107388drawCircle9KIMszo(long j, float f, @NotNull Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo107389drawImaged4ec7I(@NotNull ImageBitmap imageBitmap, long j, @NotNull Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo107390drawImageRectHPBpro0(@NotNull ImageBitmap imageBitmap, long j, long j2, long j3, long j4, @NotNull Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo107391drawLineWko1d7g(long j, long j2, @NotNull Paint paint);

    void drawOval(float f, float f2, float f3, float f4, @NotNull Paint paint);

    default void drawOval(@NotNull Rect rect, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawPath(@NotNull Path path, @NotNull Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo107392drawPointsO7TthRY(int i, @NotNull List<Offset> list, @NotNull Paint paint);

    /* renamed from: drawRawPoints-O7TthRY */
    void mo107393drawRawPointsO7TthRY(int i, @NotNull float[] fArr, @NotNull Paint paint);

    void drawRect(float f, float f2, float f3, float f4, @NotNull Paint paint);

    default void drawRect(@NotNull Rect rect, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, @NotNull Paint paint);

    /* renamed from: drawVertices-TPEHhCM */
    void mo107394drawVerticesTPEHhCM(@NotNull Vertices vertices, int i, @NotNull Paint paint);

    void enableZ();

    void restore();

    void rotate(float f);

    void save();

    void saveLayer(@NotNull Rect rect, @NotNull Paint paint);

    void scale(float f, float f2);

    void skew(float f, float f2);

    default void skewRad(float f, float f2) {
        skew(Degrees.degrees(f), Degrees.degrees(f2));
    }

    void translate(float f, float f2);
}
