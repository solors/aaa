package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class ComparatorOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: b */
    final Comparator<T> f39876b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComparatorOrdering(Comparator<T> comparator) {
        this.f39876b = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@ParametricNullness T t, @ParametricNullness T t2) {
        return this.f39876b.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.f39876b.equals(((ComparatorOrdering) obj).f39876b);
        }
        return false;
    }

    public int hashCode() {
        return this.f39876b.hashCode();
    }

    public String toString() {
        return this.f39876b.toString();
    }
}
