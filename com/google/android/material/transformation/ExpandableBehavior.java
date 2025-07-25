package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;

@Deprecated
/* loaded from: classes5.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    private int f38868a;

    public ExpandableBehavior() {
        this.f38868a = 0;
    }

    /* renamed from: b */
    private boolean m70355b(boolean z) {
        if (z) {
            int i = this.f38868a;
            if (i != 0 && i != 2) {
                return false;
            }
            return true;
        } else if (this.f38868a != 1) {
            return false;
        } else {
            return true;
        }
    }

    @Nullable
    public static <T extends ExpandableBehavior> T from(@NonNull View view, @NonNull Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof ExpandableBehavior) {
                return cls.cast(behavior);
            }
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    @Nullable
    /* renamed from: c */
    protected ExpandableWidget m70354c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View view2 = dependencies.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (ExpandableWidget) view2;
            }
        }
        return null;
    }

    /* renamed from: d */
    protected abstract boolean mo70327d(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (m70355b(expandableWidget.isExpanded())) {
            if (expandableWidget.isExpanded()) {
                i = 1;
            } else {
                i = 2;
            }
            this.f38868a = i;
            return mo70327d((View) expandableWidget, view, expandableWidget.isExpanded(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull final View view, int i) {
        final ExpandableWidget m70354c;
        final int i2;
        if (!ViewCompat.isLaidOut(view) && (m70354c = m70354c(coordinatorLayout, view)) != null && m70355b(m70354c.isExpanded())) {
            if (m70354c.isExpanded()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            this.f38868a = i2;
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (ExpandableBehavior.this.f38868a == i2) {
                        ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                        ExpandableWidget expandableWidget = m70354c;
                        expandableBehavior.mo70327d((View) expandableWidget, view, expandableWidget.isExpanded(), false);
                    }
                    return false;
                }
            });
            return false;
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38868a = 0;
    }
}
