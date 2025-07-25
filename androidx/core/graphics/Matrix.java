package androidx.core.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.graphics.MatrixKt */
/* loaded from: classes.dex */
public final class Matrix {
    @NotNull
    public static final android.graphics.Matrix rotationMatrix(float f, float f2, float f3) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(f, f2, f3);
        return matrix;
    }

    public static /* synthetic */ android.graphics.Matrix rotationMatrix$default(float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        return rotationMatrix(f, f2, f3);
    }

    @NotNull
    public static final android.graphics.Matrix scaleMatrix(float f, float f2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f, f2);
        return matrix;
    }

    public static /* synthetic */ android.graphics.Matrix scaleMatrix$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return scaleMatrix(f, f2);
    }

    @NotNull
    public static final android.graphics.Matrix times(@NotNull android.graphics.Matrix matrix, @NotNull android.graphics.Matrix m) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Intrinsics.checkNotNullParameter(m, "m");
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(matrix);
        matrix2.preConcat(m);
        return matrix2;
    }

    @NotNull
    public static final android.graphics.Matrix translationMatrix(float f, float f2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate(f, f2);
        return matrix;
    }

    public static /* synthetic */ android.graphics.Matrix translationMatrix$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return translationMatrix(f, f2);
    }

    @NotNull
    public static final float[] values(@NotNull android.graphics.Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
