package io.appmetrica.analytics.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wn */
/* loaded from: classes9.dex */
public final class C34997wn {

    /* renamed from: a */
    public final C35023xn f95576a;

    public C34997wn(C34778oe c34778oe, InterfaceC33779An interfaceC33779An, String str) {
        this.f95576a = new C35023xn(c34778oe, interfaceC33779An, new InterfaceC35049yn() { // from class: io.appmetrica.analytics.impl.np
            @Override // io.appmetrica.analytics.impl.InterfaceC35049yn
            /* renamed from: a */
            public final JSONObject mo20730a(JSONObject jSONObject, JSONObject jSONObject2) {
                return C34997wn.m20805a(jSONObject, jSONObject2);
            }
        });
    }

    /* renamed from: a */
    public static final JSONObject m20805a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", AbstractC34451cb.m21879a(jSONObject2, "report_request_id", AbstractC34451cb.m21879a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, JsonUtils.optLongOrDefault(jSONObject2, SDKAnalyticsEvents.PARAMETER_SESSION_ID, JsonUtils.optLongOrDefault(jSONObject, SDKAnalyticsEvents.PARAMETER_SESSION_ID, -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", AbstractC34451cb.m21879a(jSONObject2, "open_id", AbstractC34451cb.m21879a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", AbstractC34451cb.m21879a(jSONObject2, "attribution_id", AbstractC34451cb.m21879a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", AbstractC34451cb.m21879a(jSONObject2, "last_migration_api_level", AbstractC34451cb.m21879a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    /* renamed from: b */
    public final synchronized void m20802b(long j) {
        C35023xn c35023xn = this.f95576a;
        c35023xn.m20759a(c35023xn.m20761a().put("global_number", j));
    }

    /* renamed from: c */
    public final synchronized boolean m20801c() {
        return this.f95576a.m20761a().optBoolean("first_event_done", false);
    }

    /* renamed from: d */
    public final synchronized boolean m20798d() {
        return this.f95576a.m20761a().optBoolean("init_event_done", false);
    }

    /* renamed from: b */
    public final synchronized int m20804b() {
        return this.f95576a.m20761a().optInt("open_id", 1);
    }

    /* renamed from: c */
    public final synchronized void m20799c(long j) {
        C35023xn c35023xn = this.f95576a;
        c35023xn.m20759a(c35023xn.m20761a().put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, j));
    }

    /* renamed from: b */
    public final synchronized void m20803b(int i) {
        C35023xn c35023xn = this.f95576a;
        c35023xn.m20759a(c35023xn.m20761a().put("last_migration_api_level", i));
    }

    /* renamed from: c */
    public final synchronized void m20800c(int i) {
        C35023xn c35023xn = this.f95576a;
        c35023xn.m20759a(c35023xn.m20761a().put("open_id", i));
    }

    /* renamed from: a */
    public final synchronized void m20806a(JSONObject jSONObject) {
        C35023xn c35023xn = this.f95576a;
        c35023xn.m20759a(c35023xn.m20761a().put("numbers_of_type", jSONObject));
    }

    /* renamed from: a */
    public final synchronized int m20809a() {
        return this.f95576a.m20761a().optInt("attribution_id", 1);
    }

    /* renamed from: a */
    public final synchronized void m20808a(int i) {
        C35023xn c35023xn = this.f95576a;
        c35023xn.m20759a(c35023xn.m20761a().put("attribution_id", i));
    }

    /* renamed from: a */
    public final synchronized void m20807a(long j) {
        C35023xn c35023xn = this.f95576a;
        c35023xn.m20759a(c35023xn.m20761a().put("external_attribution_window_start", j));
    }
}
