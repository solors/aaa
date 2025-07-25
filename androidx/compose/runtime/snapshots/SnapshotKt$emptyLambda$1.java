package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Snapshot.kt */
@Metadata
/* loaded from: classes.dex */
final class SnapshotKt$emptyLambda$1 extends Lambda implements Function1<SnapshotIdSet, Unit> {
    public static final SnapshotKt$emptyLambda$1 INSTANCE = new SnapshotKt$emptyLambda$1();

    SnapshotKt$emptyLambda$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SnapshotIdSet it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
        invoke2(snapshotIdSet);
        return Unit.f99208a;
    }
}
