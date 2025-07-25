package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.vn */
/* loaded from: classes9.dex */
public final class C34971vn {

    /* renamed from: a */
    public final C35023xn f95531a;

    public C34971vn(C34858re c34858re, C34371Z9 c34371z9) {
        this.f95531a = new C35023xn(c34858re, c34371z9, new InterfaceC35049yn() { // from class: io.appmetrica.analytics.impl.mp
            @Override // io.appmetrica.analytics.impl.InterfaceC35049yn
            /* renamed from: a */
            public final JSONObject mo20730a(JSONObject jSONObject, JSONObject jSONObject2) {
                return C34971vn.m20854a(jSONObject, jSONObject2);
            }
        });
    }

    /* renamed from: a */
    public static final JSONObject m20854a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC34451cb.m21879a(jSONObject2, "last_migration_api_level", AbstractC34451cb.m21879a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    /* renamed from: b */
    public final synchronized void m20852b(String str) {
        C35023xn c35023xn = this.f95531a;
        c35023xn.m20759a(c35023xn.m20761a().put("device_id_hash", str));
    }

    /* renamed from: c */
    public final synchronized boolean m20851c() {
        return this.f95531a.m20761a().optBoolean("referrer_checked", false);
    }

    /* renamed from: d */
    public final synchronized void m20850d() {
        C35023xn c35023xn = this.f95531a;
        c35023xn.m20759a(c35023xn.m20761a().put("referrer_checked", true));
    }

    /* renamed from: b */
    public final synchronized C33896Ff m20853b() {
        byte[] decode;
        C33896Ff c33896Ff;
        String optStringOrNull = JsonUtils.optStringOrNull(this.f95531a.m20761a(), "referrer");
        if (optStringOrNull != null) {
            try {
                decode = Base64.decode(optStringOrNull.getBytes(Charsets.UTF_8), 0);
            } catch (Throwable unused) {
            }
            if (decode != null && decode.length != 0) {
                c33896Ff = new C33896Ff(decode);
            }
        }
        c33896Ff = null;
        return c33896Ff;
    }

    /* renamed from: a */
    public final synchronized void m20855a(String str) {
        C35023xn c35023xn = this.f95531a;
        c35023xn.m20759a(c35023xn.m20761a().put("device_id", str));
    }

    /* renamed from: a */
    public final synchronized String m20857a() {
        return JsonUtils.optStringOrNull(this.f95531a.m20761a(), "device_id_hash");
    }

    /* renamed from: a */
    public final synchronized void m20856a(C33896Ff c33896Ff) {
        C35023xn c35023xn = this.f95531a;
        c35023xn.m20759a(c35023xn.m20761a().put("referrer", c33896Ff != null ? new String(Base64.encode(c33896Ff.m22654a(), 0), Charsets.UTF_8) : null));
    }
}
