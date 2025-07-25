package p991u2;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.helpshift.log.HSLogger;
import com.helpshift.unityproxy.storage.HelpshiftUnityStorage;
import com.ironsource.C21114v8;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p648e3.InterfaceC32918a;
import p693h3.HSPersistentStorage;
import p710i3.UserManager;
import p752k3.C37382g;
import p752k3.C37383m;
import p752k3.ValuePair;
import p826p2.HSWebchatAnalyticsManager;

/* renamed from: u2.a */
/* loaded from: classes5.dex */
public class HSConfigManager {

    /* renamed from: a */
    private HSPersistentStorage f116587a;

    /* renamed from: b */
    private HSWebchatAnalyticsManager f116588b;

    /* renamed from: c */
    private InterfaceC32918a f116589c;

    /* renamed from: d */
    private UserManager f116590d;

    /* renamed from: f */
    private String f116592f;

    /* renamed from: h */
    private boolean f116594h;

    /* renamed from: e */
    private ArrayList<JSONObject> f116591e = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<String> f116593g = new ArrayList<>();

    public HSConfigManager(HSPersistentStorage hSPersistentStorage, HSWebchatAnalyticsManager hSWebchatAnalyticsManager, InterfaceC32918a interfaceC32918a, UserManager userManager) {
        this.f116587a = hSPersistentStorage;
        this.f116588b = hSWebchatAnalyticsManager;
        this.f116589c = interfaceC32918a;
        this.f116590d = userManager;
    }

    /* renamed from: H */
    private void m3072H(String str, String str2) {
        if (!C37383m.m18236d(str2) && C37382g.m18254d(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if ("webchat".equals(str)) {
                    this.f116587a.m23750p0(jSONObject.toString());
                } else if ("helpcenter".equals(str)) {
                    this.f116587a.m23778b0(jSONObject.toString());
                }
            } catch (Exception e) {
                HSLogger.m65438e("ConfigMangr", "error in saving the ui config data for " + str, e);
            }
        }
    }

    /* renamed from: a */
    private void m3067a(JSONObject jSONObject) {
        if (C37383m.m18233g(this.f116587a.m23775d())) {
            String str = (String) C37382g.m18253e(this.f116587a.m23775d()).get("userId");
            if (C37383m.m18233g(str)) {
                jSONObject.put("anonUserId", str);
            }
        }
    }

    /* renamed from: b */
    private void m3066b(JSONObject jSONObject) {
        try {
            jSONObject.put("clearAnonymousUserOnLogin", this.f116587a.m23797K());
        } catch (JSONException e) {
            HSLogger.m65438e("ConfigMangr", "error in setting clear anonymous user flag ", e);
        }
    }

    /* renamed from: c */
    private void m3065c(JSONObject jSONObject) {
        String m23741u = this.f116587a.m23741u();
        if (C37383m.m18236d(m23741u)) {
            m23741u = JsonUtils.EMPTY_JSON;
        }
        try {
            jSONObject.put("configForSubsequentProactiveIssues", new JSONObject(m23741u));
        } catch (JSONException e) {
            HSLogger.m65438e("ConfigMangr", "Error in setting local proactive config ", e);
        }
    }

    /* renamed from: d */
    private void m3064d(JSONObject jSONObject) {
        if (jSONObject.has("language")) {
            return;
        }
        try {
            String m23749q = this.f116587a.m23749q();
            if (C37383m.m18236d(m23749q)) {
                m23749q = this.f116589c.getLanguage();
            }
            jSONObject.put("language", m23749q);
        } catch (Exception e) {
            HSLogger.m65438e("ConfigMangr", "Error in setting the language", e);
        }
    }

    /* renamed from: e */
    private void m3063e(JSONObject jSONObject) {
        HSLogger.m65441d("ConfigMangr", "Adding sdk open source value to config : " + this.f116592f);
        if (!C37383m.m18236d(this.f116592f)) {
            jSONObject.put("source", this.f116592f);
        }
    }

    /* renamed from: f */
    private void m3062f(JSONObject jSONObject) {
        String m23779b = this.f116587a.m23779b();
        if (C37383m.m18233g(m23779b)) {
            try {
                JSONObject jSONObject2 = new JSONObject(m23779b);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e) {
                HSLogger.m65438e("ConfigMangr", "Error in setting the user config", e);
            }
        }
    }

    /* renamed from: h */
    private void m3060h(JSONObject jSONObject) {
        if (jSONObject.has("widgetOptions")) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("showLauncher", false);
            jSONObject2.put("fullScreen", true);
            jSONObject.put("widgetOptions", jSONObject2);
        } catch (JSONException e) {
            HSLogger.m65438e("ConfigMangr", "Error in setting the widget option config", e);
        }
    }

    /* renamed from: k */
    private JSONObject m3057k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appVersion", this.f116589c.mo2781g());
            jSONObject.put("appName", this.f116589c.getAppName());
            jSONObject.put("appIdentifier", this.f116589c.mo2782f());
            jSONObject.put(C21114v8.C21123i.f54130Y, this.f116589c.getBatteryLevel());
            jSONObject.put("batteryStatus", this.f116589c.getBatteryStatus());
            jSONObject.put("carrierName", this.f116589c.getCarrierName());
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, this.f116589c.getCountryCode());
            jSONObject.put("networkType", this.f116589c.getNetworkType());
            ValuePair<String, String> mo2780h = this.f116589c.mo2780h();
            jSONObject.put("diskSpace", mo2780h.f98667a);
            jSONObject.put("freeSpace", mo2780h.f98668b);
            jSONObject.put("osVersion", this.f116589c.mo2783e());
            jSONObject.put(C21114v8.C21123i.f54153l, this.f116589c.getDeviceModel());
            jSONObject.put("liteSdkVersion", this.f116589c.mo2784d());
            jSONObject.put("pluginType", this.f116588b.m13320b().get("s"));
            String str = this.f116588b.m13320b().get("pv");
            if (!C37383m.m18236d(str)) {
                jSONObject.put("pluginVersion", str);
            }
        } catch (JSONException e) {
            HSLogger.m65438e("ConfigMangr", "error in generating device metadata", e);
        }
        return jSONObject;
    }

    /* renamed from: q */
    private JSONObject m3051q(boolean z) {
        String m3048t = m3048t();
        String m3053o = m3053o();
        String m23767h = this.f116587a.m23767h();
        JSONObject m3050r = m3050r(z);
        if (C37383m.m18236d(m23767h)) {
            m23767h = JsonUtils.EMPTY_JSON;
        }
        try {
            JSONObject jSONObject = new JSONObject(m23767h);
            jSONObject.put(HelpshiftUnityStorage.PLATFORM_ID, m3048t);
            jSONObject.put(C21114v8.C21123i.f54109D, m3053o);
            m3060h(jSONObject);
            m3064d(jSONObject);
            m3062f(jSONObject);
            m3066b(jSONObject);
            m3063e(jSONObject);
            if ("proactive".equals(this.f116592f)) {
                m3065c(jSONObject);
            }
            m3067a(m3050r);
            if (!this.f116593g.isEmpty()) {
                jSONObject.put("userTrail", new JSONArray((Collection) this.f116593g));
            }
            jSONObject.put("liteSdkConfig", m3050r);
            return jSONObject;
        } catch (JSONException e) {
            HSLogger.m65438e("ConfigMangr", "Error in creating the config object", e);
            return new JSONObject();
        }
    }

    /* renamed from: r */
    private JSONObject m3050r(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            String m23739v = this.f116587a.m23739v();
            if (C37383m.m18233g(m23739v)) {
                jSONObject.put("localStorageData", new JSONObject(m23739v));
            }
            jSONObject.put("metaData", m3057k());
            jSONObject.put("os", this.f116589c.mo2779i());
            String m23765i = this.f116587a.m23765i();
            if (C37383m.m18233g(m23765i) && !this.f116590d.m23239B()) {
                jSONObject.put("pushToken", m23765i);
            }
            jSONObject.put("analyticsData", new JSONObject(this.f116588b.m13321a()));
            jSONObject.put("deviceId", this.f116589c.getDeviceId());
            jSONObject.put("launchedFromHelpcenter", z);
            return jSONObject;
        } catch (JSONException e) {
            HSLogger.m65438e("ConfigMangr", "error in generating liteSdkConfig", e);
            return jSONObject;
        }
    }

    /* renamed from: u */
    private String m3047u(String str) {
        if ("webchat".equals(str)) {
            return this.f116587a.m23798J();
        }
        if ("helpcenter".equals(str)) {
            return this.f116587a.m23757m();
        }
        return "";
    }

    /* renamed from: y */
    private JSONObject m3043y(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", str);
        jSONObject.put("d", str2);
        return jSONObject;
    }

    /* renamed from: A */
    public void m3079A(String str) {
        if (!C37383m.m18236d(str) && C37382g.m18254d(str)) {
            String m23777c = this.f116587a.m23777c();
            if (C37383m.m18236d(m23777c)) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
                JSONObject jSONObject = new JSONObject(m23777c);
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    if (jSONObject.has(string)) {
                        jSONObject.remove(string);
                    }
                }
                this.f116587a.m23790R(jSONObject.toString());
            } catch (Exception e) {
                HSLogger.m65438e("ConfigMangr", "error in deleting helpcenter data", e);
            }
        }
    }

    /* renamed from: B */
    public void m3078B(String str) {
        if (!C37383m.m18236d(str) && C37382g.m18254d(str)) {
            String m23739v = this.f116587a.m23739v();
            if (C37383m.m18236d(m23739v)) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
                JSONObject jSONObject = new JSONObject(m23739v);
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    if (jSONObject.has(string)) {
                        jSONObject.remove(string);
                    }
                }
                this.f116587a.m23789S(jSONObject.toString());
            } catch (JSONException e) {
                HSLogger.m65438e("ConfigMangr", "error in deleting local storage data", e);
            }
        }
    }

    /* renamed from: C */
    public void m3077C(Map<String, Object> map) {
        this.f116587a.m23785W(C37382g.m18250h(map));
    }

    /* renamed from: D */
    public void m3076D(String str, String str2) {
        String[] split = str2.split("\\.", 2);
        this.f116587a.m23783Y(split[0].trim());
        this.f116587a.m23776c0(split[1].trim());
        this.f116587a.m23754n0(str);
    }

    /* renamed from: E */
    public void m3075E(String str) {
        this.f116587a.m23772e0(str);
    }

    /* renamed from: F */
    public void m3074F(Map<String, Object> map) {
        this.f116587a.m23764i0(C37382g.m18250h(map));
    }

    /* renamed from: G */
    public void m3073G(String str) {
        this.f116592f = str;
    }

    /* renamed from: I */
    public void m3071I(String str) {
        m3072H("helpcenter", str);
    }

    /* renamed from: J */
    public void m3070J(String str) {
        m3072H("webchat", str);
    }

    /* renamed from: K */
    public void m3069K(String str) {
        if (!C37383m.m18236d(str) && C37382g.m18254d(str)) {
            try {
                String m23777c = this.f116587a.m23777c();
                if (C37383m.m18233g(m23777c)) {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObject2 = new JSONObject(m23777c);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.get(next));
                    }
                    this.f116587a.m23790R(jSONObject2.toString());
                    return;
                }
                this.f116587a.m23790R(str);
            } catch (Exception e) {
                HSLogger.m65438e("ConfigMangr", "error in storing additional Helpcenter data", e);
            }
        }
    }

    /* renamed from: L */
    public void m3068L(String str) {
        if (!C37383m.m18236d(str) && C37382g.m18254d(str)) {
            try {
                String m23739v = this.f116587a.m23739v();
                if (C37383m.m18233g(m23739v)) {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObject2 = new JSONObject(m23739v);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.get(next));
                    }
                    this.f116587a.m23789S(jSONObject2.toString());
                    return;
                }
                this.f116587a.m23789S(str);
            } catch (JSONException e) {
                HSLogger.m65438e("ConfigMangr", "error in storing local storage data", e);
            }
        }
    }

    /* renamed from: g */
    public void m3061g(String str) {
        if (str.length() > 10) {
            str = str.substring(0, 10);
        }
        if (this.f116593g.size() < 10) {
            this.f116593g.add(str);
            return;
        }
        this.f116593g.add(str);
        this.f116593g.remove(0);
    }

    /* renamed from: i */
    public synchronized void m3059i() {
        this.f116587a.m23787U(new JSONArray().toString());
    }

    /* renamed from: j */
    public void m3058j() {
        this.f116593g.clear();
    }

    /* renamed from: l */
    public String m3056l() {
        String m23777c = this.f116587a.m23777c();
        if (C37383m.m18236d(m23777c)) {
            return JsonUtils.EMPTY_JSON;
        }
        return m23777c;
    }

    /* renamed from: m */
    public synchronized JSONArray m3055m(int i) {
        JSONArray jSONArray;
        int i2;
        jSONArray = new JSONArray();
        try {
            JSONArray m23769g = this.f116587a.m23769g();
            int length = m23769g.length();
            if (i < length) {
                i2 = length - i;
            } else {
                i2 = 0;
            }
            while (i2 < length) {
                jSONArray.put(m23769g.get(i2));
                i2++;
            }
        } catch (Exception e) {
            HSLogger.m65438e("ConfigMangr", "Error getting breadcrumbs", e);
        }
        return jSONArray;
    }

    /* renamed from: n */
    public synchronized JSONArray m3054n(int i) {
        JSONArray jSONArray;
        jSONArray = new JSONArray();
        try {
            int min = Math.min(this.f116591e.size(), i);
            for (int i2 = 0; i2 < min; i2++) {
                jSONArray.put(this.f116591e.get(i2));
            }
        } catch (Exception e) {
            HSLogger.m65438e("ConfigMangr", "Error getting DebugLogs.", e);
        }
        return jSONArray;
    }

    /* renamed from: o */
    public String m3053o() {
        return this.f116587a.m23763j();
    }

    /* renamed from: p */
    public String m3052p(String str, String str2, boolean z) {
        JSONObject m3051q = m3051q(false);
        JSONObject jSONObject = new JSONObject();
        try {
            if (C37383m.m18233g(str)) {
                jSONObject.put("faqId", str);
            }
            if (C37383m.m18233g(str2)) {
                jSONObject.put("sectionId", str2);
            }
            if (z) {
                jSONObject.put("showChatIcon", false);
            } else if (this.f116590d.m23213a0()) {
                jSONObject.put("showChatIcon", true);
            }
            String m23777c = this.f116587a.m23777c();
            if (C37383m.m18233g(m23777c) && C37382g.m18254d(m23777c)) {
                jSONObject.put("additionalInfo", new JSONObject(m23777c));
            }
            if (this.f116594h) {
                jSONObject.put("hcIsSandbox", true);
            }
            m3051q.put("helpcenterConfig", jSONObject);
            return m3051q.toString();
        } catch (Exception e) {
            HSLogger.m65438e("ConfigMangr", "Error in generating the helpcenter config", e);
            return m3051q.toString();
        }
    }

    /* renamed from: s */
    public String m3049s() {
        String m23739v = this.f116587a.m23739v();
        if (C37383m.m18236d(m23739v)) {
            return JsonUtils.EMPTY_JSON;
        }
        return m23739v;
    }

    /* renamed from: t */
    public String m3048t() {
        return this.f116587a.m23804D();
    }

    /* renamed from: v */
    public String m3046v() {
        return m3047u("helpcenter");
    }

    /* renamed from: w */
    public String m3045w() {
        return m3047u("webchat");
    }

    /* renamed from: x */
    public String m3044x(boolean z) {
        return m3051q(z).toString();
    }

    /* renamed from: z */
    public synchronized void m3042z(String str) {
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH).format(new Date());
            JSONArray m23769g = this.f116587a.m23769g();
            if (m23769g == null) {
                m23769g = new JSONArray();
            }
            if (str.length() > 5000) {
                str = str.substring(0, 5000);
            }
            m23769g.put(m3043y(str.trim(), format));
            int length = m23769g.length();
            if (length > 100) {
                JSONArray jSONArray = new JSONArray();
                for (int i = length - 100; i <= 100; i++) {
                    jSONArray.put(m23769g.getJSONObject(i));
                }
                m23769g = jSONArray;
            }
            this.f116587a.m23787U(m23769g.toString());
        } catch (Exception e) {
            HSLogger.m65438e("ConfigMangr", "Error pushing BreadCrumbs", e);
        }
    }
}
