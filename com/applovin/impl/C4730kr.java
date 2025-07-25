package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.kr */
/* loaded from: classes2.dex */
public class C4730kr {

    /* renamed from: a */
    private final String f7573a;

    /* renamed from: b */
    private final String f7574b;

    /* renamed from: c */
    private final List f7575c;

    public C4730kr(JSONObject jSONObject) {
        this.f7573a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f7574b = JsonUtils.getString(jSONObject, CommonUrlParts.DEVICE_TYPE, "all");
        this.f7575c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    /* renamed from: a */
    public String m97898a() {
        return this.f7573a;
    }

    /* renamed from: b */
    public String m97897b() {
        return this.f7574b;
    }

    /* renamed from: c */
    public List m97896c() {
        return this.f7575c;
    }
}
