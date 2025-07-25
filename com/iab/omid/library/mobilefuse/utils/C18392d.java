package com.iab.omid.library.mobilefuse.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.mobilefuse.C18353a;

/* renamed from: com.iab.omid.library.mobilefuse.utils.d */
/* loaded from: classes6.dex */
public final class C18392d {
    /* renamed from: a */
    public static void m62878a(String str) {
        if (!C18353a.f46051a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m62876b(String str) {
        if (C18353a.f46051a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m62877a(String str, Exception exc) {
        if ((!C18353a.f46051a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
