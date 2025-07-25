package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class PairwiseEquivalence<E, T extends E> extends Equivalence<Iterable<T>> implements Serializable {

    /* renamed from: b */
    final Equivalence<E> f39421b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PairwiseEquivalence(Equivalence<E> equivalence) {
        this.f39421b = (Equivalence) Preconditions.checkNotNull(equivalence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.Equivalence
    /* renamed from: c */
    public boolean mo70056a(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.f39421b.equivalent(it.next(), it2.next())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.Equivalence
    /* renamed from: d */
    public int mo70055b(Iterable<T> iterable) {
        int i = 78721;
        for (T t : iterable) {
            i = (i * 24943) + this.f39421b.hash(t);
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PairwiseEquivalence) {
            return this.f39421b.equals(((PairwiseEquivalence) obj).f39421b);
        }
        return false;
    }

    public int hashCode() {
        return this.f39421b.hashCode() ^ 1185147655;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f39421b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 11);
        sb2.append(valueOf);
        sb2.append(".pairwise()");
        return sb2.toString();
    }
}
