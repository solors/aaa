package p693h3;

import com.helpshift.log.HSLogger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p752k3.C37382g;
import p752k3.C37383m;

/* renamed from: h3.a */
/* loaded from: classes5.dex */
public class HSGenericDataManager {

    /* renamed from: a */
    private HSPersistentStorage f91312a;

    public HSGenericDataManager(HSPersistentStorage hSPersistentStorage) {
        this.f91312a = hSPersistentStorage;
    }

    /* renamed from: a */
    private JSONObject m23822a(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException e) {
            HSLogger.m65438e("genricDataMngr", "Error in reading the json value for key " + str, e);
            return null;
        }
    }

    /* renamed from: b */
    private String m23821b(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException e) {
            HSLogger.m65438e("genricDataMngr", "Error in reading the json value for key " + str, e);
            return "";
        }
    }

    /* renamed from: d */
    private JSONObject m23819d() {
        String m23733z = this.f91312a.m23733z();
        if (C37383m.m18236d(m23733z)) {
            return null;
        }
        try {
            return new JSONObject(m23733z);
        } catch (Exception e) {
            HSLogger.m65438e("genricDataMngr", "Error in reading unread count notification content", e);
            return null;
        }
    }

    /* renamed from: e */
    private String m23818e(int i, String str) {
        JSONObject m23819d = m23819d();
        if (m23819d == null) {
            return "You have new messages";
        }
        try {
            return m23819d.getString(str).replace(m23819d.getString("placeholder"), String.valueOf(i));
        } catch (Exception e) {
            HSLogger.m65438e("genricDataMngr", "Error in constructing unread count string", e);
            return "You have new messages";
        }
    }

    /* renamed from: k */
    private void m23812k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f91312a.m23744s0(jSONObject.toString());
        }
    }

    /* renamed from: l */
    private void m23811l(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f91312a.m23742t0(jSONObject.toString());
        }
    }

    /* renamed from: m */
    private void m23810m(String str) {
        if (C37383m.m18233g(str)) {
            this.f91312a.m23740u0(str);
        }
    }

    /* renamed from: n */
    private void m23809n(String str) {
        if (C37383m.m18233g(str)) {
            this.f91312a.m23738v0(str);
        }
    }

    /* renamed from: o */
    private void m23808o(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f91312a.m23736w0(jSONObject.toString());
        }
    }

    /* renamed from: c */
    public Map<String, String> m23820c() {
        return C37382g.m18252f(this.f91312a.m23735x());
    }

    /* renamed from: f */
    public String m23817f(int i) {
        if (i > 1) {
            return m23818e(i, "plural_message");
        }
        return m23818e(i, "single_message");
    }

    /* renamed from: g */
    public String m23816g() {
        return this.f91312a.m23803E();
    }

    /* renamed from: h */
    public String m23815h() {
        return this.f91312a.m23802F();
    }

    /* renamed from: i */
    public Map<String, String> m23814i() {
        return C37382g.m18252f(this.f91312a.m23799I());
    }

    /* renamed from: j */
    public void m23813j(String str) {
        if (!C37383m.m18236d(str) && C37382g.m18254d(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                m23810m(m23821b("polling_route", jSONObject));
                m23809n(m23821b("push_token_sync_route", jSONObject));
                m23812k(m23822a("network_headers", jSONObject));
                m23811l(m23822a("notification_content", jSONObject));
                m23808o(m23822a("user_data_key_mapping", jSONObject));
            } catch (Exception e) {
                HSLogger.m65438e("genricDataMngr", "Unable to parse the generic sdk data", e);
            }
        }
    }
}
