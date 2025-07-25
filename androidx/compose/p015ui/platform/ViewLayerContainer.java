package androidx.compose.p015ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewLayerContainer.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.ViewLayerContainer */
/* loaded from: classes.dex */
public final class ViewLayerContainer extends DrawChildContainer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayerContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.compose.p015ui.platform.DrawChildContainer, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    protected final void dispatchGetDisplayList() {
    }
}
