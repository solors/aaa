package com.learnings.unity.abtest;

import android.app.Activity;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes6.dex */
public class UnityUtil {
    private static OnUnitySendMessageListener sListener;
    private static Activity sTestActivity;

    /* loaded from: classes6.dex */
    public interface OnUnitySendMessageListener {
        void sendMessage(String str, String str2, String str3);
    }

    public static Activity getContext() {
        Activity activity = sTestActivity;
        if (activity == null) {
            return UnityPlayer.currentActivity;
        }
        return activity;
    }

    public static void runOnUiThread(Runnable runnable) {
        getContext().runOnUiThread(runnable);
    }

    public static void setContext(Activity activity) {
        sTestActivity = activity;
    }

    public static void setUnitySendMessageListener(OnUnitySendMessageListener onUnitySendMessageListener) {
        sListener = onUnitySendMessageListener;
    }

    public static void unitySendMessage(String str, String str2, String str3) {
        OnUnitySendMessageListener onUnitySendMessageListener;
        if (sTestActivity != null && (onUnitySendMessageListener = sListener) != null) {
            onUnitySendMessageListener.sendMessage(str, str2, str3);
        } else {
            UnityPlayer.UnitySendMessage(str, str2, str3);
        }
    }
}
