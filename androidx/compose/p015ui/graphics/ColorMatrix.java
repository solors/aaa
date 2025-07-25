package androidx.compose.p015ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorMatrix.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.ColorMatrix */
/* loaded from: classes.dex */
public final class ColorMatrix {
    @NotNull
    private final float[] values;

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m107583boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static float[] m107584constructorimpl(@NotNull float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ float[] m107585constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m107584constructorimpl(fArr);
    }

    /* renamed from: convertRgbToYuv-impl  reason: not valid java name */
    public static final void m107586convertRgbToYuvimpl(float[] fArr) {
        m107593resetimpl(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl  reason: not valid java name */
    public static final void m107587convertYuvToRgbimpl(float[] fArr) {
        m107593resetimpl(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* renamed from: dot-Me4OoYI  reason: not valid java name */
    private static final float m107588dotMe4OoYI(float[] fArr, float[] fArr2, int i, float[] fArr3, int i2) {
        int i3 = i * 5;
        return (fArr2[i3 + 0] * fArr3[0 + i2]) + (fArr2[i3 + 1] * fArr3[5 + i2]) + (fArr2[i3 + 2] * fArr3[10 + i2]) + (fArr2[i3 + 3] * fArr3[15 + i2]);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107589equalsimpl(float[] fArr, Object obj) {
        if (!(obj instanceof ColorMatrix) || !Intrinsics.m17075f(fArr, ((ColorMatrix) obj).m107604unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107590equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.m17075f(fArr, fArr2);
    }

    /* renamed from: get-impl  reason: not valid java name */
    public static final float m107591getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 5) + i2];
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107592hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: reset-impl  reason: not valid java name */
    public static final void m107593resetimpl(float[] fArr) {
        _ArraysJvm.m17382w(fArr, 0.0f, 0, 0, 6, null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    /* renamed from: rotateInternal-impl  reason: not valid java name */
    private static final void m107594rotateInternalimpl(float[] fArr, float f, Function2<? super Float, ? super Float, Unit> function2) {
        m107593resetimpl(fArr);
        double d = (f * 3.141592653589793d) / 180.0d;
        function2.mo105910invoke(Float.valueOf((float) Math.cos(d)), Float.valueOf((float) Math.sin(d)));
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final void m107595setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 5) + i2] = f;
    }

    /* renamed from: set-jHG-Opc  reason: not valid java name */
    public static final void m107596setjHGOpc(float[] fArr, @NotNull float[] src) {
        Intrinsics.checkNotNullParameter(src, "src");
        _ArraysJvm.m17391n(src, fArr, 0, 0, 0, 14, null);
    }

    /* renamed from: setToRotateBlue-impl  reason: not valid java name */
    public static final void m107597setToRotateBlueimpl(float[] fArr, float f) {
        m107593resetimpl(fArr);
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        fArr[6] = cos;
        fArr[0] = cos;
        fArr[1] = sin;
        fArr[5] = -sin;
    }

    /* renamed from: setToRotateGreen-impl  reason: not valid java name */
    public static final void m107598setToRotateGreenimpl(float[] fArr, float f) {
        m107593resetimpl(fArr);
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        fArr[12] = cos;
        fArr[0] = cos;
        fArr[2] = -sin;
        fArr[10] = sin;
    }

    /* renamed from: setToRotateRed-impl  reason: not valid java name */
    public static final void m107599setToRotateRedimpl(float[] fArr, float f) {
        m107593resetimpl(fArr);
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        fArr[12] = cos;
        fArr[6] = cos;
        fArr[7] = sin;
        fArr[11] = -sin;
    }

    /* renamed from: setToSaturation-impl  reason: not valid java name */
    public static final void m107600setToSaturationimpl(float[] fArr, float f) {
        m107593resetimpl(fArr);
        float f2 = 1 - f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + f;
    }

    /* renamed from: setToScale-impl  reason: not valid java name */
    public static final void m107601setToScaleimpl(float[] fArr, float f, float f2, float f3, float f4) {
        m107593resetimpl(fArr);
        fArr[0] = f;
        fArr[6] = f2;
        fArr[12] = f3;
        fArr[18] = f4;
    }

    /* renamed from: timesAssign-jHG-Opc  reason: not valid java name */
    public static final void m107602timesAssignjHGOpc(float[] fArr, @NotNull float[] colorMatrix) {
        Intrinsics.checkNotNullParameter(colorMatrix, "colorMatrix");
        float m107588dotMe4OoYI = m107588dotMe4OoYI(fArr, fArr, 0, colorMatrix, 0);
        float m107588dotMe4OoYI2 = m107588dotMe4OoYI(fArr, fArr, 0, colorMatrix, 1);
        float m107588dotMe4OoYI3 = m107588dotMe4OoYI(fArr, fArr, 0, colorMatrix, 2);
        float m107588dotMe4OoYI4 = m107588dotMe4OoYI(fArr, fArr, 0, colorMatrix, 3);
        float f = (fArr[0] * colorMatrix[4]) + (fArr[1] * colorMatrix[9]) + (fArr[2] * colorMatrix[14]) + (fArr[3] * colorMatrix[19]) + fArr[4];
        float m107588dotMe4OoYI5 = m107588dotMe4OoYI(fArr, fArr, 1, colorMatrix, 0);
        float m107588dotMe4OoYI6 = m107588dotMe4OoYI(fArr, fArr, 1, colorMatrix, 1);
        float m107588dotMe4OoYI7 = m107588dotMe4OoYI(fArr, fArr, 1, colorMatrix, 2);
        float m107588dotMe4OoYI8 = m107588dotMe4OoYI(fArr, fArr, 1, colorMatrix, 3);
        float f2 = (fArr[5] * colorMatrix[4]) + (fArr[6] * colorMatrix[9]) + (fArr[7] * colorMatrix[14]) + (fArr[8] * colorMatrix[19]) + fArr[9];
        float m107588dotMe4OoYI9 = m107588dotMe4OoYI(fArr, fArr, 2, colorMatrix, 0);
        float m107588dotMe4OoYI10 = m107588dotMe4OoYI(fArr, fArr, 2, colorMatrix, 1);
        float m107588dotMe4OoYI11 = m107588dotMe4OoYI(fArr, fArr, 2, colorMatrix, 2);
        float m107588dotMe4OoYI12 = m107588dotMe4OoYI(fArr, fArr, 2, colorMatrix, 3);
        float f3 = (fArr[10] * colorMatrix[4]) + (fArr[11] * colorMatrix[9]) + (fArr[12] * colorMatrix[14]) + (fArr[13] * colorMatrix[19]) + fArr[14];
        float m107588dotMe4OoYI13 = m107588dotMe4OoYI(fArr, fArr, 3, colorMatrix, 0);
        float m107588dotMe4OoYI14 = m107588dotMe4OoYI(fArr, fArr, 3, colorMatrix, 1);
        float m107588dotMe4OoYI15 = m107588dotMe4OoYI(fArr, fArr, 3, colorMatrix, 2);
        float m107588dotMe4OoYI16 = m107588dotMe4OoYI(fArr, fArr, 3, colorMatrix, 3);
        fArr[0] = m107588dotMe4OoYI;
        fArr[1] = m107588dotMe4OoYI2;
        fArr[2] = m107588dotMe4OoYI3;
        fArr[3] = m107588dotMe4OoYI4;
        fArr[4] = f;
        fArr[5] = m107588dotMe4OoYI5;
        fArr[6] = m107588dotMe4OoYI6;
        fArr[7] = m107588dotMe4OoYI7;
        fArr[8] = m107588dotMe4OoYI8;
        fArr[9] = f2;
        fArr[10] = m107588dotMe4OoYI9;
        fArr[11] = m107588dotMe4OoYI10;
        fArr[12] = m107588dotMe4OoYI11;
        fArr[13] = m107588dotMe4OoYI12;
        fArr[14] = f3;
        fArr[15] = m107588dotMe4OoYI13;
        fArr[16] = m107588dotMe4OoYI14;
        fArr[17] = m107588dotMe4OoYI15;
        fArr[18] = m107588dotMe4OoYI16;
        fArr[19] = (fArr[15] * colorMatrix[4]) + (fArr[16] * colorMatrix[9]) + (fArr[17] * colorMatrix[14]) + (fArr[18] * colorMatrix[19]) + fArr[19];
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107603toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m107589equalsimpl(this.values, obj);
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m107592hashCodeimpl(this.values);
    }

    public String toString() {
        return m107603toStringimpl(this.values);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float[] m107604unboximpl() {
        return this.values;
    }
}
