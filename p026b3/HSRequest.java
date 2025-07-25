package p026b3;

import java.util.Map;

/* renamed from: b3.h */
/* loaded from: classes5.dex */
public class HSRequest {

    /* renamed from: a */
    private final EnumC3347a f1564a;

    /* renamed from: b */
    private final String f1565b;

    /* renamed from: c */
    private final Map<String, String> f1566c;

    /* renamed from: d */
    private final String f1567d;

    /* renamed from: e */
    private final int f1568e;

    /* compiled from: HSRequest.java */
    /* renamed from: b3.h$a */
    /* loaded from: classes5.dex */
    enum EnumC3347a {
        POST,
        GET
    }

    public HSRequest(EnumC3347a enumC3347a, String str, Map<String, String> map, String str2, int i) {
        this.f1564a = enumC3347a;
        this.f1565b = str;
        this.f1566c = map;
        this.f1567d = str2;
        this.f1568e = i;
    }

    /* renamed from: a */
    public String m103963a() {
        return this.f1567d;
    }

    /* renamed from: b */
    public Map<String, String> m103962b() {
        return this.f1566c;
    }

    /* renamed from: c */
    public EnumC3347a m103961c() {
        return this.f1564a;
    }

    /* renamed from: d */
    public int m103960d() {
        return this.f1568e;
    }

    /* renamed from: e */
    public String m103959e() {
        return this.f1565b;
    }
}
