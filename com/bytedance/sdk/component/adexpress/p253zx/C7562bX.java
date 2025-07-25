package com.bytedance.sdk.component.adexpress.p253zx;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.adexpress.zx.bX */
/* loaded from: classes3.dex */
public class C7562bX {

    /* renamed from: bg */
    private WeakReference<InterfaceC7561IL> f16466bg;

    public C7562bX(InterfaceC7561IL interfaceC7561IL) {
        this.f16466bg = new WeakReference<>(interfaceC7561IL);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f16466bg.get();
        }
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            return this.f16466bg.get().adInfo();
        }
        return "";
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            return this.f16466bg.get().appInfo();
        }
        return "";
    }

    /* renamed from: bg */
    public void m88555bg(InterfaceC7561IL interfaceC7561IL) {
        this.f16466bg = new WeakReference<>(interfaceC7561IL);
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f16466bg.get().changeVideoState(str);
        }
    }

    @JavascriptInterface
    public void chooseAdResult(String str) {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f16466bg.get().chooseAdResult(str);
        }
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f16466bg.get().clickEvent(str);
        }
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f16466bg.get().dynamicTrack(str);
        }
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            return this.f16466bg.get().getCurrentVideoState();
        }
        return "";
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            return this.f16466bg.get().getData(str);
        }
        return "";
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            return this.f16466bg.get().getTemplateInfo();
        }
        return "";
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f16466bg.get().initRenderFinish();
        }
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f16466bg.get().muteVideo(str);
        }
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f16466bg.get().renderDidFinish(str);
        }
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f16466bg.get().mo84578bg(str);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<InterfaceC7561IL> weakReference = this.f16466bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f16466bg.get().skipVideo();
        }
    }
}
