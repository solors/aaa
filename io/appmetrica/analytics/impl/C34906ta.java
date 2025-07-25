package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ta */
/* loaded from: classes9.dex */
public final class C34906ta extends AbstractC34005K2 {

    /* renamed from: b */
    public final C34828qa f95401b;

    /* renamed from: c */
    public final C34828qa f95402c;

    /* renamed from: d */
    public final C34880sa f95403d;

    public C34906ta(int i, int i2, int i3) {
        this(i, new C34828qa(i2), new C34828qa(i3));
    }

    public C34906ta(int i, @NonNull C34828qa c34828qa, @NonNull C34828qa c34828qa2) {
        super(i);
        this.f95403d = new C34880sa();
        this.f95401b = c34828qa;
        this.f95402c = c34828qa2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34005K2, io.appmetrica.analytics.impl.InterfaceC34854ra
    @NonNull
    /* renamed from: a */
    public final C34049Lm mo20948a(@Nullable Map<String, String> map) {
        HashMap hashMap;
        int i;
        int i2 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f95403d);
            int length = entryArr.length;
            i = 0;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            while (i2 < length) {
                Map.Entry entry = entryArr[i2];
                C34049Lm mo20948a = this.f95401b.mo20948a((String) entry.getKey());
                C34049Lm mo20948a2 = this.f95402c.mo20948a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) mo20948a2.f93198a) + StringUtils.getUtf8BytesLength((String) mo20948a.f93198a);
                if (z || utf8BytesLength2 + i4 > this.f93097a) {
                    i3++;
                    i += utf8BytesLength;
                    z = true;
                } else {
                    i = mo20948a2.f93199b.getBytesTruncated() + mo20948a.f93199b.getBytesTruncated() + i;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) mo20948a2.f93198a) + StringUtils.getUtf8BytesLength((String) mo20948a.f93198a) + i4;
                    hashMap.put((String) mo20948a.f93198a, (String) mo20948a2.f93198a);
                    i4 = utf8BytesLength3;
                }
                i2++;
            }
            i2 = i3;
        } else {
            hashMap = null;
            i = 0;
        }
        return new C34049Lm(hashMap, new C33810C4(i2, i));
    }
}
