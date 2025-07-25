package androidx.compose.p015ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p674fe.Channel;

/* compiled from: GlobalSnapshotManager.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2 */
/* loaded from: classes.dex */
final class GlobalSnapshotManager$ensureStarted$2 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ Channel<Unit> $channel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$2(Channel<Unit> channel) {
        super(1);
        this.$channel = channel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$channel.mo24641p(Unit.f99208a);
    }
}
