package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.ironsource.C21114v8;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.BaseMBSDKContext;
import com.mbridge.msdk.foundation.controller.authoritycontroller.SDKAuthorityController;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.entity.e */
/* loaded from: classes6.dex */
public final class ClickTime {

    /* renamed from: a */
    private String f56314a;

    /* renamed from: b */
    private String f56315b;

    /* renamed from: c */
    private String f56316c;

    /* renamed from: d */
    private int f56317d;

    /* renamed from: e */
    private int f56318e;

    /* renamed from: f */
    private String f56319f;

    /* renamed from: g */
    private String f56320g;

    /* renamed from: h */
    private String f56321h;

    /* renamed from: i */
    private int f56322i;

    /* renamed from: j */
    private String f56323j;

    /* renamed from: k */
    private int f56324k;

    /* renamed from: l */
    private String f56325l;

    /* renamed from: m */
    private int f56326m;

    /* renamed from: n */
    private String f56327n;

    /* renamed from: o */
    private String f56328o;

    /* renamed from: p */
    private int f56329p;

    /* renamed from: q */
    private String f56330q;

    /* renamed from: a */
    public final void m52490a(String str) {
        this.f56330q = str;
    }

    /* renamed from: b */
    public final void m52487b(String str) {
        this.f56327n = str;
    }

    /* renamed from: c */
    public final void m52485c(String str) {
        this.f56325l = str;
    }

    /* renamed from: d */
    public final void m52483d(String str) {
        this.f56320g = str;
    }

    /* renamed from: e */
    public final void m52482e(int i) {
        this.f56324k = i;
    }

    /* renamed from: f */
    public final void m52479f(String str) {
        this.f56321h = str;
    }

    /* renamed from: g */
    public final void m52478g(String str) {
        this.f56319f = str;
    }

    /* renamed from: h */
    public final void m52477h(String str) {
        this.f56323j = str;
    }

    /* renamed from: i */
    public final void m52476i(String str) {
        this.f56315b = str;
    }

    /* renamed from: j */
    public final void m52475j(String str) {
        this.f56314a = str;
    }

    /* renamed from: k */
    public final void m52474k(String str) {
        this.f56328o = str;
    }

    public final String toString() {
        return "ClickTime [campaignId=" + this.f56314a + ", click_duration=" + this.f56315b + ", lastUrl=" + this.f56323j + ", code=" + this.f56318e + ", excepiton=" + this.f56320g + ", header=" + this.f56321h + ", content=" + this.f56319f + ", type=" + this.f56329p + ", click_type=" + this.f56317d + C21114v8.C21123i.f54139e;
    }

    /* renamed from: a */
    public final void m52492a(int i) {
        this.f56326m = i;
    }

    /* renamed from: b */
    public final void m52488b(int i) {
        this.f56317d = i;
    }

    /* renamed from: c */
    public final void m52486c(int i) {
        this.f56329p = i;
    }

    /* renamed from: d */
    public final void m52484d(int i) {
        this.f56322i = i;
    }

    /* renamed from: e */
    public final void m52481e(String str) {
        this.f56316c = str;
    }

    /* renamed from: f */
    public final void m52480f(int i) {
        this.f56318e = i;
    }

    /* renamed from: a */
    public static ArrayList<JSONObject> m52489a(List<ClickTime> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (ClickTime clickTime : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rid", clickTime.f56327n);
                jSONObject.put("rid_n", clickTime.f56328o);
                jSONObject.put("cid", clickTime.f56314a);
                jSONObject.put("click_type", clickTime.f56317d);
                jSONObject.put("type", clickTime.f56329p);
                jSONObject.put("click_duration", clickTime.f56315b);
                jSONObject.put("key", "2000013");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, clickTime.f56330q);
                jSONObject.put("last_url", clickTime.f56323j);
                jSONObject.put("content", clickTime.f56319f);
                jSONObject.put(C26559a.f69635d, clickTime.f56318e);
                jSONObject.put("exception", clickTime.f56320g);
                jSONObject.put("header", clickTime.f56321h);
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, clickTime.f56322i);
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, clickTime.f56324k);
                jSONObject.put("click_time", clickTime.f56316c);
                if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", clickTime.f56326m);
                    jSONObject.put("network_str", clickTime.f56325l);
                }
                String str = clickTime.f56330q;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = BaseMBSDKContext.f56090b.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put("u_stid", str2);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th) {
                SameLogTool.m51824b("ClickTime", th.getMessage());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static JSONObject m52491a(ClickTime clickTime) {
        if (clickTime != null) {
            String str = clickTime.f56323j;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rid", clickTime.f56327n);
                jSONObject.put("rid_n", clickTime.f56328o);
                jSONObject.put("click_type", clickTime.f56317d);
                jSONObject.put("type", clickTime.f56329p);
                jSONObject.put("cid", clickTime.f56314a);
                jSONObject.put("click_duration", clickTime.f56315b);
                jSONObject.put("key", "2000012");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, clickTime.f56330q);
                jSONObject.put("last_url", str);
                jSONObject.put(C26559a.f69635d, clickTime.f56318e);
                jSONObject.put("exception", clickTime.f56320g);
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, clickTime.f56322i);
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, clickTime.f56324k);
                jSONObject.put("click_time", clickTime.f56316c);
                if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", clickTime.f56326m);
                    jSONObject.put("network_str", clickTime.f56325l);
                }
                return jSONObject;
            } catch (Throwable th) {
                SameLogTool.m51824b("ClickTime", th.getMessage());
                return null;
            }
        }
        return null;
    }
}
