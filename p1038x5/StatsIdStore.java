package p1038x5;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: x5.h */
/* loaded from: classes6.dex */
public class StatsIdStore {

    /* renamed from: a */
    private String f117471a;

    /* renamed from: b */
    private final Map<String, String> f117472b;

    /* renamed from: c */
    private final Map<String, String> f117473c;

    /* renamed from: d */
    private final Map<String, String> f117474d;

    /* renamed from: e */
    private final Map<String, Long> f117475e;

    /* compiled from: StatsIdStore.java */
    /* renamed from: x5.h$b */
    /* loaded from: classes6.dex */
    private static class C44714b {

        /* renamed from: a */
        private static final StatsIdStore f117476a = new StatsIdStore();
    }

    /* renamed from: a */
    public static StatsIdStore m1916a() {
        return C44714b.f117476a;
    }

    /* renamed from: b */
    public String m1915b(String str) {
        if (this.f117473c.containsKey(str)) {
            return this.f117473c.get(str);
        }
        return "void";
    }

    /* renamed from: c */
    public String m1914c(String str) {
        if (!this.f117472b.containsKey(str)) {
            this.f117472b.put(str, UUID.randomUUID().toString());
        }
        return this.f117472b.get(str);
    }

    /* renamed from: d */
    public String m1913d(String str, String str2) {
        String str3 = str + str2;
        if (this.f117474d.containsKey(str3)) {
            return this.f117474d.get(str3);
        }
        return "void";
    }

    /* renamed from: e */
    public long m1912e(String str) {
        if (this.f117475e.containsKey(str)) {
            return this.f117475e.get(str).longValue();
        }
        return -1L;
    }

    /* renamed from: f */
    public String m1911f() {
        if (TextUtils.isEmpty(this.f117471a)) {
            this.f117471a = UUID.randomUUID().toString();
        }
        return this.f117471a;
    }

    /* renamed from: g */
    public void m1910g(String str, String str2) {
        this.f117473c.put(str, str2);
    }

    /* renamed from: h */
    public void m1909h(String str, String str2, String str3) {
        this.f117473c.put(str, str2);
        this.f117474d.put(str + this.f117473c.get(str), str3);
    }

    /* renamed from: i */
    public void m1908i(AdUnit adUnit) {
        if (adUnit == null) {
            return;
        }
        this.f117472b.put(adUnit.m2004b(), UUID.randomUUID().toString());
    }

    /* renamed from: j */
    public void m1907j(String str) {
        this.f117475e.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    private StatsIdStore() {
        this.f117472b = new HashMap();
        this.f117473c = new HashMap();
        this.f117474d = new HashMap();
        this.f117475e = new HashMap();
    }
}
