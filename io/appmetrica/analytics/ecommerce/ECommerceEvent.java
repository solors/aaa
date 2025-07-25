package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C33992Jd;
import io.appmetrica.analytics.impl.C34541fk;
import io.appmetrica.analytics.impl.C34595hk;
import io.appmetrica.analytics.impl.C34649jk;
import io.appmetrica.analytics.impl.C35055z3;
import io.appmetrica.analytics.impl.InterfaceC34401af;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class ECommerceEvent implements InterfaceC34401af {
    @NonNull
    public static ECommerceEvent addCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return new C35055z3(4, eCommerceCartItem);
    }

    @NonNull
    public static ECommerceEvent beginCheckoutEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return new C33992Jd(6, eCommerceOrder);
    }

    @NonNull
    public static ECommerceEvent purchaseEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return new C33992Jd(7, eCommerceOrder);
    }

    @NonNull
    public static ECommerceEvent removeCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return new C35055z3(5, eCommerceCartItem);
    }

    @NonNull
    public static ECommerceEvent showProductCardEvent(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        return new C34541fk(eCommerceProduct, eCommerceScreen);
    }

    @NonNull
    public static ECommerceEvent showProductDetailsEvent(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        return new C34595hk(eCommerceProduct, eCommerceReferrer);
    }

    @NonNull
    public static ECommerceEvent showScreenEvent(@NonNull ECommerceScreen eCommerceScreen) {
        return new C34649jk(eCommerceScreen);
    }

    @NonNull
    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34401af
    public abstract /* synthetic */ List toProto();
}
