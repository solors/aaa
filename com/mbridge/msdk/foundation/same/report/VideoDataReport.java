package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.SDKAuthorityController;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.VideoReportData;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameTool;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.report.n */
/* loaded from: classes6.dex */
public final class VideoDataReport {
    /* renamed from: a */
    public static void m51937a(List<VideoReportData> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (VideoReportData videoReportData : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (videoReportData.m52358b() != null) {
                    jSONObject.put("resource_type", videoReportData.m52358b());
                }
                if (videoReportData.m52339i() != null) {
                    jSONObject.put(Reporting.Key.CREATIVE, videoReportData.m52339i());
                }
                jSONObject.put("key", videoReportData.m52362a());
                jSONObject.put("result", videoReportData.m52331m());
                jSONObject.put("duration", videoReportData.m52329n());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, videoReportData.m52327o());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, videoReportData.m52325p());
                jSONObject.put("reason", videoReportData.m52341h());
                jSONObject.put("cid", videoReportData.m52348e());
                jSONObject.put("video_url", videoReportData.m52323q());
                jSONObject.put("rid", videoReportData.m52345f());
                jSONObject.put("rid_n", videoReportData.m52343g());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, videoReportData.m52354c());
                jSONObject.put("offer_url", videoReportData.m52321r());
                if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", videoReportData.m52335k());
                    jSONObject.put("network_str", videoReportData.m52333l());
                }
                C22011d.m52050a().m52037a(jSONObject);
            } catch (Throwable th) {
                SameLogTool.m51824b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m51935b(List<VideoReportData> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (VideoReportData videoReportData : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", videoReportData.m52362a());
                jSONObject.put("result", videoReportData.m52331m());
                jSONObject.put("duration", videoReportData.m52329n());
                jSONObject.put(CampaignEx.ENDCARD_URL, videoReportData.m52319s());
                jSONObject.put("cid", videoReportData.m52348e());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, videoReportData.m52354c());
                jSONObject.put("reason", videoReportData.m52341h());
                jSONObject.put("ad_type", videoReportData.m52351d());
                jSONObject.put("rid", videoReportData.m52345f());
                jSONObject.put("rid_n", videoReportData.m52343g());
                jSONObject.put("type", videoReportData.m52317t());
                jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, videoReportData.m52315u());
                C22011d.m52050a().m52037a(jSONObject);
            } catch (Throwable th) {
                SameLogTool.m51824b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static void m51934c(List<VideoReportData> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    for (VideoReportData videoReportData : list) {
                        if (videoReportData != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("key", videoReportData.m52362a());
                                jSONObject.put("event", SameTool.m51761a(videoReportData.m52313v()));
                                jSONObject.put("template", SameTool.m51761a(videoReportData.m52311w()));
                                jSONObject.put("layout", SameTool.m51761a(videoReportData.m52310x()));
                                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, SameTool.m51761a(videoReportData.m52354c()));
                                jSONObject.put("cid", SameTool.m51761a(videoReportData.m52348e()));
                                if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                                    jSONObject.put("network_str", videoReportData.m52333l());
                                    jSONObject.put("network_type", videoReportData.m52335k());
                                }
                                C22011d.m52050a().m52037a(jSONObject);
                            } catch (Exception e) {
                                SameLogTool.m51824b("VideoDataReport", e.getMessage());
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                SameLogTool.m51824b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* renamed from: d */
    public static void m51933d(List<VideoReportData> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    for (VideoReportData videoReportData : list) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("key", videoReportData.m52362a());
                        jSONObject.put("cid", videoReportData.m52348e());
                        jSONObject.put(CampaignEx.JSON_KEY_IMAGE_URL, videoReportData.m52309y());
                        jSONObject.put("reason", videoReportData.m52341h());
                        jSONObject.put("rid", videoReportData.m52345f());
                        jSONObject.put("rid_n", videoReportData.m52343g());
                        jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, videoReportData.m52354c());
                        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                            jSONObject.put("network_type", videoReportData.m52335k());
                        }
                        C22011d.m52050a().m52037a(jSONObject);
                    }
                }
            } catch (Throwable th) {
                SameLogTool.m51824b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* renamed from: e */
    public static void m51932e(List<VideoReportData> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    for (VideoReportData videoReportData : list) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("key", videoReportData.m52362a());
                        jSONObject.put("reason", videoReportData.m52341h());
                        jSONObject.put("cid", videoReportData.m52348e());
                        jSONObject.put("video_url", videoReportData.m52323q());
                        jSONObject.put("rid", videoReportData.m52345f());
                        jSONObject.put("rid_n", videoReportData.m52343g());
                        jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, videoReportData.m52354c());
                        jSONObject.put("offer_url", videoReportData.m52321r());
                        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                            jSONObject.put("network_type", videoReportData.m52335k());
                            jSONObject.put("network_str", videoReportData.m52333l());
                        }
                        C22011d.m52050a().m52037a(jSONObject);
                    }
                }
            } catch (Throwable th) {
                SameLogTool.m51824b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* renamed from: f */
    public static String m51931f(List<VideoReportData> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    for (VideoReportData videoReportData : list) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("key", videoReportData.m52362a());
                        jSONObject.put("cid", videoReportData.m52348e());
                        jSONObject.put("template_url", videoReportData.m52365D());
                        jSONObject.put("reason", videoReportData.m52341h());
                        jSONObject.put("rid", videoReportData.m52345f());
                        jSONObject.put("rid_n", videoReportData.m52343g());
                        jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, videoReportData.m52354c());
                        jSONObject.put("result", videoReportData.m52331m());
                        if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                            jSONObject.put("network_type", videoReportData.m52335k());
                        }
                        C22011d.m52050a().m52037a(jSONObject);
                    }
                    return null;
                }
                return null;
            } catch (Throwable th) {
                SameLogTool.m51824b("VideoDataReport", th.getMessage());
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m51936b(VideoReportData videoReportData) {
        if (videoReportData != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", videoReportData.m52362a());
                jSONObject.put("error", SameTool.m51761a(videoReportData.m52364E()));
                jSONObject.put("template_url", SameTool.m51761a(videoReportData.m52365D()));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, SameTool.m51761a(videoReportData.m52354c()));
                jSONObject.put("cid", SameTool.m51761a(videoReportData.m52348e()));
                if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_str", videoReportData.m52333l());
                    jSONObject.put("network_type", videoReportData.m52335k());
                }
                C22011d.m52050a().m52037a(jSONObject);
            } catch (Exception e) {
                SameLogTool.m51824b("VideoDataReport", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static String m51938a(VideoReportData videoReportData) {
        if (videoReportData != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", videoReportData.m52362a());
                jSONObject.put("event", SameTool.m51761a(videoReportData.m52313v()));
                jSONObject.put("template", SameTool.m51761a(videoReportData.m52311w()));
                jSONObject.put("layout", SameTool.m51761a(videoReportData.m52310x()));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, SameTool.m51761a(videoReportData.m52354c()));
                jSONObject.put("cid", SameTool.m51761a(videoReportData.m52348e()));
                if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_str", videoReportData.m52333l());
                    jSONObject.put("network_type", videoReportData.m52335k());
                }
                return jSONObject.toString();
            } catch (Exception e) {
                SameLogTool.m51824b("VideoDataReport", e.getMessage());
                return "";
            }
        }
        return "";
    }
}
