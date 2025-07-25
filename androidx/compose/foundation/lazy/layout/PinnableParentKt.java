package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p015ui.modifier.ModifierLocalKt;
import androidx.compose.p015ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PinnableParent.kt */
@Metadata
/* loaded from: classes.dex */
public final class PinnableParentKt {
    @NotNull
    private static final ProvidableModifierLocal<PinnableParent> ModifierLocalPinnableParent = ModifierLocalKt.modifierLocalOf(PinnableParentKt$ModifierLocalPinnableParent$1.INSTANCE);

    @ExperimentalFoundationApi
    @NotNull
    public static final ProvidableModifierLocal<PinnableParent> getModifierLocalPinnableParent() {
        return ModifierLocalPinnableParent;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getModifierLocalPinnableParent$annotations() {
    }
}
