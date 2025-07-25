package com.bytedance.sdk.openadsdk.multipro.aidl.p350IL;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.p298bg.eqN.InterfaceC8178IL;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg */
/* loaded from: classes3.dex */
public class BinderC9319bg extends IAppOpenAdInteractionListener.Stub {

    /* renamed from: bg */
    private InterfaceC8178IL f20822bg;

    public BinderC9319bg(InterfaceC8178IL interfaceC8178IL) {
        this.f20822bg = interfaceC8178IL;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        if (this.f20822bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.2
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC9319bg.this.f20822bg != null) {
                    BinderC9319bg.this.f20822bg.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.f20822bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.1
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC9319bg.this.f20822bg != null) {
                    BinderC9319bg.this.f20822bg.mo85927bg();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        if (this.f20822bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.3
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC9319bg.this.f20822bg != null) {
                    BinderC9319bg.this.f20822bg.mo85929IL();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        if (this.f20822bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.4
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC9319bg.this.f20822bg != null) {
                    BinderC9319bg.this.f20822bg.mo85928bX();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        m83073bg();
    }

    /* renamed from: bg */
    private void m83073bg() {
        this.f20822bg = null;
    }
}
