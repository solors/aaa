package io.appmetrica.analytics.coreutils.internal.parsing;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import kotlin.sequences.C37649k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes9.dex */
public final class JsonUtils {
    @NotNull
    public static final JsonUtils INSTANCE = new JsonUtils();

    private JsonUtils() {
    }

    public static final boolean isEqualTo(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) {
        boolean equals;
        if (Intrinsics.m17075f(C37649k.m16865L(C37649k.m16861c(jSONObject.keys())), C37649k.m16865L(C37649k.m16861c(jSONObject2.keys())))) {
            for (String str : C37649k.m16861c(jSONObject.keys())) {
                Object obj = jSONObject.get(str);
                Object obj2 = jSONObject2.get(str);
                if (obj instanceof JSONObject) {
                    if (obj2 instanceof JSONObject) {
                        equals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
                        continue;
                    } else {
                        return false;
                    }
                } else if (obj instanceof JSONArray) {
                    if (obj2 instanceof JSONArray) {
                        equals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    equals = obj.equals(obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean optBooleanOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, boolean z) {
        Boolean optBooleanOrNull = optBooleanOrNull(jSONObject, str);
        if (optBooleanOrNull != null) {
            return optBooleanOrNull.booleanValue();
        }
        return z;
    }

    @Nullable
    public static final Boolean optBooleanOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    public static final Boolean optBooleanOrNullable(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable Boolean bool) {
        Boolean optBooleanOrNull = optBooleanOrNull(jSONObject, str);
        if (optBooleanOrNull != null) {
            return optBooleanOrNull;
        }
        return bool;
    }

    public static final float optFloatOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, float f) {
        Float optFloatOrNull = optFloatOrNull(jSONObject, str);
        if (optFloatOrNull != null) {
            return optFloatOrNull.floatValue();
        }
        return f;
    }

    @Nullable
    public static final Float optFloatOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Float.valueOf((float) jSONObject.getDouble(str));
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    public static final byte[] optHexByteArray(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable byte[] bArr) {
        String optStringOrNull;
        byte[] bArr2;
        if (jSONObject != null && (optStringOrNull = optStringOrNull(jSONObject, str)) != null) {
            try {
                bArr2 = StringUtils.hexToBytes(optStringOrNull);
            } catch (Throwable unused) {
                bArr2 = null;
            }
            if (bArr2 != null) {
                return bArr2;
            }
            return bArr;
        }
        return bArr;
    }

    public static /* synthetic */ byte[] optHexByteArray$default(JSONObject jSONObject, String str, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return optHexByteArray(jSONObject, str, bArr);
    }

    @NotNull
    public static final JSONObject optJsonObjectOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, @NotNull JSONObject jSONObject2) {
        JSONObject optJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        if (optJsonObjectOrNull != null) {
            return optJsonObjectOrNull;
        }
        return jSONObject2;
    }

    @Nullable
    public static final JSONObject optJsonObjectOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    @Nullable
    public static final JSONObject optJsonObjectOrNullable(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable JSONObject jSONObject2) {
        JSONObject optJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        if (optJsonObjectOrNull != null) {
            return optJsonObjectOrNull;
        }
        return jSONObject2;
    }

    @Nullable
    public static final Long optLongOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable Long l) {
        Long optLongOrNull = optLongOrNull(jSONObject, str);
        if (optLongOrNull != null) {
            return optLongOrNull;
        }
        return l;
    }

    @Nullable
    public static final Long optLongOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    public static final String optStringOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getString(str);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    public static final String optStringOrNullable(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable String str2) {
        String optStringOrNull = optStringOrNull(jSONObject, str);
        if (optStringOrNull != null) {
            return optStringOrNull;
        }
        return str2;
    }

    public static final boolean isEqualTo(@NotNull JSONArray jSONArray, @NotNull JSONArray jSONArray2) {
        PrimitiveRanges m16900v;
        boolean equals;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        m16900v = _Ranges.m16900v(0, jSONArray.length());
        if (!(m16900v instanceof Collection) || !((Collection) m16900v).isEmpty()) {
            Iterator<Integer> it = m16900v.iterator();
            while (it.hasNext()) {
                int nextInt = ((PrimitiveIterators) it).nextInt();
                Object obj = jSONArray.get(nextInt);
                Object obj2 = jSONArray2.get(nextInt);
                if (obj instanceof JSONObject) {
                    if (obj2 instanceof JSONObject) {
                        equals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
                        continue;
                    } else {
                        return false;
                    }
                } else if (obj instanceof JSONArray) {
                    if (obj2 instanceof JSONArray) {
                        equals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    equals = obj.equals(obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
        }
        return true;
    }
}
