package androidx.compose.p015ui.graphics;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidMatrixConversions.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt */
/* loaded from: classes.dex */
public final class AndroidMatrixConversions_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* renamed from: setFrom-EL8BTi8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m107402setFromEL8BTi8(@org.jetbrains.annotations.NotNull android.graphics.Matrix r23, @org.jetbrains.annotations.NotNull float[] r24) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.AndroidMatrixConversions_androidKt.m107402setFromEL8BTi8(android.graphics.Matrix, float[]):void");
    }

    /* renamed from: setFrom-tU-YjHk  reason: not valid java name */
    public static final void m107403setFromtUYjHk(@NotNull float[] setFrom, @NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(setFrom, "$this$setFrom");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix.getValues(setFrom);
        float f = setFrom[0];
        float f2 = setFrom[1];
        float f3 = setFrom[2];
        float f4 = setFrom[3];
        float f5 = setFrom[4];
        float f6 = setFrom[5];
        float f7 = setFrom[6];
        float f8 = setFrom[7];
        float f9 = setFrom[8];
        setFrom[0] = f;
        setFrom[1] = f4;
        setFrom[2] = 0.0f;
        setFrom[3] = f7;
        setFrom[4] = f2;
        setFrom[5] = f5;
        setFrom[6] = 0.0f;
        setFrom[7] = f8;
        setFrom[8] = 0.0f;
        setFrom[9] = 0.0f;
        setFrom[10] = 1.0f;
        setFrom[11] = 0.0f;
        setFrom[12] = f3;
        setFrom[13] = f6;
        setFrom[14] = 0.0f;
        setFrom[15] = f9;
    }
}
