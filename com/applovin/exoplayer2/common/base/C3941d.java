package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.applovin.exoplayer2.common.base.d */
/* loaded from: classes2.dex */
final class C3941d extends Optional {

    /* renamed from: a */
    private final Object f4241a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3941d(Object obj) {
        this.f4241a = obj;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Set asSet() {
        return Collections.singleton(this.f4241a);
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean equals(Object obj) {
        if (obj instanceof C3941d) {
            return this.f4241a.equals(((C3941d) obj).f4241a);
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object get() {
        return this.f4241a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public int hashCode() {
        return this.f4241a.hashCode() + 1502476572;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    /* renamed from: or */
    public Object mo101260or(Object obj) {
        Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f4241a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Object orNull() {
        return this.f4241a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public String toString() {
        return "Optional.of(" + this.f4241a + ")";
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional transform(Function function) {
        return new C3941d(Preconditions.checkNotNull(function.apply(this.f4241a), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    /* renamed from: or */
    public Optional mo101262or(Optional optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    /* renamed from: or */
    public Object mo101261or(Supplier supplier) {
        Preconditions.checkNotNull(supplier);
        return this.f4241a;
    }
}
