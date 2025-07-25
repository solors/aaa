package p682g5;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: g5.d */
/* loaded from: classes6.dex */
public class SpManager {

    /* renamed from: a */
    private final String f90758a;

    /* renamed from: b */
    private final String f90759b;

    /* renamed from: c */
    private final String f90760c;

    /* renamed from: d */
    private final String f90761d;

    /* renamed from: e */
    private final String f90762e;

    /* renamed from: f */
    private final String f90763f;

    /* renamed from: g */
    private final String f90764g;

    /* renamed from: h */
    private final String f90765h;

    /* renamed from: i */
    private final Map<String, C33210c> f90766i;

    /* compiled from: SpManager.java */
    /* renamed from: g5.d$b */
    /* loaded from: classes6.dex */
    private static class C33209b {

        /* renamed from: a */
        private static final SpManager f90767a = new SpManager();
    }

    /* compiled from: SpManager.java */
    /* renamed from: g5.d$c */
    /* loaded from: classes6.dex */
    public static class C33210c {

        /* renamed from: a */
        private final SharedPreferences f90768a;

        /* renamed from: a */
        public void m24287a() {
            m24284d().clear().apply();
        }

        /* renamed from: b */
        public Map<String, ?> m24286b() {
            return this.f90768a.getAll();
        }

        /* renamed from: c */
        public boolean m24285c(String str, boolean z) {
            return this.f90768a.getBoolean(str, z);
        }

        /* renamed from: d */
        public SharedPreferences.Editor m24284d() {
            return this.f90768a.edit();
        }

        /* renamed from: e */
        public long m24283e(String str, long j) {
            return this.f90768a.getLong(str, j);
        }

        /* renamed from: f */
        public String m24282f(String str, String str2) {
            return this.f90768a.getString(str, str2);
        }

        /* renamed from: g */
        public void m24281g(String str) {
            m24284d().remove(str).apply();
        }

        /* renamed from: h */
        public void m24280h(String str, boolean z) {
            m24284d().putBoolean(str, z).apply();
        }

        /* renamed from: i */
        public void m24279i(String str, long j) {
            m24284d().putLong(str, j).apply();
        }

        /* renamed from: j */
        public void m24278j(String str, String str2) {
            m24284d().putString(str, str2).apply();
        }

        private C33210c(Context context, String str) {
            this.f90768a = context.getSharedPreferences(str, 0);
        }
    }

    /* renamed from: a */
    public static SpManager m24298a() {
        return C33209b.f90767a;
    }

    /* renamed from: b */
    public C33210c m24297b(Context context) {
        return m24290i(context, "user_tag_sdk_sp_file");
    }

    /* renamed from: c */
    public C33210c m24296c(Context context) {
        return m24290i(context, "user_tag_list_sdk_local_sp_file");
    }

    /* renamed from: d */
    public C33210c m24295d(Context context) {
        return m24290i(context, "user_tag_sdk_local_sp_file");
    }

    /* renamed from: e */
    public C33210c m24294e(Context context) {
        return m24290i(context, "user_tag_flow_domain_sp_file");
    }

    /* renamed from: f */
    public C33210c m24293f(Context context) {
        return m24290i(context, "user_tag_pm_flow_domain_sp_file");
    }

    /* renamed from: g */
    public C33210c m24292g(Context context) {
        return m24290i(context, "user_tag_list_sdk_remote_sp_file");
    }

    /* renamed from: h */
    public C33210c m24291h(Context context) {
        return m24290i(context, "user_tag_sdk_remote_sp_file");
    }

    /* renamed from: i */
    public C33210c m24290i(Context context, String str) {
        if (!this.f90766i.containsKey(str)) {
            this.f90766i.put(str, new C33210c(context, str));
        }
        return this.f90766i.get(str);
    }

    /* renamed from: j */
    public C33210c m24289j(Context context) {
        return m24290i(context, "user_tag_ua_ad_tag_sp_file");
    }

    private SpManager() {
        this.f90758a = "user_tag_sdk_sp_file";
        this.f90759b = "user_tag_sdk_local_sp_file";
        this.f90760c = "user_tag_list_sdk_local_sp_file";
        this.f90761d = "user_tag_sdk_remote_sp_file";
        this.f90762e = "user_tag_list_sdk_remote_sp_file";
        this.f90763f = "user_tag_flow_domain_sp_file";
        this.f90764g = "user_tag_pm_flow_domain_sp_file";
        this.f90765h = "user_tag_ua_ad_tag_sp_file";
        this.f90766i = new ConcurrentHashMap();
    }
}
