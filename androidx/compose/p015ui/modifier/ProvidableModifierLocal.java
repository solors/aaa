package androidx.compose.p015ui.modifier;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModifierLocal.kt */
@Stable
@Metadata
/* renamed from: androidx.compose.ui.modifier.ProvidableModifierLocal */
/* loaded from: classes.dex */
public final class ProvidableModifierLocal<T> extends ModifierLocal<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProvidableModifierLocal(@NotNull Functions<? extends T> defaultFactory) {
        super(defaultFactory, null);
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
    }
}
