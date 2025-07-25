package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class NullsFirstOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: b */
    final Ordering<? super T> f40556b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NullsFirstOrdering(Ordering<? super T> ordering) {
        this.f40556b = ordering;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return this.f40556b.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsFirstOrdering) {
            return this.f40556b.equals(((NullsFirstOrdering) obj).f40556b);
        }
        return false;
    }

    public int hashCode() {
        return this.f40556b.hashCode() ^ 957692532;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> nullsLast() {
        return this.f40556b.nullsLast();
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> reverse() {
        return this.f40556b.reverse().nullsLast();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f40556b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append(valueOf);
        sb2.append(".nullsFirst()");
        return sb2.toString();
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> nullsFirst() {
        return this;
    }
}
