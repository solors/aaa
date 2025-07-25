package com.iab.omid.library.corpmailru.p395d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.corpmailru.C18039a;

/* renamed from: com.iab.omid.library.corpmailru.d.c */
/* loaded from: classes6.dex */
public final class C18064c {
    /* renamed from: a */
    public static void m64126a(String str) {
        if (!C18039a.f45413a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: a */
    public static void m64125a(String str, Exception exc) {
        if ((!C18039a.f45413a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
