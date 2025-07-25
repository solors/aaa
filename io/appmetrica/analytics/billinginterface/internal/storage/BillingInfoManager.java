package io.appmetrica.analytics.billinginterface.internal.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import java.util.Map;

/* loaded from: classes9.dex */
public interface BillingInfoManager {
    @Nullable
    BillingInfo get(@NonNull String str);

    boolean isFirstInappCheckOccurred();

    void markFirstInappCheckOccurred();

    void update(@NonNull Map<String, BillingInfo> map);
}
