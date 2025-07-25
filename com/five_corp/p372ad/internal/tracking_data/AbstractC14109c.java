package com.five_corp.p372ad.internal.tracking_data;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import java.util.UUID;

/* renamed from: com.five_corp.ad.internal.tracking_data.c */
/* loaded from: classes4.dex */
public abstract class AbstractC14109c {
    /* renamed from: a */
    public static String m78096a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        try {
            String string = defaultSharedPreferences.getString("com.five_corp.ad.user.id", null);
            if (string != null) {
                return string;
            }
        } catch (ClassCastException unused) {
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        edit.putString("com.five_corp.ad.user.id", uuid);
        edit.apply();
        return uuid;
    }
}
