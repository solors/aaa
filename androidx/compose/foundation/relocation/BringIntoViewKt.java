package androidx.compose.foundation.relocation;

import androidx.compose.p015ui.modifier.ModifierLocalKt;
import androidx.compose.p015ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: BringIntoView.kt */
@Metadata
/* loaded from: classes.dex */
public final class BringIntoViewKt {
    @NotNull
    private static final ProvidableModifierLocal<BringIntoViewParent> ModifierLocalBringIntoViewParent = ModifierLocalKt.modifierLocalOf(BringIntoViewKt$ModifierLocalBringIntoViewParent$1.INSTANCE);

    @NotNull
    public static final ProvidableModifierLocal<BringIntoViewParent> getModifierLocalBringIntoViewParent() {
        return ModifierLocalBringIntoViewParent;
    }

    public static /* synthetic */ void getModifierLocalBringIntoViewParent$annotations() {
    }
}
