package com.meevii.adsdk.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class SharedProxy {
    private static final String AD_DEFAULT_SHARED_FILE_NAME = "meevii_adconfig";
    private static final String ANDROID_DEFAULT_SHARED_FILE_NAME = "android_default";
    private static final Map<String, SharedProxy> sSharedToolMap = new ConcurrentHashMap();
    private final SharedPreferences mSharedPreferences;

    private SharedProxy(Context context, String str) {
        if (TextUtils.equals(ANDROID_DEFAULT_SHARED_FILE_NAME, str)) {
            this.mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        } else {
            this.mSharedPreferences = context.getSharedPreferences(str, 0);
        }
    }

    public static SharedProxy getAdSdkSharedProxy(Context context) {
        return getSharedProxy(context, AD_DEFAULT_SHARED_FILE_NAME);
    }

    public static SharedProxy getDefaultSharedProxy(Context context) {
        return getSharedProxy(context, ANDROID_DEFAULT_SHARED_FILE_NAME);
    }

    public static SharedProxy getSharedProxy(Context context, String str) {
        Map<String, SharedProxy> map = sSharedToolMap;
        if (!map.containsKey(str)) {
            map.put(str, new SharedProxy(context, str));
        }
        return map.get(str);
    }

    public boolean contains(String str) {
        return this.mSharedPreferences.contains(str);
    }

    public Map<String, ?> getAll() {
        return this.mSharedPreferences.getAll();
    }

    public boolean getBoolean(String str, boolean z) {
        return this.mSharedPreferences.getBoolean(str, z);
    }

    public SharedPreferences.Editor getEditor() {
        return this.mSharedPreferences.edit();
    }

    public float getFloat(String str, float f) {
        return this.mSharedPreferences.getFloat(str, f);
    }

    public int getInt(String str, int i) {
        return this.mSharedPreferences.getInt(str, i);
    }

    public long getLong(String str, long j) {
        return this.mSharedPreferences.getLong(str, j);
    }

    public SharedPreferences getSp() {
        return this.mSharedPreferences;
    }

    public String getString(String str, String str2) {
        return this.mSharedPreferences.getString(str, str2);
    }

    public void remove(String str) {
        getEditor().remove(str).apply();
    }

    public void setBoolean(String str, boolean z) {
        getEditor().putBoolean(str, z).apply();
    }

    public void setFloat(String str, float f) {
        getEditor().putFloat(str, f).apply();
    }

    public void setInt(String str, int i) {
        getEditor().putInt(str, i).apply();
    }

    public void setLong(String str, long j) {
        getEditor().putLong(str, j).apply();
    }

    public void setString(String str, String str2) {
        getEditor().putString(str, str2).apply();
    }
}
