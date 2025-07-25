package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.d1 */
/* loaded from: classes4.dex */
public final class C15293d1 implements Iterator {

    /* renamed from: a */
    public int f30245a = -1;

    /* renamed from: b */
    public boolean f30246b;

    /* renamed from: c */
    public Iterator f30247c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC15299f1 f30248d;

    public C15293d1(AbstractC15299f1 abstractC15299f1) {
        this.f30248d = abstractC15299f1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f30245a + 1 < this.f30248d.f30257b.size()) {
            return true;
        }
        if (!this.f30248d.f30258c.isEmpty()) {
            if (this.f30247c == null) {
                this.f30247c = this.f30248d.f30258c.entrySet().iterator();
            }
            if (this.f30247c.hasNext()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f30246b = true;
        int i = this.f30245a + 1;
        this.f30245a = i;
        if (i < this.f30248d.f30257b.size()) {
            return (Map.Entry) this.f30248d.f30257b.get(this.f30245a);
        }
        if (this.f30247c == null) {
            this.f30247c = this.f30248d.f30258c.entrySet().iterator();
        }
        return (Map.Entry) this.f30247c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f30246b) {
            this.f30246b = false;
            AbstractC15299f1 abstractC15299f1 = this.f30248d;
            int i = AbstractC15299f1.f30255h;
            abstractC15299f1.m76883a();
            if (this.f30245a < this.f30248d.f30257b.size()) {
                AbstractC15299f1 abstractC15299f12 = this.f30248d;
                int i2 = this.f30245a;
                this.f30245a = i2 - 1;
                abstractC15299f12.m76883a();
                Object obj = ((C15290c1) abstractC15299f12.f30257b.remove(i2)).f30241b;
                if (!abstractC15299f12.f30258c.isEmpty()) {
                    Iterator it = abstractC15299f12.m76879c().entrySet().iterator();
                    abstractC15299f12.f30257b.add(new C15290c1(abstractC15299f12, (Map.Entry) it.next()));
                    it.remove();
                    return;
                }
                return;
            }
            if (this.f30247c == null) {
                this.f30247c = this.f30248d.f30258c.entrySet().iterator();
            }
            this.f30247c.remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
