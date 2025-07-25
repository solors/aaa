package androidx.compose.p015ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p015ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidShader.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidShader_androidKt */
/* loaded from: classes.dex */
public final class AndroidShader_androidKt {
    @NotNull
    /* renamed from: ActualImageShader-F49vj9s  reason: not valid java name */
    public static final Shader m107429ActualImageShaderF49vj9s(@NotNull ImageBitmap image, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(image), AndroidTileMode_androidKt.m107434toAndroidTileMode0vamqd0(i), AndroidTileMode_androidKt.m107434toAndroidTileMode0vamqd0(i2));
    }

    @NotNull
    /* renamed from: ActualLinearGradientShader-VjE6UOU  reason: not valid java name */
    public static final Shader m107430ActualLinearGradientShaderVjE6UOU(long j, long j2, @NotNull List<Color> colors, @Nullable List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new LinearGradient(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j), Offset.m107291getXimpl(j2), Offset.m107292getYimpl(j2), makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors), AndroidTileMode_androidKt.m107434toAndroidTileMode0vamqd0(i));
    }

    @NotNull
    /* renamed from: ActualRadialGradientShader-8uybcMk  reason: not valid java name */
    public static final Shader m107431ActualRadialGradientShader8uybcMk(long j, float f, @NotNull List<Color> colors, @Nullable List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new RadialGradient(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j), f, makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors), AndroidTileMode_androidKt.m107434toAndroidTileMode0vamqd0(i));
    }

    @NotNull
    /* renamed from: ActualSweepGradientShader-9KIMszo  reason: not valid java name */
    public static final Shader m107432ActualSweepGradientShader9KIMszo(long j, @NotNull List<Color> colors, @Nullable List<Float> list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new SweepGradient(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j), makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(@NotNull List<Color> colors) {
        int m17164o;
        boolean z;
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (Build.VERSION.SDK_INT < 26) {
            m17164o = C37563v.m17164o(colors);
            int i = 0;
            for (int i2 = 1; i2 < m17164o; i2++) {
                if (Color.m107529getAlphaimpl(colors.get(i2).m107537unboximpl()) == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i++;
                }
            }
            return i;
        }
        return 0;
    }

    @VisibleForTesting
    @NotNull
    public static final int[] makeTransparentColors(@NotNull List<Color> colors, int i) {
        int m17164o;
        boolean z;
        int i2;
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr = new int[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = ColorKt.m107582toArgb8_81llA(colors.get(i3).m107537unboximpl());
            }
            return iArr;
        }
        int[] iArr2 = new int[colors.size() + i];
        m17164o = C37563v.m17164o(colors);
        int size2 = colors.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            long m107537unboximpl = colors.get(i5).m107537unboximpl();
            if (Color.m107529getAlphaimpl(m107537unboximpl) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i5 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m107582toArgb8_81llA(Color.m107526copywmQWz5c$default(colors.get(1).m107537unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i5 == m17164o) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m107582toArgb8_81llA(Color.m107526copywmQWz5c$default(colors.get(i5 - 1).m107537unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i6 = i4 + 1;
                    iArr2[i4] = ColorKt.m107582toArgb8_81llA(Color.m107526copywmQWz5c$default(colors.get(i5 - 1).m107537unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i4 = i6 + 1;
                    iArr2[i6] = ColorKt.m107582toArgb8_81llA(Color.m107526copywmQWz5c$default(colors.get(i5 + 1).m107537unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i4 = i2;
            } else {
                iArr2[i4] = ColorKt.m107582toArgb8_81llA(m107537unboximpl);
                i4++;
            }
        }
        return iArr2;
    }

    @VisibleForTesting
    @Nullable
    public static final float[] makeTransparentStops(@Nullable List<Float> list, @NotNull List<Color> colors, int i) {
        float f;
        int m17164o;
        float f2;
        int m17164o2;
        int m17164o3;
        float f3;
        boolean z;
        float[] m17556W0;
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (i == 0) {
            if (list != null) {
                m17556W0 = _Collections.m17556W0(list);
                return m17556W0;
            }
            return null;
        }
        float[] fArr = new float[colors.size() + i];
        if (list != null) {
            f = list.get(0).floatValue();
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        m17164o = C37563v.m17164o(colors);
        int i2 = 1;
        for (int i3 = 1; i3 < m17164o; i3++) {
            long m107537unboximpl = colors.get(i3).m107537unboximpl();
            if (list == null) {
                m17164o3 = C37563v.m17164o(colors);
                f3 = i3 / m17164o3;
            } else {
                f3 = list.get(i3).floatValue();
            }
            int i4 = i2 + 1;
            fArr[i2] = f3;
            if (Color.m107529getAlphaimpl(m107537unboximpl) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = i4 + 1;
                fArr[i4] = f3;
            } else {
                i2 = i4;
            }
        }
        if (list != null) {
            m17164o2 = C37563v.m17164o(colors);
            f2 = list.get(m17164o2).floatValue();
        } else {
            f2 = 1.0f;
        }
        fArr[i2] = f2;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() == list2.size()) {
        } else {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
