package com.mbridge.msdk.videocommon.p536b;

import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.b.a */
/* loaded from: classes6.dex */
public final class AdParams {

    /* renamed from: a */
    private String f61238a;

    /* renamed from: b */
    private String f61239b;

    private AdParams(String str, String str2) {
        this.f61238a = str;
        this.f61239b = str2;
    }

    /* renamed from: a */
    public static AdParams m48385a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return new AdParams(jSONObject.optString("appId"), jSONObject.optString("placementId"));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
