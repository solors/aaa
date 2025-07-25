package com.iab.omid.library.applovin.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.applovin.C17796a;

/* renamed from: com.iab.omid.library.applovin.utils.d */
/* loaded from: classes6.dex */
public final class C17833d {
    /* renamed from: a */
    public static void m65027a(String str) {
        if (!C17796a.f44899a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m65025b(String str) {
        if (C17796a.f44899a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m65026a(String str, Exception exc) {
        if ((!C17796a.f44899a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
