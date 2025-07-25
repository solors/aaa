package sg.bigo.ads.core.p958c.p960b;

import androidx.annotation.Nullable;
import com.amazon.p047a.p048a.p059h.Metric;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.C19577ad;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.InterfaceC43665g;
import sg.bigo.ads.common.p914g.p916b.C43675b;
import sg.bigo.ads.common.p941x.C43906a;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.core.p958c.C44136b;

/* renamed from: sg.bigo.ads.core.c.b.a */
/* loaded from: classes10.dex */
public final class C44137a {

    /* renamed from: a */
    private final String f115834a;

    /* renamed from: b */
    private final long f115835b = System.currentTimeMillis();

    /* renamed from: c */
    private Map<String, String> f115836c;

    public C44137a(String str, @Nullable Map<String, String> map) {
        this.f115834a = str;
        this.f115836c = map;
    }

    /* renamed from: a */
    private JSONObject m3843a(InterfaceC43665g interfaceC43665g) {
        String str;
        Object mo4176D;
        JSONObject jSONObject = new JSONObject();
        if (interfaceC43665g == null) {
            return jSONObject;
        }
        try {
            jSONObject.putOpt(MBridgeConstans.APP_KEY, interfaceC43665g.mo4153a());
            jSONObject.putOpt("pkg_name", interfaceC43665g.mo4145b());
            jSONObject.putOpt("pkg_ver", interfaceC43665g.mo4144c());
            jSONObject.putOpt("pkg_vc", Integer.valueOf(interfaceC43665g.mo4143d()));
            jSONObject.putOpt("pkg_ch", interfaceC43665g.mo4142e());
            jSONObject.putOpt("os", interfaceC43665g.mo4138i());
            jSONObject.putOpt("os_ver", interfaceC43665g.mo4137j());
            jSONObject.putOpt("os_lang", interfaceC43665g.mo4136k());
            jSONObject.putOpt(Verification.VENDOR, interfaceC43665g.mo4135l());
            jSONObject.putOpt("model", interfaceC43665g.mo4134m());
            jSONObject.putOpt("isp", interfaceC43665g.mo4133n());
            jSONObject.putOpt("resolution", interfaceC43665g.mo4132o());
            jSONObject.putOpt("dpi", Integer.valueOf(interfaceC43665g.mo4131p()));
            jSONObject.putOpt("net", interfaceC43665g.mo4130q());
            jSONObject.putOpt("tz", interfaceC43665g.mo4129r());
            if (interfaceC43665g.mo4128s()) {
                jSONObject.putOpt("ewd", String.valueOf(interfaceC43665g.mo4127t() ^ 3023727));
                jSONObject.putOpt("ejd", String.valueOf(interfaceC43665g.mo4126u() ^ 3023727));
            }
            jSONObject.putOpt("country", interfaceC43665g.mo4124w());
            jSONObject.putOpt("state", interfaceC43665g.mo4122y());
            jSONObject.putOpt("city", interfaceC43665g.mo4121z());
            jSONObject.putOpt("sdk_ver", interfaceC43665g.mo4179A());
            jSONObject.putOpt("sdk_vc", 50002);
            if (C43906a.m4616p()) {
                str = "consent_status";
                mo4176D = Integer.valueOf(C44136b.m3849b());
            } else {
                jSONObject.putOpt(C19577ad.f49047D0, interfaceC43665g.mo4177C());
                jSONObject.putOpt("hw_id", interfaceC43665g.mo4171I());
                jSONObject.putOpt("fire_id", interfaceC43665g.mo4146ag());
                str = "af_id";
                mo4176D = interfaceC43665g.mo4176D();
            }
            jSONObject.putOpt(str, mo4176D);
            jSONObject.putOpt(KeyConstants.RequestBody.KEY_UID, interfaceC43665g.mo4175E());
            jSONObject.putOpt("ts", Integer.valueOf(interfaceC43665g.mo4174F()));
            jSONObject.putOpt("abflags", interfaceC43665g.mo4173G());
            jSONObject.putOpt("gg_service_ver", interfaceC43665g.mo4170J());
            jSONObject.putOpt("webkit_ver", interfaceC43665g.mo4169K());
            jSONObject.putOpt(Metric.f2405b, Long.valueOf(this.f115835b));
            jSONObject.putOpt("event_id", this.f115834a);
            jSONObject.putOpt("sdk_channel", interfaceC43665g.mo4150ac());
            Map<String, String> map = this.f115836c;
            boolean z = false;
            if (map != null) {
                if (C43836q.m4837a((CharSequence) map.get(SDKAnalyticsEvents.PARAMETER_SESSION_ID))) {
                    this.f115836c.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, UUID.randomUUID().toString());
                } else {
                    z = true;
                }
                for (Map.Entry<String, String> entry : this.f115836c.entrySet()) {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                }
            }
            if (!z) {
                jSONObject.putOpt("gps_country", interfaceC43665g.mo4161S());
                jSONObject.putOpt("sim_country", interfaceC43665g.mo4160T());
                jSONObject.putOpt("system_country", interfaceC43665g.mo4159U());
            }
            jSONObject.putOpt("ts_cold", Long.valueOf(interfaceC43665g.mo4156X()));
            jSONObject.putOpt("ts_hot", Long.valueOf(interfaceC43665g.mo4155Y()));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final C43675b m3842a(InterfaceC43665g interfaceC43665g, long j) {
        return new C43675b(this.f115834a, m3843a(interfaceC43665g).toString(), j);
    }
}
