package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p551my.target.C25669c;
import com.p551my.target.common.models.ImageData;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.my.target.h */
/* loaded from: classes7.dex */
public final class C25788h {
    /* renamed from: a */
    public final String m43829a(JSONObject jSONObject) {
        return jSONObject.optString("clickLink");
    }

    /* renamed from: b */
    public final String m43825b(JSONObject jSONObject) {
        if (jSONObject.has("copyText")) {
            return jSONObject.optString("copyText");
        }
        return null;
    }

    /* renamed from: c */
    public final String m43822c(JSONObject jSONObject) {
        return jSONObject.optString("name");
    }

    /* renamed from: d */
    public final boolean m43820d(JSONObject jSONObject) {
        return jSONObject.optBoolean("shouldCloseAd", true);
    }

    /* renamed from: a */
    public final String m43826a(JSONObject jSONObject, String str, boolean z, String str2, String str3, int i, boolean z2, Context context) {
        String optString = jSONObject.optString("url");
        if (C25895la.m43500e(optString)) {
            return optString;
        }
        if (!optString.isEmpty()) {
            m43830a("Bad value", "Invalid url in adChoices option", str2, str3, i, z2, context);
        }
        if (str == null || !z) {
            return null;
        }
        String str4 = str + "&reason=";
        boolean z3 = !jSONObject.isNull("id");
        int optInt = jSONObject.optInt("id");
        if (z3) {
            if (optInt < 1) {
                m43830a("Bad value", "Invalid id in adChoices option", str2, str3, i, z2, context);
                return str4;
            }
            return str4 + optInt;
        }
        return str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m43824b(org.json.JSONObject r17, java.lang.String r18, java.lang.String r19, int r20, boolean r21, android.content.Context r22) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "options"
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            int r3 = r1.length()
            if (r3 != 0) goto L13
            return r2
        L13:
            java.lang.String r4 = "closeUrl"
            java.lang.String r0 = r0.optString(r4)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L21
        L1f:
            r0 = r2
            goto L3b
        L21:
            boolean r4 = com.p551my.target.C25895la.m43500e(r0)
            if (r4 != 0) goto L3b
            java.lang.String r6 = "Bad value"
            java.lang.String r7 = "Invalid closeUrl in adChoices"
            r5 = r16
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            r5.m43830a(r6, r7, r8, r9, r10, r11, r12)
            goto L1f
        L3b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
        L41:
            if (r5 >= r3) goto L61
            org.json.JSONObject r9 = r1.optJSONObject(r5)
            r8 = r16
            r10 = r0
            r11 = r18
            r12 = r19
            r13 = r20
            r14 = r21
            r15 = r22
            com.my.target.c$a r6 = r8.m43827a(r9, r10, r11, r12, r13, r14, r15)
            if (r6 != 0) goto L5b
            goto L5e
        L5b:
            r4.add(r6)
        L5e:
            int r5 = r5 + 1
            goto L41
        L61:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L68
            goto L69
        L68:
            r2 = r4
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C25788h.m43824b(org.json.JSONObject, java.lang.String, java.lang.String, int, boolean, android.content.Context):java.util.List");
    }

    /* renamed from: c */
    public final C25669c.C25670a m43821c(JSONObject jSONObject, String str, String str2, String str3, int i, boolean z, Context context) {
        String m43822c = m43822c(jSONObject);
        if (TextUtils.isEmpty(m43822c)) {
            m43830a("Required field", "Invalid name in adChoices option", str2, str3, i, z, context);
            return null;
        }
        boolean m43820d = m43820d(jSONObject);
        String m43829a = m43829a(jSONObject);
        String m43826a = m43826a(jSONObject, str, m43820d, str2, str3, i, z, context);
        if (!m43829a.isEmpty() && !C25895la.m43500e(m43829a)) {
            m43830a("Bad value", "Invalid clickLink in adChoices option", str2, str3, i, z, context);
            if (m43826a == null) {
                return null;
            }
        }
        return C25669c.C25670a.m44129a(m43822c, "default", m43826a, m43829a, null, m43820d);
    }

    /* renamed from: a */
    public static C25788h m43831a() {
        return new C25788h();
    }

    /* renamed from: b */
    public final C25669c.C25670a m43823b(JSONObject jSONObject, String str, String str2, String str3, int i, boolean z, Context context) {
        String m43822c = m43822c(jSONObject);
        if (TextUtils.isEmpty(m43822c)) {
            m43830a("Required field", "Invalid name in adChoices option", str2, str3, i, z, context);
            return null;
        }
        boolean m43820d = m43820d(jSONObject);
        String m43826a = m43826a(jSONObject, str, m43820d, str2, str3, i, z, context);
        String m43825b = m43825b(jSONObject);
        if (TextUtils.isEmpty(m43825b)) {
            m43830a("Bad value", "AdChoices option hasn't copy text ", str2, str3, i, z, context);
            return null;
        }
        return C25669c.C25670a.m44129a(m43822c, "copy", m43826a, null, m43825b, m43820d);
    }

    /* renamed from: a */
    public C25669c m43828a(JSONObject jSONObject, String str, String str2, int i, boolean z, Context context) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("iconLink");
        if (TextUtils.isEmpty(optString) || !C25895la.m43500e(optString)) {
            m43830a("Required field", "Invalid iconLink in adChoices", str, str2, i, z, context);
            return null;
        }
        String optString2 = jSONObject.optString("clickLink");
        List m43824b = m43824b(jSONObject, str, str2, i, z, context);
        if (m43824b == null && (TextUtils.isEmpty(optString2) || !C25895la.m43500e(optString2))) {
            m43830a("Required field", "Invalid clickLink in adChoices", str, str2, i, z, context);
            return null;
        }
        C25669c m44133a = C25669c.m44133a(ImageData.newImageData(optString), optString2);
        m44133a.m44132a(m43824b);
        return m44133a;
    }

    /* renamed from: a */
    public final C25669c.C25670a m43827a(JSONObject jSONObject, String str, String str2, String str3, int i, boolean z, Context context) {
        if (jSONObject == null) {
            m43830a("Bad value", "null adChoices option", str2, str3, i, z, context);
            return null;
        } else if (!jSONObject.has("type")) {
            m43830a("Bad value", "AdChoices option hasn't type", str2, str3, i, z, context);
            return null;
        } else {
            String optString = jSONObject.optString("type");
            if (optString.equals("default")) {
                return m43821c(jSONObject, str, str2, str3, i, z, context);
            }
            if (optString.equals("copy")) {
                return m43823b(jSONObject, str, str2, str3, i, z, context);
            }
            m43830a("Required field", "Invalid adChoices option type", str2, str3, i, z, context);
            return null;
        }
    }

    /* renamed from: a */
    public final void m43830a(String str, String str2, String str3, String str4, int i, boolean z, Context context) {
        if (z) {
            C25656b5.m44178a(str).m44173e(str2).m44180a(i).m44176b(str4).m44175c(str3).m44177b(context);
        }
    }
}
