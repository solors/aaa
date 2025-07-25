package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.share.LinkGenerator;
import java.util.Map;

/* loaded from: classes2.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: JSONException -> 0x0044, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0044, blocks: (B:2:0x0000, B:17:0x003c, B:19:0x0040, B:7:0x0022, B:10:0x002c), top: B:24:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AFInAppEventParameterName(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L44
            r0.<init>()     // Catch: org.json.JSONException -> L44
            java.lang.String r1 = "status"
            java.lang.String r2 = "failure"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L44
            java.lang.String r1 = "data"
            r0.put(r1, r8)     // Catch: org.json.JSONException -> L44
            int r8 = r7.hashCode()     // Catch: org.json.JSONException -> L44
            r1 = -1390007222(0xffffffffad262c4a, float:-9.445842E-12)
            r2 = 1
            if (r8 == r1) goto L2c
            r1 = 1050716216(0x3ea0a838, float:0.3137834)
            if (r8 == r1) goto L22
            goto L36
        L22:
            java.lang.String r8 = "onInstallConversionFailure"
            boolean r7 = r7.equals(r8)     // Catch: org.json.JSONException -> L44
            if (r7 == 0) goto L36
            r7 = 0
            goto L37
        L2c:
            java.lang.String r8 = "onAttributionFailure"
            boolean r7 = r7.equals(r8)     // Catch: org.json.JSONException -> L44
            if (r7 == 0) goto L36
            r7 = r2
            goto L37
        L36:
            r7 = -1
        L37:
            if (r7 == 0) goto L40
            if (r7 == r2) goto L3c
            goto L3f
        L3c:
            r6.onAttributionFailureNative(r0)     // Catch: org.json.JSONException -> L44
        L3f:
            return
        L40:
            r6.onInstallConversionFailureNative(r0)     // Catch: org.json.JSONException -> L44
            return
        L44:
            r7 = move-exception
            r3 = r7
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1bSDK r1 = com.appsflyer.internal.AFg1bSDK.OTHER
            java.lang.String r2 = "2dx error"
            r4 = 0
            r5 = 0
            r0.m92151e(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyer2dXConversionCallback.AFInAppEventParameterName(java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        AFInAppEventParameterName("onInstallConversionFailure", str);
    }

    public native void onAttributionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        AFInAppEventParameterName("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(@NonNull DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(@NonNull DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);
}
