package com.pubmatic.sdk.openwrap.core.signal;

import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: POBSignalBuilding.kt */
@Metadata
/* loaded from: classes7.dex */
public interface POBSignalBuilding {
    @NotNull
    String build();

    void setDeviceInfo(@Nullable POBDeviceInfo pOBDeviceInfo);

    void setRequest(@Nullable POBRequest pOBRequest);
}
