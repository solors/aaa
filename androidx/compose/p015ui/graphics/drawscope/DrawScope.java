package androidx.compose.p015ui.graphics.drawscope;

import androidx.compose.p015ui.geometry.CornerRadius;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.geometry.SizeKt;
import androidx.compose.p015ui.graphics.BlendMode;
import androidx.compose.p015ui.graphics.Brush;
import androidx.compose.p015ui.graphics.ColorFilter;
import androidx.compose.p015ui.graphics.FilterQuality;
import androidx.compose.p015ui.graphics.ImageBitmap;
import androidx.compose.p015ui.graphics.Path;
import androidx.compose.p015ui.graphics.PathEffect;
import androidx.compose.p015ui.graphics.StrokeCap;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.DpRect;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntSizeKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DrawScope.kt */
@DrawScopeMarker
@Metadata
/* renamed from: androidx.compose.ui.graphics.drawscope.DrawScope */
/* loaded from: classes.dex */
public interface DrawScope extends Density {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: DrawScope.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.drawscope.DrawScope$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m107471getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m107613getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU */
        public final int m108022getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I */
        public final int m108023getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    /* compiled from: DrawScope.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.drawscope.DrawScope$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs */
        public static void m108029drawImageAZ2fEMs(@NotNull DrawScope drawScope, @NotNull ImageBitmap image, long j, long j2, long j3, long j4, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i, int i2) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            DrawScope.super.mo107927drawImageAZ2fEMs(image, j, j2, j3, j4, f, style, colorFilter, i, i2);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0 */
        public static long m108044getCenterF1C5BW0(@NotNull DrawScope drawScope) {
            return DrawScope.super.mo108020getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc */
        public static long m108045getSizeNHjbRc(@NotNull DrawScope drawScope) {
            return DrawScope.super.mo108021getSizeNHjbRc();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o */
        public static int m108046roundToPxR2X_6o(@NotNull DrawScope drawScope, long j) {
            return DrawScope.super.mo106207roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4 */
        public static int m108047roundToPx0680j_4(@NotNull DrawScope drawScope, float f) {
            return DrawScope.super.mo106208roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA */
        public static float m108048toDpGaN1DYA(@NotNull DrawScope drawScope, long j) {
            return DrawScope.super.mo106209toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m108049toDpu2uoSUM(@NotNull DrawScope drawScope, float f) {
            return DrawScope.super.mo106210toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM */
        public static long m108051toDpSizekrfVVM(@NotNull DrawScope drawScope, long j) {
            return DrawScope.super.mo106212toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o */
        public static float m108052toPxR2X_6o(@NotNull DrawScope drawScope, long j) {
            return DrawScope.super.mo106213toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4 */
        public static float m108053toPx0680j_4(@NotNull DrawScope drawScope, float f) {
            return DrawScope.super.mo106214toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull DrawScope drawScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return DrawScope.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ */
        public static long m108054toSizeXkaWNTQ(@NotNull DrawScope drawScope, long j) {
            return DrawScope.super.mo106215toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do */
        public static long m108055toSp0xMU5do(@NotNull DrawScope drawScope, float f) {
            return DrawScope.super.mo106216toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m108056toSpkPz2Gy4(@NotNull DrawScope drawScope, float f) {
            return DrawScope.super.mo106217toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m108050toDpu2uoSUM(@NotNull DrawScope drawScope, int i) {
            return DrawScope.super.mo106211toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m108057toSpkPz2Gy4(@NotNull DrawScope drawScope, int i) {
            return DrawScope.super.mo106218toSpkPz2Gy4(i);
        }
    }

    /* renamed from: drawArc-illE91I$default */
    static /* synthetic */ void m108000drawArcillE91I$default(DrawScope drawScope, Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f4;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 16) != 0) {
                j3 = Offset.Companion.m107307getZeroF1C5BW0();
            } else {
                j3 = j;
            }
            if ((i2 & 32) != 0) {
                j4 = drawScope.m108019offsetSizePENXr5M(drawScope.mo108021getSizeNHjbRc(), j3);
            } else {
                j4 = j2;
            }
            if ((i2 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f3;
            }
            if ((i2 & 128) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 256) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 512) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107922drawArcillE91I(brush, f, f2, z, j3, j4, f4, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
    }

    /* renamed from: drawArc-yD3GUKo$default */
    static /* synthetic */ void m108001drawArcyD3GUKo$default(DrawScope drawScope, long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j4;
        long j5;
        float f4;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 16) != 0) {
                j4 = Offset.Companion.m107307getZeroF1C5BW0();
            } else {
                j4 = j2;
            }
            if ((i2 & 32) != 0) {
                j5 = drawScope.m108019offsetSizePENXr5M(drawScope.mo108021getSizeNHjbRc(), j4);
            } else {
                j5 = j3;
            }
            if ((i2 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f3;
            }
            if ((i2 & 128) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 256) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 512) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107923drawArcyD3GUKo(j, f, f2, z, j4, j5, f4, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
    }

    /* renamed from: drawCircle-V9BoPsw$default */
    static /* synthetic */ void m108002drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f3;
        long j2;
        float f4;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f3 = Size.m107359getMinDimensionimpl(drawScope.mo108021getSizeNHjbRc()) / 2.0f;
            } else {
                f3 = f;
            }
            if ((i2 & 4) != 0) {
                j2 = drawScope.mo108020getCenterF1C5BW0();
            } else {
                j2 = j;
            }
            if ((i2 & 8) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i2 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107924drawCircleV9BoPsw(brush, f3, j2, f4, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
    }

    /* renamed from: drawCircle-VaOC9Bg$default */
    static /* synthetic */ void m108003drawCircleVaOC9Bg$default(DrawScope drawScope, long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f3;
        long j3;
        float f4;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f3 = Size.m107359getMinDimensionimpl(drawScope.mo108021getSizeNHjbRc()) / 2.0f;
            } else {
                f3 = f;
            }
            if ((i2 & 4) != 0) {
                j3 = drawScope.mo108020getCenterF1C5BW0();
            } else {
                j3 = j2;
            }
            if ((i2 & 8) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i2 & 16) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107925drawCircleVaOC9Bg(j, f3, j3, f4, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
    }

    /* renamed from: drawImage-9jGpkUE$default */
    static /* synthetic */ void m108004drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j5 = IntOffset.Companion.m109862getZeronOccac();
            } else {
                j5 = j;
            }
            if ((i2 & 4) != 0) {
                j6 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j6 = j2;
            }
            if ((i2 & 8) != 0) {
                j7 = IntOffset.Companion.m109862getZeronOccac();
            } else {
                j7 = j3;
            }
            if ((i2 & 16) != 0) {
                j8 = j6;
            } else {
                j8 = j4;
            }
            if ((i2 & 32) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 64) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 256) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107926drawImage9jGpkUE(imageBitmap, j5, j6, j7, j8, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
    }

    /* renamed from: drawImage-AZ2fEMs$default */
    static /* synthetic */ void m108005drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i4;
        int i5;
        if (obj == null) {
            if ((i3 & 2) != 0) {
                j5 = IntOffset.Companion.m109862getZeronOccac();
            } else {
                j5 = j;
            }
            if ((i3 & 4) != 0) {
                j6 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j6 = j2;
            }
            if ((i3 & 8) != 0) {
                j7 = IntOffset.Companion.m109862getZeronOccac();
            } else {
                j7 = j3;
            }
            if ((i3 & 16) != 0) {
                j8 = j6;
            } else {
                j8 = j4;
            }
            if ((i3 & 32) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i3 & 64) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i3 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i3 & 256) != 0) {
                i4 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i4 = i;
            }
            if ((i3 & 512) != 0) {
                i5 = Companion.m108023getDefaultFilterQualityfv9h1I();
            } else {
                i5 = i2;
            }
            drawScope.mo107927drawImageAZ2fEMs(imageBitmap, j5, j6, j7, j8, f2, drawStyle2, colorFilter2, i4, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
    }

    /* renamed from: drawImage-gbVJVH8$default */
    static /* synthetic */ void m108006drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j2;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m107307getZeroF1C5BW0();
            } else {
                j2 = j;
            }
            if ((i2 & 4) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 8) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 16) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 32) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107928drawImagegbVJVH8(imageBitmap, j2, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
    }

    /* renamed from: drawLine-1RTmtNc$default */
    static /* synthetic */ void m108007drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        float f3;
        int i4;
        PathEffect pathEffect2;
        float f4;
        ColorFilter colorFilter2;
        int i5;
        if (obj == null) {
            if ((i3 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i3 & 16) != 0) {
                i4 = Stroke.Companion.m108086getDefaultCapKaPHkGw();
            } else {
                i4 = i;
            }
            if ((i3 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i3 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i3 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i3 & 256) != 0) {
                i5 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i5 = i2;
            }
            drawScope.mo107929drawLine1RTmtNc(brush, j, j2, f3, i4, pathEffect2, f4, colorFilter2, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
    }

    /* renamed from: drawLine-NGM6Ib0$default */
    static /* synthetic */ void m108008drawLineNGM6Ib0$default(DrawScope drawScope, long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        float f3;
        int i4;
        PathEffect pathEffect2;
        float f4;
        ColorFilter colorFilter2;
        int i5;
        if (obj == null) {
            if ((i3 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i3 & 16) != 0) {
                i4 = Stroke.Companion.m108086getDefaultCapKaPHkGw();
            } else {
                i4 = i;
            }
            if ((i3 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i3 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i3 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i3 & 256) != 0) {
                i5 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i5 = i2;
            }
            drawScope.mo107930drawLineNGM6Ib0(j, j2, j3, f3, i4, pathEffect2, f4, colorFilter2, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
    }

    /* renamed from: drawOval-AsUm42w$default */
    static /* synthetic */ void m108009drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j3 = Offset.Companion.m107307getZeroF1C5BW0();
            } else {
                j3 = j;
            }
            if ((i2 & 4) != 0) {
                j4 = drawScope.m108019offsetSizePENXr5M(drawScope.mo108021getSizeNHjbRc(), j3);
            } else {
                j4 = j2;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107931drawOvalAsUm42w(brush, j3, j4, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
    }

    /* renamed from: drawOval-n-J9OG0$default */
    static /* synthetic */ void m108010drawOvalnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j4;
        long j5;
        float f2;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j4 = Offset.Companion.m107307getZeroF1C5BW0();
            } else {
                j4 = j2;
            }
            if ((i2 & 4) != 0) {
                j5 = drawScope.m108019offsetSizePENXr5M(drawScope.mo108021getSizeNHjbRc(), j4);
            } else {
                j5 = j3;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107932drawOvalnJ9OG0(j, j4, j5, f2, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
    }

    /* renamed from: drawPath-GBMwjPU$default */
    static /* synthetic */ void m108011drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                f = 1.0f;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            if ((i2 & 16) != 0) {
                colorFilter = null;
            }
            ColorFilter colorFilter2 = colorFilter;
            if ((i2 & 32) != 0) {
                i = Companion.m108022getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo107933drawPathGBMwjPU(path, brush, f2, drawStyle2, colorFilter2, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
    }

    /* renamed from: drawPath-LG529CI$default */
    static /* synthetic */ void m108012drawPathLG529CI$default(DrawScope drawScope, Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f2;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 4) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 8) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 16) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 32) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107934drawPathLG529CI(path, j, f2, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
    }

    /* renamed from: drawPoints-F8ZwMP8$default */
    static /* synthetic */ void m108013drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        float f3;
        int i5;
        PathEffect pathEffect2;
        float f4;
        ColorFilter colorFilter2;
        int i6;
        if (obj == null) {
            if ((i4 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i4 & 16) != 0) {
                i5 = StrokeCap.Companion.m107831getButtKaPHkGw();
            } else {
                i5 = i2;
            }
            if ((i4 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i4 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i4 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i4 & 256) != 0) {
                i6 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i6 = i3;
            }
            drawScope.mo107935drawPointsF8ZwMP8(list, i, j, f3, i5, pathEffect2, f4, colorFilter2, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
    }

    /* renamed from: drawPoints-Gsft0Ws$default */
    static /* synthetic */ void m108014drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        float f3;
        int i5;
        PathEffect pathEffect2;
        float f4;
        ColorFilter colorFilter2;
        int i6;
        if (obj == null) {
            if ((i4 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i4 & 16) != 0) {
                i5 = StrokeCap.Companion.m107831getButtKaPHkGw();
            } else {
                i5 = i2;
            }
            if ((i4 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i4 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i4 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i4 & 256) != 0) {
                i6 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i6 = i3;
            }
            drawScope.mo107936drawPointsGsft0Ws(list, i, brush, f3, i5, pathEffect2, f4, colorFilter2, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
    }

    /* renamed from: drawRect-AsUm42w$default */
    static /* synthetic */ void m108015drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j3 = Offset.Companion.m107307getZeroF1C5BW0();
            } else {
                j3 = j;
            }
            if ((i2 & 4) != 0) {
                j4 = drawScope.m108019offsetSizePENXr5M(drawScope.mo108021getSizeNHjbRc(), j3);
            } else {
                j4 = j2;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107937drawRectAsUm42w(brush, j3, j4, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
    }

    /* renamed from: drawRect-n-J9OG0$default */
    static /* synthetic */ void m108016drawRectnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j4;
        long j5;
        float f2;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j4 = Offset.Companion.m107307getZeroF1C5BW0();
            } else {
                j4 = j2;
            }
            if ((i2 & 4) != 0) {
                j5 = drawScope.m108019offsetSizePENXr5M(drawScope.mo108021getSizeNHjbRc(), j4);
            } else {
                j5 = j3;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107938drawRectnJ9OG0(j, j4, j5, f2, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default */
    static /* synthetic */ void m108017drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j4;
        long j5;
        long j6;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j4 = Offset.Companion.m107307getZeroF1C5BW0();
            } else {
                j4 = j;
            }
            if ((i2 & 4) != 0) {
                j5 = drawScope.m108019offsetSizePENXr5M(drawScope.mo108021getSizeNHjbRc(), j4);
            } else {
                j5 = j2;
            }
            if ((i2 & 8) != 0) {
                j6 = CornerRadius.Companion.m107276getZerokKHJgLs();
            } else {
                j6 = j3;
            }
            if ((i2 & 16) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 32) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 64) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 128) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107939drawRoundRectZuiqVtQ(brush, j4, j5, j6, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default */
    static /* synthetic */ void m108018drawRoundRectuAw5IA$default(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j5;
        long j6;
        long j7;
        Fill fill;
        float f2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j5 = Offset.Companion.m107307getZeroF1C5BW0();
            } else {
                j5 = j2;
            }
            if ((i2 & 4) != 0) {
                j6 = drawScope.m108019offsetSizePENXr5M(drawScope.mo108021getSizeNHjbRc(), j5);
            } else {
                j6 = j3;
            }
            if ((i2 & 8) != 0) {
                j7 = CornerRadius.Companion.m107276getZerokKHJgLs();
            } else {
                j7 = j4;
            }
            if ((i2 & 16) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 32) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 64) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 128) != 0) {
                i3 = Companion.m108022getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.mo107940drawRoundRectuAw5IA(j, j5, j6, j7, fill, f2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
    }

    /* renamed from: offsetSize-PENXr5M */
    private default long m108019offsetSizePENXr5M(long j, long j2) {
        return SizeKt.Size(Size.m107360getWidthimpl(j) - Offset.m107291getXimpl(j2), Size.m107357getHeightimpl(j) - Offset.m107292getYimpl(j2));
    }

    /* renamed from: drawArc-illE91I */
    void mo107922drawArcillE91I(@NotNull Brush brush, float f, float f2, boolean z, long j, long j2, float f3, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: drawArc-yD3GUKo */
    void mo107923drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: drawCircle-V9BoPsw */
    void mo107924drawCircleV9BoPsw(@NotNull Brush brush, float f, long j, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo107925drawCircleVaOC9Bg(long j, float f, long j2, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo107926drawImage9jGpkUE(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawImage-AZ2fEMs */
    default void mo107927drawImageAZ2fEMs(@NotNull ImageBitmap image, long j, long j2, long j3, long j4, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        m108005drawImageAZ2fEMs$default(this, image, j, j2, j3, j4, f, style, colorFilter, i, 0, 512, null);
    }

    /* renamed from: drawImage-gbVJVH8 */
    void mo107928drawImagegbVJVH8(@NotNull ImageBitmap imageBitmap, long j, float f, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: drawLine-1RTmtNc */
    void mo107929drawLine1RTmtNc(@NotNull Brush brush, long j, long j2, float f, int i, @Nullable PathEffect pathEffect, float f2, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo107930drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, @Nullable PathEffect pathEffect, float f2, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawOval-AsUm42w */
    void mo107931drawOvalAsUm42w(@NotNull Brush brush, long j, long j2, float f, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: drawOval-n-J9OG0 */
    void mo107932drawOvalnJ9OG0(long j, long j2, long j3, float f, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: drawPath-GBMwjPU */
    void mo107933drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, float f, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: drawPath-LG529CI */
    void mo107934drawPathLG529CI(@NotNull Path path, long j, float f, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo107935drawPointsF8ZwMP8(@NotNull List<Offset> list, int i, long j, float f, int i2, @Nullable PathEffect pathEffect, float f2, @Nullable ColorFilter colorFilter, int i3);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo107936drawPointsGsft0Ws(@NotNull List<Offset> list, int i, @NotNull Brush brush, float f, int i2, @Nullable PathEffect pathEffect, float f2, @Nullable ColorFilter colorFilter, int i3);

    /* renamed from: drawRect-AsUm42w */
    void mo107937drawRectAsUm42w(@NotNull Brush brush, long j, long j2, float f, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: drawRect-n-J9OG0 */
    void mo107938drawRectnJ9OG0(long j, long j2, long j3, float f, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo107939drawRoundRectZuiqVtQ(@NotNull Brush brush, long j, long j2, long j3, float f, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo107940drawRoundRectuAw5IA(long j, long j2, long j3, long j4, @NotNull DrawStyle drawStyle, float f, @Nullable ColorFilter colorFilter, int i);

    /* renamed from: getCenter-F1C5BW0 */
    default long mo108020getCenterF1C5BW0() {
        return SizeKt.m107370getCenteruvyYCjk(getDrawContext().mo107946getSizeNHjbRc());
    }

    @NotNull
    DrawContext getDrawContext();

    @NotNull
    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc */
    default long mo108021getSizeNHjbRc() {
        return getDrawContext().mo107946getSizeNHjbRc();
    }
}
