package com.learnings.abcenter.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* loaded from: classes6.dex */
public class AbCenterSharedUtil {
    private static SharedPreferences sPreferences;

    public static void clear(Context context) {
        initSpIfNeed(context);
        sPreferences.edit().clear().apply();
    }

    public static int getIntValue(Context context, String str, int i) {
        initSpIfNeed(context);
        return sPreferences.getInt(str, i);
    }

    public static long getLongValue(Context context, String str, long j) {
        initSpIfNeed(context);
        return sPreferences.getLong(str, j);
    }

    public static String getStringValue(Context context, String str) {
        initSpIfNeed(context);
        return sPreferences.getString(str, null);
    }

    private static void initSpIfNeed(Context context) {
        if (sPreferences == null) {
            sPreferences = context.getSharedPreferences("abtest", 0);
        }
    }

    public static void setIntValue(Context context, String str, int i) {
        initSpIfNeed(context);
        sPreferences.edit().putInt(str, i).apply();
    }

    public static void setLongValue(Context context, String str, long j) {
        initSpIfNeed(context);
        sPreferences.edit().putLong(str, j).apply();
    }

    public static void setStringValue(Context context, String str, String str2) {
        initSpIfNeed(context);
        sPreferences.edit().putString(str, str2).apply();
    }

    public static void clear(Context context, Set<String> set) {
        if (set == null) {
            clear(context);
            return;
        }
        initSpIfNeed(context);
        SharedPreferences.Editor edit = sPreferences.edit();
        for (String str : sPreferences.getAll().keySet()) {
            if (!set.contains(str)) {
                edit.remove(str);
            }
        }
        edit.apply();
    }
}
