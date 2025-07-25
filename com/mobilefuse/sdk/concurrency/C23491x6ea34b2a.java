package com.mobilefuse.sdk.concurrency;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Schedulers.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.concurrency.SchedulersKt$safelyRunOnScheduler$$inlined$gracefullyHandleException$lambda$1 */
/* loaded from: classes7.dex */
public final class C23491x6ea34b2a extends Lambda implements Functions<Unit> {
    final /* synthetic */ Functions $action$inlined;
    final /* synthetic */ Function1 $errorCallback$inlined;
    final /* synthetic */ Schedulers $scheduler$inlined;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23491x6ea34b2a(Schedulers schedulers, Functions functions, Function1 function1) {
        super(0);
        this.$scheduler$inlined = schedulers;
        this.$action$inlined = functions;
        this.$errorCallback$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Either errorResult;
        Functions functions = this.$action$inlined;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            errorResult = new SuccessResult(functions.invoke());
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            Function1 function1 = this.$errorCallback$inlined;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(th2);
            }
        }
    }
}
