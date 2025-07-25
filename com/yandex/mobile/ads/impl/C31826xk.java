package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import be.MathJVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.xk */
/* loaded from: classes8.dex */
public final class C31826xk {
    @NotNull
    /* renamed from: a */
    public static Bitmap m27474a(@NotNull Bitmap originalBitmap, double d) {
        Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
        try {
            return m27473b(originalBitmap, d);
        } catch (Throwable unused) {
            return originalBitmap;
        }
    }

    /* renamed from: b */
    private static Bitmap m27473b(Bitmap bitmap, double d) {
        int m103792c;
        int m103792c2;
        int m16917e;
        int i;
        int[] iArr;
        int m16917e2;
        int m16912j;
        m103792c = MathJVM.m103792c(bitmap.getWidth() * d);
        m103792c2 = MathJVM.m103792c(bitmap.getHeight() * d);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, m103792c, m103792c2, false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        int i2 = 1;
        Bitmap copy = createScaledBitmap.copy(createScaledBitmap.getConfig(), true);
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        m16917e = _Ranges.m16917e(width, height);
        int[] iArr6 = new int[m16917e];
        int[] iArr7 = new int[1024];
        for (int i6 = 0; i6 < 1024; i6++) {
            iArr7[i6] = i6 / 4;
        }
        int[][] iArr8 = new int[3];
        for (int i7 = 0; i7 < 3; i7++) {
            iArr8[i7] = new int[3];
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < height) {
            int i11 = -1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i11 <= i2) {
                Bitmap bitmap2 = copy;
                m16917e2 = _Ranges.m16917e(i11, 0);
                m16912j = _Ranges.m16912j(i4, m16917e2);
                int i21 = iArr2[m16912j + i9];
                int i22 = i11 + 1;
                int[] iArr9 = iArr8[i22];
                iArr9[0] = (i21 & 16711680) >> 16;
                iArr9[1] = (i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[2] = i21 & 255;
                int abs = 2 - StrictMath.abs(i11);
                int i23 = iArr9[0];
                i12 = (i23 * abs) + i12;
                int i24 = iArr9[1];
                i13 = (i24 * abs) + i13;
                int i25 = iArr9[2];
                i14 = (abs * i25) + i14;
                if (i11 > 0) {
                    i20 += i23;
                    i19 += i24;
                    i18 += i25;
                } else {
                    i17 += i23;
                    i16 += i24;
                    i15 += i25;
                }
                copy = bitmap2;
                i11 = i22;
                i2 = 1;
            }
            Bitmap bitmap3 = copy;
            int i26 = 0;
            int i27 = 1;
            while (i26 < width) {
                iArr3[i9] = iArr7[i12];
                iArr4[i9] = iArr7[i13];
                iArr5[i9] = iArr7[i14];
                int i28 = i12 - i17;
                int i29 = i13 - i16;
                int i30 = i14 - i15;
                int[] iArr10 = iArr8[(i27 + 2) % 3];
                int i31 = i17 - iArr10[0];
                int i32 = i16 - iArr10[1];
                int i33 = i15 - iArr10[2];
                if (i8 == 0) {
                    iArr = iArr7;
                    iArr6[i26] = Math.min(i26 + 2, i4);
                } else {
                    iArr = iArr7;
                }
                int i34 = iArr2[i10 + iArr6[i26]];
                int i35 = (i34 & 16711680) >> 16;
                iArr10[0] = i35;
                int i36 = (i34 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[1] = i36;
                int i37 = i34 & 255;
                iArr10[2] = i37;
                int i38 = i20 + i35;
                int i39 = i19 + i36;
                int i40 = i18 + i37;
                i12 = i28 + i38;
                i13 = i29 + i39;
                i14 = i30 + i40;
                i27 = (i27 + 1) % 3;
                int[] iArr11 = iArr8[i27 % 3];
                int i41 = iArr11[0];
                i17 = i31 + i41;
                int i42 = iArr11[1];
                i16 = i32 + i42;
                int i43 = iArr11[2];
                i15 = i33 + i43;
                i20 = i38 - i41;
                i19 = i39 - i42;
                i18 = i40 - i43;
                i9++;
                i26++;
                iArr7 = iArr;
            }
            i10 += width;
            i8++;
            copy = bitmap3;
            i2 = 1;
        }
        Bitmap bitmap4 = copy;
        int[] iArr12 = iArr7;
        int i44 = 0;
        while (i44 < width) {
            int[] iArr13 = iArr6;
            int i45 = height;
            int[] iArr14 = iArr2;
            int i46 = -1;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = width * (-1);
            int i56 = 0;
            for (int i57 = 1; i46 <= i57; i57 = 1) {
                int max = Math.max(0, i55) + i44;
                int i58 = i46 + 1;
                int[] iArr15 = iArr8[i58];
                iArr15[0] = iArr3[max];
                iArr15[1] = iArr4[max];
                iArr15[2] = iArr5[max];
                int abs2 = 2 - StrictMath.abs(i46);
                i56 = (iArr3[max] * abs2) + i56;
                i47 = (iArr4[max] * abs2) + i47;
                i48 = (iArr5[max] * abs2) + i48;
                if (i46 > 0) {
                    i54 += iArr15[0];
                    i53 += iArr15[1];
                    i52 += iArr15[2];
                } else {
                    i51 += iArr15[0];
                    i50 += iArr15[1];
                    i49 += iArr15[2];
                }
                if (i46 < i5) {
                    i55 += width;
                }
                i46 = i58;
            }
            int i59 = i44;
            int i60 = i48;
            int i61 = i45;
            int i62 = 0;
            int i63 = 1;
            while (i62 < i61) {
                iArr14[i59] = (iArr14[i59] & ViewCompat.MEASURED_STATE_MASK) | (iArr12[i56] << 16) | (iArr12[i47] << 8) | iArr12[i60];
                int i64 = i56 - i51;
                int i65 = i47 - i50;
                int i66 = i60 - i49;
                int[] iArr16 = iArr8[(i63 + 2) % 3];
                int i67 = i51 - iArr16[0];
                int i68 = i50 - iArr16[1];
                int i69 = i49 - iArr16[2];
                if (i44 == 0) {
                    i = i61;
                    iArr13[i62] = Math.min(i62 + 2, i5) * width;
                } else {
                    i = i61;
                }
                int i70 = iArr13[i62] + i44;
                int i71 = iArr3[i70];
                iArr16[0] = i71;
                int i72 = iArr4[i70];
                iArr16[1] = i72;
                int i73 = iArr5[i70];
                iArr16[2] = i73;
                int i74 = i54 + i71;
                int i75 = i53 + i72;
                int i76 = i52 + i73;
                i56 = i64 + i74;
                i47 = i65 + i75;
                i60 = i66 + i76;
                i63 = (i63 + 1) % 3;
                int[] iArr17 = iArr8[i63];
                int i77 = iArr17[0];
                i51 = i67 + i77;
                int i78 = iArr17[1];
                i50 = i68 + i78;
                int i79 = iArr17[2];
                i49 = i69 + i79;
                i54 = i74 - i77;
                i53 = i75 - i78;
                i52 = i76 - i79;
                i59 += width;
                i62++;
                i61 = i;
            }
            i44++;
            iArr6 = iArr13;
            iArr2 = iArr14;
            height = i61;
        }
        bitmap4.setPixels(iArr2, 0, width, 0, 0, width, height);
        Intrinsics.m17074g(bitmap4);
        return bitmap4;
    }
}
