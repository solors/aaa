package p033bc;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.InterfaceC37708b2;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata
/* renamed from: bc.l */
/* loaded from: classes9.dex */
public final class C3392l extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: g */
    final /* synthetic */ InterfaceC37708b2 f1698g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3392l(InterfaceC37708b2 interfaceC37708b2) {
        super(1);
        this.f1698g = interfaceC37708b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        if (th == null) {
            return;
        }
        this.f1698g.cancel(new CancellationException(th.getMessage()));
    }
}
