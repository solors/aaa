package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class BaseMotionStrategy implements MotionStrategy {

    /* renamed from: a */
    private final Context f37485a;
    @NonNull

    /* renamed from: b */
    private final ExtendedFloatingActionButton f37486b;

    /* renamed from: c */
    private final ArrayList<Animator.AnimatorListener> f37487c = new ArrayList<>();

    /* renamed from: d */
    private final AnimatorTracker f37488d;
    @Nullable

    /* renamed from: e */
    private MotionSpec f37489e;
    @Nullable

    /* renamed from: f */
    private MotionSpec f37490f;

    public BaseMotionStrategy(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        this.f37486b = extendedFloatingActionButton;
        this.f37485a = extendedFloatingActionButton.getContext();
        this.f37488d = animatorTracker;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void addAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f37487c.add(animatorListener);
    }

    @NonNull
    /* renamed from: b */
    public AnimatorSet m71474b(@NonNull MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        if (motionSpec.hasPropertyValues("opacity")) {
            arrayList.add(motionSpec.getAnimator("opacity", this.f37486b, View.ALPHA));
        }
        if (motionSpec.hasPropertyValues("scale")) {
            arrayList.add(motionSpec.getAnimator("scale", this.f37486b, View.SCALE_Y));
            arrayList.add(motionSpec.getAnimator("scale", this.f37486b, View.SCALE_X));
        }
        if (motionSpec.hasPropertyValues("width")) {
            arrayList.add(motionSpec.getAnimator("width", this.f37486b, ExtendedFloatingActionButton.f37510G));
        }
        if (motionSpec.hasPropertyValues("height")) {
            arrayList.add(motionSpec.getAnimator("height", this.f37486b, ExtendedFloatingActionButton.f37511H));
        }
        if (motionSpec.hasPropertyValues("paddingStart")) {
            arrayList.add(motionSpec.getAnimator("paddingStart", this.f37486b, ExtendedFloatingActionButton.f37512I));
        }
        if (motionSpec.hasPropertyValues("paddingEnd")) {
            arrayList.add(motionSpec.getAnimator("paddingEnd", this.f37486b, ExtendedFloatingActionButton.f37513J));
        }
        if (motionSpec.hasPropertyValues("labelOpacity")) {
            arrayList.add(motionSpec.getAnimator("labelOpacity", this.f37486b, new Property<ExtendedFloatingActionButton, Float>(Float.class, "LABEL_OPACITY_PROPERTY") { // from class: com.google.android.material.floatingactionbutton.BaseMotionStrategy.1
                {
                    BaseMotionStrategy.this = this;
                }

                @Override // android.util.Property
                public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
                    return Float.valueOf(AnimationUtils.lerp(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), BaseMotionStrategy.this.f37486b.originalTextCsl.getDefaultColor()))));
                }

                @Override // android.util.Property
                public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
                    int colorForState = extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), BaseMotionStrategy.this.f37486b.originalTextCsl.getDefaultColor());
                    ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.lerp(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                    if (f.floatValue() == 1.0f) {
                        extendedFloatingActionButton.silentlyUpdateTextColor(extendedFloatingActionButton.originalTextCsl);
                    } else {
                        extendedFloatingActionButton.silentlyUpdateTextColor(valueOf);
                    }
                }
            }));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public AnimatorSet createAnimator() {
        return m71474b(getCurrentMotionSpec());
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final MotionSpec getCurrentMotionSpec() {
        MotionSpec motionSpec = this.f37490f;
        if (motionSpec != null) {
            return motionSpec;
        }
        if (this.f37489e == null) {
            this.f37489e = MotionSpec.createFromResource(this.f37485a, getDefaultMotionSpecResource());
        }
        return (MotionSpec) Preconditions.checkNotNull(this.f37489e);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @NonNull
    public final List<Animator.AnimatorListener> getListeners() {
        return this.f37487c;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @Nullable
    public MotionSpec getMotionSpec() {
        return this.f37490f;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @CallSuper
    public void onAnimationCancel() {
        this.f37488d.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @CallSuper
    public void onAnimationEnd() {
        this.f37488d.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @CallSuper
    public void onAnimationStart(Animator animator) {
        this.f37488d.onNextAnimationStart(animator);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void removeAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f37487c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void setMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f37490f = motionSpec;
    }
}
