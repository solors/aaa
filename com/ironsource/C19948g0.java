package com.ironsource;

import com.ironsource.C20303m1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.collections.MutableCollections;
import kotlin.collections._Collections;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.g0 */
/* loaded from: classes6.dex */
public final class C19948g0 {

    /* renamed from: a */
    private final int f50162a;
    @NotNull

    /* renamed from: b */
    private final List<C19796e0> f50163b = new CopyOnWriteArrayList();

    public C19948g0(int i) {
        this.f50162a = i;
    }

    /* renamed from: b */
    private final boolean m58486b() {
        if (this.f50162a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m58485c() {
        if (this.f50162a != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m58487a(@Nullable C19796e0 c19796e0) {
        if (m58486b()) {
            return;
        }
        if (m58488a()) {
            MutableCollections.m17612P(this.f50163b);
        }
        if (c19796e0 == null) {
            c19796e0 = new C19796e0(C20303m1.EnumC20304a.NotPartOfWaterfall);
        }
        this.f50163b.add(c19796e0);
    }

    @NotNull
    /* renamed from: d */
    public final String m58484d() {
        int m17154x;
        String m17521z0;
        List<C19796e0> list = this.f50163b;
        m17154x = C37566w.m17154x(list, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (C19796e0 c19796e0 : list) {
            arrayList.add(Integer.valueOf(c19796e0.m58834b().ordinal()));
        }
        m17521z0 = _Collections.m17521z0(arrayList, ",", null, null, 0, null, null, 62, null);
        return m17521z0;
    }

    /* renamed from: a */
    private final boolean m58488a() {
        return m58485c() && this.f50163b.size() >= this.f50162a;
    }
}
