package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.maticoo.sdk.utils.constant.KeyConstants;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.fb */
/* loaded from: classes9.dex */
public final class C34532fb {

    /* renamed from: a */
    public final byte[] f94358a;

    /* renamed from: b */
    public final String f94359b;

    /* renamed from: c */
    public final int f94360c;

    /* renamed from: d */
    public final HashMap f94361d;

    /* renamed from: e */
    public final String f94362e;

    /* renamed from: f */
    public final Integer f94363f;

    /* renamed from: g */
    public final String f94364g;

    /* renamed from: h */
    public final String f94365h;

    /* renamed from: i */
    public final CounterConfigurationReporterType f94366i;

    /* renamed from: j */
    public final String f94367j;

    public C34532fb(@NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f94358a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f94359b = jSONObject2.getString("name");
        this.f94360c = jSONObject2.getInt("bytes_truncated");
        this.f94367j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f94361d = new HashMap();
        if (optString != null) {
            try {
                HashMap m21876c = AbstractC34451cb.m21876c(optString);
                if (m21876c != null) {
                    for (Map.Entry entry : m21876c.entrySet()) {
                        this.f94361d.put(EnumC34417b4.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f94362e = jSONObject3.getString("package_name");
        this.f94363f = Integer.valueOf(jSONObject3.getInt(KeyConstants.RequestBody.KEY_PID));
        this.f94364g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f94365h = jSONObject4.getString("api_key");
        this.f94366i = m21726a(jSONObject4);
    }

    /* renamed from: a */
    public final String m21727a() {
        return this.f94365h;
    }

    /* renamed from: b */
    public final int m21725b() {
        return this.f94360c;
    }

    /* renamed from: c */
    public final byte[] m21724c() {
        return this.f94358a;
    }

    @Nullable
    /* renamed from: d */
    public final String m21723d() {
        return this.f94367j;
    }

    /* renamed from: e */
    public final String m21722e() {
        return this.f94359b;
    }

    /* renamed from: f */
    public final String m21721f() {
        return this.f94362e;
    }

    /* renamed from: g */
    public final Integer m21720g() {
        return this.f94363f;
    }

    /* renamed from: h */
    public final String m21719h() {
        return this.f94364g;
    }

    @NonNull
    /* renamed from: i */
    public final CounterConfigurationReporterType m21718i() {
        return this.f94366i;
    }

    @NonNull
    /* renamed from: j */
    public final HashMap<EnumC34417b4, Integer> m21717j() {
        return this.f94361d;
    }

    /* renamed from: k */
    public final String m21716k() throws JSONException {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f94361d.entrySet()) {
            hashMap.put(((EnumC34417b4) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put(KeyConstants.RequestBody.KEY_PID, this.f94363f).put("psid", this.f94364g).put("package_name", this.f94362e)).put("reporter_configuration", new JSONObject().put("api_key", this.f94365h).put("reporter_type", this.f94366i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f94358a, 0)).put("name", this.f94359b).put("bytes_truncated", this.f94360c).put("trimmed_fields", AbstractC34451cb.m21877b(hashMap)).putOpt("environment", this.f94367j)).toString();
    }

    /* renamed from: a */
    public static CounterConfigurationReporterType m21726a(JSONObject jSONObject) {
        if (jSONObject.has("reporter_type")) {
            return CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type"));
        }
        return CounterConfigurationReporterType.MAIN;
    }

    public C34532fb(@NonNull C34247U5 c34247u5, @NonNull C34365Z3 c34365z3, @Nullable HashMap<EnumC34417b4, Integer> hashMap) {
        this.f94358a = c34247u5.getValueBytes();
        this.f94359b = c34247u5.getName();
        this.f94360c = c34247u5.getBytesTruncated();
        if (hashMap != null) {
            this.f94361d = hashMap;
        } else {
            this.f94361d = new HashMap();
        }
        C34208Se m22055a = c34365z3.m22055a();
        this.f94362e = m22055a.m22275f();
        this.f94363f = m22055a.m22274g();
        this.f94364g = m22055a.m22273h();
        CounterConfiguration m22053b = c34365z3.m22053b();
        this.f94365h = m22053b.getApiKey();
        this.f94366i = m22053b.getReporterType();
        this.f94367j = c34247u5.m22187f();
    }
}
