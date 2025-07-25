package com.mobilefuse.sdk.service;

import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* compiled from: MobileFuseServices.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1 */
/* loaded from: classes7.dex */
final class C23690xc760cba6 extends Lambda implements Function2<MobileFuseService, Boolean, Unit> {
    final /* synthetic */ Set $services;
    final /* synthetic */ Map $servicesResultMap;
    final /* synthetic */ FlowCollector $this_transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23690xc760cba6(FlowCollector flowCollector, Map map, Set set) {
        super(2);
        this.$this_transform = flowCollector;
        this.$servicesResultMap = map;
        this.$services = set;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(MobileFuseService mobileFuseService, Boolean bool) {
        invoke(mobileFuseService, bool.booleanValue());
        return Unit.f99208a;
    }

    public final void invoke(@NotNull MobileFuseService service, boolean z) {
        Intrinsics.checkNotNullParameter(service, "service");
        MobileFuseServices mobileFuseServices = MobileFuseServices.INSTANCE;
        MobileFuseServices_Logs.logServiceDebug(mobileFuseServices, "Service \"" + service + "\" completed initialization with success result: " + z);
        Map map = this.$servicesResultMap;
        Tuples m14532a = C38513v.m14532a(service, Boolean.valueOf(z));
        map.put(m14532a.m17630c(), m14532a.m17629d());
        if (this.$servicesResultMap.size() == this.$services.size()) {
            MobileFuseServices_Logs.logServiceDebug(mobileFuseServices, "All services completed initialization. Emit completion signal");
            this.$this_transform.emit(new SuccessResult(this.$servicesResultMap));
        }
    }
}
