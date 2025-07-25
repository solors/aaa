package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.cy */
/* loaded from: classes8.dex */
public final class C30130cy {

    /* renamed from: c */
    public static final C30130cy f77799c = new C30130cy(Collections.emptyMap());

    /* renamed from: a */
    private int f77800a;

    /* renamed from: b */
    private final Map<String, byte[]> f77801b;

    public C30130cy() {
        this(Collections.emptyMap());
    }

    /* renamed from: a */
    public final C30130cy m35137a(C31762wq c31762wq) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.f77801b);
        List<String> m27854b = c31762wq.m27854b();
        for (int i = 0; i < m27854b.size(); i++) {
            hashMap.remove(m27854b.get(i));
        }
        for (Map.Entry<String, Object> entry : c31762wq.m27857a().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bArr = ((String) value).getBytes(C30572in.f80564c);
            } else if (value instanceof byte[]) {
                bArr = (byte[]) value;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(key, bArr);
        }
        Map<String, byte[]> map = this.f77801b;
        if (map.size() == hashMap.size()) {
            for (Map.Entry<String, byte[]> entry2 : map.entrySet()) {
                if (!Arrays.equals(entry2.getValue(), (byte[]) hashMap.get(entry2.getKey()))) {
                    return new C30130cy(hashMap);
                }
            }
            return this;
        }
        return new C30130cy(hashMap);
    }

    /* renamed from: b */
    public final long m35136b() {
        byte[] bArr = this.f77801b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    @Nullable
    /* renamed from: c */
    public final String m35135c() {
        byte[] bArr = this.f77801b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, C30572in.f80564c);
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C30130cy.class != obj.getClass()) {
            return false;
        }
        Map<String, byte[]> map = this.f77801b;
        Map<String, byte[]> map2 = ((C30130cy) obj).f77801b;
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (this.f77800a == 0) {
            int i = 0;
            for (Map.Entry<String, byte[]> entry : this.f77801b.entrySet()) {
                i += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f77800a = i;
        }
        return this.f77800a;
    }

    public C30130cy(Map<String, byte[]> map) {
        this.f77801b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final Set<Map.Entry<String, byte[]>> m35138a() {
        return this.f77801b.entrySet();
    }
}
