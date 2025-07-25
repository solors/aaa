package com.amazon.device.iap.internal.p105b;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amazon.device.iap.internal.b.c */
/* loaded from: classes2.dex */
class PendingReceipt {

    /* renamed from: a */
    private static final String f3217a = "KEY_TIMESTAMP";

    /* renamed from: b */
    private static final String f3218b = "KEY_REQUEST_ID";

    /* renamed from: c */
    private static final String f3219c = "KEY_USER_ID";

    /* renamed from: d */
    private static final String f3220d = "KEY_RECEIPT_STRING";

    /* renamed from: e */
    private final String f3221e;

    /* renamed from: f */
    private final String f3222f;

    /* renamed from: g */
    private final long f3223g;

    /* renamed from: h */
    private final String f3224h;

    public PendingReceipt(String str, String str2, String str3, long j) {
        this.f3221e = str;
        this.f3222f = str2;
        this.f3224h = str3;
        this.f3223g = j;
    }

    /* renamed from: a */
    public String m102439a() {
        return this.f3221e;
    }

    /* renamed from: b */
    public String m102437b() {
        return this.f3224h;
    }

    /* renamed from: c */
    public String m102436c() {
        return this.f3222f;
    }

    /* renamed from: d */
    public long m102435d() {
        return this.f3223g;
    }

    /* renamed from: e */
    public String m102434e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f3219c, this.f3221e);
        jSONObject.put(f3220d, this.f3222f);
        jSONObject.put(f3218b, this.f3224h);
        jSONObject.put(f3217a, this.f3223g);
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static PendingReceipt m102438a(String str) throws InvalidPendingReceiptException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new PendingReceipt(jSONObject.getString(f3219c), jSONObject.getString(f3220d), jSONObject.getString(f3218b), jSONObject.getLong(f3217a));
        } catch (Throwable th) {
            throw new InvalidPendingReceiptException("Input invalid for PendingReceipt Object:" + str, th);
        }
    }
}
