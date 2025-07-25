package com.mbridge.msdk.mbsignalcommon.mraid;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.b */
/* loaded from: classes6.dex */
public interface IMraidSignalCommunication {
    void close();

    void expand(String str, boolean z);

    CampaignEx getMraidCampaign();

    void open(String str);

    void unload();

    void useCustomClose(boolean z);
}
