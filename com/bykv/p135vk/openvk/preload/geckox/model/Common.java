package com.bykv.p135vk.openvk.preload.geckox.model;

import android.os.Build;
import com.bykv.p135vk.openvk.preload.p155a.p156a.SerializedName;
import com.ironsource.C21018tj;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.bykv.vk.openvk.preload.geckox.model.Common */
/* loaded from: classes3.dex */
public class Common {
    @SerializedName(m91667a = CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)

    /* renamed from: ac */
    public String f14077ac;
    @SerializedName(m91667a = C21018tj.f53565b)
    public long aid;
    @SerializedName(m91667a = "app_name")
    public String appName;
    @SerializedName(m91667a = "app_version")
    public String appVersion;
    @SerializedName(m91667a = "device_id")
    public String deviceId;
    @SerializedName(m91667a = "device_model")
    public String deviceModel;
    @SerializedName(m91667a = "device_platform")
    public String devicePlatform;
    @SerializedName(m91667a = "os")

    /* renamed from: os */
    public int f14078os = 0;
    @SerializedName(m91667a = CommonUrlParts.OS_VERSION)
    public String osVersion;
    @SerializedName(m91667a = "region")
    public String region;
    @SerializedName(m91667a = "sdk_version")
    public String sdkVersion;
    @SerializedName(m91667a = KeyConstants.RequestBody.KEY_UID)
    public String uid;

    public Common(long j, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        this.osVersion = sb2.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f14077ac = str4;
    }

    public Common(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        this.osVersion = sb2.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f14077ac = str4;
        this.uid = str5;
        this.region = str6;
    }
}
