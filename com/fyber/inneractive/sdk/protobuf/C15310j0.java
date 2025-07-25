package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.bidder.C14247j;
import com.fyber.inneractive.sdk.bidder.EnumC14206L;
import java.util.AbstractList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.protobuf.j0 */
/* loaded from: classes4.dex */
public final class C15310j0 extends AbstractList {

    /* renamed from: a */
    public final List f30273a;

    /* renamed from: b */
    public final InterfaceC15307i0 f30274b;

    public C15310j0(List list, InterfaceC15307i0 interfaceC15307i0) {
        this.f30273a = list;
        this.f30274b = interfaceC15307i0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        InterfaceC15307i0 interfaceC15307i0 = this.f30274b;
        Object obj = this.f30273a.get(i);
        ((C14247j) interfaceC15307i0).getClass();
        EnumC14206L m78029a = EnumC14206L.m78029a(((Integer) obj).intValue());
        if (m78029a == null) {
            return EnumC14206L.UNRECOGNIZED;
        }
        return m78029a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30273a.size();
    }
}
