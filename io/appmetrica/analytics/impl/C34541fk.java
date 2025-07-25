package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fk */
/* loaded from: classes9.dex */
public final class C34541fk extends ECommerceEvent {
    @NonNull

    /* renamed from: a */
    public final C34328Xe f94387a;
    @NonNull

    /* renamed from: b */
    public final C34940ui f94388b;

    /* renamed from: c */
    public final InterfaceC34394a8 f94389c;

    public C34541fk(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        this(new C34328Xe(eCommerceProduct), new C34940ui(eCommerceScreen), new C34568gk());
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final InterfaceC34394a8 m21710a() {
        return this.f94389c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC34401af
    public final List<C34283Vh> toProto() {
        return (List) this.f94389c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f94387a + ", screen=" + this.f94388b + ", converter=" + this.f94389c + '}';
    }

    @VisibleForTesting
    public C34541fk(@NonNull C34328Xe c34328Xe, @NonNull C34940ui c34940ui, @NonNull InterfaceC34394a8 interfaceC34394a8) {
        this.f94387a = c34328Xe;
        this.f94388b = c34940ui;
        this.f94389c = interfaceC34394a8;
    }
}
