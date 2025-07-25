package androidx.compose.p015ui.input.nestedscroll;

import androidx.compose.p015ui.modifier.ModifierLocalKt;
import androidx.compose.p015ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: NestedScrollModifierLocal.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocalKt */
/* loaded from: classes.dex */
public final class NestedScrollModifierLocalKt {
    @NotNull
    private static final ProvidableModifierLocal<NestedScrollModifierLocal> ModifierLocalNestedScroll = ModifierLocalKt.modifierLocalOf(NestedScrollModifierLocalKt$ModifierLocalNestedScroll$1.INSTANCE);

    @NotNull
    public static final ProvidableModifierLocal<NestedScrollModifierLocal> getModifierLocalNestedScroll() {
        return ModifierLocalNestedScroll;
    }
}
