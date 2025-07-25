package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.x3 */
/* loaded from: classes2.dex */
public final class C5816x3 extends AbstractC5699vg implements Serializable {

    /* renamed from: a */
    final Comparator f11872a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5816x3(Comparator comparator) {
        this.f11872a = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.applovin.impl.AbstractC5699vg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f11872a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5816x3) {
            return this.f11872a.equals(((C5816x3) obj).f11872a);
        }
        return false;
    }

    public int hashCode() {
        return this.f11872a.hashCode();
    }

    public String toString() {
        return this.f11872a.toString();
    }
}
