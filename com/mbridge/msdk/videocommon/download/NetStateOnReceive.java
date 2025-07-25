package com.mbridge.msdk.videocommon.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes6.dex */
public class NetStateOnReceive extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                    if (activeNetworkInfo.getType() == 1) {
                        DownLoadManager.getInstance().m48167b(true);
                    } else if (activeNetworkInfo.getType() == 0) {
                        DownLoadManager.getInstance().m48178a();
                    }
                } else {
                    DownLoadManager.getInstance().m48171a(false);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
