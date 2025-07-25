package com.ironsource;

import com.ironsource.mediationsdk.C20348d;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.f5 */
/* loaded from: classes6.dex */
public class C19897f5 {

    /* renamed from: n */
    public static final String f50012n = "adMarkup";

    /* renamed from: o */
    public static final String f50013o = "instance";

    /* renamed from: p */
    public static final String f50014p = "adData";

    /* renamed from: q */
    public static final String f50015q = "price";

    /* renamed from: r */
    public static final String f50016r = "serverData";

    /* renamed from: s */
    public static final String f50017s = "loadTimeout";

    /* renamed from: t */
    public static final String f50018t = "order";

    /* renamed from: u */
    public static final String f50019u = "show";

    /* renamed from: v */
    public static final String f50020v = "price";

    /* renamed from: w */
    public static final String f50021w = "notifications";

    /* renamed from: x */
    public static final String f50022x = "burl";

    /* renamed from: y */
    public static final String f50023y = "lurl";

    /* renamed from: z */
    public static final String f50024z = "nurl";

    /* renamed from: a */
    private String f50025a;

    /* renamed from: b */
    private String f50026b;

    /* renamed from: c */
    private JSONObject f50027c;

    /* renamed from: d */
    private String f50028d;
    @Nullable

    /* renamed from: e */
    private Integer f50029e;

    /* renamed from: f */
    private int f50030f;

    /* renamed from: g */
    private int f50031g;

    /* renamed from: h */
    private int f50032h;

    /* renamed from: i */
    private final List<String> f50033i;

    /* renamed from: j */
    private final List<String> f50034j;

    /* renamed from: k */
    private final List<String> f50035k;

    /* renamed from: l */
    private ImpressionData f50036l;

    /* renamed from: m */
    private boolean f50037m;

    public C19897f5(String str) {
        this.f50025a = null;
        this.f50026b = "";
        this.f50027c = null;
        this.f50028d = "";
        this.f50029e = null;
        this.f50030f = -1;
        this.f50031g = -1;
        this.f50032h = -1;
        this.f50033i = new ArrayList();
        this.f50034j = new ArrayList();
        this.f50035k = new ArrayList();
        this.f50036l = null;
        this.f50037m = true;
        this.f50025a = str;
    }

    /* renamed from: a */
    public ImpressionData m58654a(String str) {
        ImpressionData impressionData = this.f50036l;
        if (impressionData != null) {
            ImpressionData impressionData2 = new ImpressionData(impressionData);
            impressionData2.replaceMacroForPlacementWithValue(C20348d.f51331q, str);
            return impressionData2;
        }
        return null;
    }

    /* renamed from: b */
    public List<String> m58651b() {
        return this.f50033i;
    }

    /* renamed from: c */
    public String m58650c() {
        return this.f50025a;
    }

    /* renamed from: d */
    public int m58649d() {
        return this.f50030f;
    }

    @Nullable
    /* renamed from: e */
    public Integer m58648e() {
        return this.f50029e;
    }

    /* renamed from: f */
    public List<String> m58647f() {
        return this.f50034j;
    }

    /* renamed from: g */
    public List<String> m58646g() {
        return this.f50035k;
    }

    /* renamed from: h */
    public String m58645h() {
        return this.f50028d;
    }

    /* renamed from: i */
    public int m58644i() {
        return this.f50032h;
    }

    /* renamed from: j */
    public String m58643j() {
        return this.f50026b;
    }

    /* renamed from: k */
    public int m58642k() {
        return this.f50031g;
    }

    /* renamed from: l */
    public boolean m58641l() {
        return this.f50037m;
    }

    public C19897f5(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    @Nullable
    /* renamed from: a */
    public JSONObject m58655a() {
        return this.f50027c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[Catch: Exception -> 0x00c7, TryCatch #0 {Exception -> 0x00c7, blocks: (B:3:0x003c, B:5:0x0042, B:6:0x0048, B:8:0x004e, B:12:0x0061, B:13:0x0063, B:15:0x007b, B:16:0x008e, B:18:0x00ac, B:19:0x00bb, B:9:0x0053, B:11:0x0059), top: B:24:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac A[Catch: Exception -> 0x00c7, TryCatch #0 {Exception -> 0x00c7, blocks: (B:3:0x003c, B:5:0x0042, B:6:0x0048, B:8:0x004e, B:12:0x0061, B:13:0x0063, B:15:0x007b, B:16:0x008e, B:18:0x00ac, B:19:0x00bb, B:9:0x0053, B:11:0x0059), top: B:24:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C19897f5(org.json.JSONObject r13, int r14, org.json.JSONObject r15) {
        /*
            r12 = this;
            java.lang.String r0 = "loadTimeout"
            java.lang.String r1 = "notifications"
            java.lang.String r2 = "serverData"
            java.lang.String r3 = "adMarkup"
            java.lang.String r4 = "instance"
            r12.<init>()
            r5 = 0
            r12.f50025a = r5
            java.lang.String r6 = ""
            r12.f50026b = r6
            r12.f50027c = r5
            r12.f50028d = r6
            r12.f50029e = r5
            r6 = -1
            r12.f50030f = r6
            r12.f50031g = r6
            r12.f50032h = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r12.f50033i = r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r12.f50034j = r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r12.f50035k = r8
            r12.f50036l = r5
            r9 = 1
            r12.f50037m = r9
            r10 = 0
            boolean r11 = r13.has(r4)     // Catch: java.lang.Exception -> Lc7
            if (r11 == 0) goto L48
            java.lang.String r4 = r13.getString(r4)     // Catch: java.lang.Exception -> Lc7
            r12.f50025a = r4     // Catch: java.lang.Exception -> Lc7
        L48:
            boolean r4 = r13.has(r3)     // Catch: java.lang.Exception -> Lc7
            if (r4 == 0) goto L53
            java.lang.String r2 = r13.getString(r3)     // Catch: java.lang.Exception -> Lc7
            goto L61
        L53:
            boolean r3 = r13.has(r2)     // Catch: java.lang.Exception -> Lc7
            if (r3 == 0) goto L63
            org.json.JSONObject r2 = r13.getJSONObject(r2)     // Catch: java.lang.Exception -> Lc7
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lc7
        L61:
            r12.f50026b = r2     // Catch: java.lang.Exception -> Lc7
        L63:
            java.lang.String r2 = "adData"
            org.json.JSONObject r2 = r13.optJSONObject(r2)     // Catch: java.lang.Exception -> Lc7
            r12.f50027c = r2     // Catch: java.lang.Exception -> Lc7
            java.lang.String r2 = "price"
            java.lang.String r3 = "0"
            java.lang.String r2 = r13.optString(r2, r3)     // Catch: java.lang.Exception -> Lc7
            r12.f50028d = r2     // Catch: java.lang.Exception -> Lc7
            boolean r2 = r13.has(r1)     // Catch: java.lang.Exception -> Lc7
            if (r2 == 0) goto L8e
            org.json.JSONObject r1 = r13.getJSONObject(r1)     // Catch: java.lang.Exception -> Lc7
            java.lang.String r2 = "burl"
            r12.m58652a(r1, r2, r6)     // Catch: java.lang.Exception -> Lc7
            java.lang.String r2 = "lurl"
            r12.m58652a(r1, r2, r7)     // Catch: java.lang.Exception -> Lc7
            java.lang.String r2 = "nurl"
            r12.m58652a(r1, r2, r8)     // Catch: java.lang.Exception -> Lc7
        L8e:
            java.lang.String r1 = "armData"
            org.json.JSONObject r1 = r13.optJSONObject(r1)     // Catch: java.lang.Exception -> Lc7
            com.ironsource.mediationsdk.impressionData.ImpressionData r2 = new com.ironsource.mediationsdk.impressionData.ImpressionData     // Catch: java.lang.Exception -> Lc7
            r3 = 2
            org.json.JSONObject[] r3 = new org.json.JSONObject[r3]     // Catch: java.lang.Exception -> Lc7
            r3[r10] = r15     // Catch: java.lang.Exception -> Lc7
            r3[r9] = r1     // Catch: java.lang.Exception -> Lc7
            org.json.JSONObject r15 = com.ironsource.C20053hj.m58123a(r3)     // Catch: java.lang.Exception -> Lc7
            r2.<init>(r15)     // Catch: java.lang.Exception -> Lc7
            r12.f50036l = r2     // Catch: java.lang.Exception -> Lc7
            boolean r15 = r13.has(r0)     // Catch: java.lang.Exception -> Lc7
            if (r15 == 0) goto Lbb
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> Lc7
            long r0 = r13.getLong(r0)     // Catch: java.lang.Exception -> Lc7
            long r0 = r15.toSeconds(r0)     // Catch: java.lang.Exception -> Lc7
            int r15 = (int) r0     // Catch: java.lang.Exception -> Lc7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Exception -> Lc7
        Lbb:
            r12.f50029e = r5     // Catch: java.lang.Exception -> Lc7
            java.lang.String r15 = "order"
            org.json.JSONObject r13 = r13.optJSONObject(r15)     // Catch: java.lang.Exception -> Lc7
            r12.m58653a(r13, r14)     // Catch: java.lang.Exception -> Lc7
            goto Leb
        Lc7:
            r13 = move-exception
            com.ironsource.i9 r14 = com.ironsource.C20086i9.m57997d()
            r14.m58003a(r13)
            r12.f50037m = r10
            com.ironsource.mediationsdk.logger.IronLog r14 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "exception "
            r15.append(r0)
            java.lang.String r13 = r13.getMessage()
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            r14.error(r13)
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C19897f5.<init>(org.json.JSONObject, int, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private void m58653a(@Nullable JSONObject jSONObject, int i) {
        this.f50030f = i;
        this.f50031g = i;
        this.f50032h = i;
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("show", i);
            this.f50031g = optInt;
            this.f50032h = jSONObject.optInt("price", optInt);
        }
    }

    /* renamed from: a */
    private void m58652a(JSONObject jSONObject, String str, List<String> list) throws JSONException {
        if (jSONObject.has(str)) {
            list.addAll(C20053hj.m58121b(jSONObject.getJSONArray(str)));
        }
    }
}
