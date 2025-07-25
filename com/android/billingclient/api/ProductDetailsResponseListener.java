package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes2.dex */
public interface ProductDetailsResponseListener {
    void onProductDetailsResponse(@NonNull BillingResult billingResult, @NonNull List<ProductDetails> list);
}
