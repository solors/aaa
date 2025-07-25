package com.mbridge.msdk.foundation.same.report.p452d;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p431c.MBFailureReason;
import com.mbridge.msdk.foundation.same.net.p447e.RequestUrlUtil;
import com.mbridge.msdk.foundation.tools.UriUtil;
import com.mbridge.msdk.p411c.MBDNSManager;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.p411c.SettingManager;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.foundation.same.report.d.c */
/* loaded from: classes6.dex */
public final class MetricsData implements Serializable, Cloneable {

    /* renamed from: A */
    private int f56752A;

    /* renamed from: B */
    private CampaignEx f56753B;

    /* renamed from: C */
    private CopyOnWriteArrayList<CampaignEx> f56754C;

    /* renamed from: a */
    private boolean f56755a;

    /* renamed from: b */
    private Map<String, Map<String, String>> f56756b;

    /* renamed from: c */
    private Map<String, Map<String, String>> f56757c;

    /* renamed from: d */
    private Map<String, Long> f56758d;

    /* renamed from: e */
    private MBFailureReason f56759e;

    /* renamed from: f */
    private String f56760f;

    /* renamed from: g */
    private CopyOnWriteArrayList<CampaignEx> f56761g;

    /* renamed from: h */
    private String f56762h;

    /* renamed from: i */
    private int f56763i;

    /* renamed from: j */
    private String f56764j;

    /* renamed from: k */
    private String f56765k;

    /* renamed from: l */
    private String f56766l;

    /* renamed from: m */
    private String f56767m;

    /* renamed from: n */
    private String f56768n;

    /* renamed from: o */
    private String f56769o;

    /* renamed from: p */
    private String f56770p;

    /* renamed from: q */
    private String f56771q;

    /* renamed from: r */
    private int f56772r;

    /* renamed from: s */
    private int f56773s;

    /* renamed from: t */
    private boolean f56774t;

    /* renamed from: u */
    private boolean f56775u;

    /* renamed from: v */
    private boolean f56776v;

    /* renamed from: w */
    private boolean f56777w;

    /* renamed from: x */
    private int f56778x;

    /* renamed from: y */
    private int f56779y;

    /* renamed from: z */
    private int f56780z;

    public MetricsData() {
        this.f56755a = false;
        this.f56756b = new HashMap();
        this.f56757c = new HashMap();
        this.f56758d = new HashMap();
        this.f56760f = "";
        this.f56761g = new CopyOnWriteArrayList<>();
        this.f56772r = -1;
        this.f56774t = false;
        this.f56776v = false;
        this.f56754C = new CopyOnWriteArrayList<>();
    }

    /* renamed from: a */
    public final boolean m52101a() {
        return this.f56755a;
    }

    /* renamed from: b */
    public final int m52092b() {
        return this.f56772r;
    }

    /* renamed from: c */
    public final String m52087c() {
        return this.f56771q;
    }

    @NonNull
    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: d */
    public final String m52083d() {
        return this.f56770p;
    }

    /* renamed from: e */
    public final List<CampaignEx> m52079e() {
        return this.f56761g;
    }

    /* renamed from: f */
    public final String m52076f() {
        return this.f56760f;
    }

    /* renamed from: g */
    public final CampaignEx m52073g() {
        return this.f56753B;
    }

    /* renamed from: h */
    public final List<CampaignEx> m52070h() {
        return this.f56754C;
    }

    /* renamed from: i */
    public final String m52068i() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f56762h)) {
            return this.f56762h;
        }
        try {
            if (TextUtils.isEmpty(this.f56762h)) {
                String str = this.f56760f + this.f56771q;
                Map<String, Map<String, String>> map2 = this.f56756b;
                if (map2 != null && map2.containsKey(str) && (map = this.f56756b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f56762h = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return this.f56762h;
    }

    /* renamed from: j */
    public final int m52066j() {
        return this.f56763i;
    }

    /* renamed from: k */
    public final String m52064k() {
        return this.f56765k;
    }

    /* renamed from: l */
    public final String m52062l() {
        return this.f56766l;
    }

    /* renamed from: m */
    public final String m52060m() {
        return this.f56768n;
    }

    /* renamed from: n */
    public final int m52058n() {
        return this.f56773s;
    }

    /* renamed from: o */
    public final MBFailureReason m52056o() {
        return this.f56759e;
    }

    /* renamed from: p */
    public final Map<String, Map<String, String>> m52055p() {
        return this.f56756b;
    }

    /* renamed from: q */
    public final Map<String, Map<String, String>> m52054q() {
        return this.f56757c;
    }

    /* renamed from: r */
    public final boolean m52053r() {
        return this.f56775u;
    }

    /* renamed from: s */
    public final boolean m52052s() {
        return this.f56776v;
    }

    /* renamed from: t */
    public final String m52051t() {
        return this.f56767m;
    }

    /* renamed from: a */
    public final void m52093a(boolean z) {
        this.f56774t = z;
    }

    /* renamed from: b */
    public final void m52090b(String str) {
        this.f56770p = str;
    }

    /* renamed from: c */
    public final void m52085c(String str) {
        this.f56760f = str;
    }

    /* renamed from: d */
    public final void m52081d(String str) {
        this.f56762h = str;
    }

    /* renamed from: e */
    public final void m52077e(String str) {
        this.f56764j = str;
    }

    /* renamed from: f */
    public final void m52074f(String str) {
        this.f56765k = str;
    }

    /* renamed from: g */
    public final void m52071g(String str) {
        this.f56766l = str;
    }

    /* renamed from: h */
    public final void m52069h(String str) {
        this.f56768n = str;
    }

    /* renamed from: j */
    public final Map<String, String> m52065j(String str) {
        int m53499I;
        MBFailureReason mBFailureReason;
        MBFailureReason mBFailureReason2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ParameterWrapper parameterWrapper = new ParameterWrapper();
        try {
            this.f56771q = str;
            parameterWrapper.m52024a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(m52068i())) {
                parameterWrapper.m52024a(MBridgeConstans.PROPERTIES_UNIT_ID, m52068i());
            }
            int i = this.f56763i;
            if (i != 0) {
                parameterWrapper.m52024a("adtp", Integer.valueOf(i));
            }
            if (!TextUtils.isEmpty(this.f56769o)) {
                parameterWrapper.m52024a(CampaignEx.JSON_KEY_HB, this.f56769o);
            }
            if (!TextUtils.isEmpty(this.f56764j)) {
                parameterWrapper.m52024a("bid_tk", this.f56764j);
            }
            if (!TextUtils.isEmpty(str)) {
                parameterWrapper.m52024a("key", str);
            }
            if (Arrays.asList(MetricsConstant.f56740a).contains(str)) {
                parameterWrapper.m52024a("from_cache", this.f56774t ? "1" : "2");
            }
            if ("2000047".contains(str) && (mBFailureReason2 = this.f56759e) != null) {
                parameterWrapper.m52024a("type", Integer.valueOf(mBFailureReason2.m52816e()));
                parameterWrapper.m52024a("reason", mBFailureReason2.m52823b());
                if (!TextUtils.isEmpty(mBFailureReason2.m52811h())) {
                    parameterWrapper.m52024a("reason_d", mBFailureReason2.m52811h());
                    parameterWrapper.m52024a("type_d", Integer.valueOf(mBFailureReason2.m52812g()));
                }
            }
            if ("2000048".contains(str) && (mBFailureReason = this.f56759e) != null && !TextUtils.isEmpty(mBFailureReason.m52811h())) {
                parameterWrapper.m52024a("type", Integer.valueOf(mBFailureReason.m52812g()));
                parameterWrapper.m52024a("reason", mBFailureReason.m52811h());
            }
            if (this.f56763i == 296) {
                parameterWrapper.m52024a("auto_load", this.f56770p);
                parameterWrapper.m52024a("auto_refresh", Integer.valueOf(this.f56778x));
                parameterWrapper.m52024a("auto_refresh_interval", Integer.valueOf(this.f56779y));
                parameterWrapper.m52024a(FirebaseAnalytics.Param.CONTENT_TYPE, Integer.valueOf(this.f56780z));
                parameterWrapper.m52024a("temp_display_type", Integer.valueOf(this.f56752A));
            }
            if ("2000126".equals(this.f56771q)) {
                String str2 = this.f56764j;
                Setting m53284a = SettingManager.m53286a().m53284a(MBSDKContext.m52746m().m52779k());
                if (TextUtils.isEmpty(str2)) {
                    m53499I = m53284a.m53444as();
                } else {
                    m53499I = m53284a.m53499I();
                }
                String m52188a = RequestUrlUtil.m52180f().m52188a(str2, m53499I);
                String m51691a = TextUtils.isEmpty(m52188a) ? "" : UriUtil.m51691a(m52188a);
                parameterWrapper.m52024a("dns_ty", Integer.valueOf(MBDNSManager.m53297a().m53296a(m51691a)));
                parameterWrapper.m52024a("dns_hs", m51691a);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return parameterWrapper.m52027a();
    }

    /* renamed from: k */
    public final void m52063k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f56760f + str;
            Map<String, Map<String, String>> map = this.f56756b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f56756b.remove(str2);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: l */
    public final long m52061l(String str) {
        Map<String, Long> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.f56758d) == null || !map.containsKey(str)) {
                return 0L;
            }
            Long l = this.f56758d.get(str);
            return System.currentTimeMillis() - (l != null ? l.longValue() : 0L);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
                return 0L;
            }
            return 0L;
        }
    }

    /* renamed from: m */
    public final void m52059m(String str) {
        if (this.f56758d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f56758d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: n */
    public final void m52057n(String str) {
        this.f56767m = str;
    }

    /* renamed from: a */
    public final void m52100a(int i) {
        this.f56772r = i;
    }

    /* renamed from: b */
    public final void m52089b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (!this.f56754C.isEmpty()) {
                        this.f56754C.clear();
                    }
                    this.f56754C.addAll(list);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    public final void m52086c(int i) {
        this.f56773s = i;
    }

    /* renamed from: d */
    public final void m52080d(boolean z) {
        this.f56777w = z;
    }

    /* renamed from: e */
    public final void m52078e(int i) {
        this.f56779y = i;
    }

    /* renamed from: f */
    public final void m52075f(int i) {
        this.f56780z = i;
    }

    /* renamed from: g */
    public final void m52072g(int i) {
        this.f56752A = i;
    }

    /* renamed from: a */
    public final void m52097a(String str) {
        this.f56771q = str;
    }

    /* renamed from: c */
    public final void m52084c(boolean z) {
        this.f56776v = z;
    }

    /* renamed from: d */
    public final void m52082d(int i) {
        this.f56778x = i;
    }

    /* renamed from: a */
    public final void m52094a(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.f56761g.isEmpty()) {
                    this.f56761g.clear();
                }
                this.f56761g.addAll(list);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m52091b(int i) {
        this.f56763i = i;
    }

    /* renamed from: b */
    public final void m52088b(boolean z) {
        this.f56775u = z;
    }

    /* renamed from: a */
    public final void m52098a(CampaignEx campaignEx) {
        this.f56753B = campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f56754C;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                int i = 0;
                while (true) {
                    if (i >= this.f56754C.size()) {
                        break;
                    }
                    if (this.f56754C.get(i) != null && this.f56754C.get(i).getId().equals(campaignEx.getId())) {
                        this.f56754C.set(i, campaignEx);
                        break;
                    }
                    i++;
                }
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f56761g;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            for (int i2 = 0; i2 < this.f56761g.size(); i2++) {
                if (this.f56761g.get(i2) != null && this.f56761g.get(i2).getId().equals(campaignEx.getId())) {
                    this.f56761g.set(i2, campaignEx);
                    return;
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public MetricsData(boolean z) {
        this.f56755a = false;
        this.f56756b = new HashMap();
        this.f56757c = new HashMap();
        this.f56758d = new HashMap();
        this.f56760f = "";
        this.f56761g = new CopyOnWriteArrayList<>();
        this.f56772r = -1;
        this.f56774t = false;
        this.f56776v = false;
        this.f56754C = new CopyOnWriteArrayList<>();
        this.f56755a = z;
    }

    /* renamed from: i */
    public final void m52067i(String str) {
        this.f56769o = str;
    }

    /* renamed from: a */
    public final void m52096a(String str, ParameterWrapper parameterWrapper) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || parameterWrapper == null) {
            return;
        }
        try {
            String str2 = this.f56760f + str;
            Map<String, Map<String, String>> map2 = this.f56756b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f56756b.get(str2)) != null) {
                    map.putAll(parameterWrapper.m52027a());
                } else {
                    this.f56756b.put(str2, parameterWrapper.m52027a());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void m52095a(String str, ParameterWrapper parameterWrapper, int i) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || parameterWrapper == null) {
            return;
        }
        try {
            String str2 = this.f56760f + "_" + i + "_" + str;
            Map<String, Map<String, String>> map2 = this.f56757c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f56757c.get(str2)) != null) {
                    map.putAll(parameterWrapper.m52027a());
                } else {
                    this.f56757c.put(str2, parameterWrapper.m52027a());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void m52099a(MBFailureReason mBFailureReason) {
        this.f56759e = mBFailureReason;
    }
}
