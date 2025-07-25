package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.service.ServicesInitError;
import com.mobilefuse.sdk.service.ServicesInitResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: EidService.kt */
@Metadata
/* loaded from: classes7.dex */
final class EidService$requireInitializedEidService$1$1 extends Lambda implements Function1<Either<? extends ServicesInitError, ? extends ServicesInitResult>, Unit> {
    public static final EidService$requireInitializedEidService$1$1 INSTANCE = new EidService$requireInitializedEidService$1$1();

    EidService$requireInitializedEidService$1$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Either<ServicesInitError, ServicesInitResult> it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Either<? extends ServicesInitError, ? extends ServicesInitResult> either) {
        invoke2((Either<ServicesInitError, ServicesInitResult>) either);
        return Unit.f99208a;
    }
}
