package com.bytedance.sdk.openadsdk.multipro.aidl.p350IL;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.p298bg.p301bX.InterfaceC8168IL;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX */
/* loaded from: classes3.dex */
public class BinderC9315bX extends IFullScreenVideoAdInteractionListener.Stub {

    /* renamed from: bg */
    private InterfaceC8168IL f20818bg;

    public BinderC9315bX(InterfaceC8168IL interfaceC8168IL) {
        this.f20818bg = interfaceC8168IL;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.f20818bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.3
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC9315bX.this.f20818bg != null) {
                    BinderC9315bX.this.f20818bg.mo86669IL();
                }
                BinderC9315bX.this.m83075bg();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.f20818bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.1
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC9315bX.this.f20818bg != null) {
                    BinderC9315bX.this.f20818bg.mo86668bg();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.f20818bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.2
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC9315bX.this.f20818bg != null) {
                    BinderC9315bX.this.f20818bg.onAdClicked();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m83075bg() {
        this.f20818bg = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
    }
}
