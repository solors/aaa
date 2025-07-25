package com.iab.omid.library.unity3d.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.unity3d.C18677a;

/* renamed from: com.iab.omid.library.unity3d.utils.d */
/* loaded from: classes6.dex */
public final class C18711d {
    /* renamed from: a */
    public static void m61644a(String str) {
        if (!C18677a.f46719a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: a */
    public static void m61643a(String str, Exception exc) {
        if ((!C18677a.f46719a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
