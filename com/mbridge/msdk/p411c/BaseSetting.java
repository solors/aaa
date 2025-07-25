package com.mbridge.msdk.p411c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.AtfEntity;
import com.mbridge.msdk.foundation.same.net.p447e.RequestUrlUtil;
import com.mbridge.msdk.foundation.tools.BaseSameDiTool;
import com.mbridge.msdk.foundation.tools.JsonUtils;
import com.mbridge.msdk.foundation.tools.ResourceUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.b */
/* loaded from: classes6.dex */
public class BaseSetting {

    /* renamed from: a */
    public static int f55078a = 1500;

    /* renamed from: G */
    private long f55085G;

    /* renamed from: I */
    private ArrayList<Integer> f55087I;

    /* renamed from: J */
    private EventLibMonitorSetting f55088J;

    /* renamed from: K */
    private C21778b f55089K;

    /* renamed from: P */
    private HashMap<String, String> f55094P;

    /* renamed from: Q */
    private String f55095Q;

    /* renamed from: V */
    private int f55100V;

    /* renamed from: Y */
    private String f55103Y;

    /* renamed from: Z */
    private Map<String, String> f55104Z;

    /* renamed from: aE */
    private boolean f55109aE;

    /* renamed from: aG */
    private JSONArray f55111aG;

    /* renamed from: aH */
    private JSONObject f55112aH;

    /* renamed from: aJ */
    private long f55114aJ;

    /* renamed from: aO */
    private long f55119aO;

    /* renamed from: aP */
    private boolean f55120aP;

    /* renamed from: aV */
    private String f55126aV;

    /* renamed from: ai */
    private int f55139ai;

    /* renamed from: al */
    private String f55142al;

    /* renamed from: am */
    private String f55143am;

    /* renamed from: ap */
    private int f55146ap;

    /* renamed from: aq */
    private int f55147aq;

    /* renamed from: ar */
    private int f55148ar;

    /* renamed from: as */
    private int f55149as;

    /* renamed from: av */
    private long f55152av;

    /* renamed from: aw */
    private long f55153aw;

    /* renamed from: bb */
    private int f55159bb;

    /* renamed from: bc */
    private String f55160bc;

    /* renamed from: m */
    private int f55171m;

    /* renamed from: o */
    private List<AtfEntity> f55173o;

    /* renamed from: q */
    private long f55175q;

    /* renamed from: r */
    private BCP f55176r;

    /* renamed from: s */
    private String f55177s;

    /* renamed from: t */
    private Map<String, C21777a> f55178t;

    /* renamed from: u */
    private boolean f55179u;

    /* renamed from: v */
    private int f55180v;

    /* renamed from: b */
    private boolean f55157b = false;

    /* renamed from: c */
    private JSONArray f55161c = new JSONArray();

    /* renamed from: d */
    private JSONArray f55162d = new JSONArray();

    /* renamed from: e */
    private String f55163e = "";

    /* renamed from: f */
    private int f55164f = 0;

    /* renamed from: g */
    private int f55165g = 0;

    /* renamed from: h */
    private int f55166h = 2;

    /* renamed from: i */
    private int f55167i = 0;

    /* renamed from: j */
    private String f55168j = "";

    /* renamed from: k */
    private String f55169k = "";

    /* renamed from: l */
    private String f55170l = "";

    /* renamed from: n */
    private int f55172n = 0;

    /* renamed from: p */
    private int f55174p = 0;

    /* renamed from: w */
    private int f55181w = 1;

    /* renamed from: x */
    private boolean f55182x = false;

    /* renamed from: y */
    private String f55183y = "";

    /* renamed from: z */
    private String f55184z = "";

    /* renamed from: A */
    private String f55079A = "";

    /* renamed from: B */
    private String f55080B = "";

    /* renamed from: C */
    private String f55081C = "";

    /* renamed from: D */
    private int f55082D = 120;

    /* renamed from: E */
    private String f55083E = RequestUrlUtil.m52180f().f56654h;

    /* renamed from: F */
    private String f55084F = RequestUrlUtil.m52180f().f56658l;

    /* renamed from: H */
    private int f55086H = f55078a;

    /* renamed from: L */
    private int f55090L = 0;

    /* renamed from: M */
    private long f55091M = 86400;

    /* renamed from: N */
    private int f55092N = 0;

    /* renamed from: O */
    private int f55093O = 3;

    /* renamed from: R */
    private boolean f55096R = true;

    /* renamed from: S */
    private int f55097S = 0;

    /* renamed from: T */
    private boolean f55098T = false;

    /* renamed from: U */
    private boolean f55099U = false;

    /* renamed from: W */
    private int f55101W = 0;

    /* renamed from: X */
    private int f55102X = 0;

    /* renamed from: aa */
    private String f55131aa = "1.0";

    /* renamed from: ab */
    private int f55132ab = 30;

    /* renamed from: ac */
    private int f55133ac = 9377;

    /* renamed from: ad */
    private int f55134ad = 0;

    /* renamed from: ae */
    private int f55135ae = 5;

    /* renamed from: af */
    private int f55136af = 1;

    /* renamed from: ag */
    private int f55137ag = 8000;

    /* renamed from: ah */
    private String f55138ah = "";

    /* renamed from: aj */
    private int f55140aj = 10;

    /* renamed from: ak */
    private int f55141ak = 120;

    /* renamed from: an */
    private String f55144an = "";

    /* renamed from: ao */
    private String f55145ao = "";

    /* renamed from: at */
    private String f55150at = "";

    /* renamed from: au */
    private String f55151au = "";

    /* renamed from: ax */
    private List<Integer> f55154ax = new ArrayList();

    /* renamed from: ay */
    private int f55155ay = 3;

    /* renamed from: az */
    private int f55156az = 0;

    /* renamed from: aA */
    private int f55105aA = 3;

    /* renamed from: aB */
    private int f55106aB = 0;

    /* renamed from: aC */
    private int f55107aC = 10;

    /* renamed from: aD */
    private int f55108aD = 600;

    /* renamed from: aF */
    private int f55110aF = 0;

    /* renamed from: aI */
    private String f55113aI = "";

    /* renamed from: aK */
    private int f55115aK = 8000;

    /* renamed from: aL */
    private int f55116aL = 1;

    /* renamed from: aM */
    private long f55117aM = 10;

    /* renamed from: aN */
    private int f55118aN = 3;

    /* renamed from: aQ */
    private int f55121aQ = 1;

    /* renamed from: aR */
    private int f55122aR = 1;

    /* renamed from: aS */
    private int f55123aS = 1;

    /* renamed from: aT */
    private int f55124aT = 1;

    /* renamed from: aU */
    private String f55125aU = "";

    /* renamed from: aW */
    private int f55127aW = IronSourceConstants.RV_AUCTION_REQUEST;

    /* renamed from: aX */
    private int f55128aX = 0;

    /* renamed from: aY */
    private int f55129aY = 0;

    /* renamed from: aZ */
    private long f55130aZ = 3600;

    /* renamed from: ba */
    private String f55158ba = "";

    /* compiled from: BaseSetting.java */
    /* renamed from: com.mbridge.msdk.c.b$a */
    /* loaded from: classes6.dex */
    public static class C21777a {

        /* renamed from: a */
        private List<String> f55185a;

        /* renamed from: b */
        private List<String> f55186b;

        /* renamed from: c */
        private List<String> f55187c;

        /* renamed from: d */
        private List<String> f55188d;

        /* renamed from: a */
        public final List<String> m53371a() {
            return this.f55185a;
        }

        /* renamed from: b */
        public final List<String> m53366b() {
            return this.f55186b;
        }

        /* renamed from: c */
        public final List<String> m53363c() {
            return this.f55187c;
        }

        /* renamed from: d */
        public final List<String> m53362d() {
            return this.f55188d;
        }

        /* renamed from: a */
        public final void m53368a(JSONObject jSONObject) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("x");
                if (optJSONArray != null) {
                    this.f55187c = JsonUtils.m51617a(optJSONArray);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("y");
                if (optJSONArray2 != null) {
                    this.f55188d = JsonUtils.m51617a(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("width");
                if (optJSONArray3 != null) {
                    this.f55186b = JsonUtils.m51617a(optJSONArray3);
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("height");
                if (optJSONArray4 != null) {
                    this.f55185a = JsonUtils.m51617a(optJSONArray4);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: e */
    private static Map<String, C21777a> m53418e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C21777a c21777a = new C21777a();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    c21777a.m53368a(optJSONObject);
                }
                hashMap.put(next, c21777a);
            }
            return hashMap;
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return null;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: A */
    public final int m53507A() {
        return this.f55082D;
    }

    /* renamed from: B */
    public final String m53506B() {
        return this.f55083E;
    }

    /* renamed from: C */
    public final String m53505C() {
        return this.f55084F;
    }

    /* renamed from: D */
    public final long m53504D() {
        return this.f55085G;
    }

    /* renamed from: E */
    public final ArrayList<Integer> m53503E() {
        return this.f55087I;
    }

    /* renamed from: F */
    public final EventLibMonitorSetting m53502F() {
        return this.f55088J;
    }

    /* renamed from: G */
    public final C21778b m53501G() {
        return this.f55089K;
    }

    /* renamed from: H */
    public final long m53500H() {
        return this.f55091M;
    }

    /* renamed from: I */
    public final int m53499I() {
        return this.f55093O;
    }

    /* renamed from: J */
    public final HashMap<String, String> m53498J() {
        return this.f55094P;
    }

    /* renamed from: K */
    public final int m53497K() {
        return this.f55097S;
    }

    /* renamed from: L */
    public final int m53496L() {
        return this.f55100V;
    }

    /* renamed from: M */
    public final int m53495M() {
        return this.f55101W;
    }

    /* renamed from: N */
    public final JSONArray m53494N() {
        return this.f55161c;
    }

    /* renamed from: O */
    public final JSONArray m53493O() {
        return this.f55162d;
    }

    /* renamed from: P */
    public final String m53492P() {
        return this.f55131aa;
    }

    /* renamed from: Q */
    public final int m53491Q() {
        return this.f55136af;
    }

    /* renamed from: R */
    public final int m53490R() {
        return this.f55137ag;
    }

    /* renamed from: S */
    public final int m53489S() {
        return this.f55139ai;
    }

    /* renamed from: T */
    public final int m53488T() {
        return this.f55141ak;
    }

    /* renamed from: U */
    public final String m53487U() {
        return this.f55142al;
    }

    /* renamed from: V */
    public final String m53486V() {
        return this.f55143am;
    }

    /* renamed from: W */
    public final String m53485W() {
        return this.f55144an;
    }

    /* renamed from: X */
    public final String m53484X() {
        return this.f55145ao;
    }

    /* renamed from: Y */
    public final int m53483Y() {
        return this.f55146ap;
    }

    /* renamed from: Z */
    public final int m53482Z() {
        return this.f55147aq;
    }

    /* renamed from: a */
    public final int m53481a() {
        return this.f55159bb;
    }

    /* renamed from: aA */
    public final int m53474aA() {
        return this.f55127aW;
    }

    /* renamed from: aB */
    public final int m53473aB() {
        return this.f55128aX;
    }

    /* renamed from: aC */
    public final int m53472aC() {
        return this.f55129aY;
    }

    /* renamed from: aD */
    public final boolean m53471aD() {
        return this.f55096R;
    }

    /* renamed from: aE */
    public final boolean m53470aE() {
        return this.f55179u;
    }

    /* renamed from: aF */
    public final boolean m53469aF() {
        return this.f55182x;
    }

    /* renamed from: aG */
    public final boolean m53468aG() {
        return this.f55098T;
    }

    /* renamed from: aH */
    public final boolean m53467aH() {
        return this.f55157b;
    }

    /* renamed from: aI */
    public final boolean m53466aI() {
        return this.f55099U;
    }

    /* renamed from: aJ */
    public final boolean m53465aJ() {
        return this.f55109aE;
    }

    /* renamed from: aK */
    public final boolean m53464aK() {
        return this.f55120aP;
    }

    /* renamed from: aL */
    public final void m53463aL() {
        boolean z;
        String language = Locale.getDefault().getLanguage();
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f55081C) && !TextUtils.isEmpty(this.f55079A) && !TextUtils.isEmpty(this.f55080B) && !TextUtils.isEmpty(this.f55184z)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.f55081C = "确认关闭？";
                this.f55079A = "关闭后您将不会获得任何奖励噢~ ";
                this.f55080B = "确认关闭";
                this.f55184z = "继续观看";
            } else {
                this.f55081C = "Confirm to close? ";
                this.f55079A = "You will not be rewarded after closing the window";
                this.f55080B = "Close it";
                this.f55184z = "Continue";
            }
        }
        if (TextUtils.isEmpty(this.f55081C) || TextUtils.isEmpty(this.f55079A) || TextUtils.isEmpty(this.f55080B) || TextUtils.isEmpty(this.f55183y)) {
            z2 = false;
        }
        if (!z2) {
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.f55081C = "确认关闭？";
                this.f55079A = "关闭后您将不会获得任何奖励噢~ ";
                this.f55080B = "确认关闭";
                this.f55183y = "继续试玩";
                return;
            }
            this.f55081C = "Confirm to close? ";
            this.f55079A = "You will not be rewarded after closing the window";
            this.f55080B = "Close it";
            this.f55183y = "Continue";
        }
    }

    /* renamed from: aa */
    public final int m53462aa() {
        return this.f55148ar;
    }

    /* renamed from: ab */
    public final int m53461ab() {
        return this.f55149as;
    }

    /* renamed from: ac */
    public final long m53460ac() {
        return this.f55152av;
    }

    /* renamed from: ad */
    public final long m53459ad() {
        if (this.f55153aw <= 0) {
            this.f55153aw = 7200L;
        }
        return this.f55153aw;
    }

    /* renamed from: ae */
    public final int m53458ae() {
        return this.f55155ay;
    }

    /* renamed from: af */
    public final int m53457af() {
        return this.f55156az;
    }

    /* renamed from: ag */
    public final int m53456ag() {
        return this.f55105aA;
    }

    /* renamed from: ah */
    public final int m53455ah() {
        return this.f55106aB;
    }

    /* renamed from: ai */
    public final int m53454ai() {
        return this.f55107aC;
    }

    /* renamed from: aj */
    public final int m53453aj() {
        return this.f55108aD;
    }

    /* renamed from: ak */
    public final int m53452ak() {
        return this.f55110aF;
    }

    /* renamed from: al */
    public final JSONArray m53451al() {
        return this.f55111aG;
    }

    /* renamed from: am */
    public final JSONObject m53450am() {
        return this.f55112aH;
    }

    /* renamed from: an */
    public final String m53449an() {
        return this.f55113aI;
    }

    /* renamed from: ao */
    public final long m53448ao() {
        return this.f55114aJ;
    }

    /* renamed from: ap */
    public final int m53447ap() {
        return this.f55115aK;
    }

    /* renamed from: aq */
    public final int m53446aq() {
        return this.f55116aL;
    }

    /* renamed from: ar */
    public final long m53445ar() {
        return this.f55117aM * 1000;
    }

    /* renamed from: as */
    public final int m53444as() {
        return this.f55118aN;
    }

    /* renamed from: at */
    public final long m53443at() {
        return this.f55119aO;
    }

    /* renamed from: au */
    public final int m53442au() {
        return this.f55121aQ;
    }

    /* renamed from: av */
    public final int m53441av() {
        return this.f55122aR;
    }

    /* renamed from: aw */
    public final int m53440aw() {
        return this.f55123aS;
    }

    /* renamed from: ax */
    public final int m53439ax() {
        return this.f55124aT;
    }

    /* renamed from: ay */
    public final String m53438ay() {
        return this.f55125aU;
    }

    /* renamed from: az */
    public final String m53437az() {
        return this.f55126aV;
    }

    /* renamed from: b */
    public final String m53436b() {
        return this.f55158ba;
    }

    /* renamed from: c */
    public final long m53431c() {
        return this.f55130aZ;
    }

    /* renamed from: d */
    public final String m53426d() {
        return this.f55163e;
    }

    /* renamed from: f */
    public final int m53416f() {
        return this.f55165g;
    }

    /* renamed from: g */
    public final int m53412g() {
        return this.f55166h;
    }

    /* renamed from: h */
    public final int m53410h() {
        return this.f55167i;
    }

    /* renamed from: i */
    public final String m53408i() {
        return this.f55168j;
    }

    /* renamed from: j */
    public final String m53406j() {
        return this.f55169k;
    }

    /* renamed from: k */
    public final String m53404k() {
        return this.f55170l;
    }

    /* renamed from: l */
    public final int m53402l() {
        return this.f55171m;
    }

    /* renamed from: m */
    public final int m53400m() {
        return this.f55172n;
    }

    /* renamed from: n */
    public final List<AtfEntity> m53398n() {
        return this.f55173o;
    }

    /* renamed from: o */
    public final int m53396o() {
        return this.f55174p;
    }

    /* renamed from: p */
    public final long m53394p() {
        return this.f55175q;
    }

    /* renamed from: q */
    public final BCP m53392q() {
        return this.f55176r;
    }

    /* renamed from: r */
    public final String m53390r() {
        return this.f55177s;
    }

    /* renamed from: s */
    public final Map<String, C21777a> m53388s() {
        return this.f55178t;
    }

    /* renamed from: t */
    public final int m53386t() {
        return this.f55180v;
    }

    public String toString() {
        return " cfc=" + this.f55180v + " getpf=" + this.f55091M + " rurl=" + this.f55109aE;
    }

    /* renamed from: u */
    public final int m53384u() {
        return this.f55181w;
    }

    /* renamed from: v */
    public final String m53382v() {
        return this.f55183y;
    }

    /* renamed from: w */
    public final String m53380w() {
        return this.f55184z;
    }

    /* renamed from: x */
    public final String m53378x() {
        return this.f55079A;
    }

    /* renamed from: y */
    public final String m53376y() {
        return this.f55080B;
    }

    /* renamed from: z */
    public final String m53374z() {
        return this.f55081C;
    }

    /* renamed from: a */
    public final void m53480a(int i) {
        this.f55159bb = i;
    }

    /* renamed from: b */
    public final void m53435b(int i) {
        this.f55164f = i;
    }

    /* renamed from: c */
    public final void m53430c(int i) {
        this.f55165g = i;
    }

    /* renamed from: d */
    public final void m53425d(int i) {
        this.f55166h = i;
    }

    /* renamed from: f */
    public final void m53415f(int i) {
        this.f55171m = i;
    }

    /* renamed from: g */
    public final void m53411g(int i) {
        this.f55172n = i;
    }

    /* renamed from: h */
    public final void m53409h(int i) {
        this.f55174p = i;
    }

    /* renamed from: i */
    public final void m53407i(int i) {
        this.f55180v = i;
    }

    /* renamed from: j */
    public final void m53405j(int i) {
        this.f55181w = i;
    }

    /* renamed from: k */
    public final void m53403k(int i) {
        this.f55082D = i;
    }

    /* renamed from: l */
    public final void m53401l(int i) {
        this.f55093O = i;
    }

    /* renamed from: m */
    public final void m53399m(int i) {
        this.f55097S = i;
    }

    /* renamed from: n */
    public final void m53397n(int i) {
        this.f55100V = i;
    }

    /* renamed from: o */
    public final void m53395o(int i) {
        this.f55101W = i;
    }

    /* renamed from: p */
    public final void m53393p(int i) {
        if (i > 0) {
            this.f55140aj = i;
        }
    }

    /* renamed from: q */
    public final void m53391q(int i) {
        this.f55139ai = i;
    }

    /* renamed from: r */
    public final void m53389r(int i) {
        this.f55141ak = i;
    }

    /* renamed from: s */
    public final void m53387s(int i) {
        this.f55110aF = i;
    }

    /* renamed from: t */
    public final void m53385t(int i) {
        this.f55116aL = i;
    }

    /* renamed from: u */
    public final void m53383u(int i) {
        this.f55118aN = i;
    }

    /* renamed from: v */
    public final void m53381v(int i) {
        this.f55121aQ = i;
    }

    /* renamed from: w */
    public final void m53379w(int i) {
        this.f55122aR = i;
    }

    /* renamed from: x */
    public final void m53377x(int i) {
        this.f55123aS = i;
    }

    /* renamed from: y */
    public final void m53375y(int i) {
        this.f55124aT = i;
    }

    /* renamed from: z */
    public final boolean m53373z(int i) {
        return this.f55154ax.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void m53479a(long j) {
        this.f55130aZ = j;
    }

    /* renamed from: b */
    public final void m53434b(long j) {
        this.f55175q = j;
    }

    /* renamed from: c */
    public final void m53428c(String str) {
        this.f55144an = str;
    }

    /* renamed from: d */
    public final void m53423d(String str) {
        this.f55145ao = str;
    }

    /* renamed from: f */
    public final void m53414f(long j) {
        this.f55117aM = j;
    }

    /* renamed from: a */
    public static String m53478a(Context context, String str) {
        try {
            Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
            if (m53279b != null && ((BaseSetting) m53279b).f55104Z != null) {
                String host = Uri.parse(str).getHost();
                for (Map.Entry<String, String> entry : ((BaseSetting) m53279b).f55104Z.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = ((BaseSetting) m53279b).f55104Z.get(key);
                        return TextUtils.isEmpty(str2) ? "" : str2.replace("{gaid}", BaseSameDiTool.m51654c());
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public final void m53433b(String str) {
        this.f55143am = str;
    }

    /* renamed from: c */
    public final void m53429c(long j) {
        this.f55152av = j;
    }

    /* renamed from: d */
    public final void m53424d(long j) {
        this.f55153aw = j;
    }

    /* renamed from: f */
    public final void m53413f(boolean z) {
        this.f55120aP = z;
    }

    /* renamed from: b */
    public final void m53432b(boolean z) {
        this.f55182x = z;
    }

    /* renamed from: c */
    public final void m53427c(boolean z) {
        this.f55098T = z;
    }

    /* renamed from: d */
    public final void m53422d(boolean z) {
        this.f55157b = z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:432:0x058d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* renamed from: a */
    public static com.mbridge.msdk.p411c.Setting m53476a(org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 1756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.p411c.BaseSetting.m53476a(org.json.JSONObject):com.mbridge.msdk.c.g");
    }

    /* renamed from: e */
    public final int m53421e() {
        return this.f55164f;
    }

    /* compiled from: BaseSetting.java */
    /* renamed from: com.mbridge.msdk.c.b$b */
    /* loaded from: classes6.dex */
    public static class C21778b {

        /* renamed from: a */
        private String f55189a;

        /* renamed from: b */
        private JSONArray f55190b;

        /* renamed from: c */
        private String f55191c;

        /* renamed from: d */
        private String f55192d;

        /* renamed from: e */
        private String f55193e;

        /* renamed from: f */
        private String f55194f;

        /* renamed from: a */
        public static C21778b m53357a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C21778b c21778b = new C21778b();
            Context m52792c = MBSDKContext.m52746m().m52792c();
            c21778b.f55194f = jSONObject.optString("title", m52792c.getString(ResourceUtil.m51605a(m52792c, "mbridge_cm_feedback_dialog_title", "string")));
            c21778b.f55189a = jSONObject.optString("cancel", m52792c.getString(ResourceUtil.m51605a(m52792c, "mbridge_cm_feedback_dialog_close_close", "string")));
            c21778b.f55192d = jSONObject.optString("submit", m52792c.getString(ResourceUtil.m51605a(m52792c, "mbridge_cm_feedback_dialog_close_submit", "string")));
            c21778b.f55193e = jSONObject.optString("submit_notice", m52792c.getString(ResourceUtil.m51605a(m52792c, "mbridge_cm_feedback_dialog_submit_notice", "string")));
            c21778b.f55191c = jSONObject.optString("privacy", m52792c.getString(ResourceUtil.m51605a(m52792c, "mbridge_cm_feedback_dialog_privacy_des", "string")));
            JSONArray optJSONArray = jSONObject.optJSONArray("content");
            c21778b.f55190b = optJSONArray;
            if (optJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                c21778b.f55190b = jSONArray;
                jSONArray.put(m52792c.getString(ResourceUtil.m51605a(m52792c, "mbridge_cm_feedback_dialog_content_not_play", "string")));
                c21778b.f55190b.put(m52792c.getString(ResourceUtil.m51605a(m52792c, "mbridge_cm_feedback_dialog_content_sound_problems", "string")));
                c21778b.f55190b.put(m52792c.getString(ResourceUtil.m51605a(m52792c, "mbridge_cm_feedback_dialog_content_misleading", "string")));
                c21778b.f55190b.put(m52792c.getString(ResourceUtil.m51605a(m52792c, "mbridge_cm_feedback_dialog_content_fraud", "string")));
                c21778b.f55190b.put(m52792c.getString(ResourceUtil.m51605a(m52792c, "mbridge_cm_feedback_dialog_content_por_violence", "string")));
                c21778b.f55190b.put(m52792c.getString(ResourceUtil.m51605a(m52792c, "mbridge_cm_feedback_dialog_content_other", "string")));
            }
            return c21778b;
        }

        /* renamed from: b */
        public final JSONArray m53355b() {
            return this.f55190b;
        }

        /* renamed from: c */
        public final String m53353c() {
            return this.f55191c;
        }

        /* renamed from: d */
        public final String m53352d() {
            return this.f55192d;
        }

        /* renamed from: e */
        public final String m53351e() {
            return this.f55193e;
        }

        /* renamed from: f */
        public final String m53350f() {
            return this.f55194f;
        }

        /* renamed from: a */
        public final String m53360a() {
            return this.f55189a;
        }
    }

    /* renamed from: e */
    public final void m53420e(int i) {
        this.f55167i = i;
    }

    /* renamed from: e */
    public final void m53419e(long j) {
        this.f55114aJ = j;
    }

    /* renamed from: e */
    public final void m53417e(boolean z) {
        this.f55109aE = z;
    }

    /* renamed from: a */
    public final void m53477a(String str) {
        this.f55095Q = str;
    }

    /* renamed from: a */
    public final void m53475a(boolean z) {
        this.f55179u = z;
    }
}
