package com.mbridge.msdk.videocommon.p536b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.b.b */
/* loaded from: classes6.dex */
public final class AdUnitInfo {

    /* renamed from: a */
    private int f61240a;

    /* renamed from: b */
    private int f61241b;

    /* renamed from: c */
    private AdParams f61242c;

    public AdUnitInfo(int i, int i2, AdParams adParams) {
        this.f61240a = i;
        this.f61241b = i2;
        this.f61242c = adParams;
    }

    /* renamed from: a */
    public final int m48384a() {
        return this.f61240a;
    }

    /* renamed from: b */
    public final int m48382b() {
        return this.f61241b;
    }

    /* renamed from: a */
    public static List<AdUnitInfo> m48383a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("id");
                    int optInt2 = optJSONObject.optInt("timeout");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                    arrayList.add(new AdUnitInfo(optInt, optInt2, optJSONObject2 != null ? AdParams.m48385a(optJSONObject2) : null));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}
