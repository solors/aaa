package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Comparator;

/* renamed from: io.appmetrica.analytics.impl.Am */
/* loaded from: classes9.dex */
public final class C33778Am implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Thread thread = (Thread) obj;
        Thread thread2 = (Thread) obj2;
        if (thread == thread2) {
            return 0;
        }
        return StringUtils.compare(thread.getName(), thread2.getName());
    }
}
