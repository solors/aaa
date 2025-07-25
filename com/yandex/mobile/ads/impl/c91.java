package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes8.dex */
public final class c91 {

    /* renamed from: a */
    public final int f77556a;

    /* renamed from: b */
    public final byte[] f77557b;
    @Nullable

    /* renamed from: c */
    public final Map<String, String> f77558c;
    @Nullable

    /* renamed from: d */
    public final List<tc0> f77559d;

    /* renamed from: e */
    public final boolean f77560e;

    @Deprecated
    public c91() {
        throw null;
    }

    @Nullable
    /* renamed from: a */
    private static List<tc0> m35335a(@Nullable Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new tc0(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private c91(int i, byte[] bArr, @Nullable Map map, @Nullable List list, boolean z) {
        this.f77556a = i;
        this.f77557b = bArr;
        this.f77558c = map;
        if (list == null) {
            this.f77559d = null;
        } else {
            this.f77559d = Collections.unmodifiableList(list);
        }
        this.f77560e = z;
    }

    @Nullable
    /* renamed from: a */
    private static Map<String, String> m35336a(@Nullable List<tc0> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (tc0 tc0Var : list) {
            treeMap.put(tc0Var.m29229a(), tc0Var.m29228b());
        }
        return treeMap;
    }

    @Deprecated
    public c91(int i, byte[] bArr, @Nullable Map map, boolean z) {
        this(i, bArr, map, m35335a(map), z);
    }

    public c91(int i, byte[] bArr, boolean z, long j, @Nullable List<tc0> list) {
        this(i, bArr, m35336a(list), list, z);
    }
}
