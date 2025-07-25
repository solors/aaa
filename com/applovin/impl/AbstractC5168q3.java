package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;

/* renamed from: com.applovin.impl.q3 */
/* loaded from: classes2.dex */
public abstract class AbstractC5168q3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static StringBuilder m96427a(int i) {
        AbstractC5103p3.m96598a(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m96426a(Collection collection, Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
