package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsJVM;

/* renamed from: io.appmetrica.analytics.impl.Fc */
/* loaded from: classes9.dex */
public final class C33893Fc {

    /* renamed from: a */
    public final LinkedHashMap f92831a = new LinkedHashMap();

    /* renamed from: a */
    public final LinkedHashMap m22660a(String str) {
        int m17292f;
        LinkedHashMap linkedHashMap = this.f92831a;
        m17292f = MapsJVM.m17292f(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m17292f);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((ModuleEventServiceHandlerFactory) entry.getValue()).createEventHandler(str));
        }
        return linkedHashMap2;
    }
}
