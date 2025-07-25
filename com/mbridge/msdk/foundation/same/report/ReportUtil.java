package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C19577ad;
import com.ironsource.C20517nb;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.BaseMBSDKContext;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.controller.authoritycontroller.BaseSDKAuthorityController;
import com.mbridge.msdk.foundation.controller.authoritycontroller.SDKAuthorityController;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import com.mbridge.msdk.foundation.same.net.p448f.CommonRequestParams;
import com.mbridge.msdk.foundation.same.net.p448f.CommonRequestParamsForAdd;
import com.mbridge.msdk.foundation.same.p437b.MBridgeDir;
import com.mbridge.msdk.foundation.same.p437b.MBridgeDirManager;
import com.mbridge.msdk.foundation.same.p441f.ThreadPoolUtils;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.same.report.p452d.MetricsData;
import com.mbridge.msdk.foundation.same.report.p452d.ParameterWrapper;
import com.mbridge.msdk.foundation.tools.BaseSameDiTool;
import com.mbridge.msdk.foundation.tools.SameBase64Tool;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.foundation.tools.SameFileTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SharedPreferencesUtils;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.p411c.SettingManager;
import com.mbridge.msdk.p411c.SettingManagerDiff;
import com.mbridge.msdk.p426e.CommonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.report.i */
/* loaded from: classes6.dex */
public class ReportUtil extends DomainReport {

    /* renamed from: a */
    public static final String f56819a = "i";

    /* renamed from: a */
    public static boolean m51971a() {
        try {
            return System.currentTimeMillis() - 86400000 > ((Long) SharedPreferencesUtils.m51698a(MBSDKContext.m52746m().m52792c(), "privateAuthorityTimesTamp", 0L)).longValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public static void m51951b(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000054");
            jSONObject.put("network_type", SameDiTool.m51876m(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("reason", "");
            jSONObject.put("result", 2);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("insertStr", str2);
            }
            if (campaignEx.getAdType() == 287) {
                jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getendcard_url());
                jSONObject.put("ad_type", 3);
            } else if (campaignEx.getAdType() == 94) {
                jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getendcard_url());
                jSONObject.put("ad_type", 1);
            } else if (campaignEx.getAdType() == 296) {
                jSONObject.put("ad_type", 5);
                jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getCreativeId());
            } else if (campaignEx.getAdType() == 297) {
                jSONObject.put("ad_type", 6);
                jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getCreativeId());
            } else if (campaignEx.getAdType() == 298) {
                jSONObject.put("ad_type", 7);
                jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getCreativeId());
            } else {
                jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getendcard_url());
                jSONObject.put("ad_type", 1);
            }
            jSONObject.put("devid", BaseSameDiTool.m51654c());
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, "1");
            }
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            C22011d.m52050a().m52037a(jSONObject);
        } catch (Throwable th) {
            SameLogTool.m51824b(f56819a, th.getMessage());
        }
    }

    /* renamed from: c */
    public static void m51949c() {
        try {
            ThreadPoolUtils.m52224e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.i.1
                @Override // java.lang.Runnable
                public final void run() {
                    String[] list;
                    try {
                        String m52273a = MBridgeDirManager.m52273a(MBridgeDir.MBRIDGE_CRASH_INFO);
                        if (TextUtils.isEmpty(m52273a)) {
                            return;
                        }
                        File file = new File(m52273a);
                        if (file.exists() && file.isDirectory() && (list = file.list()) != null) {
                            for (String str : list) {
                                File file2 = new File(m52273a + RemoteSettings.FORWARD_SLASH_STRING + str);
                                if (file2.exists()) {
                                    String m51839b = SameFileTool.m51839b(file2);
                                    if (!TextUtils.isEmpty(m51839b)) {
                                        String[] split = m51839b.split("====");
                                        if (split.length > 0) {
                                            new ReportController(MBSDKContext.m52746m().m52792c()).m51975a(split[0], file2);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        SameLogTool.m51824b(ReportUtil.f56819a, th.getMessage());
                    }
                }
            });
        } catch (Throwable th) {
            SameLogTool.m51824b(f56819a, th.getMessage());
        }
    }

    /* renamed from: a */
    public static JSONObject m51956a(Campaign campaign, int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", "adtrack");
            jSONObject.put("action", str);
            jSONObject.put("label", i);
            if (campaign != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", campaign.getId());
                jSONObject2.put("title", campaign.getAppName());
                jSONObject.put("value", jSONObject2);
            } else {
                jSONObject.put("value", "");
            }
        } catch (Exception e) {
            SameLogTool.m51824b(f56819a, e.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static CommonRequestParams m51969a(Context context) {
        String str = "1";
        CommonRequestParams commonRequestParams = new CommonRequestParams();
        try {
            commonRequestParams.m52175a("platform", "1");
            commonRequestParams.m52175a("package_name", URLEncoder.encode(SameDiTool.m51890f(context)));
            if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                commonRequestParams.m52175a(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
                commonRequestParams.m52175a("brand", URLEncoder.encode(SameDiTool.m51855x()));
                commonRequestParams.m52175a("model", URLEncoder.encode(SameDiTool.m51887h()));
                if (CommonUtils.m52903a()) {
                    commonRequestParams.m52175a(C19577ad.f49047D0, "");
                } else {
                    commonRequestParams.m52175a(C19577ad.f49047D0, BaseSameDiTool.m51654c());
                }
                commonRequestParams.m52175a("mnc", SameDiTool.m51878l(context));
                commonRequestParams.m52175a("mcc", SameDiTool.m51880k(context));
                int m51876m = SameDiTool.m51876m(context);
                commonRequestParams.m52175a("network_type", m51876m + "");
                commonRequestParams.m52175a("network_str", SameDiTool.m51901a(context, m51876m));
                commonRequestParams.m52175a("language", URLEncoder.encode(SameDiTool.m51862t(context)));
                commonRequestParams.m52175a("timezone", URLEncoder.encode(SameDiTool.m51853y()));
                commonRequestParams.m52175a("ua", URLEncoder.encode(SameDiTool.m51889g()));
                commonRequestParams.m52175a("adid_limit", BaseSameDiTool.m51661a() + "");
                if (!BaseSDKAuthorityController.m52767b()) {
                    str = "0";
                }
                commonRequestParams.m52175a("adid_limit_dev", str);
            }
            commonRequestParams.m52175a("sdk_version", MBConfiguration.SDK_VERSION);
            commonRequestParams.m52175a(CommonUrlParts.APP_VERSION, URLEncoder.encode(SameDiTool.m51868q(context)));
            commonRequestParams.m52175a("orientation", URLEncoder.encode(SameDiTool.m51864s(context) + ""));
            commonRequestParams.m52175a(KeyConstants.Android.KEY_SS, SameDiTool.m51882j(context) + "x" + SameDiTool.m51886h(context));
            if (CommonUtils.m52903a()) {
                CommonRequestParamsForAdd.m52169b(commonRequestParams);
            }
            Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
            if (m53279b == null) {
                SettingManager.m53286a();
                m53279b = SettingManagerDiff.m53265a();
            }
            if (m53279b != null) {
                JSONObject m51948a = ReportUtilDiff.m51948a(context, m53279b);
                if (!TextUtils.isEmpty(m51948a.toString())) {
                    String m51602b = SameBase64Tool.m51602b(m51948a.toString());
                    if (!TextUtils.isEmpty(m51602b)) {
                        commonRequestParams.m52175a("dvi", m51602b);
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return commonRequestParams;
    }

    /* renamed from: b */
    public static void m51952b() {
        try {
            SharedPreferencesUtils.m51697b(MBSDKContext.m52746m().m52792c(), "privateAuthorityTimesTamp", Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            SameLogTool.m51824b(f56819a, th.getMessage());
        }
    }

    /* renamed from: b */
    public static void m51950b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000090");
            jSONObject.put("reason", TextUtils.isEmpty(str) ? "" : str);
            jSONObject.put("result", str);
            C22011d.m52050a().m52037a(jSONObject);
        } catch (Exception e) {
            SameLogTool.m51824b(f56819a, e.getMessage());
        }
    }

    /* renamed from: a */
    public static JSONObject m51968a(Context context, Setting setting) throws Exception {
        return ReportUtilDiff.m51948a(context, setting);
    }

    /* renamed from: a */
    public static JSONObject m51953a(String str, Map<String, Object> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", str);
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            SameLogTool.m51824b(f56819a, th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static void m51962a(Context context, String str, String str2, int i, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000076");
                jSONObject.put("network_type", SameDiTool.m51876m(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put("reason", str3);
                jSONObject.put("result", i);
                jSONObject.put("url", str);
                C22011d.m52050a().m52037a(jSONObject);
            } catch (Throwable th) {
                SameLogTool.m51824b(f56819a, th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m51963a(Context context, CampaignEx campaignEx, String str, String str2, int i, String str3, int i2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000073");
            jSONObject.put("network_type", SameDiTool.m51876m(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("reason", str3);
            jSONObject.put("result", i);
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            if (i2 != -1) {
                jSONObject.put("d_t", i2);
            }
            jSONObject.put("url", str);
            C22011d.m52050a().m52037a(jSONObject);
        } catch (Throwable th) {
            SameLogTool.m51824b(f56819a, th.getMessage());
        }
    }

    /* renamed from: a */
    public static void m51964a(Context context, CampaignEx campaignEx, String str, String str2, int i, int i2, int i3) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000075");
            jSONObject.put("network_type", SameDiTool.m51876m(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("type", i);
            jSONObject.put("adtp", campaignEx.getAdType());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("status", i2);
            if (i3 != -1) {
                jSONObject.put("d_t", i3);
            }
            jSONObject.put("url", str);
            C22011d.m52050a().m52037a(jSONObject);
        } catch (Throwable th) {
            SameLogTool.m51824b(f56819a, th.getMessage());
        }
    }

    /* renamed from: a */
    public static void m51965a(Context context, CampaignEx campaignEx, String str, String str2, int i, int i2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000074");
            jSONObject.put("network_type", SameDiTool.m51876m(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("type", i);
            jSONObject.put("adtp", campaignEx.getAdType());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            if (i2 != -1) {
                jSONObject.put("d_t", i2);
            }
            jSONObject.put("url", str);
            C22011d.m52050a().m52037a(jSONObject);
        } catch (Throwable th) {
            SameLogTool.m51824b(f56819a, th.getMessage());
        }
    }

    /* renamed from: a */
    public static void m51961a(Context context, String str, String str2, boolean z, CampaignEx campaignEx) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000047");
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = BaseMBSDKContext.f56090b.get(str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("u_stid", str3);
                }
                if (campaignEx != null) {
                    jSONObject.put("cid", campaignEx.getId());
                    jSONObject.put("adtp", campaignEx.getAdType());
                    jSONObject.put("rid", campaignEx.getRequestId());
                    jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                }
                jSONObject.put("st", System.currentTimeMillis());
                jSONObject.put("network_type", SameDiTool.m51876m(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put(CampaignEx.JSON_KEY_HB, z ? 1 : 0);
                jSONObject.put("reason", str);
                C22011d.m52050a().m52037a(jSONObject);
            } catch (Throwable th) {
                SameLogTool.m51824b(f56819a, th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m51959a(Context context, List<CampaignEx> list, String str, boolean z) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.isEmpty() || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000048");
            jSONObject.put("st", System.currentTimeMillis());
            jSONObject.put("network_type", SameDiTool.m51876m(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(CampaignEx.JSON_KEY_HB, z ? 1 : 0);
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                jSONObject.put("cid", campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx2 = list.get(i);
                if (i < list.size() - 1) {
                    sb2.append(campaignEx2.getRtinsType());
                    sb2.append(",");
                } else {
                    sb2.append(campaignEx2.getRtinsType());
                }
            }
            jSONObject.put(CampaignEx.JSON_KEY_RETARGET_TYPE, sb2.toString());
            C22011d.m52050a().m52037a(jSONObject);
        } catch (Throwable th) {
            SameLogTool.m51824b(f56819a, th.getMessage());
        }
    }

    /* renamed from: a */
    public static void m51960a(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000104");
                if (!TextUtils.isEmpty(str2)) {
                    String str7 = BaseMBSDKContext.f56090b.get(str2);
                    if (str7 == null) {
                        str7 = "";
                    }
                    jSONObject.put("u_stid", str7);
                }
                jSONObject.put("network_type", SameDiTool.m51876m(context));
                jSONObject.put("rid", str3);
                jSONObject.put("rid_n", str4);
                jSONObject.put("cid", str5);
                jSONObject.put("template_id", str6);
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put(CampaignEx.JSON_KEY_HB, z ? 1 : 0);
                jSONObject.put("reason", str);
                C22011d.m52050a().m52037a(jSONObject);
            } catch (Throwable th) {
                SameLogTool.m51824b(f56819a, th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m51966a(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", "2000054");
                    jSONObject.put("network_type", SameDiTool.m51876m(context));
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                    jSONObject.put("reason", str2);
                    jSONObject.put("result", 1);
                    jSONObject.put("devid", BaseSameDiTool.m51654c());
                    if (campaignEx != null) {
                        jSONObject.put("cid", campaignEx.getId());
                        if (campaignEx.getAdType() == 287) {
                            jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getendcard_url());
                            jSONObject.put("ad_type", 3);
                        } else if (campaignEx.getAdType() == 94) {
                            jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getendcard_url());
                            jSONObject.put("ad_type", 1);
                        } else if (campaignEx.getAdType() == 296) {
                            jSONObject.put("ad_type", 5);
                            jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getCreativeId());
                        } else if (campaignEx.getAdType() == 297) {
                            jSONObject.put("ad_type", 6);
                            jSONObject.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getCreativeId());
                            jSONObject.put(CampaignEx.JSON_KEY_AD_ZIP, campaignEx.getAdZip());
                        } else if (campaignEx.getAdType() == 298) {
                            jSONObject.put("ad_type", 7);
                            jSONObject.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getCreativeId());
                            jSONObject.put(CampaignEx.JSON_KEY_AD_ZIP, campaignEx.getAdZip());
                        } else {
                            jSONObject.put(Reporting.Key.CREATIVE, campaignEx.getendcard_url());
                            jSONObject.put("ad_type", 1);
                        }
                        jSONObject.put("devid", BaseSameDiTool.m51654c());
                        if (campaignEx.isBidCampaign()) {
                            jSONObject.put(CampaignEx.JSON_KEY_HB, "1");
                        }
                        jSONObject.put("rid", campaignEx.getRequestId());
                        jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                        jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
                    }
                    C22011d.m52050a().m52037a(jSONObject);
                }
            } catch (Throwable th) {
                SameLogTool.m51824b(f56819a, th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m51957a(CampaignEx campaignEx, String str, int i, int i2, String str2, int i3, int i4, int i5, String str3) {
        MetricsData metricsData;
        try {
            ParameterWrapper parameterWrapper = new ParameterWrapper();
            parameterWrapper.m52024a("key", URLEncoder.encode("2000094", C20517nb.f52167N));
            if (campaignEx != null) {
                parameterWrapper.m52024a("rid", URLEncoder.encode(campaignEx.getRequestId(), C20517nb.f52167N));
                parameterWrapper.m52024a("rid_n", URLEncoder.encode(campaignEx.getRequestIdNotice(), C20517nb.f52167N));
                parameterWrapper.m52024a("cid", URLEncoder.encode(campaignEx.getId(), C20517nb.f52167N));
                metricsData = C22011d.m52050a().m52039a(campaignEx.getCurrentLocalRid(), "");
            } else {
                metricsData = null;
            }
            parameterWrapper.m52024a(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str, C20517nb.f52167N));
            if (i == 0) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = "0";
                }
                parameterWrapper.m52024a("video_prg", str3 + "");
            } else {
                parameterWrapper.m52024a("video_prg", i + "");
            }
            parameterWrapper.m52024a("phase", i2 + "");
            parameterWrapper.m52024a("feedback_content", URLEncoder.encode(str2, C20517nb.f52167N));
            parameterWrapper.m52024a("feedback_close", i3 + "");
            parameterWrapper.m52024a("type", i5 + "");
            parameterWrapper.m52024a("ad_type", i4 + "");
            parameterWrapper.m52024a("network_type", URLEncoder.encode(String.valueOf(SameDiTool.m51876m(MBSDKContext.m52746m().m52792c())), C20517nb.f52167N));
            if (metricsData == null) {
                metricsData = new MetricsData();
            }
            metricsData.m52081d(str);
            metricsData.m52091b(i4);
            metricsData.m52096a("2000094", parameterWrapper);
            C22011d.m52050a().m52043a("2000094", metricsData);
        } catch (Exception e) {
            SameLogTool.m51824b(f56819a, e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m51955a(String str) {
        try {
            if (MBSDKContext.m52746m().m52792c() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000088");
            jSONObject.put("state", str);
            Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
            if (m53279b == null || DomainReport.m52147a(m53279b, jSONObject.toString())) {
                C22011d.m52050a().m52037a(jSONObject);
            }
        } catch (Throwable th) {
            SameLogTool.m51824b(f56819a, th.getMessage());
        }
    }

    /* renamed from: a */
    public static void m51967a(Context context, CampaignEx campaignEx, int i, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000114");
            jSONObject.put("network_type", SameDiTool.m51876m(context));
            jSONObject.put(DomainCampaignEx.KEY_GH_ID, TextUtils.isEmpty(campaignEx.getGhId()) ? "" : campaignEx.getGhId());
            jSONObject.put(DomainCampaignEx.KEY_GH_PATH, TextUtils.isEmpty(campaignEx.getGhPath()) ? "" : campaignEx.getGhPath());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("result", i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jSONObject.put("reason", str);
            jSONObject.put("cid", campaignEx.getId());
            C22011d.m52050a().m52037a(jSONObject);
        } catch (Throwable th) {
            SameLogTool.m51824b(f56819a, th.getMessage());
        }
    }

    /* renamed from: a */
    public static void m51970a(int i, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000080");
            jSONObject.put("ad_type", i);
            jSONObject.put("url", str);
            jSONObject.put("reason", str2);
            C22011d.m52050a().m52037a(jSONObject);
        } catch (Exception e) {
            SameLogTool.m51824b(f56819a, e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m51958a(CampaignEx campaignEx, String str, int i, int i2, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000121");
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("type", i);
            jSONObject.put("result", i2);
            jSONObject.put("reason", str2);
            C22011d.m52050a().m52037a(jSONObject);
        } catch (Exception e) {
            SameLogTool.m51824b(f56819a, e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m51954a(String str, int i, int i2, String str2, int i3, String str3) {
        try {
            ParameterWrapper parameterWrapper = new ParameterWrapper();
            parameterWrapper.m52024a("key", URLEncoder.encode("m_water_mark_result", C20517nb.f52167N));
            parameterWrapper.m52024a("water_mark_result", i2 + "");
            parameterWrapper.m52024a("water_mark_error_msg", URLEncoder.encode(str2, C20517nb.f52167N));
            parameterWrapper.m52024a("render_result", i3 + "");
            parameterWrapper.m52024a("water_mark_str", URLEncoder.encode(str3, C20517nb.f52167N));
            MetricsData metricsData = new MetricsData();
            metricsData.m52091b(i);
            metricsData.m52081d(str);
            metricsData.m52096a("m_water_mark_result", parameterWrapper);
            C22011d.m52050a().m52043a("m_water_mark_result", metricsData);
        } catch (Throwable th) {
            SameLogTool.m51824b(f56819a, th.getMessage());
        }
    }
}
