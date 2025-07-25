package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes5.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends Visibility {

    /* renamed from: b */
    private final P f39203b;
    @Nullable

    /* renamed from: c */
    private VisibilityAnimatorProvider f39204c;

    /* renamed from: d */
    private final List<VisibilityAnimatorProvider> f39205d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    public MaterialVisibility(P p, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f39203b = p;
        this.f39204c = visibilityAnimatorProvider;
    }

    /* renamed from: b */
    private static void m70176b(List<Animator> list, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
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
    private Animator m70175c(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m70176b(arrayList, this.f39203b, viewGroup, view, z);
        m70176b(arrayList, this.f39204c, viewGroup, view, z);
        for (VisibilityAnimatorProvider visibilityAnimatorProvider : this.f39205d) {
            m70176b(arrayList, visibilityAnimatorProvider, viewGroup, view, z);
        }
        m70171g(viewGroup.getContext(), z);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: g */
    private void m70171g(@NonNull Context context, boolean z) {
        TransitionUtils.m70148p(this, context, mo70173e(z));
        TransitionUtils.m70147q(this, context, mo70172f(z), mo70174d(z));
    }

    public void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f39205d.add(visibilityAnimatorProvider);
    }

    public void clearAdditionalAnimatorProvider() {
        this.f39205d.clear();
    }

    @NonNull
    /* renamed from: d */
    TimeInterpolator mo70174d(boolean z) {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    @AttrRes
    /* renamed from: e */
    int mo70173e(boolean z) {
        return 0;
    }

    @AttrRes
    /* renamed from: f */
    int mo70172f(boolean z) {
        return 0;
    }

    @NonNull
    public P getPrimaryAnimatorProvider() {
        return this.f39203b;
    }

    @Nullable
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.f39204c;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m70175c(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m70175c(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.f39205d.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f39204c = visibilityAnimatorProvider;
    }
}
