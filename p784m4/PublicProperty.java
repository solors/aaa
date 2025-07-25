package p784m4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p552ot.pubsub.p553a.C26484a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;
import p842q4.PublicPropertiesEntity;
import p858r4.SharedPreferencesManager;
import p993u4.C44431g;
import p993u4.C44433l;
import p993u4.DeviceUtil;

/* renamed from: m4.a */
/* loaded from: classes6.dex */
public class PublicProperty {

    /* renamed from: A */
    private String f100971A;

    /* renamed from: B */
    private String f100972B;

    /* renamed from: C */
    private long f100973C;

    /* renamed from: a */
    private Context f100974a;

    /* renamed from: b */
    private String f100975b;

    /* renamed from: c */
    private String f100976c;

    /* renamed from: d */
    private String f100977d;

    /* renamed from: e */
    private boolean f100978e;

    /* renamed from: f */
    private String f100979f;

    /* renamed from: g */
    private String f100980g;

    /* renamed from: h */
    private String f100981h;

    /* renamed from: i */
    private String f100982i;

    /* renamed from: j */
    private String f100983j;

    /* renamed from: k */
    private String f100984k;

    /* renamed from: l */
    private String f100985l;

    /* renamed from: m */
    private String f100986m;

    /* renamed from: n */
    private String f100987n;

    /* renamed from: o */
    private String f100988o;

    /* renamed from: p */
    private String f100989p;

    /* renamed from: q */
    private String f100990q;

    /* renamed from: r */
    private String f100991r;

    /* renamed from: s */
    private String f100992s;

    /* renamed from: t */
    private String f100993t;

    /* renamed from: u */
    private String f100994u;

    /* renamed from: v */
    private String f100995v;

    /* renamed from: w */
    private String f100996w;

    /* renamed from: x */
    private String f100997x;

    /* renamed from: y */
    private String f100998y;

    /* renamed from: z */
    private String f100999z;

    public PublicProperty(Context context) {
        this.f100975b = "unset";
        this.f100976c = "unset";
        this.f100977d = "unset";
        this.f100978e = true;
        this.f100979f = "unset";
        this.f100993t = "ANDROID";
        this.f100974a = context;
    }

    /* renamed from: a */
    private String m15474a(Context context) {
        long j;
        boolean z = false;
        try {
            j = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            j = -1;
        }
        if (j < 0) {
            return this.f100996w;
        }
        String string = Settings.System.getString(context.getContentResolver(), C26484a.f69184A);
        if (!TextUtils.isEmpty(string) && !string.equals("9774d56d682e549c") && !string.equals("0123456789abcdef")) {
            z = true;
        }
        if (z) {
            return C44431g.m3007a(string + j);
        }
        return this.f100996w;
    }

    /* renamed from: f */
    private boolean m15469f(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals("unset")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public String m15473b() {
        return this.f100975b;
    }

    /* renamed from: c */
    public String m15472c() {
        return this.f100981h;
    }

    /* renamed from: d */
    public String m15471d() {
        return this.f100980g;
    }

    /* renamed from: e */
    public void m15470e(@NonNull String str, @NonNull String str2, @NonNull String str3, String str4) {
        this.f100975b = str;
        this.f100976c = str2;
        this.f100977d = str3;
        SharedPreferencesManager m12681b = SharedPreferencesManager.m12681b();
        this.f100979f = m12681b.m12678e(this.f100974a, "learnings_analyze", "key_advertising_id", "unset");
        this.f100978e = m12681b.m12682a(this.f100974a, "learnings_analyze", "key_is_limit_tracking", true);
        this.f100994u = m12681b.m12678e(this.f100974a, "learnings_analyze", "key_userPseudoId", "unset");
        this.f100995v = m12681b.m12678e(this.f100974a, "learnings_analyze", "key_luid", "unset");
        this.f100996w = str4;
        this.f100997x = m12681b.m12678e(this.f100974a, "learnings_analyze", "key_learningsId", "unset");
        this.f100971A = m12681b.m12678e(this.f100974a, "learnings_analyze", "key_af_status", "unset");
        this.f100972B = m12681b.m12678e(this.f100974a, "learnings_analyze", "key_mediaSource", "unset");
        this.f100998y = m12681b.m12678e(this.f100974a, "learnings_analyze", "key_campaignId", "unset");
        this.f100999z = m12681b.m12678e(this.f100974a, "learnings_analyze", "key_campaignName", "unset");
        this.f100980g = DeviceUtil.m3024i();
        this.f100973C = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
        this.f100981h = this.f100974a.getPackageName();
        this.f100984k = DeviceUtil.m3029d();
        this.f100985l = DeviceUtil.m3023j();
        this.f100986m = DeviceUtil.m3020m();
        this.f100987n = DeviceUtil.m3021l();
        this.f100988o = DeviceUtil.m3017p(this.f100974a);
        this.f100989p = DeviceUtil.m3025h(this.f100974a);
        this.f100990q = DeviceUtil.m3018o(this.f100974a);
        this.f100991r = DeviceUtil.m3016q(this.f100974a);
        this.f100992s = DeviceUtil.m3027f();
        this.f100983j = DeviceUtil.m3028e(this.f100974a);
        String installerPackageName = this.f100974a.getApplicationContext().getPackageManager().getInstallerPackageName(this.f100981h);
        this.f100982i = installerPackageName;
        if (TextUtils.isEmpty(installerPackageName)) {
            this.f100982i = "unset";
        }
    }

    /* renamed from: g */
    public boolean m15468g(PublicProperty publicProperty) {
        if (publicProperty == null || !this.f100975b.equals(publicProperty.f100975b) || !this.f100976c.equals(publicProperty.f100976c) || !this.f100977d.equals(publicProperty.f100977d) || !this.f100980g.equals(publicProperty.f100980g) || this.f100978e != publicProperty.f100978e || !this.f100979f.equals(publicProperty.f100979f) || !this.f100981h.equals(publicProperty.f100981h) || !this.f100982i.equals(publicProperty.f100982i) || !this.f100983j.equals(publicProperty.f100983j) || !this.f100984k.equals(publicProperty.f100984k) || !this.f100985l.equals(publicProperty.f100985l) || !this.f100986m.equals(publicProperty.f100986m) || !this.f100994u.equals(publicProperty.f100994u) || !this.f100987n.equals(publicProperty.f100987n) || !this.f100989p.equals(publicProperty.f100989p) || !this.f100988o.equals(publicProperty.f100988o) || !this.f100990q.equals(publicProperty.f100990q) || !this.f100991r.equals(publicProperty.f100991r) || !this.f100992s.equals(publicProperty.f100992s) || !this.f100993t.equals(publicProperty.f100993t) || !this.f100995v.equals(publicProperty.f100995v) || !this.f100996w.equals(publicProperty.f100996w) || !this.f100997x.equals(publicProperty.f100997x) || !this.f100971A.equals(publicProperty.f100971A) || !this.f100972B.equals(publicProperty.f100972B) || !this.f100998y.equals(publicProperty.f100998y) || !this.f100999z.equals(publicProperty.f100999z) || this.f100973C != publicProperty.f100973C) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public boolean m15467h(String str) {
        if (!TextUtils.isEmpty(this.f100979f) && this.f100979f.equals(str)) {
            return false;
        }
        this.f100979f = str;
        SharedPreferencesManager.m12681b().m12675h(this.f100974a, "learnings_analyze", "key_advertising_id", str);
        if (C44433l.m2994d()) {
            C44433l.m2997a("PublicProperty", "advertisingId has Changed. advertisingId = " + str);
            return true;
        }
        return true;
    }

    /* renamed from: i */
    public boolean m15466i(String str) {
        if (!TextUtils.isEmpty(this.f100971A) && this.f100971A.equals(str)) {
            return false;
        }
        this.f100971A = str;
        SharedPreferencesManager.m12681b().m12675h(this.f100974a, "learnings_analyze", "key_af_status", str);
        if (C44433l.m2994d()) {
            C44433l.m2997a("PublicProperty", "afStatus has Changed. afStatus = " + str);
            return true;
        }
        return true;
    }

    /* renamed from: j */
    public boolean m15465j(String str) {
        if (!TextUtils.isEmpty(this.f100998y) && this.f100998y.equals(str)) {
            return false;
        }
        this.f100998y = str;
        SharedPreferencesManager.m12681b().m12675h(this.f100974a, "learnings_analyze", "key_campaignId", str);
        if (C44433l.m2994d()) {
            C44433l.m2997a("PublicProperty", "campaignId has Changed. campaignId = " + str);
            return true;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m15464k(String str) {
        if (!TextUtils.isEmpty(this.f100999z) && this.f100999z.equals(str)) {
            return false;
        }
        this.f100999z = str;
        SharedPreferencesManager.m12681b().m12675h(this.f100974a, "learnings_analyze", "key_campaignName", str);
        if (C44433l.m2994d()) {
            C44433l.m2997a("PublicProperty", "campaignName has Changed. campaignName = " + str);
            return true;
        }
        return true;
    }

    /* renamed from: l */
    public void m15463l(String str) {
        this.f100980g = str;
    }

    /* renamed from: m */
    public boolean m15462m(String str) {
        if (!m15469f(this.f100997x) && m15469f(str)) {
            this.f100997x = str;
            SharedPreferencesManager.m12681b().m12675h(this.f100974a, "learnings_analyze", "key_learningsId", str);
            if (C44433l.m2994d()) {
                C44433l.m2997a("PublicProperty", "learningsId has Changed. learningsId = " + str);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m15461n(boolean z) {
        if (this.f100978e != z) {
            this.f100978e = z;
            SharedPreferencesManager.m12681b().m12677f(this.f100974a, "learnings_analyze", "key_is_limit_tracking", z);
            if (C44433l.m2994d()) {
                C44433l.m2997a("PublicProperty", "isLimitAdTracking has Changed. isLimitAdTracking = " + z);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public boolean m15460o(String str) {
        if (!TextUtils.isEmpty(this.f100995v) && this.f100995v.equals(str)) {
            return false;
        }
        this.f100995v = str;
        SharedPreferencesManager.m12681b().m12675h(this.f100974a, "learnings_analyze", "key_luid", str);
        if (C44433l.m2994d()) {
            C44433l.m2997a("PublicProperty", "luid has Changed. luid = " + str);
            return true;
        }
        return true;
    }

    /* renamed from: p */
    public boolean m15459p(String str) {
        if (!TextUtils.isEmpty(this.f100972B) && this.f100972B.equals(str)) {
            return false;
        }
        this.f100972B = str;
        SharedPreferencesManager.m12681b().m12675h(this.f100974a, "learnings_analyze", "key_mediaSource", str);
        if (C44433l.m2994d()) {
            C44433l.m2997a("PublicProperty", "mediaSource has Changed. mediaSource = " + str);
            return true;
        }
        return true;
    }

    /* renamed from: q */
    public boolean m15458q(String str) {
        if (!TextUtils.isEmpty(this.f100994u) && this.f100994u.equals(str)) {
            return false;
        }
        this.f100994u = str;
        SharedPreferencesManager.m12681b().m12675h(this.f100974a, "learnings_analyze", "key_userPseudoId", str);
        if (C44433l.m2994d()) {
            C44433l.m2997a("PublicProperty", "userPseudoId has Changed. userPseudoId = " + str);
            return true;
        }
        return true;
    }

    /* renamed from: r */
    public JSONObject m15457r() {
        String str;
        Context context;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_version", this.f100975b);
            jSONObject.put("analytics_sdk_version", this.f100976c);
            jSONObject.put(CommonUrlParts.OS_VERSION, this.f100977d);
            jSONObject.put("device_advertising_id", this.f100979f);
            if (this.f100978e) {
                str = "YES";
            } else {
                str = "NO";
            }
            jSONObject.put("limited_tracking", str);
            jSONObject.put("luid", this.f100995v);
            jSONObject.put(CommonUrlParts.UUID, this.f100996w);
            jSONObject.put("user_pseudo_id", this.f100994u);
            if (!m15469f(this.f100997x) && (context = this.f100974a) != null) {
                this.f100997x = m15474a(context);
                SharedPreferencesManager.m12681b().m12675h(this.f100974a, "learnings_analyze", "key_learningsId", this.f100997x);
                if (C44433l.m2994d()) {
                    C44433l.m2997a("PublicProperty", "learningsId has Changed. learningsId = " + this.f100997x);
                }
            }
            jSONObject.put("learnings_id", this.f100997x);
            jSONObject.put("af_status", this.f100971A);
            jSONObject.put("media_source", this.f100972B);
            jSONObject.put("campaign_id", this.f100998y);
            jSONObject.put("campaign_name", this.f100999z);
            jSONObject.put("device_language", this.f100980g);
            jSONObject.put("time_zone_offset_seconds", this.f100973C);
            jSONObject.put("app_bundle_id", this.f100981h);
            jSONObject.put("app_install_source", this.f100982i);
            jSONObject.put("device_category", this.f100983j);
            jSONObject.put("device_brand_name", this.f100984k);
            jSONObject.put("device_manufacturer", this.f100985l);
            jSONObject.put("device_os_hardware_model", this.f100986m);
            jSONObject.put("os", this.f100987n);
            jSONObject.put("device_screen_size", this.f100989p);
            jSONObject.put("device_resolution", this.f100988o);
            jSONObject.put("device_ram", this.f100990q);
            jSONObject.put("device_storage", this.f100991r);
            jSONObject.put("device_cpu", this.f100992s);
            jSONObject.put("platform", this.f100993t);
        } catch (JSONException e) {
            C44433l.m2992f(e);
        }
        return jSONObject;
    }

    @NonNull
    public String toString() {
        return m15457r().toString();
    }

    public PublicProperty(PublicPropertiesEntity publicPropertiesEntity) {
        this.f100975b = "unset";
        this.f100976c = "unset";
        this.f100977d = "unset";
        this.f100978e = true;
        this.f100979f = "unset";
        this.f100993t = "ANDROID";
        if (publicPropertiesEntity == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(publicPropertiesEntity.m12981b());
            this.f100975b = jSONObject.optString("app_version");
            this.f100976c = jSONObject.optString("analytics_sdk_version");
            this.f100977d = jSONObject.optString(CommonUrlParts.OS_VERSION);
            this.f100979f = jSONObject.optString("device_advertising_id");
            this.f100978e = jSONObject.optString("limited_tracking", "YES").equals("YES");
            this.f100995v = jSONObject.optString("luid", "unset");
            this.f100996w = jSONObject.optString(CommonUrlParts.UUID, "unset");
            this.f100994u = jSONObject.optString("user_pseudo_id", "unset");
            this.f100997x = jSONObject.optString("learnings_id", "unset");
            this.f100971A = jSONObject.optString("af_status", "unset");
            this.f100972B = jSONObject.optString("media_source", "unset");
            this.f100998y = jSONObject.optString("campaign_id", "unset");
            this.f100999z = jSONObject.optString("campaign_name", "unset");
            this.f100980g = jSONObject.optString("device_language");
            this.f100973C = jSONObject.optLong("time_zone_offset_seconds", 0L);
            this.f100981h = jSONObject.optString("app_bundle_id", "unset");
            this.f100982i = jSONObject.optString("app_install_source", "unset");
            this.f100983j = jSONObject.optString("device_category", "unset");
            this.f100984k = jSONObject.optString("device_brand_name", "unset");
            this.f100985l = jSONObject.optString("device_manufacturer", "unset");
            this.f100986m = jSONObject.optString("device_os_hardware_model", "unset");
            this.f100987n = jSONObject.optString("os", "unset");
            this.f100989p = jSONObject.optString("device_screen_size", "unset");
            this.f100988o = jSONObject.optString("device_resolution", "unset");
            this.f100990q = jSONObject.optString("device_ram", "unset");
            this.f100991r = jSONObject.optString("device_storage", "unset");
            this.f100992s = jSONObject.optString("device_cpu", "unset");
            this.f100993t = jSONObject.optString("platform", "unset");
        } catch (JSONException e) {
            C44433l.m2992f(e);
        }
    }
}
