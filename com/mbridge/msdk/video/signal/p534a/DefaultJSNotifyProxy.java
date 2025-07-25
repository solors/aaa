package com.mbridge.msdk.video.signal.p534a;

import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.IJSNotifyProxy;

/* renamed from: com.mbridge.msdk.video.signal.a.f */
/* loaded from: classes6.dex */
public class DefaultJSNotifyProxy implements IJSNotifyProxy {
    @Override // com.mbridge.msdk.video.signal.IJSNotifyProxy
    /* renamed from: a */
    public void mo48433a(int i) {
        SameLogTool.m51827a("DefaultJSNotifyProxy", "onVideoStatusNotify:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.IJSNotifyProxy
    /* renamed from: a */
    public void mo48431a(int i, String str) {
        SameLogTool.m51827a("DefaultJSNotifyProxy", "onClick:" + i + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.IJSNotifyProxy
    /* renamed from: a */
    public void mo48430a(MBridgeVideoView.C23125b c23125b) {
        SameLogTool.m51827a("DefaultJSNotifyProxy", "onProgressNotify:" + c23125b.toString());
    }

    @Override // com.mbridge.msdk.video.signal.IJSNotifyProxy
    /* renamed from: a */
    public void mo48429a(Object obj) {
        SameLogTool.m51827a("DefaultJSNotifyProxy", "onWebviewShow:" + obj);
    }

    @Override // com.mbridge.msdk.video.signal.IJSNotifyProxy
    /* renamed from: a */
    public void mo48432a(int i, int i2, int i3, int i4) {
        SameLogTool.m51827a("DefaultJSNotifyProxy", "showDataInfo");
    }
}
