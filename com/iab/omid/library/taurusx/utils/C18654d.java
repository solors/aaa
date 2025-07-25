package com.iab.omid.library.taurusx.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.taurusx.C18620a;

/* renamed from: com.iab.omid.library.taurusx.utils.d */
/* loaded from: classes6.dex */
public final class C18654d {
    /* renamed from: a */
    public static void m61878a(String str) {
        if (!C18620a.f46591a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: a */
    public static void m61877a(String str, Exception exc) {
        if ((!C18620a.f46591a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
