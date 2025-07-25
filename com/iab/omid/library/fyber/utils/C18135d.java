package com.iab.omid.library.fyber.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.fyber.C18096a;

/* renamed from: com.iab.omid.library.fyber.utils.d */
/* loaded from: classes6.dex */
public final class C18135d {
    /* renamed from: a */
    public static void m63860a(String str) {
        if (!C18096a.f45527a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m63858b(String str) {
        if (C18096a.f45527a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m63859a(String str, Exception exc) {
        if ((!C18096a.f45527a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
