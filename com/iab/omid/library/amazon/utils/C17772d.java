package com.iab.omid.library.amazon.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.amazon.C17735a;

/* renamed from: com.iab.omid.library.amazon.utils.d */
/* loaded from: classes6.dex */
public final class C17772d {
    /* renamed from: a */
    public static void m65268a(String str) {
        if (!C17735a.f44770a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m65266b(String str) {
        if (C17735a.f44770a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m65267a(String str, Exception exc) {
        if ((!C17735a.f44770a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
