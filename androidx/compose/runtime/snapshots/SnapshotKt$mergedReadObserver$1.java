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
final class SnapshotKt$mergedReadObserver$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ Function1<Object, Unit> $parentObserver;
    final /* synthetic */ Function1<Object, Unit> $readObserver;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotKt$mergedReadObserver$1(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(1);
        this.$readObserver = function1;
        this.$parentObserver = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.$readObserver.invoke(state);
        this.$parentObserver.invoke(state);
    }
}
