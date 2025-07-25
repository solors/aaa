package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.IJSActivityProxy;
import com.mbridge.msdk.video.signal.IJSBTModule;
import com.mbridge.msdk.video.signal.IJSCommon;
import com.mbridge.msdk.video.signal.IJSContainerModule;
import com.mbridge.msdk.video.signal.IJSNotifyProxy;
import com.mbridge.msdk.video.signal.IJSRewardVideoV1;
import com.mbridge.msdk.video.signal.IJSVideoModule;
import com.mbridge.msdk.video.signal.p534a.DefaultJSActivity;
import com.mbridge.msdk.video.signal.p534a.DefaultJSBTModule;
import com.mbridge.msdk.video.signal.p534a.DefaultJSCommon;
import com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule;
import com.mbridge.msdk.video.signal.p534a.DefaultJSNotifyProxy;
import com.mbridge.msdk.video.signal.p534a.DefaultJSRewardVideoV1;
import com.mbridge.msdk.video.signal.p534a.DefaultJSVideoModule;

/* renamed from: com.mbridge.msdk.video.signal.factory.a */
/* loaded from: classes6.dex */
public class DefaultJSFactory implements IJSFactory {

    /* renamed from: a */
    protected IJSActivityProxy f61207a;

    /* renamed from: b */
    protected IJSCommon f61208b;

    /* renamed from: c */
    protected IJSVideoModule f61209c;

    /* renamed from: d */
    protected IJSNotifyProxy f61210d;

    /* renamed from: e */
    protected IJSContainerModule f61211e;

    /* renamed from: f */
    protected IJSRewardVideoV1 f61212f;

    /* renamed from: g */
    protected IJSBTModule f61213g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public IJSActivityProxy getActivityProxy() {
        if (this.f61207a == null) {
            this.f61207a = new DefaultJSActivity();
        }
        return this.f61207a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public IJSRewardVideoV1 getIJSRewardVideoV1() {
        if (this.f61212f == null) {
            this.f61212f = new DefaultJSRewardVideoV1();
        }
        return this.f61212f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public IJSBTModule getJSBTModule() {
        if (this.f61213g == null) {
            this.f61213g = new DefaultJSBTModule();
        }
        return this.f61213g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public IJSCommon getJSCommon() {
        if (this.f61208b == null) {
            this.f61208b = new DefaultJSCommon();
        }
        return this.f61208b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public IJSContainerModule getJSContainerModule() {
        if (this.f61211e == null) {
            this.f61211e = new DefaultJSContainerModule();
        }
        return this.f61211e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public IJSNotifyProxy getJSNotifyProxy() {
        if (this.f61210d == null) {
            this.f61210d = new DefaultJSNotifyProxy();
        }
        return this.f61210d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public IJSVideoModule getJSVideoModule() {
        if (this.f61209c == null) {
            this.f61209c = new DefaultJSVideoModule();
        }
        return this.f61209c;
    }
}
