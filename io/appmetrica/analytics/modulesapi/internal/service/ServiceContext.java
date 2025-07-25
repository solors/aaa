package io.appmetrica.analytics.modulesapi.internal.service;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ServiceContext {
    @NotNull
    ActivationBarrier getActivationBarrier();

    @NotNull
    ApplicationStateProvider getApplicationStateProvider();

    @NotNull
    ChargeTypeProvider getChargeTypeProvider();

    @NotNull
    Context getContext();

    @NotNull
    CryptoProvider getCryptoProvider();

    @NotNull
    DataSendingRestrictionController getDataSendingRestrictionController();

    @NotNull
    ExecutorProvider getExecutorProvider();

    @NotNull
    FirstExecutionConditionService getFirstExecutionConditionService();

    @NotNull
    LocationServiceApi getLocationServiceApi();

    @NotNull
    ModuleServiceLifecycleController getModuleServiceLifecycleController();

    @NotNull
    ServiceNetworkContext getNetworkContext();

    @NotNull
    PlatformIdentifiers getPlatformIdentifiers();

    @NotNull
    SdkEnvironmentProvider getSdkEnvironmentProvider();

    @NotNull
    ModuleSelfReporter getSelfReporter();

    @NotNull
    ServiceStorageProvider getServiceStorageProvider();

    @NotNull
    ServiceWakeLock getServiceWakeLock();
}
