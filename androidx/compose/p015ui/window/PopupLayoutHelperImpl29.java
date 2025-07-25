package androidx.compose.p015ui.window;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidPopup.android.kt */
@RequiresApi(29)
@Metadata
/* renamed from: androidx.compose.ui.window.PopupLayoutHelperImpl29 */
/* loaded from: classes.dex */
public final class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    @Override // androidx.compose.p015ui.window.PopupLayoutHelperImpl, androidx.compose.p015ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(@NotNull View composeView, int i, int i2) {
        List m17160s;
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        m17160s = C37563v.m17160s(new Rect(0, 0, i, i2));
        composeView.setSystemGestureExclusionRects(m17160s);
    }
}
