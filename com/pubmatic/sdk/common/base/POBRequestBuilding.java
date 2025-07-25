package com.pubmatic.sdk.common.base;

import com.pubmatic.sdk.common.models.POBAppInfo;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.utility.POBLocationDetector;

/* loaded from: classes7.dex */
public interface POBRequestBuilding {
    POBHttpRequest build();

    void setAppInfo(POBAppInfo pOBAppInfo);

    void setDeviceInfo(POBDeviceInfo pOBDeviceInfo);

    void setLocationDetector(POBLocationDetector pOBLocationDetector);
}
