package io.appmetrica.analytics.remotepermissions.impl;

import android.text.TextUtils;
import com.learnings.abcenter.util.AbCenterConstant;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.d */
/* loaded from: classes9.dex */
public final class C35135d implements JsonParser {

    /* renamed from: a */
    public final String f95949a = "permissions";

    /* renamed from: b */
    public final String f95950b = "name";

    /* renamed from: c */
    public final String f95951c = AbCenterConstant.RULE_TYPE_LIST;

    /* renamed from: d */
    public final String f95952d = "enabled";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a */
    public final C35132a parse(@NotNull JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashSet hashSet = new HashSet();
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f95949a);
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray(this.f95951c)) != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null && optJSONObject2.optBoolean(this.f95952d)) {
                    String optString = optJSONObject2.optString(this.f95950b);
                    if (!TextUtils.isEmpty(optString)) {
                        hashSet.add(optString);
                    }
                }
            }
        }
        return new C35132a(hashSet);
    }

    @Nullable
    /* renamed from: b */
    public final C35132a m20647b(@NotNull JSONObject jSONObject) {
        return (C35132a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (C35132a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
