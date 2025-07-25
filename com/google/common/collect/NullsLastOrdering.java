package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class NullsLastOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: b */
    final Ordering<? super T> f40557b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NullsLastOrdering(Ordering<? super T> ordering) {
        this.f40557b = ordering;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return 1;
        }
        if (t2 == null) {
            return -1;
        }
        return this.f40557b.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsLastOrdering) {
            return this.f40557b.equals(((NullsLastOrdering) obj).f40557b);
        }
        return false;
    }

    public int hashCode() {
        return this.f40557b.hashCode() ^ (-921210296);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> nullsFirst() {
        return this.f40557b.nullsFirst();
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> reverse() {
        return this.f40557b.reverse().nullsFirst();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f40557b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 12);
        sb2.append(valueOf);
        sb2.append(".nullsLast()");
        return sb2.toString();
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> nullsLast() {
        return this;
    }
}
