package com.iab.omid.library.bigosg.p389d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.bigosg.C17927a;

/* renamed from: com.iab.omid.library.bigosg.d.c */
/* loaded from: classes6.dex */
public final class C17953c {
    /* renamed from: a */
    public static void m64576a(String str) {
        if (!C17927a.f45163a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: a */
    public static void m64575a(String str, Exception exc) {
        if ((!C17927a.f45163a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
