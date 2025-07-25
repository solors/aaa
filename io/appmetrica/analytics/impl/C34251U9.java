package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.U9 */
/* loaded from: classes9.dex */
public final class C34251U9 {
    /* renamed from: a */
    public static boolean m22177a(JSONObject jSONObject, String str, boolean z) {
        Boolean bool;
        if (jSONObject.has(str)) {
            bool = Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled"));
        } else {
            bool = null;
        }
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.valueOf(z))).booleanValue();
    }
}
