package androidx.compose.foundation.interaction;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: InteractionSource.kt */
@Metadata
/* loaded from: classes.dex */
public final class InteractionSourceKt {
    @NotNull
    public static final MutableInteractionSource MutableInteractionSource() {
        return new MutableInteractionSourceImpl();
    }
}
