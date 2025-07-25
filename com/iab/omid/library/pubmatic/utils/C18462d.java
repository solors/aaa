package com.iab.omid.library.pubmatic.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.pubmatic.C18423a;

/* renamed from: com.iab.omid.library.pubmatic.utils.d */
/* loaded from: classes6.dex */
public final class C18462d {
    /* renamed from: a */
    public static void m62625a(String str) {
        if (!C18423a.f46186a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m62623b(String str) {
        if (C18423a.f46186a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m62624a(String str, Exception exc) {
        if ((!C18423a.f46186a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
