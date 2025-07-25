package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC37825z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotContextElement.kt */
@Metadata
@ExperimentalComposeApi
/* loaded from: classes.dex */
final class SnapshotContextElementImpl implements SnapshotContextElement, InterfaceC37825z2<Snapshot> {
    @NotNull
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(@NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.snapshot = snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r, function2);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, interfaceC37576b);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.InterfaceC37576b<?> getKey() {
        return SnapshotContextElement.Key;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, interfaceC37576b);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return SnapshotContextElement.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.InterfaceC37825z2
    public void restoreThreadContext(@NotNull CoroutineContext context, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.snapshot.unsafeLeave(snapshot);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.InterfaceC37825z2
    @Nullable
    public Snapshot updateThreadContext(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.snapshot.unsafeEnter();
    }
}
