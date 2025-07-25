package androidx.compose.runtime.saveable;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SaveableStateHolder.kt */
@Metadata
/* loaded from: classes.dex */
public final class SaveableStateHolderImpl$SaveableStateProvider$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Object $key;
    final /* synthetic */ SaveableStateHolderImpl.RegistryHolder $registryHolder;
    final /* synthetic */ SaveableStateHolderImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$SaveableStateProvider$1$1(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, SaveableStateHolderImpl.RegistryHolder registryHolder) {
        super(1);
        this.this$0 = saveableStateHolderImpl;
        this.$key = obj;
        this.$registryHolder = registryHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Map map;
        Map map2;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        map = this.this$0.registryHolders;
        boolean z = !map.containsKey(this.$key);
        Object obj = this.$key;
        if (z) {
            this.this$0.savedStates.remove(this.$key);
            map2 = this.this$0.registryHolders;
            map2.put(this.$key, this.$registryHolder);
            final SaveableStateHolderImpl.RegistryHolder registryHolder = this.$registryHolder;
            final SaveableStateHolderImpl saveableStateHolderImpl = this.this$0;
            final Object obj2 = this.$key;
            return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    Map map3;
                    SaveableStateHolderImpl.RegistryHolder.this.saveTo(saveableStateHolderImpl.savedStates);
                    map3 = saveableStateHolderImpl.registryHolders;
                    map3.remove(obj2);
                }
            };
        }
        throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
    }
}
