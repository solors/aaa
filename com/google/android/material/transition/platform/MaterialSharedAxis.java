package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.GravityCompat;
import com.google.android.material.C16310R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
/* loaded from: classes5.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {

    /* renamed from: X */
    public static final int f39196X = 0;

    /* renamed from: Y */
    public static final int f39197Y = 1;

    /* renamed from: Z */
    public static final int f39198Z = 2;
    @AttrRes

    /* renamed from: h */
    private static final int f39199h = C16310R.attr.motionDurationLong1;
    @AttrRes

    /* renamed from: i */
    private static final int f39200i = C16310R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: f */
    private final int f39201f;

    /* renamed from: g */
    private final boolean f39202g;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface Axis {
    }

    public MaterialSharedAxis(int i, boolean z) {
        super(m70178h(i, z), m70177i());
        this.f39201f = i;
        this.f39202g = z;
    }

    /* renamed from: h */
    private static VisibilityAnimatorProvider m70178h(int i, boolean z) {
        int i2;
        int i3;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return new ScaleProvider(z);
                }
                throw new IllegalArgumentException("Invalid axis: " + i);
            }
            if (z) {
                i3 = 80;
            } else {
                i3 = 48;
            }
            return new SlideDistanceProvider(i3);
        }
        if (z) {
            i2 = GravityCompat.END;
        } else {
            i2 = GravityCompat.START;
        }
        return new SlideDistanceProvider(i2);
    }

    /* renamed from: i */
    private static VisibilityAnimatorProvider m70177i() {
        return new FadeThroughProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @AttrRes
    /* renamed from: e */
    int mo70173e(boolean z) {
        return f39199h;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @AttrRes
    /* renamed from: f */
    int mo70172f(boolean z) {
        return f39200i;
    }

    public int getAxis() {
        return this.f39201f;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @NonNull
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.f39202g;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
