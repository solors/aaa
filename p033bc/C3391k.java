package p033bc;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.InterfaceC37731g1;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata
/* renamed from: bc.k */
/* loaded from: classes9.dex */
public final class C3391k extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: g */
    final /* synthetic */ InterfaceC37731g1 f1697g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3391k(InterfaceC37731g1 interfaceC37731g1) {
        super(1);
        this.f1697g = interfaceC37731g1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        this.f1697g.dispose();
    }
}
