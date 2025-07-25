package com.helpshift.unityproxy.utils;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.helpshift.unityproxy.activity.UnityDelegateActivity;
import java.util.Random;

/* loaded from: classes5.dex */
public class IntentProvider {
    public static PendingIntent wrapPendingIntentWithUnityDelegateActivity(Context context, PendingIntent pendingIntent) {
        Intent intent = new Intent();
        intent.setClass(context, UnityDelegateActivity.class);
        intent.putExtra("delegateIntent", pendingIntent);
        return PendingIntent.getActivity(context, new Random().nextInt(), intent, 268435456 | 67108864);
    }
}
