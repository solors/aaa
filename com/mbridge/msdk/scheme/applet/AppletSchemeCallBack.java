package com.mbridge.msdk.scheme.applet;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* loaded from: classes6.dex */
public abstract class AppletSchemeCallBack implements IAppletSchemeCallBack {
    private static final String TAG = "AppletSchemeCallBack";

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestFailed(int i, String str, String str2) {
        try {
            onRequestFailed(i, str, str2);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b(TAG, e.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestStart() {
        try {
            onRequestStart();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b(TAG, e.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestSuccess(String str) {
        try {
            onRequestSuccess(str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b(TAG, e.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onNetworkError(int i, String str, String str2) {
        try {
            onRequestFailed(i, str, str2);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b(TAG, e.getMessage());
            }
        }
    }

    protected abstract void onRequestFailed(int i, String str, String str2);

    protected abstract void onRequestStart();

    protected abstract void onRequestSuccess(String str);
}
