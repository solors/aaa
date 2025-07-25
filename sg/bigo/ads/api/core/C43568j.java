package sg.bigo.ads.api.core;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.InterfaceC43518e;
import sg.bigo.ads.api.p903a.InterfaceC43522f;

/* renamed from: sg.bigo.ads.api.core.j */
/* loaded from: classes10.dex */
public final class C43568j implements InterfaceC43518e {

    /* renamed from: e */
    public InterfaceC43522f[] f114102e;

    /* renamed from: f */
    public InterfaceC43522f f114103f;

    /* renamed from: a */
    public long f114098a = 0;

    /* renamed from: b */
    public String f114099b = "en";

    /* renamed from: c */
    public String f114100c = "";

    /* renamed from: d */
    public String f114101d = "";

    /* renamed from: g */
    public String f114104g = "";

    /* renamed from: h */
    public String f114105h = "";

    /* renamed from: i */
    public int f114106i = 0;

    /* renamed from: j */
    public int f114107j = 0;
    @NonNull

    /* renamed from: l */
    public InterfaceC43518e.C43520b f114109l = new InterfaceC43518e.C43520b();
    @NonNull

    /* renamed from: m */
    public InterfaceC43518e.C43519a f114110m = new InterfaceC43518e.C43519a();
    @NonNull

    /* renamed from: k */
    public InterfaceC43518e.C43521c[] f114108k = new InterfaceC43518e.C43521c[0];

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: a */
    public final String mo5398a() {
        return this.f114100c;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: b */
    public final String mo5395b() {
        return this.f114101d;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: c */
    public final long mo5394c() {
        return this.f114098a;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: d */
    public final int mo5393d() {
        return this.f114106i;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: e */
    public final String mo5392e() {
        return this.f114099b;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: f */
    public final int mo5391f() {
        return this.f114107j;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: g */
    public final String mo5390g() {
        return this.f114105h;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: h */
    public final String mo5389h() {
        return this.f114104g;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: i */
    public final InterfaceC43522f[] mo5388i() {
        return this.f114102e;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: j */
    public final InterfaceC43522f mo5387j() {
        InterfaceC43522f[] interfaceC43522fArr = this.f114102e;
        if (interfaceC43522fArr != null && interfaceC43522fArr.length > 0) {
            return interfaceC43522fArr[0];
        }
        return null;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: k */
    public final InterfaceC43522f mo5386k() {
        return this.f114103f;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: l */
    public final InterfaceC43518e.C43520b mo5385l() {
        return this.f114109l;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: m */
    public final InterfaceC43518e.C43521c[] mo5384m() {
        return this.f114108k;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43518e
    /* renamed from: n */
    public final InterfaceC43518e.C43519a mo5383n() {
        return this.f114110m;
    }

    /* renamed from: a */
    public final void m5397a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f114098a = jSONObject.optLong("form_id", 0L);
            this.f114100c = jSONObject.optString("title", "");
            this.f114099b = jSONObject.optString("ad_lang", "en");
            this.f114101d = jSONObject.optString("description", "");
            this.f114104g = jSONObject.optString("purpose", "");
            this.f114106i = jSONObject.optInt("color", 0);
            this.f114107j = jSONObject.optInt("form_style_id", 0);
            this.f114105h = jSONObject.optString("extra", "");
            m5396a(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("icon");
            if (optJSONObject != null) {
                this.f114103f = new C43569k(optJSONObject);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("questions");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        arrayList.add(new InterfaceC43518e.C43521c(optJSONObject2));
                    }
                }
                InterfaceC43518e.C43521c[] c43521cArr = new InterfaceC43518e.C43521c[arrayList.size()];
                this.f114108k = c43521cArr;
                this.f114108k = (InterfaceC43518e.C43521c[]) arrayList.toArray(c43521cArr);
            }
            InterfaceC43518e.C43520b c43520b = this.f114109l;
            String optString = jSONObject.optString("privacy", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    c43520b.f114030a = jSONObject2.optString("name", "");
                    c43520b.f114031b = jSONObject2.optString("url", "");
                } catch (JSONException unused) {
                }
            }
            InterfaceC43518e.C43519a c43519a = this.f114110m;
            String optString2 = jSONObject.optString("feedback", "");
            if (TextUtils.isEmpty(optString2)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(optString2);
            c43519a.f114026a = jSONObject3.optString("title", "");
            c43519a.f114027b = jSONObject3.optString("description", "");
            c43519a.f114028c = jSONObject3.optString("cta", "");
            c43519a.f114029d = jSONObject3.optString("land_url", "");
        } catch (JSONException unused2) {
        }
    }

    /* renamed from: a */
    private void m5396a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new C43569k(optJSONObject));
                }
            }
            C43569k[] c43569kArr = new C43569k[arrayList.size()];
            this.f114102e = c43569kArr;
            this.f114102e = (InterfaceC43522f[]) arrayList.toArray(c43569kArr);
        }
    }
}
