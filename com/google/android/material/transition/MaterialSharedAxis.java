package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.GravityCompat;
import androidx.transition.TransitionValues;
import com.google.android.material.C16310R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes5.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {

    /* renamed from: X */
    public static final int f39025X = 0;

    /* renamed from: Y */
    public static final int f39026Y = 1;

    /* renamed from: Z */
    public static final int f39027Z = 2;
    @AttrRes

    /* renamed from: h */
    private static final int f39028h = C16310R.attr.motionDurationLong1;
    @AttrRes

    /* renamed from: i */
    private static final int f39029i = C16310R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: f */
    private final int f39030f;

    /* renamed from: g */
    private final boolean f39031g;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface Axis {
    }

    public MaterialSharedAxis(int i, boolean z) {
        super(m70275h(i, z), m70274i());
        this.f39030f = i;
        this.f39031g = z;
    }

    /* renamed from: h */
    private static VisibilityAnimatorProvider m70275h(int i, boolean z) {
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
    private static VisibilityAnimatorProvider m70274i() {
        return new FadeThroughProvider();
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
    @AttrRes
    /* renamed from: e */
    int mo70270e(boolean z) {
        return f39028h;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @AttrRes
    /* renamed from: f */
    int mo70269f(boolean z) {
        return f39029i;
    }

    public int getAxis() {
        return this.f39030f;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @NonNull
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.f39031g;
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
