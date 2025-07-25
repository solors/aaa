package androidx.compose.runtime.saveable;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RememberSaveable.kt */
@Metadata
/* loaded from: classes.dex */
final class RememberSaveableKt$rememberSaveable$1$valueProvider$1 extends Lambda implements Functions<Object> {
    final /* synthetic */ SaveableStateRegistry $registry;
    final /* synthetic */ State<Saver<T, Object>> $saverState;
    final /* synthetic */ State<T> $valueState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RememberSaveableKt$rememberSaveable$1$valueProvider$1(State<? extends Saver<T, Object>> state, State<? extends T> state2, SaveableStateRegistry saveableStateRegistry) {
        super(0);
        this.$saverState = state;
        this.$valueState = state2;
        this.$registry = saveableStateRegistry;
    }

    @Override // kotlin.jvm.functions.Functions
    @Nullable
    public final Object invoke() {
        Object value = this.$saverState.getValue();
        State<T> state = this.$valueState;
        final SaveableStateRegistry saveableStateRegistry = this.$registry;
        return ((Saver) value).save(new SaverScope() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1$1$1
            @Override // androidx.compose.runtime.saveable.SaverScope
            public final boolean canBeSaved(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return SaveableStateRegistry.this.canBeSaved(it);
            }
        }, state.getValue());
    }
}
