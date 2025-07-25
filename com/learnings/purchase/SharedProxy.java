package com.learnings.purchase;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class SharedProxy {
    private static final String PURCHASE_SHARED_FILE_NAME = "purchase_shared_file";
    private static final Map<String, SharedProxy> sSharedToolMap = new ConcurrentHashMap();
    private final SharedPreferences mSharedPreferences;

    private SharedProxy(Context context, String str) {
        this.mSharedPreferences = context.getSharedPreferences(str, 0);
    }

    public static SharedProxy getDefaultSharedProxy(Context context) {
        return getSharedProxy(context, PURCHASE_SHARED_FILE_NAME);
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

    public String getString(String str, String str2) {
        return this.mSharedPreferences.getString(str, str2);
    }

    public Set<String> getStringSet(String str) {
        return this.mSharedPreferences.getStringSet(str, new HashSet());
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

    public void setStringSet(String str, Set<String> set) {
        getEditor().putStringSet(str, set).apply();
    }
}
