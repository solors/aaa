package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Present<T> extends Optional<T> {

    /* renamed from: b */
    private final T f39435b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Present(T t) {
        this.f39435b = t;
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.singleton(this.f39435b);
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.f39435b.equals(((Present) obj).f39435b);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        return this.f39435b;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return this.f39435b.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.google.common.base.Optional
    /* renamed from: or */
    public T mo70025or(T t) {
        Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.f39435b;
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return this.f39435b;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        String valueOf = String.valueOf(this.f39435b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(Function<? super T, V> function) {
        return new Present(Preconditions.checkNotNull(function.apply((T) this.f39435b), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.common.base.Optional
    /* renamed from: or */
    public Optional<T> mo70027or(Optional<? extends T> optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    @Override // com.google.common.base.Optional
    /* renamed from: or */
    public T mo70026or(Supplier<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return this.f39435b;
    }
}
