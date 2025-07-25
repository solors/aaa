package com.mbridge.msdk.foundation.same.net.p446d;

import com.mbridge.msdk.tracker.network.C22909h;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: NetworkResponse.java */
/* renamed from: com.mbridge.msdk.foundation.same.net.d.a */
/* loaded from: classes6.dex */
public final class C21991a {

    /* renamed from: a */
    public final byte[] f56587a;

    /* renamed from: b */
    public final List<C22909h> f56588b;

    /* renamed from: c */
    public final Map<String, String> f56589c;

    /* renamed from: d */
    public final int f56590d;

    public C21991a(int i, byte[] bArr, List<C22909h> list) {
        this(i, bArr, m52209a(list), list);
    }

    /* renamed from: a */
    private static Map<String, String> m52209a(List<C22909h> list) {
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

    private C21991a(int i, byte[] bArr, Map<String, String> map, List<C22909h> list) {
        this.f56590d = i;
        this.f56587a = bArr;
        this.f56589c = map;
        if (list == null) {
            this.f56588b = null;
        } else {
            this.f56588b = Collections.unmodifiableList(list);
        }
    }
}
