package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.geometry.MutableRect;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.geometry.Rect;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Indent;
import org.jetbrains.annotations.NotNull;

/* compiled from: Matrix.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.Matrix */
/* loaded from: classes.dex */
public final class Matrix {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    @NotNull
    private final float[] values;

    /* compiled from: Matrix.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.Matrix$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Matrix m107719boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    @NotNull
    /* renamed from: constructor-impl */
    public static float[] m107720constructorimpl(@NotNull float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    /* renamed from: constructor-impl$default */
    public static /* synthetic */ float[] m107721constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m107720constructorimpl(fArr);
    }

    /* renamed from: equals-impl */
    public static boolean m107722equalsimpl(float[] fArr, Object obj) {
        if (!(obj instanceof Matrix) || !Intrinsics.m17075f(fArr, ((Matrix) obj).m107742unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0 */
    public static final boolean m107723equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.m17075f(fArr, fArr2);
    }

    /* renamed from: get-impl */
    public static final float m107724getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 4) + i2];
    }

    /* renamed from: hashCode-impl */
    public static int m107725hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl */
    public static final void m107726invertimpl(float[] fArr) {
        boolean z;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f17 * f28) - (f18 * f27)) + (f19 * f26)) + (f20 * f25)) - (f21 * f24)) + (f22 * f23);
        if (f29 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        float f30 = 1.0f / f29;
        fArr[0] = (((f6 * f28) - (f7 * f27)) + (f8 * f26)) * f30;
        fArr[1] = ((((-f2) * f28) + (f3 * f27)) - (f4 * f26)) * f30;
        fArr[2] = (((f14 * f22) - (f15 * f21)) + (f16 * f20)) * f30;
        fArr[3] = ((((-f10) * f22) + (f11 * f21)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr[4] = (((f31 * f28) + (f7 * f25)) - (f8 * f24)) * f30;
        fArr[5] = (((f28 * f) - (f3 * f25)) + (f4 * f24)) * f30;
        float f32 = -f13;
        fArr[6] = (((f32 * f22) + (f15 * f19)) - (f16 * f18)) * f30;
        fArr[7] = (((f22 * f9) - (f11 * f19)) + (f12 * f18)) * f30;
        fArr[8] = (((f5 * f27) - (f6 * f25)) + (f8 * f23)) * f30;
        fArr[9] = ((((-f) * f27) + (f25 * f2)) - (f4 * f23)) * f30;
        fArr[10] = (((f13 * f21) - (f14 * f19)) + (f16 * f17)) * f30;
        fArr[11] = ((((-f9) * f21) + (f19 * f10)) - (f12 * f17)) * f30;
        fArr[12] = (((f31 * f26) + (f6 * f24)) - (f7 * f23)) * f30;
        fArr[13] = (((f * f26) - (f2 * f24)) + (f3 * f23)) * f30;
        fArr[14] = (((f32 * f20) + (f14 * f18)) - (f15 * f17)) * f30;
        fArr[15] = (((f9 * f20) - (f10 * f18)) + (f11 * f17)) * f30;
    }

    /* renamed from: map-MK-Hz9U */
    public static final long m107727mapMKHz9U(float[] fArr, long j) {
        boolean z;
        float m107291getXimpl = Offset.m107291getXimpl(j);
        float m107292getYimpl = Offset.m107292getYimpl(j);
        float f = 1 / (((fArr[3] * m107291getXimpl) + (fArr[7] * m107292getYimpl)) + fArr[15]);
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f = 0.0f;
        }
        return OffsetKt.Offset(((fArr[0] * m107291getXimpl) + (fArr[4] * m107292getYimpl) + fArr[12]) * f, f * ((fArr[1] * m107291getXimpl) + (fArr[5] * m107292getYimpl) + fArr[13]));
    }

    @NotNull
    /* renamed from: map-impl */
    public static final Rect m107728mapimpl(float[] fArr, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        long m107727mapMKHz9U = m107727mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long m107727mapMKHz9U2 = m107727mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long m107727mapMKHz9U3 = m107727mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long m107727mapMKHz9U4 = m107727mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        return new Rect(Math.min(Math.min(Offset.m107291getXimpl(m107727mapMKHz9U), Offset.m107291getXimpl(m107727mapMKHz9U2)), Math.min(Offset.m107291getXimpl(m107727mapMKHz9U3), Offset.m107291getXimpl(m107727mapMKHz9U4))), Math.min(Math.min(Offset.m107292getYimpl(m107727mapMKHz9U), Offset.m107292getYimpl(m107727mapMKHz9U2)), Math.min(Offset.m107292getYimpl(m107727mapMKHz9U3), Offset.m107292getYimpl(m107727mapMKHz9U4))), Math.max(Math.max(Offset.m107291getXimpl(m107727mapMKHz9U), Offset.m107291getXimpl(m107727mapMKHz9U2)), Math.max(Offset.m107291getXimpl(m107727mapMKHz9U3), Offset.m107291getXimpl(m107727mapMKHz9U4))), Math.max(Math.max(Offset.m107292getYimpl(m107727mapMKHz9U), Offset.m107292getYimpl(m107727mapMKHz9U2)), Math.max(Offset.m107292getYimpl(m107727mapMKHz9U3), Offset.m107292getYimpl(m107727mapMKHz9U4))));
    }

    /* renamed from: reset-impl */
    public static final void m107730resetimpl(float[] fArr) {
        float f;
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (i == i2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[(i2 * 4) + i] = f;
            }
        }
    }

    /* renamed from: rotateX-impl */
    public static final void m107731rotateXimpl(float[] fArr, float f) {
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[9];
        float f7 = fArr[10];
        float f8 = fArr[13];
        float f9 = fArr[14];
        fArr[1] = (f2 * cos) - (f3 * sin);
        fArr[2] = (f2 * sin) + (f3 * cos);
        fArr[5] = (f4 * cos) - (f5 * sin);
        fArr[6] = (f4 * sin) + (f5 * cos);
        fArr[9] = (f6 * cos) - (f7 * sin);
        fArr[10] = (f6 * sin) + (f7 * cos);
        fArr[13] = (f8 * cos) - (f9 * sin);
        fArr[14] = (f8 * sin) + (f9 * cos);
    }

    /* renamed from: rotateY-impl */
    public static final void m107732rotateYimpl(float[] fArr, float f) {
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[2];
        float f4 = fArr[4];
        float f5 = fArr[6];
        float f6 = fArr[8];
        float f7 = fArr[10];
        float f8 = fArr[12];
        float f9 = fArr[14];
        fArr[0] = (f2 * cos) + (f3 * sin);
        fArr[2] = ((-f2) * sin) + (f3 * cos);
        fArr[4] = (f4 * cos) + (f5 * sin);
        fArr[6] = ((-f4) * sin) + (f5 * cos);
        fArr[8] = (f6 * cos) + (f7 * sin);
        fArr[10] = ((-f6) * sin) + (f7 * cos);
        fArr[12] = (f8 * cos) + (f9 * sin);
        fArr[14] = ((-f8) * sin) + (f9 * cos);
    }

    /* renamed from: rotateZ-impl */
    public static final void m107733rotateZimpl(float[] fArr, float f) {
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = -sin;
        float f5 = fArr[1];
        float f6 = fArr[5];
        float f7 = fArr[2];
        float f8 = fArr[6];
        float f9 = fArr[3];
        float f10 = fArr[7];
        fArr[0] = (cos * f2) + (sin * f3);
        fArr[1] = (cos * f5) + (sin * f6);
        fArr[2] = (cos * f7) + (sin * f8);
        fArr[3] = (cos * f9) + (sin * f10);
        fArr[4] = (f2 * f4) + (f3 * cos);
        fArr[5] = (f5 * f4) + (f6 * cos);
        fArr[6] = (f7 * f4) + (f8 * cos);
        fArr[7] = (f4 * f9) + (cos * f10);
    }

    /* renamed from: scale-impl */
    public static final void m107734scaleimpl(float[] fArr, float f, float f2, float f3) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* renamed from: scale-impl$default */
    public static /* synthetic */ void m107735scaleimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        m107734scaleimpl(fArr, f, f2, f3);
    }

    /* renamed from: set-impl */
    public static final void m107736setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 4) + i2] = f;
    }

    /* renamed from: setFrom-58bKbWc */
    public static final void m107737setFrom58bKbWc(float[] fArr, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        for (int i = 0; i < 16; i++) {
            fArr[i] = matrix[i];
        }
    }

    /* renamed from: timesAssign-58bKbWc */
    public static final void m107738timesAssign58bKbWc(float[] fArr, @NotNull float[] m) {
        float m107744dotp89u6pk;
        float m107744dotp89u6pk2;
        float m107744dotp89u6pk3;
        float m107744dotp89u6pk4;
        float m107744dotp89u6pk5;
        float m107744dotp89u6pk6;
        float m107744dotp89u6pk7;
        float m107744dotp89u6pk8;
        float m107744dotp89u6pk9;
        float m107744dotp89u6pk10;
        float m107744dotp89u6pk11;
        float m107744dotp89u6pk12;
        float m107744dotp89u6pk13;
        float m107744dotp89u6pk14;
        float m107744dotp89u6pk15;
        float m107744dotp89u6pk16;
        Intrinsics.checkNotNullParameter(m, "m");
        m107744dotp89u6pk = MatrixKt.m107744dotp89u6pk(fArr, 0, m, 0);
        m107744dotp89u6pk2 = MatrixKt.m107744dotp89u6pk(fArr, 0, m, 1);
        m107744dotp89u6pk3 = MatrixKt.m107744dotp89u6pk(fArr, 0, m, 2);
        m107744dotp89u6pk4 = MatrixKt.m107744dotp89u6pk(fArr, 0, m, 3);
        m107744dotp89u6pk5 = MatrixKt.m107744dotp89u6pk(fArr, 1, m, 0);
        m107744dotp89u6pk6 = MatrixKt.m107744dotp89u6pk(fArr, 1, m, 1);
        m107744dotp89u6pk7 = MatrixKt.m107744dotp89u6pk(fArr, 1, m, 2);
        m107744dotp89u6pk8 = MatrixKt.m107744dotp89u6pk(fArr, 1, m, 3);
        m107744dotp89u6pk9 = MatrixKt.m107744dotp89u6pk(fArr, 2, m, 0);
        m107744dotp89u6pk10 = MatrixKt.m107744dotp89u6pk(fArr, 2, m, 1);
        m107744dotp89u6pk11 = MatrixKt.m107744dotp89u6pk(fArr, 2, m, 2);
        m107744dotp89u6pk12 = MatrixKt.m107744dotp89u6pk(fArr, 2, m, 3);
        m107744dotp89u6pk13 = MatrixKt.m107744dotp89u6pk(fArr, 3, m, 0);
        m107744dotp89u6pk14 = MatrixKt.m107744dotp89u6pk(fArr, 3, m, 1);
        m107744dotp89u6pk15 = MatrixKt.m107744dotp89u6pk(fArr, 3, m, 2);
        m107744dotp89u6pk16 = MatrixKt.m107744dotp89u6pk(fArr, 3, m, 3);
        fArr[0] = m107744dotp89u6pk;
        fArr[1] = m107744dotp89u6pk2;
        fArr[2] = m107744dotp89u6pk3;
        fArr[3] = m107744dotp89u6pk4;
        fArr[4] = m107744dotp89u6pk5;
        fArr[5] = m107744dotp89u6pk6;
        fArr[6] = m107744dotp89u6pk7;
        fArr[7] = m107744dotp89u6pk8;
        fArr[8] = m107744dotp89u6pk9;
        fArr[9] = m107744dotp89u6pk10;
        fArr[10] = m107744dotp89u6pk11;
        fArr[11] = m107744dotp89u6pk12;
        fArr[12] = m107744dotp89u6pk13;
        fArr[13] = m107744dotp89u6pk14;
        fArr[14] = m107744dotp89u6pk15;
        fArr[15] = m107744dotp89u6pk16;
    }

    @NotNull
    /* renamed from: toString-impl */
    public static String m107739toStringimpl(float[] fArr) {
        String m16649f;
        m16649f = Indent.m16649f("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
        return m16649f;
    }

    /* renamed from: translate-impl */
    public static final void m107740translateimpl(float[] fArr, float f, float f2, float f3) {
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
    }

    /* renamed from: translate-impl$default */
    public static /* synthetic */ void m107741translateimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m107740translateimpl(fArr, f, f2, f3);
    }

    public boolean equals(Object obj) {
        return m107722equalsimpl(this.values, obj);
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m107725hashCodeimpl(this.values);
    }

    @NotNull
    public String toString() {
        return m107739toStringimpl(this.values);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ float[] m107742unboximpl() {
        return this.values;
    }

    /* renamed from: map-impl */
    public static final void m107729mapimpl(float[] fArr, @NotNull MutableRect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        long m107727mapMKHz9U = m107727mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long m107727mapMKHz9U2 = m107727mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long m107727mapMKHz9U3 = m107727mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long m107727mapMKHz9U4 = m107727mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        rect.setLeft(Math.min(Math.min(Offset.m107291getXimpl(m107727mapMKHz9U), Offset.m107291getXimpl(m107727mapMKHz9U2)), Math.min(Offset.m107291getXimpl(m107727mapMKHz9U3), Offset.m107291getXimpl(m107727mapMKHz9U4))));
        rect.setTop(Math.min(Math.min(Offset.m107292getYimpl(m107727mapMKHz9U), Offset.m107292getYimpl(m107727mapMKHz9U2)), Math.min(Offset.m107292getYimpl(m107727mapMKHz9U3), Offset.m107292getYimpl(m107727mapMKHz9U4))));
        rect.setRight(Math.max(Math.max(Offset.m107291getXimpl(m107727mapMKHz9U), Offset.m107291getXimpl(m107727mapMKHz9U2)), Math.max(Offset.m107291getXimpl(m107727mapMKHz9U3), Offset.m107291getXimpl(m107727mapMKHz9U4))));
        rect.setBottom(Math.max(Math.max(Offset.m107292getYimpl(m107727mapMKHz9U), Offset.m107292getYimpl(m107727mapMKHz9U2)), Math.max(Offset.m107292getYimpl(m107727mapMKHz9U3), Offset.m107292getYimpl(m107727mapMKHz9U4))));
    }
}
