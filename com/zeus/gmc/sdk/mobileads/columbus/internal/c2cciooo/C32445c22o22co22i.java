package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.common.GlobalHolder;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.c22o22co22i */
/* loaded from: classes8.dex */
public class C32445c22o22co22i {
    private SharedPreferences coi222o222;
    private final String coo2iico = "SharedPreferencesWrapper";

    public C32445c22o22co22i(String str) {
        Context applicationContext = GlobalHolder.getApplicationContext();
        if (applicationContext == null) {
            MLog.m25889e("SharedPreferencesWrapper", "context is null, return.");
        } else {
            this.coi222o222 = applicationContext.getSharedPreferences(str, 0);
        }
    }

    public void coi222o222(String str, String str2) {
        SharedPreferences sharedPreferences = this.coi222o222;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public String coo2iico(String str, String str2) {
        SharedPreferences sharedPreferences = this.coi222o222;
        return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
    }

    public Set<String> coo2iico(String str, Set<String> set) {
        SharedPreferences sharedPreferences = this.coi222o222;
        return sharedPreferences == null ? set : sharedPreferences.getStringSet(str, set);
    }

    public void coi222o222(String str, Set<String> set) {
        SharedPreferences sharedPreferences = this.coi222o222;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putStringSet(str, set);
        edit.apply();
    }

    public int coo2iico(String str, int i) {
        SharedPreferences sharedPreferences = this.coi222o222;
        return sharedPreferences == null ? i : sharedPreferences.getInt(str, i);
    }

    public long coo2iico(String str, long j) {
        SharedPreferences sharedPreferences = this.coi222o222;
        return sharedPreferences == null ? j : sharedPreferences.getLong(str, j);
    }

    public void coi222o222(String str, int i) {
        SharedPreferences sharedPreferences = this.coi222o222;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public float coo2iico(String str, float f) {
        SharedPreferences sharedPreferences = this.coi222o222;
        return sharedPreferences == null ? f : sharedPreferences.getFloat(str, f);
    }

    public boolean coo2iico(String str, boolean z) {
        SharedPreferences sharedPreferences = this.coi222o222;
        return sharedPreferences == null ? z : sharedPreferences.getBoolean(str, z);
    }

    public void coi222o222(String str, long j) {
        SharedPreferences sharedPreferences = this.coi222o222;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public void coo2iico(String[] strArr) {
        SharedPreferences sharedPreferences;
        if (C32467cioccoiococ.coi222o222(strArr) || (sharedPreferences = this.coi222o222) == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                edit.remove(str);
            }
        }
        edit.apply();
    }

    public void coi222o222(String str, float f) {
        SharedPreferences sharedPreferences = this.coi222o222;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putFloat(str, f);
        edit.apply();
    }

    public void coo2iico() {
        SharedPreferences sharedPreferences = this.coi222o222;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear();
        edit.apply();
    }

    public void coi222o222(String str, boolean z) {
        SharedPreferences sharedPreferences = this.coi222o222;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public boolean coo2iico(String str) {
        SharedPreferences sharedPreferences = this.coi222o222;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains(str);
    }

    public Map<String, ?> coi222o222() {
        SharedPreferences sharedPreferences = this.coi222o222;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getAll();
    }

    public static Set<String> coo2iico(C32445c22o22co22i c32445c22o22co22i, String str, Set<String> set) {
        if (c32445c22o22co22i == null) {
            return new HashSet();
        }
        Set<String> coo2iico = c32445c22o22co22i.coo2iico(str, set);
        if (coo2iico == null) {
            return new HashSet();
        }
        return new HashSet(coo2iico);
    }

    public void coi222o222(String str) {
        SharedPreferences sharedPreferences = this.coi222o222;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(str);
        edit.apply();
    }
}
