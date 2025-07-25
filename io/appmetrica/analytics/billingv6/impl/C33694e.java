package io.appmetrica.analytics.billingv6.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections._Collections;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.e */
/* loaded from: classes9.dex */
public final class C33694e implements BillingInfoManager {

    /* renamed from: a */
    public final BillingInfoStorage f92284a;

    /* renamed from: b */
    public boolean f92285b;

    /* renamed from: c */
    public final LinkedHashMap f92286c;

    public C33694e(@NotNull BillingInfoStorage billingInfoStorage) {
        this.f92284a = billingInfoStorage;
        this.f92285b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f92286c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    @Nullable
    public final BillingInfo get(@NotNull String str) {
        return (BillingInfo) this.f92286c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final boolean isFirstInappCheckOccurred() {
        return this.f92285b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final void markFirstInappCheckOccurred() {
        List<BillingInfo> m17553Z0;
        if (!this.f92285b) {
            this.f92285b = true;
            BillingInfoStorage billingInfoStorage = this.f92284a;
            m17553Z0 = _Collections.m17553Z0(this.f92286c.values());
            billingInfoStorage.saveInfo(m17553Z0, this.f92285b);
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final void update(@NotNull Map<String, ? extends BillingInfo> map) {
        List<BillingInfo> m17553Z0;
        for (BillingInfo billingInfo : map.values()) {
            this.f92286c.put(billingInfo.productId, billingInfo);
        }
        BillingInfoStorage billingInfoStorage = this.f92284a;
        m17553Z0 = _Collections.m17553Z0(this.f92286c.values());
        billingInfoStorage.saveInfo(m17553Z0, this.f92285b);
    }
}
