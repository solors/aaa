package com.zeus.gmc.sdk.mobileads.msa.analytics.experience;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes8.dex */
public class DataManager {
    private static final String atnaaata = "user_experience_flag";
    private static SharedPreferences atnntnannta = null;
    private static final String atntaanaa = "privacy_revoke";
    private static SharedPreferences.Editor atntntntanaan;

    private DataManager() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void atnntnannta(Context context, boolean z) {
        if (atnntnannta == null || atntntntanaan == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(atntaanaa, 0);
            atnntnannta = sharedPreferences;
            atntntntanaan = sharedPreferences.edit();
        }
        atntntntanaan.putBoolean(atnaaata, z);
        atntntntanaan.apply();
    }

    public static boolean getUserExperienceFlag(Context context) {
        if (atnntnannta == null || atntntntanaan == null) {
            atnntnannta = context.getSharedPreferences(atntaanaa, 0);
        }
        return atnntnannta.getBoolean(atnaaata, C32809atnntnannta.atnntnannta());
    }
}
