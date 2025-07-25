package androidx.compose.p015ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p015ui.graphics.StrokeCap;
import androidx.compose.p015ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidPaint.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidPaint_androidKt */
/* loaded from: classes.dex */
public final class AndroidPaint_androidKt {

    /* compiled from: AndroidPaint.android.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.AndroidPaint_androidKt$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            iArr[Paint.Style.STROKE.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            iArr3[Paint.Join.MITER.ordinal()] = 1;
            iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            iArr3[Paint.Join.ROUND.ordinal()] = 3;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @NotNull
    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final float getNativeAlpha(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        if (!paint.isFilterBitmap()) {
            return FilterQuality.Companion.m107615getNonefv9h1I();
        }
        return FilterQuality.Companion.m107613getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(@NotNull Paint paint) {
        int i;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return StrokeCap.Companion.m107831getButtKaPHkGw();
                }
                return StrokeCap.Companion.m107833getSquareKaPHkGw();
            }
            return StrokeCap.Companion.m107832getRoundKaPHkGw();
        }
        return StrokeCap.Companion.m107831getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(@NotNull Paint paint) {
        int i;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return StrokeJoin.Companion.m107842getMiterLxFBmk8();
                }
                return StrokeJoin.Companion.m107843getRoundLxFBmk8();
            }
            return StrokeJoin.Companion.m107841getBevelLxFBmk8();
        }
        return StrokeJoin.Companion.m107842getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(@NotNull Paint paint) {
        int i;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Style style = paint.getStyle();
        if (style == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        }
        if (i == 1) {
            return PaintingStyle.Companion.m107758getStrokeTiuSbCo();
        }
        return PaintingStyle.Companion.m107757getFillTiuSbCo();
    }

    @NotNull
    public static final Paint makeNativePaint() {
        return new Paint(7);
    }

    public static final void setNativeAlpha(@NotNull Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void setNativeAntiAlias(@NotNull Paint paint, boolean z) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAntiAlias(z);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg  reason: not valid java name */
    public static final void m107416setNativeBlendModeGB0RdKg(@NotNull Paint setNativeBlendMode, int i) {
        Intrinsics.checkNotNullParameter(setNativeBlendMode, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m107881setBlendModeGB0RdKg(setNativeBlendMode, i);
        } else {
            setNativeBlendMode.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m107384toPorterDuffModes9anfk8(i)));
        }
    }

    /* renamed from: setNativeColor-4WTKRHQ  reason: not valid java name */
    public static final void m107417setNativeColor4WTKRHQ(@NotNull Paint setNativeColor, long j) {
        Intrinsics.checkNotNullParameter(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(ColorKt.m107582toArgb8_81llA(j));
    }

    public static final void setNativeColorFilter(@NotNull Paint paint, @Nullable ColorFilter colorFilter) {
        ColorFilter colorFilter2;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        if (colorFilter != null) {
            colorFilter2 = AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter);
        } else {
            colorFilter2 = null;
        }
        paint.setColorFilter(colorFilter2);
    }

    /* renamed from: setNativeFilterQuality-50PEsBU  reason: not valid java name */
    public static final void m107418setNativeFilterQuality50PEsBU(@NotNull Paint setNativeFilterQuality, int i) {
        Intrinsics.checkNotNullParameter(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(!FilterQuality.m107608equalsimpl0(i, FilterQuality.Companion.m107615getNonefv9h1I()));
    }

    public static final void setNativePathEffect(@NotNull Paint paint, @Nullable PathEffect pathEffect) {
        PathEffect pathEffect2;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        if (androidPathEffect != null) {
            pathEffect2 = androidPathEffect.getNativePathEffect();
        } else {
            pathEffect2 = null;
        }
        paint.setPathEffect(pathEffect2);
    }

    public static final void setNativeShader(@NotNull Paint paint, @Nullable Shader shader) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setShader(shader);
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk  reason: not valid java name */
    public static final void m107419setNativeStrokeCapCSYIeUk(@NotNull Paint setNativeStrokeCap, int i) {
        Paint.Cap cap;
        Intrinsics.checkNotNullParameter(setNativeStrokeCap, "$this$setNativeStrokeCap");
        StrokeCap.Companion companion = StrokeCap.Companion;
        if (StrokeCap.m107827equalsimpl0(i, companion.m107833getSquareKaPHkGw())) {
            cap = Paint.Cap.SQUARE;
        } else if (StrokeCap.m107827equalsimpl0(i, companion.m107832getRoundKaPHkGw())) {
            cap = Paint.Cap.ROUND;
        } else if (StrokeCap.m107827equalsimpl0(i, companion.m107831getButtKaPHkGw())) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        setNativeStrokeCap.setStrokeCap(cap);
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA  reason: not valid java name */
    public static final void m107420setNativeStrokeJoinkLtJ_vA(@NotNull Paint setNativeStrokeJoin, int i) {
        Paint.Join join;
        Intrinsics.checkNotNullParameter(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        if (StrokeJoin.m107837equalsimpl0(i, companion.m107842getMiterLxFBmk8())) {
            join = Paint.Join.MITER;
        } else if (StrokeJoin.m107837equalsimpl0(i, companion.m107841getBevelLxFBmk8())) {
            join = Paint.Join.BEVEL;
        } else if (StrokeJoin.m107837equalsimpl0(i, companion.m107843getRoundLxFBmk8())) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        setNativeStrokeJoin.setStrokeJoin(join);
    }

    public static final void setNativeStrokeMiterLimit(@NotNull Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public static final void setNativeStrokeWidth(@NotNull Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    /* renamed from: setNativeStyle--5YerkU  reason: not valid java name */
    public static final void m107421setNativeStyle5YerkU(@NotNull Paint setNativeStyle, int i) {
        Paint.Style style;
        Intrinsics.checkNotNullParameter(setNativeStyle, "$this$setNativeStyle");
        if (PaintingStyle.m107753equalsimpl0(i, PaintingStyle.Companion.m107758getStrokeTiuSbCo())) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        setNativeStyle.setStyle(style);
    }
}
