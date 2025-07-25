package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class CompoundOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: b */
    final Comparator<? super T>[] f39881b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompoundOrdering(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.f39881b = new Comparator[]{comparator, comparator2};
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@ParametricNullness T t, @ParametricNullness T t2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f39881b;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.f39881b, ((CompoundOrdering) obj).f39881b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f39881b);
    }

    public String toString() {
        String arrays = Arrays.toString(this.f39881b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + 19);
        sb2.append("Ordering.compound(");
        sb2.append(arrays);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompoundOrdering(Iterable<? extends Comparator<? super T>> iterable) {
        this.f39881b = (Comparator[]) Iterables.m69227g(iterable, new Comparator[0]);
    }
}
