package com.mobilefuse.sdk.p542ad.rendering.omniad.modifier;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimatedSizeModifier.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.modifier.AnimatedSizeModifier */
/* loaded from: classes7.dex */
public final class AnimatedSizeModifier implements SizeModifier {
    @Nullable
    private ValueAnimator animator;
    private final long durationMillis;
    private final TimeInterpolator interpolator;
    @NotNull
    private final OmniAdContainer omniAdContainer;

    public AnimatedSizeModifier(@NotNull OmniAdContainer omniAdContainer, long j, @NotNull TimeInterpolator interpolator) {
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        this.omniAdContainer = omniAdContainer;
        this.durationMillis = j;
        this.interpolator = interpolator;
    }

    private final void cancelAnimators() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.SizeModifier
    public void changeSize(int i, int i2, @NotNull final Functions<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        cancelAnimators();
        Point currentSize = getOmniAdContainer().getCurrentSize();
        final float f = currentSize.x;
        final float f2 = currentSize.y;
        final float f3 = i - f;
        final float f4 = i2 - f2;
        ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.durationMillis);
        this.animator = animator;
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        animator.setInterpolator(this.interpolator);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.modifier.AnimatedSizeModifier$changeSize$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@NotNull ValueAnimator anim) {
                Intrinsics.checkNotNullParameter(anim, "anim");
                if (anim != AnimatedSizeModifier.this.getAnimator()) {
                    return;
                }
                OmniAdContainer omniAdContainer = AnimatedSizeModifier.this.getOmniAdContainer();
                float f5 = f;
                Object animatedValue = anim.getAnimatedValue();
                if (animatedValue != null) {
                    int floatValue = (int) (f5 + (((Float) animatedValue).floatValue() * f3));
                    float f6 = f2;
                    Object animatedValue2 = anim.getAnimatedValue();
                    if (animatedValue2 != null) {
                        omniAdContainer.changeSize(floatValue, (int) (f6 + (((Float) animatedValue2).floatValue() * f4)));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
        });
        animator.addListener(new Animator.AnimatorListener() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.modifier.AnimatedSizeModifier$changeSize$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                AnimatedSizeModifier.this.setAnimator(null);
                completeAction.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
        animator.start();
    }

    @Nullable
    public final ValueAnimator getAnimator() {
        return this.animator;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.SizeModifier
    @NotNull
    public OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }

    public final void setAnimator(@Nullable ValueAnimator valueAnimator) {
        this.animator = valueAnimator;
    }

    public /* synthetic */ AnimatedSizeModifier(OmniAdContainer omniAdContainer, long j, TimeInterpolator timeInterpolator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(omniAdContainer, (i & 2) != 0 ? 500L : j, (i & 4) != 0 ? new FastOutSlowInInterpolator() : timeInterpolator);
    }
}
