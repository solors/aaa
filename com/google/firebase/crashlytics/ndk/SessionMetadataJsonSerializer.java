package com.google.firebase.crashlytics.ndk;

import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.maticoo.sdk.utils.constant.KeyConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class SessionMetadataJsonSerializer {
    private SessionMetadataJsonSerializer() {
    }

    private static String emptyIfNull(@Nullable String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String serializeBeginSession(String str, String str2, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, str);
        hashMap.put("generator", str2);
        hashMap.put("started_at_seconds", Long.valueOf(j));
        return new JSONObject(hashMap).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String serializeSessionApp(String str, String str2, String str3, String str4, int i, @Nullable String str5, @Nullable String str6) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_identifier", str);
        hashMap.put("version_code", str2);
        hashMap.put("version_name", str3);
        hashMap.put("install_uuid", str4);
        hashMap.put("delivery_mechanism", Integer.valueOf(i));
        hashMap.put("development_platform", emptyIfNull(str5));
        hashMap.put("development_platform_version", emptyIfNull(str6));
        return new JSONObject(hashMap).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String serializeSessionDevice(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(KeyConstants.Android.KEY_ARCH, Integer.valueOf(i));
        hashMap.put("build_model", str);
        hashMap.put("available_processors", Integer.valueOf(i2));
        hashMap.put("total_ram", Long.valueOf(j));
        hashMap.put("disk_space", Long.valueOf(j2));
        hashMap.put("is_emulator", Boolean.valueOf(z));
        hashMap.put("state", Integer.valueOf(i3));
        hashMap.put("build_manufacturer", str2);
        hashMap.put("build_product", str3);
        return new JSONObject(hashMap).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String serializeSessionOs(String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("version", str);
        hashMap.put("build_version", str2);
        hashMap.put(CommonUrlParts.ROOT_STATUS, Boolean.valueOf(z));
        return new JSONObject(hashMap).toString();
    }
}
