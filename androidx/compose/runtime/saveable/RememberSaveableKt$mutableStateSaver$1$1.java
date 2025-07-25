package androidx.compose.runtime.saveable;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: RememberSaveable.kt */
@Metadata
/* loaded from: classes.dex */
final class RememberSaveableKt$mutableStateSaver$1$1<T> extends Lambda implements Function2<SaverScope, SnapshotState<T>, SnapshotState<Object>> {
    final /* synthetic */ Saver<T, Object> $this_with;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$mutableStateSaver$1$1(Saver<T, Object> saver) {
        super(2);
        this.$this_with = saver;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ SnapshotState<Object> mo105910invoke(SaverScope saverScope, Object obj) {
        return invoke(saverScope, (SnapshotState) ((SnapshotState) obj));
    }

    @Nullable
    public final SnapshotState<Object> invoke(@NotNull SaverScope Saver, @NotNull SnapshotState<T> state) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof SnapshotMutableState) {
            return SnapshotStateKt.mutableStateOf(this.$this_with.save(Saver, state.getValue()), ((SnapshotMutableState) state).getPolicy());
        }
        throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
    }
}
