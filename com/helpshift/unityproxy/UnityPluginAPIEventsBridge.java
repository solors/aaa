package com.helpshift.unityproxy;

import android.app.PendingIntent;
import android.content.Context;
import com.helpshift.unityproxy.utils.IntentProvider;
import com.unity3d.player.UnityPlayer;
import p809o2.HSPluginEventBridge;

/* loaded from: classes5.dex */
public class UnityPluginAPIEventsBridge implements HSPluginEventBridge.InterfaceC38857a {
    @Override // p809o2.HSPluginEventBridge.InterfaceC38857a
    public PendingIntent getPendingIntentForNotification(Context context, PendingIntent pendingIntent) {
        return IntentProvider.wrapPendingIntentWithUnityDelegateActivity(context, pendingIntent);
    }

    @Override // p809o2.HSPluginEventBridge.InterfaceC38857a
    public boolean shouldCallFirstForegroundEvent() {
        if (UnityPlayer.currentActivity != null) {
            return true;
        }
        return false;
    }
}
