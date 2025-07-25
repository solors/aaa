package com.iab.omid.library.bytedance2.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.bytedance2.C17978a;

/* renamed from: com.iab.omid.library.bytedance2.utils.d */
/* loaded from: classes6.dex */
public final class C18015d {
    /* renamed from: a */
    public static void m64319a(String str) {
        if (!C17978a.f45284a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m64317b(String str) {
        if (C17978a.f45284a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m64318a(String str, Exception exc) {
        if ((!C17978a.f45284a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
