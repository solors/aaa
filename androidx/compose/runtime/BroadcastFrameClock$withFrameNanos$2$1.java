package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: BroadcastFrameClock.kt */
@Metadata
/* loaded from: classes.dex */
final class BroadcastFrameClock$withFrameNanos$2$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ C37609n0<BroadcastFrameClock.FrameAwaiter<R>> $awaiter;
    final /* synthetic */ BroadcastFrameClock this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastFrameClock$withFrameNanos$2$1(BroadcastFrameClock broadcastFrameClock, C37609n0<BroadcastFrameClock.FrameAwaiter<R>> c37609n0) {
        super(1);
        this.this$0 = broadcastFrameClock;
        this.$awaiter = c37609n0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        BroadcastFrameClock.FrameAwaiter frameAwaiter;
        Object obj = this.this$0.lock;
        BroadcastFrameClock broadcastFrameClock = this.this$0;
        C37609n0<BroadcastFrameClock.FrameAwaiter<R>> c37609n0 = this.$awaiter;
        synchronized (obj) {
            List list = broadcastFrameClock.awaiters;
            Object obj2 = c37609n0.f99327b;
            if (obj2 == null) {
                Intrinsics.m17056y("awaiter");
                frameAwaiter = null;
            } else {
                frameAwaiter = (BroadcastFrameClock.FrameAwaiter) obj2;
            }
            list.remove(frameAwaiter);
            Unit unit = Unit.f99208a;
        }
    }
}
