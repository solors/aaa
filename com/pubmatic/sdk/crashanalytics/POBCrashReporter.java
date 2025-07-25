package com.pubmatic.sdk.crashanalytics;

import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.network.POBNetworkResult;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: POBCrashReporter.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBCrashReporter {
    @NotNull
    public static final POBCrashReporter INSTANCE = new POBCrashReporter();

    private POBCrashReporter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m40508a(POBNetworkResult pOBNetworkResult) {
        if (pOBNetworkResult != null) {
            POBLog.debug("POBCrashReporter", pOBNetworkResult.toString(), new Object[0]);
        }
    }

    public final void reportCrash(@NotNull POBNetworkHandler networkHandler, @NotNull JSONObject crashJsonObject, @Nullable final POBCrashReporterListener pOBCrashReporterListener) {
        Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        Intrinsics.checkNotNullParameter(crashJsonObject, "crashJsonObject");
        String jSONObject = crashJsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "crashJsonObject.toString()");
        networkHandler.sendJSONRequest(m40507a(jSONObject), new POBNetworkHandler.POBNetworkListener<JSONObject>() { // from class: com.pubmatic.sdk.crashanalytics.POBCrashReporter$reportCrash$1
            @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
            public void onFailure(@NotNull POBError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                POBLog.debug("POBCrashReporter", "Diagnostic data sync completed with error: " + error, new Object[0]);
                POBCrashReporterListener pOBCrashReporterListener2 = POBCrashReporterListener.this;
                if (pOBCrashReporterListener2 != null) {
                    pOBCrashReporterListener2.onFailure();
                }
            }

            @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
            public void onSuccess(@Nullable JSONObject jSONObject2) {
                POBLog.debug("POBCrashReporter", String.valueOf(jSONObject2), new Object[0]);
                POBLog.debug("POBCrashReporter", "Diagnostic data sync completed.", new Object[0]);
                POBCrashReporterListener pOBCrashReporterListener2 = POBCrashReporterListener.this;
                if (pOBCrashReporterListener2 != null) {
                    pOBCrashReporterListener2.onSuccess();
                }
            }
        }, new POBNetworkHandler.POBNetworkResultListener() { // from class: com.pubmatic.sdk.crashanalytics.c
            @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkResultListener
            public final void onResult(POBNetworkResult pOBNetworkResult) {
                POBCrashReporter.m40508a(pOBNetworkResult);
            }
        });
    }

    /* renamed from: a */
    private final POBHttpRequest m40507a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        POBHttpRequest pOBHttpRequest = new POBHttpRequest();
        pOBHttpRequest.setRequestMethod(POBHttpRequest.HTTP_METHOD.POST);
        pOBHttpRequest.setPostData(str);
        pOBHttpRequest.setUrl("https://owsdk.pubmatic.com/crashanalytics");
        pOBHttpRequest.setRetryCount(3);
        pOBHttpRequest.setTimeout(5000);
        pOBHttpRequest.setHeaders(hashMap);
        POBLog.debug("POBCrashReporter", "Sending request to crashlytics - : %s", pOBHttpRequest.toString());
        return pOBHttpRequest;
    }
}
