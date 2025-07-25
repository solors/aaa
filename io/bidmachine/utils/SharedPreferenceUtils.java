package io.bidmachine.utils;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class SharedPreferenceUtils {
    public static void clear(@NonNull SharedPreferences sharedPreferences) {
        for (String str : sharedPreferences.getAll().keySet()) {
            sharedPreferences.edit().remove(str).apply();
        }
    }

    public static int optInt(@NonNull SharedPreferences sharedPreferences, @NonNull String str, int i) {
        try {
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getInt(str, i);
            }
        } catch (Exception unused) {
        }
        return i;
    }

    public static long optLong(@NonNull SharedPreferences sharedPreferences, @NonNull String str, long j) {
        try {
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getLong(str, j);
            }
        } catch (Exception unused) {
        }
        return j;
    }

    @Nullable
    public static String optString(@NonNull SharedPreferences sharedPreferences, @NonNull String str, @Nullable String str2) {
        try {
            if (sharedPreferences.contains(str)) {
                String string = sharedPreferences.getString(str, str2);
                if (string != null) {
                    return string;
                }
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    public static void putLong(@NonNull SharedPreferences sharedPreferences, @NonNull String str, @Nullable Long l) {
        if (l == null) {
            remove(sharedPreferences, str);
        } else {
            sharedPreferences.edit().putLong(str, l.longValue()).apply();
        }
    }

    public static void putString(@NonNull SharedPreferences sharedPreferences, @NonNull String str, @Nullable String str2) {
        if (str2 == null) {
            remove(sharedPreferences, str);
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public static void remove(@NonNull SharedPreferences sharedPreferences, @NonNull String str) {
        sharedPreferences.edit().remove(str).apply();
    }

    public static void remove(@NonNull SharedPreferences sharedPreferences, @NonNull String... strArr) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : strArr) {
            edit.remove(str);
        }
        edit.apply();
    }
}
