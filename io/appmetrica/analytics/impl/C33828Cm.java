package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.appmetrica.analytics.impl.Cm */
/* loaded from: classes9.dex */
public final class C33828Cm {

    /* renamed from: a */
    public final InterfaceC33803Bm f92680a;

    /* renamed from: b */
    public final BiFunction f92681b;

    /* renamed from: c */
    public final C34277Vb f92682c;

    public C33828Cm() {
        this(new C35074zm(), new C34639ja(), C34848r4.m21050i().m21047l());
    }

    /* renamed from: a */
    public final ArrayList m22727a(Thread thread, Thread thread2) {
        Map map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C33778Am());
        try {
            map = this.f92680a.mo20704c();
        } catch (SecurityException unused) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C34970vm) this.f92681b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public C33828Cm(InterfaceC33803Bm interfaceC33803Bm, C34639ja c34639ja, C34277Vb c34277Vb) {
        this.f92680a = interfaceC33803Bm;
        this.f92681b = c34639ja;
        this.f92682c = c34277Vb;
    }
}
