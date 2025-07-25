package com.appsflyer.internal;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public enum AFe1cSDK {
    API("api"),
    RC(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT),
    DEFAULT("");
    
    @NotNull
    public final String AFInAppEventType;

    AFe1cSDK(String str) {
        this.AFInAppEventType = str;
    }
}
