package com.android.volley;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.android.volley.k */
/* loaded from: classes2.dex */
public class NetworkResponse {

    /* renamed from: a */
    public final int f3479a;

    /* renamed from: b */
    public final byte[] f3480b;
    @Nullable

    /* renamed from: c */
    public final Map<String, String> f3481c;
    @Nullable

    /* renamed from: d */
    public final List<Header> f3482d;

    /* renamed from: e */
    public final boolean f3483e;

    /* renamed from: f */
    public final long f3484f;

    @Deprecated
    public NetworkResponse(int i, byte[] bArr, @Nullable Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m102288a(map), z, j);
    }

    @Nullable
    /* renamed from: a */
    private static List<Header> m102288a(@Nullable Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new Header(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: b */
    private static Map<String, String> m102287b(@Nullable List<Header> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Header header : list) {
            treeMap.put(header.m102295a(), header.m102294b());
        }
        return treeMap;
    }

    public NetworkResponse(int i, byte[] bArr, boolean z, long j, @Nullable List<Header> list) {
        this(i, bArr, m102287b(list), list, z, j);
    }

    @Deprecated
    public NetworkResponse(byte[] bArr, @Nullable Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    private NetworkResponse(int i, byte[] bArr, @Nullable Map<String, String> map, @Nullable List<Header> list, boolean z, long j) {
        this.f3479a = i;
        this.f3480b = bArr;
        this.f3481c = map;
        if (list == null) {
            this.f3482d = null;
        } else {
            this.f3482d = Collections.unmodifiableList(list);
        }
        this.f3483e = z;
        this.f3484f = j;
    }
}
