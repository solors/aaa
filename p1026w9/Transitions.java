package p1026w9;

import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: w9.k */
/* loaded from: classes8.dex */
public final class Transitions {
    /* renamed from: a */
    public static final void m2197a(@NotNull TransitionSet transitionSet, @NotNull Iterable<? extends Transition> transitions) {
        Intrinsics.checkNotNullParameter(transitionSet, "<this>");
        Intrinsics.checkNotNullParameter(transitions, "transitions");
        for (Transition transition : transitions) {
            transitionSet.addTransition(transition);
        }
    }
}
