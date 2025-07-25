package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jk */
/* loaded from: classes9.dex */
public final class C34649jk extends ECommerceEvent {
    @NonNull

    /* renamed from: a */
    public final C34940ui f94716a;

    /* renamed from: b */
    public final InterfaceC34394a8 f94717b;

    public C34649jk(@NonNull ECommerceScreen eCommerceScreen) {
        this(new C34940ui(eCommerceScreen), new C34676kk());
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final InterfaceC34394a8 m21501a() {
        return this.f94717b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC34401af
    public final List<C34283Vh> toProto() {
        return (List) this.f94717b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f94716a + ", converter=" + this.f94717b + '}';
    }

    @VisibleForTesting
    public C34649jk(@NonNull C34940ui c34940ui, @NonNull InterfaceC34394a8 interfaceC34394a8) {
        this.f94716a = c34940ui;
        this.f94717b = interfaceC34394a8;
    }
}
