package com.amazon.device.iap.internal.util;

import com.amazon.device.iap.internal.p096a.C3712c;
import com.amazon.device.iap.internal.p096a.p104h.SubmitMetricCommand;
import com.amazon.device.iap.model.RequestId;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MetricsHelper {
    private static final String DESCRIPTION = "description";
    private static final String EXCEPTION_MESSAGE = "exceptionMessage";
    private static final String EXCEPTION_METRIC = "GenericException";
    private static final String JSON_PARSING_EXCEPTION_METRIC = "JsonParsingFailed";
    private static final String JSON_STRING = "jsonString";
    private static final String RECEIPT_VERIFICATION_FAILED_METRIC = "IapReceiptVerificationFailed";
    private static final String SIGNATURE = "signature";
    private static final String STRING_TO_SIGN = "stringToSign";
    private static final String TAG = "MetricsHelper";

    public static void submitExceptionMetrics(String str, String str2, Exception exc) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(EXCEPTION_MESSAGE, exc.getMessage());
            jSONObject.put("description", str2);
            submitMetric(str, EXCEPTION_METRIC, jSONObject);
        } catch (Exception e) {
            String str3 = TAG;
            C3722b.m102374b(str3, "error calling submitMetric: " + e);
        }
    }

    public static void submitJsonParsingExceptionMetrics(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_STRING, str2);
            jSONObject.put("description", str3);
            submitMetric(str, JSON_PARSING_EXCEPTION_METRIC, jSONObject);
        } catch (Exception e) {
            String str4 = TAG;
            C3722b.m102374b(str4, "error calling submitMetric: " + e);
        }
    }

    protected static void submitMetric(String str, String str2, JSONObject jSONObject) {
        new SubmitMetricCommand(new C3712c(RequestId.fromString(str)), str2, jSONObject.toString()).mo102445l();
    }

    public static void submitReceiptVerificationFailureMetrics(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stringToSign", str2);
            jSONObject.put("signature", str3);
            submitMetric(str, "IapReceiptVerificationFailed", jSONObject);
        } catch (Exception e) {
            String str4 = TAG;
            C3722b.m102374b(str4, "error calling submitMetric: " + e);
        }
    }
}
