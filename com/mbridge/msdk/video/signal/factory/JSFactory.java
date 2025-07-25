package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.p511bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.signal.BaseIJSCommon;
import com.mbridge.msdk.video.signal.IJSActivityProxy;
import com.mbridge.msdk.video.signal.IJSBTModule;
import com.mbridge.msdk.video.signal.IJSCommon;
import com.mbridge.msdk.video.signal.IJSContainerModule;
import com.mbridge.msdk.video.signal.IJSNotifyProxy;
import com.mbridge.msdk.video.signal.IJSRewardVideoV1;
import com.mbridge.msdk.video.signal.IJSVideoModule;
import com.mbridge.msdk.video.signal.p534a.JSActivityProxy;
import com.mbridge.msdk.video.signal.p534a.JSBTModule;
import com.mbridge.msdk.video.signal.p534a.JSCommon;
import com.mbridge.msdk.video.signal.p534a.JSContainerModule;
import com.mbridge.msdk.video.signal.p534a.JSNotifyProxy;
import com.mbridge.msdk.video.signal.p534a.JSRewardVideoV1;
import com.mbridge.msdk.video.signal.p534a.JSVideoModule;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.signal.factory.b */
/* loaded from: classes6.dex */
public final class JSFactory extends DefaultJSFactory {

    /* renamed from: h */
    private Activity f61214h;

    /* renamed from: i */
    private WebView f61215i;

    /* renamed from: j */
    private MBridgeVideoView f61216j;

    /* renamed from: k */
    private MBridgeContainerView f61217k;

    /* renamed from: l */
    private CampaignEx f61218l;

    /* renamed from: m */
    private MBridgeBTContainer f61219m;

    /* renamed from: n */
    private BaseIJSCommon.InterfaceC23135a f61220n;

    /* renamed from: o */
    private String f61221o;

    /* renamed from: p */
    private List<CampaignEx> f61222p;

    public JSFactory(Activity activity) {
        this.f61214h = activity;
    }

    /* renamed from: a */
    public final void m48435a(JSCommon jSCommon) {
        this.f61208b = jSCommon;
    }

    @Override // com.mbridge.msdk.video.signal.factory.DefaultJSFactory, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final IJSActivityProxy getActivityProxy() {
        WebView webView = this.f61215i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f61207a == null) {
            this.f61207a = new JSActivityProxy(webView);
        }
        return this.f61207a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.DefaultJSFactory, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final IJSRewardVideoV1 getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f61217k;
        if (mBridgeContainerView != null && (activity = this.f61214h) != null) {
            if (this.f61212f == null) {
                this.f61212f = new JSRewardVideoV1(activity, mBridgeContainerView);
            }
            return this.f61212f;
        }
        return super.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.DefaultJSFactory, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final IJSBTModule getJSBTModule() {
        if (this.f61214h != null && this.f61219m != null) {
            if (this.f61213g == null) {
                this.f61213g = new JSBTModule(this.f61214h, this.f61219m);
            }
            return this.f61213g;
        }
        return super.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.DefaultJSFactory, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final IJSCommon getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f61214h;
        if (activity != null && (campaignEx = this.f61218l) != null) {
            if (this.f61208b == null) {
                this.f61208b = new JSCommon(activity, campaignEx);
            }
            if (this.f61218l.getDynamicTempCode() == 5 && (list = this.f61222p) != null) {
                IJSCommon iJSCommon = this.f61208b;
                if (iJSCommon instanceof JSCommon) {
                    ((JSCommon) iJSCommon).m48581a(list);
                }
            }
            this.f61208b.mo48585a(this.f61214h);
            this.f61208b.mo48611a(this.f61221o);
            this.f61208b.mo48613a(this.f61220n);
            return this.f61208b;
        }
        return super.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.DefaultJSFactory, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final IJSContainerModule getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f61217k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f61211e == null) {
            this.f61211e = new JSContainerModule(mBridgeContainerView);
        }
        return this.f61211e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.DefaultJSFactory, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final IJSNotifyProxy getJSNotifyProxy() {
        WebView webView = this.f61215i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f61210d == null) {
            this.f61210d = new JSNotifyProxy(webView);
        }
        return this.f61210d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.DefaultJSFactory, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final IJSVideoModule getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f61216j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f61209c == null) {
            this.f61209c = new JSVideoModule(mBridgeVideoView);
        }
        return this.f61209c;
    }

    /* renamed from: a */
    public final void m48434a(List<CampaignEx> list) {
        this.f61222p = list;
    }

    public JSFactory(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f61214h = activity;
        this.f61219m = mBridgeBTContainer;
        this.f61215i = webView;
    }

    public JSFactory(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, BaseIJSCommon.InterfaceC23135a interfaceC23135a) {
        this.f61214h = activity;
        this.f61215i = webView;
        this.f61216j = mBridgeVideoView;
        this.f61217k = mBridgeContainerView;
        this.f61218l = campaignEx;
        this.f61220n = interfaceC23135a;
        this.f61221o = mBridgeVideoView.getUnitId();
    }
}
