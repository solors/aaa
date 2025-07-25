package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.CommonClickControl;
import com.mbridge.msdk.click.CommonClickUtil;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p434db.CommonSDKDBHelper;
import com.mbridge.msdk.foundation.p434db.FrequenceDao;
import com.mbridge.msdk.foundation.same.p436a.StaticDataPoll;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.mbsignalcommon.base.JsCommonParams;
import com.mbridge.msdk.mbsignalcommon.communication.CommonSignalCommunicatioImpUtils;
import com.mbridge.msdk.mbsignalcommon.windvane.CallMethodContext;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneCallJs;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p411c.SettingManager;
import com.mbridge.msdk.p411c.UnitSetting;
import com.mbridge.msdk.splash.p502a.C22753b;
import com.mbridge.msdk.splash.p506d.SplashBridgeListener;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.splash.signal.a */
/* loaded from: classes6.dex */
public class BaseSplashSignalCommunicationImpl implements InterfaceC22796b {

    /* renamed from: b */
    private WeakReference<Context> f59487b;

    /* renamed from: c */
    private List<CampaignEx> f59488c;

    /* renamed from: d */
    private String f59489d;

    /* renamed from: e */
    private String f59490e;

    /* renamed from: f */
    private int f59491f;

    /* renamed from: g */
    private int f59492g;

    /* renamed from: i */
    private int f59494i;

    /* renamed from: j */
    private SplashBridgeListener f59495j;

    /* renamed from: k */
    private SplashExpandDialog f59496k;

    /* renamed from: a */
    protected String f59486a = "SplashSignalCommunicationImpl";

    /* renamed from: h */
    private int f59493h = 5;

    public BaseSplashSignalCommunicationImpl(Context context, String str, String str2) {
        this.f59490e = str;
        this.f59489d = str2;
        this.f59487b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void m49705a(Context context) {
        this.f59487b = new WeakReference<>(context);
    }

    /* renamed from: b */
    public final void m49700b(int i) {
        this.f59493h = i;
    }

    /* renamed from: c */
    public final void m49698c(int i) {
        this.f59494i = i;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.IMraidSignalCommunication
    public void close() {
        SameLogTool.m51824b(this.f59486a, "close");
        try {
            SplashBridgeListener splashBridgeListener = this.f59495j;
            if (splashBridgeListener != null) {
                splashBridgeListener.mo49800a();
            }
        } catch (Throwable th) {
            SameLogTool.m51823b(this.f59486a, "close", th);
        }
    }

    /* renamed from: d */
    public final void m49696d(Object obj, String str) {
        CampaignEx campaignEx;
        SameLogTool.m51824b(this.f59486a, "install");
        try {
            List<CampaignEx> list = this.f59488c;
            if (list == null) {
                return;
            }
            if (list != null && list.size() > 0) {
                campaignEx = this.f59488c.get(0);
            } else {
                campaignEx = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject campaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        campaignToJsonObject.put(next, jSONObject.getString(next));
                    }
                    CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(campaignToJsonObject);
                    String optString = campaignToJsonObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                    if (!TextUtils.isEmpty(optString)) {
                        parseCampaignWithBackData.setCampaignUnitId(optString);
                    }
                    campaignEx = parseCampaignWithBackData;
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                SplashBridgeListener splashBridgeListener = this.f59495j;
                if (splashBridgeListener != null) {
                    splashBridgeListener.mo49797a(campaignEx);
                }
            }
        } catch (Throwable th) {
            SameLogTool.m51823b(this.f59486a, "click", th);
        }
    }

    /* renamed from: e */
    public final void m49695e(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        String str2 = this.f59486a;
        SameLogTool.m51824b(str2, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            CommonSignalCommunicatioImpUtils.m51105a(obj, "params is null");
            return;
        }
        Context m52792c = MBSDKContext.m52746m().m52792c();
        if (!TextUtils.isEmpty(str)) {
            if (m52792c == null) {
                try {
                    if ((obj instanceof CallMethodContext) && (windVaneWebView = ((CallMethodContext) obj).f57740b) != null) {
                        m52792c = windVaneWebView.getContext();
                    }
                } catch (Exception e) {
                    SameLogTool.m51824b(this.f59486a, e.getMessage());
                }
            }
            if (m52792c == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    CommonClickUtil.m53164d(m52792c, optString);
                } else if (optInt == 2) {
                    CommonClickUtil.m53162f(m52792c, optString);
                }
            } catch (JSONException e2) {
                SameLogTool.m51824b(this.f59486a, e2.getMessage());
            } catch (Throwable th) {
                SameLogTool.m51824b(this.f59486a, th.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.IMraidSignalCommunication
    public void expand(String str, boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z);
            WeakReference<Context> weakReference = this.f59487b;
            if (weakReference != null && weakReference.get() != null) {
                SplashExpandDialog splashExpandDialog = this.f59496k;
                if (splashExpandDialog != null && splashExpandDialog.isShowing()) {
                    return;
                }
                SplashExpandDialog splashExpandDialog2 = new SplashExpandDialog(this.f59487b.get(), bundle, this.f59495j);
                this.f59496k = splashExpandDialog2;
                splashExpandDialog2.setCampaignList(this.f59489d, this.f59488c);
                this.f59496k.show();
                SplashBridgeListener splashBridgeListener = this.f59495j;
                if (splashBridgeListener != null) {
                    splashBridgeListener.mo49795a(true);
                }
                String str2 = this.f59489d;
                CampaignEx mraidCampaign = getMraidCampaign();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (mraidCampaign.isBidCampaign()) {
                        jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
                    }
                    jSONObject.put("key", "2000070");
                    jSONObject.put("rid_n", mraidCampaign.getRequestIdNotice());
                    jSONObject.put("rid", mraidCampaign.getRequestId());
                    jSONObject.put("cid", mraidCampaign.getId());
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    jSONObject.put("click_url", str);
                    jSONObject.put("network_type", String.valueOf(SameDiTool.m51876m(MBSDKContext.m52746m().m52792c())));
                    C22011d.m52050a().m52037a(jSONObject);
                } catch (Exception e) {
                    SameLogTool.m51824b("SplashReport", e.getMessage());
                }
            }
        } catch (Throwable th) {
            SameLogTool.m51823b(this.f59486a, "expand", th);
        }
    }

    /* renamed from: f */
    public final void m49694f(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                int i = new JSONObject(str).getInt("countdown");
                SplashBridgeListener splashBridgeListener = this.f59495j;
                if (splashBridgeListener != null) {
                    splashBridgeListener.mo49793b(i);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public final void m49693g(Object obj, String str) {
        String str2 = this.f59486a;
        SameLogTool.m51827a(str2, "sendImpressions:" + str);
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                final ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    for (CampaignEx campaignEx : this.f59488c) {
                        if (campaignEx.getId().equals(string)) {
                            StaticDataPoll.m52302a(this.f59489d, campaignEx, "splash");
                            arrayList.add(string);
                        }
                    }
                }
                new Thread(new Runnable() { // from class: com.mbridge.msdk.splash.signal.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            FrequenceDao m52576a = FrequenceDao.m52576a(CommonSDKDBHelper.m52593a(MBSDKContext.m52746m().m52792c()));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                m52576a.m52574a((String) it.next());
                            }
                        } catch (Exception unused) {
                            SameLogTool.m51824b(BaseSplashSignalCommunicationImpl.this.f59486a, "campain can't insert db");
                        }
                    }
                }).start();
            }
        } catch (Throwable th) {
            SameLogTool.m51823b(this.f59486a, "sendImpressions", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.IMraidSignalCommunication
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f59488c;
        if (list != null && list.size() > 0) {
            return this.f59488c.get(0);
        }
        return null;
    }

    /* renamed from: h */
    public final void m49692h(Object obj, String str) {
        boolean z;
        boolean z2;
        SameLogTool.m51827a(this.f59486a, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            CommonSignalCommunicatioImpUtils.m51105a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int optInt = jSONObject.optInt("type");
                    String m51755a = SameTool.m51755a(jSONObject.optString("url"), "&tun=", SameDiTool.m51869q() + "");
                    int optInt2 = jSONObject.optInt("report");
                    CampaignEx campaignEx = null;
                    if (optInt2 == 0) {
                        Context m52792c = MBSDKContext.m52746m().m52792c();
                        List<CampaignEx> list = this.f59488c;
                        if (list != null) {
                            campaignEx = list.get(0);
                        }
                        CampaignEx campaignEx2 = campaignEx;
                        if (optInt != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        CommonClickControl.m53242a(m52792c, campaignEx2, "", m51755a, false, z2);
                    } else {
                        Context m52792c2 = MBSDKContext.m52746m().m52792c();
                        List<CampaignEx> list2 = this.f59488c;
                        if (list2 != null) {
                            campaignEx = list2.get(0);
                        }
                        CampaignEx campaignEx3 = campaignEx;
                        if (optInt != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        CommonClickControl.m53241a(m52792c2, campaignEx3, "", m51755a, false, z, optInt2);
                    }
                }
                WindVaneCallJs.m51063a().m51060a(obj, SplashSignalUtils.m49687a(0));
            } catch (Throwable th) {
                SameLogTool.m51823b(this.f59486a, "reportUrls", th);
            }
        }
    }

    /* renamed from: i */
    public final void m49691i(Object obj, String str) {
        try {
            if (obj instanceof CallMethodContext) {
                WindVaneCallJs.m51063a().m51062a(((CallMethodContext) obj).f57740b);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b(this.f59486a, "onJSBridgeConnect", th);
        }
    }

    /* renamed from: j */
    public final void m49690j(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C26559a.f69635d, 0);
            jSONObject.put("message", "Call pause count down success.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("countdown", this.f59494i);
            jSONObject.put("data", jSONObject2);
            WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            SameLogTool.m51824b(this.f59486a, e.getMessage());
        }
        SplashBridgeListener splashBridgeListener = this.f59495j;
        if (splashBridgeListener != null) {
            splashBridgeListener.mo49798a(1, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m49689k(java.lang.Object r3, java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L2c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L22
            r0.<init>(r4)     // Catch: java.lang.Exception -> L22
            java.lang.String r4 = "countdown"
            int r4 = r0.optInt(r4)     // Catch: java.lang.Exception -> L22
            com.mbridge.msdk.mbsignalcommon.windvane.g r0 = com.mbridge.msdk.mbsignalcommon.windvane.WindVaneCallJs.m51063a()     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = com.mbridge.msdk.splash.signal.SplashSignalUtils.m49687a(r1)     // Catch: java.lang.Exception -> L1f
            r0.m51060a(r3, r1)     // Catch: java.lang.Exception -> L1f
            r1 = r4
            goto L2c
        L1f:
            r3 = move-exception
            r1 = r4
            goto L23
        L22:
            r3 = move-exception
        L23:
            java.lang.String r4 = r2.f59486a
            java.lang.String r3 = r3.getMessage()
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r4, r3)
        L2c:
            com.mbridge.msdk.splash.d.a r3 = r2.f59495j
            if (r3 == 0) goto L34
            r4 = 2
            r3.mo49798a(r4, r1)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.signal.BaseSplashSignalCommunicationImpl.m49689k(java.lang.Object, java.lang.String):void");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.IMraidSignalCommunication
    public void open(String str) {
        SplashBridgeListener splashBridgeListener = this.f59495j;
        if (splashBridgeListener != null) {
            splashBridgeListener.mo49794a(true, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.IMraidSignalCommunication
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.IMraidSignalCommunication
    public void useCustomClose(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        try {
            SplashBridgeListener splashBridgeListener = this.f59495j;
            if (splashBridgeListener != null) {
                splashBridgeListener.mo49799a(i);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b(this.f59486a, "useCustomClose", th);
        }
    }

    /* renamed from: a */
    public final void m49706a(int i) {
        this.f59492g = i;
    }

    /* renamed from: b */
    public final List<CampaignEx> m49701b() {
        return this.f59488c;
    }

    /* renamed from: c */
    public final void m49697c(Object obj, String str) {
        SplashBridgeListener splashBridgeListener = this.f59495j;
        if (splashBridgeListener != null) {
            splashBridgeListener.mo49796a(obj, str);
        }
    }

    /* renamed from: a */
    public final void m49704a(SplashBridgeListener splashBridgeListener) {
        if (splashBridgeListener != null) {
            this.f59495j = splashBridgeListener;
        }
    }

    /* renamed from: b */
    public final void m49699b(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt("state");
            SplashBridgeListener splashBridgeListener = this.f59495j;
            if (splashBridgeListener != null) {
                splashBridgeListener.mo49799a(optInt);
            }
        } catch (Throwable th) {
            SameLogTool.m51823b(this.f59486a, "toggleCloseBtn", th);
        }
    }

    /* renamed from: a */
    public final SplashBridgeListener m49707a() {
        return this.f59495j;
    }

    /* renamed from: a */
    public final void m49702a(List<CampaignEx> list) {
        this.f59488c = list;
    }

    /* renamed from: a */
    public final void m49703a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            C22753b c22753b = new C22753b(MBSDKContext.m52746m().m52792c());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f59491f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", c22753b.m49951a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f59488c));
            UnitSetting m53274d = SettingManager.m53286a().m53274d(MBSDKContext.m52746m().m52779k(), this.f59489d);
            if (m53274d == null) {
                m53274d = UnitSetting.m53251d(this.f59489d);
            }
            if (!TextUtils.isEmpty(this.f59490e)) {
                m53274d.m53346a(this.f59490e);
            }
            m53274d.m53341b(this.f59489d);
            m53274d.m53330g(this.f59493h);
            m53274d.m53342b(this.f59492g);
            jSONObject.put("unitSetting", m53274d.m53304x());
            String m53269g = SettingManager.m53286a().m53269g(MBSDKContext.m52746m().m52779k());
            if (!TextUtils.isEmpty(m53269g)) {
                jSONObject.put("appSetting", new JSONObject(m53269g));
            }
            jSONObject.put("sdk_info", JsCommonParams.f57628a);
            String str2 = this.f59486a;
            SameLogTool.m51824b(str2, "init" + jSONObject.toString());
            WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            SameLogTool.m51823b(this.f59486a, "init", th);
        }
    }
}
