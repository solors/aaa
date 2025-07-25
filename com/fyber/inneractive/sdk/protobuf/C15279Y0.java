package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.protobuf.Y0 */
/* loaded from: classes4.dex */
public final class C15279Y0 extends C15296e1 {

    /* renamed from: b */
    public final /* synthetic */ AbstractC15299f1 f30232b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15279Y0(AbstractC15299f1 abstractC15299f1) {
        super(abstractC15299f1);
        this.f30232b = abstractC15299f1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.C15296e1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C15277X0(this.f30232b);
    }
}
