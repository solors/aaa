package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.X0 */
/* loaded from: classes4.dex */
public final class C15277X0 implements Iterator {

    /* renamed from: a */
    public int f30225a;

    /* renamed from: b */
    public Iterator f30226b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC15299f1 f30227c;

    public C15277X0(AbstractC15299f1 abstractC15299f1) {
        this.f30227c = abstractC15299f1;
        this.f30225a = abstractC15299f1.f30257b.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f30225a;
        if (i <= 0 || i > this.f30227c.f30257b.size()) {
            if (this.f30226b == null) {
                this.f30226b = this.f30227c.f30261f.entrySet().iterator();
            }
            if (!this.f30226b.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f30226b == null) {
            this.f30226b = this.f30227c.f30261f.entrySet().iterator();
        }
        if (this.f30226b.hasNext()) {
            if (this.f30226b == null) {
                this.f30226b = this.f30227c.f30261f.entrySet().iterator();
            }
            return (Map.Entry) this.f30226b.next();
        }
        List list = this.f30227c.f30257b;
        int i = this.f30225a - 1;
        this.f30225a = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
