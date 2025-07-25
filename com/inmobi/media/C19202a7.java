package com.inmobi.media;

import ae.KMarkers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.a7 */
/* loaded from: classes6.dex */
public final class C19202a7 implements Iterator, KMarkers {

    /* renamed from: a */
    public int f48067a;

    /* renamed from: b */
    public final /* synthetic */ C19216b7 f48068b;

    public C19202a7(C19216b7 c19216b7) {
        this.f48068b = c19216b7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f48067a < this.f48068b.f48103B) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            ArrayList arrayList = this.f48068b.f48102A;
            int i = this.f48067a;
            this.f48067a = i + 1;
            C19149W6 c19149w6 = (C19149W6) arrayList.get(i);
            Intrinsics.m17074g(c19149w6);
            return c19149w6;
        } catch (IndexOutOfBoundsException e) {
            this.f48067a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
