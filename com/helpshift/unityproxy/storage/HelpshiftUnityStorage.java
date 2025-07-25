package com.helpshift.unityproxy.storage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import p752k3.C37382g;
import p752k3.C37383m;

/* loaded from: classes5.dex */
public class HelpshiftUnityStorage {
    public static final String DOMAIN_NAME = "domainName";
    public static final String INSTALL_CONFIG = "installConfig";
    public static final String PLATFORM_ID = "platformId";
    private static final String TAG = "HSUnityStorage";
    private static volatile HelpshiftUnityStorage storage;
    private final SharedPreferences sharedPreferences;

    private HelpshiftUnityStorage(Context context) {
        this.sharedPreferences = context.getSharedPreferences("__helpshift_sdkx_unity_prefs", 0);
    }

    public static HelpshiftUnityStorage getInstance(Context context) {
        if (storage == null) {
            synchronized (HelpshiftUnityStorage.class) {
                if (storage == null) {
                    storage = new HelpshiftUnityStorage(context);
                }
            }
        }
        return storage;
    }

    public HashMap<String, Object> getMap(String str) {
        if (C37383m.m18236d(str)) {
            return new HashMap<>();
        }
        String string = this.sharedPreferences.getString(str, "");
        if (C37383m.m18236d(string)) {
            return new HashMap<>();
        }
        return new HashMap<>(C37382g.m18253e(string));
    }

    public String getString(String str) {
        if (C37383m.m18236d(str)) {
            return "";
        }
        return this.sharedPreferences.getString(str, "");
    }

    public void put(String str, String str2) {
        if (C37383m.m18236d(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public void putJsonStringOfMap(String str, String str2) {
        if (C37383m.m18236d(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(str, str2);
        edit.commit();
    }
}
