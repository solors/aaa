package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.wq */
/* loaded from: classes8.dex */
public final class C31762wq {

    /* renamed from: a */
    private final HashMap f87331a = new HashMap();

    /* renamed from: b */
    private final ArrayList f87332b = new ArrayList();

    /* renamed from: a */
    public static void m27856a(C31762wq c31762wq, long j) {
        c31762wq.f87331a.put("exo_len", Long.valueOf(j));
        c31762wq.f87332b.remove("exo_len");
    }

    /* renamed from: b */
    public final List<String> m27854b() {
        return Collections.unmodifiableList(new ArrayList(this.f87332b));
    }

    /* renamed from: a */
    public static void m27855a(C31762wq c31762wq, @Nullable Uri uri) {
        if (uri == null) {
            c31762wq.f87332b.add("exo_redir");
            c31762wq.f87331a.remove("exo_redir");
            return;
        }
        String uri2 = uri.toString();
        HashMap hashMap = c31762wq.f87331a;
        uri2.getClass();
        hashMap.put("exo_redir", uri2);
        c31762wq.f87332b.remove("exo_redir");
    }

    /* renamed from: a */
    public final Map<String, Object> m27857a() {
        HashMap hashMap = new HashMap(this.f87331a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
