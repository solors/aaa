package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.graphics.ColorKt */
/* loaded from: classes.dex */
public final class Color {
    public static final int component1(@ColorInt int i) {
        return (i >> 24) & 255;
    }

    public static final int component2(@ColorInt int i) {
        return (i >> 16) & 255;
    }

    public static final int component3(@ColorInt int i) {
        return (i >> 8) & 255;
    }

    public static final int component4(@ColorInt int i) {
        return i & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(@ColorInt int i, @NotNull ColorSpace.Named colorSpace) {
        ColorSpace colorSpace2;
        long convert;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        colorSpace2 = ColorSpace.get(colorSpace);
        convert = android.graphics.Color.convert(i, colorSpace2);
        return convert;
    }

    public static final int getAlpha(@ColorInt int i) {
        return (i >> 24) & 255;
    }

    public static final int getBlue(@ColorInt int i) {
        return i & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final ColorSpace getColorSpace(long j) {
        ColorSpace colorSpace;
        colorSpace = android.graphics.Color.colorSpace(j);
        Intrinsics.checkNotNullExpressionValue(colorSpace, "colorSpace(this)");
        return colorSpace;
    }

    public static final int getGreen(@ColorInt int i) {
        return (i >> 8) & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getLuminance(@ColorInt int i) {
        return android.graphics.Color.luminance(i);
    }

    public static final int getRed(@ColorInt int i) {
        return (i >> 16) & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean isSrgb(long j) {
        boolean isSrgb;
        isSrgb = android.graphics.Color.isSrgb(j);
        return isSrgb;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean isWideGamut(long j) {
        boolean isWideGamut;
        isWideGamut = android.graphics.Color.isWideGamut(j);
        return isWideGamut;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final android.graphics.Color plus(@NotNull android.graphics.Color color, @NotNull android.graphics.Color c) {
        Intrinsics.checkNotNullParameter(color, "<this>");
        Intrinsics.checkNotNullParameter(c, "c");
        android.graphics.Color compositeColors = ColorUtils.compositeColors(c, color);
        Intrinsics.checkNotNullExpressionValue(compositeColors, "compositeColors(c, this)");
        return compositeColors;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final android.graphics.Color toColor(@ColorInt int i) {
        android.graphics.Color valueOf;
        valueOf = android.graphics.Color.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }

    @ColorInt
    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final int toColorInt(long j) {
        int argb;
        argb = android.graphics.Color.toArgb(j);
        return argb;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long toColorLong(@ColorInt int i) {
        long pack;
        pack = android.graphics.Color.pack(i);
        return pack;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component1(@NotNull android.graphics.Color color) {
        float component;
        Intrinsics.checkNotNullParameter(color, "<this>");
        component = color.getComponent(0);
        return component;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component2(@NotNull android.graphics.Color color) {
        float component;
        Intrinsics.checkNotNullParameter(color, "<this>");
        component = color.getComponent(1);
        return component;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component3(@NotNull android.graphics.Color color) {
        float component;
        Intrinsics.checkNotNullParameter(color, "<this>");
        component = color.getComponent(2);
        return component;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component4(@NotNull android.graphics.Color color) {
        float component;
        Intrinsics.checkNotNullParameter(color, "<this>");
        component = color.getComponent(3);
        return component;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(@ColorInt int i, @NotNull ColorSpace colorSpace) {
        long convert;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        convert = android.graphics.Color.convert(i, colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getAlpha(long j) {
        float alpha;
        alpha = android.graphics.Color.alpha(j);
        return alpha;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getBlue(long j) {
        float blue;
        blue = android.graphics.Color.blue(j);
        return blue;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getGreen(long j) {
        float green;
        green = android.graphics.Color.green(j);
        return green;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getLuminance(long j) {
        float luminance;
        luminance = android.graphics.Color.luminance(j);
        return luminance;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getRed(long j) {
        float red;
        red = android.graphics.Color.red(j);
        return red;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final android.graphics.Color toColor(long j) {
        android.graphics.Color valueOf;
        valueOf = android.graphics.Color.valueOf(j);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }

    @ColorInt
    public static final int toColorInt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return android.graphics.Color.parseColor(str);
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component1(long j) {
        float red;
        red = android.graphics.Color.red(j);
        return red;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component2(long j) {
        float green;
        green = android.graphics.Color.green(j);
        return green;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component3(long j) {
        float blue;
        blue = android.graphics.Color.blue(j);
        return blue;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component4(long j) {
        float alpha;
        alpha = android.graphics.Color.alpha(j);
        return alpha;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(long j, @NotNull ColorSpace.Named colorSpace) {
        ColorSpace colorSpace2;
        long convert;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        colorSpace2 = ColorSpace.get(colorSpace);
        convert = android.graphics.Color.convert(j, colorSpace2);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(long j, @NotNull ColorSpace colorSpace) {
        long convert;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        convert = android.graphics.Color.convert(j, colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final android.graphics.Color convertTo(@NotNull android.graphics.Color color, @NotNull ColorSpace.Named colorSpace) {
        ColorSpace colorSpace2;
        android.graphics.Color convert;
        Intrinsics.checkNotNullParameter(color, "<this>");
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        colorSpace2 = ColorSpace.get(colorSpace);
        convert = color.convert(colorSpace2);
        Intrinsics.checkNotNullExpressionValue(convert, "convert(ColorSpace.get(colorSpace))");
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final android.graphics.Color convertTo(@NotNull android.graphics.Color color, @NotNull ColorSpace colorSpace) {
        android.graphics.Color convert;
        Intrinsics.checkNotNullParameter(color, "<this>");
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        convert = color.convert(colorSpace);
        Intrinsics.checkNotNullExpressionValue(convert, "convert(colorSpace)");
        return convert;
    }
}
