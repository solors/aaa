package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.pc */
/* loaded from: classes9.dex */
public class C34803pc {

    /* renamed from: a */
    public final Map f95173a;

    /* renamed from: b */
    public final Object f95174b;

    public C34803pc(Object obj) {
        this(new HashMap(), obj);
    }

    /* renamed from: a */
    public final void m21157a(Object obj, Object obj2) {
        this.f95173a.put(obj, obj2);
    }

    public C34803pc(HashMap hashMap, Object obj) {
        this.f95173a = hashMap;
        this.f95174b = obj;
    }

    /* renamed from: a */
    public final Object m21158a(Object obj) {
        Object obj2 = this.f95173a.get(obj);
        return obj2 == null ? this.f95174b : obj2;
    }
}
