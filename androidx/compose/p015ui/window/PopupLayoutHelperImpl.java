package androidx.compose.p015ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidPopup.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.window.PopupLayoutHelperImpl */
/* loaded from: classes.dex */
public class PopupLayoutHelperImpl implements PopupLayoutHelper {
    @Override // androidx.compose.p015ui.window.PopupLayoutHelper
    public void getWindowVisibleDisplayFrame(@NotNull View composeView, @NotNull Rect outRect) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        composeView.getWindowVisibleDisplayFrame(outRect);
    }

    @Override // androidx.compose.p015ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(@NotNull View composeView, int i, int i2) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
    }

    @Override // androidx.compose.p015ui.window.PopupLayoutHelper
    public void updateViewLayout(@NotNull WindowManager windowManager, @NotNull View popupView, @NotNull ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(popupView, "popupView");
        Intrinsics.checkNotNullParameter(params, "params");
        windowManager.updateViewLayout(popupView, params);
    }
}
