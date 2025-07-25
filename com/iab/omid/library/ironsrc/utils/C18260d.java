package com.iab.omid.library.ironsrc.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.ironsrc.C18227a;

/* renamed from: com.iab.omid.library.ironsrc.utils.d */
/* loaded from: classes6.dex */
public final class C18260d {
    /* renamed from: a */
    public static void m63378a(String str) {
        if (!C18227a.f45791a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: a */
    public static void m63377a(String str, Exception exc) {
        if ((!C18227a.f45791a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
