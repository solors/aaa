package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C33769Ad;
import io.appmetrica.analytics.impl.C33869Ed;
import io.appmetrica.analytics.impl.C34397ab;
import io.appmetrica.analytics.impl.C34722mc;
import io.appmetrica.analytics.impl.EnumC33940H9;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class ExternalAttributions {
    @NonNull
    public static ExternalAttribution adjust(@Nullable Object obj) {
        if (obj == null) {
            return new C33769Ad(EnumC33940H9.ADJUST);
        }
        return new C33869Ed(EnumC33940H9.ADJUST, obj);
    }

    @NonNull
    public static ExternalAttribution airbridge(@Nullable Map<String, String> map) {
        if (map == null) {
            return new C33769Ad(EnumC33940H9.AIRBRIDGE);
        }
        return new C34722mc(EnumC33940H9.AIRBRIDGE, map);
    }

    @NonNull
    public static ExternalAttribution appsflyer(@Nullable Map<String, Object> map) {
        if (map == null) {
            return new C33769Ad(EnumC33940H9.APPSFLYER);
        }
        return new C34722mc(EnumC33940H9.APPSFLYER, map);
    }

    @NonNull
    public static ExternalAttribution kochava(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return new C33769Ad(EnumC33940H9.KOCHAVA);
        }
        return new C34397ab(EnumC33940H9.KOCHAVA, jSONObject);
    }

    @NonNull
    public static ExternalAttribution singular(@Nullable Map<String, Object> map) {
        if (map == null) {
            return new C33769Ad(EnumC33940H9.SINGULAR);
        }
        return new C34722mc(EnumC33940H9.SINGULAR, map);
    }

    @NonNull
    public static ExternalAttribution tenjin(@Nullable Map<String, String> map) {
        if (map == null) {
            return new C33769Ad(EnumC33940H9.TENJIN);
        }
        return new C34722mc(EnumC33940H9.TENJIN, map);
    }
}
