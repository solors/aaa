package com.five_corp.p372ad.internal.tracking_data;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;

/* renamed from: com.five_corp.ad.internal.tracking_data.e */
/* loaded from: classes4.dex */
public final class SharedPreferences$OnSharedPreferenceChangeListenerC14111e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final Object f26728a = new Object();

    /* renamed from: b */
    public final Context f26729b;

    public SharedPreferences$OnSharedPreferenceChangeListenerC14111e(Context context, C14110d c14110d) {
        this.f26729b = context;
    }

    /* renamed from: a */
    public static SharedPreferences$OnSharedPreferenceChangeListenerC14111e m78095a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.contains("IABTCF_TCString")) {
            defaultSharedPreferences.getString("IABTCF_TCString", "");
        }
        if (defaultSharedPreferences.contains("IABTCF_gdprApplies")) {
            defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
        }
        SharedPreferences$OnSharedPreferenceChangeListenerC14111e sharedPreferences$OnSharedPreferenceChangeListenerC14111e = new SharedPreferences$OnSharedPreferenceChangeListenerC14111e(context, new C14110d());
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListenerC14111e);
        return sharedPreferences$OnSharedPreferenceChangeListenerC14111e;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null || "IABTCF_TCString".equals(str) || "IABTCF_gdprApplies".equals(str)) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f26729b);
            if (defaultSharedPreferences.contains("IABTCF_TCString")) {
                defaultSharedPreferences.getString("IABTCF_TCString", "");
            }
            if (defaultSharedPreferences.contains("IABTCF_gdprApplies")) {
                defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
            }
            synchronized (this.f26728a) {
            }
        }
    }
}
