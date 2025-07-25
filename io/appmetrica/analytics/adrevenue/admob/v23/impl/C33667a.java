package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.a */
/* loaded from: classes9.dex */
public final class C33667a implements ModuleAdRevenueProcessor {

    /* renamed from: a */
    public final ArrayList f92253a;

    public C33667a(@NonNull C33668b c33668b, @NonNull ClientContext clientContext) {
        ArrayList arrayList = new ArrayList();
        this.f92253a = arrayList;
        arrayList.add(new C33670d(c33668b, clientContext));
        arrayList.add(new C33672f(c33668b, clientContext));
        arrayList.add(new C33673g(c33668b, clientContext));
        arrayList.add(new C33674h(c33668b, clientContext));
        arrayList.add(new C33675i(c33668b, clientContext));
        arrayList.add(new C33669c(c33668b, clientContext));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NonNull
    public final String getDescription() {
        return "AdMob";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        Iterator it = this.f92253a.iterator();
        while (it.hasNext()) {
            if (((ModuleAdRevenueProcessor) it.next()).process(objArr)) {
                return true;
            }
        }
        return false;
    }
}
