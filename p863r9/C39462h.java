package p863r9;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTooltipAnimation.kt */
@Metadata
/* renamed from: r9.h */
/* loaded from: classes8.dex */
final class C39462h extends Visibility {

    /* renamed from: b */
    private final float f103752b;

    public C39462h(float f) {
        this.f103752b = f;
    }

    @Override // android.transition.Visibility
    @NotNull
    public Animator onAppear(@Nullable ViewGroup viewGroup, @NotNull View view, @NotNull TransitionValues startValues, @NotNull TransitionValues endValues) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(startValues, "startValues");
        Intrinsics.checkNotNullParameter(endValues, "endValues");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, this.f103752b, view.getScaleX()), PropertyValuesHolder.ofFloat(View.SCALE_Y, this.f103752b, view.getScaleY()));
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…Y\n            )\n        )");
        return ofPropertyValuesHolder;
    }

    @Override // android.transition.Visibility
    @NotNull
    public Animator onDisappear(@Nullable ViewGroup viewGroup, @NotNull View view, @NotNull TransitionValues startValues, @NotNull TransitionValues endValues) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(startValues, "startValues");
        Intrinsics.checkNotNullParameter(endValues, "endValues");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, view.getScaleX(), this.f103752b), PropertyValuesHolder.ofFloat(View.SCALE_Y, view.getScaleY(), this.f103752b));
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…r\n            )\n        )");
        return ofPropertyValuesHolder;
    }
}
