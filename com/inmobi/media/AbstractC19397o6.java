package com.inmobi.media;

import org.json.JSONObject;

/* renamed from: com.inmobi.media.o6 */
/* loaded from: classes6.dex */
public abstract class AbstractC19397o6 {
    /* renamed from: a */
    public static int m59993a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return jSONObject.getInt("default");
    }
}
