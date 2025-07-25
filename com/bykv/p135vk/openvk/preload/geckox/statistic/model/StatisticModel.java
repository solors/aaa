package com.bykv.p135vk.openvk.preload.geckox.statistic.model;

import com.appsflyer.AppsFlyerProperties;
import com.bykv.p135vk.openvk.preload.geckox.model.Common;
import com.bykv.p135vk.openvk.preload.p155a.p156a.SerializedName;
import com.ironsource.C21114v8;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel */
/* loaded from: classes3.dex */
public class StatisticModel {
    @SerializedName(m91667a = "common")
    public Common common;
    @SerializedName(m91667a = "packages")
    public List<PackageStatisticModel> packages = new ArrayList();

    /* renamed from: com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel$PackageStatisticModel */
    /* loaded from: classes3.dex */
    public static class PackageStatisticModel {
        @SerializedName(m91667a = CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)

        /* renamed from: ac */
        public String f14088ac;
        @SerializedName(m91667a = "access_key")
        public String accessKey;
        @SerializedName(m91667a = "active_check_duration")
        public Long activeCheckDuration;
        @SerializedName(m91667a = "apply_duration")
        public Long applyDuration;
        @SerializedName(m91667a = AppsFlyerProperties.CHANNEL)
        public String channel;
        @SerializedName(m91667a = "clean_duration")
        public Long cleanDuration;
        @SerializedName(m91667a = "clean_strategy")
        public Integer cleanStrategy;
        @SerializedName(m91667a = "clean_type")
        public Integer cleanType;
        @SerializedName(m91667a = "download_duration")
        public Long downloadDuration;
        @SerializedName(m91667a = "download_fail_records")
        public List<DownloadFailRecords> downloadFailRecords;
        @SerializedName(m91667a = "download_retry_times")
        public Integer downloadRetryTimes;
        @SerializedName(m91667a = DownloadModel.DOWNLOAD_URL)
        public String downloadUrl;
        @SerializedName(m91667a = "err_code")
        public String errCode;
        @SerializedName(m91667a = "err_msg")
        public String errMsg;
        @SerializedName(m91667a = "group_name")
        public String groupName;
        @SerializedName(m91667a = "id")

        /* renamed from: id */
        public Long f14089id;
        @SerializedName(m91667a = "log_id")
        public String logId;
        @SerializedName(m91667a = "patch_id")
        public Long patchId;
        @SerializedName(m91667a = "stats_type")
        public Integer statsType;

        /* renamed from: com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel$PackageStatisticModel$DownloadFailRecords */
        /* loaded from: classes3.dex */
        public static class DownloadFailRecords {
            @SerializedName(m91667a = C21114v8.C21123i.f54109D)
            public String domain;
            @SerializedName(m91667a = "reason")
            public String reason;

            public DownloadFailRecords(String str, String str2) {
                this.domain = str;
                this.reason = str2;
            }
        }
    }
}
