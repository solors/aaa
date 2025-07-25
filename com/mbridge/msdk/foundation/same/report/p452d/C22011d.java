package com.mbridge.msdk.foundation.same.report.p452d;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.VideoReportData;
import com.mbridge.msdk.foundation.same.SameCommon;
import com.mbridge.msdk.foundation.same.net.p447e.RequestUrlUtil;
import com.mbridge.msdk.foundation.same.report.EventLibraryCommon;
import com.mbridge.msdk.foundation.same.report.EventLibraryDecorate;
import com.mbridge.msdk.foundation.same.report.SocketStack;
import com.mbridge.msdk.foundation.same.report.StringReportResponseHandler;
import com.mbridge.msdk.foundation.same.report.p452d.p453a.MetricsReportCallBack;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameOptimizedController;
import com.mbridge.msdk.tracker.C22885e;
import com.mbridge.msdk.tracker.MBridgeTrackManager;
import com.mbridge.msdk.tracker.NetworkStackConfig;
import com.mbridge.msdk.tracker.TrackConfig;
import com.mbridge.msdk.tracker.network.toolbox.C22923h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MetricsManager.java */
/* renamed from: com.mbridge.msdk.foundation.same.report.d.d */
/* loaded from: classes6.dex */
public class C22011d {

    /* renamed from: a */
    private static C22011d f56781a;

    /* renamed from: b */
    private volatile MBridgeTrackManager f56782b;

    /* renamed from: c */
    private Map<String, ParameterWrapper> f56783c = new HashMap();

    /* renamed from: d */
    private LinkedHashMap<String, MetricsData> f56784d = new LinkedHashMap<>();

    /* renamed from: e */
    private Map<String, ParameterWrapper> f56785e = new HashMap();

    private C22011d() {
        if (this.f56782b == null) {
            this.f56782b = MBridgeTrackManager.m49536a("metrics_sdk", MBSDKContext.m52746m().m52792c(), m52028d());
        }
        JSONObject m52112a = EventLibraryCommon.m52112a();
        if (this.f56782b != null) {
            this.f56782b.m49535a(m52112a);
            this.f56782b.m49541a();
        }
    }

    /* renamed from: d */
    private TrackConfig m52028d() {
        NetworkStackConfig networkStackConfig;
        try {
            int m51812a = SameOptimizedController.m51814a().m51812a("metrics", "t_m_e_t", SameOptimizedController.m51814a().m51813a("t_m_e_t", 604800000));
            int m51812a2 = SameOptimizedController.m51814a().m51812a("metrics", "t_m_e_s", SameOptimizedController.m51814a().m51813a("t_m_e_s", 50));
            int m51812a3 = SameOptimizedController.m51814a().m51812a("metrics", "t_m_r_c", SameOptimizedController.m51814a().m51813a("t_m_r_c", 50));
            int m51812a4 = SameOptimizedController.m51814a().m51812a("metrics", "t_m_t", SameOptimizedController.m51814a().m51813a("t_m_t", 15000));
            int m51812a5 = SameOptimizedController.m51814a().m51812a("metrics", "t_m_r_t_s", SameOptimizedController.m51814a().m51813a("t_m_r_t_s", 2));
            int m51812a6 = SameOptimizedController.m51814a().m51812a("metrics", "t_r_t", SameOptimizedController.m51814a().m51813a("t_r_t", 1));
            if (m51812a6 != 0 && m51812a6 != 1) {
                m51812a6 = 0;
            }
            TrackConfig.C22948a m49308a = new TrackConfig.C22948a().m49300e(m51812a).m49312a(m51812a2).m49302d(m51812a3).m49306b(m51812a4).m49304c(m51812a5).m49310a(new EventLibraryDecorate()).m49309a(EventLibraryCommon.m52109b()).m49308a(new StringReportResponseHandler());
            if (m51812a6 == 1) {
                networkStackConfig = new NetworkStackConfig(new SocketStack((byte) 2), RequestUrlUtil.m52180f().f56655i, RequestUrlUtil.m52180f().f56659m);
            } else {
                networkStackConfig = new NetworkStackConfig(new C22923h(), RequestUrlUtil.m52180f().f56649c, 0);
            }
            return m49308a.m49311a(m51812a6, networkStackConfig).m49313a();
        } catch (Exception e) {
            SameLogTool.m51824b("EventLibraryReport", "configTrackManager error: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public final void m52047a(MetricsData metricsData) {
        if (metricsData != null) {
            try {
                if (this.f56783c != null) {
                    ParameterWrapper parameterWrapper = new ParameterWrapper();
                    parameterWrapper.m52024a("rs_rid", metricsData.m52064k());
                    parameterWrapper.m52024a("r_stid", metricsData.m52060m());
                    parameterWrapper.m52024a("rus_rid", metricsData.m52062l());
                    parameterWrapper.m52024a("u_stid", metricsData.m52051t());
                    this.f56783c.put(metricsData.m52068i(), parameterWrapper);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m52032b(String str, ParameterWrapper parameterWrapper) {
        try {
            MetricsData metricsData = new MetricsData();
            if (parameterWrapper.m52022b(MBridgeConstans.PROPERTIES_UNIT_ID) != null) {
                metricsData.m52081d(String.valueOf(parameterWrapper.m52022b(MBridgeConstans.PROPERTIES_UNIT_ID)));
            }
            if (parameterWrapper.m52022b("lrid") != null && (parameterWrapper.m52022b("lrid") instanceof String)) {
                metricsData.m52085c(String.valueOf(parameterWrapper.m52022b("lrid")));
            }
            metricsData.m52096a(str, parameterWrapper);
            new SameMetricsReport().m52014b(str, m52030c(), metricsData, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public final MBridgeTrackManager m52030c() {
        try {
            JSONObject m52112a = EventLibraryCommon.m52112a();
            if (this.f56782b == null) {
                this.f56782b = MBridgeTrackManager.m49536a("metrics_sdk", MBSDKContext.m52746m().m52792c(), m52028d());
                if (this.f56782b != null) {
                    this.f56782b.m49535a(m52112a);
                    this.f56782b.m49541a();
                }
            } else {
                this.f56782b.m49535a(m52112a);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return this.f56782b;
    }

    /* renamed from: a */
    public final ParameterWrapper m52046a(String str) {
        Map<String, ParameterWrapper> map;
        ParameterWrapper parameterWrapper = new ParameterWrapper();
        try {
            return (TextUtils.isEmpty(str) || (map = this.f56783c) == null || !map.containsKey(str)) ? parameterWrapper : this.f56783c.get(str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
                return parameterWrapper;
            }
            return parameterWrapper;
        }
    }

    /* renamed from: b */
    private void m52033b(String str, MetricsData metricsData, MetricsReportCallBack metricsReportCallBack) {
        try {
            if (Arrays.asList(MetricsConstant.f56742c).contains(str)) {
                metricsData.m52059m(str);
            }
            Map<String, ParameterWrapper> map = this.f56785e;
            if (map != null && map.containsKey(str)) {
                metricsData.m52096a(str, this.f56785e.get(str));
            }
            new SameMetricsReport().m52018a(str, m52030c(), metricsData, metricsReportCallBack);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public final void m52029c(String str) {
        try {
            JSONObject m52267a = SameCommon.m52267a(str);
            if (m52267a != null && m52267a.length() != 0) {
                String optString = m52267a.optString("key");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                C22885e c22885e = new C22885e(optString);
                c22885e.m49598b(0);
                c22885e.m49605a(0);
                c22885e.m49603a(EventLibraryCommon.m52108c());
                c22885e.m49601a(m52267a);
                MBridgeTrackManager m52030c = m52050a().m52030c();
                if (m52030c == null || !m52030c.m49529e()) {
                    return;
                }
                m52030c.m49540a(c22885e);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("EventLibraryReport", "reportByTrackManager error: " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final void m52040a(String str, ParameterWrapper parameterWrapper) {
        Map<String, ParameterWrapper> map = this.f56785e;
        if (map != null) {
            map.put(str, parameterWrapper);
        }
    }

    /* renamed from: a */
    public final ParameterWrapper m52049a(int i, int i2, String str, boolean z, int i3) {
        ParameterWrapper parameterWrapper = new ParameterWrapper();
        try {
            parameterWrapper.m52024a(CampaignEx.JSON_KEY_HB, Integer.valueOf(i));
            parameterWrapper.m52024a("adtp", Integer.valueOf(i2));
            parameterWrapper.m52024a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            if (z) {
                parameterWrapper.m52024a("auto_load", Integer.valueOf(i3));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return parameterWrapper;
    }

    /* renamed from: b */
    public final LinkedHashMap<String, MetricsData> m52036b() {
        return this.f56784d;
    }

    /* renamed from: b */
    public final void m52034b(String str) {
        m52031b(str, "");
    }

    /* renamed from: b */
    public final void m52031b(String str, String str2) {
        LinkedHashMap<String, MetricsData> linkedHashMap;
        try {
            String str3 = str + str2;
            if (!TextUtils.isEmpty(str3) && (linkedHashMap = this.f56784d) != null && linkedHashMap.containsKey(str3)) {
                this.f56784d.remove(str3);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static C22011d m52050a() {
        if (f56781a == null) {
            synchronized (C22011d.class) {
                if (f56781a == null) {
                    f56781a = new C22011d();
                }
            }
        }
        return f56781a;
    }

    /* renamed from: b */
    public final MetricsData m52035b(MetricsData metricsData) {
        if (metricsData == null) {
            return null;
        }
        try {
            return (MetricsData) metricsData.clone();
        } catch (CloneNotSupportedException e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
                return null;
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void m52044a(String str, CampaignEx campaignEx, ParameterWrapper parameterWrapper) {
        MetricsData metricsData;
        String str2 = "";
        if (campaignEx != null) {
            try {
                str2 = campaignEx.getLocalRequestId();
                metricsData = this.f56784d.get(str2);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            metricsData = null;
        }
        if (metricsData != null) {
            if (Arrays.asList(MetricsConstant.f56747h).contains(str)) {
                metricsData = m52035b(metricsData);
            }
        } else {
            metricsData = new MetricsData();
        }
        metricsData.m52098a(campaignEx);
        metricsData.m52085c(str2);
        metricsData.m52096a(str, parameterWrapper);
        m52033b(str, metricsData, null);
    }

    /* renamed from: a */
    public final void m52045a(String str, CampaignEx campaignEx) {
        String str2 = "";
        if (campaignEx != null) {
            try {
                str2 = campaignEx.getCurrentLocalRid();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        MetricsData metricsData = this.f56784d.get(str2);
        if (metricsData == null) {
            metricsData = new MetricsData();
        }
        if (metricsData.m52070h() != null && !metricsData.m52070h().isEmpty() && campaignEx != null) {
            int i = 0;
            while (true) {
                if (i >= metricsData.m52070h().size()) {
                    break;
                } else if (metricsData.m52070h().get(i).getId().equals(campaignEx.getId())) {
                    metricsData.m52070h().set(i, campaignEx);
                    break;
                } else {
                    i++;
                }
            }
        }
        metricsData.m52098a(campaignEx);
        metricsData.m52085c(str2);
        m52033b(str, metricsData, null);
    }

    /* renamed from: a */
    public final void m52038a(String str, List<CampaignEx> list, ParameterWrapper parameterWrapper) {
        CampaignEx campaignEx;
        String str2 = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    str2 = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        MetricsData metricsData = this.f56784d.get(str2);
        if (metricsData == null) {
            metricsData = new MetricsData();
        }
        metricsData.m52089b(list);
        if (list != null && list.size() > 0) {
            metricsData.m52085c(list.get(0).getCurrentLocalRid());
        }
        metricsData.m52096a(str, parameterWrapper);
        m52033b(str, metricsData, null);
    }

    /* renamed from: a */
    public final void m52041a(String str, MetricsData metricsData, MetricsReportCallBack metricsReportCallBack) {
        m52033b(str, metricsData, metricsReportCallBack);
    }

    /* renamed from: a */
    public final void m52048a(VideoReportData videoReportData, CampaignEx campaignEx) {
        ParameterWrapper parameterWrapper = new ParameterWrapper();
        parameterWrapper.m52024a("result", Integer.valueOf(videoReportData.m52331m()));
        parameterWrapper.m52024a("scenes", videoReportData.m52355b("scenes", ""));
        parameterWrapper.m52024a("resource_type", Integer.valueOf(videoReportData.m52363F()));
        parameterWrapper.m52024a("url", videoReportData.m52355b("url", ""));
        parameterWrapper.m52024a("reason", videoReportData.m52341h());
        parameterWrapper.m52024a("mraid_type", Integer.valueOf(videoReportData.m52367B()));
        m52050a().m52044a(videoReportData.m52362a(), campaignEx, parameterWrapper);
    }

    /* renamed from: a */
    public final void m52043a(String str, MetricsData metricsData) {
        try {
            Map<String, ParameterWrapper> map = this.f56785e;
            if (map != null && map.containsKey(str) && metricsData != null) {
                metricsData.m52096a(str, this.f56785e.get(str));
            }
            new SameMetricsReport().m52018a(str, m52030c(), metricsData, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void m52042a(String str, MetricsData metricsData, CampaignEx campaignEx, Context context, MetricsReportCallBack metricsReportCallBack) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (metricsData == null) {
                metricsData = new MetricsData();
            }
            ParameterWrapper parameterWrapper = new ParameterWrapper();
            parameterWrapper.m52024a("st", Long.valueOf(System.currentTimeMillis()));
            if (campaignEx != null) {
                parameterWrapper.m52024a("cid", campaignEx.getId());
                parameterWrapper.m52024a("lrid", campaignEx.getLocalRequestId());
                parameterWrapper.m52024a("rid", campaignEx.getRequestId());
                parameterWrapper.m52024a("rid_n", campaignEx.getRequestIdNotice());
                parameterWrapper.m52024a("adtp", Integer.valueOf(campaignEx.getAdType()));
                if (!parameterWrapper.m52025a(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    parameterWrapper.m52024a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                }
                parameterWrapper.m52024a(CampaignEx.JSON_KEY_HB, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                parameterWrapper.m52024a("bid_tk", campaignEx.getBidToken());
            }
            if (context != null) {
                parameterWrapper.m52024a("network_type", Integer.valueOf(SameDiTool.m51876m(context)));
            }
            metricsData.m52096a(str, parameterWrapper);
            m52033b(str, metricsData, metricsReportCallBack);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final MetricsData m52039a(String str, String str2) {
        LinkedHashMap<String, MetricsData> linkedHashMap;
        try {
            String str3 = str + str2;
            if (!TextUtils.isEmpty(str3) && (linkedHashMap = this.f56784d) != null && linkedHashMap.containsKey(str3)) {
                return this.f56784d.get(str3);
            }
            return null;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void m52037a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.length() == 0) {
                    return;
                }
                String optString = jSONObject.optString("key");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                C22885e c22885e = new C22885e(optString);
                c22885e.m49598b(0);
                c22885e.m49605a(0);
                c22885e.m49603a(EventLibraryCommon.m52108c());
                c22885e.m49601a(jSONObject);
                MBridgeTrackManager m52030c = m52050a().m52030c();
                if (m52030c == null || !m52030c.m49529e()) {
                    return;
                }
                m52030c.m49540a(c22885e);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51824b("EventLibraryReport", "reportByTrackManager error: " + e.getMessage());
                }
            }
        }
    }
}
