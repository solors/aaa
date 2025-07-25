package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes5.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    private ViewOffsetHelper f36663a;

    /* renamed from: b */
    private int f36664b;

    /* renamed from: c */
    private int f36665c;

    public ViewOffsetBehavior() {
        this.f36664b = 0;
        this.f36665c = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo72177a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    public int getLeftAndRightOffset() {
        ViewOffsetHelper viewOffsetHelper = this.f36663a;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.getLeftAndRightOffset();
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        ViewOffsetHelper viewOffsetHelper = this.f36663a;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.getTopAndBottomOffset();
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        ViewOffsetHelper viewOffsetHelper = this.f36663a;
        if (viewOffsetHelper != null && viewOffsetHelper.isHorizontalOffsetEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isVerticalOffsetEnabled() {
        ViewOffsetHelper viewOffsetHelper = this.f36663a;
        if (viewOffsetHelper != null && viewOffsetHelper.isVerticalOffsetEnabled()) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        mo72177a(coordinatorLayout, v, i);
        if (this.f36663a == null) {
            this.f36663a = new ViewOffsetHelper(v);
        }
        this.f36663a.m72175b();
        this.f36663a.m72176a();
        int i2 = this.f36664b;
        if (i2 != 0) {
            this.f36663a.setTopAndBottomOffset(i2);
            this.f36664b = 0;
        }
        int i3 = this.f36665c;
        if (i3 != 0) {
            this.f36663a.setLeftAndRightOffset(i3);
            this.f36665c = 0;
            return true;
        }
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        ViewOffsetHelper viewOffsetHelper = this.f36663a;
        if (viewOffsetHelper != null) {
            viewOffsetHelper.setHorizontalOffsetEnabled(z);
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        ViewOffsetHelper viewOffsetHelper = this.f36663a;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.setLeftAndRightOffset(i);
        }
        this.f36665c = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        ViewOffsetHelper viewOffsetHelper = this.f36663a;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.setTopAndBottomOffset(i);
        }
        this.f36664b = i;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        ViewOffsetHelper viewOffsetHelper = this.f36663a;
        if (viewOffsetHelper != null) {
            viewOffsetHelper.setVerticalOffsetEnabled(z);
        }
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36664b = 0;
        this.f36665c = 0;
    }
}
