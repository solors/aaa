package com.smaato.sdk.video.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class AnimationHelper {
    private final long animationDurationMillis;

    /* renamed from: com.smaato.sdk.video.utils.AnimationHelper$a */
    /* loaded from: classes7.dex */
    class C27703a extends AnimatorListenerAdapter {

        /* renamed from: b */
        final /* synthetic */ View f72433b;

        C27703a(View view) {
            this.f72433b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f72433b.setVisibility(8);
        }
    }

    public AnimationHelper(long j) {
        this.animationDurationMillis = j;
    }

    public void hideWithAnim(@NonNull View view) {
        view.animate().alpha(0.0f).setDuration(this.animationDurationMillis).setListener(new C27703a(view)).start();
    }

    public void showWithAnim(@NonNull View view) {
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(this.animationDurationMillis).start();
    }
}
