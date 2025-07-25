package androidx.compose.p015ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p015ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p015ui.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.CalculateMatrixToWindowApi21 */
/* loaded from: classes.dex */
public final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    @NotNull
    private final int[] tmpLocation = new int[2];
    @NotNull
    private final float[] tmpMatrix = Matrix.m107721constructorimpl$default(null, 1, null);

    /* renamed from: preConcat-tU-YjHk  reason: not valid java name */
    private final void m109216preConcattUYjHk(float[] fArr, android.graphics.Matrix matrix) {
        AndroidMatrixConversions_androidKt.m107403setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m109211preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM  reason: not valid java name */
    private final void m109217preTranslate3XD1CNM(float[] fArr, float f, float f2) {
        Matrix.m107730resetimpl(this.tmpMatrix);
        Matrix.m107741translateimpl$default(this.tmpMatrix, f, f2, 0.0f, 4, null);
        AndroidComposeView_androidKt.m109211preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8  reason: not valid java name */
    private final void m109218transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            m109218transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m109217preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m109217preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.tmpLocation;
            view.getLocationInWindow(iArr);
            m109217preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m109217preTranslate3XD1CNM(fArr, iArr[0], iArr[1]);
        }
        android.graphics.Matrix viewMatrix = view.getMatrix();
        if (!viewMatrix.isIdentity()) {
            Intrinsics.checkNotNullExpressionValue(viewMatrix, "viewMatrix");
            m109216preConcattUYjHk(fArr, viewMatrix);
        }
    }

    @Override // androidx.compose.p015ui.platform.CalculateMatrixToWindow
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo109215calculateMatrixToWindowEL8BTi8(@NotNull View view, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Matrix.m107730resetimpl(matrix);
        m109218transformMatrixToWindowEL8BTi8(view, matrix);
    }
}
