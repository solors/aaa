package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class UsingToStringOrdering extends Ordering<Object> implements Serializable {

    /* renamed from: b */
    static final UsingToStringOrdering f40879b = new UsingToStringOrdering();

    private UsingToStringOrdering() {
    }

    private Object readResolve() {
        return f40879b;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
