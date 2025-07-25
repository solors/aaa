package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends Visibility {

    /* renamed from: b */
    private final P f39032b;
    @Nullable

    /* renamed from: c */
    private VisibilityAnimatorProvider f39033c;

    /* renamed from: d */
    private final List<VisibilityAnimatorProvider> f39034d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    public MaterialVisibility(P p, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f39032b = p;
        this.f39033c = visibilityAnimatorProvider;
    }

    /* renamed from: b */
    private static void m70273b(List<Animator> list, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
        Animator createDisappear;
        if (visibilityAnimatorProvider == null) {
            return;
        }
        if (z) {
            createDisappear = visibilityAnimatorProvider.createAppear(viewGroup, view);
        } else {
            createDisappear = visibilityAnimatorProvider.createDisappear(viewGroup, view);
        }
        if (createDisappear != null) {
            list.add(createDisappear);
        }
    }

    /* renamed from: c */
    private Animator m70272c(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m70273b(arrayList, this.f39032b, viewGroup, view, z);
        m70273b(arrayList, this.f39033c, viewGroup, view, z);
        for (VisibilityAnimatorProvider visibilityAnimatorProvider : this.f39034d) {
            m70273b(arrayList, visibilityAnimatorProvider, viewGroup, view, z);
        }
        m70268g(viewGroup.getContext(), z);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: g */
    private void m70268g(@NonNull Context context, boolean z) {
        TransitionUtils.m70246o(this, context, mo70270e(z));
        TransitionUtils.m70245p(this, context, mo70269f(z), mo70271d(z));
    }

    public void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f39034d.add(visibilityAnimatorProvider);
    }

    public void clearAdditionalAnimatorProvider() {
        this.f39034d.clear();
    }

    @NonNull
    /* renamed from: d */
    TimeInterpolator mo70271d(boolean z) {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    @AttrRes
    /* renamed from: e */
    int mo70270e(boolean z) {
        return 0;
    }

    @AttrRes
    /* renamed from: f */
    int mo70269f(boolean z) {
        return 0;
    }

    @NonNull
    public P getPrimaryAnimatorProvider() {
        return this.f39032b;
    }

    @Nullable
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.f39033c;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m70272c(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m70272c(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.f39034d.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f39033c = visibilityAnimatorProvider;
    }
}
