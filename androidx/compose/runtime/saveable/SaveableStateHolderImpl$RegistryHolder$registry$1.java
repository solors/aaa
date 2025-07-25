package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SaveableStateHolder.kt */
@Metadata
/* loaded from: classes.dex */
final class SaveableStateHolderImpl$RegistryHolder$registry$1 extends Lambda implements Function1<Object, Boolean> {
    final /* synthetic */ SaveableStateHolderImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$RegistryHolder$registry$1(SaveableStateHolderImpl saveableStateHolderImpl) {
        super(1);
        this.this$0 = saveableStateHolderImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SaveableStateRegistry parentSaveableStateRegistry = this.this$0.getParentSaveableStateRegistry();
        return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.canBeSaved(it) : true);
    }
}
