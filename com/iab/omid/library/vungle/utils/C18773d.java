package com.iab.omid.library.vungle.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.vungle.C18734a;

/* renamed from: com.iab.omid.library.vungle.utils.d */
/* loaded from: classes6.dex */
public final class C18773d {
    /* renamed from: a */
    public static void m61397a(String str) {
        if (!C18734a.f46847a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m61395b(String str) {
        if (C18734a.f46847a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m61396a(String str, Exception exc) {
        if ((!C18734a.f46847a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
