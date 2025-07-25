package com.pubmatic.sdk.crashanalytics;

import android.content.Context;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAppInfo;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: POBCrashHelper.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBCrashHelper {
    @NotNull

    /* renamed from: a */
    private final String f70349a;
    @NotNull

    /* renamed from: b */
    private final String f70350b;

    /* renamed from: c */
    private final long f70351c;
    @NotNull

    /* renamed from: d */
    private final String f70352d;

    public POBCrashHelper(@NotNull String crashName, @NotNull String stackTrace, long j) {
        Intrinsics.checkNotNullParameter(crashName, "crashName");
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        this.f70349a = crashName;
        this.f70350b = stackTrace;
        this.f70351c = j;
        this.f70352d = "POBCrashHelper";
    }

    /* renamed from: a */
    private final JSONObject m40510a(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        POBAppInfo appInfo = POBInstanceProvider.getAppInfo(context);
        Intrinsics.checkNotNullExpressionValue(appInfo, "getAppInfo(context)");
        jSONObject.put("name", appInfo.getAppName());
        jSONObject.put(POBNativeConstants.NATIVE_VERSION, appInfo.getAppVersion());
        jSONObject.put("bndl", appInfo.getPackageName());
        jSONObject.put("owsdkver", OpenWrapSDK.getVersion());
        jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, POBInstanceProvider.getCacheManager(context).getPublisherId());
        return jSONObject;
    }

    /* renamed from: b */
    private final JSONObject m40509b(Context context) throws JSONException {
        int i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("os", "Android");
        if (POBUtils.isTablet(context)) {
            i = 5;
        } else {
            i = 4;
        }
        jSONObject.put("type", i);
        POBDeviceInfo deviceInfo = POBInstanceProvider.getDeviceInfo(context);
        Intrinsics.checkNotNullExpressionValue(deviceInfo, "getDeviceInfo(context)");
        jSONObject.put("model", deviceInfo.getModel());
        jSONObject.put("make", deviceInfo.getMake());
        jSONObject.put("osv", deviceInfo.getOsVersion());
        jSONObject.put("con", POBInstanceProvider.getNetworkMonitor(context).getConnectionType().getValue());
        return jSONObject;
    }

    @NotNull
    public final JSONObject getCrashJson(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.f70351c);
            jSONObject.put("applicationInfo", m40510a(context));
            jSONObject.put("deviceInfo", m40509b(context));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", this.f70349a);
            jSONObject2.put("st", this.f70350b);
            jSONObject.put("crashInfo", jSONObject2);
            jSONObject.put("adSessions", POBInstanceProvider.getCacheManager(context).getCachedBidResponses().toString());
        } catch (JSONException e) {
            String str = this.f70352d;
            POBLog.debug(str, "JSONException caught while inserting crash details in jsonObject.Message -> " + e.getMessage(), new Object[0]);
        }
        return jSONObject;
    }
}
