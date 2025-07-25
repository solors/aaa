package androidx.compose.p015ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeView.android.kt */
@RequiresApi(29)
@Metadata
/* renamed from: androidx.compose.ui.platform.CalculateMatrixToWindowApi29 */
/* loaded from: classes.dex */
public final class CalculateMatrixToWindowApi29 implements CalculateMatrixToWindow {
    @NotNull
    private final Matrix tmpMatrix = new Matrix();
    @NotNull
    private final int[] tmpPosition = new int[2];

    @Override // androidx.compose.p015ui.platform.CalculateMatrixToWindow
    @DoNotInline
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo109215calculateMatrixToWindowEL8BTi8(@NotNull View view, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.tmpMatrix.reset();
        view.transformMatrixToGlobal(this.tmpMatrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.tmpPosition);
        int[] iArr = this.tmpPosition;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.tmpPosition;
        this.tmpMatrix.postTranslate(iArr2[0] - i, iArr2[1] - i2);
        AndroidMatrixConversions_androidKt.m107403setFromtUYjHk(matrix, this.tmpMatrix);
    }
}
