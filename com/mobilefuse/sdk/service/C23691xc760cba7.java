package com.mobilefuse.sdk.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseServices.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$2 */
/* loaded from: classes7.dex */
final /* synthetic */ class C23691xc760cba7 extends FunctionReferenceImpl implements Function2<MobileFuseService, Boolean, Unit> {
    final /* synthetic */ C23690xc760cba6 $serviceCallback$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23691xc760cba7(C23690xc760cba6 c23690xc760cba6) {
        super(2, null, "serviceCallback", "invoke(Lcom/mobilefuse/sdk/service/MobileFuseService;Z)V", 0);
        this.$serviceCallback$1 = c23690xc760cba6;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(MobileFuseService mobileFuseService, Boolean bool) {
        invoke(mobileFuseService, bool.booleanValue());
        return Unit.f99208a;
    }

    public final void invoke(@NotNull MobileFuseService p1, boolean z) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        this.$serviceCallback$1.invoke(p1, z);
    }
}
