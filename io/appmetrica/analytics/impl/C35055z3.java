package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.z3 */
/* loaded from: classes9.dex */
public final class C35055z3 extends ECommerceEvent {

    /* renamed from: d */
    public static final int f95675d = 4;

    /* renamed from: e */
    public static final int f95676e = 5;

    /* renamed from: a */
    public final int f95677a;
    @NonNull

    /* renamed from: b */
    public final C33809C3 f95678b;

    /* renamed from: c */
    public final InterfaceC34394a8 f95679c;

    public C35055z3(int i, @NonNull ECommerceCartItem eCommerceCartItem) {
        this(i, new C33809C3(eCommerceCartItem), new C33759A3());
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final InterfaceC34394a8 m20728a() {
        return this.f95679c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        int i = this.f95677a;
        if (i != 4) {
            if (i != 5) {
                return "unknown cart action info";
            }
            return "remove cart item info";
        }
        return "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC34401af
    public final List<C34283Vh> toProto() {
        return (List) this.f95679c.fromModel(this);
    }

    @NonNull
    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f95677a + ", cartItem=" + this.f95678b + ", converter=" + this.f95679c + '}';
    }

    @VisibleForTesting
    public C35055z3(int i, @NonNull C33809C3 c33809c3, @NonNull InterfaceC34394a8 interfaceC34394a8) {
        this.f95677a = i;
        this.f95678b = c33809c3;
        this.f95679c = interfaceC34394a8;
    }
}
