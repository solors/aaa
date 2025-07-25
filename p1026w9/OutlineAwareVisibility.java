package p1026w9;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.yandex.div.internal.widget.TransientView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: w9.g */
/* loaded from: classes8.dex */
public class OutlineAwareVisibility extends Visibility {

    /* compiled from: Transitions.kt */
    @Metadata
    /* renamed from: w9.g$a */
    /* loaded from: classes8.dex */
    public static final class C44612a extends TransitionListenerAdapter {

        /* renamed from: b */
        final /* synthetic */ Transition f117083b;

        /* renamed from: c */
        final /* synthetic */ TransientView f117084c;

        /* renamed from: d */
        final /* synthetic */ TransitionValues f117085d;

        public C44612a(Transition transition, TransientView transientView, TransitionValues transitionValues) {
            this.f117083b = transition;
            this.f117084c = transientView;
            this.f117085d = transitionValues;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NotNull Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            TransientView transientView = this.f117084c;
            if (transientView != null) {
                View view = this.f117085d.view;
                Intrinsics.checkNotNullExpressionValue(view, "endValues.view");
                transientView.transitionFinished(view);
            }
            this.f117083b.removeListener(this);
        }
    }

    /* compiled from: Transitions.kt */
    @Metadata
    /* renamed from: w9.g$b */
    /* loaded from: classes8.dex */
    public static final class C44613b extends TransitionListenerAdapter {

        /* renamed from: b */
        final /* synthetic */ Transition f117086b;

        /* renamed from: c */
        final /* synthetic */ TransientView f117087c;

        /* renamed from: d */
        final /* synthetic */ TransitionValues f117088d;

        public C44613b(Transition transition, TransientView transientView, TransitionValues transitionValues) {
            this.f117086b = transition;
            this.f117087c = transientView;
            this.f117088d = transitionValues;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NotNull Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            TransientView transientView = this.f117087c;
            if (transientView != null) {
                View view = this.f117088d.view;
                Intrinsics.checkNotNullExpressionValue(view, "startValues.view");
                transientView.transitionFinished(view);
            }
            this.f117086b.removeListener(this);
        }
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @Nullable TransitionValues transitionValues, int i, @Nullable TransitionValues transitionValues2, int i2) {
        View view;
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        TransientView transientView = null;
        if (transitionValues2 != null) {
            view = transitionValues2.view;
        } else {
            view = null;
        }
        if (view instanceof TransientView) {
            transientView = (TransientView) view;
        }
        if (transientView != null) {
            View view2 = transitionValues2.view;
            Intrinsics.checkNotNullExpressionValue(view2, "endValues.view");
            transientView.transitionStarted(view2);
        }
        addListener(new C44612a(this, transientView, transitionValues2));
        return super.onAppear(sceneRoot, transitionValues, i, transitionValues2, i2);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @Nullable TransitionValues transitionValues, int i, @Nullable TransitionValues transitionValues2, int i2) {
        View view;
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        TransientView transientView = null;
        if (transitionValues != null) {
            view = transitionValues.view;
        } else {
            view = null;
        }
        if (view instanceof TransientView) {
            transientView = (TransientView) view;
        }
        if (transientView != null) {
            View view2 = transitionValues.view;
            Intrinsics.checkNotNullExpressionValue(view2, "startValues.view");
            transientView.transitionStarted(view2);
        }
        addListener(new C44613b(this, transientView, transitionValues));
        return super.onDisappear(sceneRoot, transitionValues, i, transitionValues2, i2);
    }
}
