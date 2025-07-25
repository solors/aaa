package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.amazon.device.ads.DTBMetricsConfiguration;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.B0 */
/* loaded from: classes9.dex */
public final class C33781B0 {
    /* renamed from: a */
    public static String m22761a(C33756A0 c33756a0) {
        try {
            return Base64.encodeToString(new JSONObject().put(DTBMetricsConfiguration.APSMETRICS_APIKEY, c33756a0.f92542a).put("packageName", c33756a0.f92543b).put("reporterType", c33756a0.f92544c.getStringValue()).put("processID", c33756a0.f92545d).put("processSessionID", c33756a0.f92546e).put("errorEnvironment", c33756a0.f92547f).toString().getBytes(Charsets.UTF_8), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static C33756A0 m22760a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), Charsets.UTF_8));
            return new C33756A0(jSONObject.getString(DTBMetricsConfiguration.APSMETRICS_APIKEY), jSONObject.getString("packageName"), CounterConfigurationReporterType.Companion.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
