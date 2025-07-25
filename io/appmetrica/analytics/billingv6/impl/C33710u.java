package io.appmetrica.analytics.billingv6.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.billingv6.impl.u */
/* loaded from: classes9.dex */
public final class C33710u implements UpdatePolicy {

    /* renamed from: a */
    public final SystemTimeProvider f92328a;

    public C33710u() {
        this(null, 1, null);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy
    @WorkerThread
    @NotNull
    public final Map<String, BillingInfo> getBillingInfoToUpdate(@NotNull BillingConfig billingConfig, @NotNull Map<String, ? extends BillingInfo> map, @NotNull BillingInfoManager billingInfoManager) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends BillingInfo> entry : map.entrySet()) {
            BillingInfo value = entry.getValue();
            long currentTimeMillis = this.f92328a.currentTimeMillis();
            if (value.type == ProductType.INAPP && !billingInfoManager.isFirstInappCheckOccurred()) {
                if (currentTimeMillis - value.purchaseTime <= TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else {
                BillingInfo billingInfo = billingInfoManager.get(value.productId);
                if (billingInfo != null) {
                    if (Intrinsics.m17075f(billingInfo.purchaseToken, value.purchaseToken)) {
                        if (value.type == ProductType.SUBS && currentTimeMillis - billingInfo.sendTime >= TimeUnit.SECONDS.toMillis(billingConfig.sendFrequencySeconds)) {
                        }
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public C33710u(@NotNull SystemTimeProvider systemTimeProvider) {
        this.f92328a = systemTimeProvider;
    }

    public /* synthetic */ C33710u(SystemTimeProvider systemTimeProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SystemTimeProvider() : systemTimeProvider);
    }
}
