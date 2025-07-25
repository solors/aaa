package com.mbridge.msdk.video.signal.p534a;

import com.mbridge.msdk.video.module.MBridgeContainerView;

/* renamed from: com.mbridge.msdk.video.signal.a.m */
/* loaded from: classes6.dex */
public final class JSContainerModule extends DefaultJSContainerModule {

    /* renamed from: a */
    private MBridgeContainerView f60904a;

    public JSContainerModule(MBridgeContainerView mBridgeContainerView) {
        this.f60904a = mBridgeContainerView;
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSContainerModule
    public final void configurationChanged(int i, int i2, int i3) {
        super.configurationChanged(i, i2, i3);
        try {
            MBridgeContainerView mBridgeContainerView = this.f60904a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.configurationChanged(i, i2, i3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSContainerModule
    public final boolean endCardShowing() {
        try {
            MBridgeContainerView mBridgeContainerView = this.f60904a;
            if (mBridgeContainerView != null) {
                return mBridgeContainerView.endCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.endCardShowing();
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSContainerModule
    public final void hideAlertWebview() {
        super.hideAlertWebview();
        MBridgeContainerView mBridgeContainerView = this.f60904a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.hideAlertWebview();
        }
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSContainerModule
    public final void ivRewardAdsWithoutVideo(String str) {
        super.ivRewardAdsWithoutVideo(str);
        MBridgeContainerView mBridgeContainerView = this.f60904a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.ivRewardAdsWithoutVideo(str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSContainerModule
    public final boolean miniCardShowing() {
        try {
            MBridgeContainerView mBridgeContainerView = this.f60904a;
            if (mBridgeContainerView != null) {
                return mBridgeContainerView.miniCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardShowing();
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSContainerModule
    public final void readyStatus(int i) {
        try {
            MBridgeContainerView mBridgeContainerView = this.f60904a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.readyStatus(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.readyStatus(i);
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSContainerModule
    public final void resizeMiniCard(int i, int i2, int i3) {
        super.resizeMiniCard(i, i2, i3);
        try {
            MBridgeContainerView mBridgeContainerView = this.f60904a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.resizeMiniCard(i, i2, i3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSContainerModule
    public final boolean showAlertWebView() {
        super.showAlertWebView();
        MBridgeContainerView mBridgeContainerView = this.f60904a;
        if (mBridgeContainerView != null) {
            return mBridgeContainerView.showAlertWebView();
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSContainerModule
    public final void showEndcard(int i) {
        super.showEndcard(i);
        try {
            MBridgeContainerView mBridgeContainerView = this.f60904a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showEndcard(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSContainerModule
    public final void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        super.showMiniCard(i, i2, i3, i4, i5);
        try {
            MBridgeContainerView mBridgeContainerView = this.f60904a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showMiniCard(i, i2, i3, i4, i5);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSContainerModule
    public final void showVideoClickView(int i) {
        super.showVideoClickView(i);
        MBridgeContainerView mBridgeContainerView = this.f60904a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.showVideoClickView(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSContainerModule
    public final void showVideoEndCover() {
        super.showVideoEndCover();
        try {
            MBridgeContainerView mBridgeContainerView = this.f60904a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showVideoEndCover();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSContainerModule, com.mbridge.msdk.video.signal.IJSRewardVideoModuleV1
    public final void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        try {
            MBridgeContainerView mBridgeContainerView = this.f60904a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.toggleCloseBtn(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
