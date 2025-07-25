package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.hk */
/* loaded from: classes9.dex */
public final class C34595hk extends ECommerceEvent {
    @NonNull

    /* renamed from: a */
    public final C34328Xe f94552a;
    @Nullable

    /* renamed from: b */
    public final C34138Pf f94553b;

    /* renamed from: c */
    public final InterfaceC34394a8 f94554c;

    public C34595hk(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        this(new C34328Xe(eCommerceProduct), eCommerceReferrer == null ? null : new C34138Pf(eCommerceReferrer), new C34622ik());
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final InterfaceC34394a8 m21569a() {
        return this.f94554c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC34401af
    public final List<C34283Vh> toProto() {
        return (List) this.f94554c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f94552a + ", referrer=" + this.f94553b + ", converter=" + this.f94554c + '}';
    }

    @VisibleForTesting
    public C34595hk(@NonNull C34328Xe c34328Xe, @Nullable C34138Pf c34138Pf, @NonNull InterfaceC34394a8 interfaceC34394a8) {
        this.f94552a = c34328Xe;
        this.f94553b = c34138Pf;
        this.f94554c = interfaceC34394a8;
    }
}
