package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.j5 */
/* loaded from: classes3.dex */
public final class C9977j5 {

    /* renamed from: a */
    public final SharedPreferences f22424a;

    public C9977j5(SharedPreferences defaultSharedPreferences) {
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "defaultSharedPreferences");
        this.f22424a = defaultSharedPreferences;
    }

    /* renamed from: a */
    public final String m81305a() {
        return this.f22424a.getString("IABGPP_GppSID", null);
    }

    /* renamed from: b */
    public final String m81304b() {
        return this.f22424a.getString("IABGPP_HDR_GppString", null);
    }
}
