package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mi */
/* loaded from: classes6.dex */
public class C20473mi {

    /* renamed from: a */
    private final boolean f52048a;

    /* renamed from: b */
    private String f52049b;

    /* renamed from: c */
    private String f52050c;

    /* renamed from: d */
    private boolean f52051d;

    /* renamed from: e */
    private C20047hf f52052e;

    /* renamed from: f */
    private Map<String, String> f52053f;

    /* renamed from: g */
    private InterfaceC19592an f52054g;

    /* renamed from: h */
    private String f52055h;

    /* renamed from: i */
    private boolean f52056i;

    /* renamed from: j */
    private boolean f52057j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20473mi(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, Map<String, String> map, InterfaceC19592an interfaceC19592an, C20047hf c20047hf) {
        this.f52049b = str;
        this.f52050c = str2;
        this.f52048a = z;
        this.f52051d = z2;
        this.f52053f = map;
        this.f52054g = interfaceC19592an;
        this.f52052e = c20047hf;
        this.f52056i = z3;
        this.f52057j = z4;
        this.f52055h = str3;
    }

    /* renamed from: a */
    public Map<String, String> m56308a() {
        HashMap hashMap = new HashMap();
        hashMap.put("instanceId", this.f52049b);
        hashMap.put("instanceName", this.f52050c);
        hashMap.put("rewarded", Boolean.toString(this.f52048a));
        hashMap.put("inAppBidding", Boolean.toString(this.f52051d));
        hashMap.put("isOneFlow", Boolean.toString(this.f52056i));
        hashMap.put(C21114v8.f53870r, String.valueOf(2));
        C20047hf c20047hf = this.f52052e;
        hashMap.put("width", c20047hf != null ? Integer.toString(c20047hf.m58154c()) : "0");
        C20047hf c20047hf2 = this.f52052e;
        hashMap.put("height", c20047hf2 != null ? Integer.toString(c20047hf2.m58156a()) : "0");
        C20047hf c20047hf3 = this.f52052e;
        hashMap.put("label", c20047hf3 != null ? c20047hf3.m58155b() : "");
        hashMap.put(C21114v8.f53874v, Boolean.toString(m56298i()));
        if (this.f52057j) {
            hashMap.put("isMultipleAdObjects", "true");
        }
        String str = this.f52055h;
        if (str != null) {
            hashMap.put("adUnitId", str);
        }
        Map<String, String> map = this.f52053f;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final InterfaceC19592an m56305b() {
        return this.f52054g;
    }

    /* renamed from: c */
    public String m56304c() {
        return this.f52055h;
    }

    /* renamed from: d */
    public Map<String, String> m56303d() {
        return this.f52053f;
    }

    /* renamed from: e */
    public String m56302e() {
        return this.f52049b;
    }

    /* renamed from: f */
    public String m56301f() {
        return this.f52050c.replaceAll("IronSource_", "");
    }

    /* renamed from: g */
    public String m56300g() {
        return this.f52050c;
    }

    /* renamed from: h */
    public C20047hf m56299h() {
        return this.f52052e;
    }

    /* renamed from: i */
    public boolean m56298i() {
        if (m56299h() != null && m56299h().m58153d()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m56297j() {
        return this.f52051d;
    }

    /* renamed from: k */
    public boolean m56296k() {
        if (!m56297j() && !m56294m()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m56295l() {
        return this.f52057j;
    }

    /* renamed from: m */
    public boolean m56294m() {
        return this.f52056i;
    }

    /* renamed from: n */
    public boolean m56293n() {
        return this.f52048a;
    }

    /* renamed from: a */
    public void m56307a(InterfaceC19592an interfaceC19592an) {
        this.f52054g = interfaceC19592an;
    }

    /* renamed from: a */
    public void m56306a(String str) {
        this.f52055h = str;
    }
}
