package com.iab.omid.library.appodeal.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.appodeal.C17864a;

/* renamed from: com.iab.omid.library.appodeal.utils.d */
/* loaded from: classes6.dex */
public final class C17903d {
    /* renamed from: a */
    public static void m64777a(String str) {
        if (!C17864a.f45028a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m64775b(String str) {
        if (C17864a.f45028a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m64776a(String str, Exception exc) {
        if ((!C17864a.f45028a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
