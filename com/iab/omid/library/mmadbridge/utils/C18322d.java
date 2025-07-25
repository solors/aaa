package com.iab.omid.library.mmadbridge.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.mmadbridge.C18283a;

/* renamed from: com.iab.omid.library.mmadbridge.utils.d */
/* loaded from: classes6.dex */
public final class C18322d {
    /* renamed from: a */
    public static void m63131a(String str) {
        if (!C18283a.f45916a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: b */
    public static void m63129b(String str) {
        if (C18283a.f45916a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m63130a(String str, Exception exc) {
        if ((!C18283a.f45916a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
