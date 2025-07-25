package sg.bigo.ads.core.p958c;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.C21114v8;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p552ot.pubsub.p553a.C26484a;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.cache.C32111coo2iico;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import sg.bigo.ads.api.AbstractC43532b;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.core.C43558e;
import sg.bigo.ads.api.core.C43572n;
import sg.bigo.ads.api.core.C43578p;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.api.core.InterfaceC43564h;
import sg.bigo.ads.api.core.InterfaceC43565i;
import sg.bigo.ads.api.core.InterfaceC43573o;
import sg.bigo.ads.api.p903a.C43525i;
import sg.bigo.ads.api.p903a.InterfaceC43524h;
import sg.bigo.ads.api.p903a.InterfaceC43528l;
import sg.bigo.ads.api.p904b.AbstractC43534a;
import sg.bigo.ads.api.p904b.AbstractC43540e;
import sg.bigo.ads.api.p904b.InterfaceC43536b;
import sg.bigo.ads.api.p904b.InterfaceC43537c;
import sg.bigo.ads.api.p904b.InterfaceC43541f;
import sg.bigo.ads.common.C43595b;
import sg.bigo.ads.common.p906aa.C43588b;
import sg.bigo.ads.common.p912f.C43620c;
import sg.bigo.ads.common.p937v.C43847a;
import sg.bigo.ads.common.p941x.C43906a;
import sg.bigo.ads.common.p943z.C43912a;
import sg.bigo.ads.common.utils.C43828k;
import sg.bigo.ads.common.utils.C43829l;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.core.p958c.p960b.C44146d;

/* renamed from: sg.bigo.ads.core.c.b */
/* loaded from: classes10.dex */
public final class C44136b {

    /* renamed from: a */
    private static final String[][] f115833a = {new String[]{"0", "1"}, new String[]{"2", "3"}};

    /* renamed from: a */
    private static int m3853a(InterfaceC43565i interfaceC43565i) {
        InterfaceC43565i.InterfaceC43566a mo4320av = interfaceC43565i.mo4320av();
        if (mo4320av != null && mo4320av.mo4315a() && interfaceC43565i.mo4316az()) {
            return C43828k.m4872a(mo4320av.mo4314b()) ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m3849b() {
        int i = C43906a.m4617o() == 2 ? 1 : 0;
        int i2 = C43906a.m4619m() == 2 ? 1 : 0;
        return i | ((C43906a.m4620l() == 2 ? 1 : 0) << 3) | ((C43906a.m4618n() == 2 ? 1 : 0) << 2) | (i2 << 1);
    }

    @NonNull
    /* renamed from: c */
    public static Map<String, String> m3844c(@NonNull InterfaceC43550c interfaceC43550c, @NonNull AbstractC43534a abstractC43534a) {
        return m3856a(interfaceC43550c, abstractC43534a, true);
    }

    @NonNull
    /* renamed from: a */
    private static Map<String, String> m3891a(Map<String, String> map, @Nullable InterfaceC43550c interfaceC43550c, String str, String str2, int i) {
        C43572n mo4261aX;
        map.put("show_proportion", str);
        map.put("ad_size", str2);
        map.put("render_style", String.valueOf(i));
        if ((interfaceC43550c instanceof InterfaceC43573o) && (mo4261aX = ((InterfaceC43573o) interfaceC43550c).mo4261aX()) != null) {
            map.put("creative_size", C43836q.m4830a("%1$d*%2$d", Integer.valueOf(mo4261aX.f114119a), Integer.valueOf(mo4261aX.f114120b)));
        }
        return map;
    }

    /* renamed from: b */
    public static void m3848b(int i, int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", String.valueOf(i));
        hashMap.put(KeyConstants.RequestBody.KEY_SCENE, String.valueOf(i2));
        if (!C43836q.m4837a((CharSequence) str)) {
            hashMap.put("error", str);
        }
        m3899a("06002063", hashMap);
    }

    /* renamed from: a */
    private static Map<String, String> m3890a(Map<String, String> map, @Nullable InterfaceC43564h interfaceC43564h) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (interfaceC43564h == null) {
            return map;
        }
        map.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, interfaceC43564h.mo5411c());
        map.put("gps_country", interfaceC43564h.mo5410d());
        map.put("sim_country", interfaceC43564h.mo5409e());
        map.put("system_country", interfaceC43564h.mo5408f());
        map.put("req_status", String.valueOf(interfaceC43564h.mo5406h()));
        map.put(CommonUrlParts.UUID, String.valueOf(interfaceC43564h.mo5405i()));
        map.put("cfg_sta", String.valueOf(interfaceC43564h.mo5404j()));
        if (interfaceC43564h.mo5402l() > 0) {
            long mo5402l = interfaceC43564h.mo5402l() - interfaceC43564h.mo5403k();
            if (mo5402l >= 0) {
                map.put("cfg_cost", String.valueOf(mo5402l));
            }
        }
        if (interfaceC43564h.mo5401m() > 0) {
            long mo5401m = interfaceC43564h.mo5401m() - interfaceC43564h.mo5403k();
            if (mo5401m >= 0) {
                map.put("delay_cost", String.valueOf(mo5401m));
            }
        }
        if (interfaceC43564h.mo5401m() > 0 && interfaceC43564h.mo5402l() > 0) {
            long mo5401m2 = interfaceC43564h.mo5401m() - interfaceC43564h.mo5402l();
            if (mo5401m2 >= 0) {
                map.put("req_queue_time", String.valueOf(mo5401m2));
            }
        }
        if (interfaceC43564h.mo5400n() > 0) {
            long mo5400n = interfaceC43564h.mo5400n() - interfaceC43564h.mo5403k();
            if (mo5400n >= 0) {
                map.put("net_cost", String.valueOf(mo5400n));
            }
        }
        String mo5407g = interfaceC43564h.mo5407g();
        if (!C43836q.m4837a((CharSequence) mo5407g)) {
            map.put("load_ext", mo5407g);
        }
        return map;
    }

    /* renamed from: b */
    public static void m3847b(Map<String, String> map) {
        m3899a("06002014", map);
    }

    @NonNull
    /* renamed from: a */
    private static Map<String, String> m3889a(@Nullable InterfaceC43528l interfaceC43528l) {
        HashMap hashMap = new HashMap();
        if (interfaceC43528l == null) {
            return hashMap;
        }
        hashMap.put("slot", interfaceC43528l.mo4427l());
        hashMap.put("config_id", String.valueOf(C43525i.f114036a.mo4465h()));
        hashMap.put("placement_id", interfaceC43528l.mo4425n());
        hashMap.put("strategy_id", interfaceC43528l.mo4442a());
        hashMap.put("ad_type", String.valueOf(interfaceC43528l.mo4438b()));
        hashMap.put("abflags", C43836q.m4832a(C43525i.f114036a.mo4464i(), interfaceC43528l.mo4424o()));
        hashMap.put("auc_mode", String.valueOf(interfaceC43528l.mo4417v()));
        return hashMap;
    }

    /* renamed from: b */
    private static void m3846b(@NonNull Map<String, String> map, @NonNull InterfaceC43550c interfaceC43550c) {
        List<InterfaceC43550c> mo4358am = interfaceC43550c.mo4358am();
        if (mo4358am == null || mo4358am.size() <= 0) {
            return;
        }
        int i = 0;
        InterfaceC43550c interfaceC43550c2 = mo4358am.get(0);
        if (interfaceC43550c2 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("ad_id", String.valueOf(interfaceC43550c2.mo4330r()));
                jSONObject.putOpt("creative_id", String.valueOf(interfaceC43550c2.mo4330r()));
                jSONObject.putOpt("is_playable", String.valueOf(interfaceC43550c2.mo4367ad()));
                if (interfaceC43550c2 instanceof InterfaceC43573o) {
                    InterfaceC43573o interfaceC43573o = (InterfaceC43573o) interfaceC43550c2;
                    jSONObject.putOpt("material_type", interfaceC43573o.mo4265aT() ? "2" : "1");
                    jSONObject.putOpt("media_type", interfaceC43573o.mo4249ba());
                    jSONObject.putOpt("companion_type", f115833a[interfaceC43573o.mo4278aG() ? (char) 1 : (char) 0][interfaceC43573o.mo4279aF() ? (char) 1 : (char) 0]);
                    if (interfaceC43573o.mo4327w() == 2) {
                        jSONObject.putOpt("fill_strategy", String.valueOf(interfaceC43573o.mo4244bf()));
                        jSONObject.putOpt("dl_status", String.valueOf(interfaceC43573o.mo4243bg()));
                        if (interfaceC43573o.mo4244bf() == 2) {
                            if (!C43836q.m4837a((CharSequence) interfaceC43573o.mo4264aU())) {
                                i = 1;
                            }
                            jSONObject.putOpt("backup_source", String.valueOf(i));
                        }
                    }
                }
                map.put("ad2", String.valueOf(jSONObject));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
        if (r2.mo4252az().mo4197d() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00d4, code lost:
        if (r2.mo4252az().mo4197d() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00d6, code lost:
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0187  */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.Map<java.lang.String, java.lang.String> m3856a(@androidx.annotation.NonNull sg.bigo.ads.api.core.InterfaceC43550c r11, @androidx.annotation.Nullable sg.bigo.ads.api.p904b.AbstractC43534a r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.p958c.C44136b.m3856a(sg.bigo.ads.api.core.c, sg.bigo.ads.api.b.a, boolean):java.util.Map");
    }

    /* renamed from: b */
    public static void m3845b(@NonNull InterfaceC43550c interfaceC43550c, @NonNull AbstractC43534a abstractC43534a) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("rew_rslt", "1");
        m3856a.put("out_ad", String.valueOf(abstractC43534a.m5453H()));
        m3895a(m3856a, abstractC43534a, false);
        m3899a("06002019", m3856a);
    }

    @NonNull
    /* renamed from: a */
    private static Map<String, String> m3855a(@NonNull InterfaceC43550c interfaceC43550c, @NonNull InterfaceC43541f interfaceC43541f) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        InterfaceC43550c.InterfaceC43552b mo4393N = interfaceC43550c.mo4393N();
        m3856a.put("final_url_type", String.valueOf(interfaceC43541f.mo4037h()));
        m3856a.put("redirect_num", String.valueOf(interfaceC43541f.mo4036i()));
        m3856a.put("preload_t", String.valueOf(mo4393N.mo4294f()));
        m3856a.put("progress", String.valueOf(interfaceC43541f.mo4035j()));
        m3856a.put("click_index", String.valueOf(interfaceC43541f.mo4033l()));
        m3856a.put("preload_scene", String.valueOf(mo4393N.mo4289k()));
        m3856a.put("preload_ready", interfaceC43541f.mo4034k() ? "1" : "0");
        m3856a.put("land_way", String.valueOf(interfaceC43541f.mo4032m()));
        m3856a.put("webview_layout", String.valueOf(interfaceC43541f.mo4040f()));
        m3856a.put("url", interfaceC43541f.mo4039g());
        Map<String, String> mo4031n = interfaceC43541f.mo4031n();
        if (mo4031n != null) {
            m3856a.putAll(mo4031n);
        }
        return m3856a;
    }

    /* renamed from: a */
    public static void m3910a() {
        HashMap hashMap = new HashMap();
        hashMap.put(KeyConstants.RequestBody.KEY_BUILD, C43912a.m4592b());
        hashMap.put("cpu_info", C43912a.m4591c());
        m3899a("06002059", hashMap);
    }

    /* renamed from: a */
    public static void m3909a(int i, int i2, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", String.valueOf(i));
        hashMap.put("times", String.valueOf(i2));
        hashMap.put("cost", String.valueOf(j));
        m3899a("06002064", hashMap);
    }

    /* renamed from: a */
    public static void m3908a(int i, int i2, String str) {
        m3876a((InterfaceC43550c) null, i, i2, str);
    }

    /* renamed from: a */
    public static void m3907a(int i, long j, long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put("start_type", String.valueOf(i));
        hashMap.put("start_time", String.valueOf(j));
        hashMap.put("duration", String.valueOf(j2));
        m3899a("06002044", hashMap);
    }

    /* renamed from: a */
    public static void m3906a(long j, int i, int i2, int i3, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put("ts", String.valueOf(j));
        hashMap.put("load_num", String.valueOf(i));
        hashMap.put("fill_num", String.valueOf(i2));
        hashMap.put("imp_num", String.valueOf(i3));
        hashMap.put("click_num", String.valueOf(i4));
        m3899a("06002039", hashMap);
    }

    /* renamed from: a */
    public static void m3905a(long j, int i, int i2, String str, int i3, boolean z, int i4, String str2) {
        C44146d c44146d = new C44146d("06002002");
        c44146d.m3823a("rslt", "0");
        c44146d.m3824a("cost", j);
        c44146d.m3825a("e_code", i);
        c44146d.m3825a("s_code", i2);
        c44146d.m3823a("error", str);
        c44146d.m3825a("src", i3);
        c44146d.m3823a("in_fg", String.valueOf(z ? 1 : 2));
        c44146d.m3823a("times", String.valueOf(i4));
        if (!TextUtils.isEmpty(str2)) {
            c44146d.m3823a(CommonUrlParts.UUID, str2);
        }
        m3851a(c44146d);
    }

    /* renamed from: a */
    public static void m3904a(long j, int i, String str, String str2, Map<String, String> map) {
        C44146d c44146d = new C44146d("06002001");
        c44146d.m3823a("states", "success");
        c44146d.m3824a("cost", j);
        c44146d.m3825a("status", i);
        c44146d.m3825a("cur_in_fg", C43620c.m5296c());
        if (!TextUtils.isEmpty(str)) {
            c44146d.m3823a(CommonUrlParts.UUID, str);
        }
        c44146d.m3823a("tc_string", str2);
        String m4868a = C43829l.m4868a(map);
        if (!TextUtils.isEmpty(m4868a)) {
            c44146d.m3823a("cost_map", m4868a);
        }
        m3851a(c44146d);
    }

    /* renamed from: a */
    public static void m3903a(long j, long j2, boolean z, int i, boolean z2, int i2, String str) {
        C44146d c44146d = new C44146d("06002002");
        c44146d.m3823a("rslt", "1");
        c44146d.m3824a("config_id", j);
        c44146d.m3824a("cost", j2);
        c44146d.m3823a("n_rt", z ? "0" : "1");
        c44146d.m3825a("src", i);
        c44146d.m3823a("in_fg", String.valueOf(z2 ? 1 : 2));
        c44146d.m3823a("times", String.valueOf(i2));
        if (!TextUtils.isEmpty(str)) {
            c44146d.m3823a(CommonUrlParts.UUID, str);
        }
        c44146d.m3825a("cur_in_fg", C43620c.m5296c());
        m3851a(c44146d);
    }

    /* renamed from: a */
    public static void m3902a(long j, boolean z, String str, int i, String str2) {
        C44146d c44146d = new C44146d("06002051");
        c44146d.m3823a("rslt", "0");
        c44146d.m3824a("cost", j);
        c44146d.m3823a("clear", z ? "1" : "0");
        c44146d.m3823a("url", str);
        c44146d.m3825a("e_code", i);
        c44146d.m3823a("error", str2);
        m3851a(c44146d);
    }

    /* renamed from: a */
    public static void m3901a(long j, boolean z, String str, boolean z2) {
        C44146d c44146d = new C44146d("06002051");
        c44146d.m3823a("rslt", "1");
        c44146d.m3824a("cost", j);
        c44146d.m3823a("clear", z ? "1" : "0");
        c44146d.m3823a("update", z2 ? "1" : "0");
        c44146d.m3823a("url", str);
        m3851a(c44146d);
    }

    /* renamed from: a */
    public static void m3900a(String str, List<String> list, String str2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("rslt", str);
        if (!C43828k.m4877a((Collection) list)) {
            hashMap.put("reason", list.toString());
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("browser", str2);
        }
        hashMap.put("open_way", String.valueOf(i));
        m3899a("06002060", hashMap);
    }

    /* renamed from: a */
    private static void m3899a(@NonNull String str, Map<String, String> map) {
        C44146d c44146d = new C44146d(str);
        c44146d.m3822a(map);
        m3851a(c44146d);
    }

    /* renamed from: a */
    public static void m3898a(@Nullable String str, @Nullable InterfaceC43550c interfaceC43550c, String str2, String str3, String str4, int i, int i2, int i3, String str5, long j, int i4, String str6, int i5, int i6, int i7, int i8, boolean z, boolean z2, int i9, String str7) {
        Map<String, String> map;
        if (interfaceC43550c == null) {
            map = new HashMap<>();
        } else {
            Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
            m3856a.put("ad_resp_type", String.valueOf(interfaceC43550c.mo4327w()));
            if (interfaceC43550c instanceof InterfaceC43573o) {
                InterfaceC43573o interfaceC43573o = (InterfaceC43573o) interfaceC43550c;
                if (interfaceC43550c.mo4327w() == 2) {
                    m3856a.put("dl_status", String.valueOf(interfaceC43573o.mo4243bg()));
                }
                if (interfaceC43573o.mo4327w() == 2) {
                    m3856a.put("fill_strategy", String.valueOf(interfaceC43573o.mo4244bf()));
                }
                if (interfaceC43573o.mo4244bf() == 2) {
                    m3856a.put("backup_source", String.valueOf(!C43836q.m4837a((CharSequence) interfaceC43573o.mo4264aU()) ? 1 : 0));
                }
                m3856a.put("companion_type", f115833a[interfaceC43573o.mo4278aG() ? 1 : 0][interfaceC43573o.mo4279aF() ? 1 : 0]);
                m3856a.put("backup_dl_status", String.valueOf(interfaceC43573o.mo4241bi()));
            }
            map = m3856a;
        }
        if (!map.containsKey("slot") && !TextUtils.isEmpty(str)) {
            map.put("slot", str);
        }
        if (!map.containsKey("ad_type") && !TextUtils.isEmpty(str2)) {
            map.put("ad_type", str2);
        }
        map.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, str3 == null ? "0" : str3);
        map.put("session_id2", str4 == null ? "0" : str4);
        map.put("rslt", String.valueOf(i));
        map.put("e_code", String.valueOf(i2));
        map.put("s_code", String.valueOf(i3));
        if (str5 != null) {
            map.put("error", str5);
        }
        map.put("cost_total", String.valueOf(j));
        map.put("cache_ad_source", String.valueOf(str6));
        map.put("cache_ad", String.valueOf(i4));
        map.put("cache_req_status", String.valueOf(i5));
        map.put("req_type", String.valueOf(i6));
        map.put("cur_req_status", String.valueOf(i7));
        map.put("adx_type_req", String.valueOf(i8));
        map.put("cur_in_fg", String.valueOf(C43620c.m5296c()));
        map.put("encrypt", z ? "1" : "0");
        map.put("req_encrypt_enable", z2 ? "1" : "0");
        map.put("resp_decrypt_enable", String.valueOf(i9));
        if (!TextUtils.isEmpty(str7)) {
            map.put("enc_logid", str7);
        }
        m3899a("06002057", map);
    }

    /* renamed from: a */
    public static void m3897a(String str, boolean z, long j, int i, String str2, boolean z2, int i2, String str3, String str4, String str5, String str6, boolean z3, boolean z4, int i3, String str7) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("rslt", z ? "1" : "0");
        hashMap.put("cost", String.valueOf(j));
        hashMap.put("res_code", String.valueOf(i));
        hashMap.put("res_msg", String.valueOf(str2));
        hashMap.put("in_fg", String.valueOf(z2 ? 1 : 0));
        hashMap.put("size", String.valueOf(i2));
        int m4620l = C43906a.m4620l();
        int m4619m = C43906a.m4619m();
        int m4618n = C43906a.m4618n();
        int m4617o = C43906a.m4617o();
        if (m4620l != 0 || m4619m != 0 || m4618n != 0 || m4617o != 0) {
            String str8 = m4620l == 1 ? "GDPR" : "";
            if (m4619m == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str8);
                sb2.append(str8.length() == 0 ? "" : C21114v8.C21123i.f54135c);
                sb2.append("CCPA");
                str8 = sb2.toString();
            }
            if (m4618n == 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str8);
                sb3.append(str8.length() == 0 ? "" : C21114v8.C21123i.f54135c);
                sb3.append("LGPD");
                str8 = sb3.toString();
            }
            if (m4617o == 1) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str8);
                sb4.append(str8.length() != 0 ? C21114v8.C21123i.f54135c : "");
                sb4.append("COPPA");
                str8 = sb4.toString();
            }
            hashMap.put("privacy", str8);
            hashMap.put(C21114v8.C21123i.f54134b0, "1");
        }
        hashMap.put("gps_country", str3);
        hashMap.put("sim_country", str4);
        hashMap.put("system_country", str5);
        if (!TextUtils.isEmpty(str6)) {
            hashMap.put(CommonUrlParts.UUID, str6);
        }
        hashMap.put("encrypt", z3 ? "1" : "0");
        hashMap.put("req_encrypt_enable", z4 ? "1" : "0");
        hashMap.put("resp_decrypt_enable", String.valueOf(i3));
        if (!TextUtils.isEmpty(str7)) {
            hashMap.put("enc_logid", String.valueOf(str7));
        }
        m3899a("06002015", hashMap);
    }

    /* renamed from: a */
    public static void m3896a(Map<String, String> map) {
        m3899a("06002013", map);
    }

    /* renamed from: a */
    public static void m3895a(@NonNull Map<String, String> map, @Nullable AbstractC43534a abstractC43534a, boolean z) {
        AbstractC43534a m5455F = abstractC43534a != null ? abstractC43534a.m5455F() : null;
        if (m5455F instanceof AbstractC43540e) {
            AbstractC43540e abstractC43540e = (AbstractC43540e) m5455F;
            m3893a(map, abstractC43540e, false);
            if (z) {
                map.put("scene_page", String.valueOf(abstractC43540e.f114065b));
            }
        }
    }

    /* renamed from: a */
    private static void m3894a(@NonNull Map<String, String> map, @NonNull InterfaceC43536b interfaceC43536b) {
        InterfaceC43550c mo5435i = interfaceC43536b.mo5435i();
        if (mo5435i != null) {
            map.put("host_slot", mo5435i.mo4351b());
            map.put("host_placement", mo5435i.mo4348c());
            map.put("host_sid", String.valueOf(mo5435i.mo4325y()));
            map.put("host_ad_id", mo5435i.mo4330r());
        }
        if (interfaceC43536b instanceof InterfaceC43537c) {
            map.put("icon_req_num", String.valueOf(((InterfaceC43537c) interfaceC43536b).mo5434j()));
        }
    }

    @NonNull
    /* renamed from: a */
    private static void m3893a(@NonNull Map<String, String> map, @NonNull AbstractC43540e abstractC43540e, boolean z) {
        AbstractC43532b m5452I = abstractC43540e.m5452I();
        if (m5452I instanceof InterfaceC43536b) {
            m3894a(map, (InterfaceC43536b) m5452I);
        }
        map.put("icon_fill_num", String.valueOf(abstractC43540e.mo5429i()));
        map.put("icon_fill_scene", String.valueOf(abstractC43540e.mo5430h()));
        InterfaceC43550c interfaceC43550c = (InterfaceC43550c) C43828k.m4870b(abstractC43540e.mo5427a());
        if (!z || interfaceC43550c == null) {
            return;
        }
        map.put("sid", String.valueOf(interfaceC43550c.mo4325y()));
        map.put(C32111coo2iico.C32113cioccoiococ.c2oc2o, interfaceC43550c.mo4328v());
        map.put("adx_type", String.valueOf(interfaceC43550c.mo4327w()));
    }

    /* renamed from: a */
    private static void m3892a(@NonNull Map<String, String> map, @NonNull InterfaceC43550c interfaceC43550c) {
        if (interfaceC43550c instanceof InterfaceC43573o) {
            if ((interfaceC43550c.mo4326x() == 3 || interfaceC43550c.mo4326x() == 4) && interfaceC43550c.mo4327w() == 2) {
                InterfaceC43573o interfaceC43573o = (InterfaceC43573o) interfaceC43550c;
                int mo4277aH = interfaceC43573o.mo4277aH();
                map.put("ser_multi_vid", String.valueOf(mo4277aH));
                if (mo4277aH == 3) {
                    String mo4276aI = interfaceC43573o.mo4276aI();
                    if (TextUtils.isEmpty(mo4276aI)) {
                        return;
                    }
                    map.put("media_reason", String.valueOf(mo4276aI));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3888a(@Nullable InterfaceC43528l interfaceC43528l, @Nullable AbstractC43532b abstractC43532b, int i, int i2, String str, int i3, int i4, int i5, boolean z, int i6, String str2) {
        Map<String, String> m3889a = m3889a(interfaceC43528l);
        m3889a.put("rslt", "0");
        m3889a.put("e_code", String.valueOf(i));
        m3889a.put("s_code", String.valueOf(i2));
        m3889a.put("error", str);
        if (abstractC43532b != null) {
            if (!m3889a.containsKey("slot")) {
                m3889a.put("slot", abstractC43532b.f114037a);
                m3889a.put("ad_type", String.valueOf(abstractC43532b.mo5358c()));
            }
            m3889a.put("banner_type", String.valueOf(abstractC43532b.f114039c));
            String str3 = abstractC43532b.f114043g.f114044a;
            if (!C43836q.m4837a((CharSequence) str3)) {
                m3889a.put("load_ext", str3);
            }
            AbstractC43532b.C43533a c43533a = abstractC43532b.f114043g;
            m3890a(m3889a, c43533a);
            m3889a.put("cost", String.valueOf(Math.max(0L, c43533a.mo5400n() - c43533a.mo5403k())));
            if (abstractC43532b instanceof InterfaceC43536b) {
                m3894a(m3889a, (InterfaceC43536b) abstractC43532b);
            }
        }
        m3889a.put("req_type", String.valueOf(i3));
        m3889a.put("cur_req_status", String.valueOf(i4));
        m3889a.put("cur_in_fg", String.valueOf(C43620c.m5296c()));
        m3889a.put("encrypt", String.valueOf(i5));
        m3889a.put("req_encrypt_enable", z ? "1" : "0");
        m3889a.put("resp_decrypt_enable", String.valueOf(i6));
        if (!TextUtils.isEmpty(str2)) {
            m3889a.put("enc_logid", str2);
        }
        m3899a("06002007", m3889a);
    }

    /* renamed from: a */
    public static void m3887a(@NonNull AbstractC43534a abstractC43534a, int i, int i2, String str) {
        Map<String, String> m3856a;
        InterfaceC43564h interfaceC43564h;
        if (abstractC43534a instanceof AbstractC43540e) {
            AbstractC43532b m5452I = abstractC43534a.m5452I();
            m3856a = m3889a(m5452I.mo5456h());
            m3893a(m3856a, (AbstractC43540e) abstractC43534a, true);
            if (m5452I instanceof InterfaceC43537c) {
                m3856a.put("scene_page", String.valueOf(((InterfaceC43537c) m5452I).mo5433k()));
            }
            interfaceC43564h = m5452I.f114043g;
        } else {
            InterfaceC43550c mo5439f = abstractC43534a.mo5439f();
            m3856a = m3856a(mo5439f, (AbstractC43534a) null, false);
            InterfaceC43564h mo4370aa = mo5439f.mo4370aa();
            if (mo5439f instanceof InterfaceC43573o) {
                InterfaceC43573o interfaceC43573o = (InterfaceC43573o) mo5439f;
                m3856a.put("material_type", interfaceC43573o.mo4265aT() ? "2" : "1");
                m3856a.put("media_type", interfaceC43573o.mo4249ba());
                m3856a.put("companion_type", f115833a[interfaceC43573o.mo4278aG() ? 1 : 0][interfaceC43573o.mo4279aF() ? 1 : 0]);
                if (interfaceC43573o.mo4327w() == 2) {
                    m3856a.put("fill_strategy", String.valueOf(interfaceC43573o.mo4244bf()));
                    m3856a.put("dl_status", String.valueOf(interfaceC43573o.mo4243bg()));
                    if (interfaceC43573o.mo4244bf() == 2) {
                        m3856a.put("backup_source", String.valueOf(1 ^ (C43836q.m4837a((CharSequence) interfaceC43573o.mo4264aU()) ? 1 : 0)));
                    }
                    m3856a.put("media_type", interfaceC43573o.mo4249ba());
                }
            }
            m3892a(m3856a, mo5439f);
            m3846b(m3856a, mo5439f);
            interfaceC43564h = mo4370aa;
        }
        long mo5399o = interfaceC43564h.mo5399o() - interfaceC43564h.mo5400n();
        m3856a.put("rslt", "0");
        m3856a.put("cost", String.valueOf(mo5399o));
        m3856a.put("cost_total", String.valueOf(interfaceC43564h.mo5399o() - interfaceC43564h.mo5403k()));
        m3856a.put("e_code", String.valueOf(i));
        m3856a.put("s_code", String.valueOf(i2));
        m3856a.put("error", str);
        m3856a.put("cur_in_fg", String.valueOf(C43620c.m5296c()));
        m3856a.remove("cache_ad");
        m3856a.remove("cache_ad_source");
        m3856a.remove("cache_req_status");
        m3856a.remove("session_id2");
        C43578p m5454G = abstractC43534a.m5454G();
        if (m5454G != null) {
            m3856a.put("encrypt", m5454G.f114124a ? "1" : "0");
            m3856a.put("req_encrypt_enable", m5454G.f114125b ? "1" : "0");
            m3856a.put("resp_decrypt_enable", String.valueOf(m5454G.f114126c));
            String str2 = m5454G.f114127d;
            if (!TextUtils.isEmpty(str2)) {
                m3856a.put("enc_logid", str2);
            }
        }
        m3899a("06002008", m3856a);
    }

    /* renamed from: a */
    public static void m3886a(@NonNull AbstractC43534a abstractC43534a, String str, String str2, int i) {
        Map<String, String> m3856a;
        int mo4284aA;
        if (abstractC43534a instanceof AbstractC43540e) {
            m3856a = m3889a(abstractC43534a.m5452I().mo5456h());
            m3893a(m3856a, (AbstractC43540e) abstractC43534a, true);
            m3891a(m3856a, (InterfaceC43550c) null, str, str2, i);
        } else {
            InterfaceC43550c mo5439f = abstractC43534a.mo5439f();
            m3856a = m3856a(mo5439f, (AbstractC43534a) null, false);
            m3891a(m3856a, mo5439f, str, str2, i);
            if ((mo5439f instanceof InterfaceC43573o) && (mo4284aA = ((InterfaceC43573o) mo5439f).mo4284aA()) != 0) {
                m3856a.put("show_method", String.valueOf(mo4284aA));
            }
        }
        m3899a("06002029", m3856a);
    }

    /* renamed from: a */
    public static void m3885a(@NonNull AbstractC43534a abstractC43534a, String str, String str2, int i, long j, long j2, long j3, int i2, int i3, int i4) {
        Map<String, String> m3856a;
        C43595b m5342d;
        if (abstractC43534a instanceof AbstractC43540e) {
            AbstractC43540e abstractC43540e = (AbstractC43540e) abstractC43534a;
            m3856a = m3889a(abstractC43534a.m5452I().mo5456h());
            m3893a(m3856a, abstractC43540e, true);
            m3856a.put("icon_show_num", String.valueOf(abstractC43540e.mo5428j()));
            m3856a.put("scene_page", String.valueOf(abstractC43540e.f114065b));
        } else {
            InterfaceC43550c mo5439f = abstractC43534a.mo5439f();
            m3856a = m3856a(mo5439f, (AbstractC43534a) null, false);
            boolean z = mo5439f instanceof InterfaceC43573o;
            if (z) {
                InterfaceC43573o interfaceC43573o = (InterfaceC43573o) mo5439f;
                C43572n mo4261aX = interfaceC43573o.mo4261aX();
                if (mo4261aX != null) {
                    m3856a.put("creative_size", C43836q.m4830a("%1$d*%2$d", Integer.valueOf(mo4261aX.f114119a), Integer.valueOf(mo4261aX.f114120b)));
                }
                int mo4284aA = interfaceC43573o.mo4284aA();
                if (mo4284aA != 0) {
                    m3856a.put("show_method", String.valueOf(mo4284aA));
                }
                m3856a.put("companion_type", f115833a[interfaceC43573o.mo4278aG() ? 1 : 0][interfaceC43573o.mo4279aF() ? 1 : 0]);
                if (interfaceC43573o.mo4327w() == 2) {
                    m3856a.put("fill_strategy", String.valueOf(interfaceC43573o.mo4244bf()));
                    m3856a.put("dl_status", String.valueOf(interfaceC43573o.mo4243bg()));
                    if (interfaceC43573o.mo4244bf() == 2) {
                        m3856a.put("backup_source", String.valueOf(!C43836q.m4837a((CharSequence) interfaceC43573o.mo4264aU()) ? 1 : 0));
                        m3856a.put("backup_dl_status", String.valueOf(interfaceC43573o.mo4241bi()));
                    }
                    m3856a.put("backup_creative", String.valueOf(interfaceC43573o.mo4242bh()));
                }
                m3856a.put("media_type", interfaceC43573o.mo4249ba());
            }
            m3892a(m3856a, mo5439f);
            if (z && mo5439f.mo4326x() == 2 && (mo5439f.mo4327w() == 2 || mo5439f.mo4327w() == 1)) {
                if (i2 != -1) {
                    m3856a.put("icon_sta", String.valueOf(i2));
                }
                if (i3 != -1) {
                    m3856a.put("img_sta", String.valueOf(i3));
                }
                if (i4 != -1) {
                    m3856a.put("vid_sta", String.valueOf(i4));
                }
            }
        }
        m3856a.put("show_proportion", str);
        m3856a.put("ad_size", str2);
        m3856a.put("render_style", String.valueOf(i));
        m3856a.put("render_cost", String.valueOf(j));
        m3856a.put("attach_render_cost", String.valueOf(j2));
        m3856a.put("cost", String.valueOf(j3));
        m3856a.put("cur_in_fg", String.valueOf(C43620c.m5296c()));
        m3856a.put("out_ad", String.valueOf(abstractC43534a.m5453H()));
        int i5 = abstractC43534a.f114057J;
        if (i5 != 0) {
            m3856a.put("show_method_source", String.valueOf(i5));
        }
        int i6 = abstractC43534a.f114058K;
        if (i6 != 0) {
            m3856a.put("show_acty_source", String.valueOf(i6));
        }
        InterfaceC43524h interfaceC43524h = C43525i.f114036a;
        if (interfaceC43524h != null && interfaceC43524h.mo4461m().mo5375a(15) && (m5342d = C43588b.m5342d()) != null) {
            m3856a.put("bat_stat", String.valueOf(m5342d.f114165c));
            m3856a.put("bat_num", String.valueOf(m5342d.f114163a));
            m3856a.put("bat_scale", String.valueOf(m5342d.f114164b));
        }
        m3899a("06002010", m3856a);
    }

    /* renamed from: a */
    public static void m3884a(@NonNull AbstractC43534a abstractC43534a, boolean z) {
        Map<String, String> m3856a;
        InterfaceC43564h interfaceC43564h;
        if (abstractC43534a instanceof AbstractC43540e) {
            AbstractC43532b m5452I = abstractC43534a.m5452I();
            m3856a = m3889a(m5452I.mo5456h());
            m3893a(m3856a, (AbstractC43540e) abstractC43534a, true);
            if (m5452I instanceof InterfaceC43537c) {
                m3856a.put("scene_page", String.valueOf(((InterfaceC43537c) m5452I).mo5433k()));
            }
            interfaceC43564h = m5452I.f114043g;
        } else {
            InterfaceC43550c mo5439f = abstractC43534a.mo5439f();
            m3856a = m3856a(mo5439f, (AbstractC43534a) null, false);
            InterfaceC43564h mo4370aa = mo5439f.mo4370aa();
            if (mo5439f instanceof InterfaceC43573o) {
                InterfaceC43573o interfaceC43573o = (InterfaceC43573o) mo5439f;
                m3856a.put("material_type", interfaceC43573o.mo4265aT() ? "2" : "1");
                m3856a.put("media_type", interfaceC43573o.mo4249ba());
                m3856a.put("companion_type", f115833a[interfaceC43573o.mo4278aG() ? 1 : 0][interfaceC43573o.mo4279aF() ? 1 : 0]);
                if (interfaceC43573o.mo4327w() == 2) {
                    m3856a.put("fill_strategy", String.valueOf(interfaceC43573o.mo4244bf()));
                    m3856a.put("dl_status", String.valueOf(interfaceC43573o.mo4243bg()));
                    if (interfaceC43573o.mo4244bf() == 2) {
                        m3856a.put("backup_source", String.valueOf(1 ^ (C43836q.m4837a((CharSequence) interfaceC43573o.mo4264aU()) ? 1 : 0)));
                        m3856a.put("backup_dl_status", String.valueOf(interfaceC43573o.mo4241bi()));
                    }
                    m3856a.put("media_type", interfaceC43573o.mo4249ba());
                }
            }
            m3892a(m3856a, mo5439f);
            m3846b(m3856a, mo5439f);
            interfaceC43564h = mo4370aa;
        }
        long mo5399o = interfaceC43564h.mo5399o() - interfaceC43564h.mo5400n();
        m3856a.put("rslt", "1");
        m3856a.put("cost", String.valueOf(mo5399o));
        m3856a.put("cost_total", String.valueOf(interfaceC43564h.mo5399o() - interfaceC43564h.mo5403k()));
        m3856a.put("is_cache", z ? "1" : "0");
        m3856a.put("cur_in_fg", String.valueOf(C43620c.m5296c()));
        m3856a.remove("cache_ad");
        m3856a.remove("cache_ad_source");
        m3856a.remove("cache_req_status");
        m3856a.remove("session_id2");
        C43578p m5454G = abstractC43534a.m5454G();
        if (m5454G != null) {
            m3856a.put("encrypt", m5454G.f114124a ? "1" : "0");
            m3856a.put("req_encrypt_enable", m5454G.f114125b ? "1" : "0");
            m3856a.put("resp_decrypt_enable", String.valueOf(m5454G.f114126c));
            String str = m5454G.f114127d;
            if (!TextUtils.isEmpty(str)) {
                m3856a.put("enc_logid", str);
            }
        }
        m3899a("06002008", m3856a);
    }

    /* renamed from: a */
    public static void m3883a(@NonNull InterfaceC43541f interfaceC43541f, @Nullable InterfaceC43541f.InterfaceC43542a interfaceC43542a, long j, int i, @NonNull InterfaceC43550c interfaceC43550c, @Nullable AbstractC43534a abstractC43534a, String str) {
        Map<String, String> m3855a = m3855a(interfaceC43550c, interfaceC43541f);
        if (interfaceC43542a != null) {
            m3855a.put("status", String.valueOf(interfaceC43542a.mo4029a()));
            m3855a.put("cost", String.valueOf(interfaceC43542a.mo4028b()));
        }
        m3855a.put("duration", String.valueOf(j));
        m3855a.put("num", String.valueOf(i));
        m3855a.put("out_ad", String.valueOf(abstractC43534a == null ? C43847a.f114694a : abstractC43534a.m5453H()));
        if (!TextUtils.isEmpty(str)) {
            m3855a.put("task_affinity", str);
        }
        m3895a(m3855a, abstractC43534a, false);
        m3899a("06002062", m3855a);
    }

    /* renamed from: a */
    public static void m3882a(@NonNull InterfaceC43541f interfaceC43541f, @NonNull InterfaceC43541f.InterfaceC43542a interfaceC43542a, @NonNull InterfaceC43550c interfaceC43550c, @Nullable AbstractC43534a abstractC43534a, String str) {
        Map<String, String> m3855a = m3855a(interfaceC43550c, interfaceC43541f);
        m3855a.put("status", String.valueOf(interfaceC43542a.mo4029a()));
        m3855a.put("cost", String.valueOf(interfaceC43542a.mo4028b()));
        m3855a.put("out_ad", String.valueOf(abstractC43534a == null ? C43847a.f114694a : abstractC43534a.m5453H()));
        if (!TextUtils.isEmpty(str)) {
            m3855a.put("task_affinity", str);
        }
        m3895a(m3855a, abstractC43534a, false);
        m3899a("06002061", m3855a);
    }

    /* renamed from: a */
    public static void m3881a(@Nullable InterfaceC43550c interfaceC43550c) {
        m3899a("06002047", m3856a(interfaceC43550c, (AbstractC43534a) null, false));
    }

    /* renamed from: a */
    public static void m3880a(@NonNull InterfaceC43550c interfaceC43550c, int i, int i2) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("page_style", String.valueOf(i));
        m3856a.put("page_source", String.valueOf(i2));
        m3899a("06002041", m3856a);
    }

    /* renamed from: a */
    public static void m3879a(InterfaceC43550c interfaceC43550c, int i, int i2, int i3, int i4, int i5, int i6) {
        Map hashMap = interfaceC43550c == null ? new HashMap() : m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        hashMap.put("multi_scene", String.valueOf(i));
        hashMap.put("action", String.valueOf(i2));
        hashMap.put("multi_num", String.valueOf(i3));
        hashMap.put("multi_status_loading_num", String.valueOf(i4));
        hashMap.put("multi_status_success_num", String.valueOf(i5));
        hashMap.put("multi_status_failed_num", String.valueOf(i6));
        m3899a("06002058", hashMap);
    }

    /* renamed from: a */
    public static void m3878a(@Nullable InterfaceC43550c interfaceC43550c, int i, int i2, long j) {
        Map hashMap = interfaceC43550c == null ? new HashMap() : m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        hashMap.put("page_type", String.valueOf(i));
        hashMap.put("action", String.valueOf(i2));
        hashMap.put("cost", String.valueOf(j));
        m3899a("06002056", hashMap);
    }

    /* renamed from: a */
    public static void m3877a(@Nullable InterfaceC43550c interfaceC43550c, int i, int i2, long j, long j2, int i3, int i4, int i5, int i6) {
        Map hashMap = interfaceC43550c == null ? new HashMap() : m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        hashMap.put("page_type", String.valueOf(i));
        hashMap.put("action", String.valueOf(i2));
        hashMap.put("cost1", String.valueOf(j));
        hashMap.put("cost2", String.valueOf(j2));
        if (i4 != -1) {
            hashMap.put("cov1_sta", String.valueOf(i4));
        }
        if (i3 != -1) {
            hashMap.put("cov1_type", String.valueOf(i3));
        }
        if (i6 != -1) {
            hashMap.put("cov2_sta", String.valueOf(i6));
        }
        if (i5 != -1) {
            hashMap.put("cov2_type", String.valueOf(i5));
        }
        m3899a("06002055", hashMap);
    }

    /* renamed from: a */
    public static void m3876a(@Nullable InterfaceC43550c interfaceC43550c, int i, int i2, String str) {
        Map hashMap = interfaceC43550c == null ? new HashMap() : m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        hashMap.put("e_code", String.valueOf(i));
        hashMap.put("s_code", String.valueOf(i2));
        hashMap.put("error", str);
        m3899a("06002035", hashMap);
    }

    /* renamed from: a */
    public static void m3875a(InterfaceC43550c interfaceC43550c, int i, int i2, String str, long j, boolean z, int i3, String str2) {
        Map hashMap = interfaceC43550c == null ? new HashMap() : m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        hashMap.put("render_method", String.valueOf(i));
        hashMap.put("rslt", String.valueOf(i2));
        hashMap.put("cost", String.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("material_id", str);
        }
        if (z) {
            hashMap.put("e_code", String.valueOf(i3));
            hashMap.put("error", String.valueOf(str2));
        }
        m3899a("06002050", hashMap);
    }

    /* renamed from: a */
    public static void m3874a(@NonNull InterfaceC43550c interfaceC43550c, int i, long j) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("rslt", "1");
        m3856a.put("wrap", String.valueOf(i));
        m3856a.put("cost", String.valueOf(j));
        if (interfaceC43550c instanceof InterfaceC43573o) {
            InterfaceC43573o interfaceC43573o = (InterfaceC43573o) interfaceC43550c;
            m3856a.put("video_duration", String.valueOf(interfaceC43573o.mo4262aW()));
            m3856a.put("video_type", interfaceC43573o.mo4249ba());
            m3856a.put("has_video", String.valueOf(interfaceC43573o.mo4255aw() != null ? 1 : 0));
            m3856a.put("companion_type", f115833a[interfaceC43573o.mo4278aG() ? 1 : 0][interfaceC43573o.mo4279aF() ? 1 : 0]);
        }
        m3856a.put("cur_in_fg", String.valueOf(C43620c.m5296c()));
        m3856a.remove("cache_ad");
        m3856a.remove("cache_ad_source");
        m3856a.remove("cache_req_status");
        m3856a.remove("session_id2");
        m3899a("06002016", m3856a);
    }

    /* renamed from: a */
    public static void m3873a(@NonNull InterfaceC43550c interfaceC43550c, int i, long j, int i2, @NonNull AbstractC43534a abstractC43534a) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("close_source", String.valueOf(i));
        m3856a.put("duration", String.valueOf(j));
        m3856a.put("close_type", String.valueOf(i2));
        m3856a.put("out_ad", String.valueOf(abstractC43534a.m5453H()));
        m3895a(m3856a, abstractC43534a, false);
        m3899a("06002023", m3856a);
    }

    /* renamed from: a */
    public static void m3872a(@NonNull InterfaceC43550c interfaceC43550c, int i, long j, @Nullable String str, int i2, @Nullable String str2, @Nullable String str3) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("slot", String.valueOf(interfaceC43550c.mo4351b()));
        m3856a.put("rslt", String.valueOf(i));
        m3856a.put("cost", String.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            m3856a.put("url", str);
        }
        if (i2 > 0) {
            m3856a.put("cnt", String.valueOf(i2));
        }
        if (!TextUtils.isEmpty(str2)) {
            m3856a.put("material_type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            m3856a.put("error", str3);
        }
        if (interfaceC43550c instanceof InterfaceC43573o) {
            InterfaceC43573o interfaceC43573o = (InterfaceC43573o) interfaceC43550c;
            m3856a.put("companion_type", f115833a[interfaceC43573o.mo4278aG() ? 1 : 0][interfaceC43573o.mo4279aF() ? 1 : 0]);
            if (interfaceC43573o.mo4244bf() == 2) {
                m3856a.put("backup_source", String.valueOf(!C43836q.m4837a((CharSequence) interfaceC43573o.mo4264aU()) ? 1 : 0));
            }
        }
        m3899a("06002042", m3856a);
    }

    /* renamed from: a */
    public static void m3871a(@NonNull InterfaceC43550c interfaceC43550c, int i, @Nullable Double d, @Nullable String str) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("auc_mode", String.valueOf(i));
        m3856a.put("bid_rslt", "1");
        if (d != null) {
            m3856a.put("sec_price", String.valueOf(d));
        }
        if (str != null) {
            m3856a.put("sec_bidder", str);
        }
        m3899a("06002045", m3856a);
    }

    /* renamed from: a */
    public static void m3870a(@NonNull InterfaceC43550c interfaceC43550c, int i, @Nullable Double d, @Nullable String str, int i2) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("auc_mode", String.valueOf(i));
        m3856a.put("bid_rslt", "0");
        if (d != null) {
            m3856a.put("first_price", String.valueOf(d));
        }
        if (str != null) {
            m3856a.put("first_bidder", str);
        }
        m3856a.put("loss_reason", String.valueOf(i2));
        m3899a("06002045", m3856a);
    }

    /* renamed from: a */
    public static void m3869a(@NonNull InterfaceC43550c interfaceC43550c, int i, String str, int i2) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("video_stat", String.valueOf(i));
        m3856a.put("video_url", str);
        m3856a.put("path_t", String.valueOf(i2));
        if (interfaceC43550c instanceof InterfaceC43573o) {
            InterfaceC43573o interfaceC43573o = (InterfaceC43573o) interfaceC43550c;
            m3856a.put("video_duration", String.valueOf(interfaceC43573o.mo4262aW()));
            C43572n mo4261aX = interfaceC43573o.mo4261aX();
            if (mo4261aX != null) {
                m3856a.put("video_actual_duration", String.valueOf(mo4261aX.f114121c));
            }
        }
        m3899a("06002017", m3856a);
    }

    /* renamed from: a */
    public static void m3868a(@NonNull InterfaceC43550c interfaceC43550c, int i, String str, long j, int i2, String str2) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("rslt", "0");
        m3856a.put("wrap", String.valueOf(i));
        m3856a.put("wrap_url", str);
        m3856a.put("cost", String.valueOf(j));
        m3856a.put("e_code", String.valueOf(i2));
        m3856a.put("error", String.valueOf(str2));
        m3856a.put("cur_in_fg", String.valueOf(C43620c.m5296c()));
        m3856a.remove("cache_ad");
        m3856a.remove("cache_ad_source");
        m3856a.remove("cache_req_status");
        m3856a.remove("session_id2");
        m3899a("06002016", m3856a);
    }

    /* renamed from: a */
    public static void m3867a(@NonNull InterfaceC43550c interfaceC43550c, int i, @NonNull C43558e c43558e, @Nullable AbstractC43534a abstractC43534a) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("open_way_gp", String.valueOf(i));
        m3856a.put("open_rslt_gp", String.valueOf(c43558e.f114078b));
        m3856a.put("deep_rslt", String.valueOf(c43558e.f114079c));
        m3856a.put("webview_layout", String.valueOf(c43558e.f114080d));
        m3856a.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, c43558e.f114081e);
        if (!C43836q.m4837a((CharSequence) c43558e.f114082f)) {
            m3856a.put("pkg_name", c43558e.f114082f);
        }
        m3856a.put("out_ad", String.valueOf(abstractC43534a == null ? C43847a.f114694a : abstractC43534a.m5453H()));
        m3895a(m3856a, abstractC43534a, false);
        m3899a("06002034", m3856a);
    }

    /* renamed from: a */
    public static void m3866a(InterfaceC43550c interfaceC43550c, String str, int i, int i2) {
        Map hashMap = interfaceC43550c == null ? new HashMap() : m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        hashMap.put("rslt", String.valueOf(str));
        hashMap.put("render_method", String.valueOf(i));
        hashMap.put("reason", String.valueOf(i2));
        m3899a("06002049", hashMap);
    }

    /* renamed from: a */
    public static void m3865a(InterfaceC43550c interfaceC43550c, String str, int i, long j, int i2) {
        Map hashMap = interfaceC43550c == null ? new HashMap() : m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        hashMap.put("rslt", "1");
        hashMap.put("video_url", str);
        hashMap.put(C26484a.f69196M, String.valueOf(i2));
        hashMap.put("media_player_status", String.valueOf(i));
        hashMap.put("cost", String.valueOf(j));
        m3899a("06002054", hashMap);
    }

    /* renamed from: a */
    public static void m3864a(@NonNull InterfaceC43550c interfaceC43550c, String str, int i, long j, long j2, int i2, int i3, String str2, boolean z) {
        C43572n mo4261aX;
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("rslt", "1");
        m3856a.put("url", str);
        m3856a.put("source", String.valueOf(i));
        m3856a.put("cost", String.valueOf(j));
        m3856a.put("size", String.valueOf(j2));
        m3856a.put("dl_opt", String.valueOf(i2));
        m3856a.put("material_type", String.valueOf(i3));
        if ((interfaceC43550c instanceof InterfaceC43573o) && (mo4261aX = ((InterfaceC43573o) interfaceC43550c).mo4261aX()) != null) {
            m3856a.put("creative_size", C43836q.m4830a("%1$d*%2$d", Integer.valueOf(mo4261aX.f114119a), Integer.valueOf(mo4261aX.f114120b)));
        }
        m3856a.put("media_type", str2);
        m3856a.put("from_breakpoint", z ? "1" : "0");
        m3856a.put("cur_in_fg", String.valueOf(C43620c.m5296c()));
        m3856a.remove("cache_ad");
        m3856a.remove("cache_ad_source");
        m3856a.remove("cache_req_status");
        m3856a.remove("session_id2");
        m3899a("06002018", m3856a);
    }

    /* renamed from: a */
    public static void m3863a(InterfaceC43550c interfaceC43550c, String str, int i, String str2, int i2) {
        Map hashMap = interfaceC43550c == null ? new HashMap() : m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        hashMap.put("rslt", "0");
        hashMap.put("video_url", str);
        hashMap.put(C26484a.f69196M, String.valueOf(i2));
        hashMap.put("media_player_status", String.valueOf(i));
        hashMap.put("error", str2);
        m3899a("06002054", hashMap);
    }

    /* renamed from: a */
    public static void m3862a(@NonNull InterfaceC43550c interfaceC43550c, String str, long j, int i, @Nullable Map<String, String> map) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("action", str);
        m3856a.put("cost", String.valueOf(j));
        m3856a.put("rslt", String.valueOf(i));
        if (map != null) {
            m3856a.putAll(map);
        }
        m3899a("06002025", m3856a);
    }

    /* renamed from: a */
    public static void m3861a(@NonNull InterfaceC43550c interfaceC43550c, String str, String str2, int i) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3891a(m3856a, interfaceC43550c, str, str2, i);
        m3899a("06002043", m3856a);
    }

    /* renamed from: a */
    public static void m3860a(@NonNull InterfaceC43550c interfaceC43550c, String str, String str2, long j, long j2, int i, String str3, boolean z) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("rslt", "0");
        m3856a.put("url", str);
        m3856a.put("error", str2);
        m3856a.put("cost", String.valueOf(j));
        m3856a.put("size", String.valueOf(j2));
        m3856a.put("material_type", String.valueOf(i));
        m3856a.put("media_type", str3);
        m3856a.put("from_breakpoint", z ? "1" : "0");
        m3856a.put("cur_in_fg", String.valueOf(C43620c.m5296c()));
        m3856a.remove("cache_ad");
        m3856a.remove("cache_ad_source");
        m3856a.remove("cache_req_status");
        m3856a.remove("session_id2");
        m3899a("06002018", m3856a);
    }

    /* renamed from: a */
    public static void m3859a(@NonNull InterfaceC43550c interfaceC43550c, String str, String str2, String str3, int i, int i2, int i3, int i4, long j, int i5, int i6, @NonNull AbstractC43534a abstractC43534a) {
        C43595b m5342d;
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("ad_size", str);
        m3856a.put(Constants.CLICK_AREA_IS_CTA, str2);
        m3856a.put("down_click_area", str3);
        m3856a.put("click_module", String.valueOf(i));
        m3856a.put("click_source", String.valueOf(i2));
        m3856a.put("open_way", String.valueOf(interfaceC43550c.mo4393N().mo4297c()));
        m3856a.put("url_t", String.valueOf(i3));
        m3856a.put("open_way_form", String.valueOf(i4));
        m3856a.put("cost", String.valueOf(j));
        if (interfaceC43550c instanceof InterfaceC43573o) {
            InterfaceC43573o interfaceC43573o = (InterfaceC43573o) interfaceC43550c;
            C43572n mo4261aX = interfaceC43573o.mo4261aX();
            if (mo4261aX != null) {
                m3856a.put("creative_size", C43836q.m4830a("%1$d*%2$d", Integer.valueOf(mo4261aX.f114119a), Integer.valueOf(mo4261aX.f114120b)));
            }
            int mo4284aA = interfaceC43573o.mo4284aA();
            if (mo4284aA != 0) {
                m3856a.put("show_method", String.valueOf(mo4284aA));
            }
            long mo4282aC = interfaceC43573o.mo4282aC();
            if (mo4282aC > 0) {
                m3856a.put("page_cost", String.valueOf(SystemClock.elapsedRealtime() - mo4282aC));
            }
            int mo4283aB = interfaceC43573o.mo4283aB();
            if (i2 == 11 && mo4283aB > 0) {
                m3856a.put("render_method", String.valueOf(mo4283aB));
            }
            if (interfaceC43573o.mo4327w() == 2) {
                m3856a.put("backup_creative", String.valueOf(interfaceC43573o.mo4242bh()));
            }
        }
        InterfaceC43524h interfaceC43524h = C43525i.f114036a;
        if (interfaceC43524h != null && interfaceC43524h.mo4461m().mo5375a(15) && (m5342d = C43588b.m5342d()) != null) {
            m3856a.put("bat_stat", String.valueOf(m5342d.f114165c));
            m3856a.put("bat_num", String.valueOf(m5342d.f114163a));
            m3856a.put("bat_scale", String.valueOf(m5342d.f114164b));
        }
        m3856a.put("total_num", String.valueOf(i5));
        m3856a.put("current_num", String.valueOf(i6));
        m3856a.put("cur_in_fg", String.valueOf(C43620c.m5296c()));
        m3856a.put("out_ad", String.valueOf(abstractC43534a.m5453H()));
        int i7 = abstractC43534a.f114057J;
        if (i7 != 0) {
            m3856a.put("show_method_source", String.valueOf(i7));
        }
        m3856a.put("click_acty_source", String.valueOf(abstractC43534a.f114059L));
        m3892a(m3856a, interfaceC43550c);
        m3895a(m3856a, abstractC43534a, true);
        m3899a("06002011", m3856a);
    }

    /* renamed from: a */
    public static void m3858a(@Nullable InterfaceC43550c interfaceC43550c, @Nullable AdError adError, boolean z) {
        if (interfaceC43550c == null) {
            return;
        }
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(adError.getCode());
        m3856a.put("e_code", sb2.toString());
        if (adError.getCode() == 2000) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(interfaceC43550c.mo4396K());
            m3856a.put("duration_expired", sb3.toString());
        }
        m3856a.put("error", adError.getMessage());
        m3856a.put("ad_impl", z ? "1" : "0");
        if ((interfaceC43550c instanceof InterfaceC43573o) && interfaceC43550c.mo4327w() == 2) {
            m3856a.put("dl_status", String.valueOf(((InterfaceC43573o) interfaceC43550c).mo4243bg()));
        }
        m3899a("06002048", m3856a);
    }

    /* renamed from: a */
    public static void m3857a(@NonNull InterfaceC43550c interfaceC43550c, @NonNull AbstractC43534a abstractC43534a) {
        Map<String, String> m3856a = m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        m3856a.put("out_ad", String.valueOf(abstractC43534a.m5453H()));
        m3895a(m3856a, abstractC43534a, false);
        m3899a("06002022", m3856a);
    }

    /* renamed from: a */
    public static void m3854a(@Nullable InterfaceC43550c interfaceC43550c, boolean z, int i, int i2, boolean z2, long j, int i3, int i4, long j2, int i5, int i6, long j3) {
        List<InterfaceC43550c> mo4358am;
        InterfaceC43550c interfaceC43550c2;
        Map hashMap = interfaceC43550c == null ? new HashMap() : m3856a(interfaceC43550c, (AbstractC43534a) null, false);
        hashMap.put("d_video", "1");
        hashMap.put("action", String.valueOf(i));
        hashMap.put("video_pos", String.valueOf(i2));
        hashMap.put("by_user", String.valueOf(z2 ? 1 : 0));
        if (j != -1) {
            hashMap.put("click_cost", String.valueOf(j));
        }
        if (i4 != -1) {
            hashMap.put("cov1_sta", String.valueOf(i4));
        }
        if (i3 != -1) {
            hashMap.put("cov1_type", String.valueOf(i3));
        }
        if (j2 != -1) {
            hashMap.put("cov1_cost", String.valueOf(j2));
        }
        if (i6 != -1) {
            hashMap.put("cov2_sta", String.valueOf(i6));
        }
        if (i5 != -1) {
            hashMap.put("cov2_type", String.valueOf(i5));
        }
        if (j3 != -1) {
            hashMap.put("cov2_cost", String.valueOf(j3));
        }
        if (interfaceC43550c instanceof InterfaceC43573o) {
            hashMap.put("dl_status", String.valueOf(((InterfaceC43573o) interfaceC43550c).mo4243bg()));
        }
        if (interfaceC43550c != null && z && (mo4358am = interfaceC43550c.mo4358am()) != null && mo4358am.size() > 0 && (interfaceC43550c2 = mo4358am.get(0)) != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("ad_id", String.valueOf(interfaceC43550c2.mo4330r()));
                jSONObject.putOpt("creative_id", String.valueOf(interfaceC43550c2.mo4330r()));
                if (interfaceC43550c2 instanceof InterfaceC43573o) {
                    jSONObject.putOpt("dl_status", String.valueOf(((InterfaceC43573o) interfaceC43550c2).mo4243bg()));
                }
                hashMap.put("ad2", String.valueOf(jSONObject));
            } catch (Throwable unused) {
            }
        }
        m3899a("06002053", hashMap);
    }

    /* renamed from: a */
    public static void m3852a(InterfaceC43565i interfaceC43565i, long j, long j2, long j3, long j4, long j5) {
        Map<String, String> m3856a = m3856a((InterfaceC43550c) interfaceC43565i, (AbstractC43534a) null, false);
        m3856a.put("by_js", String.valueOf(j));
        m3856a.put("by_js_cost", String.valueOf(j2));
        m3856a.put("by_bit", String.valueOf(j3));
        m3856a.put("by_bit_cost", String.valueOf(j4));
        m3856a.put("by_bit_run_cost", String.valueOf(j5));
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i > 0 && j2 >= 0 && j3 > 0 && j4 >= 0) {
            j2 = Math.min(j2, j4);
        } else if (i <= 0 || j2 < 0) {
            j2 = (j3 <= 0 || j4 < 0) ? -1L : j4;
        }
        m3856a.put("cost", String.valueOf(j2));
        m3899a("06002040", m3856a);
    }

    /* renamed from: a */
    private static void m3851a(C44146d c44146d) {
        Map<String, String> map = c44146d.f115854a;
        if (C43836q.m4837a((CharSequence) map.get(SDKAnalyticsEvents.PARAMETER_SESSION_ID))) {
            map.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, UUID.randomUUID().toString());
        }
        C44147c.m3821a().m3819a(c44146d.f115855b, map);
    }

    /* renamed from: a */
    public static void m3850a(@NonNull InterfaceC43550c[] interfaceC43550cArr, @NonNull AbstractC43532b abstractC43532b, boolean z, int i, int i2, int i3, boolean z2, int i4, String str) {
        Map<String, String> m3856a;
        InterfaceC43550c interfaceC43550c;
        if (abstractC43532b.mo5459e()) {
            m3856a = m3889a(abstractC43532b.mo5456h());
            InterfaceC43550c interfaceC43550c2 = (InterfaceC43550c) C43828k.m4870b(interfaceC43550cArr);
            m3856a.put(C32111coo2iico.C32113cioccoiococ.c2oc2o, interfaceC43550c2.mo4328v());
            m3856a.put("sid", String.valueOf(interfaceC43550c2.mo4325y()));
            m3856a.put("adx_type", String.valueOf(interfaceC43550c2.mo4327w()));
            m3856a.put("icon_fill_num", String.valueOf(interfaceC43550cArr.length));
        } else {
            InterfaceC43550c interfaceC43550c3 = (InterfaceC43550c) C43828k.m4870b(interfaceC43550cArr);
            m3856a = m3856a(interfaceC43550c3, (AbstractC43534a) null, false);
            if ((interfaceC43550c3 instanceof InterfaceC43573o) && interfaceC43550c3.mo4327w() == 2) {
                InterfaceC43573o interfaceC43573o = (InterfaceC43573o) interfaceC43550c3;
                m3856a.put("video_type", String.valueOf((interfaceC43573o.mo4252az() == null || !interfaceC43573o.mo4252az().mo4199b()) ? 0 : 1));
            }
            m3892a(m3856a, interfaceC43550c3);
            List<InterfaceC43550c> mo4358am = interfaceC43550c3.mo4358am();
            if (mo4358am != null && mo4358am.size() > 0 && (interfaceC43550c = mo4358am.get(0)) != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("ad_id", String.valueOf(interfaceC43550c.mo4330r()));
                    jSONObject.putOpt("creative_id", String.valueOf(interfaceC43550c.mo4330r()));
                    m3856a.put("ad2", String.valueOf(jSONObject));
                } catch (Throwable unused) {
                }
            }
        }
        if (abstractC43532b instanceof InterfaceC43536b) {
            m3894a(m3856a, (InterfaceC43536b) abstractC43532b);
        }
        m3856a.put("rslt", "1");
        m3856a.put("banner_type", String.valueOf(abstractC43532b.f114039c));
        String str2 = abstractC43532b.f114043g.f114044a;
        if (!C43836q.m4837a((CharSequence) str2)) {
            m3856a.put("load_ext", str2);
        }
        AbstractC43532b.C43533a c43533a = abstractC43532b.f114043g;
        m3856a.put("cost", String.valueOf(Math.max(0L, c43533a.mo5400n() - c43533a.mo5403k())));
        m3856a.put("is_playable", z ? "1" : "0");
        m3856a.put("req_type", String.valueOf(i));
        m3856a.put("cur_req_status", String.valueOf(i2));
        m3856a.put("cur_in_fg", String.valueOf(C43620c.m5296c()));
        m3856a.remove("cache_ad");
        m3856a.remove("cache_ad_source");
        m3856a.remove("cache_req_status");
        m3856a.remove("session_id2");
        m3856a.put("encrypt", String.valueOf(i3));
        m3856a.put("req_encrypt_enable", z2 ? "1" : "0");
        m3856a.put("resp_decrypt_enable", String.valueOf(i4));
        if (!TextUtils.isEmpty(str)) {
            m3856a.put("enc_logid", str);
        }
        m3899a("06002007", m3856a);
    }
}
