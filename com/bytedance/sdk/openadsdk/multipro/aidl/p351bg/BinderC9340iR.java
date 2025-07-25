package com.bytedance.sdk.openadsdk.multipro.aidl.p351bg;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.bg.iR */
/* loaded from: classes3.dex */
public class BinderC9340iR extends AbstractBinderC9338bg {

    /* renamed from: IL */
    private static volatile BinderC9340iR f20854IL;

    /* renamed from: bg */
    private static final Map<String, RemoteCallbackList<IRewardAdInteractionListener>> f20855bg = Collections.synchronizedMap(new HashMap());

    /* renamed from: bg */
    public static BinderC9340iR m83053bg() {
        if (f20854IL == null) {
            synchronized (BinderC9340iR.class) {
                if (f20854IL == null) {
                    f20854IL = new BinderC9340iR();
                }
            }
        }
        return f20854IL;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.p351bg.AbstractBinderC9338bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(String str, String str2, boolean z, int i, String str3, int i2, String str4) throws RemoteException {
        m83052bg(str, str2, z, i, str3, i2, str4);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.p351bg.AbstractBinderC9338bg, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iRewardAdInteractionListener);
        f20855bg.put(str, remoteCallbackList);
    }

    /* renamed from: bg */
    private synchronized void m83052bg(String str, String str2, boolean z, int i, String str3, int i2, String str4) {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IRewardAdInteractionListener>> map = f20855bg;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = map.remove(str);
                } else {
                    remoteCallbackList = map.get(str);
                }
                RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList2 = remoteCallbackList;
                if (remoteCallbackList2 != null) {
                    int beginBroadcast = remoteCallbackList2.beginBroadcast();
                    for (int i3 = 0; i3 < beginBroadcast; i3++) {
                        IRewardAdInteractionListener broadcastItem = remoteCallbackList2.getBroadcastItem(i3);
                        if (broadcastItem != null) {
                            if ("onAdShow".equals(str2)) {
                                broadcastItem.onAdShow();
                            } else if ("onAdClose".equals(str2)) {
                                broadcastItem.onAdClose();
                            } else if ("onAdVideoBarClick".equals(str2)) {
                                broadcastItem.onAdVideoBarClick();
                            } else if ("onRewardVerify".equals(str2)) {
                                broadcastItem.onRewardVerify(z, i, str3, i2, str4);
                            } else if ("recycleRes".equals(str2)) {
                                broadcastItem.onDestroy();
                            }
                        }
                    }
                    remoteCallbackList2.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList2.kill();
                    }
                }
            }
        } catch (Throwable th) {
            C7741PX.m87871bg("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th);
        }
    }
}
