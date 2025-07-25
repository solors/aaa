package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public enum BoundType {
    OPEN(false),
    CLOSED(true);
    

    /* renamed from: b */
    final boolean f39815b;

    BoundType(boolean z) {
        this.f39815b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static BoundType m69733c(boolean z) {
        if (z) {
            return CLOSED;
        }
        return OPEN;
    }
}
