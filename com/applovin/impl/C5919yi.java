package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.yi */
/* loaded from: classes2.dex */
public final class C5919yi extends AbstractC5699vg implements Serializable {

    /* renamed from: a */
    final AbstractC5699vg f12347a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5919yi(AbstractC5699vg abstractC5699vg) {
        this.f12347a = (AbstractC5699vg) Preconditions.checkNotNull(abstractC5699vg);
    }

    @Override // com.applovin.impl.AbstractC5699vg
    /* renamed from: c */
    public AbstractC5699vg mo92405c() {
        return this.f12347a;
    }

    @Override // com.applovin.impl.AbstractC5699vg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f12347a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5919yi) {
            return this.f12347a.equals(((C5919yi) obj).f12347a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f12347a.hashCode();
    }

    public String toString() {
        return this.f12347a + ".reverse()";
    }
}
