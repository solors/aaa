package com.amazon.device.iap.internal.p105b;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.device.iap.internal.PurchasingManager;
import com.amazon.device.iap.internal.util.C3722b;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p047a.p048a.p071o.Validator;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C21114v8;
import com.pubmatic.sdk.nativead.POBNativeConstants;

/* renamed from: com.amazon.device.iap.internal.b.a */
/* loaded from: classes2.dex */
public class EntitlementTracker {

    /* renamed from: a */
    private static EntitlementTracker f3213a = new EntitlementTracker();

    /* renamed from: b */
    private static final String f3214b = EntitlementTracker.class.getSimpleName();

    /* renamed from: c */
    private static final String f3215c = EntitlementTracker.class.getName() + "_PREFS_";

    /* renamed from: a */
    public static EntitlementTracker m102442a() {
        return f3213a;
    }

    /* renamed from: a */
    public void m102440a(String str, String str2, String str3) {
        String str4 = f3214b;
        C3722b.m102376a(str4, "enter saveEntitlementRecord for v1 Entitlement [" + str2 + RemoteSettings.FORWARD_SLASH_STRING + str3 + "], user [" + str + C21114v8.C21123i.f54139e);
        try {
            Validator.m102805a(str, "userId");
            Validator.m102805a(str2, KiwiConstants.f2673E);
            Validator.m102805a(str3, "sku");
            Context m102392b = PurchasingManager.m102387g().m102392b();
            Validator.m102807a(m102392b, POBNativeConstants.NATIVE_CONTEXT);
            SharedPreferences.Editor edit = m102392b.getSharedPreferences(f3215c + str, 0).edit();
            edit.putString(str3, str2);
            edit.commit();
        } catch (Throwable th) {
            String str5 = f3214b;
            C3722b.m102376a(str5, "error in saving v1 Entitlement:" + str2 + RemoteSettings.FORWARD_SLASH_STRING + str3 + ":" + th.getMessage());
        }
        String str6 = f3214b;
        C3722b.m102376a(str6, "leaving saveEntitlementRecord for v1 Entitlement [" + str2 + RemoteSettings.FORWARD_SLASH_STRING + str3 + "], user [" + str + C21114v8.C21123i.f54139e);
    }

    /* renamed from: a */
    public String m102441a(String str, String str2) {
        String str3 = f3214b;
        C3722b.m102376a(str3, "enter getReceiptIdFromSku for sku [" + str2 + "], user [" + str + C21114v8.C21123i.f54139e);
        String str4 = null;
        try {
            Validator.m102805a(str, "userId");
            Validator.m102805a(str2, "sku");
            Context m102392b = PurchasingManager.m102387g().m102392b();
            Validator.m102807a(m102392b, POBNativeConstants.NATIVE_CONTEXT);
            str4 = m102392b.getSharedPreferences(f3215c + str, 0).getString(str2, null);
        } catch (Throwable th) {
            String str5 = f3214b;
            C3722b.m102376a(str5, "error in saving v1 Entitlement:" + str2 + ":" + th.getMessage());
        }
        String str6 = f3214b;
        C3722b.m102376a(str6, "leaving saveEntitlementRecord for sku [" + str2 + "], user [" + str + C21114v8.C21123i.f54139e);
        return str4;
    }
}
