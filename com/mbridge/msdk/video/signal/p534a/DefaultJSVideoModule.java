package com.mbridge.msdk.video.signal.p534a;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.video.signal.IJSVideoModule;

/* renamed from: com.mbridge.msdk.video.signal.a.h */
/* loaded from: classes6.dex */
public class DefaultJSVideoModule implements IJSVideoModule {
    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void alertWebViewShowed() {
        SameLogTool.m51827a("DefaultJSVideoModule", "alertWebViewShowed:");
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void closeVideoOperate(int i, int i2) {
        SameLogTool.m51827a("DefaultJSVideoModule", "closeOperte:close=" + i + "closeViewVisible=" + i2);
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void dismissAllAlert() {
        SameLogTool.m51827a("DefaultJSVideoModule", "dismissAllAlert");
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public int getBorderViewHeight() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public int getBorderViewLeft() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public int getBorderViewRadius() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public int getBorderViewTop() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public int getBorderViewWidth() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public String getCurrentProgress() {
        SameLogTool.m51827a("DefaultJSVideoModule", "getCurrentProgress");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void hideAlertView(int i) {
        SameLogTool.m51827a("DefaultJSVideoModule", "hideAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public boolean isH5Canvas() {
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void notifyCloseBtn(int i) {
        SameLogTool.m51827a("DefaultJSVideoModule", "notifyCloseBtn:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void progressBarOperate(int i) {
        SameLogTool.m51827a("DefaultJSVideoModule", "progressBarOperate:progressViewVisible=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void progressOperate(int i, int i2) {
        SameLogTool.m51827a("DefaultJSVideoModule", "progressOperate:progress=" + i + "progressViewVisible=" + i2);
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void setCover(boolean z) {
        SameLogTool.m51827a("DefaultJSVideoModule", "setCover:" + z);
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void setMiniEndCardState(boolean z) {
        SameLogTool.m51827a("DefaultJSVideoModule", "setMiniEndCardState");
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void setScaleFitXY(int i) {
        SameLogTool.m51827a("DefaultJSVideoModule", "setScaleFitXY:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void setVisible(int i) {
        SameLogTool.m51827a("DefaultJSVideoModule", "setVisible:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void showAlertView() {
        SameLogTool.m51827a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void showIVRewardAlertView(String str) {
        SameLogTool.m51827a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        SameLogTool.m51827a("DefaultJSVideoModule", "showVideoLocation:marginTop=" + i + ",marginLeft=" + i2 + ",width=" + i3 + ",height=" + i4 + ",radius=" + i5 + ",borderTop=" + i6 + ",borderTop=" + i6 + ",borderLeft=" + i7 + ",borderWidth=" + i8 + ",borderHeight=" + i9);
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void soundOperate(int i, int i2) {
        SameLogTool.m51827a("DefaultJSVideoModule", "soundOperate:mute=" + i + ",soundViewVisible=" + i2);
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void videoOperate(int i) {
        SameLogTool.m51827a("DefaultJSVideoModule", "videoOperate:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSVideoModule
    public void soundOperate(int i, int i2, String str) {
        SameLogTool.m51827a("DefaultJSVideoModule", "soundOperate:mute=" + i + ",soundViewVisible=" + i2 + ",pt=" + str);
    }
}
