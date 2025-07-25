package io.appmetrica.analytics.coreutils.internal.parsing;

import com.learnings.abcenter.util.AbCenterConstant;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes9.dex */
public final class RemoteConfigJsonUtils {
    @NotNull
    public static final RemoteConfigJsonUtils INSTANCE = new RemoteConfigJsonUtils();

    private RemoteConfigJsonUtils() {
    }

    public static final boolean extractFeature(@NotNull JSONObject jSONObject, @NotNull String str, boolean z) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("features");
            if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject(AbCenterConstant.RULE_TYPE_LIST)) != null && (optJSONObject2 = optJSONObject.optJSONObject(str)) != null) {
                return optJSONObject2.optBoolean("enabled", z);
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    @NotNull
    public static final byte[][] extractHosts(@NotNull JSONObject jSONObject, @NotNull String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("query_hosts");
        if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject(AbCenterConstant.RULE_TYPE_LIST)) != null && (optJSONObject2 = optJSONObject.optJSONObject(str)) != null && (optJSONArray = optJSONObject2.optJSONArray("urls")) != null) {
            int length = optJSONArray.length();
            byte[][] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = optJSONArray.optString(i).getBytes(Charsets.UTF_8);
            }
            return bArr;
        }
        return new byte[0];
    }

    public static final long extractMillisFromSecondsOrDefault(@NotNull JSONObject jSONObject, @NotNull String str, long j) {
        return extractMillisOrDefault(jSONObject, str, TimeUnit.SECONDS, j);
    }

    public static final long extractMillisOrDefault(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull TimeUnit timeUnit, long j) {
        return WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(jSONObject, str), timeUnit, j);
    }

    @Nullable
    public static final String extractQuery(@NotNull JSONObject jSONObject, @NotNull String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("queries");
            if (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject(AbCenterConstant.RULE_TYPE_LIST)) == null || (optJSONObject2 = optJSONObject.optJSONObject(str)) == null) {
                return null;
            }
            RemoteConfigJsonUtils remoteConfigJsonUtils = INSTANCE;
            String optString = optJSONObject2.optString("url", "");
            remoteConfigJsonUtils.getClass();
            if (Intrinsics.m17075f(optString, "")) {
                return null;
            }
            return optString;
        } catch (Throwable unused) {
            return null;
        }
    }
}
