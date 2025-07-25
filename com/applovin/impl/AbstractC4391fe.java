package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.arch.core.util.Function;
import com.applovin.impl.mediation.C4906g;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.C5434n;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.fe */
/* loaded from: classes2.dex */
public abstract class AbstractC4391fe extends C5067oe implements MaxAd {

    /* renamed from: l */
    private final int f6102l;

    /* renamed from: m */
    private final AtomicBoolean f6103m;

    /* renamed from: n */
    private final AtomicBoolean f6104n;

    /* renamed from: o */
    protected C4906g f6105o;

    /* renamed from: p */
    private final String f6106p;

    /* renamed from: q */
    private MaxAdWaterfallInfo f6107q;

    /* renamed from: r */
    private long f6108r;

    /* renamed from: s */
    private String f6109s;

    /* renamed from: t */
    private String f6110t;

    /* renamed from: u */
    private C4117bd f6111u;

    public AbstractC4391fe(int i, Map map, JSONObject jSONObject, JSONObject jSONObject2, C4906g c4906g, C5416j c5416j) {
        super(map, jSONObject, jSONObject2, c5416j);
        String str;
        this.f6103m = new AtomicBoolean();
        this.f6104n = new AtomicBoolean();
        this.f6102l = i;
        this.f6105o = c4906g;
        if (c4906g != null) {
            str = c4906g.m97204b();
        } else {
            str = null;
        }
        this.f6106p = str;
    }

    /* renamed from: L */
    private long m99229L() {
        return m96729a("load_started_time_ms", 0L);
    }

    /* renamed from: a */
    public static AbstractC4391fe m99214a(int i, Map map, JSONObject jSONObject, JSONObject jSONObject2, C5416j c5416j) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(formatFromString, "Invalid ad format for string: " + string);
        if (formatFromString.isAdViewAd()) {
            return new C4465ge(i, map, jSONObject, jSONObject2, c5416j);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new C4584ie(i, map, jSONObject, jSONObject2, c5416j);
        }
        if (formatFromString.isFullscreenAd()) {
            return new C4523he(i, map, jSONObject, jSONObject2, c5416j);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    /* renamed from: b */
    public static /* synthetic */ JSONObject m99209b(C5567tl c5567tl) {
        return JsonUtils.deepCopy(c5567tl.m94417a("ad_values", new JSONObject()));
    }

    /* renamed from: c */
    public /* synthetic */ Bundle m99206c(C5567tl c5567tl) {
        JSONObject m94417a;
        if (c5567tl.m94427a("credentials")) {
            m94417a = c5567tl.m94417a("credentials", new JSONObject());
        } else {
            m94417a = c5567tl.m94417a("server_parameters", new JSONObject());
            JsonUtils.putString(m94417a, "placement_id", m99221T());
        }
        return JsonUtils.toBundle(m94417a);
    }

    /* renamed from: d */
    public static /* synthetic */ C4117bd m99204d(C5567tl c5567tl) {
        return new C4117bd(c5567tl.m94417a("hybrid_ad_config", (JSONObject) null));
    }

    /* renamed from: e */
    public static /* synthetic */ JSONObject m99202e(C5567tl c5567tl) {
        return JsonUtils.deepCopy(c5567tl.m94417a("publisher_extra_info", new JSONObject()));
    }

    /* renamed from: f */
    public static /* synthetic */ Double m99200f(C5567tl c5567tl) {
        return Double.valueOf(JsonUtils.getDouble(c5567tl.m94417a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* renamed from: g */
    public static /* synthetic */ JSONObject m99199g(C5567tl c5567tl) {
        return JsonUtils.deepCopy(c5567tl.m94417a("revenue_parameters", new JSONObject()));
    }

    /* renamed from: h */
    public static /* synthetic */ String m99198h(C5567tl c5567tl) {
        return JsonUtils.getString(c5567tl.m94417a("revenue_parameters", (JSONObject) null), ImpressionData.IMPRESSION_DATA_KEY_PRECISION, "");
    }

    /* renamed from: A */
    public C4906g m99240A() {
        return this.f6105o;
    }

    /* renamed from: B */
    public String m99239B() {
        return m96726a("bcode", "");
    }

    /* renamed from: C */
    public long m99238C() {
        return m96729a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, m96697l()));
    }

    /* renamed from: D */
    public String m99237D() {
        return m96726a("bid_response", (String) null);
    }

    /* renamed from: E */
    public long m99236E() {
        return m96729a("bwt_ms", ((Long) this.f8829a.m95144a(AbstractC5634ue.f11206B7)).longValue());
    }

    /* renamed from: F */
    public Bundle m99235F() {
        JSONObject m96724a;
        C5567tl c5567tl = this.f8836i;
        if (c5567tl != null) {
            return (Bundle) c5567tl.m94429a(new Function() { // from class: com.applovin.impl.rw
                {
                    AbstractC4391fe.this = this;
                }

                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Bundle m99206c;
                    m99206c = AbstractC4391fe.this.m99206c((C5567tl) obj);
                    return m99206c;
                }
            });
        }
        if (m96714c("credentials")) {
            m96724a = m96724a("credentials", new JSONObject());
        } else {
            m96724a = m96724a("server_parameters", new JSONObject());
            JsonUtils.putString(m96724a, "placement_id", m99221T());
        }
        return JsonUtils.toBundle(m96724a);
    }

    /* renamed from: G */
    public long m99234G() {
        if (m99229L() > 0) {
            return m99230K() - m99229L();
        }
        return -1L;
    }

    /* renamed from: H */
    public C4117bd m99233H() {
        C4117bd c4117bd = this.f6111u;
        if (c4117bd != null) {
            return c4117bd;
        }
        C5567tl c5567tl = this.f8836i;
        if (c5567tl != null) {
            this.f6111u = (C4117bd) c5567tl.m94429a(new Function() { // from class: com.applovin.impl.qw
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    C4117bd m99204d;
                    m99204d = AbstractC4391fe.m99204d((C5567tl) obj);
                    return m99204d;
                }
            });
        } else {
            this.f6111u = new C4117bd(m96724a("hybrid_ad_config", (JSONObject) null));
        }
        return this.f6111u;
    }

    /* renamed from: I */
    public MaxAdFormat m99232I() {
        String m96726a = m96726a("haf", (String) null);
        if (!StringUtils.isValidString(m96726a)) {
            return null;
        }
        return MaxAdFormat.formatFromString(m96726a);
    }

    /* renamed from: J */
    public int m99231J() {
        return this.f6102l;
    }

    /* renamed from: K */
    public long m99230K() {
        return m96729a("load_completed_time_ms", 0L);
    }

    /* renamed from: M */
    public String m99228M() {
        return this.f6109s;
    }

    /* renamed from: N */
    public double m99227N() {
        return m96731a("price", -1.0f);
    }

    /* renamed from: O */
    public JSONObject m99226O() {
        C5567tl c5567tl = this.f8836i;
        if (c5567tl != null) {
            return (JSONObject) c5567tl.m94429a(new Function() { // from class: com.applovin.impl.ow
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    JSONObject m99202e;
                    m99202e = AbstractC4391fe.m99202e((C5567tl) obj);
                    return m99202e;
                }
            });
        }
        return m96724a("publisher_extra_info", new JSONObject());
    }

    /* renamed from: P */
    public String m99225P() {
        return JsonUtils.getString(m99224Q(), "revenue_event", "");
    }

    /* renamed from: Q */
    public JSONObject m99224Q() {
        C5567tl c5567tl = this.f8836i;
        if (c5567tl != null) {
            return (JSONObject) c5567tl.m94429a(new Function() { // from class: com.applovin.impl.nw
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    JSONObject m99199g;
                    m99199g = AbstractC4391fe.m99199g((C5567tl) obj);
                    return m99199g;
                }
            });
        }
        return m96724a("revenue_parameters", new JSONObject());
    }

    /* renamed from: R */
    public String m99223R() {
        return m96717b("event_id", "");
    }

    /* renamed from: S */
    public long m99222S() {
        return m96729a("twt_ms", ((Long) this.f8829a.m95144a(AbstractC5634ue.f11207C7)).longValue());
    }

    /* renamed from: T */
    public String m99221T() {
        return m96726a("third_party_ad_placement_id", (String) null);
    }

    /* renamed from: U */
    public List m99220U() {
        return m96722b("mwf_info_urls");
    }

    /* renamed from: V */
    public String m99219V() {
        return m96717b("waterfall_name", "");
    }

    /* renamed from: W */
    public String m99218W() {
        return m96717b("waterfall_test_name", "");
    }

    /* renamed from: X */
    public boolean m99217X() {
        return StringUtils.isValidString(m99237D());
    }

    /* renamed from: Y */
    public boolean m99216Y() {
        if (m99232I() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public boolean m99215Z() {
        return m96728a("is_js_tag_ad", Boolean.FALSE).booleanValue();
    }

    /* renamed from: a */
    public abstract AbstractC4391fe mo98442a(C4906g c4906g);

    /* renamed from: a0 */
    public boolean m99210a0() {
        C4906g c4906g = this.f6105o;
        if (c4906g == null || !c4906g.m97168k() || !this.f6105o.m97170j()) {
            return false;
        }
        return true;
    }

    /* renamed from: b0 */
    public boolean m99207b0() {
        return m96728a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    /* renamed from: c0 */
    public boolean m99205c0() {
        return m96728a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    /* renamed from: d0 */
    public void m99203d0() {
        m96712c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    /* renamed from: e0 */
    public void m99201e0() {
        m96712c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f6110t;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return m96726a("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return m96726a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return m96726a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(m96726a("ad_format", m96717b("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        C4906g c4906g = this.f6105o;
        if (c4906g != null) {
            return c4906g.m97185e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return m96726a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(m99221T());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f6108r;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (((Boolean) this.f8829a.m95144a(AbstractC5634ue.f11267y7)).booleanValue() && getFormat().isFullscreenAd() && !m99193u().get()) {
            this.f8829a.m95186I();
            if (C5434n.m94914a()) {
                this.f8829a.m95186I().m94907b("MediatedAd", "Attempting to retrieve revenue when not available yet");
                return 0.0d;
            }
            return 0.0d;
        }
        C5567tl c5567tl = this.f8836i;
        if (c5567tl != null) {
            return ((Double) c5567tl.m94429a(new Function() { // from class: com.applovin.impl.sw
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Double m99200f;
                    m99200f = AbstractC4391fe.m99200f((C5567tl) obj);
                    return m99200f;
                }
            })).doubleValue();
        }
        return JsonUtils.getDouble(m96724a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        C5567tl c5567tl = this.f8836i;
        if (c5567tl != null) {
            return (String) c5567tl.m94429a(new Function() { // from class: com.applovin.impl.pw
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    String m99198h;
                    m99198h = AbstractC4391fe.m99198h((C5567tl) obj);
                    return m99198h;
                }
            });
        }
        return JsonUtils.getString(m96724a("revenue_parameters", (JSONObject) null), ImpressionData.IMPRESSION_DATA_KEY_PRECISION, "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int m96730a = m96730a("ad_width", -3);
        int m96730a2 = m96730a("ad_height", -3);
        if (m96730a != -3 && m96730a2 != -3) {
            return new AppLovinSdkUtils.Size(m96730a, m96730a2);
        }
        return getFormat().getSize();
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f6107q;
    }

    /* renamed from: i */
    public void m99196i(String str) {
        this.f6109s = str;
    }

    @Override // com.applovin.impl.C5067oe
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + m99221T() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject m99187x = m99187x();
        if (m99187x.has(str)) {
            return JsonUtils.getString(m99187x, str, str2);
        }
        Bundle m96697l = m96697l();
        if (m96697l.containsKey(str)) {
            return m96697l.getString(str);
        }
        JSONObject m99226O = m99226O();
        if (m99226O.has(str)) {
            return JsonUtils.getString(m99226O, str, str2);
        }
        return m96726a(str, str2);
    }

    /* renamed from: t */
    public void m99195t() {
        this.f6105o = null;
        this.f6107q = null;
    }

    /* renamed from: u */
    public AtomicBoolean m99193u() {
        return this.f6103m;
    }

    /* renamed from: v */
    public String m99191v() {
        return m96726a("adomain", (String) null);
    }

    /* renamed from: w */
    public AtomicBoolean m99189w() {
        return this.f6104n;
    }

    /* renamed from: x */
    public JSONObject m99187x() {
        C5567tl c5567tl = this.f8836i;
        if (c5567tl != null) {
            return (JSONObject) c5567tl.m94429a(new Function() { // from class: com.applovin.impl.tw
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    JSONObject m99209b;
                    m99209b = AbstractC4391fe.m99209b((C5567tl) obj);
                    return m99209b;
                }
            });
        }
        return m96724a("ad_values", new JSONObject());
    }

    /* renamed from: y */
    public View m99185y() {
        C4906g c4906g;
        if (!m99210a0() || (c4906g = this.f6105o) == null) {
            return null;
        }
        return c4906g.m97190d();
    }

    /* renamed from: z */
    public String m99183z() {
        return this.f6106p;
    }

    /* renamed from: b */
    public void m99208b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject m99226O = m99226O();
        JsonUtils.putAll(m99226O, jSONObject);
        m96727a("publisher_extra_info", (Object) m99226O);
    }

    /* renamed from: h */
    public void m99197h(String str) {
        this.f6110t = str;
    }

    /* renamed from: a */
    public void m99213a(long j) {
        this.f6108r = j;
    }

    /* renamed from: a */
    public void m99212a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f6107q = maxAdWaterfallInfo;
    }

    /* renamed from: a */
    public void m99211a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject m99187x = m99187x();
        JsonUtils.putAll(m99187x, jSONObject);
        m96727a("ad_values", (Object) m99187x);
    }

    /* renamed from: a */
    public void mo98721a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("ad_values")) {
            m99211a(BundleUtils.toJSONObject(bundle.getBundle("ad_values")));
        }
        if (bundle.containsKey("creative_id") && !m96714c("creative_id")) {
            m96711c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !m96714c("ad_width") && bundle.containsKey("ad_height") && !m96714c("ad_height")) {
            int i = BundleUtils.getInt("ad_width", bundle);
            int i2 = BundleUtils.getInt("ad_height", bundle);
            m96713c("ad_width", i);
            m96713c("ad_height", i2);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            m99208b(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
