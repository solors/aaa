package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.AndroidPath_androidKt;
import androidx.compose.p015ui.graphics.Path;
import androidx.compose.p015ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PathParser.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.PathParser */
/* loaded from: classes.dex */
public final class PathParser {
    @NotNull
    private final List<PathNode> nodes = new ArrayList();
    @NotNull
    private final PathPoint currentPoint = new PathPoint(0.0f, 0.0f, 3, null);
    @NotNull
    private final PathPoint ctrlPoint = new PathPoint(0.0f, 0.0f, 3, null);
    @NotNull
    private final PathPoint segmentPoint = new PathPoint(0.0f, 0.0f, 3, null);
    @NotNull
    private final PathPoint reflectiveCtrlPoint = new PathPoint(0.0f, 0.0f, 3, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PathParser.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathParser$ExtractFloatResult */
    /* loaded from: classes.dex */
    public static final class ExtractFloatResult {
        private int endPosition;
        private boolean endWithNegativeOrDot;

        public ExtractFloatResult() {
            this(0, false, 3, null);
        }

        public static /* synthetic */ ExtractFloatResult copy$default(ExtractFloatResult extractFloatResult, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = extractFloatResult.endPosition;
            }
            if ((i2 & 2) != 0) {
                z = extractFloatResult.endWithNegativeOrDot;
            }
            return extractFloatResult.copy(i, z);
        }

        public final int component1() {
            return this.endPosition;
        }

        public final boolean component2() {
            return this.endWithNegativeOrDot;
        }

        @NotNull
        public final ExtractFloatResult copy(int i, boolean z) {
            return new ExtractFloatResult(i, z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtractFloatResult)) {
                return false;
            }
            ExtractFloatResult extractFloatResult = (ExtractFloatResult) obj;
            if (this.endPosition == extractFloatResult.endPosition && this.endWithNegativeOrDot == extractFloatResult.endWithNegativeOrDot) {
                return true;
            }
            return false;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.endPosition) * 31;
            boolean z = this.endWithNegativeOrDot;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final void setEndPosition(int i) {
            this.endPosition = i;
        }

        public final void setEndWithNegativeOrDot(boolean z) {
            this.endWithNegativeOrDot = z;
        }

        @NotNull
        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.endPosition + ", endWithNegativeOrDot=" + this.endWithNegativeOrDot + ')';
        }

        public ExtractFloatResult(int i, boolean z) {
            this.endPosition = i;
            this.endWithNegativeOrDot = z;
        }

        public /* synthetic */ ExtractFloatResult(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PathParser.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathParser$PathPoint */
    /* loaded from: classes.dex */
    public static final class PathPoint {

        /* renamed from: x */
        private float f453x;

        /* renamed from: y */
        private float f454y;

        public PathPoint() {
            this(0.0f, 0.0f, 3, null);
        }

        public static /* synthetic */ PathPoint copy$default(PathPoint pathPoint, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = pathPoint.f453x;
            }
            if ((i & 2) != 0) {
                f2 = pathPoint.f454y;
            }
            return pathPoint.copy(f, f2);
        }

        public final float component1() {
            return this.f453x;
        }

        public final float component2() {
            return this.f454y;
        }

        @NotNull
        public final PathPoint copy(float f, float f2) {
            return new PathPoint(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PathPoint)) {
                return false;
            }
            PathPoint pathPoint = (PathPoint) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.f453x), Float.valueOf(pathPoint.f453x)) && Intrinsics.m17075f(Float.valueOf(this.f454y), Float.valueOf(pathPoint.f454y))) {
                return true;
            }
            return false;
        }

        public final float getX() {
            return this.f453x;
        }

        public final float getY() {
            return this.f454y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f453x) * 31) + Float.hashCode(this.f454y);
        }

        public final void reset() {
            this.f453x = 0.0f;
            this.f454y = 0.0f;
        }

        public final void setX(float f) {
            this.f453x = f;
        }

        public final void setY(float f) {
            this.f454y = f;
        }

        @NotNull
        public String toString() {
            return "PathPoint(x=" + this.f453x + ", y=" + this.f454y + ')';
        }

        public PathPoint(float f, float f2) {
            this.f453x = f;
            this.f454y = f2;
        }

        public /* synthetic */ PathPoint(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
        }
    }

    private final void addNode(char c, float[] fArr) {
        this.nodes.addAll(PathNodeKt.toPathNodes(c, fArr));
    }

    private final void arcTo(PathNode.ArcTo arcTo, Path path) {
        drawArc(path, this.currentPoint.getX(), this.currentPoint.getY(), arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
        this.currentPoint.setX(arcTo.getArcStartX());
        this.currentPoint.setY(arcTo.getArcStartY());
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = 4;
        int ceil = (int) Math.ceil(Math.abs((d9 * d11) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * cos;
        double d14 = d4 * sin;
        double d15 = (d13 * sin2) - (d14 * cos2);
        double d16 = d12 * sin;
        double d17 = d4 * cos;
        double d18 = (sin2 * d16) + (cos2 * d17);
        double d19 = d9 / ceil;
        double d20 = d5;
        double d21 = d18;
        double d22 = d15;
        int i = 0;
        double d23 = d6;
        double d24 = d8;
        while (i < ceil) {
            double d25 = d24 + d19;
            double sin3 = Math.sin(d25);
            double cos3 = Math.cos(d25);
            int i2 = ceil;
            double d26 = (d + ((d10 * cos) * cos3)) - (d14 * sin3);
            double d27 = d2 + (d10 * sin * cos3) + (d17 * sin3);
            double d28 = (d13 * sin3) - (d14 * cos3);
            double d29 = (sin3 * d16) + (cos3 * d17);
            double d30 = d25 - d24;
            double tan = Math.tan(d30 / 2);
            double sin4 = (Math.sin(d30) * (Math.sqrt(d11 + ((3.0d * tan) * tan)) - 1)) / 3;
            path.cubicTo((float) (d20 + (d22 * sin4)), (float) (d23 + (d21 * sin4)), (float) (d26 - (sin4 * d28)), (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
            i++;
            d19 = d19;
            sin = sin;
            d20 = d26;
            d16 = d16;
            d24 = d25;
            d21 = d29;
            d11 = d11;
            d22 = d28;
            cos = cos;
            ceil = i2;
            d23 = d27;
            d10 = d3;
        }
    }

    private final void close(Path path) {
        this.currentPoint.setX(this.segmentPoint.getX());
        this.currentPoint.setY(this.segmentPoint.getY());
        this.ctrlPoint.setX(this.segmentPoint.getX());
        this.ctrlPoint.setY(this.segmentPoint.getY());
        path.close();
        path.moveTo(this.currentPoint.getX(), this.currentPoint.getY());
    }

    private final float[] copyOfRange(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i >= 0 && i <= length) {
                int i3 = i2 - i;
                int min = Math.min(i3, length - i);
                float[] fArr2 = new float[i3];
                _ArraysJvm.m17396i(fArr, fArr2, 0, i, min + i);
                return fArr2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    private final void curveTo(PathNode.CurveTo curveTo, Path path) {
        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
        this.ctrlPoint.setX(curveTo.getX2());
        this.ctrlPoint.setY(curveTo.getY2());
        this.currentPoint.setX(curveTo.getX3());
        this.currentPoint.setY(curveTo.getY3());
    }

    private final void drawArc(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        boolean z3;
        double d8;
        double d9;
        boolean z4;
        double radians = toRadians(d7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d10 = ((d * cos) + (d2 * sin)) / d5;
        double d11 = (((-d) * sin) + (d2 * cos)) / d6;
        double d12 = ((d3 * cos) + (d4 * sin)) / d5;
        double d13 = (((-d3) * sin) + (d4 * cos)) / d6;
        double d14 = d10 - d12;
        double d15 = d11 - d13;
        double d16 = 2;
        double d17 = (d10 + d12) / d16;
        double d18 = (d11 + d13) / d16;
        double d19 = (d14 * d14) + (d15 * d15);
        if (d19 == 0.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d19) / 1.99999d);
            drawArc(path, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d20);
        double d21 = d14 * sqrt2;
        double d22 = sqrt2 * d15;
        if (z == z2) {
            d8 = d17 - d22;
            d9 = d18 + d21;
        } else {
            d8 = d17 + d22;
            d9 = d18 - d21;
        }
        double atan2 = Math.atan2(d11 - d9, d10 - d8);
        double atan22 = Math.atan2(d13 - d9, d12 - d8) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (i >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 != z4) {
            if (i > 0) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d23 = d8 * d5;
        double d24 = d9 * d6;
        arcToBezier(path, (d23 * cos) - (d24 * sin), (d23 * sin) + (d24 * cos), d5, d6, d, d2, radians, atan2, atan22);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0051 A[LOOP:0: B:3:0x0008->B:36:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054 A[EDGE_INSN: B:40:0x0054->B:37:0x0054 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void extract(java.lang.String r9, int r10, androidx.compose.p015ui.graphics.vector.PathParser.ExtractFloatResult r11) {
        /*
            r8 = this;
            r0 = 0
            r11.setEndWithNegativeOrDot(r0)
            r1 = r10
            r2 = r0
            r3 = r2
            r4 = r3
        L8:
            int r5 = r9.length()
            if (r1 >= r5) goto L54
            char r5 = r9.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 != r6) goto L19
        L17:
            r6 = r7
            goto L1f
        L19:
            r6 = 44
            if (r5 != r6) goto L1e
            goto L17
        L1e:
            r6 = r0
        L1f:
            if (r6 == 0) goto L24
        L21:
            r2 = r0
            r4 = r7
            goto L4e
        L24:
            r6 = 45
            if (r5 != r6) goto L30
            if (r1 == r10) goto L4d
            if (r2 != 0) goto L4d
            r11.setEndWithNegativeOrDot(r7)
            goto L21
        L30:
            r2 = 46
            if (r5 != r2) goto L3d
            if (r3 != 0) goto L39
            r2 = r0
            r3 = r7
            goto L4e
        L39:
            r11.setEndWithNegativeOrDot(r7)
            goto L21
        L3d:
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L43
        L41:
            r2 = r7
            goto L49
        L43:
            r2 = 69
            if (r5 != r2) goto L48
            goto L41
        L48:
            r2 = r0
        L49:
            if (r2 == 0) goto L4d
            r2 = r7
            goto L4e
        L4d:
            r2 = r0
        L4e:
            if (r4 == 0) goto L51
            goto L54
        L51:
            int r1 = r1 + 1
            goto L8
        L54:
            r11.setEndPosition(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.vector.PathParser.extract(java.lang.String, int, androidx.compose.ui.graphics.vector.PathParser$ExtractFloatResult):void");
    }

    private final float[] getFloats(String str) {
        if (str.charAt(0) != 'z' && str.charAt(0) != 'Z') {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult(0, false, 3, null);
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                extract(str, i, extractFloatResult);
                int endPosition = extractFloatResult.getEndPosition();
                if (i < endPosition) {
                    String substring = str.substring(i, endPosition);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    fArr[i2] = Float.parseFloat(substring);
                    i2++;
                }
                if (extractFloatResult.getEndWithNegativeOrDot()) {
                    i = endPosition;
                } else {
                    i = endPosition + 1;
                }
            }
            return copyOfRange(fArr, 0, i2);
        }
        return new float[0];
    }

    private final void horizontalTo(PathNode.HorizontalTo horizontalTo, Path path) {
        path.lineTo(horizontalTo.getX(), this.currentPoint.getY());
        this.currentPoint.setX(horizontalTo.getX());
    }

    private final void lineTo(PathNode.LineTo lineTo, Path path) {
        path.lineTo(lineTo.getX(), lineTo.getY());
        this.currentPoint.setX(lineTo.getX());
        this.currentPoint.setY(lineTo.getY());
    }

    private final void moveTo(PathNode.MoveTo moveTo, Path path) {
        this.currentPoint.setX(moveTo.getX());
        this.currentPoint.setY(moveTo.getY());
        path.moveTo(moveTo.getX(), moveTo.getY());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final int nextStart(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    private final void quadTo(PathNode.QuadTo quadTo, Path path) {
        path.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
        this.ctrlPoint.setX(quadTo.getX1());
        this.ctrlPoint.setY(quadTo.getY1());
        this.currentPoint.setX(quadTo.getX2());
        this.currentPoint.setY(quadTo.getY2());
    }

    private final void reflectiveCurveTo(PathNode.ReflectiveCurveTo reflectiveCurveTo, boolean z, Path path) {
        if (z) {
            float f = 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.cubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
        this.ctrlPoint.setX(reflectiveCurveTo.getX1());
        this.ctrlPoint.setY(reflectiveCurveTo.getY1());
        this.currentPoint.setX(reflectiveCurveTo.getX2());
        this.currentPoint.setY(reflectiveCurveTo.getY2());
    }

    private final void reflectiveQuadTo(PathNode.ReflectiveQuadTo reflectiveQuadTo, boolean z, Path path) {
        if (z) {
            float f = 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.quadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
        this.ctrlPoint.setX(this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.reflectiveCtrlPoint.getY());
        this.currentPoint.setX(reflectiveQuadTo.getX());
        this.currentPoint.setY(reflectiveQuadTo.getY());
    }

    private final void relativeArcTo(PathNode.RelativeArcTo relativeArcTo, Path path) {
        float arcStartDx = relativeArcTo.getArcStartDx() + this.currentPoint.getX();
        float arcStartDy = relativeArcTo.getArcStartDy() + this.currentPoint.getY();
        drawArc(path, this.currentPoint.getX(), this.currentPoint.getY(), arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
        this.currentPoint.setX(arcStartDx);
        this.currentPoint.setY(arcStartDy);
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void relativeCurveTo(PathNode.RelativeCurveTo relativeCurveTo, Path path) {
        path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeCurveTo.getDx2());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeCurveTo.getDy2());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeCurveTo.getDx3());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeCurveTo.getDy3());
    }

    private final void relativeHorizontalTo(PathNode.RelativeHorizontalTo relativeHorizontalTo, Path path) {
        path.relativeLineTo(relativeHorizontalTo.getDx(), 0.0f);
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeHorizontalTo.getDx());
    }

    private final void relativeLineTo(PathNode.RelativeLineTo relativeLineTo, Path path) {
        path.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeLineTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeLineTo.getDy());
    }

    private final void relativeMoveTo(PathNode.RelativeMoveTo relativeMoveTo, Path path) {
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeMoveTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeMoveTo.getDy());
        path.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final void relativeQuadTo(PathNode.RelativeQuadTo relativeQuadTo, Path path) {
        path.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeQuadTo.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeQuadTo.getDy1());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeQuadTo.getDx2());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeQuadTo.getDy2());
    }

    private final void relativeReflectiveCurveTo(PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo, boolean z, Path path) {
        if (z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeCubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeReflectiveCurveTo.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeReflectiveCurveTo.getDy1());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeReflectiveCurveTo.getDx2());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeReflectiveCurveTo.getDy2());
    }

    private final void relativeReflectiveQuadTo(PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo, boolean z, Path path) {
        if (z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeQuadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
        this.ctrlPoint.setX(this.currentPoint.getX() + this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY() + this.reflectiveCtrlPoint.getY());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeReflectiveQuadTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeReflectiveQuadTo.getDy());
    }

    private final void relativeVerticalTo(PathNode.RelativeVerticalTo relativeVerticalTo, Path path) {
        path.relativeLineTo(0.0f, relativeVerticalTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setY(pathPoint.getY() + relativeVerticalTo.getDy());
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    private final double toRadians(double d) {
        return (d / 180) * 3.141592653589793d;
    }

    private final void verticalTo(PathNode.VerticalTo verticalTo, Path path) {
        path.lineTo(this.currentPoint.getX(), verticalTo.getY());
        this.currentPoint.setY(verticalTo.getY());
    }

    @NotNull
    public final PathParser addPathNodes(@NotNull List<? extends PathNode> nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        this.nodes.addAll(nodes);
        return this;
    }

    public final void clear() {
        this.nodes.clear();
    }

    @NotNull
    public final PathParser parsePathString(@NotNull String pathData) {
        boolean z;
        int i;
        boolean z2;
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        this.nodes.clear();
        int i2 = 0;
        int i3 = 1;
        while (i3 < pathData.length()) {
            int nextStart = nextStart(pathData, i3);
            String substring = pathData.substring(i2, nextStart);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = substring.length() - 1;
            int i4 = 0;
            boolean z3 = false;
            while (i4 <= length) {
                if (!z3) {
                    i = i4;
                } else {
                    i = length;
                }
                if (Intrinsics.m17071j(substring.charAt(i), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z3) {
                    if (!z2) {
                        z3 = true;
                    } else {
                        i4++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = substring.subSequence(i4, length + 1).toString();
            if (obj.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                addNode(obj.charAt(0), getFloats(obj));
            }
            i2 = nextStart;
            i3 = nextStart + 1;
        }
        if (i3 - i2 == 1 && i2 < pathData.length()) {
            addNode(pathData.charAt(i2), new float[0]);
        }
        return this;
    }

    @NotNull
    public final List<PathNode> toNodes() {
        return this.nodes;
    }

    @NotNull
    public final Path toPath(@NotNull Path target) {
        Intrinsics.checkNotNullParameter(target, "target");
        target.reset();
        this.currentPoint.reset();
        this.ctrlPoint.reset();
        this.segmentPoint.reset();
        this.reflectiveCtrlPoint.reset();
        List<PathNode> list = this.nodes;
        int size = list.size();
        PathNode pathNode = null;
        int i = 0;
        while (i < size) {
            PathNode pathNode2 = list.get(i);
            if (pathNode == null) {
                pathNode = pathNode2;
            }
            if (pathNode2 instanceof PathNode.Close) {
                close(target);
            } else if (pathNode2 instanceof PathNode.RelativeMoveTo) {
                relativeMoveTo((PathNode.RelativeMoveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.MoveTo) {
                moveTo((PathNode.MoveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeLineTo) {
                relativeLineTo((PathNode.RelativeLineTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.LineTo) {
                lineTo((PathNode.LineTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeHorizontalTo) {
                relativeHorizontalTo((PathNode.RelativeHorizontalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.HorizontalTo) {
                horizontalTo((PathNode.HorizontalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeVerticalTo) {
                relativeVerticalTo((PathNode.RelativeVerticalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.VerticalTo) {
                verticalTo((PathNode.VerticalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeCurveTo) {
                relativeCurveTo((PathNode.RelativeCurveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.CurveTo) {
                curveTo((PathNode.CurveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                Intrinsics.m17074g(pathNode);
                relativeReflectiveCurveTo((PathNode.RelativeReflectiveCurveTo) pathNode2, pathNode.isCurve(), target);
            } else if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                Intrinsics.m17074g(pathNode);
                reflectiveCurveTo((PathNode.ReflectiveCurveTo) pathNode2, pathNode.isCurve(), target);
            } else if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                relativeQuadTo((PathNode.RelativeQuadTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.QuadTo) {
                quadTo((PathNode.QuadTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                Intrinsics.m17074g(pathNode);
                relativeReflectiveQuadTo((PathNode.RelativeReflectiveQuadTo) pathNode2, pathNode.isQuad(), target);
            } else if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                Intrinsics.m17074g(pathNode);
                reflectiveQuadTo((PathNode.ReflectiveQuadTo) pathNode2, pathNode.isQuad(), target);
            } else if (pathNode2 instanceof PathNode.RelativeArcTo) {
                relativeArcTo((PathNode.RelativeArcTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.ArcTo) {
                arcTo((PathNode.ArcTo) pathNode2, target);
            }
            i++;
            pathNode = pathNode2;
        }
        return target;
    }

    private final float toRadians(float f) {
        return (f / 180.0f) * 3.1415927f;
    }
}
