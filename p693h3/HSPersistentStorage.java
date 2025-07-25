package p693h3;

import com.helpshift.log.HSLogger;
import com.ironsource.C21114v8;
import com.p552ot.pubsub.p553a.C26484a;
import org.json.JSONArray;
import org.json.JSONException;
import p752k3.C37383m;

/* renamed from: h3.b */
/* loaded from: classes5.dex */
public class HSPersistentStorage {

    /* renamed from: a */
    private ISharedPreferencesStore f91313a;

    public HSPersistentStorage(ISharedPreferencesStore iSharedPreferencesStore) {
        this.f91313a = iSharedPreferencesStore;
    }

    /* renamed from: L */
    private void m23796L(String str, boolean z) {
        this.f91313a.putBoolean(str, z);
    }

    /* renamed from: M */
    private void m23795M(String str, int i) {
        this.f91313a.putInt(str, i);
    }

    /* renamed from: N */
    private void m23794N(String str, long j) {
        this.f91313a.putLong(str, j);
    }

    /* renamed from: f */
    private boolean m23771f(String str) {
        return this.f91313a.mo23732a(str);
    }

    /* renamed from: p */
    private int m23751p(String str) {
        return this.f91313a.mo23729d(str);
    }

    /* renamed from: w */
    private long m23737w(String str) {
        return this.f91313a.mo23731b(str);
    }

    /* renamed from: A */
    public int m23807A() {
        return m23751p("notificationIcon");
    }

    /* renamed from: B */
    public int m23806B() {
        return m23751p("notificationLargeIcon");
    }

    /* renamed from: C */
    public int m23805C() {
        return m23751p("notificationSoundId");
    }

    /* renamed from: D */
    public String m23804D() {
        return m23800H("platform_id");
    }

    /* renamed from: E */
    public String m23803E() {
        return m23800H("polling_route");
    }

    /* renamed from: F */
    public String m23802F() {
        return m23800H("push_token_sync_route");
    }

    /* renamed from: G */
    public int m23801G() {
        return m23751p("screenOrientation");
    }

    /* renamed from: H */
    public String m23800H(String str) {
        return this.f91313a.mo23730c(str);
    }

    /* renamed from: I */
    public String m23799I() {
        return m23800H("user_data_key_mapping");
    }

    /* renamed from: J */
    public String m23798J() {
        return m23800H("ui_config_data");
    }

    /* renamed from: K */
    public boolean m23797K() {
        return m23771f("clear_anonymous_user");
    }

    /* renamed from: O */
    public void m23793O(String str, String str2) {
        this.f91313a.putString(str, str2);
    }

    /* renamed from: P */
    public void m23792P() {
        this.f91313a.remove("active_user");
    }

    /* renamed from: Q */
    public void m23791Q() {
        this.f91313a.remove("anon_user_id_map");
    }

    /* renamed from: R */
    public void m23790R(String str) {
        m23793O("additional_hc_data", str);
    }

    /* renamed from: S */
    public void m23789S(String str) {
        m23793O("local_storage_data", str);
    }

    /* renamed from: T */
    public void m23788T(String str) {
        m23793O("active_user", str);
    }

    /* renamed from: U */
    public void m23787U(String str) {
        if (C37383m.m18236d(str)) {
            str = new JSONArray().toString();
        }
        m23793O("breadcrumbs", str);
    }

    /* renamed from: V */
    public void m23786V(boolean z) {
        m23796L("clear_anonymous_user", z);
    }

    /* renamed from: W */
    public void m23785W(String str) {
        m23793O("config", str);
    }

    /* renamed from: X */
    public void m23784X(String str) {
        m23793O("current_push_token", str);
    }

    /* renamed from: Y */
    public void m23783Y(String str) {
        m23793O(C21114v8.C21123i.f54109D, str);
    }

    /* renamed from: Z */
    public void m23782Z(boolean z) {
        m23796L("enable_inapp_notificaiton", z);
    }

    /* renamed from: a */
    public void m23781a() {
        this.f91313a.remove("app_launch_events");
    }

    /* renamed from: a0 */
    public void m23780a0(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        m23793O("failed_analytics_events", jSONArray.toString());
    }

    /* renamed from: b */
    public String m23779b() {
        return m23800H("active_user");
    }

    /* renamed from: b0 */
    public void m23778b0(String str) {
        m23793O("helpcenter_ui_config_data", str);
    }

    /* renamed from: c */
    public String m23777c() {
        return m23800H("additional_hc_data");
    }

    /* renamed from: c0 */
    public void m23776c0(String str) {
        m23793O(C26484a.f69188E, str);
    }

    /* renamed from: d */
    public String m23775d() {
        return m23800H("anon_user_id_map");
    }

    /* renamed from: d0 */
    public void m23774d0(String str) {
        m23793O("hs_did", str);
    }

    /* renamed from: e */
    public String m23773e() {
        return m23800H("app_launch_events");
    }

    /* renamed from: e0 */
    public void m23772e0(String str) {
        m23793O("language", str);
    }

    /* renamed from: f0 */
    public void m23770f0(long j) {
        m23794N("app_launch_last_sync_timestamp", j);
    }

    /* renamed from: g */
    public JSONArray m23769g() throws JSONException {
        try {
            String m23800H = m23800H("breadcrumbs");
            if (!C37383m.m18236d(m23800H)) {
                return new JSONArray(m23800H);
            }
        } catch (Exception e) {
            HSLogger.m65438e("hsPerStore", "Error Getting BreadCrumbs", e);
        }
        return new JSONArray();
    }

    /* renamed from: g0 */
    public void m23768g0(long j) {
        m23794N("last_helpcenter_cache_eviction_time", j);
    }

    /* renamed from: h */
    public String m23767h() {
        return m23800H("config");
    }

    /* renamed from: h0 */
    public void m23766h0(long j) {
        m23794N("last_unread_count_api_access", j);
    }

    /* renamed from: i */
    public String m23765i() {
        return m23800H("current_push_token");
    }

    /* renamed from: i0 */
    public void m23764i0(String str) {
        m23793O("localProactiveConfig", str);
    }

    /* renamed from: j */
    public String m23763j() {
        return m23800H(C21114v8.C21123i.f54109D);
    }

    /* renamed from: j0 */
    public void m23762j0(String str) {
        m23793O("notificationChannelId", str);
    }

    /* renamed from: k */
    public boolean m23761k() {
        return m23771f("enable_inapp_notificaiton");
    }

    /* renamed from: k0 */
    public void m23760k0(int i) {
        m23795M("notificationIcon", i);
    }

    /* renamed from: l */
    public JSONArray m23759l() {
        try {
            String m23800H = m23800H("failed_analytics_events");
            if (C37383m.m18236d(m23800H)) {
                return new JSONArray();
            }
            return new JSONArray(m23800H);
        } catch (Exception e) {
            HSLogger.m65438e("hsPerStore", "Error getting failed events", e);
            return new JSONArray();
        }
    }

    /* renamed from: l0 */
    public void m23758l0(int i) {
        m23795M("notificationLargeIcon", i);
    }

    /* renamed from: m */
    public String m23757m() {
        return m23800H("helpcenter_ui_config_data");
    }

    /* renamed from: m0 */
    public void m23756m0(int i) {
        m23795M("notificationSoundId", i);
    }

    /* renamed from: n */
    public String m23755n() {
        return m23800H(C26484a.f69188E);
    }

    /* renamed from: n0 */
    public void m23754n0(String str) {
        m23793O("platform_id", str);
    }

    /* renamed from: o */
    public String m23753o() {
        return m23800H("hs_did");
    }

    /* renamed from: o0 */
    public void m23752o0(int i) {
        m23795M("screenOrientation", i);
    }

    /* renamed from: p0 */
    public void m23750p0(String str) {
        m23793O("ui_config_data", str);
    }

    /* renamed from: q */
    public String m23749q() {
        return m23800H("language");
    }

    /* renamed from: q0 */
    public void m23748q0(String str) {
        m23793O("anon_user_id_map", str);
    }

    /* renamed from: r */
    public long m23747r() {
        return m23737w("last_helpcenter_cache_eviction_time");
    }

    /* renamed from: r0 */
    public void m23746r0(String str) {
        m23793O("app_launch_events", str);
    }

    /* renamed from: s */
    public long m23745s() {
        return m23737w("last_unread_count_api_access");
    }

    /* renamed from: s0 */
    public void m23744s0(String str) {
        m23793O("network_headers", str);
    }

    /* renamed from: t */
    public long m23743t() {
        return m23737w("app_launch_last_sync_timestamp");
    }

    /* renamed from: t0 */
    public void m23742t0(String str) {
        m23793O("notification_content", str);
    }

    /* renamed from: u */
    public String m23741u() {
        return m23800H("localProactiveConfig");
    }

    /* renamed from: u0 */
    public void m23740u0(String str) {
        m23793O("polling_route", str);
    }

    /* renamed from: v */
    public String m23739v() {
        return m23800H("local_storage_data");
    }

    /* renamed from: v0 */
    public void m23738v0(String str) {
        m23793O("push_token_sync_route", str);
    }

    /* renamed from: w0 */
    public void m23736w0(String str) {
        m23793O("user_data_key_mapping", str);
    }

    /* renamed from: x */
    public String m23735x() {
        return m23800H("network_headers");
    }

    /* renamed from: y */
    public String m23734y() {
        return m23800H("notificationChannelId");
    }

    /* renamed from: z */
    public String m23733z() {
        return m23800H("notification_content");
    }
}
