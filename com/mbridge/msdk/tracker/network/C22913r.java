package com.mbridge.msdk.tracker.network;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: NetworkResponse.java */
/* renamed from: com.mbridge.msdk.tracker.network.r */
/* loaded from: classes6.dex */
public final class C22913r {

    /* renamed from: a */
    public final int f59816a;

    /* renamed from: b */
    public final byte[] f59817b;

    /* renamed from: c */
    public final Map<String, String> f59818c;

    /* renamed from: d */
    public final List<C22909h> f59819d;

    /* renamed from: e */
    public final boolean f59820e;

    /* renamed from: f */
    public final long f59821f;

    public C22913r(int i, byte[] bArr, boolean z, long j, List<C22909h> list) {
        this(i, bArr, m49454a(list), list, z, j);
    }

    /* renamed from: a */
    private static Map<String, String> m49454a(List<C22909h> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C22909h c22909h : list) {
            treeMap.put(c22909h.m49512a(), c22909h.m49511b());
        }
        return treeMap;
    }

    private C22913r(int i, byte[] bArr, Map<String, String> map, List<C22909h> list, boolean z, long j) {
        this.f59816a = i;
        this.f59817b = bArr;
        this.f59818c = map;
        if (list == null) {
            this.f59819d = null;
        } else {
            this.f59819d = Collections.unmodifiableList(list);
        }
        this.f59820e = z;
        this.f59821f = j;
    }
}
