package p710i3;

import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.helpshift.log.HSLogger;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p632d3.CoreNotificationManager;
import p632d3.HSPushTokenManager;
import p663f3.ConversationPoller;
import p663f3.FetchNotificationUpdate;
import p693h3.HSGenericDataManager;
import p693h3.HSPersistentStorage;
import p736j3.UserLifecycleListener;
import p752k3.C37382g;
import p752k3.C37383m;
import p752k3.ValueListener;
import p752k3.ValuePair;
import p977t2.HSThreadingService;

/* renamed from: i3.a */
/* loaded from: classes5.dex */
public class UserManager {

    /* renamed from: i */
    private static final Set<String> f91865i = new HashSet();

    /* renamed from: a */
    private final HSPersistentStorage f91866a;

    /* renamed from: b */
    private final HSGenericDataManager f91867b;

    /* renamed from: c */
    private final HSPushTokenManager f91868c;

    /* renamed from: d */
    private ConversationPoller f91869d;

    /* renamed from: e */
    private FetchNotificationUpdate f91870e;

    /* renamed from: f */
    private final HSThreadingService f91871f;

    /* renamed from: g */
    private final CoreNotificationManager f91872g;

    /* renamed from: h */
    private WeakReference<UserLifecycleListener> f91873h = new WeakReference<>(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserManager.java */
    /* renamed from: i3.a$a */
    /* loaded from: classes5.dex */
    public class RunnableC33598a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f91874b;

        RunnableC33598a(String str) {
            UserManager.this = r1;
            this.f91874b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            UserManager.this.f91870e.m24952a("sdkx_register_push_token", UserManager.this.m23193q());
            if (UserManager.this.m23215Z()) {
                UserManager.this.f91868c.m25773e(this.f91874b, UserManager.this.m23199k(), new C33600c());
            }
        }
    }

    /* compiled from: UserManager.java */
    /* renamed from: i3.a$b */
    /* loaded from: classes5.dex */
    public class RunnableC33599b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f91876b;

        RunnableC33599b(String str) {
            UserManager.this = r1;
            this.f91876b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            UserManager.this.f91870e.m24952a(this.f91876b, UserManager.this.m23193q());
            if (!UserManager.this.m23215Z()) {
                return;
            }
            String m23765i = UserManager.this.f91866a.m23765i();
            if (C37383m.m18236d(m23765i)) {
                UserManager.this.f91869d.m24957a();
            } else {
                UserManager.this.f91868c.m25773e(m23765i, UserManager.this.m23199k(), new C33600c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserManager.java */
    /* renamed from: i3.a$c */
    /* loaded from: classes5.dex */
    public class C33600c implements ValueListener<Boolean> {
        C33600c() {
            UserManager.this = r1;
        }

        @Override // p752k3.ValueListener
        /* renamed from: b */
        public void mo18227a(Boolean bool) {
            UserManager.this.m23220U(bool.booleanValue());
        }
    }

    public UserManager(HSPersistentStorage hSPersistentStorage, HSPushTokenManager hSPushTokenManager, HSGenericDataManager hSGenericDataManager, HSThreadingService hSThreadingService, CoreNotificationManager coreNotificationManager) {
        this.f91866a = hSPersistentStorage;
        this.f91867b = hSGenericDataManager;
        this.f91868c = hSPushTokenManager;
        this.f91871f = hSThreadingService;
        this.f91872g = coreNotificationManager;
    }

    /* renamed from: A */
    private String m23240A(String str) {
        String m23779b = this.f91866a.m23779b();
        if (m23779b.isEmpty()) {
            return "";
        }
        try {
            return new JSONObject(m23779b).getString(str);
        } catch (JSONException e) {
            HSLogger.m65438e("UsrMngr", "error in getting user info for key: " + str, e);
            return "";
        }
    }

    /* renamed from: X */
    private <T> void m23217X(String str, T t) {
        ValuePair<String, JSONObject> m23200j = m23200j();
        if (C37383m.m18236d(m23200j.f98667a)) {
            return;
        }
        m23200j.f98668b.put(str, t);
        this.f91866a.m23793O(m23200j.f98667a, m23200j.f98668b.toString());
    }

    /* renamed from: b0 */
    private boolean m23211b0(String str) {
        String m23765i = this.f91866a.m23765i();
        if (!C37383m.m18236d(m23765i) && m23765i.equals(str) && m23239B()) {
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    private void m23209c0(String str) {
        this.f91871f.m3280c().submit(new RunnableC33599b(str));
    }

    /* renamed from: f */
    private void m23204f() {
        this.f91866a.m23792P();
        this.f91866a.m23793O("active_user_data", JsonUtils.EMPTY_JSON);
        this.f91866a.m23780a0(new JSONArray());
        this.f91872g.mo25789d();
        f91865i.clear();
    }

    /* renamed from: j */
    private ValuePair<String, JSONObject> m23200j() {
        String str;
        String str2 = "anon_user_data";
        JSONObject jSONObject = new JSONObject();
        String str3 = "";
        try {
            str = JsonUtils.EMPTY_JSON;
            if (!C37383m.m18235e(m23192r())) {
                str = this.f91866a.m23800H("active_user_data");
                str2 = "active_user_data";
            } else if (C37383m.m18235e(m23196n())) {
                str2 = "";
            } else {
                str = this.f91866a.m23800H("anon_user_data");
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            if (!C37383m.m18236d(str)) {
                jSONObject = new JSONObject(str);
            }
        } catch (Exception e2) {
            str3 = str2;
            e = e2;
            HSLogger.m65438e("UsrMngr", "Error getting active user in user data", e);
            str2 = str3;
            return new ValuePair<>(str2, jSONObject);
        }
        return new ValuePair<>(str2, jSONObject);
    }

    /* renamed from: n */
    private Map<String, String> m23196n() {
        return C37382g.m18252f(this.f91866a.m23775d());
    }

    /* renamed from: p */
    private Map<String, String> m23194p() {
        Map<String, String> m18252f = C37382g.m18252f(this.f91866a.m23779b());
        if (m18252f.isEmpty()) {
            return m23196n();
        }
        return m18252f;
    }

    /* renamed from: r */
    private Map<String, String> m23192r() {
        return C37382g.m18252f(this.f91866a.m23779b());
    }

    /* renamed from: z */
    private <T> T m23184z(String str, T t) {
        ValuePair<String, JSONObject> m23200j = m23200j();
        if (C37383m.m18236d(m23200j.f98667a)) {
            return t;
        }
        T t2 = (T) m23200j.f98668b.opt(str);
        if (t2 != null) {
            return t2;
        }
        return t;
    }

    /* renamed from: B */
    public boolean m23239B() {
        return ((Boolean) m23184z("push_token_synced", Boolean.FALSE)).booleanValue();
    }

    /* renamed from: C */
    public Boolean m23238C(String str) {
        return Boolean.valueOf(!f91865i.contains(str));
    }

    /* renamed from: D */
    public void m23237D(Map<String, String> map) {
        if (C37383m.m18235e(map)) {
            HSLogger.m65439e("UsrMngr", "Empty data for user login");
            return;
        }
        Map<String, String> m23192r = m23192r();
        if (C37383m.m18232h(m23192r) && m23192r.equals(map)) {
            return;
        }
        if (C37383m.m18235e(m23192r)) {
            m23192r = m23196n();
        }
        this.f91869d.m24956b();
        if (m23239B()) {
            this.f91868c.m25776b(m23185y(m23192r), new C33600c());
        }
        m23204f();
        this.f91866a.m23788T(new JSONObject(map).toString());
        if (this.f91873h.get() != null) {
            this.f91873h.get().mo12174f();
        }
        m23209c0("sdkx_login_with_user");
    }

    /* renamed from: E */
    public void m23236E() {
        Map<String, String> m23192r = m23192r();
        if (C37383m.m18235e(m23192r)) {
            return;
        }
        this.f91869d.m24956b();
        m23204f();
        this.f91868c.m25776b(m23185y(m23192r), new C33600c());
        if (m23195o()) {
            m23232I();
            m23203g();
        }
        if (this.f91873h.get() != null) {
            this.f91873h.get().mo12173k();
        }
        m23209c0("sdkx_login_with_anonymous_user");
    }

    /* renamed from: F */
    public void m23235F() {
        m23217X("unread_count", 0);
    }

    /* renamed from: G */
    public void m23234G() {
        m23217X("push_unread_count", 0);
    }

    /* renamed from: H */
    public void m23233H(String str) {
        boolean z;
        if (!m23211b0(str)) {
            return;
        }
        String m23765i = this.f91866a.m23765i();
        if (C37383m.m18233g(str) && !str.equals(m23765i)) {
            z = true;
        } else {
            z = false;
        }
        this.f91868c.m25772f(str);
        m23220U(false);
        Map<String, String> m23192r = m23192r();
        if (C37383m.m18235e(m23192r)) {
            m23192r = m23196n();
        }
        if (!C37383m.m18235e(m23192r) && z && m23215Z()) {
            this.f91871f.m3280c().submit(new RunnableC33598a(str));
        }
    }

    /* renamed from: I */
    public void m23232I() {
        this.f91866a.m23791Q();
        this.f91866a.m23793O("anon_user_data", JsonUtils.EMPTY_JSON);
    }

    /* renamed from: J */
    public void m23231J(String str) {
        f91865i.remove(str);
    }

    /* renamed from: K */
    public void m23230K() {
        this.f91873h.clear();
    }

    /* renamed from: L */
    public boolean m23229L() {
        if (!m23239B() && m23215Z() && !C37383m.m18236d(this.f91866a.m23765i())) {
            this.f91868c.m25773e(this.f91866a.m23765i(), m23199k(), new C33600c());
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public void m23228M(boolean z) {
        this.f91866a.m23786V(z);
    }

    /* renamed from: N */
    public void m23227N(int i) {
        m23217X("active_unread_count_fetch_interval", Integer.valueOf(i));
    }

    /* renamed from: O */
    public void m23226O(ConversationPoller conversationPoller) {
        this.f91869d = conversationPoller;
    }

    /* renamed from: P */
    public void m23225P(FetchNotificationUpdate fetchNotificationUpdate) {
        this.f91870e = fetchNotificationUpdate;
    }

    /* renamed from: Q */
    public void m23224Q(int i) {
        m23217X("passive_unread_count_fetch_interval", Integer.valueOf(i));
    }

    /* renamed from: R */
    public void m23223R(long j) {
        m23217X(KiwiConstants.f2715b, Long.valueOf(j));
    }

    /* renamed from: S */
    public void m23222S(int i) {
        m23217X("base_polling_interval", Integer.valueOf(i));
    }

    /* renamed from: T */
    public void m23221T(int i) {
        m23217X("max_polling_interval", Integer.valueOf(i));
    }

    /* renamed from: U */
    public void m23220U(boolean z) {
        m23217X("push_token_synced", Boolean.valueOf(z));
    }

    /* renamed from: V */
    public void m23219V(boolean z) {
        m23217X("should_poll", Boolean.valueOf(z));
    }

    /* renamed from: W */
    public void m23218W(boolean z) {
        m23217X("show_chat_icon_in_helpcenter", Boolean.valueOf(z));
    }

    /* renamed from: Y */
    public void m23216Y(UserLifecycleListener userLifecycleListener) {
        this.f91873h = new WeakReference<>(userLifecycleListener);
    }

    /* renamed from: Z */
    public boolean m23215Z() {
        return ((Boolean) m23184z("should_poll", Boolean.FALSE)).booleanValue();
    }

    /* renamed from: a0 */
    public boolean m23213a0() {
        return ((Boolean) m23184z("show_chat_icon_in_helpcenter", Boolean.FALSE)).booleanValue();
    }

    /* renamed from: d0 */
    public void m23207d0(int i) {
        m23217X("push_unread_count", Integer.valueOf(m23187w() + i));
    }

    /* renamed from: e */
    public void m23206e(String str) {
        f91865i.add(str);
    }

    /* renamed from: e0 */
    public void m23205e0(int i) {
        m23217X("unread_count", Integer.valueOf(m23186x() + i));
    }

    /* renamed from: g */
    public void m23203g() {
        if (m23196n().isEmpty()) {
            HSLogger.m65441d("UsrMngr", "Existing anon user details not found. Generating new anon user ID");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("userId", m23202h());
                this.f91866a.m23748q0(jSONObject.toString());
                return;
            } catch (Exception unused) {
                HSLogger.m65441d("UsrMngr", "Error in saving the anonymous local user id");
                return;
            }
        }
        HSLogger.m65441d("UsrMngr", "Existing anon user details found. Not generating new anon user ID");
    }

    /* renamed from: h */
    protected String m23202h() {
        String substring = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 15);
        return "hsft_anon_" + System.currentTimeMillis() + "-" + substring;
    }

    /* renamed from: i */
    public int m23201i() {
        return ((Integer) m23184z("active_unread_count_fetch_interval", 60000)).intValue();
    }

    /* renamed from: k */
    public Map<String, String> m23199k() {
        Map<String, String> m23192r = m23192r();
        if (C37383m.m18235e(m23192r)) {
            m23192r = m23196n();
        }
        if (C37383m.m18235e(m23192r)) {
            return new HashMap();
        }
        return m23185y(m23192r);
    }

    /* renamed from: l */
    public String m23198l() {
        return m23240A("userEmail");
    }

    /* renamed from: m */
    public String m23197m() {
        String m23240A = m23240A("userId");
        if (C37383m.m18236d(m23240A)) {
            Map<String, String> m23196n = m23196n();
            if (!C37383m.m18235e(m23196n)) {
                return m23196n.get("userId");
            }
            return m23240A;
        }
        return m23240A;
    }

    /* renamed from: o */
    public boolean m23195o() {
        return this.f91866a.m23797K();
    }

    /* renamed from: q */
    public String m23193q() {
        StringBuilder sb2 = new StringBuilder();
        TreeMap treeMap = new TreeMap(m23194p());
        if (C37383m.m18235e(treeMap)) {
            return "";
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            sb2.append((String) entry.getValue());
        }
        return sb2.toString();
    }

    /* renamed from: s */
    public int m23191s() {
        return ((Integer) m23184z("passive_unread_count_fetch_interval", 300000)).intValue();
    }

    /* renamed from: t */
    public long m23190t() {
        return Long.valueOf(m23184z(KiwiConstants.f2715b, 0) + "").longValue();
    }

    /* renamed from: u */
    public int m23189u() {
        return ((Integer) m23184z("base_polling_interval", 5000)).intValue();
    }

    /* renamed from: v */
    public int m23188v() {
        return ((Integer) m23184z("max_polling_interval", 60000)).intValue();
    }

    /* renamed from: w */
    public int m23187w() {
        return ((Integer) m23184z("push_unread_count", 0)).intValue();
    }

    /* renamed from: x */
    public int m23186x() {
        return ((Integer) m23184z("unread_count", 0)).intValue();
    }

    /* renamed from: y */
    public Map<String, String> m23185y(Map<String, String> map) {
        Map<String, String> m23814i = this.f91867b.m23814i();
        if (C37383m.m18235e(m23814i)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            String str2 = m23814i.get(str);
            if (C37383m.m18233g(str2)) {
                hashMap.put(str2, map.get(str));
            }
        }
        return hashMap;
    }
}
