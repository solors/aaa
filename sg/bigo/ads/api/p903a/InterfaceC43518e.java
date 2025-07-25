package sg.bigo.ads.api.p903a;

import androidx.annotation.NonNull;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: sg.bigo.ads.api.a.e */
/* loaded from: classes10.dex */
public interface InterfaceC43518e {

    /* renamed from: sg.bigo.ads.api.a.e$a */
    /* loaded from: classes10.dex */
    public static class C43519a {

        /* renamed from: a */
        public String f114026a = "";

        /* renamed from: b */
        public String f114027b = "";

        /* renamed from: c */
        public String f114028c = "";

        /* renamed from: d */
        public String f114029d = "";
    }

    /* renamed from: sg.bigo.ads.api.a.e$b */
    /* loaded from: classes10.dex */
    public static class C43520b {

        /* renamed from: a */
        public String f114030a = "";

        /* renamed from: b */
        public String f114031b = "";
    }

    /* renamed from: sg.bigo.ads.api.a.e$c */
    /* loaded from: classes10.dex */
    public static class C43521c {

        /* renamed from: a */
        public String f114032a;

        /* renamed from: b */
        public int f114033b;

        /* renamed from: c */
        public String[] f114034c;

        /* renamed from: d */
        public String f114035d;

        public C43521c(@NonNull JSONObject jSONObject) {
            this.f114032a = "";
            this.f114033b = 0;
            this.f114034c = null;
            this.f114035d = "";
            this.f114032a = jSONObject.optString("title", "");
            this.f114033b = jSONObject.optInt("type", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.f114034c = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f114034c[i] = optJSONArray.optString(i);
                }
            }
            this.f114035d = jSONObject.optString("id", "");
        }
    }

    /* renamed from: a */
    String mo5398a();

    /* renamed from: b */
    String mo5395b();

    /* renamed from: c */
    long mo5394c();

    /* renamed from: d */
    int mo5393d();

    /* renamed from: e */
    String mo5392e();

    /* renamed from: f */
    int mo5391f();

    /* renamed from: g */
    String mo5390g();

    /* renamed from: h */
    String mo5389h();

    /* renamed from: i */
    InterfaceC43522f[] mo5388i();

    /* renamed from: j */
    InterfaceC43522f mo5387j();

    /* renamed from: k */
    InterfaceC43522f mo5386k();

    /* renamed from: l */
    C43520b mo5385l();

    /* renamed from: m */
    C43521c[] mo5384m();

    /* renamed from: n */
    C43519a mo5383n();
}
