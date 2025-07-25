package androidx.compose.p015ui.modifier;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModifierLocal.kt */
@Metadata
/* renamed from: androidx.compose.ui.modifier.ModifierLocalKt */
/* loaded from: classes.dex */
public final class ModifierLocalKt {
    @NotNull
    public static final <T> ProvidableModifierLocal<T> modifierLocalOf(@NotNull Functions<? extends T> defaultFactory) {
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new ProvidableModifierLocal<>(defaultFactory);
    }
}
