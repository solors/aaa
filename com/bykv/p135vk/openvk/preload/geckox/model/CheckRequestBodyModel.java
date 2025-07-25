package com.bykv.p135vk.openvk.preload.geckox.model;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.appsflyer.AppsFlyerProperties;
import com.bykv.p135vk.openvk.preload.p155a.p156a.SerializedName;
import com.ironsource.C21114v8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel */
/* loaded from: classes3.dex */
public class CheckRequestBodyModel {
    @SerializedName(m91667a = "common")
    private Common common;
    @SerializedName(m91667a = "custom")
    private Map<String, Map<String, Object>> custom;
    @SerializedName(m91667a = "deployment")
    private Map<String, List<ChannelInfo>> deployment;
    @SerializedName(m91667a = "deployments")
    private Map<String, Object> deployments;
    @SerializedName(m91667a = "local")
    private Map<String, Map<String, LocalChannel>> local;

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel$Channel */
    /* loaded from: classes3.dex */
    public static class Channel {
        @SerializedName(m91667a = ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)
        String channelName;
        @SerializedName(m91667a = "l_v")
        public String localVersion;

        public Channel(String str) {
            this.channelName = str;
        }
    }

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel$ChannelInfo */
    /* loaded from: classes3.dex */
    public static class ChannelInfo {
        @SerializedName(m91667a = AppsFlyerProperties.CHANNEL)
        private String channel;
        @SerializedName(m91667a = "local_version")
        private long localVersion;

        public ChannelInfo(String str, long j) {
            this.channel = str;
            this.localVersion = j;
        }
    }

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel$Channels */
    /* loaded from: classes3.dex */
    public static class Channels {
        @SerializedName(m91667a = "channels")
        public List<Channel> channels = new ArrayList();
    }

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel$Group */
    /* loaded from: classes3.dex */
    public static class Group {
        @SerializedName(m91667a = "group_name")
        public String groupName;
        @SerializedName(m91667a = "target_channels")
        public List<TargetChannel> targetChannels;
    }

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel$GroupType */
    /* loaded from: classes3.dex */
    public enum GroupType {
        NORMAL("normal"),
        HIGHPRIORITY("high_priority");
        
        private String value;

        GroupType(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel$LocalChannel */
    /* loaded from: classes3.dex */
    public static class LocalChannel {
        @SerializedName(m91667a = "l_v")
        public Long localVersion;
    }

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel$ProcessorParams */
    /* loaded from: classes3.dex */
    public static class ProcessorParams {
        @SerializedName(m91667a = C21114v8.C21123i.f54109D)
        public String domain;
    }

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel$TargetChannel */
    /* loaded from: classes3.dex */
    public static class TargetChannel {
        @SerializedName(m91667a = ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)
        public String channelName;
        @SerializedName(m91667a = "t_v")
        public Long targetVersion;

        public TargetChannel() {
        }

        public TargetChannel(String str) {
            this.channelName = str;
        }

        public TargetChannel(String str, Long l) {
            this.channelName = str;
            this.targetVersion = l;
        }
    }

    public void putChannelInfo(String str, List<ChannelInfo> list) {
        if (this.deployment == null) {
            this.deployment = new HashMap();
        }
        this.deployment.put(str, list);
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    public void setCustom(Map<String, Map<String, Object>> map) {
        this.custom = map;
    }

    public void setDeployments(Map<String, Object> map) {
        this.deployments = map;
    }

    public void setLocal(Map<String, Map<String, LocalChannel>> map) {
        this.local = map;
    }
}
