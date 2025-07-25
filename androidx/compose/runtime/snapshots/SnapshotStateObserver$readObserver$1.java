package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateObserver.kt */
@Metadata
/* loaded from: classes.dex */
public final class SnapshotStateObserver$readObserver$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$readObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(1);
        this.this$0 = snapshotStateObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object state) {
        boolean z;
        MutableVector mutableVector;
        SnapshotStateObserver.ApplyMap applyMap;
        Intrinsics.checkNotNullParameter(state, "state");
        z = this.this$0.isPaused;
        if (z) {
            return;
        }
        mutableVector = this.this$0.applyMaps;
        SnapshotStateObserver snapshotStateObserver = this.this$0;
        synchronized (mutableVector) {
            applyMap = snapshotStateObserver.currentMap;
            Intrinsics.m17074g(applyMap);
            applyMap.addValue(state);
            Unit unit = Unit.f99208a;
        }
    }
}
