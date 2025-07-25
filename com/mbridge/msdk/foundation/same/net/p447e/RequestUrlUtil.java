package com.mbridge.msdk.foundation.same.net.p447e;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.EventLibraryCommon;
import com.mbridge.msdk.foundation.same.report.EventLibraryDecorate;
import com.mbridge.msdk.foundation.same.report.SocketStack;
import com.mbridge.msdk.foundation.same.report.StringReportResponseHandler;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameOptimizedController;
import com.mbridge.msdk.p411c.BCP;
import com.mbridge.msdk.p411c.EventLibMonitorSetting;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.p411c.SettingManager;
import com.mbridge.msdk.tracker.NetworkStackConfig;
import com.mbridge.msdk.tracker.ReportMonitor;
import com.mbridge.msdk.tracker.TrackConfig;
import com.mbridge.msdk.tracker.network.toolbox.C22923h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: com.mbridge.msdk.foundation.same.net.e.d */
/* loaded from: classes6.dex */
public final class RequestUrlUtil {

    /* renamed from: A */
    public String f56615A;

    /* renamed from: B */
    public String f56616B;

    /* renamed from: C */
    public String f56617C;

    /* renamed from: D */
    public String f56618D;

    /* renamed from: E */
    public String f56619E;

    /* renamed from: F */
    public String f56620F;

    /* renamed from: G */
    public String f56621G;

    /* renamed from: H */
    public String f56622H;

    /* renamed from: I */
    public String f56623I;

    /* renamed from: J */
    public String f56624J;

    /* renamed from: K */
    public String f56625K;

    /* renamed from: L */
    public String f56626L;

    /* renamed from: M */
    public String f56627M;

    /* renamed from: N */
    public String f56628N;

    /* renamed from: O */
    public String f56629O;

    /* renamed from: P */
    private final String f56630P;

    /* renamed from: Q */
    private String f56631Q;

    /* renamed from: R */
    private String f56632R;

    /* renamed from: S */
    private String f56633S;

    /* renamed from: T */
    private String f56634T;

    /* renamed from: U */
    private String f56635U;

    /* renamed from: V */
    private String f56636V;

    /* renamed from: W */
    private String f56637W;

    /* renamed from: X */
    private String f56638X;

    /* renamed from: Y */
    private String f56639Y;

    /* renamed from: Z */
    private String f56640Z;

    /* renamed from: a */
    public String f56641a;

    /* renamed from: aa */
    private String f56642aa;

    /* renamed from: ab */
    private String f56643ab;

    /* renamed from: ac */
    private String f56644ac;

    /* renamed from: ad */
    private String f56645ad;

    /* renamed from: ae */
    private boolean f56646ae;

    /* renamed from: af */
    private int f56647af;

    /* renamed from: b */
    public String f56648b;

    /* renamed from: c */
    public String f56649c;

    /* renamed from: d */
    public String f56650d;

    /* renamed from: e */
    public String f56651e;

    /* renamed from: f */
    public String f56652f;

    /* renamed from: g */
    public String f56653g;

    /* renamed from: h */
    public String f56654h;

    /* renamed from: i */
    public String f56655i;

    /* renamed from: j */
    public String f56656j;

    /* renamed from: k */
    public String f56657k;

    /* renamed from: l */
    public String f56658l;

    /* renamed from: m */
    public int f56659m;

    /* renamed from: n */
    public int f56660n;

    /* renamed from: o */
    public int f56661o;

    /* renamed from: p */
    public int f56662p;

    /* renamed from: q */
    public boolean f56663q;

    /* renamed from: r */
    public boolean f56664r;

    /* renamed from: s */
    public int f56665s;

    /* renamed from: t */
    public ArrayList<String> f56666t;

    /* renamed from: u */
    public int f56667u;

    /* renamed from: v */
    public int f56668v;

    /* renamed from: w */
    public ArrayList<String> f56669w;

    /* renamed from: x */
    public String f56670x;

    /* renamed from: y */
    public String f56671y;

    /* renamed from: z */
    public String f56672z;

    /* compiled from: RequestUrlUtil.java */
    /* renamed from: com.mbridge.msdk.foundation.same.net.e.d$a */
    /* loaded from: classes6.dex */
    public static class C22000a {

        /* renamed from: a */
        private static final RequestUrlUtil f56673a = new RequestUrlUtil();
    }

    /* renamed from: f */
    public static RequestUrlUtil m52180f() {
        return C22000a.f56673a;
    }

    /* renamed from: a */
    public final boolean m52191a() {
        try {
            if (!this.f56664r) {
                ArrayList<String> arrayList = this.f56666t;
                if (arrayList != null && this.f56667u <= arrayList.size() - 1) {
                    this.f56654h = this.f56666t.get(this.f56667u);
                    m52186b();
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f56669w;
                if (arrayList2 != null && this.f56668v <= arrayList2.size() - 1) {
                    if (!m52185b(this.f56669w.get(this.f56668v))) {
                        this.f56658l = this.f56669w.get(this.f56668v);
                        m52184c();
                    }
                    return true;
                }
            }
            if (this.f56663q) {
                this.f56667u = 0;
                this.f56668v = 0;
            }
            return false;
        } catch (Throwable th) {
            SameLogTool.m51827a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public final void m52186b() {
        this.f56621G = this.f56654h + this.f56639Y;
        this.f56671y = this.f56654h + this.f56633S;
        this.f56623I = this.f56654h + this.f56640Z;
        this.f56617C = this.f56654h + this.f56636V;
        this.f56625K = this.f56654h + this.f56642aa;
    }

    /* renamed from: c */
    public final void m52184c() {
        this.f56622H = this.f56658l + this.f56639Y;
        this.f56672z = this.f56658l + this.f56633S;
        this.f56624J = this.f56658l + this.f56640Z;
        this.f56618D = this.f56658l + this.f56636V;
        this.f56626L = this.f56658l + this.f56642aa;
    }

    /* renamed from: d */
    public final int m52182d() {
        return this.f56647af;
    }

    /* renamed from: e */
    public final void m52181e() {
        boolean z;
        HashMap<String, String> m53498J;
        NetworkStackConfig networkStackConfig;
        Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
        if (m53279b != null) {
            BCP m53392q = m53279b.m53392q();
            if (m53392q != null) {
                this.f56657k = m53392q.m53511f();
                this.f56661o = m53392q.m53510g();
                this.f56653g = m53392q.m53512e();
                this.f56620F = this.f56653g + this.f56638X;
            }
            EventLibMonitorSetting m53502F = m53279b.m53502F();
            if (m53502F != null) {
                this.f56656j = m53502F.m53299d();
                this.f56660n = m53502F.m53298e();
                this.f56651e = m53502F.m53300c();
                this.f56619E = this.f56651e + this.f56637W;
                EventLibMonitorSetting m53502F2 = m53279b.m53502F();
                if (m53502F2 != null && m53502F2.m53303a() != 1) {
                    int m51812a = SameOptimizedController.m51814a().m51812a("monitor", "type", SameOptimizedController.m51814a().m51813a("t_r_t", 1));
                    if (m51812a != 0 && m51812a != 1) {
                        m51812a = 0;
                    }
                    TrackConfig.C22948a m49308a = new TrackConfig.C22948a().m49310a(new EventLibraryDecorate()).m49308a(new StringReportResponseHandler());
                    if (m51812a == 1) {
                        networkStackConfig = new NetworkStackConfig(new SocketStack((byte) 2), C22000a.f56673a.f56656j, C22000a.f56673a.f56660n);
                    } else {
                        networkStackConfig = new NetworkStackConfig(new C22923h(), C22000a.f56673a.f56619E, 0);
                    }
                    ReportMonitor.m49331a().m49330a(MBSDKContext.m52746m().m52792c(), m49308a.m49311a(m51812a, networkStackConfig).m49300e(SameOptimizedController.m51814a().m51813a("t_m_e_t", 604800000)).m49312a(SameOptimizedController.m51814a().m51813a("t_m_e_s", 50)).m49302d(SameOptimizedController.m51814a().m51813a("t_m_r_c", 50)).m49306b(SameOptimizedController.m51814a().m51813a("t_m_t", 15000)).m49304c(SameOptimizedController.m51814a().m51813a("t_m_r_t_s", 1)).m49313a(), m53502F2.m53301b() * 1000, EventLibraryCommon.m52112a());
                }
            }
            if (m53279b.m53446aq() == 2) {
                z = true;
            } else {
                z = false;
            }
            this.f56664r = z;
            this.f56665s = m53279b.m53446aq();
            this.f56646ae = !m53279b.m53373z(2);
            if (m53279b.m53498J() != null && m53279b.m53498J().size() > 0 && (m53498J = m53279b.m53498J()) != null && m53498J.size() > 0) {
                if (m53498J.containsKey("v") && !TextUtils.isEmpty(m53498J.get("v")) && m52185b(m53498J.get("v"))) {
                    this.f56650d = m53498J.get("v");
                    this.f56627M = this.f56650d + this.f56643ab;
                    this.f56628N = this.f56650d + this.f56644ac;
                    this.f56629O = this.f56650d + this.f56645ad;
                    this.f56615A = this.f56650d + this.f56634T;
                }
                if (m53498J.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(m53498J.get(CampaignEx.JSON_KEY_HB)) && m52185b(m53498J.get(CampaignEx.JSON_KEY_HB))) {
                    this.f56631Q = m53498J.get(CampaignEx.JSON_KEY_HB);
                    this.f56670x = this.f56631Q + this.f56632R;
                    this.f56616B = this.f56631Q + this.f56635U;
                }
                if (m53498J.containsKey("lg") && !TextUtils.isEmpty(m53498J.get("lg"))) {
                    String str = m53498J.get("lg");
                    if (m52185b(str)) {
                        this.f56649c = str;
                    } else {
                        this.f56655i = str;
                    }
                }
                if (m53498J.containsKey("lgt") && !TextUtils.isEmpty(m53498J.get("lgt"))) {
                    String str2 = m53498J.get("lgt");
                    if (m52185b(str2)) {
                        String m52183c = m52183c(str2);
                        if (!TextUtils.isEmpty(m52183c)) {
                            this.f56655i = m52183c;
                        }
                    } else {
                        this.f56655i = str2;
                    }
                }
            }
            String m53506B = m53279b.m53506B();
            if (!TextUtils.isEmpty(m53506B)) {
                this.f56654h = m53506B;
                m52186b();
                this.f56666t.add(0, m53506B);
            }
            String m53505C = m53279b.m53505C();
            if (!TextUtils.isEmpty(m53505C)) {
                this.f56658l = m53505C;
                m52184c();
                this.f56669w.add(0, m53505C);
            }
        }
    }

    private RequestUrlUtil() {
        this.f56630P = "RequestUrlUtil";
        this.f56641a = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f56648b = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f56649c = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f56650d = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f56651e = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f56652f = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f56653g = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f56654h = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f56655i = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f56656j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f56657k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f56658l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f56659m = 9377;
        this.f56660n = 9377;
        this.f56661o = 9988;
        this.f56662p = 9377;
        this.f56663q = false;
        this.f56664r = false;
        this.f56665s = 1;
        this.f56666t = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f56667u = 0;
        this.f56668v = 0;
        this.f56669w = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f56631Q = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f56632R = "/bid";
        this.f56670x = this.f56631Q + this.f56632R;
        this.f56633S = "/sdk/customid";
        this.f56671y = this.f56654h + this.f56633S;
        this.f56672z = this.f56658l + this.f56633S;
        this.f56634T = "/image";
        this.f56615A = this.f56650d + this.f56634T;
        this.f56635U = "/load";
        this.f56616B = this.f56631Q + this.f56635U;
        this.f56636V = "/mapping";
        this.f56617C = this.f56654h + this.f56636V;
        this.f56618D = this.f56658l + this.f56636V;
        this.f56637W = "";
        this.f56619E = this.f56653g + this.f56637W;
        this.f56638X = "/batchPaidEvent";
        this.f56620F = this.f56653g + this.f56638X;
        this.f56639Y = "/setting";
        this.f56621G = this.f56654h + this.f56639Y;
        this.f56622H = this.f56658l + this.f56639Y;
        this.f56640Z = "/rewardsetting";
        this.f56623I = this.f56654h + this.f56640Z;
        this.f56624J = this.f56658l + this.f56640Z;
        this.f56642aa = "/appwall/setting";
        this.f56625K = this.f56654h + this.f56642aa;
        this.f56626L = this.f56658l + this.f56642aa;
        this.f56643ab = "/openapi/ad/v3";
        this.f56627M = this.f56650d + this.f56643ab;
        this.f56644ac = "/openapi/ad/v4";
        this.f56628N = this.f56650d + this.f56644ac;
        this.f56645ad = "/openapi/ad/v5";
        this.f56629O = this.f56650d + this.f56645ad;
        this.f56646ae = true;
        this.f56647af = 0;
    }

    /* renamed from: b */
    private boolean m52185b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    /* renamed from: c */
    private String m52183c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th) {
            SameLogTool.m51824b("RequestUrlUtil", th.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public final String m52188a(String str, int i) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length > 1) {
                    return m52187a(true, split[1]);
                }
                return m52187a(true, "");
            }
        } catch (Exception e) {
            SameLogTool.m51824b("RequestUrlUtil", e.getMessage());
        }
        return i % 2 == 0 ? this.f56629O : this.f56627M;
    }

    /* renamed from: a */
    public final String m52187a(boolean z, String str) {
        if (z) {
            if (this.f56616B.contains(JsonUtils.EMPTY_JSON) && !TextUtils.isEmpty(str)) {
                String str2 = this.f56616B;
                return str2.replace(JsonUtils.EMPTY_JSON, str + "-");
            }
            return this.f56616B.replace(JsonUtils.EMPTY_JSON, "");
        }
        return this.f56670x.replace(JsonUtils.EMPTY_JSON, "");
    }

    /* renamed from: a */
    public final void m52190a(int i) {
        this.f56647af = i;
    }

    /* renamed from: a */
    public final String m52189a(String str) {
        return C22000a.f56673a.m52188a(str, 1);
    }
}
