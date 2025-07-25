package com.bytedance.sdk.openadsdk.multipro.aidl.p351bg;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.bg.bX */
/* loaded from: classes3.dex */
public class BinderC9337bX extends AbstractBinderC9338bg {

    /* renamed from: IL */
    private static volatile BinderC9337bX f20850IL;

    /* renamed from: bg */
    private static final HashMap<String, RemoteCallbackList<ICommonPermissionListener>> f20851bg = new HashMap<>();

    /* renamed from: bg */
    public static BinderC9337bX m83056bg() {
        if (f20850IL == null) {
            synchronized (BinderC9337bX.class) {
                if (f20850IL == null) {
                    f20850IL = new BinderC9337bX();
                }
            }
        }
        return f20850IL;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.p351bg.AbstractBinderC9338bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        RemoteCallbackList<ICommonPermissionListener> remove = f20851bg.remove(str);
        if (remove == null) {
            return;
        }
        int beginBroadcast = remove.beginBroadcast();
        for (int i = 0; i < beginBroadcast; i++) {
            ICommonPermissionListener broadcastItem = remove.getBroadcastItem(i);
            if (broadcastItem != null) {
                if (str2 == null) {
                    broadcastItem.onGranted();
                } else {
                    broadcastItem.onDenied(str2);
                }
            }
        }
        remove.finishBroadcast();
        remove.kill();
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.p351bg.AbstractBinderC9338bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener == null) {
            return;
        }
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iCommonPermissionListener);
        f20851bg.put(str, remoteCallbackList);
    }
}
