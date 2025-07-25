package com.mobilefuse.sdk.service.impl;

import com.mobilefuse.sdk.service.MobileFuseService;
import com.mobilefuse.sdk.telemetry.ExceptionHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExceptionHandlerSampleRateUpdateService.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ExceptionHandlerSampleRateUpdateService extends MobileFuseService {
    @NotNull
    public static final ExceptionHandlerSampleRateUpdateService INSTANCE = new ExceptionHandlerSampleRateUpdateService();

    private ExceptionHandlerSampleRateUpdateService() {
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    public void initServiceImpl$mobilefuse_sdk_core_release(@NotNull Function2<? super MobileFuseService, ? super Boolean, Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandler.Companion.updateSampleRateFromServer();
        completeAction.mo105910invoke(this, Boolean.TRUE);
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected void resetImpl() {
    }
}
