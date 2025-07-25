package com.amazon.device.simplesignin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.amazon.device.simplesignin.p107a.SimpleSignInManager;

/* loaded from: classes2.dex */
public class BroadcastHandler extends BroadcastReceiver {
    private static final String TAG = "BroadcastHandler";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            SimpleSignInManager.m102335a().m102334a(context, intent);
        } catch (Exception e) {
            String str = TAG;
            Log.e(str, "Error in BroadcastReceiver onReceive: " + e);
        }
    }
}
