package com.facebook.ads.redexgen.p370X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.facebook.ads.redexgen.X.L4 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12116L4 {
    public static Intent A00(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
