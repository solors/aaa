package com.bytedance.sdk.openadsdk.multipro.aidl.p350IL;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.p298bg.p303zx.InterfaceC8185bg;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN */
/* loaded from: classes3.dex */
public class BinderC9324eqN extends IRewardAdInteractionListener.Stub {

    /* renamed from: bg */
    private InterfaceC8185bg f20827bg;

    public BinderC9324eqN(InterfaceC8185bg interfaceC8185bg) {
        this.f20827bg = interfaceC8185bg;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.f20827bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.3
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC9324eqN.this.f20827bg != null) {
                    BinderC9324eqN.this.f20827bg.mo86473IL();
                }
                BinderC9324eqN.this.m83070bg();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.f20827bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.1
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC9324eqN.this.f20827bg != null) {
                    BinderC9324eqN.this.f20827bg.mo86472bg();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.f20827bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.2
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC9324eqN.this.f20827bg != null) {
                    BinderC9324eqN.this.f20827bg.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z, final int i, final String str, final int i2, final String str2) throws RemoteException {
        if (this.f20827bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.4
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC9324eqN.this.f20827bg != null) {
                    BinderC9324eqN.this.f20827bg.mo86471bg(z, i, str, i2, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m83070bg() {
        this.f20827bg = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws RemoteException {
    }
}
