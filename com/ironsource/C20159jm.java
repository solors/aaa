package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.jm */
/* loaded from: classes6.dex */
public final class C20159jm implements InterfaceC20108im {
    @Override // com.ironsource.InterfaceC20108im
    /* renamed from: a */
    public void mo57804a(int i) {
        SDKUtils.setDebugMode(i);
    }

    @Override // com.ironsource.InterfaceC20108im
    /* renamed from: b */
    public void mo57800b(@NotNull String controllerUrl) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        SDKUtils.setControllerUrl(controllerUrl);
    }

    @Override // com.ironsource.InterfaceC20108im
    /* renamed from: a */
    public void mo57803a(@NotNull Context applicationContext, @NotNull String applicationKey, @NotNull String userId, @NotNull Map<String, String> initParams) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        IronSourceNetwork.initSDK(applicationContext, applicationKey, userId, initParams);
    }

    @Override // com.ironsource.InterfaceC20108im
    /* renamed from: a */
    public void mo57802a(@NotNull InterfaceC19928fn onNetworkSDKInitListener) {
        Intrinsics.checkNotNullParameter(onNetworkSDKInitListener, "onNetworkSDKInitListener");
        IronSourceNetwork.addInitListener(onNetworkSDKInitListener);
    }

    @Override // com.ironsource.InterfaceC20108im
    /* renamed from: a */
    public void mo57801a(@NotNull String controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        SDKUtils.setControllerConfig(controllerConfig);
    }
}
