package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LinearLayoutWithCenteredDividers.kt */
@Metadata
/* loaded from: classes.dex */
public class LinearLayoutWithCenteredDividers extends LinearLayoutCompat {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearLayoutWithCenteredDividers(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawDivider(Canvas canvas, int i, int i2, int i3, int i4) {
        Drawable dividerDrawable = getDividerDrawable();
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        float intrinsicWidth = dividerDrawable.getIntrinsicWidth() / 2.0f;
        float intrinsicHeight = dividerDrawable.getIntrinsicHeight() / 2.0f;
        dividerDrawable.setBounds((int) (f - intrinsicWidth), (int) (f2 - intrinsicHeight), (int) (f + intrinsicWidth), (int) (f2 + intrinsicHeight));
        dividerDrawable.draw(canvas);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    protected void drawHorizontalDivider(@NotNull Canvas canvas, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawDivider(canvas, getPaddingLeft() + getDividerPadding(), i, (getWidth() - getPaddingRight()) - getDividerPadding(), i + getDividerDrawable().getIntrinsicHeight());
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    protected void drawVerticalDivider(@NotNull Canvas canvas, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawDivider(canvas, i, getPaddingTop() + getDividerPadding(), i + getDividerDrawable().getIntrinsicWidth(), (getHeight() - getPaddingBottom()) - getDividerPadding());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearLayoutWithCenteredDividers(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LinearLayoutWithCenteredDividers(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearLayoutWithCenteredDividers(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
