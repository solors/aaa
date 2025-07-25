package androidx.compose.p015ui.modifier;

import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.platform.InspectorValueInfo;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ModifierLocalProvider.kt */
@Metadata
/* renamed from: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$1 */
/* loaded from: classes.dex */
public final class ModifierLocalProviderKt$modifierLocalProvider$1<T> extends InspectorValueInfo implements ModifierLocalProvider<T> {
    @NotNull
    private final ProvidableModifierLocal<T> key;
    @NotNull
    private final State value$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ModifierLocalProviderKt$modifierLocalProvider$1(ProvidableModifierLocal<T> providableModifierLocal, Functions<? extends T> functions, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.key = providableModifierLocal;
        this.value$delegate = SnapshotStateKt.derivedStateOf(functions);
    }

    @Override // androidx.compose.p015ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<T> getKey() {
        return this.key;
    }

    @Override // androidx.compose.p015ui.modifier.ModifierLocalProvider
    public T getValue() {
        return (T) this.value$delegate.getValue();
    }
}
