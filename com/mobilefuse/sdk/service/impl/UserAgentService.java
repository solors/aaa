package com.mobilefuse.sdk.service.impl;

import com.mobilefuse.sdk.device.UserAgentInfoKt;
import com.mobilefuse.sdk.service.MobileFuseService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UserAgentService.kt */
@Metadata
/* loaded from: classes7.dex */
public final class UserAgentService extends MobileFuseService {
    @NotNull
    public static final UserAgentService INSTANCE = new UserAgentService();

    private UserAgentService() {
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    public void initServiceImpl$mobilefuse_sdk_core_release(@NotNull Function2<? super MobileFuseService, ? super Boolean, Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        UserAgentInfoKt.getUserAgentInfo().requestUserAgent(new UserAgentService$initServiceImpl$1(completeAction));
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected void resetImpl() {
    }
}
