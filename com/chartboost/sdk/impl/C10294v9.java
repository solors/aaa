package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.v9 */
/* loaded from: classes3.dex */
public final class C10294v9 {

    /* renamed from: a */
    public final SharedPreferences f23387a;

    public C10294v9(SharedPreferences sharedPrefs) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        this.f23387a = sharedPrefs;
    }

    /* renamed from: a */
    public final String m80246a(String sharedPrefsKey) {
        Intrinsics.checkNotNullParameter(sharedPrefsKey, "sharedPrefsKey");
        try {
            return this.f23387a.getString(sharedPrefsKey, null);
        } catch (Exception e) {
            C9763c7.m81920b("Load from shared prefs exception", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void m80245a(String sharedPrefsKey, String str) {
        Intrinsics.checkNotNullParameter(sharedPrefsKey, "sharedPrefsKey");
        try {
            this.f23387a.edit().putString(sharedPrefsKey, str).apply();
        } catch (Exception e) {
            C9763c7.m81920b("Save to shared prefs exception", e);
        }
    }
}
