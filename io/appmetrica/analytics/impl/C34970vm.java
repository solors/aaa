package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.vm */
/* loaded from: classes9.dex */
public final class C34970vm {

    /* renamed from: a */
    public final String f95525a;

    /* renamed from: b */
    public final int f95526b;

    /* renamed from: c */
    public final long f95527c;

    /* renamed from: d */
    public final String f95528d;

    /* renamed from: e */
    public final Integer f95529e;

    /* renamed from: f */
    public final List f95530f;

    public C34970vm(String str, int i, long j, String str2, Integer num, List list) {
        List unmodifiableListCopy;
        this.f95525a = str;
        this.f95526b = i;
        this.f95527c = j;
        this.f95528d = str2;
        this.f95529e = num;
        if (list == null) {
            unmodifiableListCopy = Collections.emptyList();
        } else {
            unmodifiableListCopy = CollectionUtils.unmodifiableListCopy(list);
        }
        this.f95530f = unmodifiableListCopy;
    }
}
