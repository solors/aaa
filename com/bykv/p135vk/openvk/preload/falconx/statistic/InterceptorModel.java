package com.bykv.p135vk.openvk.preload.falconx.statistic;

import android.os.SystemClock;
import com.appsflyer.AppsFlyerProperties;
import com.bykv.p135vk.openvk.preload.p155a.p156a.SerializedName;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.bykv.vk.openvk.preload.falconx.statistic.InterceptorModel */
/* loaded from: classes3.dex */
public class InterceptorModel {
    @SerializedName(m91667a = CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)

    /* renamed from: ac */
    public String f13930ac;
    @SerializedName(m91667a = "access_key")
    public String accessKey;
    @SerializedName(m91667a = AppsFlyerProperties.CHANNEL)
    public String channel;
    @SerializedName(m91667a = "err_code")
    public String errCode;
    @SerializedName(m91667a = "err_msg")
    public String errMsg;
    @SerializedName(m91667a = "log_id")
    public String logId;
    @SerializedName(m91667a = "mime_type")
    public String mimeType;
    @SerializedName(m91667a = "offline_duration")
    public Long offlineDuration;
    @SerializedName(m91667a = "offline_rule")
    public String offlineRule;
    @SerializedName(m91667a = "offline_status")
    public Integer offlineStatus;
    @SerializedName(m91667a = "online_duration")
    public Long onlineDuration;
    @SerializedName(m91667a = "page_url")
    public String pageUrl;
    @SerializedName(m91667a = "pkg_version")
    public Long pkgVersion;
    @SerializedName(m91667a = "res_root_dir")
    public String resRootDir;
    public Long startTime = Long.valueOf(SystemClock.uptimeMillis());
    @SerializedName(m91667a = DownloadModel.RESOURCE_URL)
    public String url;

    public void loadFinish(boolean z) {
        if (z) {
            this.offlineDuration = Long.valueOf(SystemClock.uptimeMillis() - this.startTime.longValue());
            this.offlineStatus = 1;
            return;
        }
        this.offlineStatus = 0;
    }

    public void setErrorCode(String str) {
        this.errCode = str;
    }

    public void setErrorMsg(String str) {
        this.errMsg = str;
    }
}
