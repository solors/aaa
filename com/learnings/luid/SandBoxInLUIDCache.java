package com.learnings.luid;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes6.dex */
public class SandBoxInLUIDCache implements LUIDCache {
    private static final String SP_KEY_BIND = "bind_to_luid";
    private static final String SP_KEY_LUID = "l_lxuid";
    private static final String SP_NAME_LUID = "sp_lxuid";
    private final SharedPreferences sharedPreferences;

    public SandBoxInLUIDCache(Context context) {
        this.sharedPreferences = context.getApplicationContext().getSharedPreferences(SP_NAME_LUID, 0);
    }

    @Override // com.learnings.luid.LUIDCache
    public String getUID() {
        return this.sharedPreferences.getString(SP_KEY_LUID, "");
    }

    public boolean isBindLUID() {
        return this.sharedPreferences.getBoolean(SP_KEY_BIND, false);
    }

    @Override // com.learnings.luid.LUIDCache
    public void saveUID(String str) {
        this.sharedPreferences.edit().putString(SP_KEY_LUID, str).apply();
    }

    public void setBindLUID() {
        this.sharedPreferences.edit().putBoolean(SP_KEY_BIND, true).apply();
    }
}
