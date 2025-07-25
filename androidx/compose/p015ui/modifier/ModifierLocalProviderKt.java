package androidx.compose.p015ui.modifier;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModifierLocalProvider.kt */
@Metadata
/* renamed from: androidx.compose.ui.modifier.ModifierLocalProviderKt */
/* loaded from: classes.dex */
public final class ModifierLocalProviderKt {
    @ExperimentalComposeUiApi
    @NotNull
    public static final <T> Modifier modifierLocalProvider(@NotNull Modifier modifier, @NotNull ProvidableModifierLocal<T> key, @NotNull Functions<? extends T> value) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C0927xd651ace7(key, value);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ModifierLocalProviderKt$modifierLocalProvider$1(key, value, noInspectorInfo));
    }
}
