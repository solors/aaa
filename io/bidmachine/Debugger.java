package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import io.bidmachine.core.Utils;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.bidmachine.r2 */
/* loaded from: classes9.dex */
public class Debugger {
    private static final String DIR_NAME = "features";
    private static final String FILE_NAME = "DebugParameters.json";
    private static final String PARAMETER_CONSENT = "consent";
    private static final String PARAMETER_COPPA = "coppa";
    private static final String PARAMETER_ENDPOINT = "endpoint";
    private static final String PARAMETER_GDPR_STRING = "GDPRString";
    private static final String PARAMETER_LOGGING_ENABLED = "loggingEnabled";
    private static final String PARAMETER_SUBJECT_TO_GDPR = "subjectToGDPR";
    private static final String PARAMETER_TEST_MODE = "testMode";
    private static final String PARAMETER_US_PRIVACY_STRING = "usPrivacyString";
    private static final String TAG = "Debugger";

    Debugger() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setup(@NonNull Context context) {
        String str;
        try {
            File externalFilesDirDirty = Utils.getExternalFilesDirDirty(context);
            if (externalFilesDirDirty == null) {
                return;
            }
            File file = new File(externalFilesDirDirty, "features/DebugParameters.json");
            if (!file.exists()) {
                return;
            }
            Log.d(TAG, "Debug file founded");
            String readFile = Utils.readFile(file);
            if (TextUtils.isEmpty(readFile)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(readFile);
            if (jSONObject.has(PARAMETER_LOGGING_ENABLED)) {
                BidMachine.setLoggingEnabled(jSONObject.optBoolean(PARAMETER_LOGGING_ENABLED));
            }
            if (jSONObject.has(PARAMETER_TEST_MODE)) {
                BidMachine.setTestMode(jSONObject.optBoolean(PARAMETER_TEST_MODE));
            }
            if (jSONObject.has("endpoint")) {
                String optString = jSONObject.optString("endpoint");
                if (!TextUtils.isEmpty(optString) && Utils.isHttpUrl(optString)) {
                    BidMachine.setEndpoint(optString);
                }
            }
            if (jSONObject.has("coppa")) {
                BidMachine.setCoppa(Boolean.valueOf(jSONObject.optBoolean("coppa")));
            }
            if (jSONObject.has(PARAMETER_US_PRIVACY_STRING)) {
                BidMachine.setUSPrivacyString(jSONObject.optString(PARAMETER_US_PRIVACY_STRING));
            }
            if (jSONObject.has(PARAMETER_SUBJECT_TO_GDPR)) {
                BidMachine.setSubjectToGDPR(Boolean.valueOf(jSONObject.optBoolean(PARAMETER_SUBJECT_TO_GDPR)));
            }
            if (jSONObject.has("consent")) {
                boolean optBoolean = jSONObject.optBoolean("consent");
                if (jSONObject.has(PARAMETER_GDPR_STRING)) {
                    str = jSONObject.optString(PARAMETER_GDPR_STRING);
                } else {
                    str = null;
                }
                BidMachine.setConsentConfig(optBoolean, str);
            }
        } catch (Throwable th) {
            Log.w(TAG, th);
        }
    }
}
