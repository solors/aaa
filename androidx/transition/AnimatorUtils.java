package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
class AnimatorUtils {

    /* loaded from: classes2.dex */
    interface AnimatorPauseListenerCompat {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    private AnimatorUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void addPauseListener(@NonNull Animator animator, @NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void pause(@NonNull Animator animator) {
        animator.pause();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void resume(@NonNull Animator animator) {
        animator.resume();
    }
}
