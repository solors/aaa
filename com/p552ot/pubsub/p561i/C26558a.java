package com.p552ot.pubsub.p561i;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.i.a */
/* loaded from: classes7.dex */
public class C26558a {

    /* renamed from: a */
    public static final int f69625a = 200;

    /* renamed from: b */
    public static final int f69626b = 401;

    /* renamed from: c */
    public static final int f69627c = 404;

    /* renamed from: d */
    public int f69628d;

    /* renamed from: e */
    public JSONArray f69629e;

    /* renamed from: f */
    public String f69630f;

    /* renamed from: g */
    public String f69631g;

    /* renamed from: a */
    public void m41189a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f69628d == 200) {
                this.f69629e = jSONObject.optJSONArray("messageIds");
            } else {
                JSONObject optJSONObject = jSONObject.optJSONObject("error");
                this.f69630f = optJSONObject.optString("message");
                this.f69631g = optJSONObject.optString("status");
            }
        } catch (Exception unused) {
        }
    }

    public String toString() {
        return "PublishResponse{code=" + this.f69628d + ", messageIds=" + this.f69629e + ", message='" + this.f69630f + "', status='" + this.f69631g + "'}";
    }
}
