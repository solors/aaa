package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Tuples;
import kotlin.collections.C37566w;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* renamed from: com.yandex.mobile.ads.impl.ag */
/* loaded from: classes8.dex */
public final class C29932ag {
    @NotNull

    /* renamed from: a */
    private final LinkedHashMap f76782a;

    public C29932ag(@NotNull List<? extends C31034of<?>> assets) {
        int m17154x;
        int m17292f;
        int m16917e;
        Intrinsics.checkNotNullParameter(assets, "assets");
        m17154x = C37566w.m17154x(assets, 10);
        m17292f = MapsJVM.m17292f(m17154x);
        m16917e = _Ranges.m16917e(m17292f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
        Iterator<T> it = assets.iterator();
        while (it.hasNext()) {
            C31034of c31034of = (C31034of) it.next();
            Tuples m14532a = C38513v.m14532a(c31034of.m31043b(), c31034of.m31041d());
            linkedHashMap.put(m14532a.m17630c(), m14532a.m17629d());
        }
        this.f76782a = linkedHashMap;
    }

    @Nullable
    /* renamed from: a */
    public final eu0 m35903a() {
        Object obj = this.f76782a.get("media");
        if (obj instanceof eu0) {
            return (eu0) obj;
        }
        return null;
    }
}
