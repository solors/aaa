package p737j4;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SpManager.java */
/* renamed from: j4.d */
/* loaded from: classes6.dex */
public class C37287d {

    /* renamed from: a */
    private final String f98447a;

    /* renamed from: b */
    private final Map<String, C37290c> f98448b;

    /* compiled from: SpManager.java */
    /* renamed from: j4.d$b */
    /* loaded from: classes6.dex */
    private static class C37289b {

        /* renamed from: a */
        private static final C37287d f98449a = new C37287d();
    }

    /* compiled from: SpManager.java */
    /* renamed from: j4.d$c */
    /* loaded from: classes6.dex */
    public static class C37290c {

        /* renamed from: a */
        private final SharedPreferences f98450a;

        /* renamed from: a */
        public SharedPreferences.Editor m18561a() {
            return this.f98450a.edit();
        }

        /* renamed from: b */
        public long m18560b(String str, long j) {
            return this.f98450a.getLong(str, j);
        }

        /* renamed from: c */
        public String m18559c(String str, String str2) {
            return this.f98450a.getString(str, str2);
        }

        /* renamed from: d */
        public void m18558d(String str, long j) {
            m18561a().putLong(str, j).apply();
        }

        /* renamed from: e */
        public void m18557e(String str, String str2) {
            m18561a().putString(str, str2).apply();
        }

        private C37290c(Context context, String str) {
            this.f98450a = context.getSharedPreferences(str, 0);
        }
    }

    /* renamed from: a */
    public static C37287d m18566a() {
        return C37289b.f98449a;
    }

    /* renamed from: b */
    public C37290c m18565b(Context context) {
        return m18564c(context, "grt_sdk_sp_file");
    }

    /* renamed from: c */
    public C37290c m18564c(Context context, String str) {
        if (!this.f98448b.containsKey(str)) {
            this.f98448b.put(str, new C37290c(context, str));
        }
        return this.f98448b.get(str);
    }

    /* renamed from: d */
    public void m18563d(String str) {
        this.f98448b.remove(str);
    }

    private C37287d() {
        this.f98447a = "grt_sdk_sp_file";
        this.f98448b = new ConcurrentHashMap();
    }
}
