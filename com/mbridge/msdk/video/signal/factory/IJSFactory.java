package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.IJSActivityProxy;
import com.mbridge.msdk.video.signal.IJSBTModule;
import com.mbridge.msdk.video.signal.IJSCommon;
import com.mbridge.msdk.video.signal.IJSContainerModule;
import com.mbridge.msdk.video.signal.IJSNotifyProxy;
import com.mbridge.msdk.video.signal.IJSRewardVideoV1;
import com.mbridge.msdk.video.signal.IJSVideoModule;

/* loaded from: classes6.dex */
public interface IJSFactory {
    IJSActivityProxy getActivityProxy();

    IJSRewardVideoV1 getIJSRewardVideoV1();

    IJSBTModule getJSBTModule();

    IJSCommon getJSCommon();

    IJSContainerModule getJSContainerModule();

    IJSNotifyProxy getJSNotifyProxy();

    IJSVideoModule getJSVideoModule();
}
