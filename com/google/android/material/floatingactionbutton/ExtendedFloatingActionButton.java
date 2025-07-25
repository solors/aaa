package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.C16310R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import java.util.List;

/* loaded from: classes5.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: F */
    private static final int f37509F = C16310R.C16317style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: G */
    static final Property<View, Float> f37510G = new Property<View, Float>(Float.class, "width") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.4
        @Override // android.util.Property
        @NonNull
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public void set(@NonNull View view, @NonNull Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    };

    /* renamed from: H */
    static final Property<View, Float> f37511H = new Property<View, Float>(Float.class, "height") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
        @Override // android.util.Property
        @NonNull
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public void set(@NonNull View view, @NonNull Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    };

    /* renamed from: I */
    static final Property<View, Float> f37512I = new Property<View, Float>(Float.class, "paddingStart") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.6
        @Override // android.util.Property
        @NonNull
        public Float get(@NonNull View view) {
            return Float.valueOf(ViewCompat.getPaddingStart(view));
        }

        @Override // android.util.Property
        public void set(@NonNull View view, @NonNull Float f) {
            ViewCompat.setPaddingRelative(view, f.intValue(), view.getPaddingTop(), ViewCompat.getPaddingEnd(view), view.getPaddingBottom());
        }
    };

    /* renamed from: J */
    static final Property<View, Float> f37513J = new Property<View, Float>(Float.class, "paddingEnd") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.7
        @Override // android.util.Property
        @NonNull
        public Float get(@NonNull View view) {
            return Float.valueOf(ViewCompat.getPaddingEnd(view));
        }

        @Override // android.util.Property
        public void set(@NonNull View view, @NonNull Float f) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    };

    /* renamed from: A */
    private int f37514A;
    @NonNull

    /* renamed from: B */
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> f37515B;

    /* renamed from: C */
    private boolean f37516C;

    /* renamed from: D */
    private boolean f37517D;

    /* renamed from: E */
    private boolean f37518E;
    @NonNull
    protected ColorStateList originalTextCsl;

    /* renamed from: s */
    private int f37519s;

    /* renamed from: t */
    private final AnimatorTracker f37520t;
    @NonNull

    /* renamed from: u */
    private final MotionStrategy f37521u;
    @NonNull

    /* renamed from: v */
    private final MotionStrategy f37522v;

    /* renamed from: w */
    private final MotionStrategy f37523w;

    /* renamed from: x */
    private final MotionStrategy f37524x;

    /* renamed from: y */
    private final int f37525y;

    /* renamed from: z */
    private int f37526z;

    /* loaded from: classes5.dex */
    class ChangeSizeStrategy extends BaseMotionStrategy {

        /* renamed from: g */
        private final Size f37533g;

        /* renamed from: h */
        private final boolean f37534h;

        ChangeSizeStrategy(AnimatorTracker animatorTracker, Size size, boolean z) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
            this.f37533g = size;
            this.f37534h = z;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        @NonNull
        public AnimatorSet createAnimator() {
            float f;
            MotionSpec currentMotionSpec = getCurrentMotionSpec();
            if (currentMotionSpec.hasPropertyValues("width")) {
                PropertyValuesHolder[] propertyValues = currentMotionSpec.getPropertyValues("width");
                propertyValues[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f37533g.getWidth());
                currentMotionSpec.setPropertyValues("width", propertyValues);
            }
            if (currentMotionSpec.hasPropertyValues("height")) {
                PropertyValuesHolder[] propertyValues2 = currentMotionSpec.getPropertyValues("height");
                propertyValues2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f37533g.getHeight());
                currentMotionSpec.setPropertyValues("height", propertyValues2);
            }
            if (currentMotionSpec.hasPropertyValues("paddingStart")) {
                PropertyValuesHolder[] propertyValues3 = currentMotionSpec.getPropertyValues("paddingStart");
                propertyValues3[0].setFloatValues(ViewCompat.getPaddingStart(ExtendedFloatingActionButton.this), this.f37533g.getPaddingStart());
                currentMotionSpec.setPropertyValues("paddingStart", propertyValues3);
            }
            if (currentMotionSpec.hasPropertyValues("paddingEnd")) {
                PropertyValuesHolder[] propertyValues4 = currentMotionSpec.getPropertyValues("paddingEnd");
                propertyValues4[0].setFloatValues(ViewCompat.getPaddingEnd(ExtendedFloatingActionButton.this), this.f37533g.getPaddingEnd());
                currentMotionSpec.setPropertyValues("paddingEnd", propertyValues4);
            }
            if (currentMotionSpec.hasPropertyValues("labelOpacity")) {
                PropertyValuesHolder[] propertyValues5 = currentMotionSpec.getPropertyValues("labelOpacity");
                boolean z = this.f37534h;
                float f2 = 0.0f;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                if (z) {
                    f2 = 1.0f;
                }
                propertyValues5[0].setFloatValues(f, f2);
                currentMotionSpec.setPropertyValues("labelOpacity", propertyValues5);
            }
            return super.m71474b(currentMotionSpec);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            if (this.f37534h) {
                return C16310R.animator.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return C16310R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.f37517D = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f37533g.getLayoutParams().width;
            layoutParams.height = this.f37533g.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f37516C = this.f37534h;
            ExtendedFloatingActionButton.this.f37517D = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback == null) {
                return;
            }
            if (this.f37534h) {
                onChangedCallback.onExtended(ExtendedFloatingActionButton.this);
            } else {
                onChangedCallback.onShrunken(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.f37516C = this.f37534h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f37533g.getLayoutParams().width;
            layoutParams.height = this.f37533g.getLayoutParams().height;
            ViewCompat.setPaddingRelative(ExtendedFloatingActionButton.this, this.f37533g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f37533g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            if (this.f37534h != ExtendedFloatingActionButton.this.f37516C && ExtendedFloatingActionButton.this.getIcon() != null && !TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText())) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f37536a;
        @Nullable

        /* renamed from: b */
        private OnChangedCallback f37537b;
        @Nullable

        /* renamed from: c */
        private OnChangedCallback f37538c;

        /* renamed from: d */
        private boolean f37539d;

        /* renamed from: e */
        private boolean f37540e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f37539d = false;
            this.f37540e = true;
        }

        /* renamed from: b */
        private static boolean m71450b(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: c */
        private boolean m71449c(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f37539d && !this.f37540e) || layoutParams.getAnchorId() != view.getId()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        private boolean m71447e(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m71449c(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f37536a == null) {
                this.f37536a = new Rect();
            }
            Rect rect = this.f37536a;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                m71448d(extendedFloatingActionButton);
                return true;
            }
            m71451a(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: f */
        private boolean m71446f(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m71449c(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                m71448d(extendedFloatingActionButton);
                return true;
            }
            m71451a(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: a */
        protected void m71451a(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            OnChangedCallback onChangedCallback;
            boolean z = this.f37540e;
            if (z) {
                onChangedCallback = this.f37538c;
            } else {
                onChangedCallback = this.f37537b;
            }
            extendedFloatingActionButton.m71452z(z ? extendedFloatingActionButton.f37522v : extendedFloatingActionButton.f37523w, onChangedCallback);
        }

        /* renamed from: d */
        protected void m71448d(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            OnChangedCallback onChangedCallback;
            boolean z = this.f37540e;
            if (z) {
                onChangedCallback = this.f37538c;
            } else {
                onChangedCallback = this.f37537b;
            }
            extendedFloatingActionButton.m71452z(z ? extendedFloatingActionButton.f37521u : extendedFloatingActionButton.f37524x, onChangedCallback);
        }

        public boolean isAutoHideEnabled() {
            return this.f37539d;
        }

        public boolean isAutoShrinkEnabled() {
            return this.f37540e;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public void setAutoHideEnabled(boolean z) {
            this.f37539d = z;
        }

        public void setAutoShrinkEnabled(boolean z) {
            this.f37540e = z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (CoordinatorLayout) extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m71447e(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (m71450b(view)) {
                m71446f(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (view instanceof AppBarLayout) {
                    if (m71447e(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m71450b(view) && m71446f(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16310R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.f37539d = obtainStyledAttributes.getBoolean(C16310R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f37540e = obtainStyledAttributes.getBoolean(C16310R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes5.dex */
    class HideStrategy extends BaseMotionStrategy {

        /* renamed from: g */
        private boolean f37541g;

        public HideStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return C16310R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationCancel() {
            super.onAnimationCancel();
            this.f37541g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.f37519s = 0;
            if (!this.f37541g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f37541g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f37519s = 1;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onHidden(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.this.m71454x();
        }
    }

    /* loaded from: classes5.dex */
    class ShowStrategy extends BaseMotionStrategy {
        public ShowStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return C16310R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.f37519s = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f37519s = 2;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onShown(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.this.m71453y();
        }
    }

    /* loaded from: classes5.dex */
    interface Size {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private void m71469A() {
        this.originalTextCsl = getTextColors();
    }

    /* renamed from: B */
    private boolean m71468B() {
        if ((ViewCompat.isLaidOut(this) || (!m71453y() && this.f37518E)) && !isInEditMode()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public boolean m71454x() {
        if (getVisibility() == 0) {
            if (this.f37519s != 1) {
                return false;
            }
            return true;
        } else if (this.f37519s == 2) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public boolean m71453y() {
        if (getVisibility() != 0) {
            if (this.f37519s != 2) {
                return false;
            }
            return true;
        } else if (this.f37519s == 1) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m71452z(@NonNull final MotionStrategy motionStrategy, @Nullable final OnChangedCallback onChangedCallback) {
        if (motionStrategy.shouldCancel()) {
            return;
        }
        if (!m71468B()) {
            motionStrategy.performNow();
            motionStrategy.onChange(onChangedCallback);
            return;
        }
        measure(0, 0);
        AnimatorSet createAnimator = motionStrategy.createAnimator();
        createAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.3

            /* renamed from: b */
            private boolean f37529b;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.f37529b = true;
                motionStrategy.onAnimationCancel();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                motionStrategy.onAnimationEnd();
                if (!this.f37529b) {
                    motionStrategy.onChange(onChangedCallback);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                motionStrategy.onAnimationStart(animator);
                this.f37529b = false;
            }
        });
        for (Animator.AnimatorListener animatorListener : motionStrategy.getListeners()) {
            createAnimator.addListener(animatorListener);
        }
        createAnimator.start();
    }

    public void addOnExtendAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f37522v.addAnimationListener(animatorListener);
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f37524x.addAnimationListener(animatorListener);
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f37523w.addAnimationListener(animatorListener);
    }

    public void addOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f37521u.addAnimationListener(animatorListener);
    }

    public void extend() {
        m71452z(this.f37522v, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f37515B;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    int getCollapsedSize() {
        int i = this.f37525y;
        if (i < 0) {
            return (Math.min(ViewCompat.getPaddingStart(this), ViewCompat.getPaddingEnd(this)) * 2) + getIconSize();
        }
        return i;
    }

    @Nullable
    public MotionSpec getExtendMotionSpec() {
        return this.f37522v.getMotionSpec();
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.f37524x.getMotionSpec();
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.f37523w.getMotionSpec();
    }

    @Nullable
    public MotionSpec getShrinkMotionSpec() {
        return this.f37521u.getMotionSpec();
    }

    public void hide() {
        m71452z(this.f37524x, null);
    }

    public final boolean isExtended() {
        return this.f37516C;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37516C && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f37516C = false;
            this.f37521u.performNow();
        }
    }

    public void removeOnExtendAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f37522v.removeAnimationListener(animatorListener);
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f37524x.removeAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f37523w.removeAnimationListener(animatorListener);
    }

    public void removeOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f37521u.removeAnimationListener(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f37518E = z;
    }

    public void setExtendMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f37522v.setMotionSpec(motionSpec);
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i) {
        setExtendMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void setExtended(boolean z) {
        MotionStrategy motionStrategy;
        if (this.f37516C == z) {
            return;
        }
        if (z) {
            motionStrategy = this.f37522v;
        } else {
            motionStrategy = this.f37521u;
        }
        if (motionStrategy.shouldCancel()) {
            return;
        }
        motionStrategy.performNow();
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f37524x.setMotionSpec(motionSpec);
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f37516C && !this.f37517D) {
            this.f37526z = ViewCompat.getPaddingStart(this);
            this.f37514A = ViewCompat.getPaddingEnd(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f37516C && !this.f37517D) {
            this.f37526z = i;
            this.f37514A = i3;
        }
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f37523w.setMotionSpec(motionSpec);
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void setShrinkMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f37521u.setMotionSpec(motionSpec);
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i) {
        setShrinkMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        m71469A();
    }

    public void show() {
        m71452z(this.f37523w, null);
    }

    public void shrink() {
        m71452z(this.f37521u, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void silentlyUpdateTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C16310R.attr.extendedFloatingActionButtonStyle);
    }

    public void extend(@NonNull OnChangedCallback onChangedCallback) {
        m71452z(this.f37522v, onChangedCallback);
    }

    public void hide(@NonNull OnChangedCallback onChangedCallback) {
        m71452z(this.f37524x, onChangedCallback);
    }

    public void show(@NonNull OnChangedCallback onChangedCallback) {
        m71452z(this.f37523w, onChangedCallback);
    }

    public void shrink(@NonNull OnChangedCallback onChangedCallback) {
        m71452z(this.f37521u, onChangedCallback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExtendedFloatingActionButton(@androidx.annotation.NonNull android.content.Context r17, @androidx.annotation.Nullable android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f37509F
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f37519s = r10
            com.google.android.material.floatingactionbutton.AnimatorTracker r1 = new com.google.android.material.floatingactionbutton.AnimatorTracker
            r1.<init>()
            r0.f37520t = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ShowStrategy r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ShowStrategy
            r11.<init>(r1)
            r0.f37523w = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$HideStrategy r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$HideStrategy
            r12.<init>(r1)
            r0.f37524x = r12
            r13 = 1
            r0.f37516C = r13
            r0.f37517D = r10
            r0.f37518E = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f37515B = r1
            int[] r3 = com.google.android.material.C16310R.styleable.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.C16310R.styleable.ExtendedFloatingActionButton_showMotionSpec
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r2)
            int r3 = com.google.android.material.C16310R.styleable.ExtendedFloatingActionButton_hideMotionSpec
            com.google.android.material.animation.MotionSpec r3 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r3)
            int r4 = com.google.android.material.C16310R.styleable.ExtendedFloatingActionButton_extendMotionSpec
            com.google.android.material.animation.MotionSpec r4 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r4)
            int r5 = com.google.android.material.C16310R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec
            com.google.android.material.animation.MotionSpec r5 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r5)
            int r6 = com.google.android.material.C16310R.styleable.ExtendedFloatingActionButton_collapsedSize
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.f37525y = r6
            int r6 = androidx.core.view.ViewCompat.getPaddingStart(r16)
            r0.f37526z = r6
            int r6 = androidx.core.view.ViewCompat.getPaddingEnd(r16)
            r0.f37514A = r6
            com.google.android.material.floatingactionbutton.AnimatorTracker r6 = new com.google.android.material.floatingactionbutton.AnimatorTracker
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1 r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.f37522v = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2 r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.f37521u = r10
            r11.setMotionSpec(r2)
            r12.setMotionSpec(r3)
            r15.setMotionSpec(r4)
            r10.setMotionSpec(r5)
            r1.recycle()
            com.google.android.material.shape.CornerSize r1 = com.google.android.material.shape.ShapeAppearanceModel.PILL
            r2 = r18
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = com.google.android.material.shape.ShapeAppearanceModel.builder(r14, r2, r8, r9, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r1.build()
            r0.setShapeAppearanceModel(r1)
            r16.m71469A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m71469A();
    }

    /* loaded from: classes5.dex */
    public static abstract class OnChangedCallback {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }
}
