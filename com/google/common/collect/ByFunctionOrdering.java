package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {

    /* renamed from: b */
    final Function<F, ? extends T> f39816b;

    /* renamed from: c */
    final Ordering<T> f39817c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByFunctionOrdering(Function<F, ? extends T> function, Ordering<T> ordering) {
        this.f39816b = (Function) Preconditions.checkNotNull(function);
        this.f39817c = (Ordering) Preconditions.checkNotNull(ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@ParametricNullness F f, @ParametricNullness F f2) {
        return this.f39817c.compare(this.f39816b.apply(f), this.f39816b.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByFunctionOrdering)) {
            return false;
        }
        ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
        if (this.f39816b.equals(byFunctionOrdering.f39816b) && this.f39817c.equals(byFunctionOrdering.f39817c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f39816b, this.f39817c);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f39817c);
        String valueOf2 = String.valueOf(this.f39816b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(".onResultOf(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
