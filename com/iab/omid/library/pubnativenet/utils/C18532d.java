package com.iab.omid.library.pubnativenet.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.pubnativenet.C18493a;

/* renamed from: com.iab.omid.library.pubnativenet.utils.d */
/* loaded from: classes6.dex */
public final class C18532d {
    /* renamed from: a */
    public static void m62372a(String str) {
        if (!C18493a.f46321a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m62370b(String str) {
        if (C18493a.f46321a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m62371a(String str, Exception exc) {
        if ((!C18493a.f46321a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
