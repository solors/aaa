package p711i4;

import android.app.Application;
import android.text.TextUtils;
import com.learnings.abcenter.util.AbCenterConstant;
import com.learnings.grt.debug.GrtDebugManager;
import java.util.Map;
import p737j4.C37279b;
import p737j4.C37287d;
import p753k4.C37385a;
import p753k4.C37387d;

/* renamed from: i4.o */
/* loaded from: classes6.dex */
public class UserArea {

    /* renamed from: a */
    private final String f91911a = AbCenterConstant.SP_KEY_COUNTRY;

    /* renamed from: b */
    private final String f91912b = "sp_key_media_source";

    /* renamed from: c */
    private final String f91913c = "sp_key_af_status";

    /* renamed from: d */
    private String f91914d;

    /* renamed from: e */
    private String f91915e;

    /* renamed from: f */
    private long f91916f;

    /* renamed from: d */
    private C37287d.C37290c m23138d() {
        return C37287d.m18566a().m18565b(C37279b.m18579k().m18578l());
    }

    /* renamed from: a */
    public String m23141a() {
        return this.f91914d;
    }

    /* renamed from: b */
    public int m23140b() {
        long m53674b = GrtDebugManager.m53675a().m53674b();
        if (m53674b > 0) {
            return Math.max(0, C37385a.m18221a(m53674b));
        }
        return Math.max(0, C37385a.m18221a(this.f91916f));
    }

    /* renamed from: c */
    public String m23139c() {
        return this.f91915e;
    }

    /* renamed from: e */
    public void m23137e() {
        Application m18578l = C37279b.m18579k().m18578l();
        C37287d.C37290c m23138d = m23138d();
        String m18559c = m23138d.m18559c(AbCenterConstant.SP_KEY_COUNTRY, "");
        this.f91914d = m18559c;
        if (TextUtils.isEmpty(m18559c)) {
            String lowerCase = C37387d.m18214a(m18578l).toLowerCase();
            this.f91914d = lowerCase;
            m23138d.m18557e(AbCenterConstant.SP_KEY_COUNTRY, lowerCase);
        }
    }

    /* renamed from: f */
    public void m23136f() {
        String m18559c = m23138d().m18559c("sp_key_af_status", "");
        String m18559c2 = m23138d().m18559c("sp_key_media_source", "");
        if (TextUtils.equals(m18559c, "Organic")) {
            this.f91915e = m18559c;
        } else {
            this.f91915e = m18559c2;
        }
    }

    /* renamed from: g */
    public boolean m23135g(String str) {
        return TextUtils.equals("global", str);
    }

    /* renamed from: h */
    public boolean m23134h(String str) {
        if (!TextUtils.isEmpty(this.f91914d) && !TextUtils.isEmpty(str)) {
            return TextUtils.equals(this.f91914d, str);
        }
        return false;
    }

    /* renamed from: i */
    public void m23133i(long j) {
        this.f91916f = j;
    }

    /* renamed from: j */
    public void m23132j(Map<String, String> map) {
        String str = map.get("af_status");
        String str2 = map.get("media_source");
        if (!TextUtils.isEmpty(str)) {
            m23138d().m18557e("sp_key_af_status", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            m23138d().m18557e("sp_key_media_source", str2);
        }
        m23136f();
    }

    public String toString() {
        return "UserArea{country='" + this.f91914d + "', mediaSource='" + this.f91915e + "', installTime=" + this.f91916f + '}';
    }
}
