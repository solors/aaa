package androidx.compose.p015ui.state;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ToggleableState.kt */
@Metadata
/* renamed from: androidx.compose.ui.state.ToggleableStateKt */
/* loaded from: classes.dex */
public final class ToggleableStateKt {
    @NotNull
    public static final ToggleableState ToggleableState(boolean z) {
        if (z) {
            return ToggleableState.On;
        }
        return ToggleableState.Off;
    }
}
