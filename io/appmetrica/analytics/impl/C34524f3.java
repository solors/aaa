package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.f3 */
/* loaded from: classes9.dex */
public final class C34524f3 implements BillingInfoStorage {

    /* renamed from: a */
    public final ProtobufStateStorage f94304a;

    /* renamed from: b */
    public C34872s2 f94305b;

    public C34524f3(@NonNull Context context) {
        this(C34263Ul.m22163a(C34872s2.class).m22150a(context));
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    @NonNull
    public final List<BillingInfo> getBillingInfo() {
        return this.f94305b.f95316a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f94305b.f95317b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(@NonNull List<BillingInfo> list, boolean z) {
        for (BillingInfo billingInfo : list) {
        }
        C34872s2 c34872s2 = new C34872s2(list, z);
        this.f94305b = c34872s2;
        this.f94304a.save(c34872s2);
    }

    public C34524f3(ProtobufStateStorage protobufStateStorage) {
        this.f94304a = protobufStateStorage;
        this.f94305b = (C34872s2) protobufStateStorage.read();
    }
}
