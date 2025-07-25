package com.mobilefuse.sdk.service;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MobileFuseServices.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFuseServices$requireAllServices$2 extends Lambda implements Function1<Either<? extends ServicesInitError, ? extends ServicesInitResult>, Unit> {
    final /* synthetic */ Functions $completeAction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseServices$requireAllServices$2(Functions functions) {
        super(1);
        this.$completeAction = functions;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Either<? extends ServicesInitError, ? extends ServicesInitResult> either) {
        invoke2((Either<ServicesInitError, ServicesInitResult>) either);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Either<ServicesInitError, ServicesInitResult> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof SuccessResult) {
            this.$completeAction.invoke();
        } else {
            boolean z = result instanceof ErrorResult;
        }
    }
}
