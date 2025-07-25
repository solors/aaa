package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class dd1 {
    @NotNull

    /* renamed from: a */
    private final C31952z4 f78047a;

    public dd1(@NotNull C31952z4 adLoadingPhasesManager) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f78047a = adLoadingPhasesManager;
    }

    @NotNull
    /* renamed from: a */
    public final LinkedHashMap m34959a(@NotNull Set phases) {
        Sequence m17548e0;
        Sequence<C31792x4> m16814p;
        Intrinsics.checkNotNullParameter(phases, "phases");
        m17548e0 = _Collections.m17548e0(this.f78047a.m26389b());
        m16814p = _Sequences.m16814p(m17548e0, new cd1(phases));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C31792x4 c31792x4 : m16814p) {
            String m27044a = c31792x4.m27670a().m27044a();
            Object obj = linkedHashMap.get(m27044a);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(m27044a, obj);
            }
            ((List) obj).add(c31792x4.m27669b());
        }
        return linkedHashMap;
    }
}
