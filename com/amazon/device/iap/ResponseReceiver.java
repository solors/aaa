package com.amazon.device.iap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.internal.PurchasingManager;
import com.amazon.device.iap.internal.util.C3722b;

/* loaded from: classes2.dex */
public final class ResponseReceiver extends BroadcastReceiver {
    private static final String TAG = "ResponseReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            PurchasingManager.m102387g().m102398a(context, intent);
        } catch (Exception e) {
            String str = TAG;
            C3722b.m102374b(str, "Error in onReceive: " + e);
        }
    }
}
