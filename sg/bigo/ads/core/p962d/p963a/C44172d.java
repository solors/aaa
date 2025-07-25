package sg.bigo.ads.core.p962d.p963a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.C19577ad;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.p552ot.pubsub.p553a.C26484a;
import com.smaato.sdk.video.vast.model.Verification;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.C43525i;
import sg.bigo.ads.api.p903a.InterfaceC43524h;
import sg.bigo.ads.common.InterfaceC43665g;
import sg.bigo.ads.common.InterfaceC43710k;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43837r;

/* renamed from: sg.bigo.ads.core.d.a.d */
/* loaded from: classes10.dex */
public final class C44172d {

    /* renamed from: a */
    int f115932a;

    /* renamed from: b */
    String f115933b;

    /* renamed from: c */
    int f115934c;

    /* renamed from: d */
    JSONObject f115935d;

    /* renamed from: e */
    private String f115936e;

    /* renamed from: f */
    private String f115937f;

    /* renamed from: g */
    private String[] f115938g;

    /* renamed from: h */
    private String[] f115939h;

    /* renamed from: i */
    private String f115940i;

    /* renamed from: j */
    private int f115941j;

    /* renamed from: k */
    private int f115942k;

    /* renamed from: l */
    private final Map<String, String> f115943l;

    /* renamed from: m */
    private InterfaceC43665g f115944m;

    public C44172d(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    /* renamed from: f */
    private boolean m3770f() {
        if (this.f115942k == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: g */
    private String m3769g() {
        char c;
        long m4819a;
        String valueOf;
        int mo4143d;
        if (TextUtils.isEmpty(this.f115936e) || TextUtils.isEmpty(this.f115933b)) {
            return "";
        }
        String trim = this.f115936e.trim();
        if (this.f115938g != null && this.f115939h != null && this.f115944m != null) {
            for (int i = 0; i < this.f115938g.length; i++) {
                String str = this.f115939h[i];
                switch (str.hashCode()) {
                    case -2138759690:
                        if (str.equals("regist_time")) {
                            c = '/';
                            break;
                        }
                        c = 65535;
                        break;
                    case -2076227591:
                        if (str.equals("timezone")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1795462070:
                        if (str.equals("express_id")) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1600030548:
                        if (str.equals("resolution")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1273393189:
                        if (str.equals("sec_price")) {
                            c = '$';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1229750878:
                        if (str.equals("sec_bidder")) {
                            c = '%';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1182905495:
                        if (str.equals("os_lang")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1174888717:
                        if (str.equals("gps_adid")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1007979832:
                        if (str.equals("os_ver")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -986522696:
                        if (str.equals("pkg_ch")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -986522112:
                        if (str.equals("pkg_vc")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -934795532:
                        if (str.equals("region")) {
                            c = '.';
                            break;
                        }
                        c = 65535;
                        break;
                    case -906980142:
                        if (str.equals("sdk_vc")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -820075192:
                        if (str.equals(Verification.VENDOR)) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -793620671:
                        if (str.equals(MBridgeConstans.APP_KEY)) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -777008198:
                        if (str.equals("click_prop")) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case -693230854:
                        if (str.equals("first_price")) {
                            c = '&';
                            break;
                        }
                        c = 65535;
                        break;
                    case -613897138:
                        if (str.equals("support_om")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case -517414224:
                        if (str.equals("pkg_ver")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -424587677:
                        if (str.equals("first_bidder")) {
                            c = '\'';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3556:
                        if (str.equals("os")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 99677:
                        if (str.equals("dpi")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 104582:
                        if (str.equals("isp")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 106905:
                        if (str.equals("lan")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 106911:
                        if (str.equals(C19577ad.f49134q)) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107301:
                        if (str.equals("lng")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107855:
                        if (str.equals(C26484a.f69185B)) {
                            c = ',';
                            break;
                        }
                        c = 65535;
                        break;
                    case 108957:
                        if (str.equals("net")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 115792:
                        if (str.equals(KeyConstants.RequestBody.KEY_UID)) {
                            c = '1';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3053931:
                        if (str.equals("city")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3165045:
                        if (str.equals(C19577ad.f49047D0)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3184265:
                        if (str.equals("guid")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3197719:
                        if (str.equals("hdid")) {
                            c = '-';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3236040:
                        if (str.equals("imei")) {
                            c = '*';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3236474:
                        if (str.equals("imsi")) {
                            c = '+';
                            break;
                        }
                        c = 65535;
                        break;
                    case 25209764:
                        if (str.equals("device_id")) {
                            c = '2';
                            break;
                        }
                        c = 65535;
                        break;
                    case 55126294:
                        if (str.equals("timestamp")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 92714869:
                        if (str.equals("af_id")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case 104069929:
                        if (str.equals("model")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109757585:
                        if (str.equals("state")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 440309782:
                        if (str.equals("advertising_id")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 530453763:
                        if (str.equals("click_module")) {
                            c = '#';
                            break;
                        }
                        c = 65535;
                        break;
                    case 702731954:
                        if (str.equals("click_source")) {
                            c = '\"';
                            break;
                        }
                        c = 65535;
                        break;
                    case 957831062:
                        if (str.equals("country")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1139786014:
                        if (str.equals("pkg_name")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1139954915:
                        if (str.equals("pkg_sver")) {
                            c = ')';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1505024451:
                        if (str.equals("local_timestamp_ms")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1583758243:
                        if (str.equals(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE)) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1793985248:
                        if (str.equals("loss_reason")) {
                            c = '(';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1845546289:
                        if (str.equals("new_uid")) {
                            c = '0';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1948386846:
                        if (str.equals("sdk_ver")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        m4819a = C43837r.m4819a();
                        valueOf = String.valueOf(m4819a);
                        break;
                    case 1:
                        m4819a = System.currentTimeMillis();
                        valueOf = String.valueOf(m4819a);
                        break;
                    case 2:
                        valueOf = this.f115944m.mo4175E();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        valueOf = this.f115944m.mo4177C();
                        break;
                    case 6:
                        valueOf = this.f115944m.mo4153a();
                        break;
                    case 7:
                        valueOf = this.f115944m.mo4145b();
                        break;
                    case '\b':
                        valueOf = String.valueOf(this.f115944m.mo4144c());
                        break;
                    case '\t':
                        mo4143d = this.f115944m.mo4143d();
                        valueOf = String.valueOf(mo4143d);
                        break;
                    case '\n':
                        valueOf = this.f115944m.mo4142e();
                        break;
                    case 11:
                        valueOf = this.f115944m.mo4138i();
                        break;
                    case '\f':
                        valueOf = this.f115944m.mo4137j();
                        break;
                    case '\r':
                    case 19:
                        valueOf = this.f115944m.mo4136k();
                        break;
                    case 14:
                        valueOf = this.f115944m.mo4135l();
                        break;
                    case 15:
                        valueOf = this.f115944m.mo4134m();
                        break;
                    case 16:
                        valueOf = this.f115944m.mo4133n();
                        break;
                    case 17:
                        valueOf = this.f115944m.mo4132o();
                        break;
                    case 18:
                        mo4143d = this.f115944m.mo4131p();
                        valueOf = String.valueOf(mo4143d);
                        break;
                    case 20:
                        valueOf = this.f115944m.mo4130q();
                        break;
                    case 21:
                        valueOf = this.f115944m.mo4129r();
                        break;
                    case 22:
                        valueOf = this.f115944m.mo4179A();
                        break;
                    case 23:
                        valueOf = "50002";
                        break;
                    case 24:
                        valueOf = this.f115944m.mo4125v();
                        break;
                    case 25:
                        valueOf = this.f115944m.mo4122y();
                        break;
                    case 26:
                        valueOf = this.f115944m.mo4121z();
                        break;
                    case 27:
                        mo4143d = this.f115944m.mo4127t();
                        valueOf = String.valueOf(mo4143d);
                        break;
                    case 28:
                        mo4143d = this.f115944m.mo4126u();
                        valueOf = String.valueOf(mo4143d);
                        break;
                    case 29:
                        valueOf = this.f115944m.mo4176D();
                        break;
                    case 30:
                        valueOf = "1";
                        break;
                    case 31:
                    case ' ':
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                        if (this.f115943l.containsKey(str)) {
                            valueOf = this.f115943l.get(str);
                            break;
                        }
                    default:
                        valueOf = "";
                        break;
                }
                String str2 = this.f115938g[i];
                if (valueOf == null) {
                    valueOf = "";
                }
                trim = trim.replace(str2, valueOf);
            }
        }
        InterfaceC43524h interfaceC43524h = C43525i.f114036a;
        if (trim == null || interfaceC43524h == null || !interfaceC43524h.mo4461m().mo5375a(8)) {
            return trim;
        }
        try {
            return trim.replace("{", "%7B").replace("}", "%7D");
        } catch (Exception unused) {
            return trim;
        }
    }

    /* renamed from: a */
    public final void m3776a(@NonNull String str, @NonNull String str2) {
        this.f115943l.put(str, str2);
    }

    /* renamed from: b */
    public final boolean m3774b() {
        if (this.f115941j == 0 || C43837r.m4819a() / 1000 <= this.f115941j) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m3773c() {
        if (this.f115932a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final String m3772d() {
        if (TextUtils.isEmpty(this.f115940i)) {
            m3771e();
            C43782a.m5010a(0, 3, "ThirdTrack", "getRealUrl url = " + this.f115940i);
        }
        if (m3773c() && m3770f()) {
            InterfaceC43710k interfaceC43710k = C44168c.m3787a().f115926d;
            if (interfaceC43710k != null) {
                this.f115940i = interfaceC43710k.mo4196a(this.f115940i);
                C43782a.m5010a(0, 3, "ThirdTrack", "replaceHost new url = " + this.f115940i);
            } else {
                C43782a.m5009a(0, "ThirdTrack", "replaceHost handle is null, replace failed");
            }
        }
        return this.f115940i;
    }

    /* renamed from: e */
    public final void m3771e() {
        this.f115940i = m3769g();
        C43782a.m5010a(0, 3, "ThirdTrack", "updateRealUrl url = " + this.f115940i);
        JSONObject jSONObject = this.f115935d;
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("real_url", this.f115940i);
            } catch (JSONException unused) {
            }
        }
    }

    public final String toString() {
        return "type=" + this.f115932a + ",name=" + this.f115933b + ",url=" + this.f115940i;
    }

    public C44172d(JSONObject jSONObject, InterfaceC43665g interfaceC43665g) {
        this.f115944m = interfaceC43665g;
        this.f115935d = jSONObject;
        this.f115943l = new HashMap();
        this.f115932a = jSONObject.optInt("type", 0);
        this.f115936e = jSONObject.optString("value", "");
        this.f115933b = jSONObject.optString("name", "");
        this.f115937f = jSONObject.optString(CommonUrlParts.UUID, "");
        this.f115941j = jSONObject.optInt("expired");
        this.f115942k = jSONObject.optInt("replace", 0);
        this.f115934c = jSONObject.optInt("norepeat", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("reg");
        if (optJSONArray != null) {
            this.f115938g = new String[optJSONArray.length()];
            this.f115939h = new String[optJSONArray.length()];
            m3775a(optJSONArray);
        }
        this.f115940i = jSONObject.optString("real_url");
    }

    /* renamed from: a */
    private void m3775a(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.optJSONObject(i) != null) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                this.f115938g[i] = optJSONObject.optString("token", "");
                this.f115939h[i] = optJSONObject.optString("value", "");
            }
        }
    }

    /* renamed from: a */
    public final boolean m3777a() {
        return "bigo_tracker".equals(this.f115937f);
    }
}
