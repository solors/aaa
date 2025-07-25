package com.mbridge.msdk.video.signal.p534a;

import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.video.signal.IJSBTModule;

/* renamed from: com.mbridge.msdk.video.signal.a.c */
/* loaded from: classes6.dex */
public class DefaultJSBTModule implements IJSBTModule {

    /* renamed from: a */
    private static final String f60881a = "c";

    @Override // com.mbridge.msdk.video.signal.IJSCommonClick
    public void click(int i, String str) {
        SameLogTool.m51827a(f60881a, "click");
    }

    @Override // com.mbridge.msdk.video.signal.IJSCommonClick
    public void handlerH5Exception(int i, String str) {
        SameLogTool.m51827a(f60881a, "handlerH5Exception");
    }

    @Override // com.mbridge.msdk.video.signal.IJSBTModule
    public void reactDeveloper(Object obj, String str) {
        SameLogTool.m51827a(f60881a, "reactDeveloper");
    }

    @Override // com.mbridge.msdk.video.signal.IJSBTModule
    public void reportUrls(Object obj, String str) {
        SameLogTool.m51827a(f60881a, "reportUrls");
    }
}
