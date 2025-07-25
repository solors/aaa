package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.l */
/* loaded from: classes4.dex */
public final class C15315l implements Iterator {

    /* renamed from: a */
    public int f30276a = 0;

    /* renamed from: b */
    public final int f30277b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC15336s f30278c;

    public C15315l(AbstractC15336s abstractC15336s) {
        this.f30278c = abstractC15336s;
        this.f30277b = abstractC15336s.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f30276a < this.f30277b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f30276a;
        if (i < this.f30277b) {
            this.f30276a = i + 1;
            return Byte.valueOf(this.f30278c.mo76826d(i));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
