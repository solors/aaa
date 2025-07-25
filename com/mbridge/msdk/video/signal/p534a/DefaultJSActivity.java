package com.mbridge.msdk.video.signal.p534a;

import android.content.res.Configuration;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.video.signal.IJSActivityProxy;

/* renamed from: com.mbridge.msdk.video.signal.a.b */
/* loaded from: classes6.dex */
public class DefaultJSActivity implements IJSActivityProxy {
    @Override // com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: a */
    public void mo48550a() {
        SameLogTool.m51827a("DefaultJSActivity", "DefaultJSActivity-onPause");
    }

    @Override // com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: b */
    public void mo48547b() {
        SameLogTool.m51827a("DefaultJSActivity", "DefaultJSActivity-onResume");
    }

    @Override // com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: c */
    public void mo48546c() {
        SameLogTool.m51827a("DefaultJSActivity", "DefaultJSActivity-onDestory");
    }

    @Override // com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: d */
    public final void mo48545d() {
        SameLogTool.m51827a("DefaultJSActivity", "DefaultJSActivity-onStop");
    }

    @Override // com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: e */
    public final void mo48544e() {
        SameLogTool.m51827a("DefaultJSActivity", "DefaultJSActivity-onStart");
    }

    @Override // com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: f */
    public final void mo48543f() {
        SameLogTool.m51827a("DefaultJSActivity", "DefaultJSActivity-onRestart");
    }

    @Override // com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: g */
    public void mo48542g() {
        SameLogTool.m51827a("DefaultJSActivity", "DefaultJSActivity-onBackPressed");
    }

    @Override // com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: h */
    public int mo48541h() {
        SameLogTool.m51827a("DefaultJSActivity", "isSystemResume");
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: a */
    public void mo48548a(Configuration configuration) {
        SameLogTool.m51827a("DefaultJSActivity", "DefaultJSActivity-onConfigurationChanged:" + configuration.orientation);
    }

    @Override // com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: a */
    public void mo48549a(int i) {
        SameLogTool.m51827a("DefaultJSActivity", "setSystemResume,isResume:" + i);
    }
}
