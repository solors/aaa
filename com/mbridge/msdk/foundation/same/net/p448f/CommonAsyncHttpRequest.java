package com.mbridge.msdk.foundation.same.net.p448f;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.ironsource.C21114v8;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.controller.authoritycontroller.BaseSDKAuthorityController;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p434db.p435a.ReplaceTempDaoMiddle;
import com.mbridge.msdk.foundation.same.CommonConst;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.BandWideUtil;
import com.mbridge.msdk.foundation.same.net.C21986Aa;
import com.mbridge.msdk.foundation.same.net.IListener;
import com.mbridge.msdk.foundation.same.net.p447e.RequestUrlUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.p411c.SettingManager;
import com.mbridge.msdk.p411c.UnitSetting;
import com.mbridge.msdk.p426e.CommonUtils;
import com.mbridge.msdk.tracker.network.MBridgeBaseRequest;
import com.mbridge.msdk.tracker.network.MBridgeJsonRequest;
import com.mbridge.msdk.tracker.network.MBridgeStringRequest;
import com.mbridge.msdk.tracker.network.MBridgeVolleyManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.c */
/* loaded from: classes6.dex */
public class CommonAsyncHttpRequest {
    private static final String TAG = "c";
    protected Context mContext;

    public CommonAsyncHttpRequest(Context context) {
        if (context == null) {
            this.mContext = MBSDKContext.m52746m().m52792c();
        } else {
            this.mContext = context.getApplicationContext();
        }
    }

    private String asUrlParams(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        sb2.append(C21114v8.C21123i.f54135c);
                        sb2.append(str);
                        sb2.append("=");
                        sb2.append(str2);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51824b(TAG, e.getMessage());
                }
                sb2 = null;
            }
            if (sb2 != null && sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    private static MBridgeBaseRequest<?> createRequest(int i, int i2, String str, IListener iListener, String str2, long j) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return new MBridgeJsonRequest(i2, str, str2, j, new MBridgeRequestListenerWrapper(iListener));
        }
        return new MBridgeStringRequest(i2, str, str2, j, new MBridgeRequestListenerWrapper(iListener));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00ad A[Catch: Exception -> 0x00fc, TRY_ENTER, TryCatch #1 {Exception -> 0x00fc, blocks: (B:137:0x00ad, B:139:0x00b3, B:143:0x00be, B:150:0x00e1, B:155:0x0100), top: B:195:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void post(int r14, java.lang.String r15, com.mbridge.msdk.foundation.same.net.p448f.CommonRequestParams r16, com.mbridge.msdk.foundation.same.net.IListener r17, boolean r18, boolean r19, java.lang.String r20, long r21) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p448f.CommonAsyncHttpRequest.post(int, java.lang.String, com.mbridge.msdk.foundation.same.net.f.e, com.mbridge.msdk.foundation.same.net.b, boolean, boolean, java.lang.String, long):void");
    }

    public void addExtraParams(String str, CommonRequestParams commonRequestParams) {
        if (commonRequestParams != null) {
            String m52221a = C21986Aa.m52221a();
            if (m52221a == null) {
                m52221a = "";
            }
            commonRequestParams.m52175a(AppsFlyerProperties.CHANNEL, m52221a);
            commonRequestParams.m52175a("band_width", BandWideUtil.m52216a().m52215b() + "");
            commonRequestParams.m52175a("open", CommonConst.f56450S);
            if (CommonUtils.m52903a() && !TextUtils.isEmpty(str) && str.contains("setting")) {
                String m52220b = C21986Aa.m52220b();
                if (!TextUtils.isEmpty(m52220b)) {
                    commonRequestParams.m52175a("keyword", m52220b);
                }
            }
            String str2 = commonRequestParams.m52177a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (str2 != null) {
                String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
                if (!TextUtils.isEmpty(customInfoByUnitId)) {
                    commonRequestParams.m52175a("ch_info", customInfoByUnitId);
                }
                UnitSetting m53274d = SettingManager.m53286a().m53274d(MBSDKContext.m52746m().m52779k(), str2);
                if (m53274d != null && !TextUtils.isEmpty(m53274d.m53349a())) {
                    commonRequestParams.m52175a("u_stid", m53274d.m53349a());
                }
            }
            if (!BaseSDKAuthorityController.m52776a()) {
                commonRequestParams.m52175a("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                commonRequestParams.m52175a("re_domain", "1");
                return;
            }
            return;
        }
        SameLogTool.m51824b(TAG, "addExtraParams error, params is null,frame work error");
    }

    protected boolean canTrack() {
        return true;
    }

    public void choiceV3OrV5BySetting(int i, CommonRequestParams commonRequestParams, IListener iListener, String str, long j) {
        int m53499I;
        CommonRequestParams commonRequestParams2;
        Setting m53284a = SettingManager.m53286a().m53284a(MBSDKContext.m52746m().m52779k());
        if (TextUtils.isEmpty(str)) {
            m53499I = m53284a.m53444as();
        } else {
            m53499I = m53284a.m53499I();
        }
        String m52188a = RequestUrlUtil.m52180f().m52188a(str, m53499I);
        if (m53499I < 2) {
            postV5(i, m52188a, commonRequestParams, iListener, "campaign", j);
            return;
        }
        if (m53499I % 2 == 0) {
            if (commonRequestParams == null) {
                commonRequestParams2 = new CommonRequestParams();
            } else {
                commonRequestParams2 = commonRequestParams;
            }
            JSONArray m52662b = ReplaceTempDaoMiddle.m52666a().m52662b();
            if (m52662b != null) {
                String jSONArray = m52662b.toString();
                int m52182d = RequestUrlUtil.m52180f().m52182d();
                if (m52182d > 0 && jSONArray.length() > m52182d) {
                    post(i, m52188a, commonRequestParams2, iListener, "campaign", j);
                    return;
                }
                commonRequestParams2.m52175a(CommonRequestParams.f56682h, jSONArray);
            }
        } else {
            commonRequestParams2 = commonRequestParams;
        }
        getLoadOrSetting(i, m52188a, commonRequestParams2, iListener, "campaign", j);
    }

    public void get(int i, String str, CommonRequestParams commonRequestParams, IListener iListener, String str2, long j) {
        get(i, str, commonRequestParams, iListener, false, false, str2, j);
    }

    public void getCampaign(int i, String str, CommonRequestParams commonRequestParams, IListener iListener, long j) {
        int m53499I;
        CommonRequestParams commonRequestParams2;
        try {
            Setting m53284a = SettingManager.m53286a().m53284a(MBSDKContext.m52746m().m52779k());
            if (TextUtils.isEmpty(str)) {
                m53499I = m53284a.m53444as();
            } else {
                m53499I = m53284a.m53499I();
            }
            String m52188a = RequestUrlUtil.m52180f().m52188a(str, m53499I);
            if (m53499I < 2) {
                postV5(i, m52188a, commonRequestParams, iListener, true, "campaign", j);
                return;
            }
            if (m53499I % 2 == 0) {
                if (commonRequestParams == null) {
                    commonRequestParams2 = new CommonRequestParams();
                } else {
                    commonRequestParams2 = commonRequestParams;
                }
                JSONArray m52662b = ReplaceTempDaoMiddle.m52666a().m52662b();
                if (m52662b != null) {
                    String jSONArray = m52662b.toString();
                    int m52182d = RequestUrlUtil.m52180f().m52182d();
                    if (m52182d > 0 && jSONArray.length() > m52182d) {
                        post(i, m52188a, commonRequestParams2, iListener, true, false, "campaign", j);
                        return;
                    }
                    commonRequestParams2.m52175a(CommonRequestParams.f56682h, jSONArray);
                }
            } else {
                commonRequestParams2 = commonRequestParams;
            }
            get(i, m52188a, commonRequestParams2, iListener, true, true, "campaign", j);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b(TAG, e.getMessage());
            }
        }
    }

    public void getLoadOrSetting(int i, String str, CommonRequestParams commonRequestParams, IListener iListener, String str2, long j) {
        getLoadOrSetting(i, str, commonRequestParams, iListener, true, str2, j);
    }

    public void postFocusReport(int i, String str, CommonRequestParams commonRequestParams, IListener iListener, String str2, long j) {
        post(i, str, commonRequestParams, iListener, false, true, str2, j);
    }

    public void postV5(int i, String str, CommonRequestParams commonRequestParams, IListener iListener, String str2, long j) {
        String str3 = commonRequestParams.m52177a().get("sign");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        commonRequestParams.m52175a("ts", currentTimeMillis + "");
        commonRequestParams.m52175a("st", SameMD5.getMD5(currentTimeMillis + str3));
        post(i, str, commonRequestParams, iListener, false, false, str2, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void get(int r15, java.lang.String r16, com.mbridge.msdk.foundation.same.net.p448f.CommonRequestParams r17, com.mbridge.msdk.foundation.same.net.IListener r18, boolean r19, boolean r20, java.lang.String r21, long r22) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p448f.CommonAsyncHttpRequest.get(int, java.lang.String, com.mbridge.msdk.foundation.same.net.f.e, com.mbridge.msdk.foundation.same.net.b, boolean, boolean, java.lang.String, long):void");
    }

    public void getLoadOrSetting(int i, String str, CommonRequestParams commonRequestParams, IListener iListener, boolean z, String str2, long j) {
        get(i, str, commonRequestParams, iListener, z, false, str2, j);
    }

    public void postV5(int i, String str, CommonRequestParams commonRequestParams, IListener iListener, boolean z, String str2, long j) {
        String str3 = commonRequestParams.m52177a().get("sign");
        if (str3 == null) {
            str3 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        commonRequestParams.m52175a("ts", currentTimeMillis + "");
        commonRequestParams.m52175a("st", SameMD5.getMD5(currentTimeMillis + str3));
        post(i, str, commonRequestParams, iListener, z, false, str2, j);
    }

    public void get(int i, String str, Map<String, String> map, IListener iListener, String str2, long j) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("app_id", MBSDKContext.m52746m().m52779k());
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put("platform", "1");
        String asUrlParams = asUrlParams(map);
        if (!TextUtils.isEmpty(asUrlParams)) {
            str = str + "?" + asUrlParams;
        }
        String str3 = str;
        if (MBridgeConstans.DEBUG) {
            SameLogTool.m51827a("AppletsModel", "get wx scheme url = " + str3);
        }
        MBridgeBaseRequest<?> createRequest = createRequest(i, 0, str3, iListener, str2, j);
        if (createRequest != null) {
            String str4 = map.get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            createRequest.m49412c("local_id", str4);
            String str5 = map.get("ad_type");
            createRequest.m49412c("ad_type", TextUtils.isEmpty(str5) ? "" : str5);
            createRequest.m49509a(map);
            createRequest.m49508a(canTrack());
            MBridgeVolleyManager.m49502a().m49501b().m49383a(createRequest);
        }
    }

    public void post(int i, String str, CommonRequestParams commonRequestParams, IListener iListener, String str2, long j) {
        post(i, str, commonRequestParams, iListener, false, false, str2, j);
    }
}
