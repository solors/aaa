package io.bidmachine.nativead.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.utils.ViewHelper;

/* loaded from: classes9.dex */
class NativeAdContainer extends FrameLayout {
    FrameLayout innerContainer;
    @VisibleForTesting
    View previousConfiguredAdContainer;

    public NativeAdContainer(@NonNull Context context) {
        super(context);
        init(context);
    }

    private void init(@NonNull Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.innerContainer = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view);
        } else {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        FrameLayout frameLayout = this.innerContainer;
        if (frameLayout != null) {
            frameLayout.bringChildToFront(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void configureContainer(@NonNull ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        super.removeView(this.innerContainer);
        ViewHelper.removeViewFromParent(this.innerContainer);
        ViewHelper.removeViewFromParent(viewGroup);
        removePreviousAdContainer();
        super.addView(viewGroup, 0, layoutParams);
        viewGroup.addView(this.innerContainer, 0, layoutParams);
        this.previousConfiguredAdContainer = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void deConfigureContainer() {
        if (this.previousConfiguredAdContainer != null) {
            ViewHelper.removeViewFromParent(this.innerContainer);
            removePreviousAdContainer();
            super.addView(this.innerContainer, 0, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        FrameLayout frameLayout = this.innerContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    protected void removePreviousAdContainer() {
        View view = this.previousConfiguredAdContainer;
        if (view != null) {
            super.removeView(view);
            this.previousConfiguredAdContainer = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view == this.previousConfiguredAdContainer) {
            removePreviousAdContainer();
            return;
        }
        FrameLayout frameLayout = this.innerContainer;
        if (frameLayout != null) {
            frameLayout.removeView(view);
        }
    }

    public NativeAdContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, i);
        } else {
            super.addView(view, i);
        }
    }

    public NativeAdContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public NativeAdContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, i, i2);
        } else {
            super.addView(view, i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }
}
