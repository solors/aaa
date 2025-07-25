package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.impl.InterfaceC10068na;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.ironsource.C21114v8;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.q8 */
/* loaded from: classes3.dex */
public class C10148q8 {

    /* renamed from: a */
    public final HashMap f22993a = new HashMap();

    /* renamed from: b */
    public final SharedPreferences f22994b;

    /* renamed from: c */
    public final InterfaceC10045m4 f22995c;

    public C10148q8(SharedPreferences sharedPreferences, InterfaceC10045m4 interfaceC10045m4) {
        this.f22994b = sharedPreferences;
        this.f22995c = interfaceC10045m4;
        m80751b();
    }

    /* renamed from: a */
    public HashMap m80756a() {
        return this.f22993a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[Catch: JSONException -> 0x010f, TryCatch #0 {JSONException -> 0x010f, blocks: (B:6:0x0016, B:8:0x0023, B:35:0x007d, B:52:0x00ea, B:53:0x00f4, B:36:0x008b, B:37:0x0095, B:38:0x009f, B:40:0x00ab, B:41:0x00b1, B:43:0x00bd, B:44:0x00c3, B:46:0x00cf, B:47:0x00d5, B:49:0x00e1, B:17:0x004b, B:20:0x0055, B:23:0x005f, B:26:0x0069), top: B:58:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea A[Catch: JSONException -> 0x010f, TryCatch #0 {JSONException -> 0x010f, blocks: (B:6:0x0016, B:8:0x0023, B:35:0x007d, B:52:0x00ea, B:53:0x00f4, B:36:0x008b, B:37:0x0095, B:38:0x009f, B:40:0x00ab, B:41:0x00b1, B:43:0x00bd, B:44:0x00c3, B:46:0x00cf, B:47:0x00d5, B:49:0x00e1, B:17:0x004b, B:20:0x0055, B:23:0x005f, B:26:0x0069), top: B:58:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4 A[Catch: JSONException -> 0x010f, TRY_LEAVE, TryCatch #0 {JSONException -> 0x010f, blocks: (B:6:0x0016, B:8:0x0023, B:35:0x007d, B:52:0x00ea, B:53:0x00f4, B:36:0x008b, B:37:0x0095, B:38:0x009f, B:40:0x00ab, B:41:0x00b1, B:43:0x00bd, B:44:0x00c3, B:46:0x00cf, B:47:0x00d5, B:49:0x00e1, B:17:0x004b, B:20:0x0055, B:23:0x005f, B:26:0x0069), top: B:58:0x0016 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m80751b() {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C10148q8.m80751b():void");
    }

    /* renamed from: c */
    public final void m80748c() {
        if (this.f22994b != null) {
            JSONArray jSONArray = new JSONArray();
            for (DataUseConsent dataUseConsent : this.f22993a.values()) {
                jSONArray.put(m80754a(dataUseConsent));
            }
            m80755a(this.f22994b, jSONArray);
        }
    }

    /* renamed from: a */
    public void m80753a(String str) {
        this.f22993a.remove(str);
        m80748c();
    }

    /* renamed from: a */
    public final void m80755a(SharedPreferences sharedPreferences, JSONArray jSONArray) {
        if (sharedPreferences == null || jSONArray == null) {
            return;
        }
        sharedPreferences.edit().putString("privacy_standards", jSONArray.toString()).apply();
    }

    /* renamed from: a */
    public final void m80752a(JSONException jSONException) {
        this.f22995c.mo110021track(C10161r3.m80689a(InterfaceC10068na.EnumC10073d.f22691d, jSONException.getMessage(), "", ""));
    }

    /* renamed from: a */
    public final JSONObject m80754a(DataUseConsent dataUseConsent) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacyStandard", dataUseConsent.getPrivacyStandard());
            jSONObject.put(C21114v8.C21123i.f54134b0, dataUseConsent.getConsent());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    public void m80750b(DataUseConsent dataUseConsent) {
        C9763c7.m81923a("Added privacy standard: " + dataUseConsent.getPrivacyStandard() + " with consent: " + dataUseConsent.getConsent(), null);
        this.f22993a.put(dataUseConsent.getPrivacyStandard(), dataUseConsent);
        m80748c();
    }

    /* renamed from: b */
    public final void m80749b(String str) {
        this.f22995c.mo110021track(C10161r3.m80689a(InterfaceC10068na.EnumC10073d.f22693f, str, "", ""));
    }
}
