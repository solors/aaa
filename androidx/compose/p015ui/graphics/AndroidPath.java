package androidx.compose.p015ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.p015ui.geometry.CornerRadius;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.geometry.RoundRect;
import androidx.compose.p015ui.graphics.PathOperation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidPath.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidPath */
/* loaded from: classes.dex */
public final class AndroidPath implements Path {
    @NotNull
    private final Path internalPath;
    @NotNull
    private final Matrix mMatrix;
    @NotNull
    private final float[] radii;
    @NotNull
    private final RectF rectF;

    public AndroidPath() {
        this(null, 1, null);
    }

    private final boolean _rectIsValid(Rect rect) {
        if (!Float.isNaN(rect.getLeft())) {
            if (!Float.isNaN(rect.getTop())) {
                if (!Float.isNaN(rect.getRight())) {
                    if (!Float.isNaN(rect.getBottom())) {
                        return true;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void addArc(@NotNull Rect oval, float f, float f2) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        if (_rectIsValid(oval)) {
            this.rectF.set(RectHelper_androidKt.toAndroidRect(oval));
            this.internalPath.addArc(this.rectF, f, f2);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void addArcRad(@NotNull Rect oval, float f, float f2) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        addArc(oval, Degrees.degrees(f), Degrees.degrees(f2));
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void addOval(@NotNull Rect oval) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        this.rectF.set(RectHelper_androidKt.toAndroidRect(oval));
        this.internalPath.addOval(this.rectF, Path.Direction.CCW);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    /* renamed from: addPath-Uv8p0NA */
    public void mo107422addPathUv8p0NA(@NotNull Path path, long j) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path path2 = this.internalPath;
        if (path instanceof AndroidPath) {
            path2.addPath(((AndroidPath) path).getInternalPath(), Offset.m107291getXimpl(j), Offset.m107292getYimpl(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void addRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (_rectIsValid(rect)) {
            this.rectF.set(RectHelper_androidKt.toAndroidRectF(rect));
            this.internalPath.addRect(this.rectF, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void addRoundRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "roundRect");
        this.rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        this.radii[0] = CornerRadius.m107266getXimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs());
        this.radii[1] = CornerRadius.m107267getYimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs());
        this.radii[2] = CornerRadius.m107266getXimpl(roundRect.m107342getTopRightCornerRadiuskKHJgLs());
        this.radii[3] = CornerRadius.m107267getYimpl(roundRect.m107342getTopRightCornerRadiuskKHJgLs());
        this.radii[4] = CornerRadius.m107266getXimpl(roundRect.m107340getBottomRightCornerRadiuskKHJgLs());
        this.radii[5] = CornerRadius.m107267getYimpl(roundRect.m107340getBottomRightCornerRadiuskKHJgLs());
        this.radii[6] = CornerRadius.m107266getXimpl(roundRect.m107339getBottomLeftCornerRadiuskKHJgLs());
        this.radii[7] = CornerRadius.m107267getYimpl(roundRect.m107339getBottomLeftCornerRadiuskKHJgLs());
        this.internalPath.addRoundRect(this.rectF, this.radii, Path.Direction.CCW);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void arcTo(@NotNull Rect rect, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        this.internalPath.arcTo(this.rectF, f, f2, z);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.internalPath.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    @NotNull
    public Rect getBounds() {
        this.internalPath.computeBounds(this.rectF, true);
        RectF rectF = this.rectF;
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    /* renamed from: getFillType-Rg-k1Os */
    public int mo107423getFillTypeRgk1Os() {
        if (this.internalPath.getFillType() == Path.FillType.EVEN_ODD) {
            return PathFillType.Companion.m107770getEvenOddRgk1Os();
        }
        return PathFillType.Companion.m107771getNonZeroRgk1Os();
    }

    @NotNull
    public final Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void lineTo(float f, float f2) {
        this.internalPath.lineTo(f, f2);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void moveTo(float f, float f2) {
        this.internalPath.moveTo(f, f2);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    /* renamed from: op-N5in7k0 */
    public boolean mo107424opN5in7k0(@NotNull Path path1, @NotNull Path path2, int i) {
        Path.Op op;
        Intrinsics.checkNotNullParameter(path1, "path1");
        Intrinsics.checkNotNullParameter(path2, "path2");
        PathOperation.Companion companion = PathOperation.Companion;
        if (PathOperation.m107775equalsimpl0(i, companion.m107779getDifferenceb3I0S0c())) {
            op = Path.Op.DIFFERENCE;
        } else if (PathOperation.m107775equalsimpl0(i, companion.m107780getIntersectb3I0S0c())) {
            op = Path.Op.INTERSECT;
        } else if (PathOperation.m107775equalsimpl0(i, companion.m107781getReverseDifferenceb3I0S0c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (PathOperation.m107775equalsimpl0(i, companion.m107782getUnionb3I0S0c())) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        Path path = this.internalPath;
        if (path1 instanceof AndroidPath) {
            Path internalPath = ((AndroidPath) path1).getInternalPath();
            if (path2 instanceof AndroidPath) {
                return path.op(internalPath, ((AndroidPath) path2).getInternalPath(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void quadraticBezierTo(float f, float f2, float f3, float f4) {
        this.internalPath.quadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.internalPath.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void relativeLineTo(float f, float f2) {
        this.internalPath.rLineTo(f, f2);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void relativeMoveTo(float f, float f2) {
        this.internalPath.rMoveTo(f, f2);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void relativeQuadraticBezierTo(float f, float f2, float f3, float f4) {
        this.internalPath.rQuadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.p015ui.graphics.Path
    /* renamed from: setFillType-oQ8Xj4U */
    public void mo107425setFillTypeoQ8Xj4U(int i) {
        Path.FillType fillType;
        Path path = this.internalPath;
        if (PathFillType.m107766equalsimpl0(i, PathFillType.Companion.m107770getEvenOddRgk1Os())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // androidx.compose.p015ui.graphics.Path
    /* renamed from: translate-k-4lQ0M */
    public void mo107426translatek4lQ0M(long j) {
        this.mMatrix.reset();
        this.mMatrix.setTranslate(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j));
        this.internalPath.transform(this.mMatrix);
    }

    public AndroidPath(@NotNull Path internalPath) {
        Intrinsics.checkNotNullParameter(internalPath, "internalPath");
        this.internalPath = internalPath;
        this.rectF = new RectF();
        this.radii = new float[8];
        this.mMatrix = new Matrix();
    }

    public /* synthetic */ AndroidPath(Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Path() : path);
    }

    public static /* synthetic */ void isConvex$annotations() {
    }
}
