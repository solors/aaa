package com.amazon.device.iap.internal.p105b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.amazon.device.iap.internal.PurchasingManager;
import com.amazon.device.iap.internal.p096a.ReceiptVerificationException;
import com.amazon.device.iap.internal.util.C3722b;
import com.amazon.device.iap.internal.util.ReceiptHelper;
import com.amazon.device.iap.model.Receipt;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p047a.p048a.p071o.Validator;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C21114v8;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amazon.device.iap.internal.b.d */
/* loaded from: classes2.dex */
public class PendingReceiptsManager {

    /* renamed from: a */
    private static final String f3225a = "d";

    /* renamed from: d */
    private static final String f3228d = "LAST_CLEANING_TIME";

    /* renamed from: b */
    private static final String f3226b = PendingReceiptsManager.class.getName() + "_PREFS";

    /* renamed from: c */
    private static final String f3227c = PendingReceiptsManager.class.getName() + "_CLEANER_PREFS";

    /* renamed from: e */
    private static int f3229e = 604800000;

    /* renamed from: f */
    private static final PendingReceiptsManager f3230f = new PendingReceiptsManager();

    /* renamed from: e */
    private void m102424e() {
        C3722b.m102376a(f3225a, "enter old receipts cleanup! ");
        final Context m102392b = PurchasingManager.m102387g().m102392b();
        Validator.m102807a(m102392b, POBNativeConstants.NATIVE_CONTEXT);
        m102432a(System.currentTimeMillis());
        new Handler().post(new Runnable() { // from class: com.amazon.device.iap.internal.b.d.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C3722b.m102376a(PendingReceiptsManager.f3225a, "perform house keeping! ");
                    SharedPreferences sharedPreferences = m102392b.getSharedPreferences(PendingReceiptsManager.f3226b, 0);
                    for (String str : sharedPreferences.getAll().keySet()) {
                        try {
                            if (System.currentTimeMillis() - PendingReceipt.m102438a(sharedPreferences.getString(str, null)).m102435d() > PendingReceiptsManager.f3229e) {
                                String str2 = PendingReceiptsManager.f3225a;
                                C3722b.m102376a(str2, "house keeping - try remove Receipt:" + str + " since it's too old");
                                PendingReceiptsManager.this.m102431a(str);
                            }
                        } catch (InvalidPendingReceiptException unused) {
                            String str3 = PendingReceiptsManager.f3225a;
                            C3722b.m102376a(str3, "house keeping - try remove Receipt:" + str + " since it's invalid ");
                            PendingReceiptsManager.this.m102431a(str);
                        }
                    }
                } catch (Throwable th) {
                    String str4 = PendingReceiptsManager.f3225a;
                    C3722b.m102376a(str4, "Error in running cleaning job:" + th);
                }
            }
        });
    }

    /* renamed from: f */
    private long m102423f() {
        Context m102392b = PurchasingManager.m102387g().m102392b();
        Validator.m102807a(m102392b, POBNativeConstants.NATIVE_CONTEXT);
        long currentTimeMillis = System.currentTimeMillis();
        long j = m102392b.getSharedPreferences(f3227c, 0).getLong(f3228d, 0L);
        if (j == 0) {
            m102432a(currentTimeMillis);
            return currentTimeMillis;
        }
        return j;
    }

    /* renamed from: a */
    public void m102430a(String str, String str2, String str3, String str4) {
        String str5 = f3225a;
        C3722b.m102376a(str5, "enter saveReceipt for receipt [" + str4 + C21114v8.C21123i.f54139e);
        try {
            Validator.m102805a(str2, "userId");
            Validator.m102805a(str3, KiwiConstants.f2673E);
            Validator.m102805a(str4, "receiptString");
            Context m102392b = PurchasingManager.m102387g().m102392b();
            Validator.m102807a(m102392b, POBNativeConstants.NATIVE_CONTEXT);
            PendingReceipt pendingReceipt = new PendingReceipt(str2, str4, str, System.currentTimeMillis());
            SharedPreferences.Editor edit = m102392b.getSharedPreferences(f3226b, 0).edit();
            edit.putString(str3, pendingReceipt.m102434e());
            edit.commit();
        } catch (Throwable th) {
            String str6 = f3225a;
            C3722b.m102376a(str6, "error in saving pending receipt:" + str + RemoteSettings.FORWARD_SLASH_STRING + str4 + ":" + th.getMessage());
        }
        String str7 = f3225a;
        C3722b.m102376a(str7, "leaving saveReceipt for receipt id [" + str3 + C21114v8.C21123i.f54139e);
    }

    /* renamed from: b */
    public Set<Receipt> m102428b(String str) {
        Context m102392b = PurchasingManager.m102387g().m102392b();
        Validator.m102807a(m102392b, POBNativeConstants.NATIVE_CONTEXT);
        String str2 = f3225a;
        C3722b.m102376a(str2, "enter getLocalReceipts for user[" + str + C21114v8.C21123i.f54139e);
        HashSet hashSet = new HashSet();
        if (!Validator.m102806a(str)) {
            Map<String, ?> all = m102392b.getSharedPreferences(f3226b, 0).getAll();
            for (String str3 : all.keySet()) {
                String str4 = (String) all.get(str3);
                try {
                    PendingReceipt m102438a = PendingReceipt.m102438a(str4);
                    hashSet.add(ReceiptHelper.m102367a(new JSONObject(m102438a.m102436c()), str, m102438a.m102437b()));
                } catch (ReceiptVerificationException unused) {
                    m102431a(str3);
                    String str5 = f3225a;
                    C3722b.m102374b(str5, "failed to verify signature:[" + str4 + C21114v8.C21123i.f54139e);
                } catch (JSONException unused2) {
                    m102431a(str3);
                    String str6 = f3225a;
                    C3722b.m102374b(str6, "failed to convert string to JSON object:[" + str4 + C21114v8.C21123i.f54139e);
                } catch (Throwable unused3) {
                    String str7 = f3225a;
                    C3722b.m102374b(str7, "failed to load the receipt from SharedPreference:[" + str4 + C21114v8.C21123i.f54139e);
                }
            }
            String str8 = f3225a;
            C3722b.m102376a(str8, "leaving getLocalReceipts for user[" + str + "], " + hashSet.size() + " local receipts found.");
            if (System.currentTimeMillis() - m102423f() > f3229e) {
                m102424e();
            }
            return hashSet;
        }
        C3722b.m102374b(str2, "empty UserId: " + str);
        throw new RuntimeException("Invalid UserId:" + str);
    }

    /* renamed from: c */
    public String m102426c(String str) {
        Context m102392b = PurchasingManager.m102387g().m102392b();
        Validator.m102807a(m102392b, POBNativeConstants.NATIVE_CONTEXT);
        if (!Validator.m102806a(str)) {
            String string = m102392b.getSharedPreferences(f3226b, 0).getString(str, null);
            if (string != null) {
                try {
                    return PendingReceipt.m102438a(string).m102437b();
                } catch (InvalidPendingReceiptException unused) {
                }
            }
            return null;
        }
        String str2 = f3225a;
        C3722b.m102374b(str2, "empty receiptId: " + str);
        throw new RuntimeException("Invalid ReceiptId:" + str);
    }

    /* renamed from: a */
    public void m102431a(String str) {
        String str2 = f3225a;
        C3722b.m102376a(str2, "enter removeReceipt for receipt[" + str + C21114v8.C21123i.f54139e);
        Context m102392b = PurchasingManager.m102387g().m102392b();
        Validator.m102807a(m102392b, POBNativeConstants.NATIVE_CONTEXT);
        SharedPreferences.Editor edit = m102392b.getSharedPreferences(f3226b, 0).edit();
        edit.remove(str);
        edit.commit();
        C3722b.m102376a(str2, "leave removeReceipt for receipt[" + str + C21114v8.C21123i.f54139e);
    }

    /* renamed from: a */
    private void m102432a(long j) {
        Context m102392b = PurchasingManager.m102387g().m102392b();
        Validator.m102807a(m102392b, POBNativeConstants.NATIVE_CONTEXT);
        SharedPreferences.Editor edit = m102392b.getSharedPreferences(f3227c, 0).edit();
        edit.putLong(f3228d, j);
        edit.commit();
    }

    /* renamed from: a */
    public static PendingReceiptsManager m102433a() {
        return f3230f;
    }
}
