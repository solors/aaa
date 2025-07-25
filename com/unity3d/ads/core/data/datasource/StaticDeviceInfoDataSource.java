package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.p687v1.StaticDeviceInfoOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StaticDeviceInfoDataSource.kt */
@Metadata
/* loaded from: classes7.dex */
public interface StaticDeviceInfoDataSource {
    @Nullable
    Object fetch(@NotNull List<String> list, @NotNull Continuation<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> continuation);

    @NotNull
    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    @Nullable
    String getAnalyticsUserId();

    @NotNull
    String getAppName();

    @Nullable
    Object getAuid(@NotNull Continuation<? super String> continuation);

    @Nullable
    Object getIdfi(@NotNull Continuation<? super String> continuation);

    @NotNull
    String getManufacturer();

    @NotNull
    String getModel();

    @NotNull
    String getOsVersion();

    long getSystemBootTime();
}
