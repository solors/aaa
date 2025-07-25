package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import ge.C33323f0;
import ge.InterfaceC33420y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674fe.BufferOverflow;
import sd.C42688d;

/* compiled from: InteractionSource.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
final class MutableInteractionSourceImpl implements MutableInteractionSource {
    @NotNull
    private final InterfaceC33420y<Interaction> interactions = C33323f0.m24127b(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    @Nullable
    public Object emit(@NotNull Interaction interaction, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object emit = getInteractions().emit(interaction, continuation);
        m6959e = C42688d.m6959e();
        if (emit == m6959e) {
            return emit;
        }
        return Unit.f99208a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(@NotNull Interaction interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        return getInteractions().mo23983e(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    @NotNull
    public InterfaceC33420y<Interaction> getInteractions() {
        return this.interactions;
    }
}
