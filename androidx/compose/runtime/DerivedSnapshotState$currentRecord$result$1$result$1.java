package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateObject;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: DerivedState.kt */
@Metadata
/* loaded from: classes.dex */
final class DerivedSnapshotState$currentRecord$result$1$result$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ HashSet<StateObject> $newDependencies;
    final /* synthetic */ DerivedSnapshotState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DerivedSnapshotState$currentRecord$result$1$result$1(DerivedSnapshotState<T> derivedSnapshotState, HashSet<StateObject> hashSet) {
        super(1);
        this.this$0 = derivedSnapshotState;
        this.$newDependencies = hashSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it != this.this$0) {
            if (it instanceof StateObject) {
                this.$newDependencies.add(it);
                return;
            }
            return;
        }
        throw new IllegalStateException("A derived state calculation cannot read itself".toString());
    }
}
