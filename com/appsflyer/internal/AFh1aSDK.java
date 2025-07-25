package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFh1aSDK {
    @Nullable
    public final AFh1hSDK AFInAppEventParameterName;
    @NonNull
    public final String AFInAppEventType;
    @NonNull
    public final AFh1gSDK AFKeystoreWrapper;
    @NonNull
    public final String valueOf;
    private final boolean values;

    public AFh1aSDK(@NonNull String str) throws JSONException {
        AFh1gSDK aFh1gSDK;
        AFh1hSDK aFh1hSDK;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(POBNativeConstants.NATIVE_VERSION);
                this.valueOf = string;
                this.values = jSONObject.optBoolean("test_mode");
                this.AFInAppEventType = str;
                if (string.startsWith("default")) {
                    aFh1gSDK = AFh1gSDK.DEFAULT;
                } else {
                    aFh1gSDK = AFh1gSDK.CUSTOM;
                }
                this.AFKeystoreWrapper = aFh1gSDK;
                JSONObject optJSONObject = jSONObject.optJSONObject("features");
                if (optJSONObject != null) {
                    aFh1hSDK = new AFh1hSDK(optJSONObject);
                } else {
                    aFh1hSDK = null;
                }
                this.AFInAppEventParameterName = aFh1hSDK;
                return;
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e);
                throw new JSONException("Failed to parse remote configuration JSON");
            }
        }
        throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFh1aSDK.class != obj.getClass()) {
            return false;
        }
        AFh1aSDK aFh1aSDK = (AFh1aSDK) obj;
        if (this.values != aFh1aSDK.values || !this.valueOf.equals(aFh1aSDK.valueOf)) {
            return false;
        }
        return this.AFInAppEventType.equals(aFh1aSDK.AFInAppEventType);
    }

    public final int hashCode() {
        int hashCode = ((((this.values ? 1 : 0) * 31) + this.valueOf.hashCode()) * 31) + this.AFInAppEventType.hashCode();
        AFh1hSDK aFh1hSDK = this.AFInAppEventParameterName;
        if (aFh1hSDK != null) {
            return (hashCode * 31) + aFh1hSDK.hashCode();
        }
        return hashCode;
    }
}
