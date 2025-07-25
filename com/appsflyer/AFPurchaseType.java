package com.appsflyer;

import com.learnings.purchase.google.GoogleEventBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public enum AFPurchaseType {
    SUBSCRIPTION(GoogleEventBuilder.PRODUCT_TYPE_SUB),
    ONE_TIME_PURCHASE("one_time_purchase");
    
    @NotNull
    private final String AFInAppEventParameterName;

    AFPurchaseType(String str) {
        this.AFInAppEventParameterName = str;
    }

    @NotNull
    public final String getValue() {
        return this.AFInAppEventParameterName;
    }
}
