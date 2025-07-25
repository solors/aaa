package com.mbridge.msdk.video.signal.p534a;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.video.signal.IJSRewardVideoV1;

/* renamed from: com.mbridge.msdk.video.signal.a.g */
/* loaded from: classes6.dex */
public class DefaultJSRewardVideoV1 implements IJSRewardVideoV1 {
    @Override // com.mbridge.msdk.video.signal.IJSRewardVideoV1
    /* renamed from: a */
    public String mo48428a() {
        SameLogTool.m51827a("js", "getEndScreenInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.IJSRewardVideoV1
    /* renamed from: b */
    public void mo48426b(String str) {
        SameLogTool.m51827a("js", "setOrientation,landscape=" + str);
    }

    @Override // com.mbridge.msdk.video.signal.IJSRewardVideoV1
    /* renamed from: c */
    public void mo48425c(String str) {
        SameLogTool.m51827a("js", "handlerPlayableException，msg=" + str);
    }

    @Override // com.mbridge.msdk.video.signal.IJSRewardVideoModuleV1
    public void notifyCloseBtn(int i) {
        SameLogTool.m51827a("js", "notifyCloseBtn,state=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSRewardVideoModuleV1
    public void toggleCloseBtn(int i) {
        SameLogTool.m51827a("js", "toggleCloseBtn,state=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSRewardVideoV1
    /* renamed from: a */
    public void mo48427a(String str) {
        SameLogTool.m51827a("js", "triggerCloseBtn,state=" + str);
    }
}
