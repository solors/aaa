package com.appsflyer.internal;

import com.maticoo.sdk.utils.constant.KeyConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes2.dex */
public final class AFh1hSDK {
    @Nullable
    public final AFh1eSDK AFInAppEventParameterName;
    @Nullable
    public final AFh1bSDK AFInAppEventType;
    @Nullable
    public AFh1dSDK values;

    public AFh1hSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.values = AFKeystoreWrapper(jSONObject);
        this.AFInAppEventParameterName = AFInAppEventParameterName(jSONObject);
        this.AFInAppEventType = valueOf(jSONObject);
    }

    private static AFh1eSDK AFInAppEventParameterName(JSONObject jSONObject) {
        Object m14549b;
        AFh1eSDK aFh1eSDK;
        AFh1eSDK aFh1eSDK2 = null;
        try {
            Result.C38506a c38506a = Result.f101870c;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "exc_mngr");
            if (AFKeystoreWrapper != null) {
                aFh1eSDK = new AFh1eSDK(AFKeystoreWrapper.getString("sdk_ver"), AFKeystoreWrapper.optInt("min", -1), AFKeystoreWrapper.optInt(KeyConstants.Response.KEY_EXPIRE, -1), AFKeystoreWrapper.optLong("ttl", -1L));
            } else {
                aFh1eSDK = null;
            }
            m14549b = Result.m14549b(aFh1eSDK);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (!Result.m14544g(m14549b)) {
            aFh1eSDK2 = m14549b;
        }
        return aFh1eSDK2;
    }

    private static AFh1dSDK AFKeystoreWrapper(JSONObject jSONObject) {
        Object m14549b;
        AFh1dSDK aFh1dSDK;
        List m17166m;
        ArrayList arrayList;
        try {
            Result.C38506a c38506a = Result.f101870c;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "r_debugger");
            if (AFKeystoreWrapper != null) {
                long j = AFKeystoreWrapper.getLong("ttl");
                int i = AFKeystoreWrapper.getInt("counter");
                String optString = AFKeystoreWrapper.optString("app_ver", "");
                String optString2 = AFKeystoreWrapper.optString("sdk_ver", "");
                float optDouble = (float) AFKeystoreWrapper.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = AFKeystoreWrapper.optJSONArray(KeyConstants.RequestBody.KEY_TAGS);
                if (optJSONArray == null) {
                    m17166m = C37563v.m17166m();
                    arrayList = m17166m;
                } else {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    ArrayList arrayList2 = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = optJSONArray.getString(i2);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList2.add(string);
                    }
                    arrayList = arrayList2;
                }
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                aFh1dSDK = new AFh1dSDK(j, optDouble, arrayList, i, optString, optString2);
            } else {
                aFh1dSDK = null;
            }
            m14549b = Result.m14549b(aFh1dSDK);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        return Result.m14544g(m14549b) ? null : m14549b;
    }

    private static AFh1bSDK valueOf(JSONObject jSONObject) {
        Object m14549b;
        AFh1bSDK aFh1bSDK;
        AFh1bSDK aFh1bSDK2 = null;
        try {
            Result.C38506a c38506a = Result.f101870c;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "meta_data");
            if (AFKeystoreWrapper != null) {
                aFh1bSDK = new AFh1bSDK(AFKeystoreWrapper.optDouble("send_rate", 1.0d));
            } else {
                aFh1bSDK = null;
            }
            m14549b = Result.m14549b(aFh1bSDK);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (!Result.m14544g(m14549b)) {
            aFh1bSDK2 = m14549b;
        }
        return aFh1bSDK2;
    }

    public final boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(AFh1hSDK.class, cls)) {
            return false;
        }
        if (obj != null) {
            AFh1hSDK aFh1hSDK = (AFh1hSDK) obj;
            if (Intrinsics.m17075f(this.AFInAppEventParameterName, aFh1hSDK.AFInAppEventParameterName) && Intrinsics.m17075f(this.AFInAppEventType, aFh1hSDK.AFInAppEventType) && Intrinsics.m17075f(this.values, aFh1hSDK.values)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.Features");
    }

    public final int hashCode() {
        int i;
        int i2;
        AFh1eSDK aFh1eSDK = this.AFInAppEventParameterName;
        int i3 = 0;
        if (aFh1eSDK != null) {
            i = aFh1eSDK.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        AFh1bSDK aFh1bSDK = this.AFInAppEventType;
        if (aFh1bSDK != null) {
            i2 = aFh1bSDK.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        AFh1dSDK aFh1dSDK = this.values;
        if (aFh1dSDK != null) {
            i3 = aFh1dSDK.hashCode();
        }
        return i5 + i3;
    }

    private static JSONObject AFKeystoreWrapper(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
