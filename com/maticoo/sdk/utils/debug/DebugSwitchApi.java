package com.maticoo.sdk.utils.debug;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;

/* loaded from: classes6.dex */
public class DebugSwitchApi {
    private static final String ACTION = "com.maticoo.sdk.Debug";
    private static final String SWITCH_LOG = "LOG";
    private static final String SWITCH_TEST = "TEST";
    private static final BroadcastReceiver debugBroadcastReceiver = new BroadcastReceiver() { // from class: com.maticoo.sdk.utils.debug.DebugSwitchApi.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.hasExtra(DebugSwitchApi.SWITCH_LOG)) {
                boolean booleanExtra = intent.getBooleanExtra(DebugSwitchApi.SWITCH_LOG, false);
                DeveloperLog.LogD("DebugSwitchApi::LogSwitch %s", "--" + booleanExtra);
                DeveloperLog.innerDebug(booleanExtra);
            } else if (intent.hasExtra(DebugSwitchApi.SWITCH_TEST)) {
                boolean booleanExtra2 = intent.getBooleanExtra(DebugSwitchApi.SWITCH_TEST, false);
                DeveloperLog.LogD("DebugSwitchApi::TestSwitch %s", "--" + booleanExtra2);
            }
        }
    };
    private static volatile boolean hasRegister = false;

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public static void registerReceiver(Context context) {
        if (hasRegister) {
            return;
        }
        if (context == null) {
            context = ApplicationUtil.getInstance().getApplicationContext();
        }
        if (context == null) {
            return;
        }
        if (context instanceof Activity) {
            context = context.getApplicationContext();
        }
        hasRegister = true;
        DeveloperLog.LogD("DebugSwitchApi >> registerReceiver");
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ACTION);
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(debugBroadcastReceiver, intentFilter, 2);
            } else {
                context.registerReceiver(debugBroadcastReceiver, intentFilter);
            }
        } catch (Throwable unused) {
        }
    }

    public static void unRegisterReceiver(Context context) {
        try {
            context.unregisterReceiver(debugBroadcastReceiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
