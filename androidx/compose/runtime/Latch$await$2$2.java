package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.InterfaceC37780o;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Latch.kt */
@Metadata
/* loaded from: classes.dex */
public final class Latch$await$2$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ InterfaceC37780o<Unit> $co;
    final /* synthetic */ Latch this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Latch$await$2$2(Latch latch, InterfaceC37780o<? super Unit> interfaceC37780o) {
        super(1);
        this.this$0 = latch;
        this.$co = interfaceC37780o;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        Object obj = this.this$0.lock;
        Latch latch = this.this$0;
        InterfaceC37780o<Unit> interfaceC37780o = this.$co;
        synchronized (obj) {
            latch.awaiters.remove(interfaceC37780o);
            Unit unit = Unit.f99208a;
        }
    }
}
