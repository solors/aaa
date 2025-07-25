package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.r2 */
/* loaded from: classes2.dex */
public final class C5234r2 extends AbstractC5699vg implements Serializable {

    /* renamed from: a */
    final Function f9296a;

    /* renamed from: b */
    final AbstractC5699vg f9297b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5234r2(Function function, AbstractC5699vg abstractC5699vg) {
        this.f9296a = (Function) Preconditions.checkNotNull(function);
        this.f9297b = (AbstractC5699vg) Preconditions.checkNotNull(abstractC5699vg);
    }

    @Override // com.applovin.impl.AbstractC5699vg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f9297b.compare(this.f9296a.apply(obj), this.f9296a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5234r2)) {
            return false;
        }
        C5234r2 c5234r2 = (C5234r2) obj;
        if (this.f9296a.equals(c5234r2.f9296a) && this.f9297b.equals(c5234r2.f9297b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f9296a, this.f9297b);
    }

    public String toString() {
        return this.f9297b + ".onResultOf(" + this.f9296a + ")";
    }
}
