package com.appsflyer.internal;

import com.maticoo.sdk.utils.constant.KeyConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFh1eSDK {
    public final int AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final long valueOf;
    public final int values;

    public AFh1eSDK(String str, int i, int i2, long j) {
        this.AFKeystoreWrapper = str;
        this.AFInAppEventType = i;
        this.values = i2;
        this.valueOf = j;
    }

    public final String AFInAppEventType() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.AFKeystoreWrapper);
            jSONObject.put("min", this.AFInAppEventType);
            jSONObject.put(KeyConstants.Response.KEY_EXPIRE, this.values);
            jSONObject.put("ttl", this.valueOf);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFh1eSDK.class == obj.getClass()) {
            AFh1eSDK aFh1eSDK = (AFh1eSDK) obj;
            if (this.AFInAppEventType == aFh1eSDK.AFInAppEventType && this.values == aFh1eSDK.values && this.valueOf == aFh1eSDK.valueOf && (str = this.AFKeystoreWrapper) != null && str.equals(aFh1eSDK.AFKeystoreWrapper)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.AFKeystoreWrapper;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((((i * 31) + this.AFInAppEventType) * 31) + this.values) * 31) + ((int) this.valueOf);
    }
}
