package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: KeyboardActions.kt */
@Metadata
/* loaded from: classes.dex */
public final class KeyboardActionsKt {
    @NotNull
    public static final KeyboardActions KeyboardActions(@NotNull Function1<? super KeyboardActionScope, Unit> onAny) {
        Intrinsics.checkNotNullParameter(onAny, "onAny");
        return new KeyboardActions(onAny, onAny, onAny, onAny, onAny, onAny);
    }
}
