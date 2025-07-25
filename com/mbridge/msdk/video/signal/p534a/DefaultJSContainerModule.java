package com.mbridge.msdk.video.signal.p534a;

import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.video.signal.IJSContainerModule;
import com.mbridge.msdk.video.signal.IJSRewardVideoModuleV1;

/* renamed from: com.mbridge.msdk.video.signal.a.e */
/* loaded from: classes6.dex */
public class DefaultJSContainerModule implements IJSContainerModule, IJSRewardVideoModuleV1 {
    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public boolean endCardShowing() {
        SameLogTool.m51827a("DefaultJSContainerModule", "endCardShowing");
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void hideAlertWebview() {
        SameLogTool.m51827a("DefaultJSContainerModule", "hideAlertWebview ,msg=");
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void ivRewardAdsWithoutVideo(String str) {
        SameLogTool.m51827a("DefaultJSContainerModule", "ivRewardAdsWithoutVideo,params=");
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public boolean miniCardShowing() {
        SameLogTool.m51827a("DefaultJSContainerModule", "miniCardShowing");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.IJSRewardVideoModuleV1
    public void notifyCloseBtn(int i) {
        SameLogTool.m51827a("DefaultJSContainerModule", "notifyCloseBtn:state = " + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void readyStatus(int i) {
        SameLogTool.m51827a("DefaultJSContainerModule", "readyStatus:isReady=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void resizeMiniCard(int i, int i2, int i3) {
        SameLogTool.m51827a("DefaultJSContainerModule", "showMiniCard width = " + i + " height = " + i2 + " radius = " + i3);
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public boolean showAlertWebView() {
        SameLogTool.m51827a("DefaultJSContainerModule", "showAlertWebView ,msg=");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void showEndcard(int i) {
        SameLogTool.m51827a("DefaultJSContainerModule", "showEndcard,type=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        SameLogTool.m51827a("DefaultJSContainerModule", "showMiniCard top = " + i + " left = " + i2 + " width = " + i3 + " height = " + i4 + " radius = " + i5);
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void showVideoClickView(int i) {
        SameLogTool.m51827a("DefaultJSContainerModule", "showVideoClickView:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void showVideoEndCover() {
        SameLogTool.m51827a("DefaultJSContainerModule", "showVideoEndCover");
    }

    @Override // com.mbridge.msdk.video.signal.IJSRewardVideoModuleV1
    public void toggleCloseBtn(int i) {
        SameLogTool.m51827a("DefaultJSContainerModule", "toggleCloseBtn:state=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSContainerModule
    public void configurationChanged(int i, int i2, int i3) {
    }
}
