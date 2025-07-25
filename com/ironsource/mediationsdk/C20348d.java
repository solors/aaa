package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.C19577ad;
import com.ironsource.C19821el;
import com.ironsource.C19897f5;
import com.ironsource.C20053hj;
import com.ironsource.C20086i9;
import com.ironsource.C20200kb;
import com.ironsource.C20670q2;
import com.ironsource.C20772rp;
import com.ironsource.C21060u4;
import com.ironsource.C21253y4;
import com.ironsource.InterfaceC19697ce;
import com.ironsource.InterfaceC20567o4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.InterfaceC20394p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.d */
/* loaded from: classes6.dex */
public class C20348d {

    /* renamed from: A */
    private static C20348d f51316A = new C20348d();

    /* renamed from: c */
    public static final String f51317c = "auctionId";

    /* renamed from: d */
    public static final String f51318d = "armData";

    /* renamed from: e */
    public static final String f51319e = "isAdUnitCapped";

    /* renamed from: f */
    public static final String f51320f = "settings";

    /* renamed from: g */
    public static final String f51321g = "waterfall";

    /* renamed from: h */
    public static final String f51322h = "genericParams";

    /* renamed from: i */
    public static final String f51323i = "configurations";

    /* renamed from: j */
    public static final String f51324j = "instances";

    /* renamed from: k */
    public static final String f51325k = "${AUCTION_LOSS}";

    /* renamed from: l */
    public static final String f51326l = "${AUCTION_MBR}";

    /* renamed from: m */
    public static final String f51327m = "${AUCTION_PRICE}";

    /* renamed from: n */
    public static final String f51328n = "${DYNAMIC_DEMAND_SOURCE}";

    /* renamed from: o */
    public static final String f51329o = "${INSTANCE}";

    /* renamed from: p */
    public static final String f51330p = "${INSTANCE_TYPE}";

    /* renamed from: q */
    public static final String f51331q = "${PLACEMENT_NAME}";

    /* renamed from: r */
    private static final String f51332r = "adMarkup";

    /* renamed from: s */
    private static final String f51333s = "dynamicDemandSource";

    /* renamed from: t */
    private static final String f51334t = "params";

    /* renamed from: u */
    public static final String f51335u = "dlpl";

    /* renamed from: v */
    public static final String f51336v = "adUnit";

    /* renamed from: w */
    public static final String f51337w = "parallelLoad";

    /* renamed from: x */
    public static final String f51338x = "bidderExclusive";

    /* renamed from: y */
    public static final String f51339y = "showPriorityEnabled";

    /* renamed from: z */
    public static final boolean f51340z = false;

    /* renamed from: a */
    private final AtomicBoolean f51341a = new AtomicBoolean(false);

    /* renamed from: b */
    private final InterfaceC19697ce f51342b = C19821el.m58797N().mo57096f();

    /* renamed from: com.ironsource.mediationsdk.d$a */
    /* loaded from: classes6.dex */
    public static class C20349a {

        /* renamed from: a */
        private String f51343a;

        /* renamed from: b */
        private List<C19897f5> f51344b;

        /* renamed from: c */
        private C19897f5 f51345c;

        /* renamed from: d */
        private JSONObject f51346d;

        /* renamed from: e */
        private JSONObject f51347e;

        /* renamed from: f */
        private int f51348f;

        /* renamed from: g */
        private String f51349g;

        /* renamed from: h */
        private InterfaceC20567o4 f51350h;

        public C20349a(String str) {
            this.f51343a = str;
        }

        /* renamed from: b */
        public JSONObject m56998b() {
            return this.f51347e;
        }

        /* renamed from: c */
        public int m56996c() {
            return this.f51348f;
        }

        /* renamed from: d */
        public String m56995d() {
            return this.f51349g;
        }

        /* renamed from: e */
        public C19897f5 m56994e() {
            return this.f51345c;
        }

        /* renamed from: f */
        public JSONObject m56993f() {
            return this.f51346d;
        }

        /* renamed from: g */
        public InterfaceC20567o4 m56992g() {
            return this.f51350h;
        }

        /* renamed from: h */
        public List<C19897f5> m56991h() {
            return this.f51344b;
        }

        /* renamed from: a */
        public InterfaceC20394p m56999a(String str) {
            InterfaceC20567o4 interfaceC20567o4 = this.f51350h;
            return interfaceC20567o4 != null ? interfaceC20567o4.mo56064a(str) : new InterfaceC20394p.C20396b();
        }

        /* renamed from: a */
        public String m57007a() {
            return this.f51343a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.d$b */
    /* loaded from: classes6.dex */
    public static class RunnableC20350b implements Runnable {

        /* renamed from: d */
        private static final int f51351d = 15000;

        /* renamed from: a */
        private String f51352a;

        /* renamed from: b */
        private String f51353b;

        /* renamed from: c */
        private String f51354c;

        public RunnableC20350b(String str, String str2, String str3) {
            this.f51352a = str;
            this.f51353b = str2;
            this.f51354c = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[Catch: Exception -> 0x0087, TRY_LEAVE, TryCatch #0 {Exception -> 0x0087, blocks: (B:23:0x0020, B:31:0x0057), top: B:36:0x0020 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r8.f51352a
                r0.append(r1)
                java.lang.String r1 = ";"
                r0.append(r1)
                java.lang.String r2 = r8.f51353b
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = r8.f51354c
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.net.URL r2 = new java.net.URL     // Catch: java.lang.Exception -> L87
                java.lang.String r3 = r8.f51354c     // Catch: java.lang.Exception -> L87
                r2.<init>(r3)     // Catch: java.lang.Exception -> L87
                java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Exception -> L87
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Exception -> L87
                java.lang.String r3 = "GET"
                r2.setRequestMethod(r3)     // Catch: java.lang.Exception -> L87
                r3 = 15000(0x3a98, float:2.102E-41)
                r2.setReadTimeout(r3)     // Catch: java.lang.Exception -> L87
                r2.setConnectTimeout(r3)     // Catch: java.lang.Exception -> L87
                r2.connect()     // Catch: java.lang.Exception -> L87
                int r3 = r2.getResponseCode()     // Catch: java.lang.Exception -> L87
                java.lang.String r4 = r2.getResponseMessage()     // Catch: java.lang.Exception -> L87
                r2.disconnect()     // Catch: java.lang.Exception -> L87
                r2 = 200(0xc8, float:2.8E-43)
                r5 = 1
                if (r3 == r2) goto L54
                r2 = 204(0xcc, float:2.86E-43)
                if (r3 != r2) goto L52
                goto L54
            L52:
                r2 = 0
                goto L55
            L54:
                r2 = r5
            L55:
                if (r2 != 0) goto Laf
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L87
                r2.<init>()     // Catch: java.lang.Exception -> L87
                java.lang.String r6 = "provider"
                java.lang.String r7 = "Mediation"
                r2.put(r6, r7)     // Catch: java.lang.Exception -> L87
                java.lang.String r6 = "programmatic"
                r2.put(r6, r5)     // Catch: java.lang.Exception -> L87
                java.lang.String r5 = "ext1"
                r2.put(r5, r0)     // Catch: java.lang.Exception -> L87
                java.lang.String r5 = "errorCode"
                r2.put(r5, r3)     // Catch: java.lang.Exception -> L87
                java.lang.String r3 = "reason"
                r2.put(r3, r4)     // Catch: java.lang.Exception -> L87
                com.ironsource.kb r3 = new com.ironsource.kb     // Catch: java.lang.Exception -> L87
                r4 = 81320(0x13da8, float:1.13954E-40)
                r3.<init>(r4, r2)     // Catch: java.lang.Exception -> L87
                com.ironsource.rp r2 = com.ironsource.C20772rp.m55443i()     // Catch: java.lang.Exception -> L87
                r2.mo57283a(r3)     // Catch: java.lang.Exception -> L87
                goto Laf
            L87:
                r2 = move-exception
                com.ironsource.i9 r3 = com.ironsource.C20086i9.m57997d()
                r3.m58003a(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Send auction url failed with params - "
                r3.append(r4)
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r2.getMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                r1.error(r0)
            Laf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C20348d.RunnableC20350b.run():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.d$c */
    /* loaded from: classes6.dex */
    public enum EnumC20351c {
        NOT_SECURE,
        SECURE
    }

    /* renamed from: b */
    public static C20348d m57010b() {
        return f51316A;
    }

    /* renamed from: a */
    public C20349a m57012a(JSONObject jSONObject) throws JSONException {
        String optString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(optString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        C20349a c20349a = new C20349a(optString);
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            c20349a.f51345c = new C19897f5(jSONObject2);
            r3 = jSONObject2.has(f51318d) ? jSONObject2.optJSONObject(f51318d) : null;
            if (jSONObject2.has("genericParams")) {
                c20349a.f51346d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                c20349a.f51347e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(f51324j)) {
                c20349a.f51350h = new InterfaceC20567o4.C20568a(jSONObject2.optJSONObject(f51324j));
            }
        }
        c20349a.f51344b = new ArrayList();
        if (jSONObject.has(f51321g)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f51321g);
            for (int i = 0; i < jSONArray.length(); i++) {
                C19897f5 c19897f5 = new C19897f5(jSONArray.getJSONObject(i), i, r3);
                if (!c19897f5.m58641l()) {
                    c20349a.f51348f = 1002;
                    c20349a.f51349g = "waterfall " + i;
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("AuctionResponseItem " + i + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                c20349a.f51344b.add(c19897f5);
            }
        }
        return c20349a;
    }

    /* renamed from: c */
    public String m57008c(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str) || !C20053hj.m58127a(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("params")) {
                return "";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject2);
            if (!jSONObject2.has("dynamicDemandSource")) {
                return "";
            }
            str2 = jSONObject2.getString("dynamicDemandSource");
            ironLog.verbose("demand source = " + str2);
            return str2;
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("exception " + e.getMessage());
            return str2;
        }
    }

    /* renamed from: a */
    private EnumC20351c m57019a() {
        EnumC20351c enumC20351c = EnumC20351c.SECURE;
        if (Build.VERSION.SDK_INT < 28) {
            if (!((ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0)) {
                return enumC20351c;
            }
        } else if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
            return enumC20351c;
        }
        return EnumC20351c.NOT_SECURE;
    }

    /* renamed from: b */
    public Map<String, String> m57009b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception " + e.getMessage());
        }
        return hashMap;
    }

    /* renamed from: a */
    public String m57017a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception " + e.getMessage());
            return str;
        }
    }

    /* renamed from: a */
    public String m57016a(String str, int i, C19897f5 c19897f5, String str2, String str3, String str4) {
        String m58645h = c19897f5.m58645h();
        return m57014a(str, c19897f5.m58650c(), i, m57010b().m57008c(c19897f5.m58643j()), m58645h, m57010b().m57015a(m58645h, str2), str3, str4);
    }

    /* renamed from: a */
    private String m57015a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double parseDouble = Double.parseDouble(str);
        double parseDouble2 = Double.parseDouble(str2);
        return parseDouble2 == 0.0d ? "" : String.valueOf(Math.round((parseDouble / parseDouble2) * 1000.0d) / 1000.0d);
    }

    /* renamed from: a */
    public String m57014a(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace("${AUCTION_MBR}", str5).replace(f51329o, str2).replace(f51330p, Integer.toString(i)).replace(f51328n, str3).replace(f51331q, str7);
    }

    /* renamed from: a */
    public JSONObject m57018a(C20406i c20406i) throws JSONException {
        boolean z;
        boolean z2;
        ISBannerSize iSBannerSize;
        IronSource.AD_UNIT m56842c = c20406i.m56842c();
        boolean m56821s = c20406i.m56821s();
        Map<String, Object> m56833g = c20406i.m56833g();
        List<String> m56829k = c20406i.m56829k();
        C20404h m56836e = c20406i.m56836e();
        int m56826n = c20406i.m56826n();
        ISBannerSize m56834f = c20406i.m56834f();
        IronSourceSegment m56827m = c20406i.m56827m();
        boolean m56825o = c20406i.m56825o();
        boolean m56824p = c20406i.m56824p();
        ArrayList<C21253y4> m56830j = c20406i.m56830j();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = m56833g.keySet().iterator();
        while (true) {
            z = m56825o;
            z2 = m56821s;
            String str = "";
            iSBannerSize = m56834f;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Iterator<String> it2 = it;
            JSONObject jSONObject3 = new JSONObject();
            IronSourceSegment ironSourceSegment = m56827m;
            jSONObject3.put(C19577ad.f49129n0, 2);
            jSONObject3.put(C19577ad.f49105e0, new JSONObject((Map) m56833g.get(next)));
            if (m56836e != null) {
                str = m56836e.mo56860a(next);
            }
            jSONObject3.put(C19577ad.f49135q0, str);
            jSONObject3.put("ts", m56824p ? 1 : 0);
            jSONObject2.put(next, jSONObject3);
            m56825o = z;
            m56821s = z2;
            m56834f = iSBannerSize;
            it = it2;
            m56827m = ironSourceSegment;
        }
        IronSourceSegment ironSourceSegment2 = m56827m;
        int i = 2;
        for (String str2 : m56829k) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(C19577ad.f49129n0, 1);
            jSONObject4.put(C19577ad.f49135q0, m56836e != null ? m56836e.mo56860a(str2) : "");
            jSONObject2.put(str2, jSONObject4);
        }
        Iterator<C21253y4> it3 = m56830j.iterator();
        while (it3.hasNext()) {
            C21253y4 next2 = it3.next();
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(C19577ad.f49129n0, next2.m54036e() ? i : 1);
            Map<String, Object> m54035f = next2.m54035f();
            if (!m54035f.isEmpty()) {
                jSONObject5.put(C19577ad.f49105e0, new JSONObject(m54035f));
            }
            jSONObject5.put(C19577ad.f49135q0, m56836e != null ? m56836e.mo56860a(next2.m54034g()) : "");
            jSONObject5.put("ts", m56824p ? 1 : 0);
            if (!next2.m54033h().isEmpty()) {
                jSONObject5.put(f51335u, next2.m54033h());
            }
            jSONObject2.put(next2.m54034g(), jSONObject5);
            i = 2;
        }
        jSONObject.put(C19577ad.f49127m0, jSONObject2);
        if (c20406i.m56819u()) {
            jSONObject.put(C19577ad.f49109f1, 1);
        }
        if (c20406i.m56822r()) {
            jSONObject.put("do", 1);
        }
        JSONObject m54696a = new C21060u4(C20670q2.m55692a(m56842c)).m54696a();
        m57011a(m54696a, false);
        m54696a.put(C19577ad.f49131o0, m56826n);
        m54696a.put(C19577ad.f49133p0, m57019a().ordinal());
        if (ironSourceSegment2 != null) {
            m54696a.put(C19577ad.f49075R0, ironSourceSegment2.toJson());
        }
        jSONObject.put(C19577ad.f49120j0, m54696a);
        if (iSBannerSize != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(C19577ad.f49111g0, iSBannerSize.getDescription());
            jSONObject6.put(C19577ad.f49117i0, iSBannerSize.getWidth());
            jSONObject6.put(C19577ad.f49114h0, iSBannerSize.getHeight());
            jSONObject.put(C19577ad.f49108f0, jSONObject6);
        }
        jSONObject.put(C19577ad.f49093a0, m56842c.toString());
        if (c20406i.m56845b() != null) {
            jSONObject.put("adf", c20406i.m56845b());
        }
        if (c20406i.m56839d() != null) {
            jSONObject.put("mediationAdUnitId", c20406i.m56839d());
        }
        if (c20406i.m56820t() != null) {
            jSONObject.put(C19577ad.f49102d0, c20406i.m56820t());
        }
        jSONObject.put(C19577ad.f49123k0, !z2);
        Object remove = m54696a.remove(C19577ad.f49097b1);
        if (remove != null) {
            jSONObject.put(C19577ad.f49097b1, remove);
        }
        if (z) {
            jSONObject.put(C19577ad.f49091Z0, 1);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void m57013a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new RunnableC20350b(str, str2, str3));
    }

    /* renamed from: a */
    public void m57011a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(C19577ad.f49079T0)) || !this.f51341a.compareAndSet(false, true)) {
            return;
        }
        C20772rp.m55443i().mo57283a(new C20200kb(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z, true, -1)));
    }
}
