package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.ha */
/* loaded from: classes6.dex */
public class C20039ha {

    /* renamed from: h */
    public static final int f50429h = 0;

    /* renamed from: i */
    public static final int f50430i = 1;

    /* renamed from: j */
    public static final int f50431j = 2;

    /* renamed from: k */
    public static final int f50432k = 3;

    /* renamed from: l */
    public static final int f50433l = -1;

    /* renamed from: a */
    private String f50434a;

    /* renamed from: b */
    private String f50435b;

    /* renamed from: c */
    private int f50436c;

    /* renamed from: d */
    private Map<String, String> f50437d;

    /* renamed from: e */
    private int f50438e;

    /* renamed from: f */
    private boolean f50439f;

    /* renamed from: g */
    private C20473mi f50440g;

    public C20039ha(C20473mi c20473mi) {
        this(c20473mi.m56302e(), c20473mi.m56300g(), c20473mi.m56308a(), c20473mi.m56305b());
        this.f50440g = c20473mi;
    }

    /* renamed from: a */
    public void m58217a() {
        Map<String, String> map = this.f50437d;
        if (map != null) {
            map.clear();
        }
        this.f50437d = null;
    }

    /* renamed from: b */
    public Map<String, String> m58214b() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.f50435b);
        hashMap.put("demandSourceName", this.f50434a);
        Map<String, String> map = this.f50437d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* renamed from: c */
    public C20473mi m58212c() {
        return this.f50440g;
    }

    /* renamed from: d */
    public boolean m58210d() {
        return this.f50439f;
    }

    /* renamed from: e */
    public int m58209e() {
        return this.f50438e;
    }

    /* renamed from: f */
    public String m58208f() {
        return this.f50434a;
    }

    /* renamed from: g */
    public Map<String, String> m58207g() {
        return this.f50437d;
    }

    /* renamed from: h */
    public String m58206h() {
        return this.f50435b;
    }

    /* renamed from: i */
    public InterfaceC19592an m58205i() {
        if (this.f50440g != null) {
            return m58212c().m56305b();
        }
        return null;
    }

    /* renamed from: j */
    public int m58204j() {
        return this.f50436c;
    }

    /* renamed from: k */
    public boolean m58203k() {
        Map<String, String> map = this.f50437d;
        if (map != null && map.containsKey("rewarded")) {
            return Boolean.parseBoolean(this.f50437d.get("rewarded"));
        }
        return false;
    }

    public C20039ha(String str, String str2, Map<String, String> map, InterfaceC19592an interfaceC19592an) {
        this.f50436c = -1;
        this.f50435b = str;
        this.f50434a = str2;
        this.f50437d = map;
        this.f50438e = 0;
        this.f50439f = false;
        this.f50440g = null;
    }

    /* renamed from: a */
    public void m58215a(boolean z) {
        this.f50439f = z;
    }

    /* renamed from: b */
    public synchronized void m58213b(int i) {
        this.f50438e = i;
    }

    /* renamed from: c */
    public void m58211c(int i) {
        this.f50436c = i;
    }

    /* renamed from: a */
    public boolean m58216a(int i) {
        return this.f50436c == i;
    }
}
