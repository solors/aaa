package androidx.compose.p015ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p015ui.C0825R;
import androidx.compose.p015ui.graphics.AndroidCanvas_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewLayerContainer.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.DrawChildContainer */
/* loaded from: classes.dex */
public class DrawChildContainer extends ViewGroup {
    private boolean isDrawing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawChildContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        setTag(C0825R.C0827id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int childCount = super.getChildCount();
        int i = 0;
        while (true) {
            if (i < childCount) {
                View childAt = getChildAt(i);
                if (childAt != null) {
                    if (((ViewLayer) childAt).isInvalidated()) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            this.isDrawing = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.isDrawing = false;
            }
        }
    }

    public final void drawChild$ui_release(@NotNull androidx.compose.p015ui.graphics.Canvas canvas, @NotNull View view, long j) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        super.drawChild(AndroidCanvas_androidKt.getNativeCanvas(canvas), view, j);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.isDrawing) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
