package com.yandex.mobile.ads.impl;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class qz1<T extends TextView> implements InterfaceC30456hd<T> {

    /* renamed from: a */
    private final int f84594a;
    @NotNull

    /* renamed from: b */
    private final ArgbEvaluator f84595b;
    @Nullable

    /* renamed from: c */
    private ValueAnimator f84596c;

    /* renamed from: com.yandex.mobile.ads.impl.qz1$a */
    /* loaded from: classes8.dex */
    private static final class C31248a implements ValueAnimator.AnimatorUpdateListener {
        @NotNull

        /* renamed from: a */
        private final TextView f84597a;

        public C31248a(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            this.f84597a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Integer) {
                this.f84597a.setTextColor(((Number) animatedValue).intValue());
            }
        }
    }

    public /* synthetic */ qz1(int i) {
        this(i, new ArgbEvaluator());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30456hd
    /* renamed from: a */
    public final void mo27501a(View view) {
        TextView textView = (TextView) view;
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.f84596c = ValueAnimator.ofObject(this.f84595b, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.f84594a));
        C31248a c31248a = new C31248a(textView);
        ValueAnimator valueAnimator = this.f84596c;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(c31248a);
        }
        ValueAnimator valueAnimator2 = this.f84596c;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(500);
        }
        ValueAnimator valueAnimator3 = this.f84596c;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30456hd
    public final void cancel() {
        ValueAnimator valueAnimator = this.f84596c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f84596c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public qz1(@ColorInt int i, @NotNull ArgbEvaluator argbEvaluator) {
        Intrinsics.checkNotNullParameter(argbEvaluator, "argbEvaluator");
        this.f84594a = i;
        this.f84595b = argbEvaluator;
    }
}
