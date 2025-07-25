package com.mobilefuse.sdk.service.impl;

import com.mobilefuse.sdk.device.DeviceCache;
import com.mobilefuse.sdk.service.MobileFuseService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeviceCacheService.kt */
@Metadata
/* loaded from: classes7.dex */
public final class DeviceCacheService extends MobileFuseService {
    @NotNull
    public static final DeviceCacheService INSTANCE = new DeviceCacheService();

    private DeviceCacheService() {
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    public void initServiceImpl$mobilefuse_sdk_core_release(@NotNull Function2<? super MobileFuseService, ? super Boolean, Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        DeviceCache.INSTANCE.initDefaultAppSharedPrefs();
        completeAction.mo105910invoke(this, Boolean.TRUE);
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected void resetImpl() {
    }
}
