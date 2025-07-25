package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Pm */
/* loaded from: classes9.dex */
public final class C34145Pm {

    /* renamed from: a */
    public final C33903Fm f93368a;

    /* renamed from: b */
    public final C34217T f93369b;

    /* renamed from: c */
    public final List f93370c;

    /* renamed from: d */
    public final String f93371d;

    /* renamed from: e */
    public final String f93372e;

    /* renamed from: f */
    public final Map f93373f;

    /* renamed from: g */
    public final String f93374g;

    /* renamed from: h */
    public final Boolean f93375h;

    public C34145Pm(C33903Fm c33903Fm, C34217T c34217t, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f93368a = c33903Fm;
        this.f93369b = c34217t;
        this.f93370c = arrayList;
        this.f93371d = str;
        this.f93372e = str2;
        this.f93373f = map;
        this.f93374g = str3;
        this.f93375h = bool;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        C33903Fm c33903Fm = this.f93368a;
        if (c33903Fm != null) {
            for (C33951Hk c33951Hk : c33903Fm.f92874c) {
                sb2.append("at " + c33951Hk.f92972a + "." + c33951Hk.f92976e + "(" + c33951Hk.f92973b + ":" + c33951Hk.f92974c + ":" + c33951Hk.f92975d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f93368a + "\n" + sb2.toString() + '}';
    }
}
