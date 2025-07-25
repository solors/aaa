package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventTrackingMethod;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBNativeAdParser {
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1 A[SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.pubmatic.sdk.nativead.response.POBNativeAdResponseAsset> m40428a(@androidx.annotation.Nullable org.json.JSONArray r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = com.pubmatic.sdk.common.utility.POBUtils.isJsonArrayNullOrEmpty(r15)
            if (r1 == 0) goto Lc
            return r0
        Lc:
            r1 = 0
            r2 = r1
        Le:
            int r3 = r15.length()
            if (r2 >= r3) goto Le5
            org.json.JSONObject r3 = r15.optJSONObject(r2)
            boolean r4 = com.pubmatic.sdk.common.utility.POBUtils.isJsonObjectNullOrEmpty(r3)
            if (r4 == 0) goto L20
            goto Le1
        L20:
            java.lang.String r4 = "id"
            boolean r5 = r3.has(r4)
            if (r5 != 0) goto L2a
            goto Le1
        L2a:
            int r7 = r3.optInt(r4)
            java.lang.String r4 = "required"
            int r4 = r3.optInt(r4)
            r5 = 1
            if (r4 != r5) goto L39
            r8 = r5
            goto L3a
        L39:
            r8 = r1
        L3a:
            java.lang.String r4 = "link"
            org.json.JSONObject r4 = r3.optJSONObject(r4)
            com.pubmatic.sdk.nativead.response.POBNativeAdLinkResponse r9 = r14.m40427a(r4)
            java.lang.String r4 = "title"
            boolean r5 = r3.has(r4)
            java.lang.String r6 = "img"
            boolean r10 = r3.has(r6)
            java.lang.String r11 = "data"
            boolean r12 = r3.has(r11)
            java.lang.String r13 = "len"
            if (r5 == 0) goto L7b
            org.json.JSONObject r3 = r3.optJSONObject(r4)
            if (r3 == 0) goto Ldb
            java.lang.String r4 = "text"
            java.lang.String r10 = r3.optString(r4)
            boolean r4 = com.pubmatic.sdk.common.utility.POBUtils.isNullOrEmpty(r10)
            if (r4 != 0) goto Ldb
            int r4 = r10.length()
            int r11 = r3.optInt(r13, r4)
            com.pubmatic.sdk.nativead.response.POBNativeAdTitleResponseAsset r3 = new com.pubmatic.sdk.nativead.response.POBNativeAdTitleResponseAsset
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            goto Ldc
        L7b:
            java.lang.String r4 = "type"
            if (r10 == 0) goto Lac
            org.json.JSONObject r3 = r3.optJSONObject(r6)
            if (r3 == 0) goto Ldb
            java.lang.String r5 = "url"
            java.lang.String r10 = r3.optString(r5)
            boolean r5 = com.pubmatic.sdk.common.utility.POBUtils.isNullOrEmpty(r10)
            if (r5 != 0) goto Ldb
            int r4 = r3.optInt(r4)
            com.pubmatic.sdk.openwrap.core.nativead.POBNativeImageAssetType r13 = com.pubmatic.sdk.openwrap.core.nativead.POBNativeImageAssetType.getImageAssetType(r4)
            java.lang.String r4 = "w"
            int r11 = r3.optInt(r4)
            java.lang.String r4 = "h"
            int r12 = r3.optInt(r4)
            com.pubmatic.sdk.nativead.response.POBNativeAdImageResponseAsset r3 = new com.pubmatic.sdk.nativead.response.POBNativeAdImageResponseAsset
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto Ldc
        Lac:
            if (r12 == 0) goto Ldb
            org.json.JSONObject r3 = r3.optJSONObject(r11)
            if (r3 == 0) goto Ldb
            java.lang.String r5 = "value"
            java.lang.String r6 = r3.optString(r5)
            boolean r6 = com.pubmatic.sdk.common.utility.POBUtils.isNullOrEmpty(r6)
            if (r6 != 0) goto Ldb
            int r4 = r3.optInt(r4)
            com.pubmatic.sdk.openwrap.core.nativead.POBNativeDataAssetType r12 = com.pubmatic.sdk.openwrap.core.nativead.POBNativeDataAssetType.getDataAssetType(r4)
            java.lang.String r10 = r3.optString(r5)
            int r4 = r10.length()
            int r11 = r3.optInt(r13, r4)
            com.pubmatic.sdk.nativead.response.POBNativeAdDataResponseAsset r3 = new com.pubmatic.sdk.nativead.response.POBNativeAdDataResponseAsset
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto Ldc
        Ldb:
            r3 = 0
        Ldc:
            if (r3 == 0) goto Le1
            r0.add(r3)
        Le1:
            int r2 = r2 + 1
            goto Le
        Le5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubmatic.sdk.nativead.response.POBNativeAdParser.m40428a(org.json.JSONArray):java.util.List");
    }

    @NonNull
    /* renamed from: b */
    private List<POBNativeAdResponseEventTracker> m40426b(@Nullable JSONArray jSONArray) {
        POBNativeEventType eventType;
        POBNativeEventTrackingMethod eventTrackingMethod;
        ArrayList arrayList = new ArrayList();
        if (POBUtils.isJsonArrayNullOrEmpty(jSONArray)) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (!POBUtils.isJsonObjectNullOrEmpty(optJSONObject)) {
                String optString = optJSONObject.optString("url");
                if (!POBUtils.isNullOrEmpty(optString) && (eventType = POBNativeEventType.getEventType(optJSONObject.optInt("event"))) != null && (eventTrackingMethod = POBNativeEventTrackingMethod.getEventTrackingMethod(optJSONObject.optInt("method"))) != null) {
                    POBNativeAdResponseEventTracker pOBNativeAdResponseEventTracker = new POBNativeAdResponseEventTracker(optString, eventType, eventTrackingMethod);
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("ext");
                    if (!POBUtils.isJsonObjectNullOrEmpty(optJSONObject2)) {
                        pOBNativeAdResponseEventTracker.setExt(optJSONObject2);
                    }
                    arrayList.add(pOBNativeAdResponseEventTracker);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public POBNativeAdResponse parseNativeAdResponse(@NonNull String str) throws Exception {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(POBNativeConstants.NATIVE_VERSION);
            List<POBNativeAdResponseAsset> m40428a = m40428a(jSONObject.optJSONArray(POBNativeConstants.NATIVE_ASSETS));
            if (!m40428a.isEmpty()) {
                POBNativeAdLinkResponse m40427a = m40427a(jSONObject.optJSONObject("link"));
                List<String> convertStringJsonArrayToList = POBUtils.convertStringJsonArrayToList(jSONObject.optJSONArray(POBNativeConstants.NATIVE_IMPRESSION_TRACKER));
                String optString2 = jSONObject.optString(POBNativeConstants.NATIVE_TRACKER_JAVASCRIPT);
                List<POBNativeAdResponseEventTracker> m40426b = m40426b(jSONObject.optJSONArray(POBNativeConstants.NATIVE_EVENT_TRACKERS));
                if (jSONObject.has("privacy")) {
                    str2 = jSONObject.optString("privacy");
                } else {
                    str2 = null;
                }
                POBNativeAdResponse pOBNativeAdResponse = new POBNativeAdResponse(optString, m40428a, m40427a, convertStringJsonArrayToList, optString2, m40426b, str2);
                POBLog.debug("POBNativeAdParser", "Native Ad response: " + pOBNativeAdResponse, new Object[0]);
                return pOBNativeAdResponse;
            }
            throw new Exception("Native Ad Response received empty assets array or the assets don't have id.");
        } catch (JSONException e) {
            throw new Exception(e.getMessage());
        }
    }

    @Nullable
    /* renamed from: a */
    private POBNativeAdLinkResponse m40427a(@Nullable JSONObject jSONObject) {
        if (POBUtils.isJsonObjectNullOrEmpty(jSONObject)) {
            return null;
        }
        return new POBNativeAdLinkResponse(jSONObject.optString("url"), POBUtils.convertStringJsonArrayToList(jSONObject.optJSONArray(POBNativeConstants.NATIVE_CLICK_TRACKER)), jSONObject.optString(POBNativeConstants.NATIVE_FALLBACK_URL));
    }
}
