package com.amazon.device.iap.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.device.iap.internal.PurchasingManager;
import com.amazon.p047a.p048a.p071o.Validator;
import com.pubmatic.sdk.nativead.POBNativeConstants;

/* renamed from: com.amazon.device.iap.internal.util.a */
/* loaded from: classes2.dex */
public class CursorUtil {

    /* renamed from: a */
    private static final String f3327a = CursorUtil.class.getName() + "_PREFS";

    /* renamed from: a */
    public static String m102379a(String str) {
        Validator.m102807a((Object) str, "userId");
        Context m102392b = PurchasingManager.m102387g().m102392b();
        Validator.m102807a(m102392b, POBNativeConstants.NATIVE_CONTEXT);
        return m102392b.getSharedPreferences(f3327a, 0).getString(str, null);
    }

    /* renamed from: a */
    public static void m102378a(String str, String str2) {
        Validator.m102807a((Object) str, "userId");
        Context m102392b = PurchasingManager.m102387g().m102392b();
        Validator.m102807a(m102392b, POBNativeConstants.NATIVE_CONTEXT);
        SharedPreferences.Editor edit = m102392b.getSharedPreferences(f3327a, 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }
}
