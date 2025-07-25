package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p674fe.Channel;

/* compiled from: SnapshotFlow.kt */
@Metadata
/* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 */
/* loaded from: classes.dex */
final class C0819x2a9856a3 extends Lambda implements Function2<Set<? extends Object>, Snapshot, Unit> {
    final /* synthetic */ Channel<Set<Object>> $appliedChanges;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0819x2a9856a3(Channel<Set<Object>> channel) {
        super(2);
        this.$appliedChanges = channel;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Set<? extends Object> set, Snapshot snapshot) {
        invoke2(set, snapshot);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Set<? extends Object> changed, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(changed, "changed");
        Intrinsics.checkNotNullParameter(snapshot, "<anonymous parameter 1>");
        this.$appliedChanges.mo24641p(changed);
    }
}
