package androidx.compose.runtime.saveable;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: RememberSaveable.kt */
@Metadata
/* loaded from: classes.dex */
final class RememberSaveableKt$mutableStateSaver$1$2<T> extends Lambda implements Function1<SnapshotState<Object>, SnapshotState<T>> {
    final /* synthetic */ Saver<T, Object> $this_with;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$mutableStateSaver$1$2(Saver<T, Object> saver) {
        super(1);
        this.$this_with = saver;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final SnapshotState<T> invoke(@NotNull SnapshotState<Object> it) {
        T t;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof SnapshotMutableState) {
            if (it.getValue() != null) {
                Saver<T, Object> saver = this.$this_with;
                Object value = it.getValue();
                Intrinsics.m17074g(value);
                t = saver.restore(value);
            } else {
                t = null;
            }
            return SnapshotStateKt.mutableStateOf(t, ((SnapshotMutableState) it).getPolicy());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
