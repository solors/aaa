package com.mbridge.msdk.video.module.p530a.p531a;

import androidx.annotation.RequiresApi;
import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;
import com.mbridge.msdk.video.module.p530a.OnNotifyListener;

/* renamed from: com.mbridge.msdk.video.module.a.a.g */
/* loaded from: classes6.dex */
public final class MiniCardProxyNotifyListener extends ProxyOnNotifyListener {

    /* renamed from: a */
    private MBridgeClickMiniCardView f60809a;

    public MiniCardProxyNotifyListener(MBridgeClickMiniCardView mBridgeClickMiniCardView, OnNotifyListener onNotifyListener) {
        super(onNotifyListener);
        this.f60809a = mBridgeClickMiniCardView;
    }

    @Override // com.mbridge.msdk.video.module.p530a.p531a.ProxyOnNotifyListener, com.mbridge.msdk.video.module.p530a.p531a.DefaultOnNotifyListener, com.mbridge.msdk.video.module.p530a.OnNotifyListener
    @RequiresApi(api = 11)
    /* renamed from: a */
    public final void mo48633a(int i, Object obj) {
        boolean z = false;
        switch (i) {
            case 100:
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f60809a;
                if (mBridgeClickMiniCardView != null) {
                    mBridgeClickMiniCardView.webviewshow();
                    MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f60809a;
                    mBridgeClickMiniCardView2.onSelfConfigurationChanged(mBridgeClickMiniCardView2.getResources().getConfiguration());
                    break;
                }
                break;
            case 101:
            case 102:
                z = true;
                break;
            case 103:
                i = 107;
                break;
        }
        if (!z) {
            super.mo48633a(i, obj);
        }
    }
}
