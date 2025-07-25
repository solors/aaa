package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class LexicographicalOrdering<T> extends Ordering<Iterable<T>> implements Serializable {

    /* renamed from: b */
    final Comparator<? super T> f40237b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LexicographicalOrdering(Comparator<? super T> comparator) {
        this.f40237b = comparator;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return compare((Iterable) ((Iterable) obj), (Iterable) ((Iterable) obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LexicographicalOrdering) {
            return this.f40237b.equals(((LexicographicalOrdering) obj).f40237b);
        }
        return false;
    }

    public int hashCode() {
        return this.f40237b.hashCode() ^ 2075626741;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f40237b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 18);
        sb2.append(valueOf);
        sb2.append(".lexicographical()");
        return sb2.toString();
    }

    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable2.iterator();
        for (T t : iterable) {
            if (!it.hasNext()) {
                return 1;
            }
            int compare = this.f40237b.compare(t, it.next());
            if (compare != 0) {
                return compare;
            }
        }
        return it.hasNext() ? -1 : 0;
    }
}
