package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.z9 */
/* loaded from: classes3.dex */
public final class C10410z9 {

    /* renamed from: a */
    public final SharedPreferences f23679a;

    public C10410z9(SharedPreferences defaultSharedPreferences) {
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "defaultSharedPreferences");
        this.f23679a = defaultSharedPreferences;
    }

    /* renamed from: a */
    public final String m79790a() {
        return this.f23679a.getString("IABTCF_TCString", null);
    }
}
