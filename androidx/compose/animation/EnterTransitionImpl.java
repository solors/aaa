package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class EnterTransitionImpl extends EnterTransition {
    @NotNull
    private final TransitionData data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterTransitionImpl(@NotNull TransitionData data) {
        super(null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @Override // androidx.compose.animation.EnterTransition
    @NotNull
    public TransitionData getData$animation_release() {
        return this.data;
    }
}
