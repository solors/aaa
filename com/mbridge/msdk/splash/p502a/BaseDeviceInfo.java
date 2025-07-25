package com.mbridge.msdk.splash.p502a;

import android.content.Context;
import com.amazon.device.ads.DTBAdLoader;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.controller.authoritycontroller.BaseSDKAuthorityController;
import com.mbridge.msdk.foundation.controller.authoritycontroller.SDKAuthorityController;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.BaseSameDiTool;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameTool;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.splash.a.a */
/* loaded from: classes6.dex */
public class BaseDeviceInfo {

    /* renamed from: e */
    public String f59244e;

    /* renamed from: f */
    public String f59245f;

    /* renamed from: g */
    public String f59246g;

    /* renamed from: h */
    public String f59247h;

    /* renamed from: i */
    public String f59248i;

    /* renamed from: j */
    public String f59249j;

    /* renamed from: k */
    public String f59250k;

    /* renamed from: l */
    public String f59251l;

    /* renamed from: m */
    public String f59252m;

    /* renamed from: n */
    public String f59253n;

    /* renamed from: o */
    public String f59254o;

    /* renamed from: p */
    public int f59255p;

    /* renamed from: q */
    public int f59256q;

    /* renamed from: c */
    public String f59242c = "android";

    /* renamed from: a */
    public String f59240a = SameDiTool.m51877m();

    /* renamed from: b */
    public String f59241b = SameDiTool.m51857w();

    /* renamed from: d */
    public String f59243d = BaseSameDiTool.m51654c();

    public BaseDeviceInfo(Context context) {
        int m51876m = SameDiTool.m51876m(context);
        this.f59244e = String.valueOf(m51876m);
        this.f59245f = SameDiTool.m51901a(context, m51876m);
        this.f59246g = SameDiTool.m51888g(context);
        this.f59247h = MBSDKContext.m52746m().m52796b();
        this.f59248i = MBSDKContext.m52746m().m52779k();
        this.f59249j = String.valueOf(SameTool.m51724f(context));
        this.f59250k = String.valueOf(SameTool.m51727e(context));
        this.f59252m = String.valueOf(SameTool.m51731d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f59251l = "landscape";
        } else {
            this.f59251l = "portrait";
        }
        this.f59253n = SameDiTool.m51875n();
        this.f59254o = BaseSameDiTool.m51652d();
        this.f59255p = BaseSameDiTool.m51661a();
        this.f59256q = BaseSDKAuthorityController.m52767b() ? 1 : 0;
    }

    /* renamed from: a */
    public final JSONObject m49951a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f59240a);
                jSONObject.put("system_version", this.f59241b);
                jSONObject.put("network_type", this.f59244e);
                jSONObject.put("network_type_str", this.f59245f);
                jSONObject.put("device_ua", this.f59246g);
                jSONObject.put("has_wx", SameDiTool.m51858v(MBSDKContext.m52746m().m52792c()));
                jSONObject.put("integrated_wx", SameDiTool.m51851z());
                jSONObject.put("mnc", SameDiTool.m51878l(MBSDKContext.m52746m().m52792c()));
                jSONObject.put("mcc", SameDiTool.m51880k(MBSDKContext.m52746m().m52792c()));
                jSONObject.put("adid_limit", this.f59255p);
                jSONObject.put("adid_limit_dev", this.f59256q);
            }
            jSONObject.put("plantform", this.f59242c);
            if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f59243d);
                jSONObject.put("az_aid_info", this.f59254o);
            }
            jSONObject.put(DTBAdLoader.APS_VIDEO_APP_KEY, this.f59247h);
            jSONObject.put("appId", this.f59248i);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.f59249j);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.f59250k);
            jSONObject.put("orientation", this.f59251l);
            jSONObject.put("scale", this.f59252m);
            if (SameDiTool.m51869q() != 0) {
                jSONObject.put("tun", SameDiTool.m51869q());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f59253n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e) {
            SameLogTool.m51824b("BaseDeviceInfo", e.getMessage());
        }
        return jSONObject;
    }
}
