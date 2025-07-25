package com.maticoo.sdk.utils.request.network.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.maticoo.sdk.utils.ApplicationUtil;

/* loaded from: classes6.dex */
public class SharedPreferencesUtils {
    public static final String CV_FILE_NAME = "cv";
    public static final String EXEC_NAME = "H+tU+FeXHM==";
    private static final String FILE_NAME = "share_date";

    public static Object getCVParam(Context context, String str, Object obj) {
        String str2;
        if (obj != null) {
            str2 = obj.getClass().getSimpleName();
        } else {
            str2 = "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("cv", 0);
        if ("String".equals(str2)) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if ("Integer".equals(str2)) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if ("Boolean".equals(str2)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if ("Float".equals(str2)) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if ("Long".equals(str2)) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        return obj;
    }

    public static Object getParam(Context context, String str, Object obj) {
        String str2;
        if (context == null) {
            return obj;
        }
        if (obj != null) {
            str2 = obj.getClass().getSimpleName();
        } else {
            str2 = "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME, 0);
        if ("String".equals(str2)) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if ("Integer".equals(str2)) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if ("Boolean".equals(str2)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if ("Float".equals(str2)) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if ("Long".equals(str2)) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        return obj;
    }

    public static void removeCVAll() {
        SharedPreferences.Editor edit = ApplicationUtil.getInstance().getApplicationContext().getSharedPreferences("cv", 0).edit();
        edit.clear();
        edit.commit();
    }

    public static void removeCVParam(String str) {
        SharedPreferences.Editor edit = ApplicationUtil.getInstance().getApplicationContext().getSharedPreferences("cv", 0).edit();
        edit.remove(str);
        edit.apply();
    }

    public static void removeParam(Context context, String str) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(FILE_NAME, 0).edit();
        edit.remove(str);
        edit.apply();
    }

    public static void removeParams(Context context, String... strArr) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(FILE_NAME, 0).edit();
        for (String str : strArr) {
            edit.remove(str);
        }
        edit.apply();
    }

    public static void setCVParam(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("cv", 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }

    public static void setParam(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(FILE_NAME, 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }
}
