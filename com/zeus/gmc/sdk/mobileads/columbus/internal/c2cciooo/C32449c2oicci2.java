package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.common.GlobalHolder;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.c2oicci2 */
/* loaded from: classes8.dex */
public class C32449c2oicci2 {
    private static final String c2oc2i = "SPHelper";
    public static final String coi222o222 = "columbus_sdk";
    private String coo2iico;

    public C32449c2oicci2(String str) {
        this.coo2iico = str;
    }

    private SharedPreferences coi222o222() {
        try {
            if (!TextUtils.isEmpty(this.coo2iico) && GlobalHolder.getApplicationContext() != null) {
                return GlobalHolder.getApplicationContext().getSharedPreferences(this.coo2iico, 0);
            }
            MLog.m25889e(c2oc2i, "PreferenceName or context is null");
            return null;
        } catch (Exception e) {
            MLog.m25888e(c2oc2i, "Get gaid error", e);
            return null;
        }
    }

    private SharedPreferences.Editor coo2iico() {
        SharedPreferences coi222o2222 = coi222o222();
        if (coi222o2222 != null) {
            return coi222o2222.edit();
        }
        return null;
    }

    public String coo2iico(String str, String str2) {
        SharedPreferences coi222o2222 = coi222o222();
        return coi222o2222 != null ? coi222o2222.getString(str, str2) : str2;
    }

    public void coi222o222(String str, String str2) {
        SharedPreferences.Editor coo2iico = coo2iico();
        if (coo2iico != null) {
            coo2iico.putString(str, str2);
            coo2iico.apply();
        }
    }

    public boolean coo2iico(String str, boolean z) {
        SharedPreferences coi222o2222 = coi222o222();
        return coi222o2222 != null ? coi222o2222.getBoolean(str, z) : z;
    }

    public int coo2iico(String str, int i) {
        SharedPreferences coi222o2222 = coi222o222();
        return coi222o2222 != null ? coi222o2222.getInt(str, i) : i;
    }

    public void coi222o222(String str, boolean z) {
        SharedPreferences.Editor coo2iico = coo2iico();
        if (coo2iico != null) {
            coo2iico.putBoolean(str, z);
            coo2iico.apply();
        }
    }

    public long coo2iico(String str, long j) {
        SharedPreferences coi222o2222 = coi222o222();
        return coi222o2222 != null ? coi222o2222.getLong(str, j) : j;
    }

    public void coi222o222(String str, int i) {
        SharedPreferences.Editor coo2iico = coo2iico();
        if (coo2iico != null) {
            coo2iico.putInt(str, i);
            coo2iico.apply();
        }
    }

    public void coi222o222(String str, long j) {
        SharedPreferences.Editor coo2iico = coo2iico();
        if (coo2iico != null) {
            coo2iico.putLong(str, j);
            coo2iico.apply();
        }
    }
}
