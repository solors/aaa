package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class p02 extends CheckBox {
    @Nullable

    /* renamed from: a */
    private Drawable f83671a;
    @Nullable

    /* renamed from: b */
    private Drawable f83672b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p02(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setButtonDrawable((Drawable) null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, this.f83671a);
        stateListDrawable.addState(new int[0], this.f83672b);
        setBackground(stateListDrawable);
    }

    public final void setCheckedIcon(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f83671a = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, this.f83671a);
        stateListDrawable.addState(new int[0], this.f83672b);
        setBackground(stateListDrawable);
    }

    public final void setUncheckedIcon(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f83672b = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, this.f83671a);
        stateListDrawable.addState(new int[0], this.f83672b);
        setBackground(stateListDrawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p02(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p02(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
