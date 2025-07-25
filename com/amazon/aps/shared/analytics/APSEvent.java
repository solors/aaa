package com.amazon.aps.shared.analytics;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.C21114v8;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class APSEvent implements Serializable {
    public static final int EXCEPTION_LOG_SIZE = 2048;
    String deviceManufacturer;
    String deviceModel;
    String eventType;
    String osName;
    int osVersion;
    String pkgName;
    String sdkVersion;
    APSEventSeverity severity;
    long timestamp;
    String configVersion = "";
    String errorDetails = "";
    String exceptionLog = "";

    public APSEvent(Context context, APSEventSeverity aPSEventSeverity, String str) {
        String packageName;
        this.sdkVersion = null;
        this.pkgName = "";
        this.osName = "";
        this.deviceManufacturer = "";
        this.deviceModel = "";
        try {
            this.sdkVersion = APSAnalytics.getVersion();
            String adapterVersion = APSAnalytics.getAdapterVersion();
            if (adapterVersion != null) {
                this.sdkVersion += "_" + adapterVersion;
            }
            this.osName = "Android";
            this.osVersion = Build.VERSION.SDK_INT;
            this.deviceManufacturer = Build.MANUFACTURER;
            this.deviceModel = Build.MODEL;
            this.timestamp = System.currentTimeMillis();
            if (context == null) {
                packageName = "unknown";
            } else {
                packageName = context.getPackageName();
            }
            this.pkgName = packageName;
            setEventSeverity(aPSEventSeverity);
            setEventType(str);
        } catch (RuntimeException e) {
            Log.e("APSEvent", "Error constructing the APSEvent:", e);
        }
    }

    public APSEventSeverity getEventSeverity() {
        return this.severity;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getExceptionDetails() {
        return this.exceptionLog;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean isValidEvent() {
        if (this.eventType != null) {
            return true;
        }
        return false;
    }

    public APSEvent setConfigVersion(String str) {
        this.configVersion = str;
        return this;
    }

    public APSEvent setErrorDetails(String str) {
        if (str != null) {
            int length = str.length();
            if (length > 2048) {
                length = 2048;
            }
            this.errorDetails = str.substring(0, length);
        }
        return this;
    }

    public APSEvent setEventSeverity(APSEventSeverity aPSEventSeverity) {
        this.severity = aPSEventSeverity;
        return this;
    }

    public APSEvent setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public APSEvent setExceptionDetails(Exception exc) {
        if (exc != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                if (stringWriter2.length() > 2048) {
                    int length = ((2048 - exc.getMessage().length()) - 6) / 2;
                    String substring = stringWriter2.substring(0, length);
                    String substring2 = stringWriter2.substring(stringWriter2.length() - length);
                    this.exceptionLog = exc.getMessage() + APSSharedUtil.TRUNCATE_SEPARATOR + substring + APSSharedUtil.TRUNCATE_SEPARATOR + substring2;
                } else {
                    this.exceptionLog = exc.getMessage() + "\n" + stringWriter2;
                }
            } catch (RuntimeException e) {
                Log.e("APSEvent", "Error in parsing the exception detail; ", e);
            }
        }
        return this;
    }

    public APSEvent setTimestamp(long j) {
        this.timestamp = j;
        return this;
    }

    public String toJsonPayload() {
        String str = "";
        String format = String.format("msg = %s;", this.errorDetails);
        String additionalDetails = APSAnalytics.getAdditionalDetails();
        if (!APSSharedUtil.isNullOrEmpty(additionalDetails)) {
            format = format.concat(additionalDetails);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", this.sdkVersion);
            jSONObject.put("eventType", this.eventType);
            jSONObject.put("eventTimestamp", this.timestamp);
            jSONObject.put(SDKConstants.PARAM_DEBUG_MESSAGE_SEVERITY, this.severity.name());
            jSONObject.put("appId", this.pkgName);
            jSONObject.put("osName", this.osName);
            jSONObject.put("osVersion", this.osVersion);
            jSONObject.put("deviceManufacturer", this.deviceManufacturer);
            jSONObject.put(C21114v8.C21123i.f54153l, this.deviceModel);
            jSONObject.put("configVersion", this.configVersion);
            jSONObject.put("otherDetails", format);
            jSONObject.put("exceptionDetails", this.exceptionLog);
            str = Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace("\n", "");
        } catch (RuntimeException | JSONException e) {
            Log.e("APSEvent", "Error in parsing the json .. ignoring : ", e);
        }
        return "{\"Data\": \"" + str + "\",\"PartitionKey\": \"" + this.timestamp + "\"}";
    }

    public APSEvent setExceptionDetails(String str) {
        this.exceptionLog = str.substring(0, 2048 > str.length() ? str.length() : 2048);
        return this;
    }

    public APSEvent build() {
        return this;
    }
}
