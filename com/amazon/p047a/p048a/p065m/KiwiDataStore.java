package com.amazon.p047a.p048a.p065m;

import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p063k.ResourceManager;
import com.amazon.p047a.p048a.p063k.ResourcePopulationAware;

/* renamed from: com.amazon.a.a.m.c */
/* loaded from: classes2.dex */
public class KiwiDataStore implements ResourcePopulationAware {

    /* renamed from: a */
    public static final String f2522a = "DATA_AUTHENTICATION_KEY";

    /* renamed from: b */
    public static final String f2523b = "APPLICATION_LICENSE";

    /* renamed from: c */
    public static final String f2524c = "LICENSE_FAILURE_CONTENT";

    /* renamed from: d */
    public static final String f2525d = "LICENSE_FAILURE_RAW_EXCEPTION";

    /* renamed from: e */
    public static final String f2526e = "TEST_MODE";

    /* renamed from: f */
    public static final String f2527f = "PACKAGE";

    /* renamed from: g */
    public static final String f2528g = "COMMAND";
    @Resource

    /* renamed from: h */
    private ResourceManager f2529h;

    /* renamed from: i */
    private ExpirableValueDataStore f2530i = new ExpirableValueDataStore();

    /* renamed from: a */
    public <T> void m103004a(String str, ExpirableValue expirableValue) {
        this.f2530i.m103009a(str, expirableValue);
    }

    /* renamed from: b */
    public boolean m103002b(String str) {
        return this.f2530i.m103010a(str);
    }

    /* renamed from: c */
    public void m103001c(String str) {
        this.f2530i.m103006c(str);
    }

    @Override // com.amazon.p047a.p048a.p063k.ResourcePopulationAware
    /* renamed from: e */
    public void mo102735e() {
        this.f2529h.mo103032b(this.f2530i);
    }

    public String toString() {
        return this.f2530i.toString();
    }

    /* renamed from: a */
    public <T> void m103003a(String str, T t) {
        this.f2530i.m103008a(str, (String) t);
    }

    /* renamed from: a */
    public <T> T m103005a(String str) {
        return (T) this.f2530i.m103007b(str);
    }
}
