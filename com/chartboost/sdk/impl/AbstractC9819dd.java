package com.chartboost.sdk.impl;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.chartboost.sdk.impl.dd */
/* loaded from: classes3.dex */
public abstract class AbstractC9819dd {
    /* renamed from: a */
    public static void m81769a(String str) {
        if (!AbstractC10010kc.f22500a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: a */
    public static void m81768a(String str, Exception exc) {
        if ((!AbstractC10010kc.f22500a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
