package com.applovin.impl;

import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.je */
/* loaded from: classes2.dex */
public class C4648je implements Comparable, AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    private final List f7149A;

    /* renamed from: B */
    private final List f7150B;

    /* renamed from: C */
    private final List f7151C;

    /* renamed from: D */
    private final Map f7152D;

    /* renamed from: E */
    private final boolean f7153E;

    /* renamed from: F */
    private final boolean f7154F;

    /* renamed from: G */
    private final C5280rn f7155G;

    /* renamed from: H */
    private final boolean f7156H;

    /* renamed from: I */
    private final String f7157I;

    /* renamed from: J */
    private final Map f7158J;

    /* renamed from: a */
    private final C5416j f7159a;

    /* renamed from: b */
    private final EnumC4649a f7160b;

    /* renamed from: c */
    private int f7161c;

    /* renamed from: d */
    private final boolean f7162d;

    /* renamed from: f */
    private final boolean f7163f;

    /* renamed from: g */
    private final boolean f7164g;

    /* renamed from: h */
    private final boolean f7165h;

    /* renamed from: i */
    private final boolean f7166i;

    /* renamed from: j */
    private final boolean f7167j;

    /* renamed from: k */
    private final boolean f7168k;

    /* renamed from: l */
    private final boolean f7169l;

    /* renamed from: m */
    private final boolean f7170m;

    /* renamed from: n */
    private final boolean f7171n;

    /* renamed from: o */
    private final String f7172o;

    /* renamed from: p */
    private final String f7173p;

    /* renamed from: q */
    private String f7174q;

    /* renamed from: r */
    private String f7175r;

    /* renamed from: s */
    private final String f7176s;

    /* renamed from: t */
    private final String f7177t;

    /* renamed from: u */
    private final String f7178u;

    /* renamed from: v */
    private final String f7179v;

    /* renamed from: w */
    private final int f7180w;

    /* renamed from: x */
    private final List f7181x;

    /* renamed from: y */
    private final List f7182y;

    /* renamed from: z */
    private final List f7183z;

    /* renamed from: com.applovin.impl.je$a */
    /* loaded from: classes2.dex */
    public enum EnumC4649a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        

        /* renamed from: a */
        private final String f7189a;

        EnumC4649a(String str) {
            this.f7189a = str;
        }

        /* renamed from: b */
        public String m98188b() {
            return this.f7189a;
        }
    }

    /* renamed from: com.applovin.impl.je$b */
    /* loaded from: classes2.dex */
    public enum EnumC4650b {
        NOT_SUPPORTED("Not Supported", SupportMenu.CATEGORY_MASK, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", SupportMenu.CATEGORY_MASK, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", SupportMenu.CATEGORY_MASK, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");
        

        /* renamed from: a */
        private final String f7196a;

        /* renamed from: b */
        private final int f7197b;

        /* renamed from: c */
        private final String f7198c;

        EnumC4650b(String str, int i, String str2) {
            this.f7196a = str;
            this.f7197b = i;
            this.f7198c = str2;
        }

        /* renamed from: b */
        public String m98186b() {
            return this.f7198c;
        }

        /* renamed from: c */
        public String m98185c() {
            return this.f7196a;
        }

        /* renamed from: d */
        public int m98184d() {
            return this.f7197b;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:27|28|29|(2:30|31)|(3:32|33|(5:35|(2:37|(3:39|40|41))|99|40|41)(1:100))|(3:42|43|44)|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01ff, code lost:
        r23.m95186I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0206, code lost:
        if (com.applovin.impl.sdk.C5434n.m94914a() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0208, code lost:
        r23.m95186I().m94910a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0211, code lost:
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4648je(org.json.JSONObject r22, com.applovin.impl.sdk.C5416j r23) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C4648je.<init>(org.json.JSONObject, com.applovin.impl.sdk.j):void");
    }

    /* renamed from: A */
    public boolean m98230A() {
        return this.f7163f;
    }

    /* renamed from: B */
    public boolean m98229B() {
        return this.f7164g;
    }

    /* renamed from: C */
    public boolean m98228C() {
        return this.f7156H;
    }

    /* renamed from: D */
    public boolean m98227D() {
        return this.f7171n;
    }

    /* renamed from: E */
    public boolean m98226E() {
        return this.f7162d;
    }

    /* renamed from: F */
    public boolean m98225F() {
        if (this.f7160b == EnumC4649a.MISSING && this.f7168k) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public boolean m98224G() {
        return this.f7154F;
    }

    /* renamed from: H */
    public boolean m98223H() {
        return this.f7169l;
    }

    /* renamed from: I */
    public boolean m98222I() {
        return this.f7170m;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C4648je c4648je) {
        return this.f7173p.compareToIgnoreCase(c4648je.f7173p);
    }

    /* renamed from: b */
    public String m98215b() {
        return this.f7174q;
    }

    /* renamed from: c */
    public String m98214c() {
        return this.f7176s;
    }

    /* renamed from: d */
    public Map m98213d() {
        return this.f7158J;
    }

    /* renamed from: e */
    public String m98212e() {
        return this.f7157I;
    }

    /* renamed from: f */
    public List m98211f() {
        return this.f7183z;
    }

    /* renamed from: g */
    public String m98210g() {
        return this.f7173p;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    /* renamed from: h */
    public int m98209h() {
        return this.f7180w;
    }

    /* renamed from: i */
    public int m98208i() {
        return this.f7161c;
    }

    /* renamed from: j */
    public final String m98207j() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n---------- ");
        sb2.append(this.f7172o);
        sb2.append(" ----------");
        sb2.append("\nStatus  - ");
        sb2.append(this.f7160b.m98188b());
        sb2.append("\nSDK     - ");
        String str2 = "UNAVAILABLE";
        if (!this.f7162d || TextUtils.isEmpty(this.f7175r)) {
            str = "UNAVAILABLE";
        } else {
            str = this.f7175r;
        }
        sb2.append(str);
        sb2.append("\nAdapter - ");
        if (this.f7163f && !TextUtils.isEmpty(this.f7176s)) {
            str2 = this.f7176s;
        }
        sb2.append(str2);
        for (C4468gh c4468gh : m98203n()) {
            if (!c4468gh.m98934c()) {
                sb2.append("\n* MISSING ");
                sb2.append(c4468gh.m98935b());
                sb2.append(": ");
                sb2.append(c4468gh.m98936a());
            }
        }
        for (C5050o6 c5050o6 : m98211f()) {
            if (!c5050o6.m96861c()) {
                sb2.append("\n* MISSING ");
                sb2.append(c5050o6.m96862b());
                sb2.append(": ");
                sb2.append(c5050o6.m96864a());
            }
        }
        return sb2.toString();
    }

    /* renamed from: k */
    public String m98206k() {
        return this.f7177t;
    }

    /* renamed from: l */
    public List m98205l() {
        return this.f7150B;
    }

    /* renamed from: m */
    public String m98204m() {
        return this.f7172o;
    }

    /* renamed from: n */
    public List m98203n() {
        return this.f7182y;
    }

    /* renamed from: o */
    public final C5416j m98202o() {
        return this.f7159a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f7174q.equals(string)) {
            this.f7161c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter m92410a = AbstractC5969ze.m92410a(string, this.f7159a);
            if (m92410a != null) {
                String m92414a = AbstractC5969ze.m92414a(m92410a);
                if (!this.f7175r.equals(m92414a)) {
                    this.f7175r = m92414a;
                    this.f7159a.m95060q().m95211a(this.f7175r, string);
                }
            }
        }
    }

    /* renamed from: p */
    public String m98201p() {
        return this.f7175r;
    }

    /* renamed from: q */
    public EnumC4649a m98200q() {
        return this.f7160b;
    }

    /* renamed from: r */
    public List m98199r() {
        return this.f7181x;
    }

    /* renamed from: s */
    public List m98198s() {
        return this.f7149A;
    }

    /* renamed from: t */
    public C5280rn m98197t() {
        return this.f7155G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f7172o + ", displayName=" + this.f7173p + ", sdkAvailable=" + this.f7162d + ", sdkVersion=" + this.f7175r + ", adapterAvailable=" + this.f7163f + ", adapterVersion=" + this.f7176s + "}";
    }

    /* renamed from: u */
    public List m98196u() {
        return this.f7151C;
    }

    /* renamed from: v */
    public String m98195v() {
        return this.f7178u;
    }

    /* renamed from: w */
    public String m98194w() {
        return this.f7179v;
    }

    /* renamed from: x */
    public Map m98193x() {
        return this.f7152D;
    }

    /* renamed from: y */
    public EnumC4650b m98192y() {
        if (!this.f7166i) {
            return EnumC4650b.NOT_SUPPORTED;
        }
        EnumC4649a enumC4649a = this.f7160b;
        if (enumC4649a != EnumC4649a.COMPLETE && (enumC4649a != EnumC4649a.INCOMPLETE_INTEGRATION || !m98226E() || !m98230A())) {
            return EnumC4650b.INVALID_INTEGRATION;
        }
        if (!this.f7159a.m95076k0().m93409c()) {
            return EnumC4650b.DISABLED;
        }
        if (this.f7167j && (this.f7161c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f7161c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) {
            return EnumC4650b.NOT_INITIALIZED;
        }
        return EnumC4650b.READY;
    }

    /* renamed from: z */
    public boolean m98191z() {
        return this.f7153E;
    }

    /* renamed from: a */
    private EnumC4649a m98221a() {
        EnumC4649a enumC4649a;
        if (this.f7162d) {
            if (this.f7163f) {
                enumC4649a = EnumC4649a.COMPLETE;
            } else if (this.f7165h) {
                enumC4649a = EnumC4649a.MISSING;
            } else {
                enumC4649a = EnumC4649a.INCOMPLETE_INTEGRATION;
            }
        } else if (this.f7163f) {
            enumC4649a = EnumC4649a.INCOMPLETE_INTEGRATION;
        } else {
            enumC4649a = EnumC4649a.MISSING;
        }
        if (enumC4649a == EnumC4649a.MISSING) {
            return enumC4649a;
        }
        for (C4468gh c4468gh : this.f7182y) {
            if (!c4468gh.m98934c()) {
                return EnumC4649a.INVALID_INTEGRATION;
            }
        }
        for (C5050o6 c5050o6 : this.f7183z) {
            if (!c5050o6.m96861c()) {
                return EnumC4649a.INVALID_INTEGRATION;
            }
        }
        return (!this.f7171n || C5416j.m95042w0()) ? enumC4649a : EnumC4649a.INVALID_INTEGRATION;
    }

    /* renamed from: a */
    private List m98216a(JSONObject jSONObject, String str, C5416j c5416j) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C5050o6(jSONObject2, c5416j));
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && C5050o6.m96863a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new C5050o6(jSONObject3, c5416j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List m98217a(JSONObject jSONObject, C5416j c5416j) {
        ArrayList arrayList = new ArrayList();
        if (this.f7174q.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            C4468gh c4468gh = new C4468gh("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", C5416j.m95072m());
            if (c4468gh.m98934c()) {
                arrayList.add(c4468gh);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new C4468gh(next, jSONObject2.getString(next), C5416j.m95072m()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List m98219a(MaxAdapter maxAdapter, boolean z) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    /* renamed from: a */
    private List m98218a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }
}
