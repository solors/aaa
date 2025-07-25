package com.zeus.gmc.sdk.mobileads.columbus.internal.c2ic2icoi;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import com.zeus.gmc.sdk.mobileads.columbus.util.network.manager.NetworkManager;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2ic2icoi.coo2iico */
/* loaded from: classes8.dex */
public class C32485coo2iico extends BroadcastReceiver {
    public static final String coi222o222 = "android.net.conn.CONNECTIVITY_CHANGE";
    private static final String coo2iico = "NetStateReceiver";

    @Override // android.content.BroadcastReceiver
    @SuppressLint({"MissingPermission"})
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                if (intent.getAction() != null) {
                    if (intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE")) {
                        MLog.m25889e(coo2iico, "The network status changes.");
                        if (C32484coi222o222.coi222o222()) {
                            MLog.m25887i(coo2iico, "The network is connected.");
                            NetworkManager.coi222o222().cioccoiococ();
                            return;
                        }
                        MLog.m25887i(coo2iico, "The network is disconnected.");
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                MLog.m25888e(coo2iico, "", e);
                return;
            }
        }
        MLog.m25889e(coo2iico, "There's something wrong with the broadcast.");
    }
}
