package com.meevii.soniclib.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;

/* loaded from: classes5.dex */
public class SettingUtil {
    @SuppressLint({"StaticFieldLeak"})
    private static Activity ttActivity;

    public static void onCreate(Activity activity) {
        ttActivity = activity;
    }

    public static void openNetworkSetting(Activity activity) {
        Activity activity2 = ttActivity;
        if (activity2 == null) {
            return;
        }
        activity2.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
    }
}
