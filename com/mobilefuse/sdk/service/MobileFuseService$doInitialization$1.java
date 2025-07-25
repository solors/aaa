package com.mobilefuse.sdk.service;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MobileFuseService.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFuseService$doInitialization$1 extends Lambda implements Function2<MobileFuseService, Boolean, Unit> {
    final /* synthetic */ MobileFuseService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseService$doInitialization$1(MobileFuseService mobileFuseService) {
        super(2);
        this.this$0 = mobileFuseService;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(MobileFuseService mobileFuseService, Boolean bool) {
        invoke(mobileFuseService, bool.booleanValue());
        return Unit.f99208a;
    }

    public final void invoke(@NotNull MobileFuseService mfService, boolean z) {
        List list;
        List<Function2> m17553Z0;
        List list2;
        int i;
        Intrinsics.checkNotNullParameter(mfService, "mfService");
        this.this$0.setState(z ? ServiceInitState.INITIALIZED : ServiceInitState.ERROR);
        list = this.this$0.awaitingCallbacks;
        m17553Z0 = _Collections.m17553Z0(list);
        list2 = this.this$0.awaitingCallbacks;
        list2.clear();
        for (Function2 function2 : m17553Z0) {
            i = this.this$0.currentInitAttempt;
            function2.mo105910invoke(mfService, Boolean.valueOf(i >= this.this$0.getMaxInitAttempts() ? true : z));
        }
    }
}
