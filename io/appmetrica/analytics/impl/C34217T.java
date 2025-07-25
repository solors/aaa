package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.T */
/* loaded from: classes9.dex */
public final class C34217T {

    /* renamed from: a */
    public final C34970vm f93513a;

    /* renamed from: b */
    public final List f93514b;

    /* renamed from: c */
    public final String f93515c;

    public C34217T(C34970vm c34970vm, ArrayList arrayList, String str) {
        List unmodifiableListCopy;
        this.f93513a = c34970vm;
        if (arrayList == null) {
            unmodifiableListCopy = Collections.emptyList();
        } else {
            unmodifiableListCopy = CollectionUtils.unmodifiableListCopy(arrayList);
        }
        this.f93514b = unmodifiableListCopy;
        this.f93515c = str;
    }
}
