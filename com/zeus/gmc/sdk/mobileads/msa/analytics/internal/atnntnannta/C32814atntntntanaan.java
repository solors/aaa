package com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atnntnannta;

import android.content.Context;
import android.content.SharedPreferences;
import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32821atntntntanaan;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atnntnannta.atntntntanaan */
/* loaded from: classes8.dex */
public class C32814atntntntanaan {
    private final String atnntnannta = "SharedPreferencesWrapper";
    private SharedPreferences atntntntanaan;

    public C32814atntntntanaan(String str, Context context) {
        if (context == null) {
            C32821atntntntanaan.atntntntanaan("SharedPreferencesWrapper", "context is null, return.");
        } else {
            this.atntntntanaan = context.getSharedPreferences(str, 0);
        }
    }

    public int atnntnannta(String str, int i) {
        SharedPreferences sharedPreferences = this.atntntntanaan;
        if (sharedPreferences == null) {
            return i;
        }
        return sharedPreferences.getInt(str, i);
    }

    public void atntntntanaan(String str, int i) {
        SharedPreferences sharedPreferences = this.atntntntanaan;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(str, i);
        edit.apply();
    }
}
