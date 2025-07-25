package com.mobilefuse.sdk.service.impl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: UserAgentService.kt */
@Metadata
/* loaded from: classes7.dex */
final class UserAgentService$initServiceImpl$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Function2 $completeAction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentService$initServiceImpl$1(Function2 function2) {
        super(1);
        this.$completeAction = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$completeAction.mo105910invoke(UserAgentService.INSTANCE, Boolean.TRUE);
    }
}
