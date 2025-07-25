package com.fyber.inneractive.sdk.cache.session;

import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.cache.session.l */
/* loaded from: classes4.dex */
public final class C14289l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C14284g c14284g = (C14284g) obj;
        C14284g c14284g2 = (C14284g) obj2;
        if (c14284g != null && c14284g2 != null) {
            if (c14284g.f26996d < c14284g2.f26996d) {
                return -1;
            }
            return 1;
        }
        return 0;
    }
}
