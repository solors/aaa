package com.bytedance.sdk.openadsdk.multipro.aidl.p351bg;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.bg.IL */
/* loaded from: classes3.dex */
public class BinderC9336IL extends AbstractBinderC9338bg {

    /* renamed from: IL */
    private static volatile BinderC9336IL f20848IL;

    /* renamed from: bg */
    private static final Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> f20849bg = Collections.synchronizedMap(new HashMap());

    /* renamed from: bg */
    public static BinderC9336IL m83058bg() {
        if (f20848IL == null) {
            synchronized (BinderC9336IL.class) {
                if (f20848IL == null) {
                    f20848IL = new BinderC9336IL();
                }
            }
        }
        return f20848IL;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.p351bg.AbstractBinderC9338bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        m83057bg(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.p351bg.AbstractBinderC9338bg, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        f20849bg.put(str, remoteCallbackList);
    }

    /* renamed from: bg */
    private synchronized void m83057bg(String str, String str2) {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> map = f20849bg;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = map.remove(str);
                } else {
                    remoteCallbackList = map.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < beginBroadcast; i++) {
                        IAppOpenAdInteractionListener broadcastItem = remoteCallbackList.getBroadcastItem(i);
                        if (broadcastItem != null) {
                            if ("onAdShow".equals(str2)) {
                                broadcastItem.onAdShow();
                            } else if ("onAdClicked".equals(str2)) {
                                broadcastItem.onAdClicked();
                            } else if ("onAdSkip".equals(str2)) {
                                broadcastItem.onAdSkip();
                            } else if ("onAdTimeOver".equals(str2)) {
                                broadcastItem.onAdTimeOver();
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
            C7741PX.m87871bg("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th);
        }
    }
}
