package androidx.compose.p015ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Matrix.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.MatrixKt */
/* loaded from: classes.dex */
public final class MatrixKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dot-p89u6pk  reason: not valid java name */
    public static final float m107744dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 0] * fArr2[0 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    /* renamed from: isIdentity-58bKbWc  reason: not valid java name */
    public static final boolean m107745isIdentity58bKbWc(@NotNull float[] isIdentity) {
        float f;
        boolean z;
        Intrinsics.checkNotNullParameter(isIdentity, "$this$isIdentity");
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (i == i2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                if (isIdentity[(i * 4) + i2] == f) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }
}
