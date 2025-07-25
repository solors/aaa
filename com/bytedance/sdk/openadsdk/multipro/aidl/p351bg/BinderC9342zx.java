package com.bytedance.sdk.openadsdk.multipro.aidl.p351bg;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.bg.zx */
/* loaded from: classes3.dex */
public class BinderC9342zx extends AbstractBinderC9338bg {

    /* renamed from: IL */
    private static volatile BinderC9342zx f20857IL;

    /* renamed from: bg */
    private static final Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> f20858bg = Collections.synchronizedMap(new HashMap());

    /* renamed from: bg */
    public static BinderC9342zx m83045bg() {
        if (f20857IL == null) {
            synchronized (BinderC9342zx.class) {
                if (f20857IL == null) {
                    f20857IL = new BinderC9342zx();
                }
            }
        }
        return f20857IL;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.p351bg.AbstractBinderC9338bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        m83044bg(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.p351bg.AbstractBinderC9338bg, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        f20858bg.put(str, remoteCallbackList);
    }

    /* renamed from: bg */
    private synchronized void m83044bg(String str, String str2) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> map = f20858bg;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = map.remove(str);
                } else {
                    remoteCallbackList = map.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < beginBroadcast; i++) {
                        IFullScreenVideoAdInteractionListener broadcastItem = remoteCallbackList.getBroadcastItem(i);
                        if (broadcastItem != null) {
                            if ("onAdShow".equals(str2)) {
                                broadcastItem.onAdShow();
                            } else if ("onAdClose".equals(str2)) {
                                broadcastItem.onAdClose();
                            } else if ("onAdVideoBarClick".equals(str2)) {
                                broadcastItem.onAdVideoBarClick();
                            } else if ("recycleRes".equals(str2)) {
                                broadcastItem.onDestroy();
                            }
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th) {
            C7741PX.m87871bg("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th);
        }
    }
}
