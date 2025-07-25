package p1068z4;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p028b5.BridgeManager;
import p650e5.AdValueData;
import p650e5.DeviceCategoryData;
import p650e5.DeviceResolutionData;
import p665f5.AdValueTag;
import p665f5.DeviceCategoryTag;
import p665f5.DeviceResolutionTag;
import p738j5.C37291b;
import p738j5.DataProcessUtils;

/* renamed from: z4.d */
/* loaded from: classes6.dex */
public class UserTagData {

    /* renamed from: a */
    private C45120a f118693a;

    /* renamed from: b */
    private C45121b f118694b;

    /* renamed from: c */
    private C45122c f118695c;

    /* compiled from: UserTagData.java */
    /* renamed from: z4.d$a */
    /* loaded from: classes6.dex */
    public static class C45120a {

        /* renamed from: a */
        private String f118696a;

        /* renamed from: b */
        private String f118697b;

        /* renamed from: c */
        private AdValueData f118698c;

        /* renamed from: d */
        private DeviceResolutionData f118699d;

        /* renamed from: e */
        private DeviceCategoryData f118700e;

        /* renamed from: f */
        private double f118701f;

        /* renamed from: g */
        private String f118702g;

        /* renamed from: h */
        private long f118703h;

        /* renamed from: i */
        private String f118704i;

        /* renamed from: j */
        private String f118705j;

        /* renamed from: k */
        private String f118706k;

        /* renamed from: l */
        private String f118707l;

        /* renamed from: m */
        private String f118708m;

        /* renamed from: n */
        private String f118709n;

        /* renamed from: o */
        private String f118710o;

        /* renamed from: p */
        private String f118711p;

        /* renamed from: q */
        private double f118712q;

        /* renamed from: r */
        private Map<String, String> f118713r;

        /* renamed from: s */
        private Map<String, String> f118714s;

        /* renamed from: t */
        private Map<String, String> f118715t;

        /* renamed from: A */
        public void m820A(String str) {
            this.f118707l = str;
        }

        /* renamed from: B */
        public void m819B(String str) {
            this.f118709n = str;
        }

        /* renamed from: C */
        public void m818C(String str) {
            this.f118710o = str;
        }

        /* renamed from: D */
        public void m817D(String str) {
            this.f118696a = str;
        }

        /* renamed from: E */
        public void m816E(DeviceCategoryData deviceCategoryData) {
            this.f118700e = deviceCategoryData;
        }

        /* renamed from: F */
        public void m815F(String str) {
            this.f118697b = str;
        }

        /* renamed from: G */
        public void m814G(double d) {
            this.f118701f = d;
        }

        /* renamed from: H */
        public void m813H(DeviceResolutionData deviceResolutionData) {
            this.f118699d = deviceResolutionData;
        }

        /* renamed from: I */
        public void m812I(double d) {
            this.f118712q = d;
        }

        /* renamed from: J */
        public void m811J(String str) {
            this.f118702g = str;
        }

        /* renamed from: K */
        public void m810K(long j) {
            this.f118703h = j;
        }

        /* renamed from: L */
        public void m809L(String str) {
            this.f118708m = str;
        }

        /* renamed from: M */
        public void m808M(String str) {
            this.f118704i = str;
        }

        /* renamed from: N */
        public void m807N(String str) {
            this.f118705j = str;
        }

        /* renamed from: O */
        public void m806O(String str) {
            this.f118706k = str;
        }

        /* renamed from: a */
        public AdValueData m805a() {
            if (this.f118698c == null) {
                this.f118698c = new AdValueData(AdValueTag.UNSET);
            }
            return this.f118698c;
        }

        /* renamed from: b */
        public String m804b() {
            return DataProcessUtils.m18552e(this.f118711p);
        }

        /* renamed from: c */
        Map<String, String> m803c() {
            HashMap hashMap = new HashMap();
            hashMap.put("country", m799g());
            hashMap.put("device_language", m797i());
            hashMap.put("app_version", m802d());
            hashMap.put("device_ram", String.valueOf(m796j()));
            hashMap.put("media_source", m788r());
            hashMap.put("campaign_name", m800f());
            hashMap.put("campaign_id", m801e());
            hashMap.put("agency", m804b());
            hashMap.put("living_days", String.valueOf(m789q()));
            hashMap.put("optimize_goal", m786t());
            hashMap.put("optimize_model", m785u());
            hashMap.put("first_app_version", m792n());
            hashMap.put("first_install_time", String.valueOf(m791o()));
            hashMap.put(CommonUrlParts.OS_VERSION, m784v());
            hashMap.put("has_ad_identify", m790p());
            hashMap.put("dynamic_ad_value", String.valueOf(m794l()));
            hashMap.putAll(m787s());
            hashMap.putAll(m783w());
            hashMap.putAll(m782x());
            hashMap.put("ad_value", m805a().m25499a().m24944b());
            hashMap.put("device_resolution_type", m795k().m25499a().m24942b());
            hashMap.put("device_category", m798h().m25499a().m24943b());
            return hashMap;
        }

        /* renamed from: d */
        public String m802d() {
            return DataProcessUtils.m18552e(this.f118707l);
        }

        /* renamed from: e */
        public String m801e() {
            return DataProcessUtils.m18552e(this.f118709n);
        }

        /* renamed from: f */
        public String m800f() {
            return DataProcessUtils.m18552e(this.f118710o);
        }

        /* renamed from: g */
        public String m799g() {
            return DataProcessUtils.m18552e(this.f118696a);
        }

        /* renamed from: h */
        public DeviceCategoryData m798h() {
            if (this.f118700e == null) {
                this.f118700e = new DeviceCategoryData(DeviceCategoryTag.UNSET);
            }
            return this.f118700e;
        }

        /* renamed from: i */
        public String m797i() {
            return DataProcessUtils.m18552e(this.f118697b);
        }

        /* renamed from: j */
        public double m796j() {
            return this.f118701f;
        }

        /* renamed from: k */
        public DeviceResolutionData m795k() {
            if (this.f118699d == null) {
                this.f118699d = new DeviceResolutionData(DeviceResolutionTag.UNSET);
            }
            return this.f118699d;
        }

        /* renamed from: l */
        public double m794l() {
            return this.f118712q;
        }

        /* renamed from: m */
        Map<String, String> m793m() {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_value", m805a().m25499a().m24944b());
            hashMap.put("optimize_goal", DataProcessUtils.m18553d(m786t()));
            hashMap.put("optimize_model", DataProcessUtils.m18553d(m785u()));
            hashMap.put("first_app_version", DataProcessUtils.m18553d(m792n()));
            hashMap.put("first_install_time", String.valueOf(m791o()));
            hashMap.put("dynamic_ad_value", String.valueOf(m794l()));
            hashMap.putAll(m787s());
            hashMap.putAll(m783w());
            hashMap.putAll(m782x());
            return hashMap;
        }

        /* renamed from: n */
        public String m792n() {
            return DataProcessUtils.m18552e(this.f118702g);
        }

        /* renamed from: o */
        public long m791o() {
            return this.f118703h;
        }

        /* renamed from: p */
        public String m790p() {
            return DataProcessUtils.m18552e(BridgeManager.m103929c());
        }

        /* renamed from: q */
        public int m789q() {
            return C37291b.m18545b(this.f118703h);
        }

        /* renamed from: r */
        public String m788r() {
            return DataProcessUtils.m18552e(this.f118708m);
        }

        /* renamed from: s */
        public Map<String, String> m787s() {
            if (this.f118713r == null) {
                this.f118713r = new HashMap();
            }
            return this.f118713r;
        }

        /* renamed from: t */
        public String m786t() {
            return DataProcessUtils.m18552e(this.f118704i);
        }

        public String toString() {
            return "{\n\tcountry = " + m799g() + "\n\tdeviceLanguage = " + m797i() + "\n\tdeviceRam = " + m796j() + "\n\tlivingDays = " + m789q() + "\n\thasAdIdentify = " + m790p() + "\n\tfirstAppVersion = " + m792n() + "\n\tfirstInstallTime = " + m791o() + "\n\toptimizeGoal = " + m786t() + "\n\toptimizeModel = " + m785u() + "\n\tosVersion = " + m784v() + "\n\tappVersion = " + m802d() + "\n\tmediaSource = " + m788r() + "\n\tcampaignId = " + m801e() + "\n\tcampaignName = " + m800f() + "\n\tagency = " + m804b() + "\n\tdynamicAdValue = " + m794l() + "\n\tadValueData = " + m805a() + "\n\tdeviceResolutionData = " + m795k() + "\n\tdeviceCategoryData = " + m798h() + "\n\tmoFlowDomainData = " + m787s() + "\n\tpmFlowDomainData = " + m783w() + "\n\tuaAdTagData = " + m782x() + "\n\tSDKTagData = " + DataProcessUtils.m18548i(m803c()) + "\n\t}";
        }

        /* renamed from: u */
        public String m785u() {
            return DataProcessUtils.m18552e(this.f118705j);
        }

        /* renamed from: v */
        public String m784v() {
            return DataProcessUtils.m18552e(this.f118706k);
        }

        /* renamed from: w */
        public Map<String, String> m783w() {
            if (this.f118714s == null) {
                this.f118714s = new HashMap();
            }
            return this.f118714s;
        }

        /* renamed from: x */
        public Map<String, String> m782x() {
            if (this.f118715t == null) {
                this.f118715t = new HashMap();
            }
            return this.f118715t;
        }

        /* renamed from: y */
        public void m781y(AdValueData adValueData) {
            this.f118698c = adValueData;
        }

        /* renamed from: z */
        public void m780z(String str) {
            this.f118711p = str;
        }
    }

    /* compiled from: UserTagData.java */
    /* renamed from: z4.d$b */
    /* loaded from: classes6.dex */
    public static class C45121b {

        /* renamed from: a */
        private Map<String, String> f118716a;

        /* renamed from: b */
        private Map<String, List<String>> f118717b;

        /* renamed from: a */
        public Map<String, List<String>> m779a() {
            if (this.f118717b == null) {
                this.f118717b = new HashMap();
            }
            return this.f118717b;
        }

        /* renamed from: b */
        public Map<String, String> m778b() {
            if (this.f118716a == null) {
                this.f118716a = new HashMap();
            }
            return this.f118716a;
        }

        public String toString() {
            return "{\n\tallTagData = " + m778b() + "\n\tallListTagData = " + m779a() + "\n\t}";
        }
    }

    /* compiled from: UserTagData.java */
    /* renamed from: z4.d$c */
    /* loaded from: classes6.dex */
    public static class C45122c {

        /* renamed from: a */
        private Map<String, String> f118718a;

        /* renamed from: b */
        private Map<String, List<String>> f118719b;

        /* renamed from: a */
        public Map<String, List<String>> m777a() {
            if (this.f118719b == null) {
                this.f118719b = new HashMap();
            }
            return this.f118719b;
        }

        /* renamed from: b */
        public Map<String, String> m776b() {
            if (this.f118718a == null) {
                this.f118718a = new HashMap();
            }
            return this.f118718a;
        }

        public String toString() {
            return "{\n\tallTagData = " + m776b() + "\n\tallListTagData = " + m777a() + "\n\t}";
        }
    }

    /* renamed from: a */
    public Map<String, String> m825a() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(m823c().m803c());
        hashMap.putAll(m822d().m778b());
        hashMap.putAll(DataProcessUtils.m18547j(m822d().m779a()));
        hashMap.putAll(m821e().m776b());
        hashMap.putAll(DataProcessUtils.m18547j(m821e().m777a()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Map<String, Object> m824b() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(m823c().m793m());
        hashMap.putAll(m822d().m778b());
        hashMap.putAll(m822d().m779a());
        hashMap.putAll(m821e().m776b());
        hashMap.putAll(m821e().m777a());
        return hashMap;
    }

    /* renamed from: c */
    public C45120a m823c() {
        if (this.f118693a == null) {
            this.f118693a = new C45120a();
        }
        return this.f118693a;
    }

    /* renamed from: d */
    public C45121b m822d() {
        if (this.f118694b == null) {
            this.f118694b = new C45121b();
        }
        return this.f118694b;
    }

    /* renamed from: e */
    public C45122c m821e() {
        if (this.f118695c == null) {
            this.f118695c = new C45122c();
        }
        return this.f118695c;
    }

    public String toString() {
        return "UserTagData{\ninnerTagData = " + m823c() + "\nlocalTagData = " + m822d() + "\nremoteTagData = " + m821e() + "\nallTagData = " + DataProcessUtils.m18548i(m825a()) + "\n}";
    }
}
