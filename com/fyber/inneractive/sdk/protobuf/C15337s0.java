package com.fyber.inneractive.sdk.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.protobuf.s0 */
/* loaded from: classes4.dex */
public final class C15337s0 extends AbstractC15343u0 {

    /* renamed from: c */
    public static final Class f30299c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15343u0
    /* renamed from: a */
    public final void mo76801a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) AbstractC15356y1.m76661e(obj, j);
        if (list instanceof InterfaceC15334r0) {
            unmodifiableList = ((InterfaceC15334r0) list).mo76821a();
        } else if (f30299c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof InterfaceC15256O0) && (list instanceof InterfaceC15316l0)) {
                AbstractC15288c abstractC15288c = (AbstractC15288c) ((InterfaceC15316l0) list);
                if (abstractC15288c.f30239a) {
                    abstractC15288c.f30239a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC15356y1.m76674a(j, obj, unmodifiableList);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15343u0
    /* renamed from: b */
    public final List mo76800b(Object obj, long j) {
        return m76822a(obj, j, 10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15343u0
    /* renamed from: a */
    public final void mo76802a(long j, Object obj, Object obj2) {
        List list = (List) AbstractC15356y1.m76661e(obj2, j);
        List m76822a = m76822a(obj, j, list.size());
        int size = m76822a.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            m76822a.addAll(list);
        }
        if (size > 0) {
            list = m76822a;
        }
        AbstractC15356y1.m76674a(j, obj, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static List m76822a(Object obj, long j, int i) {
        C15331q0 c15331q0;
        List arrayList;
        List list = (List) AbstractC15356y1.m76661e(obj, j);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC15334r0) {
                arrayList = new C15331q0(i);
            } else if ((list instanceof InterfaceC15256O0) && (list instanceof InterfaceC15316l0)) {
                arrayList = ((InterfaceC15316l0) list).mo76793b(i);
            } else {
                arrayList = new ArrayList(i);
            }
            AbstractC15356y1.m76674a(j, obj, arrayList);
            return arrayList;
        }
        if (f30299c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            AbstractC15356y1.m76674a(j, obj, arrayList2);
            c15331q0 = arrayList2;
        } else if (list instanceof C15338s1) {
            C15331q0 c15331q02 = new C15331q0(list.size() + i);
            c15331q02.addAll((C15338s1) list);
            AbstractC15356y1.m76674a(j, obj, c15331q02);
            c15331q0 = c15331q02;
        } else if ((list instanceof InterfaceC15256O0) && (list instanceof InterfaceC15316l0)) {
            InterfaceC15316l0 interfaceC15316l0 = (InterfaceC15316l0) list;
            if (((AbstractC15288c) interfaceC15316l0).f30239a) {
                return list;
            }
            InterfaceC15316l0 mo76793b = interfaceC15316l0.mo76793b(list.size() + i);
            AbstractC15356y1.m76674a(j, obj, mo76793b);
            return mo76793b;
        } else {
            return list;
        }
        return c15331q0;
    }
}
