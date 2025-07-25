package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import com.google.android.material.C16310R;
import com.google.android.material.animation.AnimationUtils;

/* loaded from: classes5.dex */
public final class MaterialFade extends MaterialVisibility<FadeProvider> {
    @AttrRes

    /* renamed from: f */
    private static final int f39019f = C16310R.attr.motionDurationMedium4;
    @AttrRes

    /* renamed from: g */
    private static final int f39020g = C16310R.attr.motionDurationShort3;
    @AttrRes

    /* renamed from: h */
    private static final int f39021h = C16310R.attr.motionEasingEmphasizedDecelerateInterpolator;
    @AttrRes

    /* renamed from: i */
    private static final int f39022i = C16310R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public MaterialFade() {
        super(m70279h(), m70278i());
    }

    /* renamed from: h */
    private static FadeProvider m70279h() {
        FadeProvider fadeProvider = new FadeProvider();
        fadeProvider.setIncomingEndThreshold(0.3f);
        return fadeProvider;
    }

    /* renamed from: i */
    private static VisibilityAnimatorProvider m70278i() {
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(0.8f);
        return scaleProvider;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @NonNull
    /* renamed from: d */
    TimeInterpolator mo70271d(boolean z) {
        return AnimationUtils.LINEAR_INTERPOLATOR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @AttrRes
    /* renamed from: e */
    int mo70270e(boolean z) {
        if (z) {
            return f39019f;
        }
        return f39020g;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @AttrRes
    /* renamed from: f */
    int mo70269f(boolean z) {
        if (z) {
            return f39021h;
        }
        return f39022i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.transition.VisibilityAnimatorProvider, com.google.android.material.transition.FadeProvider] */
    @Override // com.google.android.material.transition.MaterialVisibility
    @NonNull
    public /* bridge */ /* synthetic */ FadeProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
