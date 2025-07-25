package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass;
import ge.InterfaceC33327h;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DynamicDeviceInfoDataSource.kt */
@Metadata
/* loaded from: classes7.dex */
public interface DynamicDeviceInfoDataSource {
    @NotNull
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch();

    @NotNull
    String getConnectionTypeStr();

    int getCurrentUiTheme();

    @NotNull
    List<String> getLocaleList();

    @NotNull
    String getOrientation();

    int getRingerMode();

    @NotNull
    InterfaceC33327h<VolumeSettingsChange> getVolumeSettingsChange();

    boolean hasInternet();
}
