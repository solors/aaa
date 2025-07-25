package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.wf */
/* loaded from: classes2.dex */
public abstract class AbstractC5777wf {

    /* renamed from: com.applovin.impl.wf$a */
    /* loaded from: classes2.dex */
    private static class C5778a extends AbstractC4295e {

        /* renamed from: g */
        transient Supplier f11742g;

        C5778a(Map map, Supplier supplier) {
            super(map);
            this.f11742g = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.applovin.impl.AbstractC4496h
        /* renamed from: b */
        Map mo93523b() {
            return m99431h();
        }

        @Override // com.applovin.impl.AbstractC4496h
        /* renamed from: c */
        Set mo93522c() {
            return m99430i();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.applovin.impl.AbstractC4355f
        /* renamed from: j */
        public List mo93521g() {
            return (List) this.f11742g.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m93525a(InterfaceC5561tf interfaceC5561tf, Object obj) {
        if (obj == interfaceC5561tf) {
            return true;
        }
        if (obj instanceof InterfaceC5561tf) {
            return interfaceC5561tf.mo94449a().equals(((InterfaceC5561tf) obj).mo94449a());
        }
        return false;
    }

    /* renamed from: a */
    public static InterfaceC4317ec m93524a(Map map, Supplier supplier) {
        return new C5778a(map, supplier);
    }
}
