package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.layout.LayoutCoordinatesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BringIntoViewResponder.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class AndroidBringIntoViewParent implements BringIntoViewParent {
    @NotNull
    private final View view;

    public AndroidBringIntoViewParent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    @Nullable
    public Object bringChildIntoView(@NotNull Rect rect, @NotNull LayoutCoordinates layoutCoordinates, @NotNull Continuation<? super Unit> continuation) {
        android.graphics.Rect rect2;
        Rect m107328translatek4lQ0M = rect.m107328translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        View view = this.view;
        rect2 = BringIntoViewResponder_androidKt.toRect(m107328translatek4lQ0M);
        view.requestRectangleOnScreen(rect2, false);
        return Unit.f99208a;
    }
}
