package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sa.C39638b;

/* compiled from: SeparatorView.kt */
@Metadata
/* loaded from: classes8.dex */
public class SeparatorView extends View {
    @NotNull

    /* renamed from: b */
    private final Paint f76101b;
    @NotNull

    /* renamed from: c */
    private final Rect f76102c;

    /* renamed from: d */
    private boolean f76103d;

    /* renamed from: f */
    private boolean f76104f;

    /* renamed from: g */
    private int f76105g;

    /* renamed from: h */
    private int f76106h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeparatorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    private final int m36387a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                return size;
            }
            return i;
        }
        return Math.min(i, size);
    }

    /* renamed from: b */
    private final boolean m36386b() {
        if (Color.alpha(this.f76101b.getColor()) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m36385c() {
        int paddingLeft;
        int paddingRight;
        int width;
        if (!this.f76103d) {
            return;
        }
        if (this.f76104f) {
            paddingLeft = getPaddingTop();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (this.f76104f) {
            paddingRight = getPaddingBottom();
        } else {
            paddingRight = getPaddingRight();
        }
        if (this.f76104f) {
            width = getHeight();
        } else {
            width = getWidth();
        }
        int i = (width - paddingLeft) - paddingRight;
        int i2 = this.f76106h;
        if (i2 != 17) {
            if (i2 != 8388611) {
                if (i2 != 8388613) {
                    C39638b.m12001k("Unknown divider gravity value");
                    paddingLeft = 0;
                } else {
                    paddingLeft = (width - paddingRight) - this.f76105g;
                }
            }
        } else {
            paddingLeft += (i - this.f76105g) / 2;
        }
        if (this.f76104f) {
            Rect rect = this.f76102c;
            rect.top = paddingLeft;
            rect.bottom = paddingLeft + Math.min(i, this.f76105g);
            this.f76102c.left = getPaddingLeft();
            this.f76102c.right = getWidth() - getPaddingRight();
        } else {
            Rect rect2 = this.f76102c;
            rect2.left = paddingLeft;
            rect2.right = paddingLeft + Math.min(i, this.f76105g);
            this.f76102c.top = getPaddingTop();
            this.f76102c.bottom = getHeight() - getPaddingBottom();
        }
        this.f76103d = false;
    }

    public final int getDividerColor() {
        return this.f76101b.getColor();
    }

    public final int getDividerGravity() {
        return this.f76106h;
    }

    public final int getDividerThickness() {
        return this.f76105g;
    }

    public final boolean isHorizontal() {
        return this.f76104f;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (m36386b()) {
            m36385c();
            canvas.drawRect(this.f76102c, this.f76101b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f76104f) {
            paddingTop += this.f76105g;
        } else {
            paddingLeft += this.f76105g;
        }
        setMeasuredDimension(m36387a(Math.max(paddingLeft, getSuggestedMinimumWidth()), i), m36387a(Math.max(paddingTop, getSuggestedMinimumHeight()), i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f76103d = true;
    }

    public final void setDividerColor(int i) {
        if (this.f76101b.getColor() != i) {
            this.f76101b.setColor(i);
            invalidate();
        }
    }

    public final void setDividerColorResource(@ColorRes int i) {
        setDividerColor(ContextCompat.getColor(getContext(), i));
    }

    public final void setDividerGravity(int i) {
        if (this.f76106h != i) {
            this.f76106h = i;
            this.f76103d = true;
            invalidate();
        }
    }

    public final void setDividerHeightResource(@DimenRes int i) {
        setDividerThickness(getResources().getDimensionPixelSize(i));
    }

    public final void setDividerThickness(int i) {
        if (this.f76105g != i) {
            this.f76105g = i;
            this.f76103d = true;
            requestLayout();
        }
    }

    public final void setHorizontal(boolean z) {
        if (this.f76104f != z) {
            this.f76104f = z;
            this.f76103d = true;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.f76103d = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeparatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SeparatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setColor(0);
        this.f76101b = paint;
        this.f76102c = new Rect();
        this.f76104f = true;
        this.f76106h = 17;
    }

    public static /* synthetic */ void getDividerGravity$annotations() {
    }
}
