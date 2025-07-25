package com.iab.omid.library.inmobi.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.inmobi.C18166a;

/* renamed from: com.iab.omid.library.inmobi.utils.d */
/* loaded from: classes6.dex */
public final class C18203d {
    /* renamed from: a */
    public static void m63616a(String str) {
        if (!C18166a.f45662a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m63614b(String str) {
        if (C18166a.f45662a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m63615a(String str, Exception exc) {
        if ((!C18166a.f45662a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
