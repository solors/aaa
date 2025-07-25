package sg.bigo.ads.controller.p947c;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.C43549b;
import sg.bigo.ads.api.core.C43568j;
import sg.bigo.ads.api.core.C43578p;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.api.core.InterfaceC43564h;
import sg.bigo.ads.api.p903a.C43525i;
import sg.bigo.ads.api.p903a.InterfaceC43518e;
import sg.bigo.ads.api.p903a.InterfaceC43528l;
import sg.bigo.ads.api.p903a.InterfaceC43529m;
import sg.bigo.ads.common.utils.C43829l;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.controller.p946b.C43978j;
import sg.bigo.ads.core.p958c.C44136b;

/* renamed from: sg.bigo.ads.controller.c.b */
/* loaded from: classes10.dex */
public class C43981b implements InterfaceC43550c {

    /* renamed from: A */
    int f115240A;

    /* renamed from: B */
    public final Map<String, String> f115241B;
    @Nullable

    /* renamed from: C */
    private JSONObject f115242C;

    /* renamed from: D */
    private final long f115243D;

    /* renamed from: F */
    private final long f115245F;
    @NonNull

    /* renamed from: G */
    private final InterfaceC43564h f115246G;

    /* renamed from: H */
    private long f115247H;

    /* renamed from: I */
    private int f115248I;

    /* renamed from: J */
    private int f115249J;

    /* renamed from: L */
    private boolean f115251L;

    /* renamed from: M */
    private long f115252M;

    /* renamed from: N */
    private final String f115253N;

    /* renamed from: O */
    private String f115254O;

    /* renamed from: P */
    private boolean f115255P;

    /* renamed from: Q */
    private boolean f115256Q;

    /* renamed from: R */
    private String f115257R;

    /* renamed from: T */
    private final double f115259T;

    /* renamed from: U */
    private String f115260U;

    /* renamed from: V */
    private final boolean f115261V;

    /* renamed from: W */
    private String f115262W;

    /* renamed from: X */
    private String f115263X;

    /* renamed from: Y */
    private String f115264Y;

    /* renamed from: Z */
    private InterfaceC43550c.InterfaceC43554d f115265Z;
    @Nullable

    /* renamed from: a */
    List<InterfaceC43550c> f115266a;

    /* renamed from: aa */
    private String f115267aa;

    /* renamed from: ab */
    private int f115268ab;

    /* renamed from: ac */
    private int f115269ac;

    /* renamed from: ad */
    private boolean f115270ad;

    /* renamed from: ae */
    private int f115271ae;

    /* renamed from: af */
    private boolean f115272af;

    /* renamed from: ah */
    private int f115274ah;

    /* renamed from: ai */
    private int f115275ai;

    /* renamed from: aj */
    private C43578p f115276aj;

    /* renamed from: ak */
    private String f115277ak;

    /* renamed from: al */
    private int f115278al;

    /* renamed from: am */
    private int f115279am;

    /* renamed from: an */
    private int f115280an;

    /* renamed from: ao */
    private int f115281ao;
    @NonNull

    /* renamed from: b */
    protected final InterfaceC43528l f115283b;
    @NonNull

    /* renamed from: c */
    protected String f115284c;
    @Nullable

    /* renamed from: d */
    protected String f115285d;
    @Nullable

    /* renamed from: e */
    protected String f115286e;
    @Nullable

    /* renamed from: f */
    protected String f115287f;
    @NonNull

    /* renamed from: g */
    protected final String f115288g;

    /* renamed from: h */
    protected int f115289h;

    /* renamed from: i */
    protected int f115290i;

    /* renamed from: j */
    protected long f115291j;
    @Nullable

    /* renamed from: k */
    protected String f115292k;
    @Nullable

    /* renamed from: l */
    protected String f115293l;
    @Nullable

    /* renamed from: m */
    protected InterfaceC43550c.InterfaceC43555e f115294m;
    @Nullable

    /* renamed from: n */
    protected InterfaceC43550c.InterfaceC43556f[] f115295n;
    @Nullable

    /* renamed from: o */
    protected InterfaceC43550c.InterfaceC43556f[] f115296o;
    @Nullable

    /* renamed from: p */
    protected InterfaceC43550c.InterfaceC43556f[] f115297p;
    @Nullable

    /* renamed from: q */
    protected InterfaceC43550c.InterfaceC43556f[] f115298q;
    @Nullable

    /* renamed from: r */
    protected List<InterfaceC43550c.InterfaceC43553c> f115299r;
    @Nullable

    /* renamed from: s */
    protected String f115300s;

    /* renamed from: t */
    protected long f115301t;
    @Nullable

    /* renamed from: u */
    protected String f115302u;
    @Nullable

    /* renamed from: v */
    protected String f115303v;
    @NonNull

    /* renamed from: w */
    protected InterfaceC43550c.InterfaceC43552b f115304w;

    /* renamed from: x */
    protected InterfaceC43550c.InterfaceC43551a f115305x;

    /* renamed from: y */
    InterfaceC43529m f115306y;

    /* renamed from: z */
    public String f115307z;

    /* renamed from: K */
    private int f115250K = 0;

    /* renamed from: S */
    private int f115258S = 2;

    /* renamed from: ag */
    private int f115273ag = 1;

    /* renamed from: ap */
    private C43568j f115282ap = new C43568j();

    /* renamed from: E */
    private final long f115244E = SystemClock.elapsedRealtime();

    /* JADX INFO: Access modifiers changed from: protected */
    public C43981b(long j, @NonNull InterfaceC43564h interfaceC43564h, @NonNull InterfaceC43528l interfaceC43528l, @NonNull JSONObject jSONObject) {
        boolean z;
        boolean z2;
        this.f115278al = 1;
        this.f115279am = 0;
        this.f115280an = 1;
        this.f115245F = j;
        this.f115246G = interfaceC43564h;
        this.f115283b = interfaceC43528l;
        this.f115284c = jSONObject.optString("ad_id", "");
        this.f115285d = jSONObject.optString("title", "");
        this.f115286e = jSONObject.optString("description", "");
        this.f115287f = jSONObject.optString("cta", "");
        String optString = jSONObject.optString("dsp_name", "");
        this.f115288g = optString;
        this.f115261V = "BigoDsp".equalsIgnoreCase(optString);
        this.f115289h = jSONObject.optInt("adx_type", 0);
        this.f115290i = jSONObject.optInt("ad_type", -1);
        this.f115291j = jSONObject.optLong("sid");
        this.f115292k = jSONObject.optString("creative_id", "");
        this.f115293l = jSONObject.optString("series_id", "");
        JSONObject optJSONObject = jSONObject.optJSONObject("privacy");
        if (optJSONObject != null) {
            this.f115294m = new C43994o(optJSONObject);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("track_clicks_third");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    arrayList.add(new C43995p(optJSONObject2));
                }
            }
            InterfaceC43550c.InterfaceC43556f[] interfaceC43556fArr = new InterfaceC43550c.InterfaceC43556f[arrayList.size()];
            this.f115296o = interfaceC43556fArr;
            this.f115296o = (InterfaceC43550c.InterfaceC43556f[]) arrayList.toArray(interfaceC43556fArr);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("track_impls_third");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject3 != null) {
                    arrayList2.add(new C43995p(optJSONObject3));
                }
            }
            InterfaceC43550c.InterfaceC43556f[] interfaceC43556fArr2 = new InterfaceC43550c.InterfaceC43556f[arrayList2.size()];
            this.f115295n = interfaceC43556fArr2;
            this.f115295n = (InterfaceC43550c.InterfaceC43556f[]) arrayList2.toArray(interfaceC43556fArr2);
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("ad_nurls");
        if (optJSONArray3 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                JSONObject optJSONObject4 = optJSONArray3.optJSONObject(i3);
                if (optJSONObject4 != null) {
                    arrayList3.add(new C43995p(optJSONObject4));
                }
            }
            InterfaceC43550c.InterfaceC43556f[] interfaceC43556fArr3 = new InterfaceC43550c.InterfaceC43556f[arrayList3.size()];
            this.f115297p = interfaceC43556fArr3;
            this.f115297p = (InterfaceC43550c.InterfaceC43556f[]) arrayList3.toArray(interfaceC43556fArr3);
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("ad_lurls");
        if (optJSONArray4 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                JSONObject optJSONObject5 = optJSONArray4.optJSONObject(i4);
                if (optJSONObject5 != null) {
                    arrayList4.add(new C43995p(optJSONObject5));
                }
            }
            InterfaceC43550c.InterfaceC43556f[] interfaceC43556fArr4 = new InterfaceC43550c.InterfaceC43556f[arrayList4.size()];
            this.f115298q = interfaceC43556fArr4;
            this.f115298q = (InterfaceC43550c.InterfaceC43556f[]) arrayList4.toArray(interfaceC43556fArr4);
        }
        this.f115299r = new ArrayList();
        JSONArray optJSONArray5 = jSONObject.optJSONArray("om_data");
        if (optJSONArray5 != null) {
            this.f115299r = new ArrayList();
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                this.f115299r.add(new C43992m(optJSONArray5.optJSONObject(i5)));
            }
        }
        this.f115300s = jSONObject.optString("enc_price", "");
        this.f115304w = new C43990k(jSONObject);
        this.f115305x = new C43985f(jSONObject);
        this.f115301t = jSONObject.optLong("switch_bit_map", 0L);
        this.f115302u = jSONObject.optString("abflags", "");
        this.f115243D = jSONObject.optLong("expired_interval", 0L);
        this.f115303v = jSONObject.optString("mapping_slot", "");
        this.f115247H = jSONObject.optLong("probe_interval");
        this.f115248I = jSONObject.optInt("playable_ad_switch", 0);
        this.f115307z = jSONObject.optString("req_slot");
        String optString2 = jSONObject.optString("interstitial_style_getad_config");
        if (!TextUtils.isEmpty(optString2)) {
            try {
                this.f115306y = new C43978j(new JSONObject(optString2));
            } catch (JSONException unused) {
            }
        }
        this.f115282ap.m5397a(jSONObject.optString("ad_form"));
        this.f115254O = jSONObject.optString(C21114v8.C21122h.f54027F0);
        this.f115253N = jSONObject.optString("sdk_style_id");
        if (jSONObject.optInt("banner_show_ad", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f115255P = z;
        if (jSONObject.optInt("banner_show_domain", 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f115256Q = z2;
        this.f115257R = jSONObject.optString("ru_ad_marker");
        this.f115259T = (jSONObject.optLong(Reporting.Key.BID_PRICE, 0L) * 1.0d) / 1.0E8d;
        this.f115260U = jSONObject.optString("adx_country");
        this.f115275ai = jSONObject.optInt("orientation", 0);
        if (C43549b.m5416d(this.f115290i)) {
            this.f115242C = jSONObject;
        }
        this.f115262W = jSONObject.optString("ad_bundle_id", "");
        this.f115263X = jSONObject.optString("pop_h5");
        this.f115264Y = jSONObject.optString("pop_img");
        JSONObject optJSONObject6 = jSONObject.optJSONObject("pop_page");
        if (optJSONObject6 != null) {
            this.f115265Z = new C43993n(optJSONObject6);
        }
        int optInt = jSONObject.optInt("ad_resp_type");
        this.f115240A = optInt;
        if (optInt == 1) {
            m4373a(jSONObject, j, interfaceC43564h, interfaceC43528l);
        }
        this.f115241B = C43829l.m4869a(jSONObject.optString("pub_extra_info"));
        this.f115277ak = jSONObject.optString("dsp_extra");
        this.f115278al = jSONObject.optInt("native_banner_fill_strategy", 1);
        this.f115279am = jSONObject.optInt("guide_type", 0);
        this.f115280an = jSONObject.optInt("native_banner_click_type", 0);
        this.f115281ao = jSONObject.optInt("is_interactive", 0);
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: A */
    public final String mo4406A() {
        return this.f115293l;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: B */
    public final InterfaceC43550c.InterfaceC43555e mo4405B() {
        return this.f115294m;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: C */
    public final InterfaceC43550c.InterfaceC43556f[] mo4404C() {
        return this.f115295n;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: D */
    public final InterfaceC43550c.InterfaceC43556f[] mo4403D() {
        return this.f115296o;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: E */
    public final InterfaceC43550c.InterfaceC43556f[] mo4402E() {
        return this.f115297p;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: F */
    public final InterfaceC43550c.InterfaceC43556f[] mo4401F() {
        return this.f115298q;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: G */
    public final List<InterfaceC43550c.InterfaceC43553c> mo4400G() {
        return this.f115299r;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: H */
    public final String mo4399H() {
        return this.f115300s;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: I */
    public final String mo4398I() {
        return this.f115302u;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: J */
    public final boolean mo4397J() {
        if (this.f115251L && this.f115252M > 0) {
            if (System.currentTimeMillis() > this.f115252M) {
                return true;
            }
            return false;
        } else if (SystemClock.elapsedRealtime() - this.f115244E >= this.f115243D * 1000) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[RETURN] */
    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo4396K() {
        /*
            r9 = this;
            boolean r0 = r9.f115251L
            r1 = 0
            if (r0 == 0) goto L1e
            long r3 = r9.f115252M
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1e
            long r5 = r9.f115243D
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1c
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            goto L26
        L1c:
            r5 = r1
            goto L26
        L1e:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r9.f115244E
            long r5 = r3 - r5
        L26:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
            return r5
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.p947c.C43981b.mo4396K():long");
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: L */
    public final long mo4395L() {
        return this.f115243D;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: M */
    public final String mo4394M() {
        return this.f115303v;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @NonNull
    /* renamed from: N */
    public final InterfaceC43550c.InterfaceC43552b mo4393N() {
        return this.f115304w;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: O */
    public final InterfaceC43550c.InterfaceC43551a mo4392O() {
        return this.f115305x;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: P */
    public final int mo4391P() {
        return this.f115240A;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: Q */
    public final String mo4390Q() {
        return this.f115267aa;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: R */
    public final int mo4389R() {
        return this.f115268ab;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: S */
    public final void mo4388S() {
        this.f115268ab = this.f115269ac;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: T */
    public final void mo4387T() {
        this.f115270ad = true;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: U */
    public final boolean mo4386U() {
        return this.f115270ad;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: V */
    public final int mo4385V() {
        return this.f115271ae;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: W */
    public final int mo4384W() {
        return this.f115273ag;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: X */
    public final int mo4383X() {
        return this.f115274ah;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: Y */
    public final C43578p mo4382Y() {
        return this.f115276aj;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: Z */
    public final long mo4381Z() {
        return this.f115245F;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @NonNull
    /* renamed from: a */
    public final long mo4380a() {
        return C43525i.f114036a.mo4465h();
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @NonNull
    /* renamed from: aa */
    public final InterfaceC43564h mo4370aa() {
        return this.f115246G;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: ab */
    public final String mo4369ab() {
        int i = this.f115290i;
        if (i == 3 && this.f115289h == 3) {
            return "1999999";
        }
        if (i == 4 && this.f115289h == 3) {
            return "2999999";
        }
        if (!C43836q.m4837a((CharSequence) this.f115253N)) {
            return this.f115253N;
        }
        return this.f115283b.mo4423p();
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: ac */
    public final boolean mo4368ac() {
        if (this.f115248I == 1) {
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: ad */
    public final int mo4367ad() {
        return this.f115249J;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: ae */
    public final int mo4366ae() {
        return this.f115250K;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: af */
    public final JSONObject mo4365af() {
        return this.f115242C;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: ag */
    public final void mo4364ag() {
        this.f115251L = true;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: ah */
    public final boolean mo4363ah() {
        return this.f115251L;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: ai */
    public final double mo4362ai() {
        return this.f115259T;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: aj */
    public final int mo4361aj() {
        return this.f115283b.mo4417v();
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: ak */
    public final boolean mo4360ak() {
        if (this.f115283b.mo4417v() == 2) {
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: al */
    public final boolean mo4359al() {
        return this.f115261V;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: am */
    public final List<InterfaceC43550c> mo4358am() {
        return this.f115266a;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: an */
    public final String mo4357an() {
        return this.f115277ak;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: ao */
    public final int mo4356ao() {
        return this.f115278al;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: ap */
    public final int mo4355ap() {
        return this.f115279am;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: aq */
    public final int mo4354aq() {
        return this.f115280an;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: ar */
    public final boolean mo4353ar() {
        if (this.f115275ai == 1) {
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: as */
    public final int mo4352as() {
        return this.f115281ao;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @NonNull
    /* renamed from: b */
    public final String mo4351b() {
        return this.f115283b.mo4427l();
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @NonNull
    /* renamed from: c */
    public final String mo4348c() {
        return this.f115283b.mo4425n();
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @NonNull
    /* renamed from: d */
    public final InterfaceC43528l mo4346d() {
        return this.f115283b;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: e */
    public final InterfaceC43529m mo4344e() {
        return this.f115306y;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @NonNull
    /* renamed from: f */
    public final InterfaceC43518e mo4342f() {
        return this.f115282ap;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: g */
    public final int mo4341g() {
        return this.f115258S;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: h */
    public final boolean mo4340h() {
        InterfaceC43529m interfaceC43529m = this.f115306y;
        if (interfaceC43529m == null || interfaceC43529m.mo4413a("endpage.ad_component_layout") != 5) {
            return false;
        }
        return true;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: i */
    public final String mo4339i() {
        return this.f115254O;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: j */
    public final boolean mo4338j() {
        return this.f115255P;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: k */
    public final boolean mo4337k() {
        return this.f115256Q;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: l */
    public final String mo4336l() {
        return this.f115257R;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: m */
    public final String mo4335m() {
        return this.f115260U;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: n */
    public final String mo4334n() {
        return this.f115262W;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: o */
    public final String mo4333o() {
        return this.f115263X;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: p */
    public final String mo4332p() {
        return this.f115264Y;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: q */
    public final InterfaceC43550c.InterfaceC43554d mo4331q() {
        return this.f115265Z;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @NonNull
    /* renamed from: r */
    public final String mo4330r() {
        return this.f115284c;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: s */
    public String mo4225s() {
        if (!C43836q.m4837a((CharSequence) this.f115285d)) {
            return this.f115285d;
        }
        InterfaceC43550c.InterfaceC43554d interfaceC43554d = this.f115265Z;
        if (interfaceC43554d != null && !C43836q.m4837a((CharSequence) interfaceC43554d.mo4219b())) {
            return this.f115265Z.mo4219b();
        }
        return this.f115285d;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: t */
    public String mo4224t() {
        if (!C43836q.m4837a((CharSequence) this.f115286e)) {
            return this.f115286e;
        }
        InterfaceC43550c.InterfaceC43554d interfaceC43554d = this.f115265Z;
        if (interfaceC43554d != null && !C43836q.m4837a((CharSequence) interfaceC43554d.mo4218c())) {
            return this.f115265Z.mo4218c();
        }
        return this.f115286e;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: u */
    public final String mo4329u() {
        return this.f115287f;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @NonNull
    /* renamed from: v */
    public final String mo4328v() {
        return this.f115288g;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: w */
    public final int mo4327w() {
        return this.f115289h;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: x */
    public final int mo4326x() {
        return this.f115290i;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: y */
    public final long mo4325y() {
        return this.f115291j;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    @Nullable
    /* renamed from: z */
    public final String mo4324z() {
        return this.f115292k;
    }

    @Nullable
    /* renamed from: a */
    public static C43981b m4376a(long j, @NonNull InterfaceC43564h interfaceC43564h, @NonNull InterfaceC43528l interfaceC43528l, String str) {
        try {
            return m4375a(j, interfaceC43564h, interfaceC43528l, new JSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: b */
    public final String mo4349b(String str) {
        if (str == null) {
            return "";
        }
        Map<String, String> map = this.f115241B;
        String str2 = map != null ? map.get(str) : "";
        return str2 == null ? "" : str2;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: c */
    public final void mo4347c(int i) {
        this.f115271ae = i;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: d */
    public final void mo4345d(int i) {
        this.f115249J = i;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: e */
    public final void mo4343e(int i) {
        this.f115250K = i;
    }

    @Nullable
    /* renamed from: a */
    public static C43981b m4375a(long j, InterfaceC43564h interfaceC43564h, InterfaceC43528l interfaceC43528l, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("adx_type", 0);
        if (optInt != 1 && optInt != 2) {
            if (optInt == 3) {
                return new C43983d(j, interfaceC43564h, interfaceC43528l, jSONObject);
            }
            if (optInt != 5) {
                return null;
            }
        }
        return new C43991l(j, interfaceC43564h, interfaceC43528l, jSONObject);
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: b */
    public final void mo4350b(int i) {
        this.f115269ac = i;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: a */
    public final void mo4378a(int i, int i2, boolean z) {
        if (!this.f115272af || z) {
            this.f115272af = true;
            this.f115273ag = i;
            this.f115274ah = i2;
        }
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: a */
    public final void mo4377a(long j) {
        this.f115252M = j;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: a */
    public final void mo4374a(String str) {
        this.f115267aa = str;
    }

    /* renamed from: a */
    private void m4373a(JSONObject jSONObject, long j, InterfaceC43564h interfaceC43564h, InterfaceC43528l interfaceC43528l) {
        JSONArray optJSONArray = jSONObject.optJSONArray(BaseCampaignUnit.JSON_KEY_ADS);
        ArrayList arrayList = null;
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C43981b m4375a = m4375a(j, interfaceC43564h, interfaceC43528l, optJSONObject);
                    if (m4375a != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        m4375a.f115240A = this.f115240A;
                        arrayList.add(m4375a);
                    } else {
                        C44136b.m3908a(1005, 10205, "Error ad in ads");
                    }
                }
            }
        }
        this.f115266a = arrayList;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: a */
    public final void mo4372a(C43578p c43578p) {
        this.f115276aj = c43578p;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: a */
    public final void mo4371a(boolean z) {
        this.f115258S = z ? 1 : 2;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c
    /* renamed from: a */
    public final boolean mo4379a(int i) {
        return (this.f115301t & ((long) i)) > 0;
    }
}
