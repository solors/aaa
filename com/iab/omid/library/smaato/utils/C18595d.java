package com.iab.omid.library.smaato.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.smaato.C18556a;

/* renamed from: com.iab.omid.library.smaato.utils.d */
/* loaded from: classes6.dex */
public final class C18595d {
    /* renamed from: a */
    public static void m62119a(String str) {
        if (!C18556a.f46456a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m62117b(String str) {
        if (C18556a.f46456a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m62118a(String str, Exception exc) {
        if ((!C18556a.f46456a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
