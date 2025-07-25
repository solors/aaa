package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.exoplayer2.common.base.a */
/* loaded from: classes2.dex */
public final class C3936a extends Optional {

    /* renamed from: a */
    static final C3936a f4232a = new C3936a();

    private C3936a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Optional m101267a() {
        return f4232a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Set asSet() {
        return Collections.emptySet();
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    /* renamed from: or */
    public Object mo101260or(Object obj) {
        return Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object orNull() {
        return null;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public String toString() {
        return "Optional.absent()";
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional transform(Function function) {
        Preconditions.checkNotNull(function);
        return Optional.absent();
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    /* renamed from: or */
    public Optional mo101262or(Optional optional) {
        return (Optional) Preconditions.checkNotNull(optional);
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    /* renamed from: or */
    public Object mo101261or(Supplier supplier) {
        return Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
