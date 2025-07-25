package com.mobilefuse.sdk.service;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MutableCollections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: MobileFuseServices.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFuseServices {
    private static boolean allServicesInitialized;
    @Nullable
    private static String sdkDisableReason;
    @NotNull
    public static final MobileFuseServices INSTANCE = new MobileFuseServices();
    private static boolean sdkEnabled = true;
    @NotNull
    private static final Set<MobileFuseService> registeredServices = new LinkedHashSet();
    private static final Map<MobileFuseService, Boolean> servicesResultMap = new LinkedHashMap();

    private MobileFuseServices() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean deviceMeetsMobileFuseSdkRequirements() {
        Either errorResult;
        Object value;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
        } catch (Throwable th) {
            if (C23684x11026e5e.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (!sdkEnabled) {
            return false;
        }
        if (!Utils.isJavaVersionSupported()) {
            sdkDisableReason = "The MobileFuse SDK requires Java 8 or higher.";
            sdkEnabled = false;
        }
        errorResult = new SuccessResult(Boolean.valueOf(sdkEnabled));
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            value = Boolean.FALSE;
        } else if (errorResult instanceof SuccessResult) {
            value = ((SuccessResult) errorResult).getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ((Boolean) value).booleanValue();
    }

    @Nullable
    public static final String getSdkDisableReason() {
        return sdkDisableReason;
    }

    public static final boolean getSdkEnabled() {
        return sdkEnabled;
    }

    public static final void initAllServices(@NotNull Function1<? super Either<ServicesInitError, ServicesInitResult>, Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        initServices(registeredServices, completeAction);
    }

    public static final void initServices(@NotNull Set<? extends MobileFuseService> services, @NotNull Function1<? super Either<ServicesInitError, ServicesInitResult>, Unit> completeAction) {
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        SchedulersKt.safelyRunOnMainThread$default(null, new MobileFuseServices$initServices$1(services, completeAction), 1, null);
    }

    public static final void requireAllServices() {
        requireAllServices(MobileFuseServices$requireAllServices$1.INSTANCE);
    }

    public static final void requireServices(@NotNull Set<? extends MobileFuseService> services, @NotNull Functions<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        initServices(services, new MobileFuseServices$requireServices$1(completeAction));
    }

    public static final void resetAllServices() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            allServicesInitialized = false;
            sdkEnabled = true;
            sdkDisableReason = null;
            servicesResultMap.clear();
            for (MobileFuseService mobileFuseService : registeredServices) {
                mobileFuseService.reset();
            }
            registeredServices.clear();
        } catch (Throwable th) {
            int i = C23692x125ce44e.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    public final boolean getAllServicesInitialized() {
        return allServicesInitialized;
    }

    @NotNull
    public final Set<MobileFuseService> getRegisteredServices$mobilefuse_sdk_core_release() {
        return registeredServices;
    }

    public final void registerServices$mobilefuse_sdk_core_release(@NotNull Set<? extends MobileFuseService> services) {
        Intrinsics.checkNotNullParameter(services, "services");
        MutableCollections.m17624D(registeredServices, services);
    }

    public static final void requireAllServices(@NotNull Functions<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        initAllServices(new MobileFuseServices$requireAllServices$2(completeAction));
    }

    public static /* synthetic */ void getSdkDisableReason$annotations() {
    }

    public static /* synthetic */ void getSdkEnabled$annotations() {
    }
}
