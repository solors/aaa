package sg.bigo.ads.controller.p947c;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C21114v8;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.controller.c.k */
/* loaded from: classes10.dex */
public final class C43990k implements InterfaceC43550c.InterfaceC43552b {

    /* renamed from: a */
    private String f115329a;

    /* renamed from: b */
    private final String f115330b;

    /* renamed from: c */
    private final int f115331c;

    /* renamed from: d */
    private final JSONArray f115332d;

    /* renamed from: e */
    private final String f115333e;

    /* renamed from: f */
    private final int f115334f;

    /* renamed from: g */
    private final String f115335g;

    /* renamed from: h */
    private final int f115336h;

    /* renamed from: i */
    private final String f115337i;

    /* renamed from: j */
    private final Map<String, String> f115338j = new LinkedHashMap();

    /* renamed from: k */
    private final String f115339k;

    /* renamed from: l */
    private final int f115340l;

    public C43990k(@NonNull JSONObject jSONObject) {
        this.f115329a = jSONObject.optString("land_url", "");
        this.f115330b = jSONObject.optString("deeplink_url", "");
        this.f115331c = jSONObject.optInt("web_ad_model", 0);
        this.f115333e = jSONObject.optString("return_tracker_url", "");
        this.f115334f = jSONObject.optInt("land_preload_type", 0);
        this.f115335g = jSONObject.optString("click_open_pkg", "");
        this.f115336h = jSONObject.optInt("probe_interval", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("pixel");
        if (optJSONObject != null) {
            this.f115337i = optJSONObject.optString(C26484a.f69188E, "");
            String optString = optJSONObject.optString("value", "");
            if (!C43836q.m4837a((CharSequence) optString)) {
                m4298b(optString);
            }
        } else {
            this.f115337i = "";
        }
        this.f115339k = jSONObject.optString("pre_landing_url", "");
        this.f115340l = jSONObject.optInt("pre_landing_scene", 0);
        this.f115332d = jSONObject.optJSONArray("webview_bundle");
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43552b
    /* renamed from: a */
    public final String mo4301a() {
        return this.f115329a;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43552b
    /* renamed from: b */
    public final String mo4299b() {
        return this.f115330b;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43552b
    /* renamed from: c */
    public final int mo4297c() {
        return this.f115331c;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43552b
    /* renamed from: d */
    public final JSONArray mo4296d() {
        return this.f115332d;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43552b
    /* renamed from: e */
    public final String mo4295e() {
        return this.f115333e;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43552b
    /* renamed from: f */
    public final int mo4294f() {
        return this.f115334f;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43552b
    /* renamed from: g */
    public final String mo4293g() {
        return this.f115335g;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43552b
    /* renamed from: h */
    public final String mo4292h() {
        return this.f115337i;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43552b
    /* renamed from: i */
    public final Map<String, String> mo4291i() {
        return this.f115338j;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43552b
    /* renamed from: j */
    public final String mo4290j() {
        return this.f115339k;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43552b
    /* renamed from: k */
    public final int mo4289k() {
        return this.f115340l;
    }

    /* renamed from: b */
    private void m4298b(String str) {
        String[] split;
        this.f115338j.clear();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(C21114v8.C21123i.f54135c)) {
            if (str2.indexOf("=") >= 0) {
                String substring = str2.substring(0, str2.indexOf("="));
                if (!TextUtils.isEmpty(substring)) {
                    String str3 = this.f115338j.get(substring);
                    if (C43836q.m4827b((CharSequence) str3)) {
                        str2 = str3 + C21114v8.C21123i.f54135c + str2;
                    }
                    this.f115338j.put(substring, str2);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43552b
    /* renamed from: a */
    public final void mo4300a(@NonNull String str) {
        this.f115329a = str;
    }
}
