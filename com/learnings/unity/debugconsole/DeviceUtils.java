package com.learnings.unity.debugconsole;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes6.dex */
public class DeviceUtils {
    public static String getDeviceName() {
        String str = null;
        try {
            ContentResolver contentResolver = UnityPlayer.currentActivity.getContentResolver();
            str = Settings.Global.getString(contentResolver, "device_name");
            if (TextUtils.isEmpty(str)) {
                str = Settings.Secure.getString(contentResolver, "bluetooth_name");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            return Build.MODEL;
        }
        return str;
    }

    public static int getTargetSdkVersion() {
        return UnityPlayer.currentActivity.getApplicationInfo().targetSdkVersion;
    }
}
