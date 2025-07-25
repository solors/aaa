package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.d5 */
/* loaded from: classes2.dex */
public class C4231d5 {

    /* renamed from: a */
    private final JSONObject f5473a;

    public C4231d5(JSONObject jSONObject) {
        this.f5473a = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Integer m99998a() {
        return JsonUtils.getInteger(this.f5473a, "dark_mode_toolbar_color", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public String m99997b() {
        return JsonUtils.getString(this.f5473a, "digital_asset_link_url", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public Boolean m99996c() {
        return JsonUtils.getBoolean(this.f5473a, "instant_apps_enabled", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public String m99995d() {
        return JsonUtils.getString(this.f5473a, "referrer", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public Integer m99994e() {
        return JsonUtils.getInteger(this.f5473a, "session_url_relation", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public Integer m99993f() {
        return JsonUtils.getInteger(this.f5473a, "share_state", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public Boolean m99992g() {
        return JsonUtils.getBoolean(this.f5473a, "should_show_title", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public Integer m99991h() {
        return JsonUtils.getInteger(this.f5473a, "toolbar_color", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public Boolean m99990i() {
        return JsonUtils.getBoolean(this.f5473a, "url_bar_hiding_enabled", null);
    }
}
