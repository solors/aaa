package androidx.compose.p015ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PathNode.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.PathNode */
/* loaded from: classes.dex */
public abstract class PathNode {
    private final boolean isCurve;
    private final boolean isQuad;

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$ArcTo */
    /* loaded from: classes.dex */
    public static final class ArcTo extends PathNode {
        private final float arcStartX;
        private final float arcStartY;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        public ArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, null);
            this.horizontalEllipseRadius = f;
            this.verticalEllipseRadius = f2;
            this.theta = f3;
            this.isMoreThanHalf = z;
            this.isPositiveArc = z2;
            this.arcStartX = f4;
            this.arcStartY = f5;
        }

        public static /* synthetic */ ArcTo copy$default(ArcTo arcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = arcTo.horizontalEllipseRadius;
            }
            if ((i & 2) != 0) {
                f2 = arcTo.verticalEllipseRadius;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = arcTo.theta;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = arcTo.isMoreThanHalf;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = arcTo.isPositiveArc;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = arcTo.arcStartX;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = arcTo.arcStartY;
            }
            return arcTo.copy(f, f6, f7, z3, z4, f8, f5);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartX;
        }

        public final float component7() {
            return this.arcStartY;
        }

        @NotNull
        public final ArcTo copy(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            return new ArcTo(f, f2, f3, z, z2, f4, f5);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.horizontalEllipseRadius), Float.valueOf(arcTo.horizontalEllipseRadius)) && Intrinsics.m17075f(Float.valueOf(this.verticalEllipseRadius), Float.valueOf(arcTo.verticalEllipseRadius)) && Intrinsics.m17075f(Float.valueOf(this.theta), Float.valueOf(arcTo.theta)) && this.isMoreThanHalf == arcTo.isMoreThanHalf && this.isPositiveArc == arcTo.isPositiveArc && Intrinsics.m17075f(Float.valueOf(this.arcStartX), Float.valueOf(arcTo.arcStartX)) && Intrinsics.m17075f(Float.valueOf(this.arcStartY), Float.valueOf(arcTo.arcStartY))) {
                return true;
            }
            return false;
        }

        public final float getArcStartX() {
            return this.arcStartX;
        }

        public final float getArcStartY() {
            return this.arcStartY;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31;
            boolean z = this.isMoreThanHalf;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (hashCode + i2) * 31;
            boolean z2 = this.isPositiveArc;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return ((((i3 + i) * 31) + Float.hashCode(this.arcStartX)) * 31) + Float.hashCode(this.arcStartY);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        @NotNull
        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartX=" + this.arcStartX + ", arcStartY=" + this.arcStartY + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$Close */
    /* loaded from: classes.dex */
    public static final class Close extends PathNode {
        @NotNull
        public static final Close INSTANCE = new Close();

        private Close() {
            super(false, false, 3, null);
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$CurveTo */
    /* loaded from: classes.dex */
    public static final class CurveTo extends PathNode {

        /* renamed from: x1 */
        private final float f423x1;

        /* renamed from: x2 */
        private final float f424x2;

        /* renamed from: x3 */
        private final float f425x3;

        /* renamed from: y1 */
        private final float f426y1;

        /* renamed from: y2 */
        private final float f427y2;

        /* renamed from: y3 */
        private final float f428y3;

        public CurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.f423x1 = f;
            this.f426y1 = f2;
            this.f424x2 = f3;
            this.f427y2 = f4;
            this.f425x3 = f5;
            this.f428y3 = f6;
        }

        public static /* synthetic */ CurveTo copy$default(CurveTo curveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = curveTo.f423x1;
            }
            if ((i & 2) != 0) {
                f2 = curveTo.f426y1;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = curveTo.f424x2;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = curveTo.f427y2;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = curveTo.f425x3;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = curveTo.f428y3;
            }
            return curveTo.copy(f, f7, f8, f9, f10, f6);
        }

        public final float component1() {
            return this.f423x1;
        }

        public final float component2() {
            return this.f426y1;
        }

        public final float component3() {
            return this.f424x2;
        }

        public final float component4() {
            return this.f427y2;
        }

        public final float component5() {
            return this.f425x3;
        }

        public final float component6() {
            return this.f428y3;
        }

        @NotNull
        public final CurveTo copy(float f, float f2, float f3, float f4, float f5, float f6) {
            return new CurveTo(f, f2, f3, f4, f5, f6);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.f423x1), Float.valueOf(curveTo.f423x1)) && Intrinsics.m17075f(Float.valueOf(this.f426y1), Float.valueOf(curveTo.f426y1)) && Intrinsics.m17075f(Float.valueOf(this.f424x2), Float.valueOf(curveTo.f424x2)) && Intrinsics.m17075f(Float.valueOf(this.f427y2), Float.valueOf(curveTo.f427y2)) && Intrinsics.m17075f(Float.valueOf(this.f425x3), Float.valueOf(curveTo.f425x3)) && Intrinsics.m17075f(Float.valueOf(this.f428y3), Float.valueOf(curveTo.f428y3))) {
                return true;
            }
            return false;
        }

        public final float getX1() {
            return this.f423x1;
        }

        public final float getX2() {
            return this.f424x2;
        }

        public final float getX3() {
            return this.f425x3;
        }

        public final float getY1() {
            return this.f426y1;
        }

        public final float getY2() {
            return this.f427y2;
        }

        public final float getY3() {
            return this.f428y3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f423x1) * 31) + Float.hashCode(this.f426y1)) * 31) + Float.hashCode(this.f424x2)) * 31) + Float.hashCode(this.f427y2)) * 31) + Float.hashCode(this.f425x3)) * 31) + Float.hashCode(this.f428y3);
        }

        @NotNull
        public String toString() {
            return "CurveTo(x1=" + this.f423x1 + ", y1=" + this.f426y1 + ", x2=" + this.f424x2 + ", y2=" + this.f427y2 + ", x3=" + this.f425x3 + ", y3=" + this.f428y3 + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$HorizontalTo */
    /* loaded from: classes.dex */
    public static final class HorizontalTo extends PathNode {

        /* renamed from: x */
        private final float f429x;

        public HorizontalTo(float f) {
            super(false, false, 3, null);
            this.f429x = f;
        }

        public static /* synthetic */ HorizontalTo copy$default(HorizontalTo horizontalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = horizontalTo.f429x;
            }
            return horizontalTo.copy(f);
        }

        public final float component1() {
            return this.f429x;
        }

        @NotNull
        public final HorizontalTo copy(float f) {
            return new HorizontalTo(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof HorizontalTo) && Intrinsics.m17075f(Float.valueOf(this.f429x), Float.valueOf(((HorizontalTo) obj).f429x))) {
                return true;
            }
            return false;
        }

        public final float getX() {
            return this.f429x;
        }

        public int hashCode() {
            return Float.hashCode(this.f429x);
        }

        @NotNull
        public String toString() {
            return "HorizontalTo(x=" + this.f429x + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$LineTo */
    /* loaded from: classes.dex */
    public static final class LineTo extends PathNode {

        /* renamed from: x */
        private final float f430x;

        /* renamed from: y */
        private final float f431y;

        public LineTo(float f, float f2) {
            super(false, false, 3, null);
            this.f430x = f;
            this.f431y = f2;
        }

        public static /* synthetic */ LineTo copy$default(LineTo lineTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = lineTo.f430x;
            }
            if ((i & 2) != 0) {
                f2 = lineTo.f431y;
            }
            return lineTo.copy(f, f2);
        }

        public final float component1() {
            return this.f430x;
        }

        public final float component2() {
            return this.f431y;
        }

        @NotNull
        public final LineTo copy(float f, float f2) {
            return new LineTo(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.f430x), Float.valueOf(lineTo.f430x)) && Intrinsics.m17075f(Float.valueOf(this.f431y), Float.valueOf(lineTo.f431y))) {
                return true;
            }
            return false;
        }

        public final float getX() {
            return this.f430x;
        }

        public final float getY() {
            return this.f431y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f430x) * 31) + Float.hashCode(this.f431y);
        }

        @NotNull
        public String toString() {
            return "LineTo(x=" + this.f430x + ", y=" + this.f431y + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$MoveTo */
    /* loaded from: classes.dex */
    public static final class MoveTo extends PathNode {

        /* renamed from: x */
        private final float f432x;

        /* renamed from: y */
        private final float f433y;

        public MoveTo(float f, float f2) {
            super(false, false, 3, null);
            this.f432x = f;
            this.f433y = f2;
        }

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = moveTo.f432x;
            }
            if ((i & 2) != 0) {
                f2 = moveTo.f433y;
            }
            return moveTo.copy(f, f2);
        }

        public final float component1() {
            return this.f432x;
        }

        public final float component2() {
            return this.f433y;
        }

        @NotNull
        public final MoveTo copy(float f, float f2) {
            return new MoveTo(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.f432x), Float.valueOf(moveTo.f432x)) && Intrinsics.m17075f(Float.valueOf(this.f433y), Float.valueOf(moveTo.f433y))) {
                return true;
            }
            return false;
        }

        public final float getX() {
            return this.f432x;
        }

        public final float getY() {
            return this.f433y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f432x) * 31) + Float.hashCode(this.f433y);
        }

        @NotNull
        public String toString() {
            return "MoveTo(x=" + this.f432x + ", y=" + this.f433y + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$QuadTo */
    /* loaded from: classes.dex */
    public static final class QuadTo extends PathNode {

        /* renamed from: x1 */
        private final float f434x1;

        /* renamed from: x2 */
        private final float f435x2;

        /* renamed from: y1 */
        private final float f436y1;

        /* renamed from: y2 */
        private final float f437y2;

        public QuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1, null);
            this.f434x1 = f;
            this.f436y1 = f2;
            this.f435x2 = f3;
            this.f437y2 = f4;
        }

        public static /* synthetic */ QuadTo copy$default(QuadTo quadTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = quadTo.f434x1;
            }
            if ((i & 2) != 0) {
                f2 = quadTo.f436y1;
            }
            if ((i & 4) != 0) {
                f3 = quadTo.f435x2;
            }
            if ((i & 8) != 0) {
                f4 = quadTo.f437y2;
            }
            return quadTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f434x1;
        }

        public final float component2() {
            return this.f436y1;
        }

        public final float component3() {
            return this.f435x2;
        }

        public final float component4() {
            return this.f437y2;
        }

        @NotNull
        public final QuadTo copy(float f, float f2, float f3, float f4) {
            return new QuadTo(f, f2, f3, f4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.f434x1), Float.valueOf(quadTo.f434x1)) && Intrinsics.m17075f(Float.valueOf(this.f436y1), Float.valueOf(quadTo.f436y1)) && Intrinsics.m17075f(Float.valueOf(this.f435x2), Float.valueOf(quadTo.f435x2)) && Intrinsics.m17075f(Float.valueOf(this.f437y2), Float.valueOf(quadTo.f437y2))) {
                return true;
            }
            return false;
        }

        public final float getX1() {
            return this.f434x1;
        }

        public final float getX2() {
            return this.f435x2;
        }

        public final float getY1() {
            return this.f436y1;
        }

        public final float getY2() {
            return this.f437y2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f434x1) * 31) + Float.hashCode(this.f436y1)) * 31) + Float.hashCode(this.f435x2)) * 31) + Float.hashCode(this.f437y2);
        }

        @NotNull
        public String toString() {
            return "QuadTo(x1=" + this.f434x1 + ", y1=" + this.f436y1 + ", x2=" + this.f435x2 + ", y2=" + this.f437y2 + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$ReflectiveCurveTo */
    /* loaded from: classes.dex */
    public static final class ReflectiveCurveTo extends PathNode {

        /* renamed from: x1 */
        private final float f438x1;

        /* renamed from: x2 */
        private final float f439x2;

        /* renamed from: y1 */
        private final float f440y1;

        /* renamed from: y2 */
        private final float f441y2;

        public ReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.f438x1 = f;
            this.f440y1 = f2;
            this.f439x2 = f3;
            this.f441y2 = f4;
        }

        public static /* synthetic */ ReflectiveCurveTo copy$default(ReflectiveCurveTo reflectiveCurveTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveCurveTo.f438x1;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveCurveTo.f440y1;
            }
            if ((i & 4) != 0) {
                f3 = reflectiveCurveTo.f439x2;
            }
            if ((i & 8) != 0) {
                f4 = reflectiveCurveTo.f441y2;
            }
            return reflectiveCurveTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f438x1;
        }

        public final float component2() {
            return this.f440y1;
        }

        public final float component3() {
            return this.f439x2;
        }

        public final float component4() {
            return this.f441y2;
        }

        @NotNull
        public final ReflectiveCurveTo copy(float f, float f2, float f3, float f4) {
            return new ReflectiveCurveTo(f, f2, f3, f4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.f438x1), Float.valueOf(reflectiveCurveTo.f438x1)) && Intrinsics.m17075f(Float.valueOf(this.f440y1), Float.valueOf(reflectiveCurveTo.f440y1)) && Intrinsics.m17075f(Float.valueOf(this.f439x2), Float.valueOf(reflectiveCurveTo.f439x2)) && Intrinsics.m17075f(Float.valueOf(this.f441y2), Float.valueOf(reflectiveCurveTo.f441y2))) {
                return true;
            }
            return false;
        }

        public final float getX1() {
            return this.f438x1;
        }

        public final float getX2() {
            return this.f439x2;
        }

        public final float getY1() {
            return this.f440y1;
        }

        public final float getY2() {
            return this.f441y2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f438x1) * 31) + Float.hashCode(this.f440y1)) * 31) + Float.hashCode(this.f439x2)) * 31) + Float.hashCode(this.f441y2);
        }

        @NotNull
        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f438x1 + ", y1=" + this.f440y1 + ", x2=" + this.f439x2 + ", y2=" + this.f441y2 + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$ReflectiveQuadTo */
    /* loaded from: classes.dex */
    public static final class ReflectiveQuadTo extends PathNode {

        /* renamed from: x */
        private final float f442x;

        /* renamed from: y */
        private final float f443y;

        public ReflectiveQuadTo(float f, float f2) {
            super(false, true, 1, null);
            this.f442x = f;
            this.f443y = f2;
        }

        public static /* synthetic */ ReflectiveQuadTo copy$default(ReflectiveQuadTo reflectiveQuadTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveQuadTo.f442x;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveQuadTo.f443y;
            }
            return reflectiveQuadTo.copy(f, f2);
        }

        public final float component1() {
            return this.f442x;
        }

        public final float component2() {
            return this.f443y;
        }

        @NotNull
        public final ReflectiveQuadTo copy(float f, float f2) {
            return new ReflectiveQuadTo(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.f442x), Float.valueOf(reflectiveQuadTo.f442x)) && Intrinsics.m17075f(Float.valueOf(this.f443y), Float.valueOf(reflectiveQuadTo.f443y))) {
                return true;
            }
            return false;
        }

        public final float getX() {
            return this.f442x;
        }

        public final float getY() {
            return this.f443y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f442x) * 31) + Float.hashCode(this.f443y);
        }

        @NotNull
        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f442x + ", y=" + this.f443y + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeArcTo */
    /* loaded from: classes.dex */
    public static final class RelativeArcTo extends PathNode {
        private final float arcStartDx;
        private final float arcStartDy;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        public RelativeArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, null);
            this.horizontalEllipseRadius = f;
            this.verticalEllipseRadius = f2;
            this.theta = f3;
            this.isMoreThanHalf = z;
            this.isPositiveArc = z2;
            this.arcStartDx = f4;
            this.arcStartDy = f5;
        }

        public static /* synthetic */ RelativeArcTo copy$default(RelativeArcTo relativeArcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeArcTo.horizontalEllipseRadius;
            }
            if ((i & 2) != 0) {
                f2 = relativeArcTo.verticalEllipseRadius;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = relativeArcTo.theta;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = relativeArcTo.isMoreThanHalf;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = relativeArcTo.isPositiveArc;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = relativeArcTo.arcStartDx;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = relativeArcTo.arcStartDy;
            }
            return relativeArcTo.copy(f, f6, f7, z3, z4, f8, f5);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartDx;
        }

        public final float component7() {
            return this.arcStartDy;
        }

        @NotNull
        public final RelativeArcTo copy(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            return new RelativeArcTo(f, f2, f3, z, z2, f4, f5);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.horizontalEllipseRadius), Float.valueOf(relativeArcTo.horizontalEllipseRadius)) && Intrinsics.m17075f(Float.valueOf(this.verticalEllipseRadius), Float.valueOf(relativeArcTo.verticalEllipseRadius)) && Intrinsics.m17075f(Float.valueOf(this.theta), Float.valueOf(relativeArcTo.theta)) && this.isMoreThanHalf == relativeArcTo.isMoreThanHalf && this.isPositiveArc == relativeArcTo.isPositiveArc && Intrinsics.m17075f(Float.valueOf(this.arcStartDx), Float.valueOf(relativeArcTo.arcStartDx)) && Intrinsics.m17075f(Float.valueOf(this.arcStartDy), Float.valueOf(relativeArcTo.arcStartDy))) {
                return true;
            }
            return false;
        }

        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31;
            boolean z = this.isMoreThanHalf;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (hashCode + i2) * 31;
            boolean z2 = this.isPositiveArc;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return ((((i3 + i) * 31) + Float.hashCode(this.arcStartDx)) * 31) + Float.hashCode(this.arcStartDy);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        @NotNull
        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartDx=" + this.arcStartDx + ", arcStartDy=" + this.arcStartDy + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeCurveTo */
    /* loaded from: classes.dex */
    public static final class RelativeCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dx3;
        private final float dy1;
        private final float dy2;
        private final float dy3;

        public RelativeCurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
            this.dx3 = f5;
            this.dy3 = f6;
        }

        public static /* synthetic */ RelativeCurveTo copy$default(RelativeCurveTo relativeCurveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeCurveTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeCurveTo.dy1;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = relativeCurveTo.dx2;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = relativeCurveTo.dy2;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = relativeCurveTo.dx3;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = relativeCurveTo.dy3;
            }
            return relativeCurveTo.copy(f, f7, f8, f9, f10, f6);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final float component5() {
            return this.dx3;
        }

        public final float component6() {
            return this.dy3;
        }

        @NotNull
        public final RelativeCurveTo copy(float f, float f2, float f3, float f4, float f5, float f6) {
            return new RelativeCurveTo(f, f2, f3, f4, f5, f6);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.dx1), Float.valueOf(relativeCurveTo.dx1)) && Intrinsics.m17075f(Float.valueOf(this.dy1), Float.valueOf(relativeCurveTo.dy1)) && Intrinsics.m17075f(Float.valueOf(this.dx2), Float.valueOf(relativeCurveTo.dx2)) && Intrinsics.m17075f(Float.valueOf(this.dy2), Float.valueOf(relativeCurveTo.dy2)) && Intrinsics.m17075f(Float.valueOf(this.dx3), Float.valueOf(relativeCurveTo.dx3)) && Intrinsics.m17075f(Float.valueOf(this.dy3), Float.valueOf(relativeCurveTo.dy3))) {
                return true;
            }
            return false;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDx3() {
            return this.dx3;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final float getDy3() {
            return this.dy3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2)) * 31) + Float.hashCode(this.dx3)) * 31) + Float.hashCode(this.dy3);
        }

        @NotNull
        public String toString() {
            return "RelativeCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ", dx3=" + this.dx3 + ", dy3=" + this.dy3 + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeHorizontalTo */
    /* loaded from: classes.dex */
    public static final class RelativeHorizontalTo extends PathNode {

        /* renamed from: dx */
        private final float f444dx;

        public RelativeHorizontalTo(float f) {
            super(false, false, 3, null);
            this.f444dx = f;
        }

        public static /* synthetic */ RelativeHorizontalTo copy$default(RelativeHorizontalTo relativeHorizontalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeHorizontalTo.f444dx;
            }
            return relativeHorizontalTo.copy(f);
        }

        public final float component1() {
            return this.f444dx;
        }

        @NotNull
        public final RelativeHorizontalTo copy(float f) {
            return new RelativeHorizontalTo(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof RelativeHorizontalTo) && Intrinsics.m17075f(Float.valueOf(this.f444dx), Float.valueOf(((RelativeHorizontalTo) obj).f444dx))) {
                return true;
            }
            return false;
        }

        public final float getDx() {
            return this.f444dx;
        }

        public int hashCode() {
            return Float.hashCode(this.f444dx);
        }

        @NotNull
        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f444dx + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo */
    /* loaded from: classes.dex */
    public static final class RelativeLineTo extends PathNode {

        /* renamed from: dx */
        private final float f445dx;

        /* renamed from: dy */
        private final float f446dy;

        public RelativeLineTo(float f, float f2) {
            super(false, false, 3, null);
            this.f445dx = f;
            this.f446dy = f2;
        }

        public static /* synthetic */ RelativeLineTo copy$default(RelativeLineTo relativeLineTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeLineTo.f445dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeLineTo.f446dy;
            }
            return relativeLineTo.copy(f, f2);
        }

        public final float component1() {
            return this.f445dx;
        }

        public final float component2() {
            return this.f446dy;
        }

        @NotNull
        public final RelativeLineTo copy(float f, float f2) {
            return new RelativeLineTo(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.f445dx), Float.valueOf(relativeLineTo.f445dx)) && Intrinsics.m17075f(Float.valueOf(this.f446dy), Float.valueOf(relativeLineTo.f446dy))) {
                return true;
            }
            return false;
        }

        public final float getDx() {
            return this.f445dx;
        }

        public final float getDy() {
            return this.f446dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f445dx) * 31) + Float.hashCode(this.f446dy);
        }

        @NotNull
        public String toString() {
            return "RelativeLineTo(dx=" + this.f445dx + ", dy=" + this.f446dy + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeMoveTo */
    /* loaded from: classes.dex */
    public static final class RelativeMoveTo extends PathNode {

        /* renamed from: dx */
        private final float f447dx;

        /* renamed from: dy */
        private final float f448dy;

        public RelativeMoveTo(float f, float f2) {
            super(false, false, 3, null);
            this.f447dx = f;
            this.f448dy = f2;
        }

        public static /* synthetic */ RelativeMoveTo copy$default(RelativeMoveTo relativeMoveTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeMoveTo.f447dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeMoveTo.f448dy;
            }
            return relativeMoveTo.copy(f, f2);
        }

        public final float component1() {
            return this.f447dx;
        }

        public final float component2() {
            return this.f448dy;
        }

        @NotNull
        public final RelativeMoveTo copy(float f, float f2) {
            return new RelativeMoveTo(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.f447dx), Float.valueOf(relativeMoveTo.f447dx)) && Intrinsics.m17075f(Float.valueOf(this.f448dy), Float.valueOf(relativeMoveTo.f448dy))) {
                return true;
            }
            return false;
        }

        public final float getDx() {
            return this.f447dx;
        }

        public final float getDy() {
            return this.f448dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f447dx) * 31) + Float.hashCode(this.f448dy);
        }

        @NotNull
        public String toString() {
            return "RelativeMoveTo(dx=" + this.f447dx + ", dy=" + this.f448dy + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeQuadTo */
    /* loaded from: classes.dex */
    public static final class RelativeQuadTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeQuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1, null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
        }

        public static /* synthetic */ RelativeQuadTo copy$default(RelativeQuadTo relativeQuadTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeQuadTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeQuadTo.dy1;
            }
            if ((i & 4) != 0) {
                f3 = relativeQuadTo.dx2;
            }
            if ((i & 8) != 0) {
                f4 = relativeQuadTo.dy2;
            }
            return relativeQuadTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        @NotNull
        public final RelativeQuadTo copy(float f, float f2, float f3, float f4) {
            return new RelativeQuadTo(f, f2, f3, f4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.dx1), Float.valueOf(relativeQuadTo.dx1)) && Intrinsics.m17075f(Float.valueOf(this.dy1), Float.valueOf(relativeQuadTo.dy1)) && Intrinsics.m17075f(Float.valueOf(this.dx2), Float.valueOf(relativeQuadTo.dx2)) && Intrinsics.m17075f(Float.valueOf(this.dy2), Float.valueOf(relativeQuadTo.dy2))) {
                return true;
            }
            return false;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        @NotNull
        public String toString() {
            return "RelativeQuadTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveCurveTo */
    /* loaded from: classes.dex */
    public static final class RelativeReflectiveCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
        }

        public static /* synthetic */ RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveCurveTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveCurveTo.dy1;
            }
            if ((i & 4) != 0) {
                f3 = relativeReflectiveCurveTo.dx2;
            }
            if ((i & 8) != 0) {
                f4 = relativeReflectiveCurveTo.dy2;
            }
            return relativeReflectiveCurveTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        @NotNull
        public final RelativeReflectiveCurveTo copy(float f, float f2, float f3, float f4) {
            return new RelativeReflectiveCurveTo(f, f2, f3, f4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.dx1), Float.valueOf(relativeReflectiveCurveTo.dx1)) && Intrinsics.m17075f(Float.valueOf(this.dy1), Float.valueOf(relativeReflectiveCurveTo.dy1)) && Intrinsics.m17075f(Float.valueOf(this.dx2), Float.valueOf(relativeReflectiveCurveTo.dx2)) && Intrinsics.m17075f(Float.valueOf(this.dy2), Float.valueOf(relativeReflectiveCurveTo.dy2))) {
                return true;
            }
            return false;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        @NotNull
        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveQuadTo */
    /* loaded from: classes.dex */
    public static final class RelativeReflectiveQuadTo extends PathNode {

        /* renamed from: dx */
        private final float f449dx;

        /* renamed from: dy */
        private final float f450dy;

        public RelativeReflectiveQuadTo(float f, float f2) {
            super(false, true, 1, null);
            this.f449dx = f;
            this.f450dy = f2;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveQuadTo.f449dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveQuadTo.f450dy;
            }
            return relativeReflectiveQuadTo.copy(f, f2);
        }

        public final float component1() {
            return this.f449dx;
        }

        public final float component2() {
            return this.f450dy;
        }

        @NotNull
        public final RelativeReflectiveQuadTo copy(float f, float f2) {
            return new RelativeReflectiveQuadTo(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.f449dx), Float.valueOf(relativeReflectiveQuadTo.f449dx)) && Intrinsics.m17075f(Float.valueOf(this.f450dy), Float.valueOf(relativeReflectiveQuadTo.f450dy))) {
                return true;
            }
            return false;
        }

        public final float getDx() {
            return this.f449dx;
        }

        public final float getDy() {
            return this.f450dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f449dx) * 31) + Float.hashCode(this.f450dy);
        }

        @NotNull
        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f449dx + ", dy=" + this.f450dy + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeVerticalTo */
    /* loaded from: classes.dex */
    public static final class RelativeVerticalTo extends PathNode {

        /* renamed from: dy */
        private final float f451dy;

        public RelativeVerticalTo(float f) {
            super(false, false, 3, null);
            this.f451dy = f;
        }

        public static /* synthetic */ RelativeVerticalTo copy$default(RelativeVerticalTo relativeVerticalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeVerticalTo.f451dy;
            }
            return relativeVerticalTo.copy(f);
        }

        public final float component1() {
            return this.f451dy;
        }

        @NotNull
        public final RelativeVerticalTo copy(float f) {
            return new RelativeVerticalTo(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof RelativeVerticalTo) && Intrinsics.m17075f(Float.valueOf(this.f451dy), Float.valueOf(((RelativeVerticalTo) obj).f451dy))) {
                return true;
            }
            return false;
        }

        public final float getDy() {
            return this.f451dy;
        }

        public int hashCode() {
            return Float.hashCode(this.f451dy);
        }

        @NotNull
        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f451dy + ')';
        }
    }

    /* compiled from: PathNode.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$VerticalTo */
    /* loaded from: classes.dex */
    public static final class VerticalTo extends PathNode {

        /* renamed from: y */
        private final float f452y;

        public VerticalTo(float f) {
            super(false, false, 3, null);
            this.f452y = f;
        }

        public static /* synthetic */ VerticalTo copy$default(VerticalTo verticalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = verticalTo.f452y;
            }
            return verticalTo.copy(f);
        }

        public final float component1() {
            return this.f452y;
        }

        @NotNull
        public final VerticalTo copy(float f) {
            return new VerticalTo(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof VerticalTo) && Intrinsics.m17075f(Float.valueOf(this.f452y), Float.valueOf(((VerticalTo) obj).f452y))) {
                return true;
            }
            return false;
        }

        public final float getY() {
            return this.f452y;
        }

        public int hashCode() {
            return Float.hashCode(this.f452y);
        }

        @NotNull
        public String toString() {
            return "VerticalTo(y=" + this.f452y + ')';
        }
    }

    public /* synthetic */ PathNode(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    public final boolean isCurve() {
        return this.isCurve;
    }

    public final boolean isQuad() {
        return this.isQuad;
    }

    private PathNode(boolean z, boolean z2) {
        this.isCurve = z;
        this.isQuad = z2;
    }

    public /* synthetic */ PathNode(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, null);
    }
}
