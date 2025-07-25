package com.ironsource;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.collections.C37566w;
import kotlin.collections.MapsJVM;
import kotlin.collections._Collections;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

@Metadata
/* renamed from: com.ironsource.bc */
/* loaded from: classes6.dex */
public final class C19629bc {
    @NotNull

    /* renamed from: a */
    public static final C19629bc f49266a = new C19629bc();
    @NotNull

    /* renamed from: b */
    public static final String f49267b = "ext_";

    private C19629bc() {
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, String> m59340a(@Nullable Bundle bundle) {
        Set<String> set;
        int m17154x;
        int m17292f;
        int m16917e;
        String obj;
        Map<String, String> m17284j;
        if (bundle != null) {
            set = bundle.keySet();
        } else {
            set = null;
        }
        if (set == null) {
            m17284j = C37559r0.m17284j();
            return m17284j;
        }
        m17154x = C37566w.m17154x(set, 10);
        m17292f = MapsJVM.m17292f(m17154x);
        m16917e = _Ranges.m16917e(m17292f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
        for (String str : set) {
            String str2 = f49267b + str;
            Object obj2 = bundle.get(str);
            if (obj2 instanceof Iterable) {
                obj = _Collections.m17521z0((Iterable) obj2, ", ", null, null, 0, null, null, 62, null);
            } else if (obj2 == null) {
                obj = null;
            } else {
                obj = obj2.toString();
            }
            Tuples m14532a = C38513v.m14532a(str2, obj);
            linkedHashMap.put(m14532a.m17630c(), m14532a.m17629d());
        }
        return linkedHashMap;
    }
}
