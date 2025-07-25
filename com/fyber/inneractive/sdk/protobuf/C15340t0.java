package com.fyber.inneractive.sdk.protobuf;

import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.protobuf.t0 */
/* loaded from: classes4.dex */
public final class C15340t0 extends AbstractC15343u0 {
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15343u0
    /* renamed from: a */
    public final void mo76801a(Object obj, long j) {
        ((AbstractC15288c) ((InterfaceC15316l0) AbstractC15356y1.m76661e(obj, j))).f30239a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15343u0
    /* renamed from: b */
    public final List mo76800b(Object obj, long j) {
        int i;
        InterfaceC15316l0 interfaceC15316l0 = (InterfaceC15316l0) AbstractC15356y1.m76661e(obj, j);
        if (!((AbstractC15288c) interfaceC15316l0).f30239a) {
            int size = interfaceC15316l0.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            InterfaceC15316l0 mo76793b = interfaceC15316l0.mo76793b(i);
            AbstractC15356y1.m76674a(j, obj, mo76793b);
            return mo76793b;
        }
        return interfaceC15316l0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15343u0
    /* renamed from: a */
    public final void mo76802a(long j, Object obj, Object obj2) {
        InterfaceC15316l0 interfaceC15316l0 = (InterfaceC15316l0) AbstractC15356y1.m76661e(obj, j);
        InterfaceC15316l0 interfaceC15316l02 = (InterfaceC15316l0) AbstractC15356y1.m76661e(obj2, j);
        int size = interfaceC15316l0.size();
        int size2 = interfaceC15316l02.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC15288c) interfaceC15316l0).f30239a) {
                interfaceC15316l0 = interfaceC15316l0.mo76793b(size2 + size);
            }
            interfaceC15316l0.addAll(interfaceC15316l02);
        }
        if (size > 0) {
            interfaceC15316l02 = interfaceC15316l0;
        }
        AbstractC15356y1.m76674a(j, obj, interfaceC15316l02);
    }
}
