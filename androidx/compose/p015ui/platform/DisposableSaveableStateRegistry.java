package androidx.compose.p015ui.platform;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry */
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {
    private final /* synthetic */ SaveableStateRegistry $$delegate_0;
    @NotNull
    private final Functions<Unit> onDispose;

    public DisposableSaveableStateRegistry(@NotNull SaveableStateRegistry saveableStateRegistry, @NotNull Functions<Unit> onDispose) {
        Intrinsics.checkNotNullParameter(saveableStateRegistry, "saveableStateRegistry");
        Intrinsics.checkNotNullParameter(onDispose, "onDispose");
        this.onDispose = onDispose;
        this.$$delegate_0 = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.$$delegate_0.canBeSaved(value);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @Nullable
    public Object consumeRestored(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.$$delegate_0.consumeRestored(key);
    }

    public final void dispose() {
        this.onDispose.invoke();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @NotNull
    public Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @NotNull
    public SaveableStateRegistry.Entry registerProvider(@NotNull String key, @NotNull Functions<? extends Object> valueProvider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueProvider, "valueProvider");
        return this.$$delegate_0.registerProvider(key, valueProvider);
    }
}
