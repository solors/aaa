package com.bytedance.sdk.openadsdk.multipro.aidl.p351bg;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.bg.eqN */
/* loaded from: classes3.dex */
public class BinderC9339eqN extends AbstractBinderC9338bg {

    /* renamed from: IL */
    private static volatile BinderC9339eqN f20852IL;

    /* renamed from: bg */
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> f20853bg = new ConcurrentHashMap<>();

    /* renamed from: bg */
    public static BinderC9339eqN m83055bg() {
        if (f20852IL == null) {
            synchronized (BinderC9339eqN.class) {
                if (f20852IL == null) {
                    f20852IL = new BinderC9339eqN();
                }
            }
        }
        return f20852IL;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.p351bg.AbstractBinderC9338bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        m83054bg(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.p351bg.AbstractBinderC9338bg, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        f20853bg.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.p351bg.AbstractBinderC9338bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (!TextUtils.isEmpty(str)) {
            f20853bg.remove(str);
        }
    }

    /* renamed from: bg */
    private synchronized void m83054bg(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = f20853bg;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i = 0; i < beginBroadcast; i++) {
                    IDislikeClosedListener broadcastItem = remoteCallbackList.getBroadcastItem(i);
                    if (broadcastItem != null && "onItemClickClosed".equals(str2)) {
                        broadcastItem.onItemClickClosed();
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            C7741PX.m87871bg("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
        }
    }
}
