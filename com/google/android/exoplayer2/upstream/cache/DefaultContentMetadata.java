package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class DefaultContentMetadata implements ContentMetadata {
    public static final DefaultContentMetadata EMPTY = new DefaultContentMetadata(Collections.emptyMap());

    /* renamed from: a */
    private int f36005a;

    /* renamed from: b */
    private final Map<String, byte[]> f36006b;

    public DefaultContentMetadata() {
        this(Collections.emptyMap());
    }

    /* renamed from: a */
    private static void m72702a(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), m72700c(entry.getValue()));
        }
    }

    /* renamed from: b */
    private static Map<String, byte[]> m72701b(Map<String, byte[]> map, ContentMetadataMutations contentMetadataMutations) {
        HashMap hashMap = new HashMap(map);
        m72698e(hashMap, contentMetadataMutations.getRemovedValues());
        m72702a(hashMap, contentMetadataMutations.getEditedValues());
        return hashMap;
    }

    /* renamed from: c */
    private static byte[] m72700c(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    private static boolean m72699d(Map<String, byte[]> map, Map<String, byte[]> map2) {
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

    /* renamed from: e */
    private static void m72698e(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            hashMap.remove(list.get(i));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final boolean contains(String str) {
        return this.f36006b.containsKey(str);
    }

    public DefaultContentMetadata copyWithMutationsApplied(ContentMetadataMutations contentMetadataMutations) {
        Map<String, byte[]> m72701b = m72701b(this.f36006b, contentMetadataMutations);
        if (m72699d(this.f36006b, m72701b)) {
            return this;
        }
        return new DefaultContentMetadata(m72701b);
    }

    public Set<Map.Entry<String, byte[]>> entrySet() {
        return this.f36006b.entrySet();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DefaultContentMetadata.class == obj.getClass()) {
            return m72699d(this.f36006b, ((DefaultContentMetadata) obj).f36006b);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    @Nullable
    public final byte[] get(String str, @Nullable byte[] bArr) {
        byte[] bArr2 = this.f36006b.get(str);
        return bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : bArr;
    }

    public int hashCode() {
        if (this.f36005a == 0) {
            int i = 0;
            for (Map.Entry<String, byte[]> entry : this.f36006b.entrySet()) {
                i += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f36005a = i;
        }
        return this.f36005a;
    }

    public DefaultContentMetadata(Map<String, byte[]> map) {
        this.f36006b = Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    @Nullable
    public final String get(String str, @Nullable String str2) {
        byte[] bArr = this.f36006b.get(str);
        return bArr != null ? new String(bArr, Charsets.UTF_8) : str2;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final long get(String str, long j) {
        byte[] bArr = this.f36006b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }
}
