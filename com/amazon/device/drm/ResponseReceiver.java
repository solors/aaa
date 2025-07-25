package com.amazon.device.drm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.drm.p090a.LicensingManager;
import com.amazon.device.drm.p090a.p095e.Logger;

/* loaded from: classes2.dex */
public class ResponseReceiver extends BroadcastReceiver {
    private static final String TAG = "ResponseReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            LicensingManager.m102490d().m102494a(context, intent);
        } catch (Exception e) {
            String str = TAG;
            Logger.m102474b(str, "Error in onReceive: " + e);
        }
    }
}
