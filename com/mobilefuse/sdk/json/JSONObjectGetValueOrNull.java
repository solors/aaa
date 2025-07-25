package com.mobilefuse.sdk.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.mobilefuse.sdk.json.JSONObjectGetValueOrNullKt */
/* loaded from: classes7.dex */
public final class JSONObjectGetValueOrNull {
    @Nullable
    public static final Boolean getBooleanOrNull(@NotNull JSONObject getBooleanOrNull, @NotNull String name) {
        Intrinsics.checkNotNullParameter(getBooleanOrNull, "$this$getBooleanOrNull");
        Intrinsics.checkNotNullParameter(name, "name");
        return jsonValueToBoolean(getBooleanOrNull.opt(name));
    }

    @Nullable
    public static final Double getDoubleOrNull(@NotNull JSONObject getDoubleOrNull, @NotNull String name) {
        Intrinsics.checkNotNullParameter(getDoubleOrNull, "$this$getDoubleOrNull");
        Intrinsics.checkNotNullParameter(name, "name");
        return jsonValueToDouble(getDoubleOrNull.opt(name));
    }

    @Nullable
    public static final Float getFloatOrNull(@NotNull JSONObject getFloatOrNull, @NotNull String name) {
        Intrinsics.checkNotNullParameter(getFloatOrNull, "$this$getFloatOrNull");
        Intrinsics.checkNotNullParameter(name, "name");
        Double jsonValueToDouble = jsonValueToDouble(getFloatOrNull.opt(name));
        if (jsonValueToDouble != null) {
            return Float.valueOf((float) jsonValueToDouble.doubleValue());
        }
        return null;
    }

    @Nullable
    public static final Integer getIntOrNull(@NotNull JSONObject getIntOrNull, @NotNull String name) {
        Intrinsics.checkNotNullParameter(getIntOrNull, "$this$getIntOrNull");
        Intrinsics.checkNotNullParameter(name, "name");
        return jsonValueToInt(getIntOrNull.opt(name));
    }

    @Nullable
    public static final String getStringOrNull(@NotNull JSONObject getStringOrNull, @NotNull String name) {
        boolean z;
        Intrinsics.checkNotNullParameter(getStringOrNull, "$this$getStringOrNull");
        Intrinsics.checkNotNullParameter(name, "name");
        String value = getStringOrNull.optString(name, "");
        Intrinsics.checkNotNullExpressionValue(value, "value");
        if (value.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return value;
    }

    private static final Boolean jsonValueToBoolean(Object obj) {
        boolean m16615y;
        boolean m16615y2;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            m16615y = StringsJVM.m16615y(str, "true", true);
            if (!m16615y) {
                m16615y2 = StringsJVM.m16615y(str, "false", true);
                if (m16615y2) {
                    return Boolean.FALSE;
                }
            } else {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    private static final Double jsonValueToDouble(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private static final Integer jsonValueToInt(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
