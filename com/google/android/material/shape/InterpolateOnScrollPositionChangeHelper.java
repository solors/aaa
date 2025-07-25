package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public class InterpolateOnScrollPositionChangeHelper {

    /* renamed from: a */
    private View f38154a;

    /* renamed from: b */
    private MaterialShapeDrawable f38155b;

    /* renamed from: c */
    private ScrollView f38156c;

    /* renamed from: d */
    private final int[] f38157d = new int[2];

    /* renamed from: e */
    private final int[] f38158e = new int[2];

    /* renamed from: f */
    private final ViewTreeObserver.OnScrollChangedListener f38159f = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper.1
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            InterpolateOnScrollPositionChangeHelper.this.updateInterpolationForScreenPosition();
        }
    };

    public InterpolateOnScrollPositionChangeHelper(View view, MaterialShapeDrawable materialShapeDrawable, ScrollView scrollView) {
        this.f38154a = view;
        this.f38155b = materialShapeDrawable;
        this.f38156c = scrollView;
    }

    public void setContainingScrollView(ScrollView scrollView) {
        this.f38156c = scrollView;
    }

    public void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable) {
        this.f38155b = materialShapeDrawable;
    }

    public void startListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f38159f);
    }

    public void stopListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f38159f);
    }

    public void updateInterpolationForScreenPosition() {
        ScrollView scrollView = this.f38156c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() != 0) {
            this.f38156c.getLocationInWindow(this.f38157d);
            this.f38156c.getChildAt(0).getLocationInWindow(this.f38158e);
            int top = (this.f38154a.getTop() - this.f38157d[1]) + this.f38158e[1];
            int height = this.f38154a.getHeight();
            int height2 = this.f38156c.getHeight();
            if (top < 0) {
                this.f38155b.setInterpolation(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
                this.f38154a.invalidate();
                return;
            }
            int i = top + height;
            if (i > height2) {
                this.f38155b.setInterpolation(Math.max(0.0f, Math.min(1.0f, 1.0f - ((i - height2) / height))));
                this.f38154a.invalidate();
                return;
            } else if (this.f38155b.getInterpolation() != 1.0f) {
                this.f38155b.setInterpolation(1.0f);
                this.f38154a.invalidate();
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
    }
}
