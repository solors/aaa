package com.google.android.material.expandable;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes5.dex */
public final class ExpandableWidgetHelper {
    @NonNull

    /* renamed from: a */
    private final View f37481a;

    /* renamed from: b */
    private boolean f37482b = false;
    @IdRes

    /* renamed from: c */
    private int f37483c = 0;

    public ExpandableWidgetHelper(ExpandableWidget expandableWidget) {
        this.f37481a = (View) expandableWidget;
    }

    /* renamed from: a */
    private void m71476a() {
        ViewParent parent = this.f37481a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.f37481a);
        }
    }

    @IdRes
    public int getExpandedComponentIdHint() {
        return this.f37483c;
    }

    public boolean isExpanded() {
        return this.f37482b;
    }

    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        this.f37482b = bundle.getBoolean("expanded", false);
        this.f37483c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f37482b) {
            m71476a();
        }
    }

    @NonNull
    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f37482b);
        bundle.putInt("expandedComponentIdHint", this.f37483c);
        return bundle;
    }

    public boolean setExpanded(boolean z) {
        if (this.f37482b != z) {
            this.f37482b = z;
            m71476a();
            return true;
        }
        return false;
    }

    public void setExpandedComponentIdHint(@IdRes int i) {
        this.f37483c = i;
    }
}
