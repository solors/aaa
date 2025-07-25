package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class NaturalOrdering extends Ordering<Comparable<?>> implements Serializable {

    /* renamed from: d */
    static final NaturalOrdering f40553d = new NaturalOrdering();

    /* renamed from: b */
    private transient Ordering<Comparable<?>> f40554b;

    /* renamed from: c */
    private transient Ordering<Comparable<?>> f40555c;

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return f40553d;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> nullsFirst() {
        Ordering<S> ordering = (Ordering<S>) this.f40554b;
        if (ordering == null) {
            Ordering<S> nullsFirst = super.nullsFirst();
            this.f40554b = nullsFirst;
            return nullsFirst;
        }
        return ordering;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> nullsLast() {
        Ordering<S> ordering = (Ordering<S>) this.f40555c;
        if (ordering == null) {
            Ordering<S> nullsLast = super.nullsLast();
            this.f40555c = nullsLast;
            return nullsLast;
        }
        return ordering;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> reverse() {
        return ReverseNaturalOrdering.f40640b;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }
}
