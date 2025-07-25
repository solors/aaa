package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {

    /* renamed from: b */
    private final Function<? super F, ? extends T> f39387b;

    /* renamed from: c */
    private final Equivalence<T> f39388c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FunctionalEquivalence(Function<? super F, ? extends T> function, Equivalence<T> equivalence) {
        this.f39387b = (Function) Preconditions.checkNotNull(function);
        this.f39388c = (Equivalence) Preconditions.checkNotNull(equivalence);
    }

    @Override // com.google.common.base.Equivalence
    /* renamed from: a */
    protected boolean mo70056a(F f, F f2) {
        return this.f39388c.equivalent(this.f39387b.apply(f), this.f39387b.apply(f2));
    }

    @Override // com.google.common.base.Equivalence
    /* renamed from: b */
    protected int mo70055b(F f) {
        return this.f39388c.hash(this.f39387b.apply(f));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FunctionalEquivalence)) {
            return false;
        }
        FunctionalEquivalence functionalEquivalence = (FunctionalEquivalence) obj;
        if (this.f39387b.equals(functionalEquivalence.f39387b) && this.f39388c.equals(functionalEquivalence.f39388c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f39387b, this.f39388c);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f39388c);
        String valueOf2 = String.valueOf(this.f39387b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(".onResultOf(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
